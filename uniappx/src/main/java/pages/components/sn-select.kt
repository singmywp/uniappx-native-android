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
open class GenPagesComponentsSnSelect : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnSelect) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnSelect;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val data1 = utsArrayOf(
                object : UTSJSONObject() {
                    var id = "apple"
                    var text = "苹果"
                },
                object : UTSJSONObject() {
                    var id = "banana"
                    var text = "香蕉"
                },
                object : UTSJSONObject() {
                    var id = "orange"
                    var text = "橘子"
                },
                object : UTSJSONObject() {
                    var id = "grape"
                    var text = "葡萄"
                }
            );
            val v = ref(0);
            val disabled = ref(true);
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_select = resolveEasyComponent("sn-select", GenUniModulesSinleUiComponentsSnSelectSnSelectClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_sn_switch = resolveEasyComponent("sn-switch", GenUniModulesSinleUiComponentsSnSwitchSnSwitchClass);
                val _component_sn_row = resolveEasyComponent("sn-row", GenUniModulesSinleUiComponentsSnRowSnRowClass);
                val _component_sn_card = resolveEasyComponent("sn-card", GenUniModulesSinleUiComponentsSnCardSnCardClass);
                val _component_sn_gap = resolveEasyComponent("sn-gap", GenUniModulesSinleUiComponentsSnGapSnGapClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Select 选择框")),
                        createVNode(_component_com_card, utsMapOf("title" to "基础用法", "note" to "用于简单的数据选择。对于大量、复杂数据请使用 sn-picker 组件")),
                        createVNode(_component_sn_select, utsMapOf("modelValue" to unref(v), "onUpdate:modelValue" to fun(`$event`: Number){
                            trySetRefValue(v, `$event`);
                        }
                        , "data" to data1), null, 8, utsArrayOf(
                            "modelValue"
                        )),
                        createVNode(_component_com_card, utsMapOf("title" to "禁用", "note" to "禁用组件"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_card, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_row, utsMapOf("justify" to "space-between"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_text, utsMapOf("text" to "是否禁用", "size" to ("" + (unref(`$snui`).utils.getPx(unref(`$snui`).configs.font.size(3)) + 1) + "px")), null, 8, utsArrayOf(
                                                    "size"
                                                )),
                                                createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(disabled), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                                    trySetRefValue(disabled, `$event`);
                                                }
                                                ), null, 8, utsArrayOf(
                                                    "modelValue"
                                                ))
                                            );
                                        }
                                        ), "_" to 1))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_sn_select, utsMapOf("modelValue" to unref(v), "onUpdate:modelValue" to fun(`$event`: Number){
                            trySetRefValue(v, `$event`);
                        }
                        , "data" to data1, "disabled" to unref(disabled)), null, 8, utsArrayOf(
                            "modelValue",
                            "disabled"
                        )),
                        createVNode(_component_com_card, utsMapOf("title" to "自定义样式", "note" to "多姿多彩，随心所欲")),
                        createVNode(_component_sn_select, utsMapOf("modelValue" to unref(v), "onUpdate:modelValue" to fun(`$event`: Number){
                            trySetRefValue(v, `$event`);
                        }
                        , "width" to "300px", "height" to "50px", "data" to data1), null, 8, utsArrayOf(
                            "modelValue"
                        )),
                        createVNode(_component_sn_gap),
                        createVNode(_component_sn_select, utsMapOf("modelValue" to unref(v), "onUpdate:modelValue" to fun(`$event`: Number){
                            trySetRefValue(v, `$event`);
                        }
                        , "borderRadius" to "20px", "data" to data1), null, 8, utsArrayOf(
                            "modelValue"
                        )),
                        createVNode(_component_sn_gap),
                        createVNode(_component_sn_select, utsMapOf("modelValue" to unref(v), "onUpdate:modelValue" to fun(`$event`: Number){
                            trySetRefValue(v, `$event`);
                        }
                        , "bgColor" to "#e8f1e2", "textColor" to "#35b571", "popBgColor" to "#e8f1e2", "popActiveBgColor" to "#dee5d9", "activeTextColor" to "#113e25", "data" to data1), null, 8, utsArrayOf(
                            "modelValue"
                        )),
                        createVNode(_component_sn_gap, utsMapOf("height" to "200px"))
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
