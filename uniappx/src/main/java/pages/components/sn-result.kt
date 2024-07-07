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
open class GenPagesComponentsSnResult : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnResult) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnResult;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val showSlot = ref(false);
            val mode = ref(0);
            val data = ref(utsArrayOf(
                object : UTSJSONObject() {
                    var id = "info"
                    var text = "信息"
                },
                object : UTSJSONObject() {
                    var id = "error"
                    var text = "错误"
                },
                object : UTSJSONObject() {
                    var id = "warning"
                    var text = "警告"
                },
                object : UTSJSONObject() {
                    var id = "success"
                    var text = "成功"
                }
            ));
            val titles = ref(object : UTSJSONObject() {
                var info = "信息"
                var success = "成功"
                var error = "错误"
                var warning = "警告"
            });
            val contents = ref(object : UTSJSONObject() {
                var info = "向用户说明详情内容"
                var success = "完成某项操作时的提示"
                var error = "严重...故障"
                var warning = "程序猿们居然看不见emmm"
            });
            val selectedId = computed(fun(): String {
                return data.value[mode.value]["id"] as String;
            }
            );
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_sn_select = resolveEasyComponent("sn-select", GenUniModulesSinleUiComponentsSnSelectSnSelectClass);
                val _component_sn_row = resolveEasyComponent("sn-row", GenUniModulesSinleUiComponentsSnRowSnRowClass);
                val _component_sn_switch = resolveEasyComponent("sn-switch", GenUniModulesSinleUiComponentsSnSwitchSnSwitchClass);
                val _component_sn_icon = resolveEasyComponent("sn-icon", GenUniModulesSinleUiComponentsSnIconSnIconClass);
                val _component_sn_button = resolveEasyComponent("sn-button", GenUniModulesSinleUiComponentsSnButtonSnButtonClass);
                val _component_sn_result = resolveEasyComponent("sn-result", GenUniModulesSinleUiComponentsSnResultSnResultClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Result 结果页")),
                        createVNode(_component_com_card, utsMapOf("title" to "组件演示", "border" to "0"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "结果页模式")),
                                        createVNode(_component_sn_select, utsMapOf("modelValue" to unref(mode), "onUpdate:modelValue" to fun(`$event`: Number){
                                            trySetRefValue(mode, `$event`);
                                        }
                                        , "data" to unref(data), "width" to "150px"), null, 8, utsArrayOf(
                                            "modelValue",
                                            "data"
                                        ))
                                    );
                                }
                                ), "_" to 1), 8, utsArrayOf(
                                    "style"
                                )),
                                createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "显示插槽")),
                                        createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(showSlot), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                            trySetRefValue(showSlot, `$event`);
                                        }
                                        ), null, 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1), 8, utsArrayOf(
                                    "style"
                                )),
                                createVNode(_component_sn_result, utsMapOf("mode" to unref(selectedId), "title" to if (unref(showSlot)) {
                                    "禁止通行";
                                } else {
                                    unref(titles)[unref(selectedId)];
                                }
                                , "content" to if (unref(showSlot)) {
                                    "机密要地，无关人士速速撤离";
                                } else {
                                    unref(contents)[unref(selectedId)];
                                }
                                , "style" to normalizeStyle(utsMapOf("margin-bottom" to "30px"))), utsMapOf("icon" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        if (isTrue(unref(showSlot))) {
                                            createVNode(_component_sn_icon, utsMapOf("key" to 0, "name" to "checkbox-blank-circle-line", "color" to unref(colors).error, "size" to "45px"), null, 8, utsArrayOf(
                                                "color"
                                            ));
                                        } else {
                                            createCommentVNode("v-if", true);
                                        }
                                    );
                                }
                                ), "action" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        if (isTrue(unref(showSlot))) {
                                            createVNode(_component_sn_button, utsMapOf("key" to 0, "text" to "返回", "style" to normalizeStyle(utsMapOf("width" to "100px", "margin" to "30px auto"))), null, 8, utsArrayOf(
                                                "style"
                                            ));
                                        } else {
                                            createCommentVNode("v-if", true);
                                        }
                                    );
                                }
                                ), "_" to 1), 8, utsArrayOf(
                                    "mode",
                                    "title",
                                    "content",
                                    "style"
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
