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
import io.dcloud.uniapp.extapi.createSelectorQuery as uni_createSelectorQuery;
open class GenUniModulesSinleUiComponentsSnSubsectionSnSubsection : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var modelValue: Number by `$props`;
    open var data: UTSArray<Any?> by `$props`;
    open var disabled: Boolean by `$props`;
    open var padding: String by `$props`;
    open var blockPadding: String by `$props`;
    open var borderRadius: String by `$props`;
    open var textSize: String by `$props`;
    open var bgColor: String by `$props`;
    open var disabledBgColor: String by `$props`;
    open var blockBgColor: String by `$props`;
    open var disabledBlockBgColor: String by `$props`;
    open var textColor: String by `$props`;
    open var activeTextColor: String by `$props`;
    open var disabledTextColor: String by `$props`;
    open var disabledActiveTextColor: String by `$props`;
    open var customStyle: Any by `$props`;
    open var customItemStyle: Any by `$props`;
    open var customBlockStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnSubsectionSnSubsection) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnSubsectionSnSubsection;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val snu = `$snui`.utils;
            val instance = getCurrentInstance()!!;
            fun emit(event: String, vararg do_not_transform_spread: Any?) {
                __ins.emit(event, *do_not_transform_spread);
            }
            val props = __props;
            val subsectionWidth = ref(0);
            val subsectionHeight = ref(0);
            val theme = computed(fun(): String {
                return `$snui`.configs.app.theme;
            }
            );
            val model = computed<Number>(WritableComputedOptions(get = fun(): Number {
                return props.modelValue;
            }
            , set = fun(value: Number){
                emit("update:modelValue", value);
            }
            ));
            fun genGetPaddingNFn(padding: String, index: Number): Number {
                var _t = padding.split(" ");
                return snu.getPx(_t[if (index == 0) {
                    0;
                } else {
                    _t.length - 1;
                }
                ]);
            }
            val getPaddingN = ::genGetPaddingNFn;
            val blockWidthC = computed(fun(): Number {
                return if (subsectionWidth.value != 0 && props.data.length > 0) {
                    ((subsectionWidth.value - ((props.data.length + 1) * getPaddingN(props.padding, 1))) / props.data.length);
                } else {
                    0;
                }
                ;
            }
            );
            val blockHeightC = computed(fun(): Number {
                return if (subsectionHeight.value != 0) {
                    subsectionHeight.value - 2 * getPaddingN(props.padding, 0);
                } else {
                    0;
                }
                ;
            }
            );
            val blockTransformC = computed(fun(): Number {
                return (blockWidthC.value + getPaddingN(props.padding, 1)) * model.value;
            }
            );
            val borderRadiusC = computed(fun(): String {
                return if (props.borderRadius == "") {
                    `$snui`.configs.radius.normal;
                } else {
                    props.borderRadius;
                }
                ;
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
            val bgColorC = computed(fun(): String {
                return if (props.bgColor == "") {
                    colors.value[if (theme.value == "light") {
                        "info";
                    } else {
                        "front";
                    }] as String;
                } else {
                    props.bgColor;
                }
                ;
            }
            );
            val disabledBgColorC = computed(fun(): String {
                return if (props.disabledBgColor == "") {
                    colors.value[if (theme.value == "light") {
                        "disabled";
                    } else {
                        "disabledDark";
                    }] as String;
                } else {
                    props.disabledBgColor;
                }
                ;
            }
            );
            val blockBgColorC = computed(fun(): String {
                return if (props.blockBgColor == "") {
                    colors.value[if (theme.value == "light") {
                        "front";
                    } else {
                        "info";
                    }] as String;
                } else {
                    props.blockBgColor;
                }
                ;
            }
            );
            val disabledBlockBgColorC = computed(fun(): String {
                return if (props.disabledBlockBgColor == "") {
                    colors.value[if (theme.value == "light") {
                        "disabledDark";
                    } else {
                        "disabled";
                    }] as String;
                } else {
                    props.disabledBlockBgColor;
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
            val activeTextColorC = computed(fun(): String {
                return if (props.activeTextColor == "") {
                    colors.value.primaryDark;
                } else {
                    props.activeTextColor;
                }
                ;
            }
            );
            val disabledTextColorC = computed(fun(): String {
                return if (props.disabledTextColor == "") {
                    colors.value.disabledText;
                } else {
                    props.disabledTextColor;
                }
                ;
            }
            );
            val disabledActiveTextColorC = computed(fun(): String {
                return if (props.disabledActiveTextColor == "") {
                    colors.value.disabledDarkText;
                } else {
                    props.disabledActiveTextColor;
                }
                ;
            }
            );
            val subsectionStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("padding", props.padding);
                styles.set("border-radius", borderRadiusC.value);
                console.log(bgColorC.value, " at uni_modules/sinle-ui/components/sn-subsection/sn-subsection.uvue:181");
                styles.set("background", if (props.disabled) {
                    disabledBgColorC.value;
                } else {
                    bgColorC.value;
                }
                );
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val itemStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("padding", props.blockPadding);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val blockStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("width", snu.addPx(blockWidthC.value));
                styles.set("height", snu.addPx(blockHeightC.value));
                styles.set("background", if (props.disabled) {
                    disabledBlockBgColorC.value;
                } else {
                    blockBgColorC.value;
                }
                );
                styles.set("border-radius", snu.addPx(`$snui`.utils.other.getInnerRadius(subsectionHeight.value, snu.getPx(borderRadiusC.value), blockHeightC.value)));
                styles.set("transform", "translateX(" + blockTransformC.value + "px)");
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            fun genChangeValueFn(index: Number) {
                if (!props.disabled) {
                    model.value = index;
                    emit("change", object : UTSJSONObject() {
                        var value = index
                    });
                }
            }
            val changeValue = ::genChangeValueFn;
            fun genInitFn() {
                nextTick(fun(){
                    uni_createSelectorQuery().`in`(instance.proxy!!).select(".sn-subsection").boundingClientRect().exec(fun(ret){
                        var info = ret[0] as NodeInfo;
                        subsectionWidth.value = info.width as Number;
                        subsectionHeight.value = (info.height as Number);
                    }
                    );
                }
                );
            }
            val init = ::genInitFn;
            onMounted(fun(){
                init();
            }
            );
            onUpdated(fun(){
                init();
            }
            );
            return fun(): Any? {
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                return createElementVNode("view", utsMapOf("class" to "sn-subsection", "ref" to "subsection", "style" to normalizeStyle(utsArrayOf(
                    unref(subsectionStylesC),
                    _ctx.customStyle
                ))), utsArrayOf(
                    createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.data, fun(e, index, _, _): VNode {
                        return createVNode(_component_sn_text, utsMapOf("class" to "sn-subsection-item", "align" to "center", "key" to index, "size" to unref(textSizeC), "text" to e, "color" to if (_ctx.disabled) {
                            if (index == _ctx.modelValue) {
                                unref(disabledActiveTextColorC);
                            } else {
                                unref(disabledTextColorC);
                            };
                        } else {
                            if (index == _ctx.modelValue) {
                                unref(activeTextColorC);
                            } else {
                                unref(textColorC);
                            }
                            ;
                        }
                        , "onClick" to fun(){
                            changeValue(index);
                        }
                        , "style" to normalizeStyle(utsArrayOf(
                            unref(itemStylesC),
                            _ctx.customItemStyle
                        ))), null, 8, utsArrayOf(
                            "size",
                            "text",
                            "color",
                            "onClick",
                            "style"
                        ));
                    }
                    ), 128),
                    createElementVNode("view", utsMapOf("class" to "sn-subsection-block", "style" to normalizeStyle(utsArrayOf(
                        unref(blockStylesC),
                        _ctx.customBlockStyle
                    ))), null, 4)
                ), 4);
            }
            ;
        }
        ;
        var name = "sn-subsection";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-subsection" to padStyleMapOf(utsMapOf("flexDirection" to "row", "alignItems" to "center", "width" to "100%", "paddingTop" to 2, "paddingRight" to 2, "paddingBottom" to 2, "paddingLeft" to 2)), "sn-subsection-item" to padStyleMapOf(utsMapOf("flex" to 1, "paddingTop" to 5, "paddingRight" to 0, "paddingBottom" to 5, "paddingLeft" to 0, "zIndex" to 2)), "sn-subsection-block" to padStyleMapOf(utsMapOf("position" to "absolute", "transitionProperty" to "transform", "zIndex" to 1)), "@TRANSITION" to utsMapOf("sn-subsection-block" to utsMapOf("property" to "transform")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf("change" to null, "update:modelValue" to null);
        var props = normalizePropsOptions(utsMapOf("modelValue" to utsMapOf("type" to "Number", "default" to 0), "data" to utsMapOf("type" to "Array", "default" to utsArrayOf<String>()), "disabled" to utsMapOf("type" to "Boolean", "default" to false), "padding" to utsMapOf("type" to "String", "default" to "3px"), "blockPadding" to utsMapOf("type" to "String", "default" to "10px"), "borderRadius" to utsMapOf("type" to "String", "default" to ""), "textSize" to utsMapOf("type" to "String", "default" to ""), "bgColor" to utsMapOf("type" to "String", "default" to ""), "disabledBgColor" to utsMapOf("type" to "String", "default" to ""), "blockBgColor" to utsMapOf("type" to "String", "default" to ""), "disabledBlockBgColor" to utsMapOf("type" to "String", "default" to ""), "textColor" to utsMapOf("type" to "String", "default" to ""), "activeTextColor" to utsMapOf("type" to "String", "default" to ""), "disabledTextColor" to utsMapOf("type" to "String", "default" to ""), "disabledActiveTextColor" to utsMapOf("type" to "String", "default" to ""), "customStyle" to utsMapOf("default" to UTSJSONObject()), "customItemStyle" to utsMapOf("default" to UTSJSONObject()), "customBlockStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "modelValue",
            "data",
            "disabled",
            "padding",
            "blockPadding",
            "borderRadius",
            "textSize",
            "bgColor",
            "disabledBgColor",
            "blockBgColor",
            "disabledBlockBgColor",
            "textColor",
            "activeTextColor",
            "disabledTextColor",
            "disabledActiveTextColor",
            "customStyle",
            "customItemStyle",
            "customBlockStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
