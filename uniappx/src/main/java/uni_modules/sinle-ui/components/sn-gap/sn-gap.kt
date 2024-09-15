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
import io.dcloud.uniapp.extapi.getWindowInfo as uni_getWindowInfo;
open class GenUniModulesSinleUiComponentsSnGapSnGap : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var height: String by `$props`;
    open var mode: String by `$props`;
    open var bgColor: String by `$props`;
    open var customStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnGapSnGap) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnGapSnGap;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val props = __props;
            val windowInfo = uni_getWindowInfo();
            val modeC = computed(fun(): String {
                var modes = utsArrayOf(
                    "custom",
                    "statusbar",
                    "safearea"
                );
                return if (modes.includes(props.mode)) {
                    props.mode;
                } else {
                    "custom";
                }
                ;
            }
            );
            val heightC = computed(fun(): String {
                when (modeC.value) {
                    "custom" -> 
                        {
                            return if (props.height == "") {
                                "20px";
                            } else {
                                props.height;
                            }
                            ;
                            return if (props.height == "") {
                                "20px";
                            } else {
                                props.height;
                            }
                            ;
                        }
                    "statusbar" -> 
                        {
                            return "" + windowInfo.statusBarHeight + "px";
                            return if (props.height == "") {
                                "20px";
                            } else {
                                props.height;
                            }
                            ;
                        }
                    "safearea" -> 
                        {
                            return "" + (windowInfo.windowHeight - windowInfo.safeArea.height) + "px";
                            return if (props.height == "") {
                                "20px";
                            } else {
                                props.height;
                            }
                            ;
                        }
                    else -> 
                        return if (props.height == "") {
                            "20px";
                        } else {
                            props.height;
                        }
                        ;
                }
            }
            );
            val bgColorC = computed(fun(): String {
                return if (props.bgColor == "") {
                    colors.value.transparent;
                } else {
                    props.bgColor;
                }
                ;
            }
            );
            val gapStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("height", heightC.value);
                styles.set("background", bgColorC.value);
                styles.set("border-radius", `$snui`.configs.radius.normal);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            return fun(): Any? {
                return createElementVNode("view", utsMapOf("class" to "sn-gap", "style" to normalizeStyle(utsArrayOf(
                    unref(gapStylesC),
                    _ctx.customStyle
                ))), null, 4);
            }
            ;
        }
        ;
        var name = "sn-gap";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-gap" to padStyleMapOf(utsMapOf("width" to "100%")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf("height" to utsMapOf("type" to "String", "default" to ""), "mode" to utsMapOf("type" to "String", "default" to "custom"), "bgColor" to utsMapOf("type" to "String", "default" to ""), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "height",
            "mode",
            "bgColor",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
