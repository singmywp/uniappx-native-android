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
open class GenPagesComponentsSnBadge : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnBadge) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnBadge;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val max = ref("99");
            val value = ref("100");
            val maxC = computed(fun(): Number {
                var p = parseInt(max.value);
                return Math.max(if (isNaN(p)) {
                    0;
                } else {
                    p;
                }
                , 0);
            }
            );
            val valueC = computed(fun(): Number {
                var p = parseInt(value.value);
                return Math.max(if (isNaN(p)) {
                    0;
                } else {
                    p;
                }
                , 0);
            }
            );
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_avatar = resolveEasyComponent("sn-avatar", GenUniModulesSinleUiComponentsSnAvatarSnAvatarClass);
                val _component_sn_badge = resolveEasyComponent("sn-badge", GenUniModulesSinleUiComponentsSnBadgeSnBadgeClass);
                val _component_sn_button = resolveEasyComponent("sn-button", GenUniModulesSinleUiComponentsSnButtonSnButtonClass);
                val _component_sn_row = resolveEasyComponent("sn-row", GenUniModulesSinleUiComponentsSnRowSnRowClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_input = resolveEasyComponent("sn-input", GenUniModulesSinleUiComponentsSnInputSnInputClass);
                val _component_sn_card = resolveEasyComponent("sn-card", GenUniModulesSinleUiComponentsSnCardSnCardClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Badge 徽标")),
                        createVNode(_component_com_card, utsMapOf("title" to "基础用法", "note" to "页面里最令强迫症患者讨厌的东西，但确实有用"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_badge, utsMapOf("value" to 6), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_avatar, utsMapOf("mode" to "text", "text" to "徽"))
                                            );
                                        }
                                        ), "_" to 1)),
                                        createVNode(_component_sn_badge, utsMapOf("value" to 13), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_avatar, utsMapOf("mode" to "text", "text" to "标"))
                                            );
                                        }
                                        ), "_" to 1)),
                                        createVNode(_component_sn_badge, utsMapOf("value" to 2), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_button, utsMapOf("text" to "Badge"))
                                            );
                                        }
                                        ), "_" to 1)),
                                        createVNode(_component_sn_badge, utsMapOf("mode" to "text", "text" to "爆"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_avatar, utsMapOf("mode" to "text", "text" to "新"))
                                            );
                                        }
                                        ), "_" to 1)),
                                        createVNode(_component_sn_badge, utsMapOf("mode" to "text", "text" to "VIP", "bgColor" to "#f5a854", "size" to ("" + (unref(`$snui`).utils.getPx(unref(`$snui`).configs.font.size(1)) - 2) + "px")), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_avatar, utsMapOf("mode" to "text", "text" to "视频"))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "size"
                                        ))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "最大值", "note" to "设置数据上限，超出则显示最大值"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_badge, utsMapOf("value" to unref(valueC), "max" to unref(maxC)), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_avatar, utsMapOf("mode" to "text", "text" to "张三"))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "value",
                                            "max"
                                        )),
                                        createVNode(_component_sn_badge, utsMapOf("value" to unref(valueC), "max" to unref(maxC)), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_button, utsMapOf("text" to "立即更新", "type" to "primary", "level" to "second"))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "value",
                                            "max"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_sn_card, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_input, utsMapOf("modelValue" to unref(value), "onUpdate:modelValue" to fun(`$event`: String){
                                            trySetRefValue(value, `$event`);
                                        }
                                        , "type" to "number", "placeholder" to "设置数据值"), null, 8, utsArrayOf(
                                            "modelValue"
                                        )),
                                        createVNode(_component_sn_input, utsMapOf("modelValue" to unref(max), "onUpdate:modelValue" to fun(`$event`: String){
                                            trySetRefValue(max, `$event`);
                                        }
                                        , "type" to "number", "placeholder" to "设置最大值"), null, 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "圆点", "note" to "用于重要程度较低的消息，或者不便统计数字的场合，如更新提示，至少让人一看就懂"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_badge, utsMapOf("mode" to "dot"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_avatar, utsMapOf("mode" to "text", "text" to "张三"))
                                            );
                                        }
                                        ), "_" to 1)),
                                        createVNode(_component_sn_badge, utsMapOf("mode" to "dot"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_button, utsMapOf("text" to "立即更新", "type" to "primary", "level" to "second"))
                                            );
                                        }
                                        ), "_" to 1))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "位置偏移", "note" to "重新调整 badge 的位置，使其适合各种各样的组件"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_badge, utsMapOf("value" to 10, "offset" to "translate(-32px,10px)"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_avatar, utsMapOf("mode" to "text", "text" to "张三"))
                                            );
                                        }
                                        ), "_" to 1)),
                                        createVNode(_component_sn_badge, utsMapOf("mode" to "dot", "offset" to "translate(-12px,13px)", "size" to "8px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_button, utsMapOf("text" to "立即更新", "type" to "primary", "level" to "second"))
                                            );
                                        }
                                        ), "_" to 1))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "尺寸", "note" to "badge 类型不为 dot 时可以设置字体大小，badge 类型为 dot 时可以设置 dot 大小"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_badge, utsMapOf("value" to 10, "size" to "16px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_avatar, utsMapOf("mode" to "text", "text" to "张三"))
                                            );
                                        }
                                        ), "_" to 1)),
                                        createVNode(_component_sn_badge, utsMapOf("value" to 10, "size" to "10px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_avatar, utsMapOf("mode" to "text", "text" to "李四"))
                                            );
                                        }
                                        ), "_" to 1)),
                                        createVNode(_component_sn_badge, utsMapOf("mode" to "dot", "size" to "8px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_avatar, utsMapOf("mode" to "text", "text" to "王五"))
                                            );
                                        }
                                        ), "_" to 1))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "自定义颜色", "note" to "多姿多彩"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_badge, utsMapOf("value" to 13, "bgColor" to "#83b59a"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_avatar, utsMapOf("mode" to "text", "text" to "张三"))
                                            );
                                        }
                                        ), "_" to 1)),
                                        createVNode(_component_sn_badge, utsMapOf("value" to 5, "bgColor" to "#f6b142", "textColor" to "#000"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_avatar, utsMapOf("mode" to "text", "text" to "李四"))
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
