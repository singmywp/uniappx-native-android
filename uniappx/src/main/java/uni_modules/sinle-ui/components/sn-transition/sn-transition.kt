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
open class GenUniModulesSinleUiComponentsSnTransitionSnTransition : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var show: Boolean by `$props`;
    open var placed: Boolean by `$props`;
    open var mode: String by `$props`;
    open var aniDur: Number by `$props`;
    open var timingFunction: String by `$props`;
    open var customStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnTransitionSnTransition) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnTransitionSnTransition;
            val _cache = __ins.renderCache;
            fun emit(event: String, vararg do_not_transform_spread: Any?) {
                __ins.emit(event, *do_not_transform_spread);
            }
            val props = __props;
            val transitionEle = ref<Element?>(null);
            val display = ref(false);
            val playing = ref(false);
            val beforeEnd = ref(false);
            val delay: Number = 60;
            val transitionStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("transitionTimingFunction", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val aniDurC = computed(fun(): Number {
                return if (props.aniDur == parseInt(`$snui`.configs.aniTime.long)) {
                    parseInt(`$snui`.configs.aniTime.long);
                } else {
                    props.aniDur;
                }
                ;
            }
            );
            fun genFadeFn(enter: Boolean) {
                if (enter) {
                    playing.value = true;
                    emit("beforeEnter");
                    transitionEle.value?.style?.setProperty("transition-duration", "" + 10 + "ms");
                    transitionEle.value?.style?.setProperty("opacity", 0);
                    setTimeout(fun(){
                        emit("enter");
                        transitionEle.value?.style?.setProperty("transition-duration", "" + aniDurC.value + "ms");
                        transitionEle.value?.style?.setProperty("opacity", 1);
                        beforeEnd.value = true;
                    }, delay);
                } else {
                    emit("beforeLeave");
                    emit("leave");
                    transitionEle.value?.style?.setProperty("opacity", 0);
                }
            }
            val fade = ::genFadeFn;
            fun genZoomFn(enter: Boolean) {
                if (enter) {
                    playing.value = true;
                    emit("beforeEnter");
                    transitionEle.value?.style?.setProperty("transition-duration", "" + 10 + "ms");
                    transitionEle.value?.style?.setProperty("opacity", 0);
                    transitionEle.value?.style?.setProperty("transform", "scale(0)");
                    setTimeout(fun(){
                        emit("enter");
                        transitionEle.value?.style?.setProperty("transition-duration", "" + aniDurC.value + "ms");
                        transitionEle.value?.style?.setProperty("opacity", 1);
                        transitionEle.value?.style?.setProperty("transform", "scale(1)");
                        beforeEnd.value = true;
                    }, delay);
                } else {
                    emit("beforeLeave");
                    emit("leave");
                    transitionEle.value?.style?.setProperty("transform", "scale(0)");
                }
            }
            val zoom = ::genZoomFn;
            fun genFadeZoomFn(enter: Boolean) {
                if (enter) {
                    playing.value = true;
                    emit("beforeEnter");
                    transitionEle.value?.style?.setProperty("transition-duration", "" + 10 + "ms");
                    transitionEle.value?.style?.setProperty("opacity", 0);
                    transitionEle.value?.style?.setProperty("transform", "scale(0)");
                    setTimeout(fun(){
                        emit("enter");
                        transitionEle.value?.style?.setProperty("transition-duration", "" + aniDurC.value + "ms");
                        transitionEle.value?.style?.setProperty("opacity", 1);
                        transitionEle.value?.style?.setProperty("transform", "scale(1)");
                        beforeEnd.value = true;
                    }, delay);
                } else {
                    emit("beforeLeave");
                    emit("leave");
                    transitionEle.value?.style?.setProperty("opacity", 0);
                    transitionEle.value?.style?.setProperty("transform", "scale(0)");
                }
            }
            val fadeZoom = ::genFadeZoomFn;
            fun genFadeUpFn(enter: Boolean) {
                if (enter) {
                    playing.value = true;
                    emit("beforeEnter");
                    transitionEle.value?.style?.setProperty("transition-duration", "" + 10 + "ms");
                    transitionEle.value?.style?.setProperty("opacity", 0);
                    transitionEle.value?.style?.setProperty("transform", "translate(0, 120%)");
                    setTimeout(fun(){
                        emit("enter");
                        transitionEle.value?.style?.setProperty("transition-duration", "" + aniDurC.value + "ms");
                        transitionEle.value?.style?.setProperty("opacity", 1);
                        transitionEle.value?.style?.setProperty("transform", "translate(0, 0)");
                        beforeEnd.value = true;
                    }, delay);
                } else {
                    emit("beforeLeave");
                    emit("leave");
                    transitionEle.value?.style?.setProperty("opacity", 0);
                    transitionEle.value?.style?.setProperty("transform", "translate(0, 120%)");
                }
            }
            val fadeUp = ::genFadeUpFn;
            fun genFadeLeftFn(enter: Boolean) {
                if (enter) {
                    playing.value = true;
                    emit("beforeEnter");
                    transitionEle.value?.style?.setProperty("transition-duration", "" + 10 + "ms");
                    transitionEle.value?.style?.setProperty("opacity", 0);
                    transitionEle.value?.style?.setProperty("transform", "translate(-120%, 0)");
                    setTimeout(fun(){
                        emit("enter");
                        transitionEle.value?.style?.setProperty("transition-duration", "" + aniDurC.value + "ms");
                        transitionEle.value?.style?.setProperty("opacity", 1);
                        transitionEle.value?.style?.setProperty("transform", "translate(0, 0)");
                        beforeEnd.value = true;
                    }, delay);
                } else {
                    emit("beforeLeave");
                    emit("leave");
                    transitionEle.value?.style?.setProperty("opacity", 0);
                    transitionEle.value?.style?.setProperty("transform", "translate(-120%, 0)");
                }
            }
            val fadeLeft = ::genFadeLeftFn;
            fun genFadeRightFn(enter: Boolean) {
                if (enter) {
                    playing.value = true;
                    emit("beforeEnter");
                    transitionEle.value?.style?.setProperty("transition-duration", "" + 10 + "ms");
                    transitionEle.value?.style?.setProperty("opacity", 0);
                    transitionEle.value?.style?.setProperty("transform", "translate(120%, 0)");
                    setTimeout(fun(){
                        emit("enter");
                        transitionEle.value?.style?.setProperty("transition-duration", "" + aniDurC.value + "ms");
                        transitionEle.value?.style?.setProperty("opacity", 1);
                        transitionEle.value?.style?.setProperty("transform", "translate(0, 0)");
                        beforeEnd.value = true;
                    }, delay);
                } else {
                    emit("beforeLeave");
                    emit("leave");
                    transitionEle.value?.style?.setProperty("opacity", 0);
                    transitionEle.value?.style?.setProperty("transform", "translate(120%, 0)");
                }
            }
            val fadeRight = ::genFadeRightFn;
            fun genFadeDownFn(enter: Boolean) {
                if (enter) {
                    playing.value = true;
                    emit("beforeEnter");
                    transitionEle.value?.style?.setProperty("transition-duration", "" + 10 + "ms");
                    transitionEle.value?.style?.setProperty("opacity", 0);
                    transitionEle.value?.style?.setProperty("transform", "translate(0, -120%)");
                    setTimeout(fun(){
                        emit("enter");
                        transitionEle.value?.style?.setProperty("transition-duration", "" + aniDurC.value + "ms");
                        transitionEle.value?.style?.setProperty("opacity", 1);
                        transitionEle.value?.style?.setProperty("transform", "translate(0, 0)");
                        beforeEnd.value = true;
                    }, delay);
                } else {
                    emit("beforeLeave");
                    emit("leave");
                    transitionEle.value?.style?.setProperty("opacity", 0);
                    transitionEle.value?.style?.setProperty("transform", "translate(0, -120%)");
                }
            }
            val fadeDown = ::genFadeDownFn;
            fun genSlideUpFn(enter: Boolean) {
                if (enter) {
                    playing.value = true;
                    emit("beforeEnter");
                    transitionEle.value?.style?.setProperty("transition-duration", "" + 10 + "ms");
                    transitionEle.value?.style?.setProperty("opacity", 0);
                    transitionEle.value?.style?.setProperty("transform", "translate(0, 130%)");
                    setTimeout(fun(){
                        emit("enter");
                        transitionEle.value?.style?.setProperty("transition-duration", "" + aniDurC.value + "ms");
                        transitionEle.value?.style?.setProperty("opacity", 1);
                        transitionEle.value?.style?.setProperty("transform", "translate(0, 0)");
                        beforeEnd.value = true;
                    }, delay);
                } else {
                    emit("beforeLeave");
                    emit("leave");
                    transitionEle.value?.style?.setProperty("transform", "translate(0, 130%)");
                }
            }
            val slideUp = ::genSlideUpFn;
            fun genSlideDownFn(enter: Boolean) {
                if (enter) {
                    playing.value = true;
                    emit("beforeEnter");
                    transitionEle.value?.style?.setProperty("transition-duration", "" + 10 + "ms");
                    transitionEle.value?.style?.setProperty("opacity", 0);
                    transitionEle.value?.style?.setProperty("transform", "translate(0, -130%)");
                    setTimeout(fun(){
                        emit("enter");
                        transitionEle.value?.style?.setProperty("transition-duration", "" + aniDurC.value + "ms");
                        transitionEle.value?.style?.setProperty("opacity", 1);
                        transitionEle.value?.style?.setProperty("transform", "translate(0, 0)");
                        beforeEnd.value = true;
                    }, delay);
                } else {
                    emit("beforeLeave");
                    emit("leave");
                    transitionEle.value?.style?.setProperty("transform", "translate(0, -130%)");
                }
            }
            val slideDown = ::genSlideDownFn;
            fun genSlideLeftFn(enter: Boolean) {
                if (enter) {
                    playing.value = true;
                    emit("beforeEnter");
                    transitionEle.value?.style?.setProperty("transition-duration", "" + 10 + "ms");
                    transitionEle.value?.style?.setProperty("opacity", 0);
                    transitionEle.value?.style?.setProperty("transform", "translate(-120%, 0)");
                    setTimeout(fun(){
                        emit("enter");
                        transitionEle.value?.style?.setProperty("transition-duration", "" + aniDurC.value + "ms");
                        transitionEle.value?.style?.setProperty("opacity", 1);
                        transitionEle.value?.style?.setProperty("transform", "translate(0, 0)");
                        beforeEnd.value = true;
                    }, delay);
                } else {
                    emit("beforeLeave");
                    emit("leave");
                    transitionEle.value?.style?.setProperty("transform", "translate(-120%, 0)");
                }
            }
            val slideLeft = ::genSlideLeftFn;
            fun genSlideRightFn(enter: Boolean) {
                if (enter) {
                    playing.value = true;
                    emit("beforeEnter");
                    transitionEle.value?.style?.setProperty("transition-duration", "" + 10 + "ms");
                    transitionEle.value?.style?.setProperty("opacity", 0);
                    transitionEle.value?.style?.setProperty("transform", "translate(120%, 0)");
                    setTimeout(fun(){
                        emit("enter");
                        transitionEle.value?.style?.setProperty("transition-duration", "" + aniDurC.value + "ms");
                        transitionEle.value?.style?.setProperty("opacity", 1);
                        transitionEle.value?.style?.setProperty("transform", "translate(0, 0)");
                        beforeEnd.value = true;
                    }, delay);
                } else {
                    emit("beforeLeave");
                    emit("leave");
                    transitionEle.value?.style?.setProperty("transform", "translate(120%, 0)");
                }
            }
            val slideRight = ::genSlideRightFn;
            fun genExecFn(enter: Boolean) {
                when (props.mode) {
                    "zoom" -> 
                        zoom(enter);
                    "fade" -> 
                        fade(enter);
                    "fadeZoom" -> 
                        fadeZoom(enter);
                    "fadeUp" -> 
                        fadeUp(enter);
                    "fadeRight" -> 
                        fadeRight(enter);
                    "fadeDown" -> 
                        fadeDown(enter);
                    "fadeLeft" -> 
                        fadeLeft(enter);
                    "slideUp" -> 
                        slideUp(enter);
                    "slideRight" -> 
                        slideRight(enter);
                    "slideDown" -> 
                        slideDown(enter);
                    "slideLeft" -> 
                        slideLeft(enter);
                }
            }
            val exec = ::genExecFn;
            fun genEnterFn() {
                if (playing.value) {
                    return;
                }
                exec(true);
            }
            val enter = ::genEnterFn;
            fun genLeaveFn() {
                exec(false);
            }
            val leave = ::genLeaveFn;
            fun genOnEndFn() {
                playing.value = false;
                if (beforeEnd.value) {
                    if (props.show) {
                        emit("afterEnter");
                    } else {
                        emit("afterLeave");
                    }
                }
                emit("transitionend");
            }
            val onEnd = ::genOnEndFn;
            watch(fun(): Boolean {
                return props.show;
            }
            , fun(v: Boolean){
                if (v) {
                    display.value = true;
                    nextTick(fun(){
                        enter();
                    });
                } else {
                    nextTick(fun(){
                        leave();
                    }
                    );
                    if (!props.placed) {
                        setTimeout(fun(){
                            display.value = v;
                        }
                        , aniDurC.value);
                    }
                }
            }
            , WatchOptions(immediate = true));
            return fun(): Any? {
                return withDirectives(createElementVNode("view", utsMapOf("class" to "sn-transition", "ref_key" to "transitionEle", "ref" to transitionEle, "onTransitionend" to onEnd, "style" to normalizeStyle(utsArrayOf(
                    unref(transitionStylesC),
                    _ctx.customStyle
                ))), utsArrayOf(
                    renderSlot(_ctx.`$slots`, "default")
                ), 36), utsArrayOf(
                    utsArrayOf(
                        vShow,
                        if (_ctx.placed) {
                            true;
                        } else {
                            unref(display);
                        }
                    )
                ));
            }
            ;
        }
        ;
        var name = "sn-transition";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-transition" to padStyleMapOf(utsMapOf("transitionProperty" to "opacity,transform")), "@TRANSITION" to utsMapOf("sn-transition" to utsMapOf("property" to "opacity,transform")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf("beforeEnter" to null, "enter" to null, "afterEnter" to null, "beforeLeave" to null, "leave" to null, "afterLeave" to null, "transitionend" to null);
        var props = normalizePropsOptions(utsMapOf("show" to utsMapOf("type" to "Boolean", "default" to false), "placed" to utsMapOf("type" to "Boolean", "default" to true), "mode" to utsMapOf("type" to "String", "default" to "fade"), "aniDur" to utsMapOf("type" to "Number", "default" to parseInt(`$snui`.configs.aniTime.long)), "timingFunction" to utsMapOf("type" to "String", "default" to "ease-out"), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "show",
            "placed",
            "mode",
            "aniDur",
            "timingFunction",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
