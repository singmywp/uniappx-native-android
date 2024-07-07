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
open class GenUniModulesSinleUiComponentsSnRadioGroupSnRadioGroup : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var modelValue: Number by `$props`;
    open var vertical: Boolean by `$props`;
    open var spacing: String by `$props`;
    open var radioSize: String by `$props`;
    open var radioBorderWidth: String by `$props`;
    open var radioTextSize: String by `$props`;
    open var radioBgColor: String by `$props`;
    open var disabledRadioBgColor: String by `$props`;
    open var radioActiveBgColor: String by `$props`;
    open var disabledRadioActiveBgColor: String by `$props`;
    open var radioTextColor: String by `$props`;
    open var disabledRadioTextColor: String by `$props`;
    open var radioBorderColor: String by `$props`;
    open var disabledRadioBorderColor: String by `$props`;
    open var radioActiveBorderColor: String by `$props`;
    open var disabledRadioActiveBorderColor: String by `$props`;
    open var tagType: String by `$props`;
    open var tagLevel: String by `$props`;
    open var tagTextColor: String by `$props`;
    open var disabledTagTextColor: String by `$props`;
    open var tagActiveTextColor: String by `$props`;
    open var disabledTagActiveTextColor: String by `$props`;
    open var tagTextSize: String by `$props`;
    open var tagBorderRadius: String by `$props`;
    open var tagPadding: String by `$props`;
    open var tagBgColor: String by `$props`;
    open var disabledTagBgColor: String by `$props`;
    open var tagActiveBgColor: String by `$props`;
    open var disabledTagActiveBgColor: String by `$props`;
    open var customRadioContainStyle: Any by `$props`;
    open var customRadioStyle: Any by `$props`;
    open var customTagStyle: Any by `$props`;
    open var customTextStyle: Any by `$props`;
    open var customStyle: Any by `$props`;
    open var register: (node: ComponentPublicInstance) -> Unit
        get() {
            return unref(this.`$exposed`["register"]) as (node: ComponentPublicInstance) -> Unit;
        }
        set(value) {
            setRefValue(this.`$exposed`, "register", value);
        }
    open var syncData: (node: ComponentPublicInstance) -> Unit
        get() {
            return unref(this.`$exposed`["syncData"]) as (node: ComponentPublicInstance) -> Unit;
        }
        set(value) {
            setRefValue(this.`$exposed`, "syncData", value);
        }
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnRadioGroupSnRadioGroup, _arg1: SetupContext) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props, ref1): Any? {
            var __expose = ref1.expose;
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnRadioGroupSnRadioGroup;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val snu = `$snui`.utils;
            fun emit(event: String, vararg do_not_transform_spread: Any?) {
                __ins.emit(event, *do_not_transform_spread);
            }
            val props = __props;
            val groupEle = ref(null as UniElement?);
            val nodesList = ref(utsArrayOf<ComponentPublicInstance>());
            val radioBgColorC = computed(fun(): String {
                return if (props.radioBgColor == "") {
                    colors.value.front;
                } else {
                    props.radioBgColor;
                }
                ;
            }
            );
            val disabledRadioBgColorC = computed(fun(): String {
                return if (props.disabledRadioBgColor == "") {
                    colors.value.front;
                } else {
                    props.disabledRadioBgColor;
                }
                ;
            }
            );
            val radioActiveBgColorC = computed(fun(): String {
                return if (props.radioActiveBgColor == "") {
                    colors.value.front;
                } else {
                    props.radioActiveBgColor;
                }
                ;
            }
            );
            val disabledRadioActiveBgColorC = computed(fun(): String {
                return if (props.disabledRadioActiveBgColor == "") {
                    colors.value.front;
                } else {
                    props.disabledRadioActiveBgColor;
                }
                ;
            }
            );
            val radioTextColorC = computed(fun(): String {
                return if (props.radioTextColor == "") {
                    colors.value.text;
                } else {
                    props.radioTextColor;
                }
                ;
            }
            );
            val disabledRadioTextColorC = computed(fun(): String {
                return if (props.disabledRadioTextColor == "") {
                    colors.value.disabledText;
                } else {
                    props.disabledRadioTextColor;
                }
                ;
            }
            );
            val radioBorderColorC = computed(fun(): String {
                return if (props.radioBorderColor == "") {
                    colors.value.line;
                } else {
                    props.radioBorderColor;
                }
                ;
            }
            );
            val disabledRadioBorderColorC = computed(fun(): String {
                return if (props.disabledRadioBorderColor == "") {
                    colors.value.disabled;
                } else {
                    props.disabledRadioBorderColor;
                }
                ;
            }
            );
            val radioActiveBorderColorC = computed(fun(): String {
                return if (props.radioActiveBorderColor == "") {
                    colors.value.primary;
                } else {
                    props.radioActiveBorderColor;
                }
                ;
            }
            );
            val disabledRadioActiveBorderColorC = computed(fun(): String {
                return if (props.disabledRadioActiveBorderColor == "") {
                    colors.value.disabledDark;
                } else {
                    props.disabledRadioActiveBorderColor;
                }
                ;
            }
            );
            val groupClassesC = computed(fun(): Map<String, Any> {
                var classes = Map<String, Any>();
                classes.set("sn-radio-group-vertical", props.vertical);
                classes.set("sn-radio-group-horizontal", !props.vertical);
                return classes;
            }
            );
            provide("spacing", props.spacing);
            provide("radioSize", props.radioSize);
            provide("radioBorderWidth", props.radioBorderWidth);
            provide("radioTextSize", props.radioTextSize);
            provide("radioBgColor", radioBgColorC.value);
            provide("disabledRadioBgColor", disabledRadioBgColorC.value);
            provide("radioActiveBgColor", radioActiveBgColorC.value);
            provide("disabledRadioActiveBgColor", disabledRadioActiveBgColorC.value);
            provide("radioTextColor", radioTextColorC.value);
            provide("disabledRadioTextColor", disabledRadioTextColorC.value);
            provide("radioBorderColor", radioBorderColorC.value);
            provide("disabledRadioBorderColor", disabledRadioBorderColorC.value);
            provide("radioActiveBorderColor", radioActiveBorderColorC.value);
            provide("disabledRadioActiveBorderColor", disabledRadioActiveBorderColorC.value);
            provide("tagType", props.tagType);
            provide("tagLevel", props.tagLevel);
            provide("tagTextColor", props.tagTextColor);
            provide("disabledTagTextColor", props.disabledTagTextColor);
            provide("tagActiveTextColor", props.tagActiveTextColor);
            provide("disabledTagActiveTextColor", props.disabledTagActiveTextColor);
            provide("tagTextSize", props.tagTextSize);
            provide("tagBorderRadius", props.tagBorderRadius);
            provide("tagPadding", props.tagPadding);
            provide("tagBgColor", props.tagBgColor);
            provide("disabledTagBgColor", props.disabledTagBgColor);
            provide("tagActiveBgColor", props.tagActiveBgColor);
            provide("disabledTagActiveBgColor", props.disabledTagActiveBgColor);
            provide("customRadioContainStyle", props.customRadioContainStyle);
            provide("customRadioStyle", props.customRadioStyle);
            provide("customTagStyle", props.customTagStyle);
            provide("customTextStyle", props.customTextStyle);
            val model = computed<Number>(WritableComputedOptions(get = fun(): Number {
                return props.modelValue;
            }
            , set = fun(value: Number){
                emit("update:modelValue", value as Number);
                emit("change", object : UTSJSONObject() {
                    var value = value
                });
            }
            ));
            fun genRegisterFn(node: ComponentPublicInstance) {
                nodesList.value.push(node);
            }
            val register = ::genRegisterFn;
            fun genSetNodesValueFn() {
                nodesList.value.forEach(fun(node: ComponentPublicInstance, index: Number){
                    node.`$callMethod`("updateValue", model.value == index);
                }
                );
            }
            val setNodesValue = ::genSetNodesValueFn;
            fun genSyncDataFn(node: ComponentPublicInstance) {
                model.value = nodesList.value.indexOf(node);
            }
            val syncData = ::genSyncDataFn;
            __expose(utsMapOf("register" to register, "syncData" to syncData));
            onMounted(fun(){
                nextTick(fun(){
                    setNodesValue();
                }
                );
            }
            );
            watch(model, fun(){
                setNodesValue();
            }
            );
            return fun(): Any? {
                return createElementVNode("view", utsMapOf("class" to normalizeClass(utsArrayOf(
                    "sn-radio-group",
                    unref(groupClassesC)
                )), "ref_key" to "groupEle", "ref" to groupEle, "style" to normalizeStyle(utsArrayOf(
                    _ctx.customStyle
                ))), utsArrayOf(
                    renderSlot(_ctx.`$slots`, "default")
                ), 6);
            }
            ;
        }
        ;
        var name = "sn-radio-group";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-radio-group" to padStyleMapOf(utsMapOf("display" to "flex", "flexWrap" to "wrap")), "sn-radio-group-horizontal" to padStyleMapOf(utsMapOf("flexDirection" to "row")), "sn-radio-group-vertical" to padStyleMapOf(utsMapOf("flexDirection" to "column")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf("change" to null, "update:modelValue" to null);
        var props = normalizePropsOptions(utsMapOf("modelValue" to utsMapOf("type" to "Number", "default" to 0), "vertical" to utsMapOf("type" to "Boolean", "default" to false), "spacing" to utsMapOf("type" to "String", "default" to "15px"), "radioSize" to utsMapOf("type" to "String", "default" to "20px"), "radioBorderWidth" to utsMapOf("type" to "String", "default" to "2px"), "radioTextSize" to utsMapOf("type" to "String", "default" to `$snui`.configs.font.size(3)), "radioBgColor" to utsMapOf("type" to "String", "default" to ""), "disabledRadioBgColor" to utsMapOf("type" to "String", "default" to ""), "radioActiveBgColor" to utsMapOf("type" to "String", "default" to ""), "disabledRadioActiveBgColor" to utsMapOf("type" to "String", "default" to ""), "radioTextColor" to utsMapOf("type" to "String", "default" to ""), "disabledRadioTextColor" to utsMapOf("type" to "String", "default" to ""), "radioBorderColor" to utsMapOf("type" to "String", "default" to ""), "disabledRadioBorderColor" to utsMapOf("type" to "String", "default" to ""), "radioActiveBorderColor" to utsMapOf("type" to "String", "default" to ""), "disabledRadioActiveBorderColor" to utsMapOf("type" to "String", "default" to ""), "tagType" to utsMapOf("type" to "String", "default" to "primary"), "tagLevel" to utsMapOf("type" to "String", "default" to "second"), "tagTextColor" to utsMapOf("type" to "String", "default" to ""), "disabledTagTextColor" to utsMapOf("type" to "String", "default" to ""), "tagActiveTextColor" to utsMapOf("type" to "String", "default" to ""), "disabledTagActiveTextColor" to utsMapOf("type" to "String", "default" to ""), "tagTextSize" to utsMapOf("type" to "String", "default" to `$snui`.configs.font.size(2)), "tagBorderRadius" to utsMapOf("type" to "String", "default" to "10px"), "tagPadding" to utsMapOf("type" to "String", "default" to "6px 10px"), "tagBgColor" to utsMapOf("type" to "String", "default" to ""), "disabledTagBgColor" to utsMapOf("type" to "String", "default" to ""), "tagActiveBgColor" to utsMapOf("type" to "String", "default" to ""), "disabledTagActiveBgColor" to utsMapOf("type" to "String", "default" to ""), "customRadioContainStyle" to utsMapOf("default" to UTSJSONObject()), "customRadioStyle" to utsMapOf("default" to UTSJSONObject()), "customTagStyle" to utsMapOf("default" to UTSJSONObject()), "customTextStyle" to utsMapOf("default" to UTSJSONObject()), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "modelValue",
            "vertical",
            "spacing",
            "radioSize",
            "radioBorderWidth",
            "radioTextSize",
            "radioBgColor",
            "disabledRadioBgColor",
            "radioActiveBgColor",
            "disabledRadioActiveBgColor",
            "radioTextColor",
            "disabledRadioTextColor",
            "radioBorderColor",
            "disabledRadioBorderColor",
            "radioActiveBorderColor",
            "disabledRadioActiveBorderColor",
            "tagType",
            "tagLevel",
            "tagTextColor",
            "disabledTagTextColor",
            "tagActiveTextColor",
            "disabledTagActiveTextColor",
            "tagTextSize",
            "tagBorderRadius",
            "tagPadding",
            "tagBgColor",
            "disabledTagBgColor",
            "tagActiveBgColor",
            "disabledTagActiveBgColor",
            "customRadioContainStyle",
            "customRadioStyle",
            "customTagStyle",
            "customTextStyle",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
