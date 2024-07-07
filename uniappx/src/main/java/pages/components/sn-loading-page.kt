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
open class GenPagesComponentsSnLoadingPage : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnLoadingPage) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnLoadingPage;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val show = ref(false);
            val image = ref(false);
            val text = ref("加载中");
            val textColor = ref("");
            val iconColor = ref("");
            val textSize = ref(`$snui`.configs.font.size(4) as String);
            val iconSize = ref("40px");
            fun genShowLoadingPageFn() {
                show.value = true;
                setTimeout(fun(){
                    show.value = false;
                }
                , 2000);
            }
            val showLoadingPage = ::genShowLoadingPageFn;
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_gap = resolveEasyComponent("sn-gap", GenUniModulesSinleUiComponentsSnGapSnGapClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_sn_switch = resolveEasyComponent("sn-switch", GenUniModulesSinleUiComponentsSnSwitchSnSwitchClass);
                val _component_sn_row = resolveEasyComponent("sn-row", GenUniModulesSinleUiComponentsSnRowSnRowClass);
                val _component_sn_input = resolveEasyComponent("sn-input", GenUniModulesSinleUiComponentsSnInputSnInputClass);
                val _component_sn_button = resolveEasyComponent("sn-button", GenUniModulesSinleUiComponentsSnButtonSnButtonClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                val _component_sn_loading_page = resolveEasyComponent("sn-loading-page", GenUniModulesSinleUiComponentsSnLoadingPageSnLoadingPageClass);
                return createElementVNode(Fragment, null, utsArrayOf(
                    createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_topbar, utsMapOf("title" to "Loading Page 加载页")),
                            createVNode(_component_sn_gap),
                            createVNode(_component_com_card, utsMapOf("title" to "组件演示"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    createVNode(_component_sn_text, utsMapOf("class" to "introduction", "text" to "\u3000\u3000在页面信息尚未完全加载时使用，避免出现视觉空白")),
                                    createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "自定义图片代替加载")),
                                            createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(image), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                                trySetRefValue(image, `$event`);
                                            }
                                            ), null, 8, utsArrayOf(
                                                "modelValue"
                                            ))
                                        );
                                    }
                                    ), "_" to 1), 8, utsArrayOf(
                                        "style"
                                    )),
                                    createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "提示文本")),
                                            createVNode(_component_sn_input, utsMapOf("modelValue" to unref(text), "onUpdate:modelValue" to fun(`$event`: String){
                                                trySetRefValue(text, `$event`);
                                            }
                                            , "class" to "input"), null, 8, utsArrayOf(
                                                "modelValue"
                                            ))
                                        );
                                    }
                                    ), "_" to 1), 8, utsArrayOf(
                                        "style"
                                    )),
                                    createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "文本颜色")),
                                            createVNode(_component_sn_input, utsMapOf("modelValue" to unref(textColor), "onUpdate:modelValue" to fun(`$event`: String){
                                                trySetRefValue(textColor, `$event`);
                                            }
                                            , "class" to "input"), null, 8, utsArrayOf(
                                                "modelValue"
                                            ))
                                        );
                                    }
                                    ), "_" to 1), 8, utsArrayOf(
                                        "style"
                                    )),
                                    createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "文本大小")),
                                            createVNode(_component_sn_input, utsMapOf("modelValue" to unref(textSize), "onUpdate:modelValue" to fun(`$event`: String){
                                                trySetRefValue(textSize, `$event`);
                                            }
                                            , "class" to "input"), null, 8, utsArrayOf(
                                                "modelValue"
                                            ))
                                        );
                                    }
                                    ), "_" to 1), 8, utsArrayOf(
                                        "style"
                                    )),
                                    createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "图标颜色")),
                                            createVNode(_component_sn_input, utsMapOf("modelValue" to unref(iconColor), "onUpdate:modelValue" to fun(`$event`: String){
                                                trySetRefValue(iconColor, `$event`);
                                            }
                                            , "class" to "input"), null, 8, utsArrayOf(
                                                "modelValue"
                                            ))
                                        );
                                    }
                                    ), "_" to 1), 8, utsArrayOf(
                                        "style"
                                    )),
                                    createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "图标大小")),
                                            createVNode(_component_sn_input, utsMapOf("modelValue" to unref(iconSize), "onUpdate:modelValue" to fun(`$event`: String){
                                                trySetRefValue(iconSize, `$event`);
                                            }
                                            , "class" to "input", "type" to "text"), null, 8, utsArrayOf(
                                                "modelValue"
                                            ))
                                        );
                                    }
                                    ), "_" to 1), 8, utsArrayOf(
                                        "style"
                                    )),
                                    createVNode(_component_sn_button, utsMapOf("text" to "打开", "level" to "second", "type" to "primary", "onClick" to fun(){
                                        showLoadingPage();
                                    }
                                    , "style" to normalizeStyle(utsMapOf("margin-top" to "10px"))), null, 8, utsArrayOf(
                                        "onClick",
                                        "style"
                                    ))
                                );
                            }
                            ), "_" to 1)),
                            createVNode(_component_sn_gap)
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_sn_loading_page, utsMapOf("show" to unref(show), "imgSrc" to if (unref(image)) {
                        "/static/logo-trans.png";
                    } else {
                        "";
                    }
                    , "text" to if (unref(image)) {
                        "SinleUI";
                    } else {
                        unref(text);
                    }
                    , "textColor" to if (unref(image)) {
                        unref(colors).dark;
                    } else {
                        unref(textColor);
                    }
                    , "iconColor" to if (unref(image)) {
                        unref(colors).dark;
                    } else {
                        unref(iconColor);
                    }
                    , "textSize" to if (unref(image)) {
                        "20px";
                    } else {
                        unref(textSize);
                    }
                    , "iconSize" to if (unref(image)) {
                        "";
                    } else {
                        unref(iconSize);
                    }
                    , "customTextStyle" to if (unref(image)) {
                        object : UTSJSONObject() {
                            var marginTop = "10px"
                            var fontFamily = "alipuhuiheavy"
                        };
                    } else {
                        object : UTSJSONObject() {
                            var marginTop = "15px"
                        };
                    }
                    ), null, 8, utsArrayOf(
                        "show",
                        "imgSrc",
                        "text",
                        "textColor",
                        "iconColor",
                        "textSize",
                        "iconSize",
                        "customTextStyle"
                    ))
                ), 64);
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
                return utsMapOf("input" to padStyleMapOf(utsMapOf("flex" to 1, "marginLeft" to 10)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
