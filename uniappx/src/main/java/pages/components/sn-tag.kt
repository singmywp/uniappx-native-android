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
open class GenPagesComponentsSnTag : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnTag) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnTag;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_tag = resolveEasyComponent("sn-tag", GenUniModulesSinleUiComponentsSnTagSnTagClass);
                val _component_sn_row = resolveEasyComponent("sn-row", GenUniModulesSinleUiComponentsSnRowSnRowClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_line = resolveEasyComponent("sn-line", GenUniModulesSinleUiComponentsSnLineSnLineClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Tag 标签")),
                        createVNode(_component_com_card, utsMapOf("title" to "基础用法", "note" to "一般用于标记某个对象和附加说明"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "SinleUI")),
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "Uniapp X")),
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "UTS")),
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "Vue 3"))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "类型", "note" to "根据场景的不同，应当使用不同类型的标签，更具识别度"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "SinleUI", "type" to "info")),
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "Uni", "type" to "primary")),
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "Vue", "type" to "success")),
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "Web", "type" to "warning")),
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "UTS", "type" to "error"))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "等级", "note" to "不同等级的标签会呈现不同样式"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "SinleUI", "type" to "info")),
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "Uni", "type" to "primary")),
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "Vue", "type" to "success")),
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "Web", "type" to "warning")),
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "UTS", "type" to "error"))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_sn_line),
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "SinleUI", "type" to "info", "level" to "second")),
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "Uni", "type" to "primary", "level" to "second")),
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "Vue", "type" to "success", "level" to "second")),
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "Web", "type" to "warning", "level" to "second")),
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "UTS", "type" to "error", "level" to "second"))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_sn_line),
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "SinleUI", "type" to "info", "level" to "third")),
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "Uni", "type" to "primary", "level" to "third")),
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "Vue", "type" to "success", "level" to "third")),
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "Web", "type" to "warning", "level" to "third")),
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "UTS", "type" to "error", "level" to "third"))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_sn_line),
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "SinleUI", "type" to "info", "level" to "least")),
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "Uni", "type" to "primary", "level" to "least")),
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "Vue", "type" to "success", "level" to "least")),
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "Web", "type" to "warning", "level" to "least")),
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "UTS", "type" to "error", "level" to "least"))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "可关闭", "note" to "部分情况需要取消标签的显示，可以使用closable的标签️"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, utsMapOf("style" to normalizeStyle(utsMapOf("flex-wrap" to "wrap"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "SinleUI", "type" to "info", "level" to "second", "padding" to "8px 10px", "closable" to "")),
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "uni-app x", "type" to "primary", "level" to "second", "padding" to "8px 10px", "closable" to "")),
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "Vue", "type" to "success", "level" to "second", "padding" to "8px 10px", "closable" to "")),
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "Web", "type" to "warning", "level" to "second", "padding" to "8px 10px", "closable" to "")),
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "UTS", "type" to "error", "level" to "second", "padding" to "8px 10px", "closable" to ""))
                                    );
                                }
                                ), "_" to 1), 8, utsArrayOf(
                                    "style"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "自定义样式", "note" to "定制专属于你的标签"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "SinleUI", "type" to "primary", "level" to "second", "customStyle" to object : UTSJSONObject() {
                                            var border = "1px solid " + unref(colors).primary
                                        }), null, 8, utsArrayOf(
                                            "customStyle"
                                        )),
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "uni-app x", "type" to "primary", "level" to "least", "customStyle" to object : UTSJSONObject() {
                                            var border = "0.5px solid " + unref(colors).primary
                                        }), null, 8, utsArrayOf(
                                            "customStyle"
                                        )),
                                        createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "text" to "UTS", "type" to "primary", "level" to "least", "customStyle" to object : UTSJSONObject() {
                                            var border = "1px dotted " + unref(colors).primary
                                        }), null, 8, utsArrayOf(
                                            "customStyle"
                                        ))
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
