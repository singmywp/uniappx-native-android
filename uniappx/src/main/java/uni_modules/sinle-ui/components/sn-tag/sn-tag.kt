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
open class GenUniModulesSinleUiComponentsSnTagSnTag : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var text: String by `$props`;
    open var align: String by `$props`;
    open var type: String by `$props`;
    open var level: String by `$props`;
    open var bgColor: String by `$props`;
    open var disabledBgColor: String by `$props`;
    open var textColor: String by `$props`;
    open var disabledTextColor: String by `$props`;
    open var textSize: String by `$props`;
    open var disabled: Boolean by `$props`;
    open var loading: Boolean by `$props`;
    open var closable: Boolean by `$props`;
    open var iconSize: String by `$props`;
    open var iconColor: String by `$props`;
    open var disabledIconColor: String by `$props`;
    open var customTextStyle: Any by `$props`;
    open var customStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnTagSnTag) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnTagSnTag;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val snu = `$snui`.utils;
            val props = __props;
            val tagEle = ref(null as UniElement?);
            val showTag = ref(true);
            val levelC = computed(fun(): String {
                var levels = utsArrayOf(
                    "first",
                    "second",
                    "third",
                    "least"
                );
                return if (levels.includes(props.level)) {
                    props.level;
                } else {
                    "first";
                }
                ;
            }
            );
            val typeC = computed(fun(): String {
                var types = utsArrayOf(
                    "info",
                    "warning",
                    "error",
                    "success",
                    "primary"
                );
                return if (types.includes(props.type)) {
                    props.type;
                } else {
                    "info";
                }
                ;
            }
            );
            val borderC = computed(fun(): String {
                return if (levelC.value == "least") {
                    "1px solid " + colors.value["line"] as String;
                } else {
                    "";
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
            val iconSizeC = computed(fun(): String {
                return if (props.iconSize == "") {
                    `$snui`.configs.font.size(3);
                } else {
                    props.iconSize;
                }
                ;
            }
            );
            val bgColorC = computed(fun(): String {
                if (!props.disabled) {
                    if (snu.text.isEmpty(props.bgColor)) {
                        when (levelC.value) {
                            "first" -> 
                                {
                                    return colors.value["" + typeC.value] as String;
                                    return colors.value["" + typeC.value] as String;
                                }
                            "second" -> 
                                {
                                    return colors.value["" + typeC.value + "Light"] as String;
                                    return colors.value["" + typeC.value] as String;
                                }
                            "third" -> 
                                {
                                    return colors.value["info"] as String;
                                    return colors.value["" + typeC.value] as String;
                                }
                            "least" -> 
                                {
                                    return "transparent";
                                    return colors.value["" + typeC.value] as String;
                                }
                            else -> 
                                return colors.value["" + typeC.value] as String;
                        }
                    } else {
                        return props.bgColor;
                    }
                } else {
                    return if (snu.text.isEmpty(props.disabledBgColor)) {
                        colors.value["disabled"] as String;
                    } else {
                        props.disabledBgColor;
                    }
                    ;
                }
            }
            );
            val closeButtonActiveBgColorC = computed(fun(): String {
                var theme = `$snui`.configs.app.theme;
                var color = if ((theme == "light" || typeC.value != "info")) {
                    0;
                } else {
                    255;
                }
                ;
                return "rgba(" + color + "," + color + "," + color + "," + (if (color == 0) {
                    0.05;
                } else {
                    0.2;
                }
                ) + ")";
            }
            );
            val textColorC = computed(fun(): String {
                if (!props.disabled) {
                    if (snu.text.isEmpty(props.textColor)) {
                        if (levelC.value == "first" || typeC.value == "info") {
                            return colors.value["" + typeC.value + "Text"] as String;
                        } else {
                            return colors.value["" + typeC.value] as String;
                        }
                    } else {
                        return props.textColor;
                    }
                } else {
                    return if (snu.text.isEmpty(props.disabledTextColor)) {
                        colors.value["disabled-text"] as String;
                    } else {
                        props.disabledTextColor;
                    }
                    ;
                }
            }
            );
            val iconColorC = computed(fun(): String {
                if (!props.disabled) {
                    return if (snu.text.isEmpty(props.iconColor)) {
                        textColorC.value;
                    } else {
                        props.iconColor;
                    };
                } else {
                    return if (snu.text.isEmpty(props.disabledIconColor)) {
                        textColorC.value;
                    } else {
                        props.disabledIconColor;
                    }
                    ;
                }
            }
            );
            val closeBtnSizeC = computed(fun(): String {
                return (snu.getPx(iconSizeC.value) + 4).toString() + "px";
            }
            );
            val tagStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("background", bgColorC.value);
                styles.set("border-radius", `$snui`.configs.radius.small);
                styles.set("border", borderC.value);
                styles.set("justifyContent", if (props.align == "center") {
                    "center";
                } else {
                    if (props.align == "right") {
                        "flex-end";
                    } else {
                        "flex-start";
                    }
                    ;
                }
                );
                styles.set("padding", "5px 8px");
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val loadingC = computed(fun(): Boolean {
                return props.loading;
            }
            );
            watch(loadingC, fun(nv: Boolean){
                if (tagEle.value != null) {
                    var ele = tagEle.value as UniElement;
                    var width = ele.getBoundingClientRect().width;
                    var size = parseInt(textSizeC.value);
                    ele.style.setProperty("width", (width as Number) + (if (nv) {
                        size;
                    } else {
                        -size;
                    }
                    ));
                }
            }
            );
            return fun(): Any? {
                val _component_sn_loading = resolveEasyComponent("sn-loading", GenUniModulesSinleUiComponentsSnLoadingSnLoadingClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_sn_icon = resolveEasyComponent("sn-icon", GenUniModulesSinleUiComponentsSnIconSnIconClass);
                val _component_sn_button = resolveEasyComponent("sn-button", GenUniModulesSinleUiComponentsSnButtonSnButtonClass);
                return if (isTrue(unref(showTag))) {
                    createElementVNode("view", utsMapOf("key" to 0, "class" to "sn-tag", "ref_key" to "tagEle", "ref" to tagEle, "style" to normalizeStyle(utsArrayOf(
                        unref(tagStylesC),
                        _ctx.customStyle
                    ))), utsArrayOf(
                        if (isTrue(unref(loadingC))) {
                            createVNode(_component_sn_loading, utsMapOf("key" to 0, "class" to "sn-tag-loading-noround", "color" to unref(iconColorC)), null, 8, utsArrayOf(
                                "color"
                            ));
                        } else {
                            createCommentVNode("v-if", true);
                        },
                        renderSlot(_ctx.`$slots`, "default", UTSJSONObject(), fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("class" to "sn-tag-text", "text" to _ctx.text, "color" to unref(textColorC), "size" to unref(textSizeC), "style" to normalizeStyle(utsArrayOf(
                                    utsMapOf("transitionDuration" to unref(`$snui`).configs.aniTime.normal),
                                    _ctx.customTextStyle
                                ))), null, 8, utsArrayOf(
                                    "text",
                                    "color",
                                    "size",
                                    "style"
                                ))
                            );
                        }),
                        if (isTrue(_ctx.closable)) {
                            createVNode(_component_sn_button, utsMapOf("key" to 1, "class" to "sn-tag-close", "level" to "least", "bgColor" to unref(colors).transparent, "activeBgColor" to unref(closeButtonActiveBgColorC), "round" to "", "roundSize" to unref(closeBtnSizeC), "onClick" to fun(){
                                showTag.value = false;
                            }), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    createVNode(_component_sn_icon, utsMapOf("name" to "close-fill", "color" to unref(iconColorC), "size" to unref(iconSizeC)), null, 8, utsArrayOf(
                                        "color",
                                        "size"
                                    ))
                                );
                            }), "_" to 1), 8, utsArrayOf(
                                "bgColor",
                                "activeBgColor",
                                "roundSize",
                                "onClick"
                            ));
                        } else {
                            createCommentVNode("v-if", true);
                        }
                    ), 4);
                } else {
                    createCommentVNode("v-if", true);
                }
                ;
            }
            ;
        }
        ;
        var name = "sn-tag";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-tag" to padStyleMapOf(utsMapOf("display" to "flex", "flexDirection" to "row", "justifyContent" to "center", "alignItems" to "center")), "sn-tag__closed" to padStyleMapOf(utsMapOf("transform" to "scale(0.0001)")), "sn-tag-close" to padStyleMapOf(utsMapOf("marginLeft" to 10)), "sn-tag-text" to padStyleMapOf(utsMapOf("lines" to 1, "textOverflow" to "ellipsis", "backgroundColor" to "rgba(0,0,0,0)")), "sn-tag-loading-noround" to padStyleMapOf(utsMapOf("marginRight" to 5)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf("text" to utsMapOf("type" to "String", "default" to ""), "align" to utsMapOf("type" to "String", "default" to "center"), "type" to utsMapOf("type" to "String", "default" to "info"), "level" to utsMapOf("type" to "String", "default" to "first"), "bgColor" to utsMapOf("type" to "String", "default" to ""), "disabledBgColor" to utsMapOf("type" to "String", "default" to ""), "textColor" to utsMapOf("type" to "String", "default" to ""), "disabledTextColor" to utsMapOf("type" to "String", "default" to ""), "textSize" to utsMapOf("type" to "String", "default" to ""), "disabled" to utsMapOf("type" to "Boolean", "default" to false), "loading" to utsMapOf("type" to "Boolean", "default" to false), "closable" to utsMapOf("type" to "Boolean", "default" to false), "iconSize" to utsMapOf("type" to "String", "default" to ""), "iconColor" to utsMapOf("type" to "String", "default" to ""), "disabledIconColor" to utsMapOf("type" to "String", "default" to ""), "customTextStyle" to utsMapOf("default" to UTSJSONObject()), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "text",
            "align",
            "type",
            "level",
            "bgColor",
            "disabledBgColor",
            "textColor",
            "disabledTextColor",
            "textSize",
            "disabled",
            "loading",
            "closable",
            "iconSize",
            "iconColor",
            "disabledIconColor",
            "customTextStyle",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
