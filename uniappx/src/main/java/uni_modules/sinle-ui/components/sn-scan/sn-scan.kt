@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME")
package uni.UNIB140C8B;
import android.media.MediaPlayer;
import io.dcloud.uniapp.*;
import io.dcloud.uniapp.extapi.*;
import io.dcloud.uniapp.framework.*;
import io.dcloud.uniapp.runtime.*;
import io.dcloud.uniapp.vue.*;
import io.dcloud.uniapp.vue.shared.*;
import io.dcloud.uts.*;
import io.dcloud.uts.Map;
import io.dcloud.uts.Set;
import io.dcloud.uts.UTSAndroid;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.async;
import uts.sdk.modules.snEScanProvider.SnEScanProviderElement;
import io.dcloud.uniapp.extapi.chooseImage as uni_chooseImage;
import io.dcloud.uniapp.extapi.getWindowInfo as uni_getWindowInfo;
import io.dcloud.uniapp.extapi.navigateBack as uni_navigateBack;
import io.dcloud.uniapp.extapi.showModal as uni_showModal;
open class GenUniModulesSinleUiComponentsSnScanSnScan : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var title: String by `$props`;
    open var titleSize: String by `$props`;
    open var titleColor: String by `$props`;
    open var tip: String by `$props`;
    open var tipColor: String by `$props`;
    open var tipSize: String by `$props`;
    open var torchText: String by `$props`;
    open var torchTextColor: String by `$props`;
    open var torchTextSize: String by `$props`;
    open var dotSize: String by `$props`;
    open var scanType: String by `$props`;
    open var lineAniDur: Number by `$props`;
    open var enableDing: Boolean by `$props`;
    open var dingFileSrc: String by `$props`;
    open var scanOnlyOnce: Boolean by `$props`;
    open var continuous: Boolean by `$props`;
    open var continuousSleep: Number by `$props`;
    open var showTorch: Boolean by `$props`;
    open var showAlbum: Boolean by `$props`;
    open var showBackButton: Boolean by `$props`;
    open var showAni: Boolean by `$props`;
    open var enableZoom: Boolean by `$props`;
    open var initZoomScale: Number by `$props`;
    open var permissionTip: String by `$props`;
    open var customDotStyle: Any by `$props`;
    open var customDotIconStyle: Any by `$props`;
    open var customTitleStyle: Any by `$props`;
    open var customTipStyle: Any by `$props`;
    open var customStyle: Any by `$props`;
    open var rescan: () -> Unit
        get() {
            return unref(this.`$exposed`["rescan"]) as () -> Unit;
        }
        set(value) {
            setRefValue(this.`$exposed`, "rescan", value);
        }
    open var setTorchStatus: (value: Boolean) -> Unit
        get() {
            return unref(this.`$exposed`["setTorchStatus"]) as (value: Boolean) -> Unit;
        }
        set(value) {
            setRefValue(this.`$exposed`, "setTorchStatus", value);
        }
    open var scanImageByURI: (src: String) -> Unit
        get() {
            return unref(this.`$exposed`["scanImageByURI"]) as (src: String) -> Unit;
        }
        set(value) {
            setRefValue(this.`$exposed`, "scanImageByURI", value);
        }
    open var setZoomRatio: (zoomRatio: Number) -> Unit
        get() {
            return unref(this.`$exposed`["setZoomRatio"]) as (zoomRatio: Number) -> Unit;
        }
        set(value) {
            setRefValue(this.`$exposed`, "setZoomRatio", value);
        }
    open var getZoomRatio: () -> Number
        get() {
            return unref(this.`$exposed`["getZoomRatio"]) as () -> Number;
        }
        set(value) {
            setRefValue(this.`$exposed`, "getZoomRatio", value);
        }
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnScanSnScan, _arg1: SetupContext) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props, ref1): Any? {
            var __expose = ref1.expose;
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnScanSnScan;
            val _cache = __ins.renderCache;
            val snu = `$snui`.utils;
            fun emit(event: String, vararg do_not_transform_spread: Any?) {
                __ins.emit(event, *do_not_transform_spread);
            }
            val props = __props;
            val imgScanedSrc = ref("");
            val cameraMode = ref(true);
            val overlayDark = ref(false);
            val dotPositions = ref(utsArrayOf<UTSJSONObject>());
            val dotValues = ref(utsArrayOf<String>());
            val dotDuration = ref(200);
            val dotScale = ref(0.001);
            val dotTimer = ref(null as Number?);
            val isScanned = ref(false);
            val effectTrans = ref(-200);
            val effectTimer = ref(null as Number?);
            val flashlightOn = ref(false);
            val scancodeEle = ref(null as SnEScanProviderElement?);
            val effectEle = ref(null as UniElement?);
            val titleSizeC = computed(fun(): String {
                return if (props.titleSize == "") {
                    "" + (`$snui`.utils.getPx(`$snui`.configs.font.size(3)) + 2) + "px";
                } else {
                    props.titleSize;
                }
                ;
            }
            );
            val tipSizeC = computed(fun(): String {
                return if (props.tipSize == "") {
                    `$snui`.configs.font.size(2);
                } else {
                    props.tipSize;
                }
                ;
            }
            );
            val torchTextSizeC = computed(fun(): String {
                return if (props.torchTextSize == "") {
                    `$snui`.configs.font.size(1);
                } else {
                    props.torchTextSize;
                }
                ;
            }
            );
            val enableCustomDing = computed(fun(): Boolean {
                return !snu.text.isEmpty(props.dingFileSrc);
            }
            );
            val windowInfo = computed(fun(): GetWindowInfoResult {
                return uni_getWindowInfo();
            }
            );
            val windowHeight = computed(fun(): Number {
                return `$snui`.utils.platform.getWindowHeight();
            }
            );
            val statusBarHeight = computed(fun(): Number {
                return windowInfo.value.statusBarHeight;
            }
            );
            val showAniC = computed(fun(): Boolean {
                return props.showAni;
            }
            );
            val dotStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("width", props.dotSize);
                styles.set("height", props.dotSize);
                styles.set("transform", "scale(" + dotScale.value + ")");
                styles.set("border-radius", `$snui`.configs.radius.circle);
                styles.set("zIndex", `$snui`.configs.zIndex.popup);
                styles.set("transition-duration", "" + dotDuration.value + "ms");
                return styles;
            }
            );
            fun genSetEffectTransFn(value: Number) {
                effectTrans.value = value;
                effectEle.value?.style?.setProperty("transform", "translateY(" + value + "px)");
            }
            val setEffectTrans = ::genSetEffectTransFn;
            fun genInitFn() {
                if (effectTimer.value != null) {
                    clearInterval(effectTimer.value as Number);
                }
                if (dotTimer.value != null) {
                    clearInterval(dotTimer.value as Number);
                }
                isScanned.value = false;
                flashlightOn.value = false;
                dotScale.value = 0.001;
                imgScanedSrc.value = "";
                cameraMode.value = true;
                overlayDark.value = false;
                dotPositions.value = utsArrayOf<UTSJSONObject>();
                dotValues.value = utsArrayOf<String>();
                dotDuration.value = if (showAniC.value) {
                    200;
                } else {
                    0;
                }
                ;
                setEffectTrans(-200);
                dotTimer.value = null;
                effectTimer.value = null;
                if (showAniC.value) {
                    var s = windowHeight.value;
                    setTimeout(fun(){
                        effectTimer.value = setInterval(fun(){
                            if (effectTrans.value <= s) {
                                setEffectTrans(effectTrans.value + 1);
                            } else {
                                setEffectTrans(-200);
                            }
                        }
                        , props.lineAniDur / s);
                    }
                    , 100);
                }
            }
            val init = ::genInitFn;
            fun genScannedFn(e: UTSJSONObject): Unit {
                emit("scanned", e);
                var data = e["data"] as UTSArray<UTSJSONObject>;
                var scanOnlyOnce = props.scanOnlyOnce;
                var continuous = props.continuous;
                if (data.length > 0) {
                    if (e["scanMode"] == "image") {
                        cameraMode.value = false;
                    }
                    isScanned.value = true;
                    var tmpDotPositions = utsArrayOf<UTSJSONObject>();
                    var tmpDotData = utsArrayOf<String>();
                    run {
                        var i: Number = 0;
                        while(i < data.length){
                            var code = data[i] as UTSJSONObject;
                            tmpDotData.push(code["value"] as String);
                            tmpDotPositions.push(code["position"] as UTSJSONObject);
                            i++;
                        }
                    }
                    dotValues.value = tmpDotData;
                    dotPositions.value = tmpDotPositions;
                    overlayDark.value = true;
                    fun checkPoint() {
                        if (data.length == 1) {
                            if (!continuous || scanOnlyOnce) {
                                emit("goin", object : UTSJSONObject() {
                                    var value = (data[0] as UTSJSONObject)["value"] as String
                                });
                            }
                        }
                    }
                    if (showAniC.value) {
                        setTimeout(fun(){
                            dotScale.value = 1.2;
                            setTimeout(fun(){
                                dotDuration.value = 250;
                                checkPoint();
                            }, 200);
                            dotTimer.value = setInterval(fun(){
                                dotScale.value = 1;
                                setTimeout(fun(){
                                    dotScale.value = 1.2;
                                }, 300);
                            }, 2000);
                        }, 100);
                    } else {
                        dotScale.value = 1.2;
                        checkPoint();
                    }
                    if (enableCustomDing.value) {
                        var mediaPlayer = MediaPlayer();
                        try {
                            mediaPlayer.setDataSource(UTSAndroid.convert2AbsFullPath(props.dingFileSrc));
                            mediaPlayer.prepare();
                            mediaPlayer.start();
                        }
                         catch (e: Throwable) {
                            throw e;
                        }
                    }
                    if (!scanOnlyOnce && continuous) {
                        setTimeout(fun(){
                            init();
                            if (scancodeEle.value != null) {
                                scancodeEle.value!!.rescan();
                            }
                        }
                        , props.continuousSleep);
                    }
                } else {
                    uni_showModal(ShowModalOptions(title = "提示", content = "未识别到有效内容", showCancel = false));
                }
            }
            val scanned = ::genScannedFn;
            fun genRescanFn() {
                init();
                if (scancodeEle.value != null) {
                    scancodeEle.value!!.rescan();
                }
            }
            val rescan = ::genRescanFn;
            fun genButtonClickedFn(e: String) {
                emit("buttonClick", object : UTSJSONObject() {
                    var value = e
                });
                var scanOnlyOnce = props.scanOnlyOnce;
                when (e) {
                    "return" -> 
                        if (isScanned.value && !scanOnlyOnce) {
                            rescan();
                        } else {
                            uni_navigateBack(null);
                        }
                    "album" -> 
                        if (!scanOnlyOnce || (scanOnlyOnce && !isScanned.value)) {
                            uni_chooseImage(ChooseImageOptions(count = 1, sourceType = utsArrayOf(
                                "album"
                            ), success = fun(res){
                                if (scancodeEle.value != null) {
                                    scancodeEle.value!!.scanImageByURI(res.tempFilePaths[0] as String);
                                    imgScanedSrc.value = res.tempFilePaths[0] as String;
                                } else {
                                    init();
                                    nextTick(fun(){
                                        scancodeEle.value!!.scanImageByURI(res.tempFilePaths[0] as String);
                                        imgScanedSrc.value = res.tempFilePaths[0] as String;
                                    }
                                    );
                                }
                            }
                            ));
                        }
                    "flashlight" -> 
                        if (!isScanned.value) {
                            flashlightOn.value = !flashlightOn.value;
                            if (scancodeEle.value != null) {
                                scancodeEle.value!!.setTorchStatus(flashlightOn.value);
                            }
                        }
                }
            }
            val buttonClicked = ::genButtonClickedFn;
            fun genTurnToCodeFn(value: String) {
                if (!props.continuous) {
                    emit("goin", object : UTSJSONObject() {
                        var value = value
                    });
                }
            }
            val turnToCode = ::genTurnToCodeFn;
            fun genOnScaleFn(e: UTSJSONObject) {
                if (scancodeEle.value != null && props.enableZoom) {
                    var delta = e["zoom"] as Number;
                    var originZoom = scancodeEle.value!!.getZoomRatio();
                    var curZoom = originZoom ?: 1.0;
                    curZoom = delta * curZoom;
                    scancodeEle.value!!.setZoomRatio(curZoom);
                }
            }
            val onScale = ::genOnScaleFn;
            fun genOnDbclickFn(e: Any) {
                if (scancodeEle.value != null && props.enableZoom) {
                    scancodeEle.value!!.setZoomRatio(1);
                }
            }
            val onDbclick = ::genOnDbclickFn;
            fun genSetTorchStatusFn(value: Boolean) {
                scancodeEle.value!!.setTorchStatus(value);
            }
            val setTorchStatus = ::genSetTorchStatusFn;
            fun genScanImageByURIFn(src: String) {
                scancodeEle.value!!.scanImageByURI(src);
            }
            val scanImageByURI = ::genScanImageByURIFn;
            fun genSetZoomRatioFn(zoomRatio: Number) {
                scancodeEle.value!!.setZoomRatio(zoomRatio);
            }
            val setZoomRatio = ::genSetZoomRatioFn;
            fun genGetZoomRatioFn(): Number {
                return scancodeEle.value!!.getZoomRatio() as Number;
            }
            val getZoomRatio = ::genGetZoomRatioFn;
            __expose(utsMapOf("rescan" to rescan, "setTorchStatus" to setTorchStatus, "scanImageByURI" to scanImageByURI, "setZoomRatio" to setZoomRatio, "getZoomRatio" to getZoomRatio));
            onMounted(fun(){
                init();
            }
            );
            onPageShow(fun(){
                init();
            }
            );
            onBackPress(fun(options): Boolean {
                if (options.from == "backbutton" && !props.scanOnlyOnce) {
                    var r = isScanned.value;
                    init();
                    if (scancodeEle.value != null && r) {
                        scancodeEle.value!!.rescan();
                    }
                    return if (r) {
                        true;
                    } else {
                        false;
                    };
                } else {
                    return false;
                }
            }
            );
            return fun(): Any? {
                val _component_sn_icon = resolveEasyComponent("sn-icon", GenUniModulesSinleUiComponentsSnIconSnIconClass);
                val _component_sn_button = resolveEasyComponent("sn-button", GenUniModulesSinleUiComponentsSnButtonSnButtonClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                return createElementVNode("view", utsMapOf("class" to "sn-scancode-root"), utsArrayOf(
                    if (isTrue(unref(cameraMode))) {
                        createElementVNode(uts.sdk.modules.snEScanProvider.SnEScanProviderComponent.name, utsMapOf("key" to 0, "ref_key" to "scancodeEle", "ref" to scancodeEle, "class" to "sn-scancode", "scanType" to _ctx.scanType, "enableDing" to if (unref(enableCustomDing)) {
                            false;
                        } else {
                            _ctx.enableDing;
                        }, "initZoomScale" to _ctx.initZoomScale, "enableZoom" to _ctx.enableZoom, "permissionTip" to _ctx.permissionTip, "onScanned" to scanned), null, 40, utsArrayOf(
                            "scanType",
                            "enableDing",
                            "initZoomScale",
                            "enableZoom",
                            "permissionTip"
                        ));
                    } else {
                        createElementVNode("image", utsMapOf("key" to 1, "mode" to "aspectFill", "class" to "sn-scancode-imageView", "src" to unref(imgScanedSrc)), null, 8, utsArrayOf(
                            "src"
                        ));
                    }
                    ,
                    createElementVNode("view", utsMapOf("class" to "sn-scancode-overlay", "style" to normalizeStyle(utsMapOf("opacity" to if (unref(overlayDark)) {
                        0.5;
                    } else {
                        0;
                    }
                    , "position" to if (unref(overlayDark)) {
                        "fixed";
                    } else {
                        "";
                    }
                    , "transitionDuration" to if (unref(showAniC)) {
                        unref(`$snui`).configs.aniTime.normal;
                    } else {
                        "0ms";
                    }
                    ))), null, 4),
                    if (isTrue(!unref(isScanned) && unref(showAniC))) {
                        createElementVNode(uts.sdk.modules.snEGesture.SnEGestureComponent.name, utsMapOf("key" to 2, "ref_key" to "effectEle", "ref" to effectEle, "class" to "sn-scancode-effect sn-scancode-float", "onScale" to onScale, "onDbclick" to onDbclick), utsArrayOf(
                            createElementVNode("image", utsMapOf("class" to "sn-scancode-effect", "mode" to "aspectFit", "src" to default1))
                        ), 544);
                    } else {
                        createCommentVNode("v-if", true);
                    }
                    ,
                    createElementVNode("view", utsMapOf("class" to "sn-scancode-topbar sn-scancode-float", "style" to normalizeStyle(utsMapOf("padding" to ("" + (unref(statusBarHeight) + 50) + " 20px")))), utsArrayOf(
                        if (isTrue(_ctx.showBackButton)) {
                            createVNode(_component_sn_button, utsMapOf("key" to 0, "bgColor" to "rgba(255,255,255,0)", "activeBgColor" to "rgba(255,255,255,0.2)", "round" to "", "onClick" to fun(){
                                buttonClicked("return");
                            }), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    createVNode(_component_sn_icon, utsMapOf("color" to "#fff", "name" to if (!unref(isScanned) || _ctx.scanOnlyOnce) {
                                        "arrow-left-line";
                                    } else {
                                        "close-line";
                                    }), null, 8, utsArrayOf(
                                        "name"
                                    ))
                                );
                            }), "_" to 1), 8, utsArrayOf(
                                "onClick"
                            ));
                        } else {
                            createVNode(_component_sn_button, utsMapOf("key" to 1, "bgColor" to "rgba(255,255,255,0)", "activeBgColor" to "rgba(255,255,255,0)", "round" to ""));
                        }
                        ,
                        createVNode(_component_sn_text, utsMapOf("class" to "sn-scancode-topbar-title", "align" to "center", "text" to _ctx.title, "color" to _ctx.titleColor, "size" to unref(titleSizeC), "custom-style" to _ctx.customTitleStyle), null, 8, utsArrayOf(
                            "text",
                            "color",
                            "size",
                            "custom-style"
                        )),
                        if (isTrue(_ctx.showAlbum)) {
                            createVNode(_component_sn_button, utsMapOf("key" to 2, "bgColor" to "rgba(255,255,255,0)", "activeBgColor" to "rgba(255,255,255,0.2)", "round" to "", "onClick" to fun(){
                                buttonClicked("album");
                            }), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    createVNode(_component_sn_icon, utsMapOf("name" to "gallery-line", "color" to "#fff"))
                                );
                            }), "_" to 1), 8, utsArrayOf(
                                "onClick"
                            ));
                        } else {
                            createVNode(_component_sn_button, utsMapOf("key" to 3, "bgColor" to "rgba(255,255,255,0)", "activeBgColor" to "rgba(255,255,255,0)", "round" to ""));
                        }
                    ), 4),
                    createVNode(_component_sn_text, utsMapOf("class" to "sn-scancode-float", "align" to "center", "text" to _ctx.tip, "size" to unref(tipSizeC), "color" to _ctx.tipColor, "custom-style" to _ctx.customTipStyle, "style" to normalizeStyle(utsMapOf("top" to (unref(statusBarHeight) + 80), "width" to "100%"))), null, 8, utsArrayOf(
                        "text",
                        "size",
                        "color",
                        "custom-style",
                        "style"
                    )),
                    if (isTrue(_ctx.showTorch && !unref(isScanned))) {
                        createElementVNode("view", utsMapOf("key" to 3, "class" to "sn-scancode-torch-contain sn-scancode-float"), utsArrayOf(
                            createVNode(_component_sn_button, utsMapOf("bgColor" to "rgba(255,255,255,0.3)", "activeBgColor" to "rgba(255,255,255,0.4)", "round" to "", "onClick" to fun(){
                                buttonClicked("flashlight");
                            }, "style" to normalizeStyle(utsMapOf("margin-bottom" to "10px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    createVNode(_component_sn_icon, utsMapOf("name" to if (unref(flashlightOn)) {
                                        "lightbulb-flash-fill";
                                    } else {
                                        "lightbulb-fill";
                                    }, "color" to "#fff"), null, 8, utsArrayOf(
                                        "name"
                                    ))
                                );
                            }), "_" to 1), 8, utsArrayOf(
                                "onClick",
                                "style"
                            )),
                            createVNode(_component_sn_text, utsMapOf("text" to _ctx.torchText, "size" to unref(torchTextSizeC), "color" to _ctx.torchTextColor), null, 8, utsArrayOf(
                                "text",
                                "size",
                                "color"
                            ))
                        ));
                    } else {
                        createCommentVNode("v-if", true);
                    }
                    ,
                    createElementVNode(Fragment, null, RenderHelpers.renderList(unref(dotPositions), fun(e, index, _, _): VNode {
                        return createElementVNode("view", utsMapOf("class" to "sn-scancode-dot sn-scancode-float", "key" to index, "style" to normalizeStyle(utsArrayOf(
                            utsMapOf("top" to ((e["centerY"] as Number) - unref(snu).getPx(_ctx.dotSize) * 0.5) as Number, "left" to ((e["centerX"] as Number) - unref(snu).getPx(_ctx.dotSize) * 0.5) as Number),
                            unref(dotStylesC),
                            _ctx.customDotStyle
                        )), "onClick" to fun(){
                            turnToCode(unref(dotValues)[index]);
                        }
                        ), utsArrayOf(
                            createVNode(_component_sn_icon, utsMapOf("name" to "arrow-up-line", "custom-style" to _ctx.customDotIconStyle), null, 8, utsArrayOf(
                                "custom-style"
                            ))
                        ), 12, utsArrayOf(
                            "onClick"
                        ));
                    }
                    ), 128)
                ));
            }
            ;
        }
        ;
        var name = "sn-scan";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-scancode" to padStyleMapOf(utsMapOf("flex" to 1, "backgroundColor" to "#000000", "zIndex" to 10)), "sn-scancode-imageView" to padStyleMapOf(utsMapOf("flex" to 1, "width" to "100%", "height" to "100%", "zIndex" to 10)), "sn-scancode-root" to padStyleMapOf(utsMapOf("flex" to 1, "backgroundColor" to "#000000")), "sn-scancode-float" to padStyleMapOf(utsMapOf("position" to "fixed", "zIndex" to 100)), "sn-scancode-torch-contain" to padStyleMapOf(utsMapOf("width" to "100%", "left" to 0, "right" to 0, "bottom" to 100, "alignItems" to "center", "justifyContent" to "center")), "sn-scancode-dot" to padStyleMapOf(utsMapOf("justifyContent" to "center", "alignItems" to "center")), "sn-scancode-overlay" to padStyleMapOf(utsMapOf("top" to 0, "left" to 0, "right" to 0, "bottom" to 0, "backgroundColor" to "#000000", "zIndex" to 15)), "sn-scancode-effect" to padStyleMapOf(utsMapOf("width" to "100%", "zIndex" to 11)), "sn-scancode-topbar" to padStyleMapOf(utsMapOf("position" to "fixed", "top" to 0, "left" to 0, "right" to 0, "height" to 100, "flexDirection" to "row", "alignItems" to "center", "justifyContent" to "space-between")), "sn-scancode-topbar-title" to padStyleMapOf(utsMapOf("flex" to 1, "textAlign" to "center")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf("buttonClick" to null, "scanned" to null, "goin" to null);
        var props = normalizePropsOptions(utsMapOf("title" to utsMapOf("type" to "String", "default" to "扫一扫"), "titleSize" to utsMapOf("type" to "String", "default" to ""), "titleColor" to utsMapOf("type" to "String", "default" to "#fff"), "tip" to utsMapOf("type" to "String", "default" to "识别二维码/条码"), "tipColor" to utsMapOf("type" to "String", "default" to "#d6d6db"), "tipSize" to utsMapOf("type" to "String", "default" to ""), "torchText" to utsMapOf("type" to "String", "default" to "轻触点亮或关闭"), "torchTextColor" to utsMapOf("type" to "String", "default" to "#fff"), "torchTextSize" to utsMapOf("type" to "String", "default" to ""), "dotSize" to utsMapOf("type" to "String", "default" to "35px"), "scanType" to utsMapOf("type" to "String", "default" to "all"), "lineAniDur" to utsMapOf("type" to "Number", "default" to 5000), "enableDing" to utsMapOf("type" to "Boolean", "default" to true), "dingFileSrc" to utsMapOf("type" to "String", "default" to ""), "scanOnlyOnce" to utsMapOf("type" to "Boolean", "default" to false), "continuous" to utsMapOf("type" to "Boolean", "default" to false), "continuousSleep" to utsMapOf("type" to "Number", "default" to 2000), "showTorch" to utsMapOf("type" to "Boolean", "default" to true), "showAlbum" to utsMapOf("type" to "Boolean", "default" to true), "showBackButton" to utsMapOf("type" to "Boolean", "default" to true), "showAni" to utsMapOf("type" to "Boolean", "default" to true), "enableZoom" to utsMapOf("type" to "Boolean", "default" to true), "initZoomScale" to utsMapOf("type" to "Number", "default" to 0.4), "permissionTip" to utsMapOf("type" to "String", "default" to "\u3000 本应用正在请求您的相机权限，仅用于条码、二维码识别，且不会将任何数据上传至云端。如不提供此权限，则无法正常使用扫码功能。"), "customDotStyle" to utsMapOf("default" to object : UTSJSONObject() {
            var border = "2px solid #fff"
            var background = colors.value.primary
        }), "customDotIconStyle" to utsMapOf("default" to object : UTSJSONObject() {
            var color = "#fff"
        }), "customTitleStyle" to utsMapOf("default" to UTSJSONObject()), "customTipStyle" to utsMapOf("default" to UTSJSONObject()), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "title",
            "titleSize",
            "titleColor",
            "tip",
            "tipColor",
            "tipSize",
            "torchText",
            "torchTextColor",
            "torchTextSize",
            "dotSize",
            "scanType",
            "lineAniDur",
            "enableDing",
            "dingFileSrc",
            "scanOnlyOnce",
            "continuous",
            "continuousSleep",
            "showTorch",
            "showAlbum",
            "showBackButton",
            "showAni",
            "enableZoom",
            "initZoomScale",
            "permissionTip",
            "customDotStyle",
            "customDotIconStyle",
            "customTitleStyle",
            "customTipStyle",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
