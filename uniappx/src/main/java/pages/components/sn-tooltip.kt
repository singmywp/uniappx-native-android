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
open class GenPagesComponentsSnTooltip : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnTooltip) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnTooltip;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val cnt = ref(0);
            val index = ref(0);
            val position = ref("top-start");
            fun genOnClickFn() {
                var positions = utsArrayOf(
                    "top-start",
                    "top",
                    "top-end",
                    "right-start",
                    "right",
                    "right-end",
                    "bottom-end",
                    "bottom",
                    "bottom-start",
                    "left-end",
                    "left",
                    "left-start"
                );
                cnt.value++;
                if (cnt.value >= 2) {
                    cnt.value = 0;
                    if (index.value < positions.length - 1) {
                        index.value++;
                        position.value = positions[index.value];
                    } else {
                        index.value = 0;
                        position.value = positions[0];
                    }
                }
            }
            val onClick = ::genOnClickFn;
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_icon = resolveEasyComponent("sn-icon", GenUniModulesSinleUiComponentsSnIconSnIconClass);
                val _component_sn_button = resolveEasyComponent("sn-button", GenUniModulesSinleUiComponentsSnButtonSnButtonClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_sn_tooltip = resolveEasyComponent("sn-tooltip", GenUniModulesSinleUiComponentsSnTooltipSnTooltipClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_gap = resolveEasyComponent("sn-gap", GenUniModulesSinleUiComponentsSnGapSnGapClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Tooltip 弹出提示")),
                        createVNode(_component_com_card, utsMapOf("title" to "基础用法", "note" to "也许当你想要动态介绍某个按钮的用途时会用到它"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_tooltip, null, utsMapOf("trigger" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_button, utsMapOf("type" to "error", "level" to "second", "round" to ""), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_icon, utsMapOf("name" to "fire-fill", "color" to unref(colors).error), null, 8, utsArrayOf(
                                                    "color"
                                                ))
                                            );
                                        }
                                        ), "_" to 1))
                                    );
                                }
                                ), "default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("text" to "⚠️ WARNING: 发射核武器"))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "位置", "note" to "诶，怎……怎么会在这儿 (#ﾟДﾟ)"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_tooltip, utsMapOf("position" to unref(position), "customStyle" to object : UTSJSONObject() {
                                    var margin = "50px"
                                }), utsMapOf("trigger" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_button, utsMapOf("level" to "second", "text" to "Click Me", "onClick" to onClick))
                                    );
                                }
                                ), "default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("text" to "Hello!"))
                                    );
                                }
                                ), "_" to 1), 8, utsArrayOf(
                                    "position"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "插槽", "note" to "你可以放点更多别的东西"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_tooltip, utsMapOf("position" to "bottom", "padding" to "70px"), utsMapOf("trigger" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_button, utsMapOf("level" to "second", "round" to ""), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_icon, utsMapOf("name" to "number-1", "color" to unref(colors).primary), null, 8, utsArrayOf(
                                                    "color"
                                                ))
                                            );
                                        }
                                        ), "_" to 1))
                                    );
                                }
                                ), "default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_tooltip, utsMapOf("position" to "top", "width" to "100px", "bgColor" to unref(colors).front), utsMapOf("trigger" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_button, utsMapOf("type" to "error", "level" to "second", "round" to ""), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                                    return utsArrayOf(
                                                        createVNode(_component_sn_icon, utsMapOf("name" to "number-2", "color" to unref(colors).error), null, 8, utsArrayOf(
                                                            "color"
                                                        ))
                                                    );
                                                }
                                                ), "_" to 1))
                                            );
                                        }
                                        ), "default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_text, utsMapOf("text" to "嵌套第三层 (●'◡'●)"))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "bgColor"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_sn_gap, utsMapOf("height" to "200px"))
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
