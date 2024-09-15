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
open class GenPagesComponentsSnSubsection : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnSubsection) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnSubsection;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val v1 = ref(0);
            val v2 = ref(2);
            val v3 = ref(0);
            val v4 = ref(0);
            val v5 = ref(0);
            val v6 = ref(0);
            val list1 = utsArrayOf(
                "优秀",
                "良好",
                "及格"
            );
            val list2 = utsArrayOf(
                "已付款",
                "已发货",
                "已收货",
                "已评价"
            );
            val list3 = utsArrayOf(
                "最新",
                "热门"
            );
            val bgColorC = computed(fun(): String {
                return colors.value[if (`$snui`.configs.app.theme == "light") {
                    "front";
                } else {
                    "infoDark";
                }
                ] as String;
            }
            );
            val theme = computed(fun(): String {
                return `$snui`.configs.app.theme;
            }
            );
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_subsection = resolveEasyComponent("sn-subsection", GenUniModulesSinleUiComponentsSnSubsectionSnSubsectionClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Subsection 分段器")),
                        createVNode(_component_com_card, utsMapOf("title" to "基础用法", "note" to "选择合适的子界面", "bgColor" to unref(bgColorC)), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_subsection, utsMapOf("modelValue" to unref(v1), "onUpdate:modelValue" to fun(`$event`: Number){
                                    trySetRefValue(v1, `$event`);
                                }
                                , "data" to list1), null, 8, utsArrayOf(
                                    "modelValue"
                                ))
                            );
                        }
                        ), "_" to 1), 8, utsArrayOf(
                            "bgColor"
                        )),
                        createVNode(_component_com_card, utsMapOf("title" to "默认值", "note" to "可以提前设置分段器的选中项目", "bgColor" to unref(bgColorC)), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_subsection, utsMapOf("modelValue" to unref(v2), "onUpdate:modelValue" to fun(`$event`: Number){
                                    trySetRefValue(v2, `$event`);
                                }
                                , "data" to list2), null, 8, utsArrayOf(
                                    "modelValue"
                                ))
                            );
                        }
                        ), "_" to 1), 8, utsArrayOf(
                            "bgColor"
                        )),
                        createVNode(_component_com_card, utsMapOf("title" to "颜色", "note" to "自定义组件各部分的颜色", "bgColor" to unref(bgColorC)), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_subsection, utsMapOf("modelValue" to unref(v3), "onUpdate:modelValue" to fun(`$event`: Number){
                                    trySetRefValue(v3, `$event`);
                                }
                                , "data" to list2, "activeTextColor" to unref(colors).successDark), null, 8, utsArrayOf(
                                    "modelValue",
                                    "activeTextColor"
                                ))
                            );
                        }
                        ), "_" to 1), 8, utsArrayOf(
                            "bgColor"
                        )),
                        createVNode(_component_com_card, utsMapOf("title" to "禁用", "note" to "屏蔽手动操作️", "bgColor" to unref(bgColorC)), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_subsection, utsMapOf("modelValue" to unref(v4), "onUpdate:modelValue" to fun(`$event`: Number){
                                    trySetRefValue(v4, `$event`);
                                }
                                , "data" to list2, "disabled" to ""), null, 8, utsArrayOf(
                                    "modelValue"
                                ))
                            );
                        }
                        ), "_" to 1), 8, utsArrayOf(
                            "bgColor"
                        )),
                        createVNode(_component_com_card, utsMapOf("title" to "自定义样式", "note" to "自定义组件的各种样式", "bgColor" to unref(bgColorC)), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_subsection, utsMapOf("modelValue" to unref(v5), "onUpdate:modelValue" to fun(`$event`: Number){
                                    trySetRefValue(v5, `$event`);
                                }
                                , "class" to "spacing", "textSize" to "12px", "borderRadius" to "5px", "padding" to "2px", "data" to list3, "activeTextColor" to unref(colors).text, "customStyle" to object : UTSJSONObject() {
                                    var width = "100px !important"
                                }), null, 8, utsArrayOf(
                                    "modelValue",
                                    "activeTextColor"
                                )),
                                createVNode(_component_sn_subsection, utsMapOf("modelValue" to unref(v5), "onUpdate:modelValue" to fun(`$event`: Number){
                                    trySetRefValue(v5, `$event`);
                                }
                                , "class" to "spacing", "data" to list3, "textSize" to "16px", "padding" to "5px", "borderRadius" to unref(`$snui`).configs.radius.circle, "textColor" to unref(colors)["info" + (if (unref(theme) == "light") {
                                    "Dark";
                                } else {
                                    "";
                                }
                                )], "activeTextColor" to unref(colors).text, "customItemStyle" to object : UTSJSONObject() {
                                    var fontFamily = "misans-semibold"
                                }, "customStyle" to object : UTSJSONObject() {
                                    var margin = "10px"
                                    var width = "200px !important"
                                    var boxShadow = "2px 2px 30px -2px " + unref(colors).infoDark
                                }), null, 8, utsArrayOf(
                                    "modelValue",
                                    "borderRadius",
                                    "textColor",
                                    "activeTextColor",
                                    "customStyle"
                                )),
                                createVNode(_component_sn_subsection, utsMapOf("modelValue" to unref(v6), "onUpdate:modelValue" to fun(`$event`: Number){
                                    trySetRefValue(v6, `$event`);
                                }
                                , "class" to "spacing", "data" to list2, "activeTextColor" to unref(colors).primary, "textColor" to "#b6b6b6", "textSize" to "16px", "blockBgColor" to "transparent", "borderRadius" to "5px", "padding" to "5px", "customBlockStyle" to object : UTSJSONObject() {
                                    var borderRadius = "0"
                                    var borderBottom = "2px solid " + unref(colors).primary
                                }, "customItemStyle" to object : UTSJSONObject() {
                                    var fontFamily = "misans-semibold"
                                }), null, 8, utsArrayOf(
                                    "modelValue",
                                    "activeTextColor",
                                    "customBlockStyle"
                                ))
                            );
                        }
                        ), "_" to 1), 8, utsArrayOf(
                            "bgColor"
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
                return utsMapOf("spacing" to padStyleMapOf(utsMapOf("marginBottom" to 15)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
