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
open class GenPagesComponentsSnForm : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnForm) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnForm;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val formEle = ref(null as GenUniModulesSinleUiComponentsSnFormSnFormComponentPublicInstance?);
            val formData = ref(object : UTSJSONObject() {
                var name = ""
                var age: Number = 18
                var inParty = false
                var phone = ""
                var gender = 0 as Number
            });
            val nameRule = ref(SnFormItemRule(type = "chinese", required = true, message = "请填写正确的中文姓名", valid = fun(value: Any): String {
                if ((value as String).length > 10) {
                    return "姓名过长";
                }
                return "";
            }
            ));
            val ageRule = ref(SnFormItemRule(type = "integer", required = true, message = "请填写正确的年龄"));
            val inPartyRule = ref(SnFormItemRule(type = "boolean", required = true));
            val phoneRule = ref(SnFormItemRule(type = "phone", required = true, message = "请输入正确的手机号码"));
            val genderRule = ref(SnFormItemRule(type = "enum", `enum` = utsArrayOf(
                0,
                1
            ), required = true, message = "请选择性别"));
            fun genSubmitFn() {
                formEle.value!!.`$callMethod`("submit", SnFormValidResult(success = fun(){
                    console.log("submited 成功 请求云端", JSON.stringify(formData.value), " at pages/components/sn-form.uvue:61");
                }
                , fail = fun(e){
                    console.log("submited 失败", e, " at pages/components/sn-form.uvue:64");
                }
                ));
            }
            val submit = ::genSubmitFn;
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_input = resolveEasyComponent("sn-input", GenUniModulesSinleUiComponentsSnInputSnInputClass);
                val _component_sn_form_item = resolveEasyComponent("sn-form-item", GenUniModulesSinleUiComponentsSnFormItemSnFormItemClass);
                val _component_sn_radio = resolveEasyComponent("sn-radio", GenUniModulesSinleUiComponentsSnRadioSnRadioClass);
                val _component_sn_radio_group = resolveEasyComponent("sn-radio-group", GenUniModulesSinleUiComponentsSnRadioGroupSnRadioGroupClass);
                val _component_sn_stepper = resolveEasyComponent("sn-stepper", GenUniModulesSinleUiComponentsSnStepperSnStepperClass);
                val _component_sn_switch = resolveEasyComponent("sn-switch", GenUniModulesSinleUiComponentsSnSwitchSnSwitchClass);
                val _component_sn_gap = resolveEasyComponent("sn-gap", GenUniModulesSinleUiComponentsSnGapSnGapClass);
                val _component_sn_button = resolveEasyComponent("sn-button", GenUniModulesSinleUiComponentsSnButtonSnButtonClass);
                val _component_sn_form = resolveEasyComponent("sn-form", GenUniModulesSinleUiComponentsSnFormSnFormClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Form 表单")),
                        createVNode(_component_com_card, utsMapOf("title" to "基本用法"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_form, utsMapOf("ref_key" to "formEle", "ref" to formEle, "modelValue" to unref(formData), "onUpdate:modelValue" to fun(`$event`: UTSJSONObject){
                                    trySetRefValue(formData, `$event`);
                                }
                                , "showBorder" to false), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_form_item, utsMapOf("label" to "姓名", "field" to "name", "required" to "", "rule" to unref(nameRule)), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_input, utsMapOf("modelValue" to unref(formData)["name"], "onUpdate:modelValue" to fun(`$event`: String){
                                                    unref(formData)["name"] = `$event`;
                                                }
                                                , "align" to "right"), null, 8, utsArrayOf(
                                                    "modelValue",
                                                    "onUpdate:modelValue"
                                                ))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "rule"
                                        )),
                                        createVNode(_component_sn_form_item, utsMapOf("label" to "性别", "field" to "gender", "required" to "", "rule" to unref(genderRule)), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_radio_group, utsMapOf("modelValue" to unref(formData)["gender"], "onUpdate:modelValue" to fun(`$event`: Number){
                                                    unref(formData)["gender"] = `$event`;
                                                }
                                                , "spacing" to "0px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                                    return utsArrayOf(
                                                        createVNode(_component_sn_radio, utsMapOf("text" to "男", "style" to normalizeStyle(utsMapOf("margin-right" to "20px"))), null, 8, utsArrayOf(
                                                            "style"
                                                        )),
                                                        createVNode(_component_sn_radio, utsMapOf("text" to "女"))
                                                    );
                                                }
                                                ), "_" to 1), 8, utsArrayOf(
                                                    "modelValue",
                                                    "onUpdate:modelValue"
                                                ))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "rule"
                                        )),
                                        createVNode(_component_sn_form_item, utsMapOf("label" to "年龄", "field" to "age", "required" to "", "rule" to unref(ageRule)), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_stepper, utsMapOf("modelValue" to unref(formData)["age"], "onUpdate:modelValue" to fun(`$event`: Number){
                                                    unref(formData)["age"] = `$event`;
                                                }
                                                , "min" to 18), null, 8, utsArrayOf(
                                                    "modelValue",
                                                    "onUpdate:modelValue"
                                                ))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "rule"
                                        )),
                                        createVNode(_component_sn_form_item, utsMapOf("label" to "是否党员", "field" to "inParty", "required" to "", "rule" to unref(inPartyRule)), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(formData)["inParty"], "onUpdate:modelValue" to fun(`$event`: Boolean){
                                                    unref(formData)["inParty"] = `$event`;
                                                }
                                                ), null, 8, utsArrayOf(
                                                    "modelValue",
                                                    "onUpdate:modelValue"
                                                ))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "rule"
                                        )),
                                        createVNode(_component_sn_form_item, utsMapOf("label" to "手机号码", "field" to "phone", "required" to "", "rule" to unref(phoneRule)), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_input, utsMapOf("modelValue" to unref(formData)["phone"], "onUpdate:modelValue" to fun(`$event`: String){
                                                    unref(formData)["phone"] = `$event`;
                                                }
                                                , "align" to "right"), null, 8, utsArrayOf(
                                                    "modelValue",
                                                    "onUpdate:modelValue"
                                                ))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "rule"
                                        )),
                                        createVNode(_component_sn_gap, utsMapOf("height" to "20px")),
                                        createVNode(_component_sn_button, utsMapOf("type" to "primary", "text" to "提交", "onClick" to submit))
                                    );
                                }
                                ), "_" to 1), 8, utsArrayOf(
                                    "modelValue"
                                ))
                            );
                        }
                        ), "_" to 1))
                    );
                }
                ), "_" to 1));
            }
            ;
        }
        ;
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(), utsArrayOf(
                    GenApp.styles
                ));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
