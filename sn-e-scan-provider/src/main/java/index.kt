@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME")
package uts.sdk.modules.snEScanProvider;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Size;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.SurfaceOrientedMeteringPointFactory;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import io.dcloud.uniapp.*;
import io.dcloud.uniapp.UniSDKEngine;
import io.dcloud.uniapp.appframe.PageProxy;
import io.dcloud.uniapp.dom.node.DomNode;
import io.dcloud.uniapp.dom.node.PageNode;
import io.dcloud.uniapp.extapi.*;
import io.dcloud.uniapp.framework.*;
import io.dcloud.uniapp.interfaces.INodeData;
import io.dcloud.uniapp.runtime.*;
import io.dcloud.uniapp.ui.component.IComponentData;
import io.dcloud.uniapp.vue.*;
import io.dcloud.uniapp.vue.shared.*;
import io.dcloud.uts.*;
import io.dcloud.uts.Map;
import io.dcloud.uts.Set;
import io.dcloud.uts.component.UTSComponent;
import io.dcloud.uts.component.UTSSize;
import java.util.concurrent.Executors;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.async;
import androidx.camera.core.Preview;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;
import io.dcloud.uts.UTSAndroid;
import io.dcloud.uniapp.extapi.getWindowInfo as uni_getWindowInfo;
import io.dcloud.uniapp.extapi.navigateBack as uni_navigateBack;
import io.dcloud.uniapp.extapi.showModal as uni_showModal;
var camera = null as Camera?;
var cameraProviderFuture = null as ListenableFuture<ProcessCameraProvider>?;
var scaleGestureDetector = null as ScaleGestureDetector?;
var gestureDetector = null as GestureDetector?;
var scanned = false;
var options = null as BarcodeScannerOptions?;
var viewId: Int = 0;
fun randomId(): Int {
    var characters: String = "123456789";
    var charArray: UTSArray<String> = characters.split("");
    var result = "";
    run {
        var i: Number = 0;
        while(i < 10){
            var randomIndex = Math.floor(Math.random() * charArray.length);
            result += charArray[randomIndex];
            i++;
        }
    }
    return parseInt(result).toInt();
}
open class SnEScanProviderComponent : UTSComponent<PreviewView> {
    constructor(proxy: PageProxy, componentData: IComponentData) : super(proxy, componentData) ;
    open var scanType: String = "all";
    open var enableDing: Boolean = true;
    open var enableZoom: Boolean = true;
    open var initZoomScale: Number = 0.4;
    open var permissionTip: String = "\u3000 本应用正在请求您的相机权限，仅用于条码、二维码识别，且不会将任何数据上传至云端。如不提供此权限，则无法正常使用扫码功能。";
    override fun NVBeforeLoad() {
        cameraProviderFuture = null;
        scanned = false;
        viewId = randomId() as Int;
    }
    override fun NVLoad(): PreviewView {
        var preview = PreviewView(`$androidContext`!!);
        preview.setId(viewId);
        return preview;
    }
    override fun NVLoaded() {}
    override fun NVLayouted() {
        this.initScanType();
        var permissions = utsArrayOf(
            "android.permission.CAMERA"
        );
        var granted = UTSAndroid.checkSystemPermissionGranted(UTSAndroid.getUniActivity()!!, permissions);
        if (!granted) {
            uni_showModal(ShowModalOptions(title = "提示", content = this.permissionTip, confirmText = "去授权", cancelText = "返回", success = fun(res){
                if (res.confirm) {
                    UTSAndroid.requestSystemPermission(UTSAndroid.getUniActivity()!!, permissions, fun(_: Boolean, _: UTSArray<String>) {
                        this.init();
                    }, fun(_: Boolean, _: UTSArray<String>) {
                        uni_navigateBack(NavigateBackOptions(animationType = "none", animationDuration = 0));
                        UTSAndroid.gotoSystemPermissionActivity(UTSAndroid.getUniActivity()!!, permissions);
                    });
                } else {
                    uni_navigateBack(null);
                }
            }));
        } else {
            this.init();
        }
    }
    override fun NVMeasure(size: UTSSize): UTSSize {
        return size;
    }
    open fun init() {
        var context = UTSAndroid.getAppContext()!!;
        cameraProviderFuture = ProcessCameraProvider.getInstance(context);
        var activity = UTSAndroid.getUniActivity()!!;
        var windowInfo = uni_getWindowInfo();
        var window = activity.getWindow();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        }
        cameraProviderFuture?.addListener(fun(){
            var cameraProvider = cameraProviderFuture?.get();
            this.bindScan(cameraProvider!!, windowInfo.windowWidth.toInt(), windowInfo.windowHeight.toInt(), 0);
        }
        , ContextCompat.getMainExecutor(activity));
    }
    open fun setTorchStatus(status: Boolean) {
        camera?.cameraControl?.enableTorch(status);
    }
    open fun bindScan(cameraProvider: ProcessCameraProvider, width: Int, height: Int, delay: Number = 0): Unit {
        var activity = `$androidContext`!!;
        var preview: Preview = Preview.Builder().build();
        var previewView = UTSAndroid.getUniActivity()!!.window.decorView.findViewById<PreviewView>(viewId);
        if (previewView != null) {
            preview.setSurfaceProvider(previewView.surfaceProvider);
            var cameraSelector: CameraSelector = CameraSelector.Builder().requireLensFacing(CameraSelector.LENS_FACING_BACK).build();
            var imageAnalysis = ImageAnalysis.Builder().setTargetResolution(Size(width, height)).setBackpressureStrategy(ImageAnalysis.STRATEGY_KEEP_ONLY_LATEST).build();
            camera = cameraProvider.bindToLifecycle(activity as LifecycleOwner, cameraSelector, imageAnalysis, preview);
            var cameraControl1 = camera!!.cameraControl;
            var zoomRatio = (if (this.initZoomScale > 1) {
                1;
            } else {
                this.initZoomScale;
            }
            ).toFloat();
            cameraControl1.setLinearZoom(zoomRatio);
            imageAnalysis.setAnalyzer(Executors.newSingleThreadExecutor(), SnScanAnalyser(fun(barcodes: MutableList<Barcode>, imageWidth: Int, imageHeight: Int){
                var res = utsArrayOf<UTSJSONObject>();
                run {
                    var i: Number = 0;
                    while(i < barcodes.size){
                        var code = barcodes[i as Int];
                        var rawValue = code.rawValue;
                        var box = code.boundingBox;
                        var windowHeight = uni_getWindowInfo().windowHeight;
                        var windowWidth = uni_getWindowInfo().windowWidth;
                        res.push(object : UTSJSONObject() {
                            var value = if (rawValue != null) {
                                rawValue as String;
                            } else {
                                "";
                            }
                            var position = object : UTSJSONObject() {
                                var centerX = (box?.centerX() as Number) / (imageHeight as Number) * windowWidth
                                var centerY = (box?.centerY() as Number) / (imageWidth as Number) * windowHeight
                            }
                        });
                        i++;
                    }
                }
                cameraProvider.unbindAll();
                this.`$emit`("scanned", object : UTSJSONObject() {
                    var data = res
                    var scanMode = "camera"
                });
                this.makeSound();
            }
            , fun(){
                console.log("failed", " at uni_modules/sn-e-scan-provider/utssdk/app-android/index.vue:148");
            }
            , fun(){
                console.log("completed", " at uni_modules/sn-e-scan-provider/utssdk/app-android/index.vue:148");
            }
            ));
            setExposureCompensationIndex(camera!!.cameraControl);
            if (this.enableZoom) {
                scaleGestureDetector = ScaleGestureDetector(activity, SnScanSimpleOnScaleGestureListener(cameraControl1));
                gestureDetector = GestureDetector(activity, SnScanSimpleOnGestureListener(cameraControl1));
            }
            previewView.setOnTouchListener(fun(_: Any, event: MotionEvent): Boolean {
                scaleGestureDetector?.onTouchEvent(event);
                gestureDetector?.onTouchEvent(event);
                return true;
            }
            );
        }
    }
    open fun scanImageByURI(uri: String) {
        scanned = false;
        var context = UTSAndroid.getAppContext()!!;
        try {
            var image = InputImage.fromFilePath(context, Uri.parse(uri));
            var detector = BarcodeScanning.getClient(options!!);
            detector.process(image).addOnSuccessListener(fun(barCodes: MutableList<Barcode>){
                if (barCodes.size > 0) {
                    scanned = true;
                    detector.close();
                    var res = utsArrayOf<UTSJSONObject>();
                    run {
                        var i: Number = 0;
                        while(i < barCodes.size){
                            var code = barCodes[i as Int];
                            var rawValue = code.rawValue;
                            var box = code.boundingBox;
                            var windowHeight = uni_getWindowInfo().windowHeight;
                            var windowWidth = uni_getWindowInfo().windowWidth;
                            var imageHeight = image.height;
                            var imageWidth = image.width;
                            res.push(object : UTSJSONObject() {
                                var value = if (rawValue != null) {
                                    rawValue as String;
                                } else {
                                    "";
                                }
                                var position = object : UTSJSONObject() {
                                    var centerX = (box?.centerX() as Number) / (imageWidth as Number) * windowWidth
                                    var centerY = (box?.centerY() as Number) / (imageHeight as Number) * windowHeight
                                }
                            });
                            i++;
                        }
                    }
                    var cameraProvider = cameraProviderFuture?.get();
                    cameraProvider?.unbindAll();
                    this.`$emit`("scanned", object : UTSJSONObject() {
                        var data = res
                        var scanMode = "image"
                    });
                    this.makeSound();
                } else {
                    this.`$emit`("scanned", object : UTSJSONObject() {
                        var data = utsArrayOf<UTSJSONObject>()
                        var scanMode = "image"
                    });
                }
            }
            ).addOnFailureListener(fun(e: Exception){
                throw e;
            }
            );
        }
         catch (e: Throwable) {
            throw e;
        }
    }
    open fun makeSound() {
        if (this.enableDing) {
            var assetManager = UTSAndroid.getAppContext()!!.getAssets();
            var afd = assetManager.openFd("ticking.mp3");
            var mediaPlayer = MediaPlayer();
            mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
            mediaPlayer.prepare();
            mediaPlayer.start();
        }
    }
    open fun rescan() {
        var windowInfo = uni_getWindowInfo();
        scanned = false;
        cameraProviderFuture?.addListener(fun(){
            var cameraProvider = cameraProviderFuture?.get();
            this.bindScan(cameraProvider!!, windowInfo.windowWidth.toInt(), windowInfo.windowHeight.toInt(), 3000);
        }
        , ContextCompat.getMainExecutor(UTSAndroid.getUniActivity()!!));
    }
    open fun initScanType() {
        when (this.scanType) {
            "qrcode" -> 
                options = BarcodeScannerOptions.Builder().setBarcodeFormats(Barcode.FORMAT_QR_CODE).build();
            "barcode" -> 
                options = BarcodeScannerOptions.Builder().setBarcodeFormats(Barcode.FORMAT_AZTEC, Barcode.FORMAT_PDF417, Barcode.FORMAT_CODABAR, Barcode.FORMAT_CODE_39, Barcode.FORMAT_CODE_93, Barcode.FORMAT_CODE_128, Barcode.FORMAT_DATA_MATRIX, Barcode.FORMAT_EAN_8, Barcode.FORMAT_EAN_13, Barcode.FORMAT_ITF, Barcode.FORMAT_UPC_A, Barcode.FORMAT_UPC_E).build();
            else -> 
                options = BarcodeScannerOptions.Builder().setBarcodeFormats(Barcode.FORMAT_QR_CODE, Barcode.FORMAT_AZTEC, Barcode.FORMAT_PDF417, Barcode.FORMAT_CODABAR, Barcode.FORMAT_CODE_39, Barcode.FORMAT_CODE_93, Barcode.FORMAT_CODE_128, Barcode.FORMAT_DATA_MATRIX, Barcode.FORMAT_EAN_8, Barcode.FORMAT_EAN_13, Barcode.FORMAT_ITF, Barcode.FORMAT_UPC_A, Barcode.FORMAT_UPC_E, Barcode.FORMAT_UNKNOWN, Barcode.FORMAT_ALL_FORMATS).build();
        }
    }
    open fun setZoomRatio(zoomRatio: Number) {
        camera!!.cameraControl.setZoomRatio(zoomRatio.toFloat());
    }
    open fun getZoomRatio(): Number? {
        return camera!!.cameraInfo.zoomState.value?.zoomRatio;
    }
    override fun `$init`() {
        this.`$watch`<String>("scanType", fun(newValue, oldValue){
            if (!TextUtils.isEmpty(newValue) && newValue != oldValue) {
                this.initScanType();
            }
        }
        );
    }
    companion object {
        var name = "sn-e-scan-provider";
        init {
            io.dcloud.uniapp.UniSDKEngine.registerUniComponent("sn-e-scan-provider", SnEScanProviderComponent::class.java, SnEScanProviderElement::class.java);
        }
    }
}
open class SnEScanProviderElement : DomNode {
    constructor(data: INodeData, pageNode: PageNode) : super(data, pageNode) ;
    open fun setTorchStatus(status: Boolean) {
        return (getComponent() as SnEScanProviderComponent).setTorchStatus(status);
    }
    open fun scanImageByURI(uri: String) {
        return (getComponent() as SnEScanProviderComponent).scanImageByURI(uri);
    }
    open fun rescan() {
        return (getComponent() as SnEScanProviderComponent).rescan();
    }
    open fun setZoomRatio(zoomRatio: Number) {
        return (getComponent() as SnEScanProviderComponent).setZoomRatio(zoomRatio);
    }
    open fun getZoomRatio(): Number? {
        return (getComponent() as SnEScanProviderComponent).getZoomRatio();
    }
}
fun setExposureCompensationIndex(cameraControl1: CameraControl) {
    cameraControl1.setExposureCompensationIndex(-1);
}
open class SnScanSimpleOnScaleGestureListener : ScaleGestureDetector.SimpleOnScaleGestureListener {
    open var cameraControl: CameraControl;
    constructor(cameraControl1: CameraControl) : super() {
        this.cameraControl = cameraControl1;
    }
    override fun onScale(detector: ScaleGestureDetector): Boolean {
        var zr = camera!!.cameraInfo.zoomState.value?.zoomRatio;
        var currentZoom = if (zr != null) {
            zr;
        } else {
            1.0.toFloat();
        }
        ;
        var deltaZoom = detector.getScaleFactor();
        var newZoom = currentZoom * deltaZoom;
        this.cameraControl.setZoomRatio(newZoom);
        return true;
    }
}
open class SnScanSimpleOnGestureListener : GestureDetector.SimpleOnGestureListener {
    private var cameraControl: CameraControl;
    constructor(cameraControl1: CameraControl) : super() {
        this.cameraControl = cameraControl1;
    }
    override fun onDoubleTap(e: MotionEvent): Boolean {
        var previewView = UTSAndroid.getUniActivity()!!.window.decorView.findViewById<PreviewView>(viewId);
        var factory = SurfaceOrientedMeteringPointFactory(previewView.width.toFloat(), previewView.height.toFloat());
        var point = factory.createPoint(e.x, e.y);
        var action = FocusMeteringAction.Builder(point).build();
        this.cameraControl.startFocusAndMetering(action);
        var zr = camera!!.cameraInfo.zoomState.value?.zoomRatio;
        var currentZoom = if (zr != null) {
            zr;
        } else {
            1.0.toFloat();
        }
        ;
        if (currentZoom != 1.0.toFloat()) {
            cameraControl.setZoomRatio(1.0.toFloat());
        }
        return true;
    }
}
open class SnScanAnalyser : ImageAnalysis.Analyzer {
    private var success: (barcodes: MutableList<Barcode>, imageWidth: Int, imageHeight: Int) -> Unit;
    private var failure: () -> Unit;
    private var complete: () -> Unit;
    private var detector: BarcodeScanner;
    constructor(success: (barcodes: MutableList<Barcode>, imageWidth: Int, imageHeight: Int) -> Unit, failure: () -> Unit, complete: () -> Unit) : super() {
        this.success = success;
        this.failure = failure;
        this.complete = complete;
        this.detector = BarcodeScanning.getClient(options!!);
    }
    override fun analyze(imageProxy: ImageProxy) {
        if (!scanned) {
            var mediaImage = imageProxy.image;
            if (mediaImage == null) {
                imageProxy.close();
                return;
            }
            var image = InputImage.fromMediaImage(mediaImage, imageProxy.imageInfo.rotationDegrees);
            this.detector.process(image).addOnSuccessListener(fun(barCodes: MutableList<Barcode>){
                if (barCodes.size > 0) {
                    this.success(barCodes, imageProxy.width, imageProxy.height);
                    scanned = true;
                    this.detector.close();
                }
                imageProxy.close();
            }
            ).addOnFailureListener(fun(_: Exception){
                this.failure();
                imageProxy.close();
            }
            );
        }
    }
}
