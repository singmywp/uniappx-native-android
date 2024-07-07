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
open class GenUniModulesSinleUiComponentsSnSwitchSnSwitch : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var modelValue: Boolean by `$props`;
    open var width: String by `$props`;
    open var height: String by `$props`;
    open var text: String by `$props`;
    open var icon: String by `$props`;
    open var iconSize: String by `$props`;
    open var padding: String by `$props`;
    open var borderRadius: String by `$props`;
    open var bgColor: String by `$props`;
    open var activeBgColor: String by `$props`;
    open var disabledBgColor: String by `$props`;
    open var disabledActiveBgColor: String by `$props`;
    open var blockColor: String by `$props`;
    open var activeBlockColor: String by `$props`;
    open var disabledBlockColor: String by `$props`;
    open var disabledActiveBlockColor: String by `$props`;
    open var blockBorderRadius: String by `$props`;
    open var textColor: String by `$props`;
    open var textSize: String by `$props`;
    open var loading: Boolean by `$props`;
    open var disabled: Boolean by `$props`;
    open var customStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnSwitchSnSwitch) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnSwitchSnSwitch;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val snu = `$snui`.utils;
            fun emit(event: String, vararg do_not_transform_spread: Any?) {
                __ins.emit(event, *do_not_transform_spread);
            }
            val props = __props;
            val blockEle = ref(null as UniElement?);
            val model = computed<Boolean>(WritableComputedOptions(get = fun(): Boolean {
                return props.modelValue;
            }
            , set = fun(value: Boolean){
                emit("update:modelValue", value);
            }
            ));
            val blockSizeC = computed(fun(): Number {
                return Math.min(snu.getPx(props.width), snu.getPx(props.height)) - snu.getPx(props.padding) * 2;
            }
            );
            val blockOffsetC = computed(fun(): Number {
                return if (model.value) {
                    snu.getPx(props.width) - blockSizeC.value - snu.getPx(props.padding) * 2;
                } else {
                    0;
                }
                ;
            }
            );
            val textOffsetC = computed(fun(): Number {
                return blockSizeC.value + snu.getPx(props.padding) * 2;
            }
            );
            val showTextC = computed(fun(): Boolean {
                return !snu.text.isEmpty(props.text);
            }
            );
            val showIconC = computed(fun(): Boolean {
                return !snu.text.isEmpty(props.icon);
            }
            );
            val iconSizeC = computed(fun(): String {
                return if (props.iconSize == "") {
                    `$snui`.configs.font.size(1);
                } else {
                    props.iconSize;
                }
                ;
            }
            );
            val borderRadiusC = computed(fun(): String {
                return if (props.borderRadius == "") {
                    `$snui`.configs.radius.circle;
                } else {
                    props.borderRadius;
                }
                ;
            }
            );
            val bgColorC = computed(fun(): String {
                return if (props.bgColor == "") {
                    colors.value.line;
                } else {
                    props.bgColor;
                }
                ;
            }
            );
            val activeBgColorC = computed(fun(): String {
                return if (props.activeBgColor == "") {
                    colors.value.primary;
                } else {
                    props.activeBgColor;
                }
                ;
            }
            );
            val disabledBgColorC = computed(fun(): String {
                return if (props.disabledBgColor == "") {
                    colors.value.disabled;
                } else {
                    props.disabledBgColor;
                }
                ;
            }
            );
            val disabledActiveBgColorC = computed(fun(): String {
                return if (props.disabledActiveBgColor == "") {
                    colors.value.disabledDark;
                } else {
                    props.disabledActiveBgColor;
                }
                ;
            }
            );
            val blockBorderRadiusC = computed(fun(): String {
                return if (props.blockBorderRadius == "") {
                    `$snui`.configs.radius.circle;
                } else {
                    props.blockBorderRadius;
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
            val switchStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("border-radius", borderRadiusC.value);
                styles.set("padding", props.padding);
                styles.set("height", props.height);
                styles.set("width", props.width);
                styles.set("background", if (props.disabled) {
                    if (model.value) {
                        disabledActiveBgColorC.value;
                    } else {
                        disabledBgColorC.value;
                    };
                } else {
                    if (model.value) {
                        activeBgColorC.value;
                    } else {
                        bgColorC.value;
                    }
                    ;
                }
                );
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val textStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("color", props.textColor);
                styles.set("fontSize", textSizeC.value);
                styles.set("left", if (!model.value) {
                    "" + textOffsetC.value + "px";
                } else {
                    "";
                }
                );
                styles.set("right", if (model.value) {
                    "" + textOffsetC.value + "px";
                } else {
                    "";
                }
                );
                return styles;
            }
            );
            val blockStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("width", "" + blockSizeC.value + "px");
                styles.set("height", "" + blockSizeC.value + "px");
                styles.set("border-radius", blockBorderRadiusC.value);
                styles.set("background", if (props.disabled) {
                    if (model.value) {
                        props.disabledActiveBlockColor;
                    } else {
                        props.disabledBlockColor;
                    };
                } else {
                    if (model.value) {
                        props.activeBlockColor;
                    } else {
                        props.blockColor;
                    }
                    ;
                }
                );
                styles.set("transform", "translateX(" + blockOffsetC.value + "px)");
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            fun genOnClickFn() {
                if (!props.disabled && !props.loading) {
                    model.value = !model.value;
                    emit("change", object : UTSJSONObject() {
                        var value = model.value
                    });
                }
            }
            val onClick = ::genOnClickFn;
            return fun(): Any? {
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_sn_loading = resolveEasyComponent("sn-loading", GenUniModulesSinleUiComponentsSnLoadingSnLoadingClass);
                val _component_sn_icon = resolveEasyComponent("sn-icon", GenUniModulesSinleUiComponentsSnIconSnIconClass);
                return createElementVNode("view", utsMapOf("class" to "sn-switch", "onClick" to onClick, "style" to normalizeStyle(unref(switchStylesC))), utsArrayOf(
                    if (isTrue(unref(showTextC))) {
                        createVNode(_component_sn_text, utsMapOf("key" to 0, "class" to "sn-switch-text", "text" to _ctx.text, "style" to normalizeStyle(unref(textStylesC))), null, 8, utsArrayOf(
                            "text",
                            "style"
                        ));
                    } else {
                        createCommentVNode("v-if", true);
                    }
                    ,
                    createElementVNode("view", utsMapOf("class" to "sn-switch-block", "ref_key" to "blockEle", "ref" to blockEle, "style" to normalizeStyle(unref(blockStylesC))), utsArrayOf(
                        if (isTrue(_ctx.loading)) {
                            createVNode(_component_sn_loading, utsMapOf("key" to 0, "class" to "sn-switch-icon", "iconSize" to ("" + unref(blockSizeC) * 0.6 + "px"), "iconColor" to if (_ctx.disabled) {
                                unref(colors).info;
                            } else {
                                if (unref(model)) {
                                    unref(activeBgColorC);
                                } else {
                                    unref(bgColorC);
                                };
                            }), null, 8, utsArrayOf(
                                "iconSize",
                                "iconColor"
                            ));
                        } else {
                            createCommentVNode("v-if", true);
                        }
                        ,
                        if (isTrue(unref(showIconC) && !_ctx.loading)) {
                            createVNode(_component_sn_icon, utsMapOf("key" to 1, "class" to "sn-switch-icon", "name" to _ctx.icon, "color" to if (_ctx.disabled) {
                                unref(colors).info;
                            } else {
                                if (unref(model)) {
                                    unref(activeBgColorC);
                                } else {
                                    unref(bgColorC);
                                };
                            }, "size" to unref(iconSizeC)), null, 8, utsArrayOf(
                                "name",
                                "color",
                                "size"
                            ));
                        } else {
                            createCommentVNode("v-if", true);
                        }
                    ), 4)
                ), 4);
            }
            ;
        }
        ;
        var name = "sn-switch";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-switch" to padStyleMapOf(utsMapOf("flexDirection" to "row")), "sn-switch-icon" to padStyleMapOf(utsMapOf("marginTop" to 0, "marginRight" to "auto", "marginBottom" to 0, "marginLeft" to "auto")), "sn-switch-block" to padStyleMapOf(utsMapOf("justifyContent" to "center")), "sn-switch-text" to padStyleMapOf(utsMapOf("position" to "absolute", "lineHeight" to 1)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf("change" to null, "update:modelValue" to null);
        var props = normalizePropsOptions(utsMapOf("modelValue" to utsMapOf("type" to "Boolean", "default" to false), "width" to utsMapOf("type" to "String", "default" to "50px"), "height" to utsMapOf("type" to "String", "default" to "25px"), "text" to utsMapOf("type" to "String", "default" to ""), "icon" to utsMapOf("type" to "String", "default" to ""), "iconSize" to utsMapOf("type" to "String", "default" to ""), "padding" to utsMapOf("type" to "String", "default" to "5px"), "borderRadius" to utsMapOf("type" to "String", "default" to ""), "bgColor" to utsMapOf("type" to "String", "default" to ""), "activeBgColor" to utsMapOf("type" to "String", "default" to ""), "disabledBgColor" to utsMapOf("type" to "String", "default" to ""), "disabledActiveBgColor" to utsMapOf("type" to "String", "default" to ""), "blockColor" to utsMapOf("type" to "String", "default" to "#fff"), "activeBlockColor" to utsMapOf("type" to "String", "default" to "#fff"), "disabledBlockColor" to utsMapOf("type" to "String", "default" to "#fff"), "disabledActiveBlockColor" to utsMapOf("type" to "String", "default" to "#fff"), "blockBorderRadius" to utsMapOf("type" to "String", "default" to ""), "textColor" to utsMapOf("type" to "String", "default" to "#fff"), "textSize" to utsMapOf("type" to "String", "default" to ""), "loading" to utsMapOf("type" to "Boolean", "default" to false), "disabled" to utsMapOf("type" to "Boolean", "default" to false), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "modelValue",
            "width",
            "height",
            "text",
            "icon",
            "iconSize",
            "padding",
            "borderRadius",
            "bgColor",
            "activeBgColor",
            "disabledBgColor",
            "disabledActiveBgColor",
            "blockColor",
            "activeBlockColor",
            "disabledBlockColor",
            "disabledActiveBlockColor",
            "blockBorderRadius",
            "textColor",
            "textSize",
            "loading",
            "disabled",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
