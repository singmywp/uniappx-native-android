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
open class GenUniModulesSinleUiComponentsSnTextareaSnTextarea : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var modelValue: String by `$props`;
    open var name: String by `$props`;
    open var height: String by `$props`;
    open var borderColor: String by `$props`;
    open var activeBorderColor: String by `$props`;
    open var bgColor: String by `$props`;
    open var activeBgColor: String by `$props`;
    open var cursor: Number by `$props`;
    open var cursorColor: String by `$props`;
    open var cursorSpacing: Number by `$props`;
    open var selectionStart: Number by `$props`;
    open var selectionEnd: Number by `$props`;
    open var placeholder: String by `$props`;
    open var placeholderStyle: String by `$props`;
    open var placeholderClass: String by `$props`;
    open var autoHeight: Boolean by `$props`;
    open var confirmHold: Boolean by `$props`;
    open var holdKeyboard: Boolean by `$props`;
    open var adjustPosition: Boolean by `$props`;
    open var activeBorder: Boolean by `$props`;
    open var focus: Boolean by `$props`;
    open var disabled: Boolean by `$props`;
    open var disabledTextColor: String by `$props`;
    open var disabledBgColor: String by `$props`;
    open var readonly: Boolean by `$props`;
    open var autoFocus: Boolean by `$props`;
    open var borderRadius: String by `$props`;
    open var borderWidth: String by `$props`;
    open var padding: String by `$props`;
    open var maxlength: Number by `$props`;
    open var textSize: String by `$props`;
    open var textColor: String by `$props`;
    open var textFont: String by `$props`;
    open var align: String by `$props`;
    open var counterSize: String by `$props`;
    open var counterColor: String by `$props`;
    open var counterBgColor: String by `$props`;
    open var customCounterStyle: Any by `$props`;
    open var customContainStyle: Any by `$props`;
    open var customStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnTextareaSnTextarea) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnTextareaSnTextarea;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val snu = `$snui`.utils;
            fun emit(event: String, vararg do_not_transform_spread: Any?) {
                __ins.emit(event, *do_not_transform_spread);
            }
            val props = __props;
            val isActive = ref(false);
            val model = computed<String>(WritableComputedOptions(get = fun(): String {
                return props.modelValue;
            }
            , set = fun(value: String){
                emit("update:modelValue", value);
            }
            ));
            val textLength = computed(fun(): Number {
                return snu.text.len(props.modelValue);
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
            val activeBorderColorC = computed(fun(): String {
                return if (props.activeBorderColor == "") {
                    colors.value.primary;
                } else {
                    props.activeBorderColor;
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
            val counterColorC = computed(fun(): String {
                return if (props.counterColor == "") {
                    colors.value.text;
                } else {
                    props.counterColor;
                }
                ;
            }
            );
            val counterBgColorC = computed(fun(): String {
                return if (props.counterBgColor == "") {
                    colors.value.info;
                } else {
                    props.counterBgColor;
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
            val counterSizeC = computed(fun(): String {
                return if (props.counterSize == "") {
                    `$snui`.configs.font.size(2);
                } else {
                    props.counterSize;
                }
                ;
            }
            );
            val containStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("border-radius", borderRadiusC.value);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val textareaViewStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("border-radius", borderRadiusC.value);
                styles.set("padding", props.padding);
                styles.set("borderWidth", props.borderWidth);
                styles.set("backgroundColor", if (props.disabled) {
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
                styles.set("borderColor", if (props.activeBorder && isActive.value) {
                    activeBorderColorC.value;
                } else {
                    borderColorC.value;
                }
                );
                styles.set("height", if (props.autoHeight) {
                    "";
                } else {
                    snu.addUnit(snu.getPx(props.height) + 16);
                }
                );
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val textareaStylesC = computed(fun(): Map<String, Any> {
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
                styles.set("height", snu.addUnit(snu.getPx(props.height)));
                return styles;
            }
            );
            val counterStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("fontSize", counterSizeC.value);
                styles.set("background", counterBgColorC.value);
                styles.set("border-radius", `$snui`.configs.radius.circle);
                styles.set("color", counterColorC.value);
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
            fun genOnInputFn(e: UniInputEvent) {
                model.value = e.detail.value;
                emit("input", e);
            }
            val onInput = ::genOnInputFn;
            fun genOnFocusFn(e: UniTextareaFocusEvent) {
                isActive.value = true;
                emit("focus", e);
            }
            val onFocus = ::genOnFocusFn;
            fun genOnBlurFn(e: UniTextareaBlurEvent) {
                isActive.value = false;
                emit("blur", e);
            }
            val onBlur = ::genOnBlurFn;
            fun genOnConfirmFn(e: UniInputConfirmEvent) {
                emit("confirm", e);
                isActive.value = false;
            }
            val onConfirm = ::genOnConfirmFn;
            fun genOnKeyboardheightchangeFn(e: UniInputKeyboardHeightChangeEvent) {
                emit("keyboardheightchange", e);
            }
            val onKeyboardheightchange = ::genOnKeyboardheightchangeFn;
            fun genOnLinechangeFn(e: UniTextareaLineChangeEvent) {
                emit("linechange", e);
            }
            val onLinechange = ::genOnLinechangeFn;
            return fun(): Any? {
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                return createElementVNode("view", utsMapOf("class" to "sn-textarea-contain", "style" to normalizeStyle(utsArrayOf(
                    unref(containStylesC),
                    _ctx.customContainStyle
                ))), utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "sn-textarea", "ref" to "sn-textarea", "style" to normalizeStyle(unref(textareaViewStylesC))), utsArrayOf(
                        createElementVNode("textarea", utsMapOf("class" to "sn-textarea__textarea", "name" to _ctx.name, "value" to unref(model), "disabled" to (_ctx.disabled || _ctx.readonly), "autoFocus" to _ctx.autoFocus, "autoHeight" to _ctx.autoHeight, "cursorColor" to _ctx.cursorColor, "focus" to _ctx.focus, "adjustPosition" to _ctx.adjustPosition, "cursor" to _ctx.cursor, "selectionStart" to _ctx.selectionStart, "selectionEnd" to _ctx.selectionEnd, "holdKeyboard" to _ctx.holdKeyboard, "cursorSpacing" to _ctx.cursorSpacing, "confirmHold" to _ctx.confirmHold, "placeholder" to _ctx.placeholder, "placeholderStyle" to _ctx.placeholderStyle, "placeholderClass" to _ctx.placeholderClass, "onInput" to onInput, "onKeyboardheightchange" to onKeyboardheightchange, "onFocus" to onFocus, "onBlur" to onBlur, "onConfirm" to onConfirm, "onLinechange" to onLinechange, "style" to normalizeStyle(utsArrayOf(
                            unref(textareaStylesC),
                            _ctx.customStyle
                        ))), null, 44, utsArrayOf(
                            "name",
                            "value",
                            "disabled",
                            "autoFocus",
                            "autoHeight",
                            "cursorColor",
                            "focus",
                            "adjustPosition",
                            "cursor",
                            "selectionStart",
                            "selectionEnd",
                            "holdKeyboard",
                            "cursorSpacing",
                            "confirmHold",
                            "placeholder",
                            "placeholderStyle",
                            "placeholderClass"
                        )),
                        if (_ctx.maxlength != -1) {
                            createVNode(_component_sn_text, utsMapOf("key" to 0, "class" to "sn-textarea__counter", "text" to (unref(textLength) + "/" + _ctx.maxlength.toString()), "style" to normalizeStyle(utsArrayOf(
                                unref(counterStylesC),
                                _ctx.customCounterStyle
                            ))), null, 8, utsArrayOf(
                                "text",
                                "style"
                            ));
                        } else {
                            createCommentVNode("v-if", true);
                        }
                        ,
                        if (_ctx.maxlength != -1) {
                            createElementVNode("text", utsMapOf("key" to 1, "class" to "sn-textarea__counter"));
                        } else {
                            createCommentVNode("v-if", true);
                        }
                    ), 4)
                ), 4);
            }
            ;
        }
        ;
        var name = "sn-textarea";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-textarea" to padStyleMapOf(utsMapOf("display" to "flex", "flexDirection" to "row", "alignItems" to "center", "borderStyle" to "solid")), "sn-textarea__counter" to padStyleMapOf(utsMapOf("position" to "absolute", "bottom" to 10, "right" to 10, "paddingTop" to 3, "paddingRight" to 10, "paddingBottom" to 3, "paddingLeft" to 10)), "sn-textarea__textarea" to padStyleMapOf(utsMapOf("!borderWidth" to 0, "flex" to 1)), "sn-textarea-contain" to padStyleMapOf(utsMapOf("flex" to 1)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf("update:modelValue" to null, "input" to null, "confirm" to null, "blur" to null, "focus" to null, "keyboardheightchange" to null, "linechange" to null);
        var props = normalizePropsOptions(utsMapOf("modelValue" to utsMapOf("type" to "String", "default" to ""), "name" to utsMapOf("type" to "String", "default" to ""), "height" to utsMapOf("type" to "String", "default" to "100px"), "borderColor" to utsMapOf("type" to "String", "default" to ""), "activeBorderColor" to utsMapOf("type" to "String", "default" to ""), "bgColor" to utsMapOf("type" to "String", "default" to ""), "activeBgColor" to utsMapOf("type" to "String", "default" to ""), "cursor" to utsMapOf("type" to "Number", "default" to 0), "cursorColor" to utsMapOf("type" to "String", "default" to ""), "cursorSpacing" to utsMapOf("type" to "Number", "default" to 0), "selectionStart" to utsMapOf("type" to "Number", "default" to -1), "selectionEnd" to utsMapOf("type" to "Number", "default" to -1), "placeholder" to utsMapOf("type" to "String", "default" to ""), "placeholderStyle" to utsMapOf("type" to "String", "default" to ""), "placeholderClass" to utsMapOf("type" to "String", "default" to ""), "autoHeight" to utsMapOf("type" to "Boolean", "default" to false), "confirmHold" to utsMapOf("type" to "Boolean", "default" to false), "holdKeyboard" to utsMapOf("type" to "Boolean", "default" to false), "adjustPosition" to utsMapOf("type" to "Boolean", "default" to true), "activeBorder" to utsMapOf("type" to "Boolean", "default" to true), "focus" to utsMapOf("type" to "Boolean", "default" to false), "disabled" to utsMapOf("type" to "Boolean", "default" to false), "disabledTextColor" to utsMapOf("type" to "String", "default" to ""), "disabledBgColor" to utsMapOf("type" to "String", "default" to ""), "readonly" to utsMapOf("type" to "Boolean", "default" to false), "autoFocus" to utsMapOf("type" to "Boolean", "default" to false), "borderRadius" to utsMapOf("type" to "String", "default" to ""), "borderWidth" to utsMapOf("type" to "String", "default" to "2px"), "padding" to utsMapOf("type" to "String", "default" to "8px 13px"), "maxlength" to utsMapOf("type" to "Number", "default" to -1), "textSize" to utsMapOf("type" to "String", "default" to ""), "textColor" to utsMapOf("type" to "String", "default" to ""), "textFont" to utsMapOf("type" to "String", "default" to ""), "align" to utsMapOf("type" to "String", "default" to "flex-start"), "counterSize" to utsMapOf("type" to "String", "default" to ""), "counterColor" to utsMapOf("type" to "String", "default" to ""), "counterBgColor" to utsMapOf("type" to "String", "default" to ""), "customCounterStyle" to utsMapOf("default" to UTSJSONObject()), "customContainStyle" to utsMapOf("default" to UTSJSONObject()), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "modelValue",
            "name",
            "height",
            "borderColor",
            "activeBorderColor",
            "bgColor",
            "activeBgColor",
            "cursor",
            "cursorColor",
            "cursorSpacing",
            "selectionStart",
            "selectionEnd",
            "placeholder",
            "placeholderStyle",
            "placeholderClass",
            "autoHeight",
            "confirmHold",
            "holdKeyboard",
            "adjustPosition",
            "activeBorder",
            "focus",
            "disabled",
            "disabledTextColor",
            "disabledBgColor",
            "readonly",
            "autoFocus",
            "borderRadius",
            "borderWidth",
            "padding",
            "maxlength",
            "textSize",
            "textColor",
            "textFont",
            "align",
            "counterSize",
            "counterColor",
            "counterBgColor",
            "customCounterStyle",
            "customContainStyle",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
