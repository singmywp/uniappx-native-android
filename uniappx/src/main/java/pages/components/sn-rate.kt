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
open class GenPagesComponentsSnRate : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnRate) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnRate;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val v1 = ref(3);
            val v2 = ref(2);
            val v3 = ref(5);
            val v4 = ref(2.5);
            val v5 = ref(0);
            val v6 = ref(0);
            val rateEle = ref(null as GenUniModulesSinleUiComponentsSnRateSnRateComponentPublicInstance?);
            val vreadonly = ref(4.5);
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_alert = resolveEasyComponent("sn-alert", GenUniModulesSinleUiComponentsSnAlertSnAlertClass);
                val _component_sn_rate = resolveEasyComponent("sn-rate", GenUniModulesSinleUiComponentsSnRateSnRateClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_gap = resolveEasyComponent("sn-gap", GenUniModulesSinleUiComponentsSnGapSnGapClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Rate 评分")),
                        createVNode(_component_sn_alert, utsMapOf("type" to "warning", "icon" to "notification-4-fill", "text" to "如果你只需要显示评分而无需用户操作，使用只占用一个 DOM 的 sn-icon 足以满足你的需求，且性能更佳（参考 hello-uni-app x 长列表示例）。")),
                        createVNode(_component_com_card, utsMapOf("title" to "基础用法", "note" to "普普通通的评分组件，不过只占用三个DOM，性能优秀，力求使用更少的 DOM，提供更多的玩法。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_rate, utsMapOf("modelValue" to unref(v1), "onUpdate:modelValue" to fun(`$event`: Number){
                                    trySetRefValue(v1, `$event`);
                                }
                                ), null, 8, utsArrayOf(
                                    "modelValue"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "颜色", "note" to "平凡普通的星星，也会绽放绚丽的色彩"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_rate, utsMapOf("modelValue" to unref(v2), "onUpdate:modelValue" to fun(`$event`: Number){
                                    trySetRefValue(v2, `$event`);
                                }
                                , "activeColor" to unref(colors).dark, "inactiveColor" to "#c3c3c3"), null, 8, utsArrayOf(
                                    "modelValue",
                                    "activeColor"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "图标", "note" to "除了星星之外，你还可以设置其他的图标，比如，一颗怦动鲜活的爱心。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_rate, utsMapOf("modelValue" to unref(v3), "onUpdate:modelValue" to fun(`$event`: Number){
                                    trySetRefValue(v3, `$event`);
                                }
                                , "icon" to "heart-fill", "active-icon" to "heart-fill", "active-color" to "#f05811"), null, 8, utsArrayOf(
                                    "modelValue"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "允许半选", "note" to "有时，你可能需要更精细的分值️"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_rate, utsMapOf("modelValue" to unref(v4), "onUpdate:modelValue" to fun(`$event`: Number){
                                    trySetRefValue(v4, `$event`);
                                }
                                , "allow-half" to ""), null, 8, utsArrayOf(
                                    "modelValue"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "可清空", "note" to "设置后，点击当前的位置会清空值"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_rate, utsMapOf("modelValue" to unref(v5), "onUpdate:modelValue" to fun(`$event`: Number){
                                    trySetRefValue(v5, `$event`);
                                }
                                , "clearable" to ""), null, 8, utsArrayOf(
                                    "modelValue"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "只读", "note" to "没什么可说的。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_rate, utsMapOf("modelValue" to unref(vreadonly), "onUpdate:modelValue" to fun(`$event`: Number){
                                    trySetRefValue(vreadonly, `$event`);
                                }
                                , "allow-half" to "", "readonly" to ""), null, 8, utsArrayOf(
                                    "modelValue"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "数量", "note" to "自定义评分值的范围"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_rate, utsMapOf("ref_key" to "rateEle", "ref" to rateEle, "modelValue" to unref(v6), "onUpdate:modelValue" to fun(`$event`: Number){
                                    trySetRefValue(v6, `$event`);
                                }
                                , "count" to 8), null, 8, utsArrayOf(
                                    "modelValue"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_sn_gap)
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
