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
open class GenPagesComponentsSnGrid : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnGrid) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnGrid;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val array6: UTSArray<Number> = utsArrayOf(
                0,
                1,
                2,
                3,
                4,
                5
            );
            val array8: UTSArray<Number> = utsArrayOf(
                0,
                1,
                2,
                3,
                4,
                5,
                6,
                7
            );
            val array16: UTSArray<Number> = utsArrayOf(
                0,
                1,
                2,
                3,
                4,
                5,
                6,
                7,
                8,
                9,
                10,
                11,
                12,
                13,
                14,
                15
            );
            val titleStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("font-size", `$snui`.configs.font.size(1));
                return styles;
            }
            );
            val loadingComponents = ref(true);
            onMounted(fun(){
                nextTick(fun(){
                    setTimeout(fun(){
                        loadingComponents.value = false;
                    }
                    , 500);
                }
                );
            }
            );
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_icon = resolveEasyComponent("sn-icon", GenUniModulesSinleUiComponentsSnIconSnIconClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_sn_grid_item = resolveEasyComponent("sn-grid-item", GenUniModulesSinleUiComponentsSnGridItemSnGridItemClass);
                val _component_sn_grid_group = resolveEasyComponent("sn-grid-group", GenUniModulesSinleUiComponentsSnGridGroupSnGridGroupClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_gap = resolveEasyComponent("sn-gap", GenUniModulesSinleUiComponentsSnGapSnGapClass);
                val _component_sn_view = resolveEasyComponent("sn-view", GenUniModulesSinleUiComponentsSnViewSnViewClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Grid 宫格布局")),
                        createVNode(_component_sn_view, utsMapOf("loading" to unref(loadingComponents)), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_com_card, utsMapOf("title" to "基础用法", "note" to "一般用于功能展示，比如本 Demo 的首页"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_grid_group, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createElementVNode(Fragment, null, RenderHelpers.renderList(array8, fun(_, index, _, _): VNode {
                                                    return createVNode(_component_sn_grid_item, utsMapOf("key" to index), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                                        return utsArrayOf(
                                                            createVNode(_component_sn_icon, utsMapOf("name" to "image-line")),
                                                            createVNode(_component_sn_text, utsMapOf("text" to "标题", "styles" to unref(titleStylesC)), null, 8, utsArrayOf(
                                                                "styles"
                                                            ))
                                                        );
                                                    }
                                                    ), "_" to 2), 1024);
                                                }
                                                ), 64)
                                            );
                                        }
                                        ), "_" to 1))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "对齐方式", "note" to "支持三种的对齐方式。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_grid_group, utsMapOf("align" to "right"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createElementVNode(Fragment, null, RenderHelpers.renderList(array6, fun(_, index, _, _): VNode {
                                                    return createVNode(_component_sn_grid_item, utsMapOf("key" to index), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                                        return utsArrayOf(
                                                            createVNode(_component_sn_icon, utsMapOf("name" to "image-line")),
                                                            createVNode(_component_sn_text, utsMapOf("text" to "标题", "styles" to unref(titleStylesC)), null, 8, utsArrayOf(
                                                                "styles"
                                                            ))
                                                        );
                                                    }
                                                    ), "_" to 2), 1024);
                                                }
                                                ), 64)
                                            );
                                        }
                                        ), "_" to 1))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "列数", "note" to "支持自定义列数。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_grid_group, utsMapOf("col" to 3), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createElementVNode(Fragment, null, RenderHelpers.renderList(array6, fun(_, index, _, _): VNode {
                                                    return createVNode(_component_sn_grid_item, utsMapOf("key" to index), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                                        return utsArrayOf(
                                                            createVNode(_component_sn_icon, utsMapOf("name" to "image-line")),
                                                            createVNode(_component_sn_text, utsMapOf("text" to "标题", "styles" to unref(titleStylesC)), null, 8, utsArrayOf(
                                                                "styles"
                                                            ))
                                                        );
                                                    }
                                                    ), "_" to 2), 1024);
                                                }
                                                ), 64)
                                            );
                                        }
                                        ), "_" to 1))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "可滚动", "note" to "套一层 scroll-view 就支持滚动了哦"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createElementVNode("scroll-view", utsMapOf("direction" to "horizontal"), utsArrayOf(
                                            createVNode(_component_sn_grid_group, utsMapOf("col" to 8, "style" to normalizeStyle(utsMapOf("width" to "200%"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                                return utsArrayOf(
                                                    createElementVNode(Fragment, null, RenderHelpers.renderList(array16, fun(_, index, _, _): VNode {
                                                        return createVNode(_component_sn_grid_item, utsMapOf("key" to index), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                                            return utsArrayOf(
                                                                createVNode(_component_sn_icon, utsMapOf("name" to "image-line")),
                                                                createVNode(_component_sn_text, utsMapOf("text" to "标题", "styles" to unref(titleStylesC)), null, 8, utsArrayOf(
                                                                    "styles"
                                                                ))
                                                            );
                                                        }
                                                        ), "_" to 2), 1024);
                                                    }
                                                    ), 64)
                                                );
                                            }
                                            ), "_" to 1), 8, utsArrayOf(
                                                "style"
                                            ))
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "可滑动", "note" to "套一层 swiper 就支持滑动了哦"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createElementVNode("swiper", null, utsArrayOf(
                                            createElementVNode("swiper-item", null, utsArrayOf(
                                                createVNode(_component_sn_grid_group, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                                    return utsArrayOf(
                                                        createElementVNode(Fragment, null, RenderHelpers.renderList(array8, fun(_, index, _, _): VNode {
                                                            return createVNode(_component_sn_grid_item, utsMapOf("key" to index), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                                                return utsArrayOf(
                                                                    createVNode(_component_sn_icon, utsMapOf("name" to "image-line")),
                                                                    createVNode(_component_sn_text, utsMapOf("text" to "标题", "styles" to unref(titleStylesC)), null, 8, utsArrayOf(
                                                                        "styles"
                                                                    ))
                                                                );
                                                            }
                                                            ), "_" to 2), 1024);
                                                        }
                                                        ), 64)
                                                    );
                                                }
                                                ), "_" to 1))
                                            )),
                                            createElementVNode("swiper-item", null, utsArrayOf(
                                                createVNode(_component_sn_grid_group, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                                    return utsArrayOf(
                                                        createElementVNode(Fragment, null, RenderHelpers.renderList(array8, fun(_, index, _, _): VNode {
                                                            return createVNode(_component_sn_grid_item, utsMapOf("key" to index), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                                                return utsArrayOf(
                                                                    createVNode(_component_sn_icon, utsMapOf("name" to "image-line")),
                                                                    createVNode(_component_sn_text, utsMapOf("text" to "标题", "styles" to unref(titleStylesC)), null, 8, utsArrayOf(
                                                                        "styles"
                                                                    ))
                                                                );
                                                            }
                                                            ), "_" to 2), 1024);
                                                        }
                                                        ), 64)
                                                    );
                                                }
                                                ), "_" to 1))
                                            ))
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_sn_gap)
                            );
                        }
                        ), "_" to 1), 8, utsArrayOf(
                            "loading"
                        ))
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
                return utsMapOf("marginTop" to padStyleMapOf(utsMapOf("marginTop" to 5)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
