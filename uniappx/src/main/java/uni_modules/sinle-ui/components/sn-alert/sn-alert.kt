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
open class GenUniModulesSinleUiComponentsSnAlertSnAlert : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var text: String by `$props`;
    open var icon: String by `$props`;
    open var type: String by `$props`;
    open var effect: String by `$props`;
    open var bgColor: String by `$props`;
    open var textColor: String by `$props`;
    open var textSize: String by `$props`;
    open var iconColor: String by `$props`;
    open var iconSize: String by `$props`;
    open var customStyle: Any by `$props`;
    open var customTextStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnAlertSnAlert) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnAlertSnAlert;
            val _cache = __ins.renderCache;
            val snu = `$snui`.utils;
            val colors = `$snui`.colors;
            val props = __props;
            val showIcon = computed(fun(): Boolean {
                return !snu.text.isEmpty(props.icon);
            }
            );
            val effectC = computed<String>(fun(): String {
                var types = utsArrayOf(
                    "light",
                    "dark"
                );
                return if (types.includes(props.effect)) {
                    props.effect;
                } else {
                    "light";
                }
                ;
            }
            );
            val typeC = computed(fun(): String {
                var types = utsArrayOf(
                    "info",
                    "primary",
                    "success",
                    "error",
                    "warning"
                );
                return if (types.includes(props.type)) {
                    props.type;
                } else {
                    "info";
                }
                ;
            }
            );
            val bgColorC = computed(fun(): String {
                if (snu.text.isEmpty(props.bgColor)) {
                    if (effectC.value == "dark") {
                        return colors.value["" + typeC.value] as String;
                    } else {
                        return colors.value["" + typeC.value + "Light"] as String;
                    }
                } else {
                    return props.bgColor;
                }
            }
            );
            val textColorC = computed(fun(): String {
                if (typeC.value == "info") {
                    return colors.value.text;
                }
                if (effectC.value == "dark") {
                    return colors.value["" + typeC.value + "Text"] as String;
                } else {
                    return colors.value["" + typeC.value + "LightText"] as String;
                }
            }
            );
            val iconColorC = computed(fun(): String {
                return if (snu.text.isEmpty(props.iconColor)) {
                    textColorC.value;
                } else {
                    props.iconColor;
                }
                ;
            }
            );
            val iconSizeC = computed(fun(): String {
                return if (props.iconSize == "") {
                    `$snui`.configs.font.size(3);
                } else {
                    props.iconSize;
                }
                ;
            }
            );
            val textSizeC = computed(fun(): String {
                return if (props.textSize == "") {
                    `$snui`.configs.font.size(2);
                } else {
                    props.textSize;
                }
                ;
            }
            );
            val alertStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("background", bgColorC.value);
                styles.set("border-radius", `$snui`.configs.radius.small);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val alertTextStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("color", textColorC.value);
                styles.set("fontSize", textSizeC.value);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            return fun(): Any? {
                val _component_sn_icon = resolveEasyComponent("sn-icon", GenUniModulesSinleUiComponentsSnIconSnIconClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                return createElementVNode("view", utsMapOf("class" to "sn-alert", "style" to normalizeStyle(utsArrayOf(
                    unref(alertStylesC),
                    _ctx.customStyle
                ))), utsArrayOf(
                    renderSlot(_ctx.`$slots`, "default", UTSJSONObject(), fun(): UTSArray<Any> {
                        return utsArrayOf(
                            if (isTrue(unref(showIcon))) {
                                createVNode(_component_sn_icon, utsMapOf("key" to 0, "class" to "sn-alert-icon", "name" to _ctx.icon, "color" to unref(iconColorC), "size" to unref(iconSizeC)), null, 8, utsArrayOf(
                                    "name",
                                    "color",
                                    "size"
                                ));
                            } else {
                                createCommentVNode("v-if", true);
                            }
                            ,
                            createVNode(_component_sn_text, utsMapOf("class" to "sn-alert-text", "text" to _ctx.text, "style" to normalizeStyle(utsArrayOf(
                                unref(alertTextStylesC),
                                _ctx.customTextStyle
                            ))), null, 8, utsArrayOf(
                                "text",
                                "style"
                            ))
                        );
                    }
                    )
                ), 4);
            }
            ;
        }
        ;
        var name = "sn-alert";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-alert" to padStyleMapOf(utsMapOf("width" to "100%", "paddingTop" to 8, "paddingRight" to 10, "paddingBottom" to 8, "paddingLeft" to 10, "marginTop" to 5, "marginRight" to 0, "marginBottom" to 5, "marginLeft" to 0, "display" to "flex", "flexDirection" to "row", "flexWrap" to "nowrap", "alignItems" to "center")), "sn-alert-text" to padStyleMapOf(utsMapOf("flex" to 1)), "sn-alert-icon" to padStyleMapOf(utsMapOf("marginRight" to 5)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf("text" to utsMapOf("type" to "String", "default" to ""), "icon" to utsMapOf("type" to "String", "default" to ""), "type" to utsMapOf("type" to "String", "default" to "info"), "effect" to utsMapOf("type" to "String", "default" to "light"), "bgColor" to utsMapOf("type" to "String", "default" to ""), "textColor" to utsMapOf("type" to "String", "default" to ""), "textSize" to utsMapOf("type" to "String", "default" to ""), "iconColor" to utsMapOf("type" to "String", "default" to ""), "iconSize" to utsMapOf("type" to "String", "default" to ""), "customStyle" to utsMapOf("default" to UTSJSONObject()), "customTextStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "text",
            "icon",
            "type",
            "effect",
            "bgColor",
            "textColor",
            "textSize",
            "iconColor",
            "iconSize",
            "customStyle",
            "customTextStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
