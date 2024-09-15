@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME")
package uts.sdk.modules.snEGesture;
import android.content.Context;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.LinearLayout;
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
import io.dcloud.uts.UTSAndroid;
import io.dcloud.uts.component.UTSContainer;
import io.dcloud.uts.component.UTSSize;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.async;
open class snTouch (
    @JsonNotNull
    open var x: Number,
    @JsonNotNull
    open var y: Number,
    @JsonNotNull
    open var diffX: Number,
    @JsonNotNull
    open var diffY: Number,
    @JsonNotNull
    open var direction: String,
    @JsonNotNull
    open var id: Number,
) : UTSObject()
open class snTouchEvent (
    @JsonNotNull
    open var type: String,
    @JsonNotNull
    open var touches: UTSArray<snTouch>,
) : UTSObject()
open class snFlingEvent (
    @JsonNotNull
    open var type: String,
    @JsonNotNull
    open var beginX: Number,
    @JsonNotNull
    open var beginY: Number,
    @JsonNotNull
    open var endX: Number,
    @JsonNotNull
    open var endY: Number,
    @JsonNotNull
    open var vX: Number,
    @JsonNotNull
    open var vY: Number,
) : UTSObject()
open class snPointerEvent (
    @JsonNotNull
    open var type: String,
    @JsonNotNull
    open var x: Number,
    @JsonNotNull
    open var y: Number,
) : UTSObject()
val lastTouchesRecords: Map<Number, Map<String, Number>> = Map();
open class SnEGestureComponent : UTSContainer<GestureLinearLayout> {
    constructor(proxy: PageProxy, componentData: IComponentData) : super(proxy, componentData) ;
    open var view: GestureLinearLayout? = null;
    override fun NVLoad(): GestureLinearLayout {
        this.view = GestureLinearLayout(`$androidContext`!!)!!;
        var gestureDetector = GestureDetector(`$androidContext`!!, GestureViewGestureListener(this));
        var scaleGestureDetector = ScaleGestureDetector(`$androidContext`!!, GestureViewSimpleOnScaleGestureListener(this));
        this.view!!.setOnTouchListener(GestureViewOnTouchListener(this, gestureDetector, scaleGestureDetector));
        return this.view!!;
    }
    override fun NVMeasure(size: UTSSize): UTSSize {
        return size;
    }
    companion object {
        var name = "sn-e-gesture";
        init {
            io.dcloud.uniapp.UniSDKEngine.registerUniComponent("sn-e-gesture", SnEGestureComponent::class.java, SnEGestureElement::class.java);
        }
    }
}
open class SnEGestureElement : DomNode {
    constructor(data: INodeData, pageNode: PageNode) : super(data, pageNode) ;
}
fun getPos(e: MotionEvent, index: Int = 0.toInt()): UTSArray<Number> {
    return utsArrayOf(
        UTSAndroid.devicePX2px(UTSNumber.from(e.getRawX(index))),
        UTSAndroid.devicePX2px(UTSNumber.from(e.getRawY(index)))
    );
}
fun getPosAndDirection(t: MotionEvent, index: Int): UTSArray<Any> {
    var diffPos = utsArrayOf<Any>();
    diffPos = utsArrayOf(
        0,
        0,
        0,
        0,
        "",
        0
    );
    var id = UTSNumber.from(t.getPointerId(index));
    var pos = getPos(t, index);
    var x = pos[0];
    var y = pos[1];
    if (lastTouchesRecords.has(id)) {
        var info = lastTouchesRecords.get(id)!!;
        var diffX = x - info.get("x")!!;
        var diffY = y - info.get("y")!!;
        var direction = if (Math.abs(diffX) > Math.abs(diffY)) {
            if (diffX < 0) {
                "left";
            } else {
                "right";
            };
        } else {
            if (diffY < 0) {
                "up";
            } else {
                "down";
            };
        };
        diffPos = utsArrayOf(
            x,
            y,
            Math.abs(diffX),
            Math.abs(diffY),
            direction,
            id
        );
    } else {
        var info = Map<String, Number>();
        info.set("x", x);
        info.set("y", y);
        diffPos = utsArrayOf(
            x,
            y,
            0,
            0,
            "",
            id
        );
        lastTouchesRecords.set(id, info);
    }
    return diffPos;
}
open class GestureLinearLayout : LinearLayout {
    constructor(context: Context) : super(context) {}
    override fun onInterceptTouchEvent(motionEvent: MotionEvent): Boolean {
        return true;
    }
}
open class GestureViewSimpleOnScaleGestureListener : ScaleGestureDetector.SimpleOnScaleGestureListener {
    private var comp: SnEGestureComponent;
    constructor(comp: SnEGestureComponent) : super() {
        this.comp = comp;
    }
    override fun onScale(detector: ScaleGestureDetector): Boolean {
        var deltaZoom = detector.getScaleFactor();
        this.comp.`$emit`("scale", object : UTSJSONObject() {
            var zoom = deltaZoom
        });
        return true;
    }
}
open class GestureViewGestureListener : SimpleOnGestureListener {
    private var comp: SnEGestureComponent;
    constructor(comp: SnEGestureComponent) : super() {
        this.comp = comp;
    }
    override fun onDoubleTap(motionEvent: MotionEvent): Boolean {
        var pos = getPos(motionEvent);
        this.comp.`$emit`("dbclick", snPointerEvent(type = "dbclick", x = pos[0], y = pos[1]));
        return false;
    }
    override fun onDown(motionEvent: MotionEvent): Boolean {
        var pos = getPos(motionEvent);
        this.comp.`$emit`("down", snPointerEvent(type = "dbclick", x = pos[0], y = pos[1]));
        return false;
    }
    override fun onShowPress(motionEvent: MotionEvent) {
        var pos = getPos(motionEvent);
        this.comp.`$emit`("showpress", snTouchEvent(type = "showpress", touches = utsArrayOf(
            snTouch(x = pos[0], y = pos[1], diffX = 0, diffY = 0, id = motionEvent.getPointerId(motionEvent.getActionIndex()), direction = "")
        )));
    }
    override fun onLongPress(motionEvent: MotionEvent) {
        var pos = getPos(motionEvent);
        this.comp.`$emit`("longpress", snTouchEvent(type = "longpress", touches = utsArrayOf(
            snTouch(x = pos[0], y = pos[1], diffX = 0, diffY = 0, id = motionEvent.getPointerId(motionEvent.getActionIndex()), direction = "")
        )));
    }
    override fun onSingleTapUp(motionEvent: MotionEvent): Boolean {
        var pos = getPos(motionEvent);
        this.comp.`$emit`("click", snPointerEvent(type = "click", x = pos[0], y = pos[1]));
        return false;
    }
    override fun onFling(e1: MotionEvent?, e2: MotionEvent, velocityX: Float, velocityY: Float): Boolean {
        var beginPos = getPos(e1!!);
        var endPos = getPos(e2);
        this.comp.`$emit`("fling", snFlingEvent(type = "fling", beginX = beginPos[0], endX = endPos[0], beginY = beginPos[1], endY = endPos[1], vX = UTSAndroid.devicePX2px(velocityX), vY = UTSAndroid.devicePX2px(velocityY)));
        return false;
    }
    override fun onScroll(e1: MotionEvent?, e2: MotionEvent, distanceX: Float, distanceY: Float): Boolean {
        var pointerCount = e2.getPointerCount();
        var touches = utsArrayOf<snTouch>();
        run {
            var i: Number = 0;
            while(i < pointerCount){
                var tmp = getPosAndDirection(e2, i.toInt());
                touches.push(snTouch(x = tmp[0] as Number, y = tmp[1] as Number, diffX = tmp[2] as Number, diffY = tmp[3] as Number, direction = tmp[4] as String, id = tmp[5] as Number));
                i++;
            }
        }
        this.comp.`$emit`("touchmove", snTouchEvent(type = "touchmove", touches = touches));
        return true;
    }
}
open class GestureViewOnTouchListener : View.OnTouchListener {
    open var gestureDetector: GestureDetector?;
    open var scaleGestureDetector: ScaleGestureDetector?;
    private var comp: SnEGestureComponent;
    constructor(comp: SnEGestureComponent, gestureDetector: GestureDetector, scaleGestureDetector: ScaleGestureDetector) : super() {
        this.comp = comp;
        this.gestureDetector = gestureDetector;
        this.scaleGestureDetector = scaleGestureDetector;
    }
    override fun onTouch(v: View, motionEvent: MotionEvent): Boolean {
        this.gestureDetector?.onTouchEvent(motionEvent);
        this.scaleGestureDetector?.onTouchEvent(motionEvent);
        var actionMasked = motionEvent.getActionMasked();
        var pointerIndex: Number = 0;
        fun getTouches(): UTSArray<snTouch> {
            var touches = utsArrayOf<snTouch>();
            var tmp = getPosAndDirection(motionEvent, pointerIndex.toInt());
            touches.push(snTouch(x = tmp[0] as Number, y = tmp[1] as Number, diffX = tmp[2] as Number, diffY = tmp[3] as Number, direction = tmp[4] as String, id = tmp[5] as Number));
            return touches;
        }
        fun touchstart() {
            pointerIndex = motionEvent.getActionIndex();
            var touches = getTouches();
            this.comp.`$emit`("touchstart", snTouchEvent(type = "touchstart", touches = touches));
        }
        fun touchend() {
            pointerIndex = motionEvent.getActionIndex();
            var touches = getTouches();
            this.comp.`$emit`("touchend", snTouchEvent(type = "touchend", touches = touches));
            lastTouchesRecords.`delete`(UTSNumber.from(motionEvent.getPointerId(pointerIndex.toInt())));
        }
        fun touchcancel() {
            pointerIndex = motionEvent.getActionIndex();
            var touches = getTouches();
            this.comp.`$emit`("touchcancel", snTouchEvent(type = "touchcancel", touches = touches));
            lastTouchesRecords.`delete`(UTSNumber.from(motionEvent.getPointerId(pointerIndex.toInt())));
        }
        when (actionMasked) {
            MotionEvent.ACTION_DOWN -> 
                touchstart();
            MotionEvent.ACTION_POINTER_DOWN -> 
                touchstart();
            MotionEvent.ACTION_UP -> 
                touchend();
            MotionEvent.ACTION_POINTER_UP -> 
                touchend();
            MotionEvent.ACTION_CANCEL -> 
                touchcancel();
        }
        return true;
    }
}
