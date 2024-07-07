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
open class GenPagesComponentsSnTabs : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnTabs) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnTabs;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val v1 = ref(0);
            val v2 = ref(0);
            val v3 = ref(0);
            val v4 = ref(0);
            val d1 = utsArrayOf<SnTab>(SnTab(id = "tab1", text = "选项1"), SnTab(id = "tab2", text = "选项2"), SnTab(id = "tab3", text = "选项3"));
            val d2 = utsArrayOf<SnTab>(SnTab(id = "tab1", text = "选项1"), SnTab(id = "tab2", text = "选项2"), SnTab(id = "tab3", text = "选项3"), SnTab(id = "tab4", text = "选项4"), SnTab(id = "tab5", text = "选项5"), SnTab(id = "tab6", text = "选项6"), SnTab(id = "tab7", text = "选项7"), SnTab(id = "tab8", text = "选项8"));
            val d3 = utsArrayOf<SnTab>(SnTab(id = "tab1", text = "选项1"), SnTab(id = "tab2", text = "选项2", disabled = true), SnTab(id = "tab3", text = "选项3"), SnTab(id = "tab4", text = "选项4"));
            val d4 = utsArrayOf<SnTab>(SnTab(id = "tab1", text = "选项1"), SnTab(id = "tab2", text = "选项2", badge = SnBadge(mode = "text", text = "热")), SnTab(id = "tab3", text = "选项3", badge = SnBadge(value = 66)), SnTab(id = "tab4", text = "选项4", badge = SnBadge(mode = "dot", size = "7px", bgColor = colors.value.primary)));
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_tabs = resolveEasyComponent("sn-tabs", GenUniModulesSinleUiComponentsSnTabsSnTabsClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Tabs 标签页")),
                        createVNode(_component_com_card, utsMapOf("title" to "基础用法", "note" to "跟 Tabbar 很像，一般用于顶部的分页导航"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_tabs, utsMapOf("modelValue" to unref(v1), "onUpdate:modelValue" to fun(`$event`: Number){
                                    trySetRefValue(v1, `$event`);
                                }
                                , "data" to d1), null, 8, utsArrayOf(
                                    "modelValue"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "滚动", "note" to "支持滚动，子项自动计算宽度，且将选中项居中"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_tabs, utsMapOf("modelValue" to unref(v2), "onUpdate:modelValue" to fun(`$event`: Number){
                                    trySetRefValue(v2, `$event`);
                                }
                                , "scrollable" to "", "data" to d2), null, 8, utsArrayOf(
                                    "modelValue"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "禁用", "note" to "可为子项单独设置禁用"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_tabs, utsMapOf("modelValue" to unref(v3), "onUpdate:modelValue" to fun(`$event`: Number){
                                    trySetRefValue(v3, `$event`);
                                }
                                , "data" to d3), null, 8, utsArrayOf(
                                    "modelValue"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "徽标", "note" to "可为子项单独添加徽标，支持自定义徽标属性"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_tabs, utsMapOf("modelValue" to unref(v4), "onUpdate:modelValue" to fun(`$event`: Number){
                                    trySetRefValue(v4, `$event`);
                                }
                                , "data" to d4), null, 8, utsArrayOf(
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
