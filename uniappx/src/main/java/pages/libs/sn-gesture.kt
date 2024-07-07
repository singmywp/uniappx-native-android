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
open class GenPagesLibsSnGesture : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesLibsSnGesture) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesLibsSnGesture;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val gestureEventText = ref("");
            val nativeGestureEventText = ref("");
            val nativeGestureTouchEventText = ref("");
            fun genGestureEventFn(event: Any) {
                var strE = JSON.stringify(event);
                gestureEventText.value = strE;
            }
            val gestureEvent = ::genGestureEventFn;
            fun genNativeGestureEventFn(event: Any) {
                var strE = JSON.stringify(event);
                var eveS = JSON.parse(strE) as UTSJSONObject;
                if (eveS["type"] != null && (eveS["type"] as String).includes("touch")) {
                    nativeGestureTouchEventText.value = strE;
                } else {
                    nativeGestureEventText.value = strE;
                }
            }
            val nativeGestureEvent = ::genNativeGestureEventFn;
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_alert = resolveEasyComponent("sn-alert", GenUniModulesSinleUiComponentsSnAlertSnAlertClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_sn_view = resolveEasyComponent("sn-view", GenUniModulesSinleUiComponentsSnViewSnViewClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, utsMapOf("scrollOn" to false), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Gesture 手势库")),
                        createVNode(_component_sn_alert, utsMapOf("type" to "primary", "text" to "SinleUI 手势库 sn-gesture", "icon" to "notification-fill")),
                        createVNode(_component_com_card, utsMapOf("title" to "手势库 sn-view"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_view, utsMapOf("class" to "gesture-block", "bgColor" to unref(colors).info, "borderRadius" to unref(`$snui`).configs.radius.normal, "onClick" to gestureEvent, "onLongpress" to gestureEvent, "onDbclick" to gestureEvent, "onTouchmove" to gestureEvent, "onTouchstart" to gestureEvent, "onTouchend" to gestureEvent, "onTouchcancel" to gestureEvent), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to unref(gestureEventText), "style" to normalizeStyle(utsMapOf("wordBreak" to "break-all"))), null, 8, utsArrayOf(
                                            "text",
                                            "style"
                                        ))
                                    );
                                }
                                ), "_" to 1), 8, utsArrayOf(
                                    "bgColor",
                                    "borderRadius"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "原生手势库 sn-e-gesture"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createElementVNode(uts.sdk.modules.snEGesture.SnEGestureComponent.name, utsMapOf("class" to "gesture-block", "onScale" to nativeGestureEvent, "onClick" to nativeGestureEvent, "onLongpress" to nativeGestureEvent, "onDbclick" to nativeGestureEvent, "onTouchstart" to nativeGestureEvent, "onTouchmove" to nativeGestureEvent, "onTouchend" to nativeGestureEvent, "onTouchcancel" to nativeGestureEvent, "onDown" to nativeGestureEvent, "onShowpress" to nativeGestureEvent, "onFling" to nativeGestureEvent, "style" to normalizeStyle(utsMapOf("borderRadius" to unref(`$snui`).configs.radius.normal, "transitionDuration" to unref(`$snui`).configs.aniTime.normal, "background" to unref(colors).info))), utsArrayOf(
                                    createElementVNode("view", utsMapOf("class" to "gesture-block-contain"), utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to unref(nativeGestureTouchEventText), "style" to normalizeStyle(utsMapOf("wordBreak" to "break-all"))), null, 8, utsArrayOf(
                                            "text",
                                            "style"
                                        )),
                                        createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to unref(nativeGestureEventText), "style" to normalizeStyle(utsMapOf("wordBreak" to "break-all"))), null, 8, utsArrayOf(
                                            "text",
                                            "style"
                                        ))
                                    ))
                                ), 36)
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
                return utsMapOf("gesture-block" to padStyleMapOf(utsMapOf("width" to "100%", "minHeight" to 200, "!paddingTop" to 10, "!paddingRight" to 10, "!paddingBottom" to 10, "!paddingLeft" to 10)), "gesture-block-contain" to padStyleMapOf(utsMapOf("paddingTop" to 10, "paddingRight" to 10, "paddingBottom" to 10, "paddingLeft" to 10)), "gesture-text" to utsMapOf(".gesture-block " to utsMapOf("height" to "auto", "color" to "#6e7073")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
