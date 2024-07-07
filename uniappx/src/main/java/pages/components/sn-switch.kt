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
open class GenPagesComponentsSnSwitch : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnSwitch) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnSwitch;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val theme = computed(fun(): String {
                return `$snui`.configs.app.theme;
            }
            );
            val v1 = ref(false);
            val v2 = ref(false);
            val v3 = ref(true);
            val v4 = ref(false);
            val v5 = ref(false);
            val v6 = ref(false);
            val v7 = ref(false);
            val v8 = ref(false);
            val loading = ref(true);
            val tV = ref(false);
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_switch = resolveEasyComponent("sn-switch", GenUniModulesSinleUiComponentsSnSwitchSnSwitchClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_row = resolveEasyComponent("sn-row", GenUniModulesSinleUiComponentsSnRowSnRowClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_sn_card = resolveEasyComponent("sn-card", GenUniModulesSinleUiComponentsSnCardSnCardClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Switch 开关")),
                        createVNode(_component_com_card, utsMapOf("title" to "基础用法", "note" to "跟官方的很相似，但扩展了一些功能"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(v1), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                    trySetRefValue(v1, `$event`);
                                }
                                ), null, 8, utsArrayOf(
                                    "modelValue"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "颜色", "note" to "丰富多彩的颜色 (colorful"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(v2), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                            trySetRefValue(v2, `$event`);
                                        }
                                        , "class" to "spacing", "bgColor" to "#b5b5b5", "activeBgColor" to if (unref(theme) == "light") {
                                            "#000";
                                        } else {
                                            "#6d6d6d";
                                        }
                                        ), null, 8, utsArrayOf(
                                            "modelValue",
                                            "activeBgColor"
                                        )),
                                        createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(v2), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                            trySetRefValue(v2, `$event`);
                                        }
                                        , "class" to "spacing", "activeBlockColor" to "#eeebd6", "activeBgColor" to "#e1c783"), null, 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "尺寸", "note" to "可以自由调整 switch 的尺寸"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(v3), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                            trySetRefValue(v3, `$event`);
                                        }
                                        , "class" to "spacing", "width" to "100px"), null, 8, utsArrayOf(
                                            "modelValue"
                                        )),
                                        createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(v3), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                            trySetRefValue(v3, `$event`);
                                        }
                                        , "class" to "spacing", "width" to "40px"), null, 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "圆角", "note" to "可以自由调整 switch 的圆角"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(v4), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                            trySetRefValue(v4, `$event`);
                                        }
                                        , "class" to "spacing", "borderRadius" to "3px", "blockBorderRadius" to "2px"), null, 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "间隙", "note" to "可以自由调整 switch 滑块的间隙"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(v5), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                            trySetRefValue(v5, `$event`);
                                        }
                                        , "class" to "spacing", "padding" to "7px"), null, 8, utsArrayOf(
                                            "modelValue"
                                        )),
                                        createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(v5), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                            trySetRefValue(v5, `$event`);
                                        }
                                        , "class" to "spacing", "padding" to "2px"), null, 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "文本", "note" to "switch 内部可以添加自定义文字"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(tV), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                    trySetRefValue(tV, `$event`);
                                }
                                , "width" to "150px", "height" to "40px", "padding" to "10px", "textSize" to "18px", "activeBgColor" to "#ce2c2f", "activeBlockColor" to "#ffe167", "text" to if (unref(tV)) {
                                    "匹夫有责";
                                } else {
                                    "天下兴亡";
                                }
                                , "blockBorderRadius" to if (unref(tV)) {
                                    "30px 100px 100px 30px";
                                } else {
                                    "100px 30px 30px 100px";
                                }
                                ), null, 8, utsArrayOf(
                                    "modelValue",
                                    "text",
                                    "blockBorderRadius"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "图标", "note" to "switch 的滑块内可以添加图标，更具美感"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(v6), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                    trySetRefValue(v6, `$event`);
                                }
                                , "icon" to if (unref(v6)) {
                                    "check-line";
                                } else {
                                    "close-line";
                                }
                                , "activeBgColor" to "#59b584"), null, 8, utsArrayOf(
                                    "modelValue",
                                    "icon"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "加载中", "note" to "加载中的 switch，至少不会让用户认为你在偷懒"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(v7), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                    trySetRefValue(v7, `$event`);
                                }
                                , "loading" to unref(loading)), null, 8, utsArrayOf(
                                    "modelValue",
                                    "loading"
                                )),
                                createVNode(_component_sn_card, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_row, utsMapOf("justify" to "space-between"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_text, utsMapOf("text" to "加载状态", "size" to unref(`$snui`).configs.font.size(3)), null, 8, utsArrayOf(
                                                    "size"
                                                )),
                                                createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(loading), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                                    trySetRefValue(loading, `$event`);
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
                        createVNode(_component_com_card, utsMapOf("title" to "禁用", "note" to "为 switch 设置禁用状态，注意：只是禁用手动点击，不会屏蔽数据的修改"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(v8), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                            trySetRefValue(v8, `$event`);
                                        }
                                        , "class" to "spacing", "disabled" to ""), null, 8, utsArrayOf(
                                            "modelValue"
                                        )),
                                        createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(v8), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                            trySetRefValue(v8, `$event`);
                                        }
                                        , "class" to "spacing"), null, 8, utsArrayOf(
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
                return utsMapOf("spacing" to padStyleMapOf(utsMapOf("marginTop" to 0, "marginRight" to 10, "marginBottom" to 10, "marginLeft" to 0)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
