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
open class GenUniModulesSinleUiComponentsSnCheckboxGroupSnCheckboxGroup : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var modelValue: UTSArray<Any?> by `$props`;
    open var vertical: Boolean by `$props`;
    open var spacing: String by `$props`;
    open var boxSize: String by `$props`;
    open var boxBorderRadius: String by `$props`;
    open var boxBorderWidth: String by `$props`;
    open var boxTextSize: String by `$props`;
    open var boxTextColor: String by `$props`;
    open var disabledBoxTextColor: String by `$props`;
    open var boxIcon: String by `$props`;
    open var boxIconSize: String by `$props`;
    open var boxIconColor: String by `$props`;
    open var disabledBoxIconColor: String by `$props`;
    open var boxBorderColor: String by `$props`;
    open var disabledBoxBorderColor: String by `$props`;
    open var boxActiveBorderColor: String by `$props`;
    open var disabledBoxActiveBorderColor: String by `$props`;
    open var boxBgColor: String by `$props`;
    open var disabledBoxBgColor: String by `$props`;
    open var boxActiveBgColor: String by `$props`;
    open var disabledBoxActiveBgColor: String by `$props`;
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
    open var customBoxContainStyle: Any by `$props`;
    open var customBoxStyle: Any by `$props`;
    open var customBoxIconStyle: Any by `$props`;
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
    open var syncData: (node: ComponentPublicInstance, value: Boolean) -> Unit
        get() {
            return unref(this.`$exposed`["syncData"]) as (node: ComponentPublicInstance, value: Boolean) -> Unit;
        }
        set(value) {
            setRefValue(this.`$exposed`, "syncData", value);
        }
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnCheckboxGroupSnCheckboxGroup, _arg1: SetupContext) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props, ref1): Any? {
            var __expose = ref1.expose;
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnCheckboxGroupSnCheckboxGroup;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            fun emit(event: String, vararg do_not_transform_spread: Any?) {
                __ins.emit(event, *do_not_transform_spread);
            }
            val props = __props;
            val groupEle = ref(null as UniElement?);
            val nodesList = ref(utsArrayOf<ComponentPublicInstance>());
            val boxTextColorC = computed(fun(): String {
                return if (props.boxTextColor == "") {
                    colors.value.text;
                } else {
                    props.boxTextColor;
                }
                ;
            }
            );
            val disabledBoxTextColorC = computed(fun(): String {
                return if (props.disabledBoxTextColor == "") {
                    colors.value.disabledText;
                } else {
                    props.disabledBoxTextColor;
                }
                ;
            }
            );
            val boxBorderColorC = computed(fun(): String {
                return if (props.boxBorderColor == "") {
                    colors.value.line;
                } else {
                    props.boxBorderColor;
                }
                ;
            }
            );
            val disabledBoxBorderColorC = computed(fun(): String {
                return if (props.disabledBoxBorderColor == "") {
                    colors.value.disabled;
                } else {
                    props.disabledBoxBorderColor;
                }
                ;
            }
            );
            val boxActiveBorderColorC = computed(fun(): String {
                return if (props.boxActiveBorderColor == "") {
                    colors.value.primary;
                } else {
                    props.boxActiveBorderColor;
                }
                ;
            }
            );
            val disabledBoxActiveBorderColorC = computed(fun(): String {
                return if (props.disabledBoxActiveBorderColor == "") {
                    colors.value.disabledText;
                } else {
                    props.disabledBoxActiveBorderColor;
                }
                ;
            }
            );
            val boxBgColorC = computed(fun(): String {
                return if (props.boxBgColor == "") {
                    colors.value.transparent;
                } else {
                    props.boxBgColor;
                }
                ;
            }
            );
            val disabledBoxBgColorC = computed(fun(): String {
                return if (props.disabledBoxBgColor == "") {
                    colors.value.disabled;
                } else {
                    props.disabledBoxBgColor;
                }
                ;
            }
            );
            val boxActiveBgColorC = computed(fun(): String {
                return if (props.boxActiveBgColor == "") {
                    colors.value.primary;
                } else {
                    props.boxActiveBgColor;
                }
                ;
            }
            );
            val disabledBoxActiveBgColorC = computed(fun(): String {
                return if (props.disabledBoxActiveBgColor == "") {
                    colors.value.disabledText;
                } else {
                    props.disabledBoxActiveBgColor;
                }
                ;
            }
            );
            val boxSizeC = computed(fun(): String {
                return if (props.boxSize == "") {
                    "" + (`$snui`.utils.getPx(`$snui`.configs.font.size(3)) + 6) + "px";
                } else {
                    props.boxSize;
                }
                ;
            }
            );
            val boxTextSizeC = computed(fun(): String {
                return if (props.boxTextSize == "") {
                    `$snui`.configs.font.size(3);
                } else {
                    props.boxTextSize;
                }
                ;
            }
            );
            val boxIconSizeC = computed(fun(): String {
                return if (props.boxIconSize == "") {
                    `$snui`.configs.font.size(3);
                } else {
                    props.boxIconSize;
                }
                ;
            }
            );
            val tagTextSizeC = computed(fun(): String {
                return if (props.tagTextSize == "") {
                    `$snui`.configs.font.size(2);
                } else {
                    props.tagTextSize;
                }
                ;
            }
            );
            val groupClassesC = computed(fun(): Map<String, Any> {
                var classes = Map<String, Any>();
                classes.set("sn-checkbox-group-vertical", props.vertical);
                classes.set("sn-checkbox-group-horizontal", !props.vertical);
                return classes;
            }
            );
            provide("vertical", props.vertical);
            provide("spacing", props.spacing);
            provide("boxSize", boxSizeC.value);
            provide("boxBorderRadius", props.boxBorderRadius);
            provide("boxBorderWidth", props.boxBorderWidth);
            provide("boxTextSize", boxTextSizeC.value);
            provide("boxTextColor", boxTextColorC.value);
            provide("disabledBoxTextColor", disabledBoxTextColorC.value);
            provide("boxIcon", props.boxIcon);
            provide("boxIconSize", boxIconSizeC.value);
            provide("boxIconColor", props.boxIconColor);
            provide("disabledBoxIconColor", props.disabledBoxIconColor);
            provide("boxBorderColor", boxBorderColorC.value);
            provide("disabledBoxBorderColor", disabledBoxBorderColorC.value);
            provide("boxActiveBorderColor", boxActiveBorderColorC.value);
            provide("disabledBoxActiveBorderColor", disabledBoxActiveBorderColorC.value);
            provide("boxBgColor", boxBgColorC.value);
            provide("disabledBoxBgColor", disabledBoxBgColorC.value);
            provide("boxActiveBgColor", boxActiveBgColorC.value);
            provide("disabledBoxActiveBgColor", disabledBoxActiveBgColorC.value);
            provide("tagType", props.tagType);
            provide("tagLevel", props.tagLevel);
            provide("tagTextColor", props.tagTextColor);
            provide("disabledTagTextColor", props.disabledTagTextColor);
            provide("tagActiveTextColor", props.tagActiveTextColor);
            provide("disabledTagActiveTextColor", props.disabledTagActiveTextColor);
            provide("tagTextSize", tagTextSizeC.value);
            provide("tagBorderRadius", props.tagBorderRadius);
            provide("tagPadding", props.tagPadding);
            provide("tagBgColor", props.tagBgColor);
            provide("disabledTagBgColor", props.disabledTagBgColor);
            provide("tagActiveBgColor", props.tagActiveBgColor);
            provide("disabledTagActiveBgColor", props.disabledTagActiveBgColor);
            provide("customBoxContainStyle", props.customBoxContainStyle);
            provide("customBoxStyle", props.customBoxStyle);
            provide("customBoxIconStyle", props.customBoxIconStyle);
            provide("customTagStyle", props.customTagStyle);
            provide("customTextStyle", props.customTextStyle);
            val model = computed<UTSArray<Number>>(WritableComputedOptions(get = fun(): UTSArray<Number> {
                return props.modelValue as UTSArray<Number>;
            }
            , set = fun(value: UTSArray<Number>){
                emit("update:modelValue", value);
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
                    node.`$callMethod`("updateValue", model.value.includes(index));
                }
                );
            }
            val setNodesValue = ::genSetNodesValueFn;
            fun genSyncDataFn(node: ComponentPublicInstance, value: Boolean) {
                var index = nodesList.value.indexOf(node);
                var tmpModel = model.value;
                if (tmpModel.includes(index) && !value) {
                    tmpModel.splice(tmpModel.indexOf(index), 1);
                } else if (!tmpModel.includes(index) && value) {
                    tmpModel.push(index);
                    tmpModel.sort();
                }
                model.value = tmpModel;
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
            watch(props.modelValue, fun(){
                setNodesValue();
            }
            );
            return fun(): Any? {
                return createElementVNode("view", utsMapOf("class" to normalizeClass(utsArrayOf(
                    "sn-checkbox-group",
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
        var name = "sn-checkbox-group";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-checkbox-group" to padStyleMapOf(utsMapOf("display" to "flex", "flexWrap" to "wrap")), "sn-checkbox-group-horizontal" to padStyleMapOf(utsMapOf("flexDirection" to "row")), "sn-checkbox-group-vertical" to padStyleMapOf(utsMapOf("flexDirection" to "column")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf("change" to null, "update:modelValue" to null);
        var props = normalizePropsOptions(utsMapOf("modelValue" to utsMapOf("type" to "Array", "default" to utsArrayOf<Number>()), "vertical" to utsMapOf("type" to "Boolean", "default" to false), "spacing" to utsMapOf("type" to "String", "default" to "15px"), "boxSize" to utsMapOf("type" to "String", "default" to ""), "boxBorderRadius" to utsMapOf("type" to "String", "default" to "5px"), "boxBorderWidth" to utsMapOf("type" to "String", "default" to "2px"), "boxTextSize" to utsMapOf("type" to "String", "default" to ""), "boxTextColor" to utsMapOf("type" to "String", "default" to ""), "disabledBoxTextColor" to utsMapOf("type" to "String", "default" to ""), "boxIcon" to utsMapOf("type" to "String", "default" to "check-fill"), "boxIconSize" to utsMapOf("type" to "String", "default" to ""), "boxIconColor" to utsMapOf("type" to "String", "default" to "#fff"), "disabledBoxIconColor" to utsMapOf("type" to "String", "default" to "#fff"), "boxBorderColor" to utsMapOf("type" to "String", "default" to ""), "disabledBoxBorderColor" to utsMapOf("type" to "String", "default" to ""), "boxActiveBorderColor" to utsMapOf("type" to "String", "default" to ""), "disabledBoxActiveBorderColor" to utsMapOf("type" to "String", "default" to ""), "boxBgColor" to utsMapOf("type" to "String", "default" to ""), "disabledBoxBgColor" to utsMapOf("type" to "String", "default" to ""), "boxActiveBgColor" to utsMapOf("type" to "String", "default" to ""), "disabledBoxActiveBgColor" to utsMapOf("type" to "String", "default" to ""), "tagType" to utsMapOf("type" to "String", "default" to "primary"), "tagLevel" to utsMapOf("type" to "String", "default" to "second"), "tagTextColor" to utsMapOf("type" to "String", "default" to ""), "disabledTagTextColor" to utsMapOf("type" to "String", "default" to ""), "tagActiveTextColor" to utsMapOf("type" to "String", "default" to ""), "disabledTagActiveTextColor" to utsMapOf("type" to "String", "default" to ""), "tagTextSize" to utsMapOf("type" to "String", "default" to ""), "tagBorderRadius" to utsMapOf("type" to "String", "default" to "10px"), "tagPadding" to utsMapOf("type" to "String", "default" to "6px 10px"), "tagBgColor" to utsMapOf("type" to "String", "default" to ""), "disabledTagBgColor" to utsMapOf("type" to "String", "default" to ""), "tagActiveBgColor" to utsMapOf("type" to "String", "default" to ""), "disabledTagActiveBgColor" to utsMapOf("type" to "String", "default" to ""), "customBoxContainStyle" to utsMapOf("default" to UTSJSONObject()), "customBoxStyle" to utsMapOf("default" to UTSJSONObject()), "customBoxIconStyle" to utsMapOf("default" to UTSJSONObject()), "customTagStyle" to utsMapOf("default" to UTSJSONObject()), "customTextStyle" to utsMapOf("default" to UTSJSONObject()), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "modelValue",
            "vertical",
            "spacing",
            "boxSize",
            "boxBorderRadius",
            "boxBorderWidth",
            "boxTextSize",
            "boxTextColor",
            "disabledBoxTextColor",
            "boxIcon",
            "boxIconSize",
            "boxIconColor",
            "disabledBoxIconColor",
            "boxBorderColor",
            "disabledBoxBorderColor",
            "boxActiveBorderColor",
            "disabledBoxActiveBorderColor",
            "boxBgColor",
            "disabledBoxBgColor",
            "boxActiveBgColor",
            "disabledBoxActiveBgColor",
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
            "customBoxContainStyle",
            "customBoxStyle",
            "customBoxIconStyle",
            "customTagStyle",
            "customTextStyle",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
