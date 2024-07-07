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
open class GenPagesComponentsSnStepper : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnStepper) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnStepper;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val v1 = ref(0);
            val v2 = ref(0);
            val v3 = ref(0);
            val v4 = ref(0);
            val v5 = ref(5);
            val v6 = ref(0);
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_stepper = resolveEasyComponent("sn-stepper", GenUniModulesSinleUiComponentsSnStepperSnStepperClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Stepper 步进器")),
                        createVNode(_component_com_card, utsMapOf("title" to "基础用法", "note" to "据我所知，它在购物页面里很常见\\n长按按钮可以快速增减哦"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_stepper, utsMapOf("modelValue" to unref(v1), "onUpdate:modelValue" to fun(`$event`: Number){
                                    trySetRefValue(v1, `$event`);
                                }
                                ), null, 8, utsArrayOf(
                                    "modelValue"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "最值及步长", "note" to "可以为步进器设置最小值、最大值及步长。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("class" to "spacing", "type" to "info", "text" to "最大值: 38.5, 最小值:2, 步长:5.5", "size" to "14px")),
                                createVNode(_component_sn_stepper, utsMapOf("modelValue" to unref(v2), "onUpdate:modelValue" to fun(`$event`: Number){
                                    trySetRefValue(v2, `$event`);
                                }
                                , "max" to 38.5, "min" to 2, "step" to 5.5), null, 8, utsArrayOf(
                                    "modelValue"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "禁用长按", "note" to "如果你不需要长按按钮增减的功能，可以在这里禁用"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_stepper, utsMapOf("modelValue" to unref(v3), "onUpdate:modelValue" to fun(`$event`: Number){
                                    trySetRefValue(v3, `$event`);
                                }
                                , "longpress" to false), null, 8, utsArrayOf(
                                    "modelValue"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "禁用输入框", "note" to "如果你不需要输入框编辑的功能，可以在这里禁用"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_stepper, utsMapOf("modelValue" to unref(v4), "onUpdate:modelValue" to fun(`$event`: Number){
                                    trySetRefValue(v4, `$event`);
                                }
                                , "disable-input" to ""), null, 8, utsArrayOf(
                                    "modelValue"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "禁用", "note" to "禁用整个组件的操作（但不会屏蔽数据上的修改）"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_stepper, utsMapOf("modelValue" to unref(v5), "onUpdate:modelValue" to fun(`$event`: Number){
                                    trySetRefValue(v5, `$event`);
                                }
                                , "disabled" to ""), null, 8, utsArrayOf(
                                    "modelValue"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "自定义样式", "note" to "调出你喜欢的样子"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_stepper, utsMapOf("modelValue" to unref(v6), "onUpdate:modelValue" to fun(`$event`: Number){
                                    trySetRefValue(v6, `$event`);
                                }
                                , "class" to "spacing", "bgColor" to unref(colors).primaryLight, "textColor" to unref(colors).primary), null, 8, utsArrayOf(
                                    "modelValue",
                                    "bgColor",
                                    "textColor"
                                )),
                                createVNode(_component_sn_stepper, utsMapOf("modelValue" to unref(v6), "onUpdate:modelValue" to fun(`$event`: Number){
                                    trySetRefValue(v6, `$event`);
                                }
                                , "text-size" to "20px", "size" to "40px", "input-width" to "100px", "spacing" to "10px", "bgColor" to unref(colors).successLight, "borderRadius" to unref(`$snui`).configs.radius.circle, "textColor" to unref(colors).success), null, 8, utsArrayOf(
                                    "modelValue",
                                    "bgColor",
                                    "borderRadius",
                                    "textColor"
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
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ), utsArrayOf(
                    GenApp.styles
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("spacing" to padStyleMapOf(utsMapOf("marginBottom" to 5)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
