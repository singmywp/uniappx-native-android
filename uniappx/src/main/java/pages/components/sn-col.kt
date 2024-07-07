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
open class GenPagesComponentsSnCol : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnCol) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnCol;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val blockStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("background", colors.value.info);
                styles.set("height", "30px");
                styles.set("border-radius", "5px");
                styles.set("justify-content", "center");
                styles.set("align-items", "center");
                return styles;
            }
            );
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_sn_col = resolveEasyComponent("sn-col", GenUniModulesSinleUiComponentsSnColSnColClass);
                val _component_sn_row = resolveEasyComponent("sn-row", GenUniModulesSinleUiComponentsSnRowSnRowClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Column 垂直布局")),
                        createVNode(_component_com_card, utsMapOf("title" to "基础用法", "note" to "用于快速设置栅格布局。\\n搭配 sn-row 组件使用更佳哦"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_col, utsMapOf("span" to 4, "gutter" to "5px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createElementVNode("view", utsMapOf("style" to normalizeStyle(unref(blockStylesC))), utsArrayOf(
                                                    createVNode(_component_sn_text, utsMapOf("text" to "4"))
                                                ), 4)
                                            );
                                        }
                                        ), "_" to 1)),
                                        createVNode(_component_sn_col, utsMapOf("span" to 4, "gutter" to "5px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createElementVNode("view", utsMapOf("style" to normalizeStyle(unref(blockStylesC))), utsArrayOf(
                                                    createVNode(_component_sn_text, utsMapOf("text" to "4"))
                                                ), 4)
                                            );
                                        }
                                        ), "_" to 1)),
                                        createVNode(_component_sn_col, utsMapOf("span" to 4, "gutter" to "5px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createElementVNode("view", utsMapOf("style" to normalizeStyle(unref(blockStylesC))), utsArrayOf(
                                                    createVNode(_component_sn_text, utsMapOf("text" to "4"))
                                                ), 4)
                                            );
                                        }
                                        ), "_" to 1))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "栅格", "note" to "提供 12 个栅格，通过设置每个节点的 span 属性来自由分配（span 为 number 类型）。\\n当 flex=false 时开启栅格"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_col, utsMapOf("span" to 2, "gutter" to "5px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createElementVNode("view", utsMapOf("style" to normalizeStyle(unref(blockStylesC))), utsArrayOf(
                                                    createVNode(_component_sn_text, utsMapOf("text" to "2"))
                                                ), 4)
                                            );
                                        }
                                        ), "_" to 1)),
                                        createVNode(_component_sn_col, utsMapOf("span" to 6, "gutter" to "5px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createElementVNode("view", utsMapOf("style" to normalizeStyle(unref(blockStylesC))), utsArrayOf(
                                                    createVNode(_component_sn_text, utsMapOf("text" to "6"))
                                                ), 4)
                                            );
                                        }
                                        ), "_" to 1)),
                                        createVNode(_component_sn_col, utsMapOf("span" to 4, "gutter" to "5px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createElementVNode("view", utsMapOf("style" to normalizeStyle(unref(blockStylesC))), utsArrayOf(
                                                    createVNode(_component_sn_text, utsMapOf("text" to "4"))
                                                ), 4)
                                            );
                                        }
                                        ), "_" to 1))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_sn_row, utsMapOf("class" to "marginTop"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_col, utsMapOf("span" to 8, "gutter" to "5px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createElementVNode("view", utsMapOf("style" to normalizeStyle(unref(blockStylesC))), utsArrayOf(
                                                    createVNode(_component_sn_text, utsMapOf("text" to "8"))
                                                ), 4)
                                            );
                                        }
                                        ), "_" to 1)),
                                        createVNode(_component_sn_col, utsMapOf("span" to 4, "gutter" to "5px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createElementVNode("view", utsMapOf("style" to normalizeStyle(unref(blockStylesC))), utsArrayOf(
                                                    createVNode(_component_sn_text, utsMapOf("text" to "4"))
                                                ), 4)
                                            );
                                        }
                                        ), "_" to 1))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "间距", "note" to "每个节点都可单独设置间距"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_col, utsMapOf("span" to 3, "gutter" to "20px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createElementVNode("view", utsMapOf("style" to normalizeStyle(unref(blockStylesC))), utsArrayOf(
                                                    createVNode(_component_sn_text, utsMapOf("text" to "3"))
                                                ), 4)
                                            );
                                        }
                                        ), "_" to 1)),
                                        createVNode(_component_sn_col, utsMapOf("span" to 6, "gutter" to "20px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createElementVNode("view", utsMapOf("style" to normalizeStyle(unref(blockStylesC))), utsArrayOf(
                                                    createVNode(_component_sn_text, utsMapOf("text" to "6"))
                                                ), 4)
                                            );
                                        }
                                        ), "_" to 1)),
                                        createVNode(_component_sn_col, utsMapOf("span" to 3, "gutter" to "20px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createElementVNode("view", utsMapOf("style" to normalizeStyle(unref(blockStylesC))), utsArrayOf(
                                                    createVNode(_component_sn_text, utsMapOf("text" to "3"))
                                                ), 4)
                                            );
                                        }
                                        ), "_" to 1))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_sn_row, utsMapOf("class" to "marginTop"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_col, utsMapOf("span" to 8, "gutter" to "2px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createElementVNode("view", utsMapOf("style" to normalizeStyle(unref(blockStylesC))), utsArrayOf(
                                                    createVNode(_component_sn_text, utsMapOf("text" to "8"))
                                                ), 4)
                                            );
                                        }
                                        ), "_" to 1)),
                                        createVNode(_component_sn_col, utsMapOf("span" to 4, "gutter" to "0px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createElementVNode("view", utsMapOf("style" to normalizeStyle(unref(blockStylesC))), utsArrayOf(
                                                    createVNode(_component_sn_text, utsMapOf("text" to "4"))
                                                ), 4)
                                            );
                                        }
                                        ), "_" to 1))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "分栏偏移", "note" to "支持设置分栏向右偏移量。类似于 span 属性，都是以 12 栅格为基准，number 类型。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_col, utsMapOf("span" to 3, "gutter" to "5", "offset" to 2), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createElementVNode("view", utsMapOf("style" to normalizeStyle(unref(blockStylesC))), utsArrayOf(
                                                    createVNode(_component_sn_text, utsMapOf("text" to "3"))
                                                ), 4)
                                            );
                                        }
                                        ), "_" to 1)),
                                        createVNode(_component_sn_col, utsMapOf("span" to 4, "gutter" to "5"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createElementVNode("view", utsMapOf("style" to normalizeStyle(unref(blockStylesC))), utsArrayOf(
                                                    createVNode(_component_sn_text, utsMapOf("text" to "4"))
                                                ), 4)
                                            );
                                        }
                                        ), "_" to 1)),
                                        createVNode(_component_sn_col, utsMapOf("span" to 3, "gutter" to "5"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createElementVNode("view", utsMapOf("style" to normalizeStyle(unref(blockStylesC))), utsArrayOf(
                                                    createVNode(_component_sn_text, utsMapOf("text" to "3"))
                                                ), 4)
                                            );
                                        }
                                        ), "_" to 1))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_sn_row, utsMapOf("class" to "marginTop"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_col, utsMapOf("span" to 8, "gutter" to "2px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createElementVNode("view", utsMapOf("style" to normalizeStyle(unref(blockStylesC))), utsArrayOf(
                                                    createVNode(_component_sn_text, utsMapOf("text" to "8"))
                                                ), 4)
                                            );
                                        }
                                        ), "_" to 1)),
                                        createVNode(_component_sn_col, utsMapOf("span" to 2, "offset" to 2, "gutter" to "0px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createElementVNode("view", utsMapOf("style" to normalizeStyle(unref(blockStylesC))), utsArrayOf(
                                                    createVNode(_component_sn_text, utsMapOf("text" to "2"))
                                                ), 4)
                                            );
                                        }
                                        ), "_" to 1))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "对齐方式", "note" to "支持水平和垂直方向的对齐方式。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_col, utsMapOf("span" to 4, "gutter" to "5", "align" to "right"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createElementVNode("view", utsMapOf("style" to normalizeStyle(utsArrayOf(
                                                    unref(blockStylesC),
                                                    utsMapOf("width" to "80%", "margin-bottom" to "5px")
                                                ))), utsArrayOf(
                                                    createVNode(_component_sn_text, utsMapOf("text" to "4.1"))
                                                ), 4),
                                                createElementVNode("view", utsMapOf("style" to normalizeStyle(utsArrayOf(
                                                    unref(blockStylesC),
                                                    utsMapOf("width" to "80%")
                                                ))), utsArrayOf(
                                                    createVNode(_component_sn_text, utsMapOf("text" to "4.2"))
                                                ), 4)
                                            );
                                        }
                                        ), "_" to 1)),
                                        createVNode(_component_sn_col, utsMapOf("span" to 3, "gutter" to "5", "align" to "left"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createElementVNode("view", utsMapOf("style" to normalizeStyle(utsArrayOf(
                                                    unref(blockStylesC),
                                                    utsMapOf("width" to "80%", "margin-bottom" to "5px")
                                                ))), utsArrayOf(
                                                    createVNode(_component_sn_text, utsMapOf("text" to "3.1"))
                                                ), 4),
                                                createElementVNode("view", utsMapOf("style" to normalizeStyle(utsArrayOf(
                                                    unref(blockStylesC),
                                                    utsMapOf("width" to "80%")
                                                ))), utsArrayOf(
                                                    createVNode(_component_sn_text, utsMapOf("text" to "3.2"))
                                                ), 4)
                                            );
                                        }
                                        ), "_" to 1)),
                                        createVNode(_component_sn_col, utsMapOf("span" to 5, "gutter" to "5"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createElementVNode("view", utsMapOf("style" to normalizeStyle(utsArrayOf(
                                                    unref(blockStylesC),
                                                    utsMapOf("width" to "80%", "margin-bottom" to "5px")
                                                ))), utsArrayOf(
                                                    createVNode(_component_sn_text, utsMapOf("text" to "5.1"))
                                                ), 4),
                                                createElementVNode("view", utsMapOf("style" to normalizeStyle(utsArrayOf(
                                                    unref(blockStylesC),
                                                    utsMapOf("width" to "80%")
                                                ))), utsArrayOf(
                                                    createVNode(_component_sn_text, utsMapOf("text" to "5.2"))
                                                ), 4)
                                            );
                                        }
                                        ), "_" to 1))
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
