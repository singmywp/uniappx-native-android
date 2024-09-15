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
open class GenPagesComponentsSnOverlay : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnOverlay) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnOverlay;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val theme = computed(fun(): String {
                return `$snui`.configs.app.theme;
            }
            );
            val show = ref(false);
            val opacity = ref(0.3);
            val showSlot = ref(false);
            fun genSetOverlayFn(status: Boolean, opacity_: Number) {
                show.value = status;
                opacity.value = opacity_;
            }
            val setOverlay = ::genSetOverlayFn;
            fun genSetOverlay2Fn(status: Boolean) {
                showSlot.value = status;
            }
            val setOverlay2 = ::genSetOverlay2Fn;
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_button = resolveEasyComponent("sn-button", GenUniModulesSinleUiComponentsSnButtonSnButtonClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                val _component_sn_overlay = resolveEasyComponent("sn-overlay", GenUniModulesSinleUiComponentsSnOverlaySnOverlayClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                return createElementVNode(Fragment, null, utsArrayOf(
                    createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_topbar, utsMapOf("title" to "Overlay 遮罩层")),
                            createVNode(_component_com_card, utsMapOf("title" to "基础用法", "note" to "强调特定元素，常与弹出层等组件搭配使用"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    createVNode(_component_sn_button, utsMapOf("text" to "Click Me", "level" to "second", "type" to "primary", "onClick" to fun(){
                                        setOverlay(true, 0.2);
                                    }
                                    , "style" to normalizeStyle(utsMapOf("width" to "100px"))), null, 8, utsArrayOf(
                                        "onClick",
                                        "style"
                                    ))
                                );
                            }
                            ), "_" to 1)),
                            createVNode(_component_com_card, utsMapOf("title" to "透明度", "note" to "自定义遮罩层的透明度"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    createVNode(_component_sn_button, utsMapOf("text" to "Click Me", "level" to "second", "type" to "primary", "onClick" to fun(){
                                        setOverlay(true, 0.5);
                                    }
                                    , "style" to normalizeStyle(utsMapOf("width" to "100px"))), null, 8, utsArrayOf(
                                        "onClick",
                                        "style"
                                    ))
                                );
                            }
                            ), "_" to 1)),
                            createVNode(_component_com_card, utsMapOf("title" to "插槽", "note" to "Popup、Modal 和 Keyboard 组件实现的原理"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    createVNode(_component_sn_button, utsMapOf("text" to "Click Me", "level" to "second", "type" to "primary", "onClick" to fun(){
                                        setOverlay2(true);
                                    }
                                    , "style" to normalizeStyle(utsMapOf("width" to "100px"))), null, 8, utsArrayOf(
                                        "onClick",
                                        "style"
                                    ))
                                );
                            }
                            ), "_" to 1))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_sn_overlay, utsMapOf("show" to unref(show), "opacity" to unref(opacity), "onClick" to fun(){
                        setOverlay(false, 0.3);
                    }
                    ), null, 8, utsArrayOf(
                        "show",
                        "opacity",
                        "onClick"
                    )),
                    createVNode(_component_sn_overlay, utsMapOf("show" to unref(showSlot), "onClick" to fun(){
                        setOverlay2(false);
                    }
                    ), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createElementVNode("view", utsMapOf("class" to "content", "style" to normalizeStyle(utsMapOf("background" to unref(colors)[if (unref(theme) == "light") {
                                "front";
                            } else {
                                "info";
                            }
                            ]))), utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("bold" to "", "font" to "alipuhuiheavy", "text" to "钢铁是怎样练成的"))
                            ), 4)
                        );
                    }
                    ), "_" to 1), 8, utsArrayOf(
                        "show",
                        "onClick"
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
                return utsMapOf("content" to padStyleMapOf(utsMapOf("marginTop" to 0, "marginRight" to "auto", "marginBottom" to 0, "marginLeft" to "auto", "paddingTop" to 20, "paddingRight" to 20, "paddingBottom" to 20, "paddingLeft" to 20, "transform" to "translateY(300%)", "borderRadius" to 12)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
