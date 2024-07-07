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
open class GenUniModulesSinleUiComponentsSnButtonSnButton : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var loading: Boolean by `$props`;
    open var disabled: Boolean by `$props`;
    open var text: String by `$props`;
    open var align: String by `$props`;
    open var type: String by `$props`;
    open var level: String by `$props`;
    open var padding: String by `$props`;
    open var borderRadius: String by `$props`;
    open var textColor: String by `$props`;
    open var disabledTextColor: String by `$props`;
    open var bgColor: String by `$props`;
    open var activeBgColor: String by `$props`;
    open var disabledBgColor: String by `$props`;
    open var long: Boolean by `$props`;
    open var round: Boolean by `$props`;
    open var roundSize: String by `$props`;
    open var textFont: String by `$props`;
    open var textSize: String by `$props`;
    open var dashed: Boolean by `$props`;
    open var customStyle: Any by `$props`;
    open var customTextStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnButtonSnButton) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnButtonSnButton;
            val _cache = __ins.renderCache;
            val snu = `$snui`.utils;
            val colors = `$snui`.colors;
            fun emit(event: String, vararg do_not_transform_spread: Any?) {
                __ins.emit(event, *do_not_transform_spread);
            }
            val props = __props;
            val buttonEle = ref(null as UniElement?);
            val isHover = ref(false);
            val borderRadiusC = computed(fun(): String {
                return if (props.borderRadius == "") {
                    `$snui`.configs.radius.normal;
                } else {
                    props.borderRadius;
                }
                ;
            }
            );
            val textFontC = computed(fun(): String {
                return if (props.textFont == "") {
                    `$snui`.configs.font.mainFamily;
                } else {
                    props.textFont;
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
            val loadingC = computed(fun(): Boolean {
                return props.loading;
            }
            );
            val levelC = computed(fun(): String {
                var types = utsArrayOf(
                    "first",
                    "second",
                    "third",
                    "least"
                );
                return if (types.includes(props.level)) {
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
            val bgColorC = computed(fun(): String {
                var activeBgColor = props.activeBgColor;
                var showActiveBgColor = !snu.text.isEmpty(activeBgColor);
                if (!props.disabled) {
                    if (snu.text.isEmpty(props.bgColor)) {
                        if (props.dashed) {
                            return if (isHover.value) {
                                if (showActiveBgColor) {
                                    activeBgColor;
                                } else {
                                    colors.value.info;
                                };
                            } else {
                                colors.value.transparent;
                            }
                            ;
                        }
                        if (typeC.value == "info" && levelC.value != "least") {
                            return if (isHover.value) {
                                if (showActiveBgColor) {
                                    activeBgColor;
                                } else {
                                    colors.value.infoActive;
                                };
                            } else {
                                colors.value.info;
                            }
                            ;
                        }
                        when (levelC.value) {
                            "first" -> 
                                {
                                    return if (isHover.value) {
                                        if (showActiveBgColor) {
                                            activeBgColor;
                                        } else {
                                            colors.value["" + typeC.value + "Active"] as String;
                                        };
                                    } else {
                                        colors.value["" + typeC.value] as String;
                                    };
                                    return if (isHover.value) {
                                        if (showActiveBgColor) {
                                            activeBgColor;
                                        } else {
                                            colors.value["" + typeC.value + "Active"] as String;
                                        };
                                    } else {
                                        colors.value["" + typeC.value] as String;
                                    };
                                }
                            "second" -> 
                                {
                                    return if (isHover.value) {
                                        if (showActiveBgColor) {
                                            activeBgColor;
                                        } else {
                                            colors.value["" + typeC.value + "LightActive"] as String;
                                        };
                                    } else {
                                        colors.value["" + typeC.value + "Light"] as String;
                                    };
                                    return if (isHover.value) {
                                        if (showActiveBgColor) {
                                            activeBgColor;
                                        } else {
                                            colors.value["" + typeC.value + "Active"] as String;
                                        };
                                    } else {
                                        colors.value["" + typeC.value] as String;
                                    };
                                }
                            "third" -> 
                                {
                                    return if (isHover.value) {
                                        if (showActiveBgColor) {
                                            activeBgColor;
                                        } else {
                                            colors.value.infoActive;
                                        };
                                    } else {
                                        colors.value.info;
                                    };
                                    return if (isHover.value) {
                                        if (showActiveBgColor) {
                                            activeBgColor;
                                        } else {
                                            colors.value["" + typeC.value + "Active"] as String;
                                        };
                                    } else {
                                        colors.value["" + typeC.value] as String;
                                    };
                                }
                            "least" -> 
                                {
                                    return if (isHover.value) {
                                        if (showActiveBgColor) {
                                            activeBgColor;
                                        } else {
                                            colors.value.info;
                                        };
                                    } else {
                                        colors.value.transparent;
                                    };
                                    return if (isHover.value) {
                                        if (showActiveBgColor) {
                                            activeBgColor;
                                        } else {
                                            colors.value["" + typeC.value + "Active"] as String;
                                        };
                                    } else {
                                        colors.value["" + typeC.value] as String;
                                    };
                                }
                            else -> 
                                return if (isHover.value) {
                                    if (showActiveBgColor) {
                                        activeBgColor;
                                    } else {
                                        colors.value["" + typeC.value + "Active"] as String;
                                    };
                                } else {
                                    colors.value["" + typeC.value] as String;
                                };
                        }
                    } else {
                        return if (isHover.value) {
                            if (showActiveBgColor) {
                                activeBgColor;
                            } else {
                                colors.value.infoActive;
                            };
                        } else {
                            props.bgColor;
                        };
                    }
                } else {
                    return if (snu.text.isEmpty(props.disabledBgColor)) {
                        colors.value.disabled;
                    } else {
                        props.disabledBgColor;
                    }
                    ;
                }
            }
            );
            val textColorC = computed(fun(): String {
                if (!props.disabled) {
                    if (snu.text.isEmpty(props.textColor)) {
                        if (typeC.value == "info") {
                            return colors.value.infoText;
                        }
                        if (props.dashed) {
                            return if (colors.value["" + typeC.value] != null) {
                                colors.value["" + typeC.value] as String;
                            } else {
                                props.textColor;
                            }
                            ;
                        }
                        return if ((levelC.value == "first")) {
                            colors.value["" + typeC.value + "Text"] as String;
                        } else {
                            colors.value["" + typeC.value + "LightText"] as String;
                        };
                    } else {
                        return props.textColor;
                    }
                } else {
                    return if (snu.text.isEmpty(props.disabledTextColor)) {
                        colors.value.disabledText;
                    } else {
                        props.disabledTextColor;
                    }
                    ;
                }
            }
            );
            val alignC = computed(fun(): String {
                var align = props.align;
                if (align == "left" || align == "start") {
                    return "flex-start";
                } else if (align == "right" || align == "end") {
                    return "flex-end";
                } else if (align == "around" || align == "between") {
                    return "space-" + align;
                }
                return align;
            }
            );
            val buttonStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                var size = if (props.round) {
                    props.roundSize;
                } else {
                    "";
                }
                ;
                styles.set("height", size);
                styles.set("width", size);
                styles.set("background", bgColorC.value);
                styles.set("border", if (props.dashed) {
                    "1px dashed " + textColorC.value;
                } else {
                    "";
                }
                );
                styles.set("border-radius", if (props.round) {
                    `$snui`.configs.radius.circle;
                } else {
                    borderRadiusC.value;
                }
                );
                styles.set("justifyContent", alignC.value);
                styles.set("padding", if (props.round) {
                    0;
                } else {
                    props.padding;
                }
                );
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            fun genOnClickFn(event: UniPointerEvent) {
                if (!props.disabled) {
                    emit("click", event);
                }
            }
            val onClick = ::genOnClickFn;
            watch(loadingC, fun(nv: Boolean){
                if (buttonEle.value != null && !props.round) {
                    var ele = buttonEle.value as UniElement;
                    var width = ele.getBoundingClientRect().width;
                    var size = snu.getPx(props.textSize);
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
                return createElementVNode("view", utsMapOf("class" to normalizeClass(utsArrayOf(
                    "sn-button",
                    utsMapOf("sn-button-long" to _ctx.long)
                )), "ref_key" to "buttonEle", "ref" to buttonEle, "onClick" to onClick, "onTouchstart" to fun(){
                    isHover.value = true;
                }
                , "onTouchend" to fun(){
                    isHover.value = false;
                }
                , "onTouchcancel" to fun(){
                    isHover.value = false;
                }
                , "style" to normalizeStyle(utsArrayOf(
                    unref(buttonStylesC),
                    _ctx.customStyle
                ))), utsArrayOf(
                    if (isTrue(_ctx.loading)) {
                        createVNode(_component_sn_loading, utsMapOf("key" to 0, "class" to normalizeClass(if (!_ctx.round) {
                            "sn-button-loading-noround";
                        } else {
                            "";
                        }), "iconColor" to unref(textColorC), "iconSize" to unref(textSizeC)), null, 8, utsArrayOf(
                            "class",
                            "iconColor",
                            "iconSize"
                        ));
                    } else {
                        createCommentVNode("v-if", true);
                    }
                    ,
                    if (_ctx.`$slots`["default"] != null) {
                        createElementVNode("view", utsMapOf("key" to 1), utsArrayOf(
                            if (isTrue(!(_ctx.round && _ctx.loading))) {
                                renderSlot(_ctx.`$slots`, "default", utsMapOf("key" to 0), fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("class" to "sn-button-text", "text" to _ctx.text, "color" to unref(textColorC), "size" to unref(textSizeC), "font" to unref(textFontC), "style" to normalizeStyle(utsArrayOf(
                                            _ctx.customTextStyle
                                        ))), null, 8, utsArrayOf(
                                            "text",
                                            "color",
                                            "size",
                                            "font",
                                            "style"
                                        ))
                                    );
                                });
                            } else {
                                createCommentVNode("v-if", true);
                            }
                        ));
                    } else {
                        if (isTrue(!(_ctx.round && _ctx.loading))) {
                            renderSlot(_ctx.`$slots`, "default", utsMapOf("key" to 2), fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    createVNode(_component_sn_text, utsMapOf("class" to "sn-button-text", "text" to _ctx.text, "color" to unref(textColorC), "size" to unref(textSizeC), "font" to unref(textFontC), "style" to normalizeStyle(utsArrayOf(
                                        _ctx.customTextStyle
                                    ))), null, 8, utsArrayOf(
                                        "text",
                                        "color",
                                        "size",
                                        "font",
                                        "style"
                                    ))
                                );
                            });
                        } else {
                            createCommentVNode("v-if", true);
                        }
                        ;
                    }
                ), 46, utsArrayOf(
                    "onTouchstart",
                    "onTouchend",
                    "onTouchcancel"
                ));
            }
            ;
        }
        ;
        var name = "sn-button";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-button-long" to padStyleMapOf(utsMapOf("flex" to 1, "!width" to "100%")), "sn-button" to padStyleMapOf(utsMapOf("display" to "flex", "flexDirection" to "row", "justifyContent" to "center", "alignItems" to "center", "transform" to "scale(1)", "transitionProperty" to "width,backgroundColor,height,margin")), "sn-button-text" to padStyleMapOf(utsMapOf("lines" to 1, "textOverflow" to "ellipsis", "backgroundColor" to "rgba(0,0,0,0)")), "sn-button-loading-noround" to padStyleMapOf(utsMapOf("marginRight" to 5)), "@TRANSITION" to utsMapOf("sn-button" to utsMapOf("property" to "width,backgroundColor,height,margin")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf("click" to null);
        var props = normalizePropsOptions(utsMapOf("loading" to utsMapOf("type" to "Boolean", "default" to false), "disabled" to utsMapOf("type" to "Boolean", "default" to false), "text" to utsMapOf("type" to "String", "default" to ""), "align" to utsMapOf("type" to "String", "default" to "center"), "type" to utsMapOf("type" to "String", "default" to "info"), "level" to utsMapOf("type" to "String", "default" to "first"), "padding" to utsMapOf("type" to "String", "default" to "12px 12px"), "borderRadius" to utsMapOf("type" to "String", "default" to ""), "textColor" to utsMapOf("type" to "String", "default" to ""), "disabledTextColor" to utsMapOf("type" to "String", "default" to ""), "bgColor" to utsMapOf("type" to "String", "default" to ""), "activeBgColor" to utsMapOf("type" to "String", "default" to ""), "disabledBgColor" to utsMapOf("type" to "String", "default" to ""), "long" to utsMapOf("type" to "Boolean", "default" to false), "round" to utsMapOf("type" to "Boolean", "default" to false), "roundSize" to utsMapOf("type" to "String", "default" to "45px"), "textFont" to utsMapOf("type" to "String", "default" to ""), "textSize" to utsMapOf("type" to "String", "default" to ""), "dashed" to utsMapOf("type" to "Boolean", "default" to false), "customStyle" to utsMapOf("default" to UTSJSONObject()), "customTextStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "loading",
            "disabled",
            "text",
            "align",
            "type",
            "level",
            "padding",
            "borderRadius",
            "textColor",
            "disabledTextColor",
            "bgColor",
            "activeBgColor",
            "disabledBgColor",
            "long",
            "round",
            "roundSize",
            "textFont",
            "textSize",
            "dashed",
            "customStyle",
            "customTextStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
