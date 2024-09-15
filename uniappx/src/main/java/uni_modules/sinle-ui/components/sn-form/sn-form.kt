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
open class GenUniModulesSinleUiComponentsSnFormSnForm : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var modelValue: UTSJSONObject by `$props`;
    open var type: String by `$props`;
    open var showError: Boolean by `$props`;
    open var labelColor: String by `$props`;
    open var labelSize: String by `$props`;
    open var labelWidth: String by `$props`;
    open var showBorder: Boolean by `$props`;
    open var triggerChange: Boolean by `$props`;
    open var submit: (callback: SnFormValidResult) -> Unit
        get() {
            return unref(this.`$exposed`["submit"]) as (callback: SnFormValidResult) -> Unit;
        }
        set(value) {
            setRefValue(this.`$exposed`, "submit", value);
        }
    open var register: (item: SnFormItem) -> Unit
        get() {
            return unref(this.`$exposed`["register"]) as (item: SnFormItem) -> Unit;
        }
        set(value) {
            setRefValue(this.`$exposed`, "register", value);
        }
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnFormSnForm, _arg1: SetupContext) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props, ref1): Any? {
            var __expose = ref1.expose;
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnFormSnForm;
            val _cache = __ins.renderCache;
            val snu = `$snui`.utils;
            val colors = `$snui`.colors;
            fun emit(event: String, vararg do_not_transform_spread: Any?) {
                __ins.emit(event, *do_not_transform_spread);
            }
            val props = __props;
            val fieldList = ref(utsArrayOf<SnFormItem>());
            val childrenList = ref(utsArrayOf<GenUniModulesSinleUiComponentsSnFormItemSnFormItemComponentPublicInstance>());
            val model = computed<UTSJSONObject>(WritableComputedOptions(get = fun(): UTSJSONObject {
                return props.modelValue;
            }
            , set = fun(value: UTSJSONObject){
                emit("update:modelValue", value);
                emit("change", value);
            }
            ));
            val typeC = computed(fun(): String {
                var types = utsArrayOf(
                    "embed",
                    "float"
                );
                return if (types.includes(props.type)) {
                    props.type;
                } else {
                    "embed";
                }
                ;
            }
            );
            val labelColorC = computed(fun(): String {
                return if (props.labelColor == "") {
                    colors.value.textLight;
                } else {
                    props.labelColor;
                }
                ;
            }
            );
            val labelSizeC = computed(fun(): String {
                return if (props.labelSize == "") {
                    `$snui`.configs.font.size(3);
                } else {
                    props.labelSize;
                }
                ;
            }
            );
            val provideData = computed(fun(): Map<String, Any> {
                var map = Map<String, Any>();
                map.set("type", typeC.value);
                map.set("labelColor", labelColorC.value);
                map.set("labelSize", labelSizeC.value);
                map.set("showBorder", props.showBorder);
                map.set("showError", props.showError);
                return map;
            }
            );
            fun genProvideChildrenFn() {
                childrenList.value.forEach(fun(item: GenUniModulesSinleUiComponentsSnFormItemSnFormItemComponentPublicInstance){
                    item.`$callMethod`("setProps", provideData.value);
                }
                );
            }
            val provideChildren = ::genProvideChildrenFn;
            fun genValidFn(callback: SnFormValidResult) {
                var allow = true;
                var verifyRes = utsArrayOf<SnFormItemVerifyResult>();
                fieldList.value.forEach(fun(item: SnFormItem){
                    var field = item.field;
                    var value = model.value[field];
                    if (value != null) {
                        var item = fieldList.value.find(fun(item: SnFormItem): Boolean {
                            return item.field == field;
                        });
                        if (item != null) {
                            item.instance.`$callMethod`("verify", value, fun(res: SnFormItemVerifyResult){
                                if (!res.valid) {
                                    allow = false;
                                    verifyRes.push(res);
                                }
                            }
                            );
                        }
                    } else {
                        allow = false;
                    }
                }
                );
                if (allow) {
                    if (callback.success != null) {
                        callback.success!!();
                    }
                } else {
                    if (callback.fail != null) {
                        callback.fail!!(verifyRes);
                    }
                }
            }
            val valid = ::genValidFn;
            fun genSubmitFn(callback: SnFormValidResult) {
                valid(SnFormValidResult(success = fun(){
                    if (callback.success != null) {
                        callback.success!!();
                    }
                }
                , fail = fun(failResults: UTSArray<SnFormItemVerifyResult>){
                    if (callback.fail != null) {
                        callback.fail!!(failResults);
                    }
                }
                ));
            }
            val submit = ::genSubmitFn;
            fun genRegisterFn(item: SnFormItem) {
                fieldList.value.push(item);
                childrenList.value.push(item.instance as GenUniModulesSinleUiComponentsSnFormItemSnFormItemComponentPublicInstance);
            }
            val register = ::genRegisterFn;
            __expose(utsMapOf("submit" to submit, "register" to register));
            onMounted(fun(){
                provideChildren();
            }
            );
            watch(provideData, fun(v: Map<String, Any>){
                provideChildren();
            }
            , WatchOptions(immediate = true));
            return fun(): Any? {
                return createElementVNode("view", utsMapOf("class" to "sn-form"), utsArrayOf(
                    renderSlot(_ctx.`$slots`, "default")
                ));
            }
            ;
        }
        ;
        var name = "sn-form";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf());
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf("update:modelValue" to null, "submit" to null, "change" to null);
        var props = normalizePropsOptions(utsMapOf("modelValue" to utsMapOf("type" to "Object", "default" to fun(): UTSJSONObject {
            return UTSJSONObject();
        }
        ), "type" to utsMapOf("type" to "String", "default" to ""), "showError" to utsMapOf("type" to "Boolean", "default" to true), "labelColor" to utsMapOf("type" to "String", "default" to ""), "labelSize" to utsMapOf("type" to "String", "default" to ""), "labelWidth" to utsMapOf("type" to "String", "default" to "auto"), "showBorder" to utsMapOf("type" to "Boolean", "default" to true), "triggerChange" to utsMapOf("type" to "Boolean", "default" to true)));
        var propsNeedCastKeys = utsArrayOf(
            "modelValue",
            "type",
            "showError",
            "labelColor",
            "labelSize",
            "labelWidth",
            "showBorder",
            "triggerChange"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
