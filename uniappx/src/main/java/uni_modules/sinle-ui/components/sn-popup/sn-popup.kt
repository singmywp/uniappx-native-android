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
open class GenUniModulesSinleUiComponentsSnPopupSnPopup : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var position: String by `$props`;
    open var aniDur: Number by `$props`;
    open var maskClose: Boolean by `$props`;
    open var maskOpacity: Number by `$props`;
    open var customStyle: Any by `$props`;
    open var open: () -> Unit
        get() {
            return unref(this.`$exposed`["open"]) as () -> Unit;
        }
        set(value) {
            setRefValue(this.`$exposed`, "open", value);
        }
    open var close: () -> Unit
        get() {
            return unref(this.`$exposed`["close"]) as () -> Unit;
        }
        set(value) {
            setRefValue(this.`$exposed`, "close", value);
        }
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnPopupSnPopup, _arg1: SetupContext) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props, ref1): Any? {
            var __expose = ref1.expose;
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnPopupSnPopup;
            val _cache = __ins.renderCache;
            val snu = `$snui`.utils;
            fun emit(event: String, vararg do_not_transform_spread: Any?) {
                __ins.emit(event, *do_not_transform_spread);
            }
            val props = __props;
            val isOpen = ref(false);
            val showPop = ref(false);
            val positionC = computed(fun(): String {
                var positions = utsArrayOf(
                    "center",
                    "top",
                    "bottom"
                );
                return if (positions.includes(props.position)) {
                    props.position;
                } else {
                    "center";
                }
                ;
            }
            );
            val aniDurOriginC = computed(fun(): Number {
                return if (props.aniDur == parseInt(`$snui`.configs.aniTime.long)) {
                    parseInt(`$snui`.configs.aniTime.long);
                } else {
                    props.aniDur;
                }
                ;
            }
            );
            val aniDurC = computed(fun(): Number {
                return if (aniDurOriginC.value > 100) {
                    aniDurOriginC.value - 100;
                } else {
                    aniDurOriginC.value;
                }
                ;
            }
            );
            val overlayStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("justifyContent", if (positionC.value == "center") {
                    "center";
                } else {
                    if (positionC.value == "top") {
                        "flex-start";
                    } else {
                        "flex-end";
                    }
                    ;
                }
                );
                return styles;
            }
            );
            val popupStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("transition-duration", "" + aniDurOriginC.value + "ms");
                styles.set("zIndex", `$snui`.configs.zIndex.popup);
                return styles;
            }
            );
            val popupClassesC = computed(fun(): Map<String, Any> {
                var classes = Map<String, Any>();
                classes.set("animation", aniDurOriginC.value > 0);
                classes.set("focus", showPop.value);
                classes.set(positionC.value, true);
                return classes;
            }
            );
            fun genOpenFn() {
                isOpen.value = true;
                emit("open");
            }
            val open = ::genOpenFn;
            fun genCloseFn() {
                isOpen.value = false;
                emit("close");
            }
            val close = ::genCloseFn;
            fun genClickMaskFn() {
                if (props.maskClose == true) {
                    emit("clickMask");
                    close();
                }
            }
            val clickMask = ::genClickMaskFn;
            watch(isOpen, fun(v: Boolean){
                if (v) {
                    setTimeout(fun(){
                        showPop.value = v;
                    }, 10);
                } else {
                    showPop.value = v;
                }
            }
            );
            __expose(utsMapOf("open" to open, "close" to close));
            return fun(): Any? {
                val _component_sn_overlay = resolveEasyComponent("sn-overlay", GenUniModulesSinleUiComponentsSnOverlaySnOverlayClass);
                return createVNode(_component_sn_overlay, utsMapOf("aniDur" to unref(aniDurC), "opacity" to _ctx.maskOpacity, "show" to unref(isOpen), "onClick" to clickMask, "style" to normalizeStyle(unref(overlayStylesC))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to normalizeClass(utsArrayOf(
                            "sn-popup",
                            unref(popupClassesC)
                        )), "onClick" to withModifiers(fun(){}, utsArrayOf(
                            "stop"
                        )), "style" to normalizeStyle(utsArrayOf(
                            unref(popupStylesC),
                            _ctx.customStyle
                        ))), utsArrayOf(
                            renderSlot(_ctx.`$slots`, "default")
                        ), 14, utsArrayOf(
                            "onClick"
                        ))
                    );
                }
                ), "_" to 3), 8, utsArrayOf(
                    "aniDur",
                    "opacity",
                    "show",
                    "style"
                ));
            }
            ;
        }
        ;
        var name = "sn-popup";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-popup" to utsMapOf("" to utsMapOf("width" to "100%"), ".animation.center" to utsMapOf("transform" to "scale(0.5) translate(0px)", "opacity" to 0), ".animation.center.focus" to utsMapOf("transform" to "scale(1) translate(0px)", "opacity" to 1), ".animation.bottom" to utsMapOf("transform" to "translateY(100%) scale(0.5)"), ".animation.bottom.focus" to utsMapOf("transform" to "translateY(-10%) scale(1)"), ".animation.top" to utsMapOf("transform" to "translateY(-100%) scale(0.5)"), ".animation.top.focus" to utsMapOf("transform" to "translateY(20%) scale(1)")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf("open" to null, "close" to null, "clickMask" to null);
        var props = normalizePropsOptions(utsMapOf("position" to utsMapOf("type" to "String", "default" to "center"), "aniDur" to utsMapOf("type" to "Number", "default" to parseInt(`$snui`.configs.aniTime.long)), "maskClose" to utsMapOf("type" to "Boolean", "default" to true), "maskOpacity" to utsMapOf("type" to "Number", "default" to 0.3), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "position",
            "aniDur",
            "maskClose",
            "maskOpacity",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
