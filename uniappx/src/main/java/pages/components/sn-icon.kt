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
import io.dcloud.uniapp.extapi.navigateTo as uni_navigateTo;
open class GenPagesComponentsSnIcon : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnIcon) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnIcon;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            fun genGotoViewFn() {
                uni_navigateTo(NavigateToOptions(url = "/pages/components/sn-icon__all"));
            }
            val gotoView = ::genGotoViewFn;
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_link = resolveEasyComponent("sn-link", GenUniModulesSinleUiComponentsSnLinkSnLinkClass);
                val _component_sn_alert = resolveEasyComponent("sn-alert", GenUniModulesSinleUiComponentsSnAlertSnAlertClass);
                val _component_sn_icon = resolveEasyComponent("sn-icon", GenUniModulesSinleUiComponentsSnIconSnIconClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_button = resolveEasyComponent("sn-button", GenUniModulesSinleUiComponentsSnButtonSnButtonClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Icon 图标")),
                        createVNode(_component_sn_alert, utsMapOf("type" to "primary"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_link, utsMapOf("href" to "https://remixicon.com/", "color" to unref(colors).primary, "text" to "\u3000\u3000SinleUI 内置 Remix Icon 图标库。所有图标均免费用于个人和商业用途。"), null, 8, utsArrayOf(
                                    "color"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "基础用法", "note" to "通过图标，向用户传达理念。多个图标请用逗号隔开。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_icon, utsMapOf("name" to "user-smile-fill,shining-2-fill,heart-3-fill,rocket-fill,headphone-fill"))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_sn_alert, utsMapOf("type" to "warning", "text" to "\u3000\u3000在原生渲染的 uni-app x 中，需要特别注意 DOM 元素的数量。因此，放置连续几个图标时，如果不需要绑定事件或其他额外样式，直接将其放置在同一个组件中即可（name 属性支持用半角逗号隔开多个图标）。")),
                        createVNode(_component_com_card, utsMapOf("title" to "颜色", "note" to "自定义颜色，让单调的图标更具表现力"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createElementVNode("view", utsMapOf("class" to "icons"), utsArrayOf(
                                    createVNode(_component_sn_icon, utsMapOf("name" to "mic-2-fill", "color" to unref(colors).primary), null, 8, utsArrayOf(
                                        "color"
                                    )),
                                    createVNode(_component_sn_icon, utsMapOf("name" to "user-smile-fill", "color" to unref(colors).success), null, 8, utsArrayOf(
                                        "color"
                                    )),
                                    createVNode(_component_sn_icon, utsMapOf("name" to "service-fill", "color" to unref(colors).error), null, 8, utsArrayOf(
                                        "color"
                                    )),
                                    createVNode(_component_sn_icon, utsMapOf("name" to "error-warning-fill", "color" to unref(colors).warning), null, 8, utsArrayOf(
                                        "color"
                                    ))
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "尺寸", "note" to "自定义尺寸，让枯燥的图标更具灵动性"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createElementVNode("view", utsMapOf("class" to "icons"), utsArrayOf(
                                    createVNode(_component_sn_icon, utsMapOf("name" to "mic-2-fill", "color" to unref(colors).primary, "size" to unref(`$snui`).configs.font.size(3)), null, 8, utsArrayOf(
                                        "color",
                                        "size"
                                    )),
                                    createVNode(_component_sn_icon, utsMapOf("name" to "user-smile-fill", "color" to unref(colors).success, "size" to unref(`$snui`).configs.font.size(4)), null, 8, utsArrayOf(
                                        "color",
                                        "size"
                                    )),
                                    createVNode(_component_sn_icon, utsMapOf("name" to "service-fill", "color" to unref(colors).error, "size" to unref(`$snui`).configs.font.size(5)), null, 8, utsArrayOf(
                                        "color",
                                        "size"
                                    )),
                                    createVNode(_component_sn_icon, utsMapOf("name" to "error-warning-fill", "color" to unref(colors).warning, "size" to unref(`$snui`).configs.font.size(6)), null, 8, utsArrayOf(
                                        "color",
                                        "size"
                                    ))
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "图标预览"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_button, utsMapOf("text" to "查看", "onClick" to gotoView))
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
                return utsMapOf("icons" to padStyleMapOf(utsMapOf("flexDirection" to "row")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
