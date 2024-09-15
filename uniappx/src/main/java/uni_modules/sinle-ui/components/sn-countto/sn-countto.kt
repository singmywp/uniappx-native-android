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
open class GenUniModulesSinleUiComponentsSnCounttoSnCountto : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var startVal: Number by `$props`;
    open var endVal: Number by `$props`;
    open var aniDur: Number by `$props`;
    open var decimals: Number by `$props`;
    open var separate: Boolean by `$props`;
    open var autoplay: Boolean by `$props`;
    open var easing: Boolean by `$props`;
    open var textSize: String by `$props`;
    open var textColor: String by `$props`;
    open var customStyle: Any by `$props`;
    open var start: () -> Unit
        get() {
            return unref(this.`$exposed`["start"]) as () -> Unit;
        }
        set(value) {
            setRefValue(this.`$exposed`, "start", value);
        }
    open var play: () -> Unit
        get() {
            return unref(this.`$exposed`["play"]) as () -> Unit;
        }
        set(value) {
            setRefValue(this.`$exposed`, "play", value);
        }
    open var stop: () -> Unit
        get() {
            return unref(this.`$exposed`["stop"]) as () -> Unit;
        }
        set(value) {
            setRefValue(this.`$exposed`, "stop", value);
        }
    open var pause: () -> Unit
        get() {
            return unref(this.`$exposed`["pause"]) as () -> Unit;
        }
        set(value) {
            setRefValue(this.`$exposed`, "pause", value);
        }
    open var reset: () -> Unit
        get() {
            return unref(this.`$exposed`["reset"]) as () -> Unit;
        }
        set(value) {
            setRefValue(this.`$exposed`, "reset", value);
        }
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnCounttoSnCountto, _arg1: SetupContext) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props, ref1): Any? {
            var __expose = ref1.expose;
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnCounttoSnCountto;
            val _cache = __ins.renderCache;
            val snu = `$snui`.utils;
            val colors = `$snui`.colors;
            fun emit(event: String, vararg do_not_transform_spread: Any?) {
                __ins.emit(event, *do_not_transform_spread);
            }
            val props = __props;
            val value = ref("");
            val steps = ref(0);
            val timer = ref(0);
            val running = ref(false);
            val decimalsC = computed(fun(): Number {
                return Math.max(0, props.decimals);
            }
            );
            val textSizeC = computed(fun(): String {
                return if (props.textSize == "") {
                    `$snui`.configs.font.baseSize;
                } else {
                    props.textSize;
                }
                ;
            }
            );
            val textColorC = computed(fun(): String {
                return if (props.textColor == "") {
                    colors.value.text;
                } else {
                    props.textColor;
                }
                ;
            }
            );
            val textC = computed(fun(): String {
                return if (props.separate) {
                    snu.text.separateNumber(value.value);
                } else {
                    value.value;
                }
                ;
            }
            );
            fun genPauseFn() {
                if (running.value) {
                    running.value = false;
                    clearInterval(timer.value);
                }
            }
            val pause = ::genPauseFn;
            fun genStopFn() {
                running.value = false;
                clearInterval(timer.value);
                steps.value = 0;
                value.value = props.endVal.toFixed(decimalsC.value);
                emit("finish");
            }
            val stop = ::genStopFn;
            fun genPlayFn() {
                running.value = true;
                var total = props.endVal - props.startVal;
                timer.value = setInterval(fun(){
                    if (running.value) {
                        var v = if (props.easing) {
                            snu.easing.easeOutSine(10 * steps.value / props.aniDur);
                        } else {
                            snu.easing.linear(10 * steps.value / props.aniDur);
                        }
                        ;
                        steps.value += 1;
                        value.value = (props.startVal + v * total + snu.random.randomNumber(decimalsC.value) * Math.pow(10, -decimalsC.value)).toFixed(decimalsC.value);
                        if (parseFloat(value.value) >= props.endVal) {
                            stop();
                        }
                    }
                }
                , 10);
            }
            val play = ::genPlayFn;
            fun genStartFn() {
                clearInterval(timer.value);
                running.value = true;
                value.value = props.startVal.toString();
                play();
            }
            val start = ::genStartFn;
            fun genInitFn() {
                steps.value = 0;
                value.value = props.startVal.toString();
                if (props.autoplay) {
                    start();
                }
            }
            val init = ::genInitFn;
            fun genResetFn() {
                clearInterval(timer.value);
                init();
            }
            val reset = ::genResetFn;
            __expose(utsMapOf("start" to start, "play" to play, "stop" to stop, "pause" to pause, "reset" to reset));
            val startValC = computed(fun(): Number {
                return props.startVal;
            }
            );
            val endValC = computed(fun(): Number {
                return props.endVal;
            }
            );
            watch(startValC, fun(){
                init();
            }
            );
            watch(endValC, fun(){
                init();
            }
            );
            onMounted(fun(){
                init();
            }
            );
            onUnmounted(fun(){
                clearInterval(timer.value);
            }
            );
            return fun(): Any? {
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                return createVNode(_component_sn_text, utsMapOf("text" to unref(textC), "color" to unref(textColorC), "size" to unref(textSizeC), "customStyle" to _ctx.customStyle), null, 8, utsArrayOf(
                    "text",
                    "color",
                    "size",
                    "customStyle"
                ));
            }
            ;
        }
        ;
        var name = "sn-countto";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf());
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf("finish" to null);
        var props = normalizePropsOptions(utsMapOf("startVal" to utsMapOf("type" to "Number", "default" to 0), "endVal" to utsMapOf("type" to "Number", "default" to 0), "aniDur" to utsMapOf("type" to "Number", "default" to 2000), "decimals" to utsMapOf("type" to "Number", "default" to 0), "separate" to utsMapOf("type" to "Boolean", "default" to false), "autoplay" to utsMapOf("type" to "Boolean", "default" to true), "easing" to utsMapOf("type" to "Boolean", "default" to false), "textSize" to utsMapOf("type" to "String", "default" to ""), "textColor" to utsMapOf("type" to "String", "default" to ""), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "startVal",
            "endVal",
            "aniDur",
            "decimals",
            "separate",
            "autoplay",
            "easing",
            "textSize",
            "textColor",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
