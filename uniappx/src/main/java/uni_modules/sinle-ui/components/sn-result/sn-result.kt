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
open class GenUniModulesSinleUiComponentsSnResultSnResult : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var mode: String by `$props`;
    open var title: String by `$props`;
    open var titleSize: String by `$props`;
    open var titleColor: String by `$props`;
    open var text: String by `$props`;
    open var textSize: String by `$props`;
    open var textColor: String by `$props`;
    open var iconSize: String by `$props`;
    open var iconColor: String by `$props`;
    open var customTitleStyle: Any by `$props`;
    open var customTextStyle: Any by `$props`;
    open var customStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnResultSnResult) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnResultSnResult;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val snu = `$snui`.utils;
            val props = __props;
            val modeC = computed(fun(): String {
                return if (props.mode != null) {
                    props.mode;
                } else {
                    "info";
                }
                ;
            }
            );
            val titleSizeC = computed(fun(): String {
                return if (props.titleSize == "") {
                    `$snui`.configs.font.size(5);
                } else {
                    props.titleSize;
                }
                ;
            }
            );
            val titleColorC = computed(fun(): String {
                return if (props.titleColor == "") {
                    colors.value.text;
                } else {
                    props.titleColor;
                }
                ;
            }
            );
            val textSizeC = computed(fun(): String {
                return if (props.textSize == "") {
                    `$snui`.configs.font.size(3);
                } else {
                    props.textSize;
                }
                ;
            }
            );
            val textColorC = computed(fun(): String {
                return if (props.textColor == "") {
                    colors.value.disabledText;
                } else {
                    props.textColor;
                }
                ;
            }
            );
            val iconSizeC = computed(fun(): String {
                return if (props.iconSize == "") {
                    `$snui`.configs.font.size(8);
                } else {
                    props.iconSize;
                }
                ;
            }
            );
            val iconNameC = computed(fun(): String {
                var icons = object : UTSJSONObject() {
                    var info = "information-fill"
                    var success = "checkbox-circle-fill"
                    var warning = "error-warning-fill"
                    var error = "close-circle-fill"
                };
                return icons[modeC.value] as String;
            }
            );
            val iconColorC = computed(fun(): String {
                if (!snu.text.isEmpty(props.iconColor)) {
                    return props.iconColor;
                }
                var _colors = object : UTSJSONObject() {
                    var info = colors.value.primary
                    var success = colors.value.success
                    var warning = colors.value.warning
                    var error = colors.value.error
                };
                return _colors[modeC.value] as String;
            }
            );
            val resultStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            return fun(): Any? {
                val _component_sn_icon = resolveEasyComponent("sn-icon", GenUniModulesSinleUiComponentsSnIconSnIconClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                return createElementVNode("view", utsMapOf("class" to "sn-result", "style" to normalizeStyle(utsArrayOf(
                    unref(resultStylesC),
                    _ctx.customStyle
                ))), utsArrayOf(
                    renderSlot(_ctx.`$slots`, "icon", UTSJSONObject(), fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_icon, utsMapOf("name" to unref(iconNameC), "color" to unref(iconColorC), "size" to unref(iconSizeC)), null, 8, utsArrayOf(
                                "name",
                                "color",
                                "size"
                            ))
                        );
                    }
                    ),
                    renderSlot(_ctx.`$slots`, "title", UTSJSONObject(), fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to _ctx.title, "color" to unref(titleColorC), "size" to unref(titleSizeC), "customStyle" to _ctx.customTitleStyle, "style" to normalizeStyle(utsMapOf("margin" to "15px 0 5px 0", "font-family" to "'misans-semibold'"))), null, 8, utsArrayOf(
                                "text",
                                "color",
                                "size",
                                "customStyle",
                                "style"
                            ))
                        );
                    }
                    ),
                    renderSlot(_ctx.`$slots`, "text", UTSJSONObject(), fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to _ctx.text, "color" to unref(textColorC), "size" to unref(textSizeC), "customStyle" to _ctx.customTextStyle, "style" to normalizeStyle(utsMapOf("font-family" to "'misans-normal'"))), null, 8, utsArrayOf(
                                "text",
                                "color",
                                "size",
                                "customStyle",
                                "style"
                            ))
                        );
                    }
                    ),
                    renderSlot(_ctx.`$slots`, "action")
                ), 4);
            }
            ;
        }
        ;
        var name = "sn-result";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-result" to padStyleMapOf(utsMapOf("alignItems" to "center", "justifyContent" to "center")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf("mode" to utsMapOf("type" to "String", "default" to "info"), "title" to utsMapOf("type" to "String", "default" to ""), "titleSize" to utsMapOf("type" to "String", "default" to ""), "titleColor" to utsMapOf("type" to "String", "default" to ""), "text" to utsMapOf("type" to "String", "default" to ""), "textSize" to utsMapOf("type" to "String", "default" to ""), "textColor" to utsMapOf("type" to "String", "default" to ""), "iconSize" to utsMapOf("type" to "String", "default" to ""), "iconColor" to utsMapOf("type" to "String", "default" to ""), "customTitleStyle" to utsMapOf("default" to UTSJSONObject()), "customTextStyle" to utsMapOf("default" to UTSJSONObject()), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "mode",
            "title",
            "titleSize",
            "titleColor",
            "text",
            "textSize",
            "textColor",
            "iconSize",
            "iconColor",
            "customTitleStyle",
            "customTextStyle",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
