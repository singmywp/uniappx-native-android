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
import io.dcloud.uniapp.extapi.showModal as uni_showModal;
open class GenPagesComponentsSnTopbar : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnTopbar) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnTopbar;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val features = utsArrayOf(
                object : UTSJSONObject() {
                    var icon = "refresh-line"
                    var id = "refresh"
                },
                object : UTSJSONObject() {
                    var icon = "delete-bin-4-line"
                    var id = "remove"
                }
            );
            val menuData = utsArrayOf(
                object : UTSJSONObject() {
                    var icon = "refresh-line"
                    var text = "刷新"
                    var id = "refresh"
                },
                object : UTSJSONObject() {
                    var icon = "search-2-line"
                    var text = "搜索"
                    var id = "search"
                },
                object : UTSJSONObject() {
                    var icon = "check-line"
                    var text = "提交"
                    var id = "submit"
                },
                object : UTSJSONObject() {
                    var icon = "information-line"
                    var text = "关于"
                    var id = "about"
                }
            );
            val enableMenu = ref(false);
            fun genButtonClickedFn(e: UTSJSONObject) {
                uni_showModal(ShowModalOptions(title = "按钮点击事件", content = JSON.stringify(e), showCancel = false));
            }
            val buttonClicked = ::genButtonClickedFn;
            fun genMenuClickedFn(e: UTSJSONObject) {
                uni_showModal(ShowModalOptions(title = "菜单点击事件", content = JSON.stringify(e), showCancel = false));
            }
            val menuClicked = ::genMenuClickedFn;
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_gap = resolveEasyComponent("sn-gap", GenUniModulesSinleUiComponentsSnGapSnGapClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_line = resolveEasyComponent("sn-line", GenUniModulesSinleUiComponentsSnLineSnLineClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_sn_switch = resolveEasyComponent("sn-switch", GenUniModulesSinleUiComponentsSnSwitchSnSwitchClass);
                val _component_sn_row = resolveEasyComponent("sn-row", GenUniModulesSinleUiComponentsSnRowSnRowClass);
                val _component_sn_card = resolveEasyComponent("sn-card", GenUniModulesSinleUiComponentsSnCardSnCardClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Topbar 导航栏", "menuButton" to unref(enableMenu), "menuData" to menuData, "onMenuClick" to menuClicked), null, 8, utsArrayOf(
                            "menuButton"
                        )),
                        createVNode(_component_sn_gap),
                        createVNode(_component_com_card, utsMapOf("title" to "基础用法", "note" to "导航栏默认置顶（即fixed值为true），效果如页面顶端所示")),
                        createVNode(_component_com_card, utsMapOf("title" to "取消置顶", "note" to "当你因某种特殊需求（比如本demo的实现）而需要将导航栏放置在容器中时，可以取消导航栏的置顶\\n为方便显示，接下来的demo示范皆已取消置顶"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_topbar, utsMapOf("title" to "非置顶导航栏", "fixed" to false))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "取消返回键", "note" to "有些特殊场景，比如应用的主页，不需要返回上一页，可以取消返回按钮的显示"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_topbar, utsMapOf("title" to "主页", "fixed" to false, "backButton" to false))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "标题位置", "note" to "中央还是两边？"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_topbar, utsMapOf("title" to "LEFT", "fixed" to false, "titleAlign" to "left")),
                                createVNode(_component_sn_line),
                                createVNode(_component_sn_topbar, utsMapOf("title" to "CENTER", "fixed" to false, "titleAlign" to "center")),
                                createVNode(_component_sn_line),
                                createVNode(_component_sn_topbar, utsMapOf("title" to "RIGHT", "fixed" to false, "titleAlign" to "right"))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "功能按钮区", "note" to "各式各样的功能，尽你所用"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_topbar, utsMapOf("title" to "导航栏", "fixed" to false, "features" to features, "onButtonClick" to buttonClicked))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "菜单", "note" to "集成了常见的菜单悬浮窗，可与features连用，极大地扩展了导航栏的按钮位☺\\n（请一定要将有菜单的导航栏置顶）"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_card, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_row, utsMapOf("justify" to "space-between"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_text, utsMapOf("text" to "启用菜单")),
                                                createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(enableMenu), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                                    trySetRefValue(enableMenu, `$event`);
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
                        createVNode(_component_com_card, utsMapOf("title" to "自定义样式", "note" to "多姿多彩，追求独特"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_topbar, utsMapOf("title" to "星空征途，永不停息", "bgColor" to unref(colors).front, "boxShadow" to "0", "titleColor" to unref(colors).primaryDark, "borderRadius" to "0", "fixed" to false, "backButton" to false), null, 8, utsArrayOf(
                                    "bgColor",
                                    "titleColor"
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
