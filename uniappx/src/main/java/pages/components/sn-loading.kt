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
open class GenPagesComponentsSnLoading : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnLoading) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnLoading;
            val _cache = __ins.renderCache;
            val loadingIcons = ref(true);
            onMounted(fun(){
                nextTick(fun(){
                    setTimeout(fun(){
                        loadingIcons.value = false;
                    }
                    , 1000);
                }
                );
            }
            );
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_loading = resolveEasyComponent("sn-loading", GenUniModulesSinleUiComponentsSnLoadingSnLoadingClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_row = resolveEasyComponent("sn-row", GenUniModulesSinleUiComponentsSnRowSnRowClass);
                val _component_sn_view = resolveEasyComponent("sn-view", GenUniModulesSinleUiComponentsSnViewSnViewClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Loading 加载")),
                        createVNode(_component_com_card, utsMapOf("title" to "基础用法", "note" to "显示加载状态。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_loading)
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "模式", "note" to "提供两种模式：icon（图标模式）和 draw（canvas 模式）"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing")),
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "mode" to "draw"))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "图标【icon 特色】", "note" to "icon 模式下可自由更换旋转图标"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_view, utsMapOf("loading" to unref(loadingIcons), "style" to normalizeStyle(utsMapOf("flex-wrap" to "wrap", "flex-direction" to "row"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "icon" to "loader-line")),
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "icon" to "loader-2-line")),
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "icon" to "loader-3-line")),
                                        createVNode(_component_sn_loading, utsMapOf("icon" to "refresh-line")),
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "icon" to "user-smile-line")),
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "icon" to "copyleft-line")),
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "icon" to "copyright-line")),
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "icon" to "donut-chart-line")),
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "icon" to "pie-chart-line")),
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "icon" to "global-line")),
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "icon" to "contrast-2-line")),
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "icon" to "edit-circle-line")),
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "icon" to "crosshair-2-line")),
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "icon" to "gps-line")),
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "icon" to "gradienter-line")),
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "icon" to "rfid-line")),
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "icon" to "dashboard-3-line")),
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "icon" to "asterisk")),
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "icon" to "exchange-line")),
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "icon" to "copper-coin-line")),
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "icon" to "disc-line"))
                                    );
                                }
                                ), "_" to 1), 8, utsArrayOf(
                                    "loading",
                                    "style"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "颜色", "note" to "自定义加载条的颜色 (colorful"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "iconColor" to "#ff9b9b")),
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "iconColor" to "#9dc3a8")),
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "iconColor" to "#a29bff"))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "mode" to "draw", "iconColor" to "#ff9b9b")),
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "mode" to "draw", "iconColor" to "#9dc3a8")),
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "mode" to "draw", "iconColor" to "#a29bff"))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "尺寸", "note" to "不同大小的加载条"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "iconSize" to "15px")),
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "iconSize" to "25px")),
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "iconSize" to "35px"))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "mode" to "draw", "iconSize" to "15px")),
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "mode" to "draw", "iconSize" to "25px")),
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "mode" to "draw", "iconSize" to "35px"))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "自定义文字", "note" to "在加载条旁加一行字"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "text" to "加载中")),
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "text" to "加载中", "textSize" to "16px", "textColor" to "#5777ff")),
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "text" to "加载中", "vertical" to ""))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "mode" to "draw", "text" to "加载中")),
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "mode" to "draw", "text" to "加载中", "textSize" to "16px", "textColor" to "#5777ff")),
                                        createVNode(_component_sn_loading, utsMapOf("class" to "spacing", "mode" to "draw", "text" to "加载中", "vertical" to ""))
                                    );
                                }
                                ), "_" to 1))
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
                return utsMapOf("spacing" to padStyleMapOf(utsMapOf("marginTop" to 0, "marginRight" to 5, "marginBottom" to 5, "marginLeft" to 0)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
