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
open class GenUniModulesSinleUiComponentsSnTimerSnTimer : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var format: String by `$props`;
    open var autoplay: Boolean by `$props`;
    open var millisecond: Boolean by `$props`;
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
        var setup: (__props: GenUniModulesSinleUiComponentsSnTimerSnTimer, _arg1: SetupContext) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props, ref1): Any? {
            var __expose = ref1.expose;
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnTimerSnTimer;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            fun emit(event: String, vararg do_not_transform_spread: Any?) {
                __ins.emit(event, *do_not_transform_spread);
            }
            val props = __props;
            val value = ref(0);
            val timer = ref(0);
            val running = ref(false);
            fun genClearCacheFn() {
                clearInterval(timer.value);
                timer.value = 0;
            }
            val clearCache = ::genClearCacheFn;
            fun genParseTimeDataFn(time: Number): SnTimerTime {
                val S: Number = 1000;
                val M = 60 * S;
                val H = 60 * M;
                val D = 24 * H;
                val d = Math.floor(time / D);
                val h = Math.floor((time % D) / H);
                val m = Math.floor((time % H) / M);
                val s = Math.floor((time % M) / S);
                val ms = Math.floor(time % S);
                return SnTimerTime(d = d, h = h, m = m, s = s, ms = ms);
            }
            val parseTimeData = ::genParseTimeDataFn;
            fun genParseFormatFn(reassignedFormat: String, timeData: SnTimerTime): String {
                var format = reassignedFormat;
                var d = timeData.d;
                var h = timeData.h;
                var m = timeData.m;
                var s = timeData.s;
                var ms = timeData.ms;
                if (format.indexOf("DD") == -1) {
                    h += d!! * 24;
                } else {
                    format = format.replace("DD", ("" + d).padStart(2, "0"));
                }
                if (format.indexOf("HH") == -1) {
                    m += h!! * 60;
                } else {
                    format = format.replace("HH", ("" + h).padStart(2, "0"));
                }
                if (format.indexOf("mm") == -1) {
                    s += m!! * 60;
                } else {
                    format = format.replace("mm", ("" + m).padStart(2, "0"));
                }
                if (format.indexOf("ss") == -1) {
                    ms += s!! * 1000;
                } else {
                    format = format.replace("ss", ("" + s).padStart(2, "0"));
                }
                return format.replace("SSS", ("" + ms).padStart(3, "0")).replace("SS", ("" + Math.trunc(ms / 10)).padStart(2, "0")).replace("S", "" + Math.trunc(ms / 100));
            }
            val parseFormat = ::genParseFormatFn;
            fun genPauseFn() {
                running.value = false;
                clearCache();
            }
            val pause = ::genPauseFn;
            fun genTickFn(t: Number) {
                clearCache();
                timer.value = setInterval(fun(){
                    if (running.value) {
                        value.value += t;
                        emit("change", parseTimeData(value.value));
                    }
                }
                , t);
            }
            val tick = ::genTickFn;
            fun genStartFn() {
                if (running.value) {
                    return;
                }
                running.value = true;
                tick(if (props.millisecond) {
                    10;
                } else {
                    1000;
                }
                );
            }
            val start = ::genStartFn;
            fun genResetFn() {
                pause();
                value.value = 0;
                if (props.autoplay) {
                    start();
                }
            }
            val reset = ::genResetFn;
            fun genInitFn() {
                reset();
            }
            val init = ::genInitFn;
            __expose(utsMapOf("start" to start, "pause" to pause, "reset" to reset));
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
                return parseFormat(props.format, parseTimeData(value.value));
            }
            );
            onMounted(fun(){
                init();
            }
            );
            onUnmounted(fun(){
                clearCache();
            }
            );
            return fun(): Any? {
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                return renderSlot(_ctx.`$slots`, "default", UTSJSONObject(), fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_text, utsMapOf("text" to unref(textC), "color" to unref(textColorC), "size" to unref(textSizeC), "customStyle" to _ctx.customStyle), null, 8, utsArrayOf(
                            "text",
                            "color",
                            "size",
                            "customStyle"
                        ))
                    );
                }
                );
            }
            ;
        }
        ;
        var name = "sn-timer";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf());
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf("change" to null);
        var props = normalizePropsOptions(utsMapOf("format" to utsMapOf("type" to "String", "default" to "HH:mm:ss"), "autoplay" to utsMapOf("type" to "Boolean", "default" to true), "millisecond" to utsMapOf("type" to "Boolean", "default" to false), "textSize" to utsMapOf("type" to "String", "default" to ""), "textColor" to utsMapOf("type" to "String", "default" to ""), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "format",
            "autoplay",
            "millisecond",
            "textSize",
            "textColor",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
