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
open class GenPagesComponentsSnView : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnView) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnView;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val gestureEventText = ref("");
            fun genGestureEventFn(reassignedEvent: Any) {
                var event = reassignedEvent;
                var strE = JSON.stringify(event)!!;
                event = JSON.parse(strE)!! as UTSJSONObject;
                gestureEventText.value = strE;
            }
            val gestureEvent = ::genGestureEventFn;
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_alert = resolveEasyComponent("sn-alert", GenUniModulesSinleUiComponentsSnAlertSnAlertClass);
                val _component_sn_view = resolveEasyComponent("sn-view", GenUniModulesSinleUiComponentsSnViewSnViewClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, utsMapOf("scrollOn" to false), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "View 视图容器")),
                        createVNode(_component_sn_alert, utsMapOf("type" to "warning", "icon" to "notification-fill", "text" to "受 scroll-view 限制，在 scroll-view 里的手势事件会出现异常，如果使用 sn-page 作为根节点，则设置 scrollOn 为 false 即可。")),
                        createVNode(_component_com_card, utsMapOf("title" to "基础用法", "note" to "用法与内置 view 组件无异。但扩展了组件的手势事件，相当于简化版的 sn-e-gesture。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_view)
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "手势事件"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_view, utsMapOf("class" to "gesture-block", "bgColor" to unref(colors).page, "onClick" to gestureEvent, "onLongpress" to gestureEvent, "onDbclick" to gestureEvent, "onTouchmove" to gestureEvent, "onTouchstart" to gestureEvent, "onTouchend" to gestureEvent, "onTouchcancel" to gestureEvent), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("text" to unref(gestureEventText), "color" to unref(colors).text, "style" to normalizeStyle(utsMapOf("height" to "auto", "wordBreak" to "break-all"))), null, 8, utsArrayOf(
                                            "text",
                                            "color",
                                            "style"
                                        ))
                                    );
                                }
                                ), "_" to 1), 8, utsArrayOf(
                                    "bgColor"
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
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ), utsArrayOf(
                    GenApp.styles
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("gesture-block" to padStyleMapOf(utsMapOf("borderRadius" to 12, "width" to "100%", "minHeight" to 200, "paddingTop" to 10, "paddingRight" to 10, "paddingBottom" to 10, "paddingLeft" to 10)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
