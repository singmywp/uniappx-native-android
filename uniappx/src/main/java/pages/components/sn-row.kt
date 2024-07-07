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
open class GenPagesComponentsSnRow : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnRow) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnRow;
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
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Row 水平布局")),
                        createVNode(_component_com_card, utsMapOf("title" to "基础用法", "note" to "用于快速设置栅格布局。\\n搭配 sn-col 组件使用更佳哦。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
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
                        createVNode(_component_com_card, utsMapOf("title" to "对齐方式", "note" to "支持水平和垂直方向的对齐方式。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, utsMapOf("justify" to "right"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
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
