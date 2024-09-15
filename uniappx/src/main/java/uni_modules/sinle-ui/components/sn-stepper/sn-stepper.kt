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
open class GenUniModulesSinleUiComponentsSnStepperSnStepper : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var modelValue: Number by `$props`;
    open var size: String by `$props`;
    open var spacing: String by `$props`;
    open var inputWidth: String by `$props`;
    open var textSize: String by `$props`;
    open var textColor: String by `$props`;
    open var disabledTextColor: String by `$props`;
    open var inputBgColor: String by `$props`;
    open var inputActiveBgColor: String by `$props`;
    open var buttonBgColor: String by `$props`;
    open var borderRadius: String by `$props`;
    open var min: Number by `$props`;
    open var max: Number by `$props`;
    open var step: Number by `$props`;
    open var longpress: Boolean by `$props`;
    open var disableInput: Boolean by `$props`;
    open var disabled: Boolean by `$props`;
    open var customStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnStepperSnStepper) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnStepperSnStepper;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val snu = `$snui`.utils;
            fun emit(event: String, vararg do_not_transform_spread: Any?) {
                __ins.emit(event, *do_not_transform_spread);
            }
            val props = __props;
            val inputValue = ref("");
            val increaseTimer = ref(null as Number?);
            val decreaseTimer = ref(null as Number?);
            val model = computed<Number>(WritableComputedOptions(get = fun(): Number {
                return props.modelValue;
            }
            , set = fun(value: Number){
                emit("update:modelValue", snu.other.formatNumber(value));
            }
            ));
            val disableIncrease = computed(fun(): Boolean {
                return (if (isNaN(props.max)) {
                    false;
                } else {
                    props.modelValue == props.max;
                }
                ) || props.disabled;
            }
            );
            val disableDecrease = computed(fun(): Boolean {
                return (if (isNaN(props.min)) {
                    false;
                } else {
                    props.modelValue == props.min;
                }
                ) || props.disabled;
            }
            );
            val numberBoxStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val textSizeC = computed(fun(): String {
                return if (props.textSize == "") {
                    "" + (`$snui`.utils.getPx(`$snui`.configs.font.size(2)) + 1) + "px";
                } else {
                    props.textSize;
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
            val disabledTextColorC = computed(fun(): String {
                return if (props.disabledTextColor == "") {
                    colors.value.disabledText;
                } else {
                    props.disabledTextColor;
                }
                ;
            }
            );
            val inputBgColorC = computed(fun(): String {
                return if (props.inputBgColor == "") {
                    colors.value.info;
                } else {
                    props.inputBgColor;
                }
                ;
            }
            );
            val inputActiveBgColorC = computed(fun(): String {
                return if (props.inputActiveBgColor == "") {
                    colors.value.info;
                } else {
                    props.inputActiveBgColor;
                }
                ;
            }
            );
            val buttonBgColorC = computed(fun(): String {
                return if (props.buttonBgColor == "") {
                    colors.value.info;
                } else {
                    props.buttonBgColor;
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
            val inputPaddingC = computed(fun(): Number {
                return (snu.getPx(props.size) - snu.getPx(textSizeC.value)) / 2;
            }
            );
            val actionStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("width", props.size);
                styles.set("height", props.size);
                styles.set("padding", "");
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val inputStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("width", props.inputWidth);
                styles.set("size", props.size);
                styles.set("flex", "");
                styles.set("margin", "0 " + props.spacing);
                return styles;
            }
            );
            fun genUpdateValueFn(value: Number) {
                model.value = value;
                emit("change", object : UTSJSONObject() {
                    var value = value
                });
            }
            val updateValue = ::genUpdateValueFn;
            fun genDecreaseFn() {
                if (!disableDecrease.value) {
                    var after = parseFloat((props.modelValue - props.step).toFixed(2));
                    updateValue(if (isNaN(props.min)) {
                        after;
                    } else {
                        if (after >= props.min) {
                            after;
                        } else {
                            props.min;
                        }
                        ;
                    }
                    );
                }
            }
            val decrease = ::genDecreaseFn;
            fun genIncreaseFn() {
                if (!disableIncrease.value) {
                    var after = parseFloat((props.modelValue + props.step).toFixed(2));
                    updateValue(if (isNaN(props.max)) {
                        after;
                    } else {
                        if (after <= props.max) {
                            after;
                        } else {
                            props.max;
                        }
                        ;
                    }
                    );
                }
            }
            val increase = ::genIncreaseFn;
            fun genInputConfirmFn() {
                var f: Number = 0;
                if (!snu.text.isEmpty(inputValue.value)) {
                    if (inputValue.value == "-") {
                        f = -1;
                    } else {
                        f = parseFloat(parseFloat(inputValue.value).toFixed(2));
                    }
                    f = if (f > props.max) {
                        props.max;
                    } else {
                        if (f < props.min) {
                            props.min;
                        } else {
                            f;
                        };
                    };
                } else {
                    f = if (isNaN(props.min)) {
                        if (isNaN(props.max)) {
                            0;
                        } else {
                            props.max;
                        };
                    } else {
                        props.min;
                    }
                    ;
                }
                model.value = f;
                emit("change", object : UTSJSONObject() {
                    var value = f
                });
            }
            val inputConfirm = ::genInputConfirmFn;
            fun genCancelTimerFn() {
                if (props.longpress && !props.disabled) {
                    if (increaseTimer.value != null) {
                        clearInterval(increaseTimer.value!! as Number);
                        increaseTimer.value = null;
                    }
                    if (decreaseTimer.value != null) {
                        clearInterval(decreaseTimer.value as Number);
                        decreaseTimer.value = null;
                    }
                }
            }
            val cancelTimer = ::genCancelTimerFn;
            fun genStartTimerFn(name: String) {
                if (props.longpress && !props.disabled) {
                    if (name == "decrease") {
                        decreaseTimer.value = setInterval(fun(){
                            decrease();
                        }
                        , 100);
                    }
                    if (name == "increase") {
                        increaseTimer.value = setInterval(fun(){
                            increase();
                        }
                        , 100);
                    }
                }
            }
            val startTimer = ::genStartTimerFn;
            watch(model, fun(reassignedV: Number){
                var v = reassignedV;
                v = snu.other.formatNumber(v);
                if (!isNaN(props.max) && v > props.max) {
                    updateValue(props.max);
                }
                if (!isNaN(props.min) && v < props.min) {
                    updateValue(props.min);
                }
                inputValue.value = v.toString();
            }
            , WatchOptions(immediate = true));
            return fun(): Any? {
                val _component_sn_icon = resolveEasyComponent("sn-icon", GenUniModulesSinleUiComponentsSnIconSnIconClass);
                val _component_sn_button = resolveEasyComponent("sn-button", GenUniModulesSinleUiComponentsSnButtonSnButtonClass);
                val _component_sn_input = resolveEasyComponent("sn-input", GenUniModulesSinleUiComponentsSnInputSnInputClass);
                return createElementVNode("view", utsMapOf("class" to "sn-number-box", "style" to normalizeStyle(utsArrayOf(
                    unref(numberBoxStylesC),
                    _ctx.customStyle
                ))), utsArrayOf(
                    createVNode(_component_sn_button, utsMapOf("class" to "sn-number-box-action", "disabled" to unref(disableDecrease), "bgColor" to unref(buttonBgColorC), "borderRadius" to unref(borderRadiusC), "onClick" to fun(){
                        decrease();
                    }
                    , "onLongpress" to fun(){
                        startTimer("decrease");
                    }
                    , "onTouchend" to cancelTimer, "onTouchcancel" to cancelTimer, "style" to normalizeStyle(unref(actionStylesC))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_icon, utsMapOf("name" to "subtract-line", "color" to if (unref(disableDecrease)) {
                                unref(disabledTextColorC);
                            } else {
                                unref(textColorC);
                            }
                            ), null, 8, utsArrayOf(
                                "color"
                            ))
                        );
                    }
                    ), "_" to 1), 8, utsArrayOf(
                        "disabled",
                        "bgColor",
                        "borderRadius",
                        "onClick",
                        "onLongpress",
                        "style"
                    )),
                    createVNode(_component_sn_input, utsMapOf("modelValue" to unref(inputValue), "onUpdate:modelValue" to fun(`$event`: String){
                        trySetRefValue(inputValue, `$event`);
                    }
                    , "type" to "digit", "class" to "sn-number-box-inout", "borderWidth" to "0px", "align" to "center", "font" to "misans-semibold", "borderRadius" to unref(borderRadiusC), "textSize" to unref(textSizeC), "cursorColor" to unref(textColorC), "padding" to ("" + unref(inputPaddingC) + "px 5px"), "bgColor" to unref(inputBgColorC), "activeBgColor" to unref(inputActiveBgColorC), "textColor" to unref(textColorC), "disabled" to _ctx.disabled, "readonly" to _ctx.disableInput, "onBlur" to inputConfirm, "onConfirm" to inputConfirm, "style" to normalizeStyle(unref(inputStylesC))), null, 8, utsArrayOf(
                        "modelValue",
                        "borderRadius",
                        "textSize",
                        "cursorColor",
                        "padding",
                        "bgColor",
                        "activeBgColor",
                        "textColor",
                        "disabled",
                        "readonly",
                        "style"
                    )),
                    createVNode(_component_sn_button, utsMapOf("class" to "sn-number-box-action", "disabled" to unref(disableIncrease), "bgColor" to unref(buttonBgColorC), "borderRadius" to unref(borderRadiusC), "onClick" to fun(){
                        increase();
                    }
                    , "onLongpress" to fun(){
                        startTimer("increase");
                    }
                    , "onTouchend" to cancelTimer, "onTouchcancel" to cancelTimer, "style" to normalizeStyle(unref(actionStylesC))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_icon, utsMapOf("name" to "add-line", "color" to if (unref(disableIncrease)) {
                                unref(disabledTextColorC);
                            } else {
                                unref(textColorC);
                            }
                            ), null, 8, utsArrayOf(
                                "color"
                            ))
                        );
                    }
                    ), "_" to 1), 8, utsArrayOf(
                        "disabled",
                        "bgColor",
                        "borderRadius",
                        "onClick",
                        "onLongpress",
                        "style"
                    ))
                ), 4);
            }
            ;
        }
        ;
        var name = "sn-stepper";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-number-box" to padStyleMapOf(utsMapOf("flexDirection" to "row", "alignItems" to "center")), "sn-number-box-action" to padStyleMapOf(utsMapOf("justifyContent" to "center")), "sn-number-box-action-icon" to padStyleMapOf(utsMapOf("textAlign" to "center")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf("update:modelValue" to null, "change" to null);
        var props = normalizePropsOptions(utsMapOf("modelValue" to utsMapOf("type" to "Number", "default" to 0), "size" to utsMapOf("type" to "String", "default" to "30px"), "spacing" to utsMapOf("type" to "String", "default" to "2px"), "inputWidth" to utsMapOf("type" to "String", "default" to "50px"), "textSize" to utsMapOf("type" to "String", "default" to ""), "textColor" to utsMapOf("type" to "String", "default" to ""), "disabledTextColor" to utsMapOf("type" to "String", "default" to ""), "inputBgColor" to utsMapOf("type" to "String", "default" to ""), "inputActiveBgColor" to utsMapOf("type" to "String", "default" to ""), "buttonBgColor" to utsMapOf("type" to "String", "default" to ""), "borderRadius" to utsMapOf("type" to "String", "default" to ""), "min" to utsMapOf("type" to "Number", "default" to 0), "max" to utsMapOf("type" to "Number", "default" to NaN), "step" to utsMapOf("type" to "Number", "default" to 1), "longpress" to utsMapOf("type" to "Boolean", "default" to true), "disableInput" to utsMapOf("type" to "Boolean", "default" to false), "disabled" to utsMapOf("type" to "Boolean", "default" to false), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "modelValue",
            "size",
            "spacing",
            "inputWidth",
            "textSize",
            "textColor",
            "disabledTextColor",
            "inputBgColor",
            "inputActiveBgColor",
            "buttonBgColor",
            "borderRadius",
            "min",
            "max",
            "step",
            "longpress",
            "disableInput",
            "disabled",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
