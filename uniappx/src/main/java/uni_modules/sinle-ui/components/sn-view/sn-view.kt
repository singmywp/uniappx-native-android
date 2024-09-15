@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME")
package uni.UNIB140C8B;
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
open class GenUniModulesSinleUiComponentsSnViewSnView : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var loading: Boolean by `$props`;
    open var aniTime: Number by `$props`;
    open var bgColor: String by `$props`;
    open var borderRadius: String by `$props`;
    open var margin: String by `$props`;
    open var padding: String by `$props`;
    open var boxShadow: String by `$props`;
    open var customStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnViewSnView) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnViewSnView;
            val _cache = __ins.renderCache;
            fun emit(event: String, vararg do_not_transform_spread: Any?) {
                __ins.emit(event, *do_not_transform_spread);
            }
            val props = __props;
            val dbclickTimer = ref(null as Number?);
            val lastTouchesRecords: Map<Number, Map<String, Number>> = Map();
            val aniTimeC = computed(fun(): Number {
                return if (props.aniTime == parseFloat(`$snui`.configs.aniTime.normal)) {
                    parseFloat(`$snui`.configs.aniTime.normal);
                } else {
                    props.aniTime;
                }
                ;
            }
            );
            val viewStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("background", props.bgColor);
                styles.set("padding", props.padding);
                styles.set("margin", props.margin);
                styles.set("box-shadow", props.boxShadow);
                styles.set("border-radius", props.borderRadius);
                styles.set("justify-content", if (props.loading) {
                    "center";
                } else {
                    "";
                }
                );
                styles.set("align-items", if (props.loading) {
                    "center";
                } else {
                    "";
                }
                );
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            fun genOnClickFn(event: UniPointerEvent) {
                var type = "click";
                if (dbclickTimer.value == null) {
                    dbclickTimer.value = setTimeout(fun(){
                        dbclickTimer.value = null;
                    }, 300);
                } else {
                    clearTimeout(dbclickTimer.value!!);
                    dbclickTimer.value = null;
                    type = "dbclick";
                }
                var e = snPointerEvent(type = type, x = event.clientX, y = event.clientY);
                emit("down", e);
                if (type == "dbclick") {
                    emit("dbclick", e);
                } else {
                    emit("click", e);
                }
            }
            val onClick = ::genOnClickFn;
            fun genRemoveTouchesRecordsFn(items: UTSArray<Number>) {
                run {
                    var i: Number = 0;
                    while(i < items.length){
                        lastTouchesRecords.`delete`(items[i]);
                        i++;
                    }
                }
            }
            val removeTouchesRecords = ::genRemoveTouchesRecordsFn;
            fun genGetDiffPosAndDirectionFn(t: UniTouch): UTSArray<Any> {
                var diffPos = utsArrayOf<Any>();
                if (lastTouchesRecords.has(t.identifier)) {
                    var info = lastTouchesRecords.get(t.identifier)!!;
                    var diffX = t.clientX - info.get("x")!!;
                    var diffY = t.clientY - info.get("y")!!;
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
                        Math.abs(diffX),
                        Math.abs(diffY),
                        direction
                    );
                } else {
                    var info = Map<String, Number>();
                    info.set("x", t.clientX);
                    info.set("y", t.clientY);
                    diffPos = utsArrayOf(
                        0,
                        0,
                        ""
                    );
                    lastTouchesRecords.set(t.identifier, info);
                }
                return diffPos;
            }
            val getDiffPosAndDirection = ::genGetDiffPosAndDirectionFn;
            fun genOnLongpressFn(event: UniTouchEvent) {
                var touches = utsArrayOf<Touch>();
                touches = event.touches;
                var e = snTouchEvent(type = "longpress", touches = touches.map(fun(t: UniTouch): snTouch {
                    var diffPos = getDiffPosAndDirection(t);
                    return snTouch(x = t.clientX, y = t.clientY, diffX = diffPos[0] as Number, diffY = diffPos[1] as Number, direction = "", id = t.identifier);
                }
                ) as UTSArray<snTouch>);
                emit("longpress", e);
            }
            val onLongpress = ::genOnLongpressFn;
            fun genOnTouchstartFn(event: UniTouchEvent) {
                var touches = utsArrayOf<Touch>();
                touches = event.touches;
                var e = snTouchEvent(type = "touchstart", touches = touches.map(fun(t: UniTouch): snTouch {
                    var diffPos = getDiffPosAndDirection(t);
                    return snTouch(x = t.clientX, y = t.clientY, diffX = diffPos[0] as Number, diffY = diffPos[1] as Number, direction = diffPos[2] as String, id = t.identifier);
                }
                ) as UTSArray<snTouch>);
                emit("down", e);
                emit("touchstart", e);
            }
            val onTouchstart = ::genOnTouchstartFn;
            fun genOnTouchendFn(event: UniTouchEvent) {
                var toRemove = utsArrayOf<Number>();
                var changedTouches = utsArrayOf<Touch>();
                changedTouches = event.changedTouches;
                var e = snTouchEvent(type = "touchend", touches = changedTouches.map(fun(t: UniTouch): snTouch {
                    var diffPos = getDiffPosAndDirection(t);
                    toRemove.push(t.identifier);
                    return snTouch(x = t.clientX, y = t.clientY, diffX = diffPos[0] as Number, diffY = diffPos[1] as Number, direction = diffPos[2] as String, id = t.identifier);
                }
                ) as UTSArray<snTouch>);
                removeTouchesRecords(toRemove);
                emit("touchend", e);
            }
            val onTouchend = ::genOnTouchendFn;
            fun genOnTouchcancelFn(event: UniTouchEvent) {
                var toRemove = utsArrayOf<Number>();
                var changedTouches = utsArrayOf<Touch>();
                changedTouches = event.changedTouches;
                var e = snTouchEvent(type = "touchcancel", touches = changedTouches.map(fun(t: UniTouch): snTouch {
                    var diffPos = getDiffPosAndDirection(t);
                    toRemove.push(t.identifier);
                    return snTouch(x = t.clientX, y = t.clientY, diffX = diffPos[0] as Number, diffY = diffPos[1] as Number, direction = diffPos[2] as String, id = t.identifier);
                }
                ) as UTSArray<snTouch>);
                removeTouchesRecords(toRemove);
                emit("touchcancel", e);
            }
            val onTouchcancel = ::genOnTouchcancelFn;
            fun genOnTouchmoveFn(event: UniTouchEvent) {
                var touches = utsArrayOf<Touch>();
                touches = event.touches;
                var e = snTouchEvent(type = "touchmove", touches = touches.map(fun(t: UniTouch): snTouch {
                    var diffPos = getDiffPosAndDirection(t);
                    return snTouch(x = t.clientX, y = t.clientY, diffX = diffPos[0] as Number, diffY = diffPos[1] as Number, direction = diffPos[2] as String, id = t.identifier);
                }
                ) as UTSArray<snTouch>);
                emit("touchmove", e);
            }
            val onTouchmove = ::genOnTouchmoveFn;
            return fun(): Any? {
                val _component_sn_loading = resolveEasyComponent("sn-loading", GenUniModulesSinleUiComponentsSnLoadingSnLoadingClass);
                return createElementVNode("view", utsMapOf("class" to "sn-view", "onClick" to onClick, "onLongpress" to onLongpress, "onTouchstart" to onTouchstart, "onTouchmove" to onTouchmove, "onTouchend" to onTouchend, "onTouchcancel" to onTouchcancel, "style" to normalizeStyle(utsArrayOf(
                    unref(viewStylesC),
                    _ctx.customStyle
                ))), utsArrayOf(
                    if (isTrue(!_ctx.loading)) {
                        renderSlot(_ctx.`$slots`, "default", utsMapOf("key" to 0));
                    } else {
                        createVNode(_component_sn_loading, utsMapOf("key" to 1));
                    }
                ), 36);
            }
            ;
        }
        ;
        var name = "sn-view";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf());
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf("click" to null, "longpress" to null, "dbclick" to null, "touchstart" to null, "touchmove" to null, "touchend" to null, "touchcancel" to null, "down" to null);
        var props = normalizePropsOptions(utsMapOf("loading" to utsMapOf("type" to "Boolean", "default" to false), "aniTime" to utsMapOf("type" to "Number", "default" to parseFloat(`$snui`.configs.aniTime.normal)), "bgColor" to utsMapOf("type" to "String", "default" to ""), "borderRadius" to utsMapOf("type" to "String", "default" to ""), "margin" to utsMapOf("type" to "String", "default" to ""), "padding" to utsMapOf("type" to "String", "default" to ""), "boxShadow" to utsMapOf("type" to "String", "default" to ""), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "loading",
            "aniTime",
            "bgColor",
            "borderRadius",
            "margin",
            "padding",
            "boxShadow",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
