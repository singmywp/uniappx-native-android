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
open class GenUniModulesSinleUiComponentsSnInputSnInput : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var modelValue: String by `$props`;
    open var name: String by `$props`;
    open var border: Boolean by `$props`;
    open var borderColor: String by `$props`;
    open var bgColor: String by `$props`;
    open var activeBgColor: String by `$props`;
    open var disabledBgColor: String by `$props`;
    open var disabledTextColor: String by `$props`;
    open var loadingColor: String by `$props`;
    open var iconColor: String by `$props`;
    open var activeBorderColor: String by `$props`;
    open var cursor: Number by `$props`;
    open var cursorColor: String by `$props`;
    open var cursorSpacing: Number by `$props`;
    open var selectionStart: Number by `$props`;
    open var selectionEnd: Number by `$props`;
    open var placeholder: String by `$props`;
    open var placeholderStyle: String by `$props`;
    open var placeholderClass: String by `$props`;
    open var type: String by `$props`;
    open var password: Boolean by `$props`;
    open var confirmHold: Boolean by `$props`;
    open var holdKeyboard: Boolean by `$props`;
    open var adjustPosition: Boolean by `$props`;
    open var activeBorder: Boolean by `$props`;
    open var focus: Boolean by `$props`;
    open var loading: Boolean by `$props`;
    open var disabled: Boolean by `$props`;
    open var readonly: Boolean by `$props`;
    open var confirmType: String by `$props`;
    open var inputmode: String by `$props`;
    open var autoFocus: Boolean by `$props`;
    open var clearable: Boolean by `$props`;
    open var borderRadius: String by `$props`;
    open var borderWidth: String by `$props`;
    open var prefixIcon: String by `$props`;
    open var suffixIcon: String by `$props`;
    open var iconSize: String by `$props`;
    open var padding: String by `$props`;
    open var maxlength: Number by `$props`;
    open var textSize: String by `$props`;
    open var textFont: String by `$props`;
    open var textColor: String by `$props`;
    open var align: String by `$props`;
    open var customPrefixIconStyle: Any by `$props`;
    open var customSuffixIconStyle: Any by `$props`;
    open var customContainStyle: Any by `$props`;
    open var customStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnInputSnInput) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnInputSnInput;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val snu = `$snui`.utils;
            fun emit(event: String, vararg do_not_transform_spread: Any?) {
                __ins.emit(event, *do_not_transform_spread);
            }
            val props = __props;
            val isActive = ref(false);
            val pwdVisible = ref(false);
            val model = computed<String>(WritableComputedOptions(get = fun(): String {
                return props.modelValue;
            }
            , set = fun(value: String){
                emit("update:modelValue", value);
            }
            ));
            val theme = computed(fun(): String {
                return `$snui`.configs.app.theme;
            }
            );
            val showPrefixIcon = computed(fun(): Boolean {
                return !snu.text.isEmpty(props.prefixIcon);
            }
            );
            val showSuffixIcon = computed(fun(): Boolean {
                return !snu.text.isEmpty(props.suffixIcon);
            }
            );
            val showClearBtn = computed(fun(): Boolean {
                return !snu.text.isEmpty(model.value);
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
            val borderColorC = computed(fun(): String {
                return if (props.borderColor == "") {
                    colors.value.line;
                } else {
                    props.borderColor;
                }
                ;
            }
            );
            val bgColorC = computed(fun(): String {
                return if (props.bgColor == "") {
                    colors.value.front;
                } else {
                    props.bgColor;
                }
                ;
            }
            );
            val activeBgColorC = computed(fun(): String {
                return if (props.activeBgColor == "") {
                    colors.value.front;
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
            val disabledTextColorC = computed(fun(): String {
                return if (props.disabledTextColor == "") {
                    colors.value.disabledText;
                } else {
                    props.disabledTextColor;
                }
                ;
            }
            );
            val loadingColorC = computed(fun(): String {
                return if (props.loadingColor == "") {
                    colors.value.primary;
                } else {
                    props.loadingColor;
                }
                ;
            }
            );
            val iconColorC = computed(fun(): String {
                return if (props.iconColor == "") {
                    colors.value.text;
                } else {
                    props.iconColor;
                }
                ;
            }
            );
            val activeBorderColorC = computed(fun(): String {
                return if (props.activeBorderColor == "") {
                    colors.value.primary;
                } else {
                    props.activeBorderColor;
                }
                ;
            }
            );
            val iconSizeC = computed(fun(): String {
                return if (props.iconSize == "") {
                    `$snui`.configs.font.size(4);
                } else {
                    props.iconSize;
                }
                ;
            }
            );
            val borderRadiusC = computed(fun(): String {
                return if (props.borderRadius == "") {
                    `$snui`.configs.radius.small;
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
            val inputViewStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("border-radius", borderRadiusC.value);
                styles.set("padding", props.padding);
                styles.set("background", if (props.disabled) {
                    disabledBgColorC.value;
                } else {
                    if (isActive.value) {
                        activeBgColorC.value;
                    } else {
                        bgColorC.value;
                    }
                    ;
                }
                );
                if (props.border) {
                    styles.set("border-style", "solid");
                    styles.set("border-width", props.borderWidth);
                    styles.set("border-color", if ((props.activeBorder && isActive.value)) {
                        activeBorderColorC.value;
                    } else {
                        borderColorC.value;
                    }
                    );
                }
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val inputStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("fontSize", textSizeC.value);
                styles.set("textAlign", props.align);
                styles.set("fontFamily", props.textFont);
                styles.set("color", if (props.disabled) {
                    disabledTextColorC.value;
                } else {
                    textColorC.value;
                }
                );
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val clearBtnStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("transform", "scale(" + (if (showClearBtn.value) {
                    1;
                } else {
                    0;
                }
                ) + ")");
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            watch(model, fun(newVal: String, oldVal: String){
                if (props.maxlength > -1) {
                    if (snu.text.len(newVal) > props.maxlength) {
                        model.value = oldVal.slice(0, props.maxlength);
                    }
                }
            }
            );
            fun genClearContentFn() {
                model.value = "";
            }
            val clearContent = ::genClearContentFn;
            fun genOnInputFn(e: UniInputEvent) {
                model.value = e.detail.value;
                emit("input", e);
            }
            val onInput = ::genOnInputFn;
            fun genOnFocusFn(e: UniInputFocusEvent) {
                isActive.value = true;
                emit("focus", e);
            }
            val onFocus = ::genOnFocusFn;
            fun genOnBlurFn(e: UniInputBlurEvent) {
                isActive.value = false;
                emit("blur", e);
            }
            val onBlur = ::genOnBlurFn;
            fun genOnConfirmFn(e: UniInputConfirmEvent) {
                emit("confirm", e);
                isActive.value = false;
            }
            val onConfirm = ::genOnConfirmFn;
            fun genOnKeyboardheightchangeFn(e: Event) {
                emit("keyboardheightchange", e);
            }
            val onKeyboardheightchange = ::genOnKeyboardheightchangeFn;
            fun genSuffixClickedFn() {
                emit("suffix-click");
            }
            val suffixClicked = ::genSuffixClickedFn;
            fun genPrefixClickedFn() {
                emit("prefix-click");
            }
            val prefixClicked = ::genPrefixClickedFn;
            return fun(): Any? {
                val _component_sn_icon = resolveEasyComponent("sn-icon", GenUniModulesSinleUiComponentsSnIconSnIconClass);
                val _component_sn_loading = resolveEasyComponent("sn-loading", GenUniModulesSinleUiComponentsSnLoadingSnLoadingClass);
                return createElementVNode("view", utsMapOf("class" to "sn-input-contain", "style" to normalizeStyle(utsArrayOf(
                    utsMapOf("borderRadius" to unref(borderRadiusC)),
                    _ctx.customContainStyle
                ))), utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "sn-input", "ref" to "sn-input", "style" to normalizeStyle(unref(inputViewStylesC))), utsArrayOf(
                        renderSlot(_ctx.`$slots`, "prefix", UTSJSONObject(), fun(): UTSArray<Any> {
                            return utsArrayOf(
                                if (isTrue(unref(showPrefixIcon))) {
                                    createVNode(_component_sn_icon, utsMapOf("key" to 0, "class" to "sn-input__prefixIcon", "name" to _ctx.prefixIcon, "color" to unref(iconColorC), "size" to unref(iconSizeC), "custom-style" to _ctx.customPrefixIconStyle, "onClick" to prefixClicked, "style" to normalizeStyle(utsArrayOf(
                                        utsMapOf("marginRight" to "10px")
                                    ))), null, 8, utsArrayOf(
                                        "name",
                                        "color",
                                        "size",
                                        "custom-style",
                                        "style"
                                    ));
                                } else {
                                    createCommentVNode("v-if", true);
                                }
                            );
                        }
                        ),
                        createElementVNode("input", utsMapOf("class" to "sn-input__input", "name" to _ctx.name, "value" to unref(model), "autoFocus" to _ctx.autoFocus, "type" to _ctx.type, "cursorColor" to _ctx.cursorColor, "confirmType" to _ctx.confirmType, "focus" to _ctx.focus, "adjustPosition" to _ctx.adjustPosition, "cursor" to _ctx.cursor, "selectionStart" to _ctx.selectionStart, "selectionEnd" to _ctx.selectionEnd, "hold-keyboard" to _ctx.holdKeyboard, "cursorSpacing" to _ctx.cursorSpacing, "confirmHold" to _ctx.confirmHold, "disabled" to (_ctx.disabled || _ctx.readonly), "inputmode" to _ctx.inputmode, "password" to (_ctx.password && !unref(pwdVisible)), "placeholder" to _ctx.placeholder, "placeholderStyle" to _ctx.placeholderStyle, "placeholderClass" to _ctx.placeholderClass, "onInput" to onInput, "onKeyboardheightchange" to onKeyboardheightchange, "onFocus" to onFocus, "onBlur" to onBlur, "onConfirm" to onConfirm, "style" to normalizeStyle(utsArrayOf(
                            unref(inputStylesC),
                            _ctx.customStyle
                        ))), null, 44, utsArrayOf(
                            "name",
                            "value",
                            "autoFocus",
                            "type",
                            "cursorColor",
                            "confirmType",
                            "focus",
                            "adjustPosition",
                            "cursor",
                            "selectionStart",
                            "selectionEnd",
                            "hold-keyboard",
                            "cursorSpacing",
                            "confirmHold",
                            "disabled",
                            "inputmode",
                            "password",
                            "placeholder",
                            "placeholderStyle",
                            "placeholderClass"
                        )),
                        renderSlot(_ctx.`$slots`, "suffix", UTSJSONObject(), fun(): UTSArray<Any> {
                            return utsArrayOf(
                                if (isTrue(unref(showSuffixIcon))) {
                                    createVNode(_component_sn_icon, utsMapOf("key" to 0, "class" to "sn-input__suffixIcon", "name" to _ctx.suffixIcon, "color" to unref(iconColorC), "size" to unref(iconSizeC), "custom-style" to _ctx.customSuffixIconStyle, "onClick" to suffixClicked, "style" to normalizeStyle(utsArrayOf(
                                        utsMapOf("marginRight" to "5px")
                                    ))), null, 8, utsArrayOf(
                                        "name",
                                        "color",
                                        "size",
                                        "custom-style",
                                        "style"
                                    ));
                                } else {
                                    createCommentVNode("v-if", true);
                                }
                            );
                        }
                        ),
                        if (isTrue(_ctx.loading)) {
                            createVNode(_component_sn_loading, utsMapOf("key" to 0, "class" to "sn-input__loading", "iconSize" to unref(iconSizeC), "iconColor" to unref(loadingColorC)), null, 8, utsArrayOf(
                                "iconSize",
                                "iconColor"
                            ));
                        } else {
                            createCommentVNode("v-if", true);
                        }
                        ,
                        if (isTrue(_ctx.clearable)) {
                            createVNode(_component_sn_icon, utsMapOf("key" to 1, "class" to "sn-input__clearBtn", "name" to "close-circle-fill", "size" to unref(iconSizeC), "color" to unref(colors)[if (unref(theme) == "light") {
                                "infoDark";
                            } else {
                                "dark";
                            }], "onClick" to clearContent, "style" to normalizeStyle(unref(clearBtnStylesC))), null, 8, utsArrayOf(
                                "size",
                                "color",
                                "style"
                            ));
                        } else {
                            createCommentVNode("v-if", true);
                        }
                        ,
                        if (isTrue(_ctx.password)) {
                            createVNode(_component_sn_icon, utsMapOf("key" to 2, "class" to "sn-input__viewPwd", "name" to if (unref(pwdVisible)) {
                                "eye-fill";
                            } else {
                                "eye-off-fill";
                            }, "color" to unref(colors)[if (unref(pwdVisible)) {
                                "primary";
                            } else {
                                "info";
                            }], "size" to unref(iconSizeC), "onClick" to fun(){
                                pwdVisible.value = !unref(pwdVisible);
                            }), null, 8, utsArrayOf(
                                "name",
                                "color",
                                "size",
                                "onClick"
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
        var name = "sn-input";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-input" to padStyleMapOf(utsMapOf("flex" to 1, "flexDirection" to "row", "alignItems" to "center")), "sn-input__suffixIcon" to padStyleMapOf(utsMapOf("marginLeft" to 5)), "sn-input__loading" to padStyleMapOf(utsMapOf("marginLeft" to 5, "paddingRight" to 5)), "sn-input__input" to padStyleMapOf(utsMapOf("!borderWidth" to 0, "flex" to "auto")), "sn-input-contain" to padStyleMapOf(utsMapOf("flex" to 1)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf("update:modelValue" to null, "input" to null, "confirm" to null, "blur" to null, "focus" to null, "keyboardheightchange" to null, "prefix-click" to null, "suffix-click" to null);
        var props = normalizePropsOptions(utsMapOf("modelValue" to utsMapOf("type" to "String", "default" to ""), "name" to utsMapOf("type" to "String", "default" to ""), "border" to utsMapOf("type" to "Boolean", "default" to true), "borderColor" to utsMapOf("type" to "String", "default" to ""), "bgColor" to utsMapOf("type" to "String", "default" to ""), "activeBgColor" to utsMapOf("type" to "String", "default" to ""), "disabledBgColor" to utsMapOf("type" to "String", "default" to ""), "disabledTextColor" to utsMapOf("type" to "String", "default" to ""), "loadingColor" to utsMapOf("type" to "String", "default" to ""), "iconColor" to utsMapOf("type" to "String", "default" to ""), "activeBorderColor" to utsMapOf("type" to "String", "default" to ""), "cursor" to utsMapOf("type" to "Number", "default" to 0), "cursorColor" to utsMapOf("type" to "String", "default" to ""), "cursorSpacing" to utsMapOf("type" to "Number", "default" to 0), "selectionStart" to utsMapOf("type" to "Number", "default" to -1), "selectionEnd" to utsMapOf("type" to "Number", "default" to -1), "placeholder" to utsMapOf("type" to "String", "default" to ""), "placeholderStyle" to utsMapOf("type" to "String", "default" to ""), "placeholderClass" to utsMapOf("type" to "String", "default" to ""), "type" to utsMapOf("type" to "String", "default" to "text"), "password" to utsMapOf("type" to "Boolean", "default" to false), "confirmHold" to utsMapOf("type" to "Boolean", "default" to false), "holdKeyboard" to utsMapOf("type" to "Boolean", "default" to false), "adjustPosition" to utsMapOf("type" to "Boolean", "default" to true), "activeBorder" to utsMapOf("type" to "Boolean", "default" to true), "focus" to utsMapOf("type" to "Boolean", "default" to false), "loading" to utsMapOf("type" to "Boolean", "default" to false), "disabled" to utsMapOf("type" to "Boolean", "default" to false), "readonly" to utsMapOf("type" to "Boolean", "default" to false), "confirmType" to utsMapOf("type" to "String", "default" to "done"), "inputmode" to utsMapOf("type" to "String", "default" to "text"), "autoFocus" to utsMapOf("type" to "Boolean", "default" to false), "clearable" to utsMapOf("type" to "Boolean", "default" to false), "borderRadius" to utsMapOf("type" to "String", "default" to ""), "borderWidth" to utsMapOf("type" to "String", "default" to "2px"), "prefixIcon" to utsMapOf("type" to "String", "default" to ""), "suffixIcon" to utsMapOf("type" to "String", "default" to ""), "iconSize" to utsMapOf("type" to "String", "default" to ""), "padding" to utsMapOf("type" to "String", "default" to "8px 13px"), "maxlength" to utsMapOf("type" to "Number", "default" to -1), "textSize" to utsMapOf("type" to "String", "default" to ""), "textFont" to utsMapOf("type" to "String", "default" to ""), "textColor" to utsMapOf("type" to "String", "default" to ""), "align" to utsMapOf("type" to "String", "default" to "flex-start"), "customPrefixIconStyle" to utsMapOf("default" to UTSJSONObject()), "customSuffixIconStyle" to utsMapOf("default" to UTSJSONObject()), "customContainStyle" to utsMapOf("default" to UTSJSONObject()), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "modelValue",
            "name",
            "border",
            "borderColor",
            "bgColor",
            "activeBgColor",
            "disabledBgColor",
            "disabledTextColor",
            "loadingColor",
            "iconColor",
            "activeBorderColor",
            "cursor",
            "cursorColor",
            "cursorSpacing",
            "selectionStart",
            "selectionEnd",
            "placeholder",
            "placeholderStyle",
            "placeholderClass",
            "type",
            "password",
            "confirmHold",
            "holdKeyboard",
            "adjustPosition",
            "activeBorder",
            "focus",
            "loading",
            "disabled",
            "readonly",
            "confirmType",
            "inputmode",
            "autoFocus",
            "clearable",
            "borderRadius",
            "borderWidth",
            "prefixIcon",
            "suffixIcon",
            "iconSize",
            "padding",
            "maxlength",
            "textSize",
            "textFont",
            "textColor",
            "align",
            "customPrefixIconStyle",
            "customSuffixIconStyle",
            "customContainStyle",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
