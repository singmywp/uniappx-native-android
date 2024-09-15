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
open class GenPagesComponentsSnTransition : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnTransition) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnTransition;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val values = ref(utsArrayOf(
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false
            ));
            val blockStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("width", "100%");
                styles.set("height", "50px");
                styles.set("margin", "20px 0");
                styles.set("background", colors.value.primary);
                styles.set("border-radius", `$snui`.configs.radius.normal);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            fun genPlayFn(index: Number) {
                values.value[index] = true;
                setTimeout(fun(){
                    values.value[index] = false;
                }
                , parseFloat(`$snui`.configs.aniTime.normal) * 2);
            }
            val play = ::genPlayFn;
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_button = resolveEasyComponent("sn-button", GenUniModulesSinleUiComponentsSnButtonSnButtonClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_transition = resolveEasyComponent("sn-transition", GenUniModulesSinleUiComponentsSnTransitionSnTransitionClass);
                val _component_sn_gap = resolveEasyComponent("sn-gap", GenUniModulesSinleUiComponentsSnGapSnGapClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("class" to "com-card", "title" to "Transition 过渡动画")),
                        createVNode(_component_com_card, utsMapOf("class" to "com-card", "title" to "淡入淡出"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_button, utsMapOf("text" to "播放", "style" to normalizeStyle(utsMapOf("z-index" to "2")), "onClick" to fun(){
                                    play(0);
                                }
                                ), null, 8, utsArrayOf(
                                    "style",
                                    "onClick"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_sn_transition, utsMapOf("mode" to "fade", "show" to unref(values)[0]), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createElementVNode("view", utsMapOf("style" to normalizeStyle(unref(blockStylesC))), null, 4)
                            );
                        }
                        ), "_" to 1), 8, utsArrayOf(
                            "show"
                        )),
                        createVNode(_component_com_card, utsMapOf("class" to "com-card", "title" to "缩放"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_button, utsMapOf("text" to "播放", "style" to normalizeStyle(utsMapOf("z-index" to "2")), "onClick" to fun(){
                                    play(1);
                                }
                                ), null, 8, utsArrayOf(
                                    "style",
                                    "onClick"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_sn_transition, utsMapOf("mode" to "zoom", "show" to unref(values)[1]), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createElementVNode("view", utsMapOf("style" to normalizeStyle(unref(blockStylesC))), null, 4)
                            );
                        }
                        ), "_" to 1), 8, utsArrayOf(
                            "show"
                        )),
                        createVNode(_component_com_card, utsMapOf("class" to "com-card", "title" to "淡入淡出缩放"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_button, utsMapOf("text" to "播放", "style" to normalizeStyle(utsMapOf("z-index" to "2")), "onClick" to fun(){
                                    play(2);
                                }
                                ), null, 8, utsArrayOf(
                                    "style",
                                    "onClick"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_sn_transition, utsMapOf("mode" to "fadeZoom", "show" to unref(values)[2]), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createElementVNode("view", utsMapOf("style" to normalizeStyle(unref(blockStylesC))), null, 4)
                            );
                        }
                        ), "_" to 1), 8, utsArrayOf(
                            "show"
                        )),
                        createVNode(_component_com_card, utsMapOf("class" to "com-card", "title" to "上滑淡入"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_button, utsMapOf("text" to "播放", "style" to normalizeStyle(utsMapOf("z-index" to "2")), "onClick" to fun(){
                                    play(3);
                                }
                                ), null, 8, utsArrayOf(
                                    "style",
                                    "onClick"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_sn_transition, utsMapOf("mode" to "fadeUp", "show" to unref(values)[3]), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createElementVNode("view", utsMapOf("style" to normalizeStyle(unref(blockStylesC))), null, 4)
                            );
                        }
                        ), "_" to 1), 8, utsArrayOf(
                            "show"
                        )),
                        createVNode(_component_com_card, utsMapOf("class" to "com-card", "title" to "右滑淡入"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_button, utsMapOf("text" to "播放", "style" to normalizeStyle(utsMapOf("z-index" to "2")), "onClick" to fun(){
                                    play(4);
                                }
                                ), null, 8, utsArrayOf(
                                    "style",
                                    "onClick"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_sn_transition, utsMapOf("mode" to "fadeRight", "show" to unref(values)[4]), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createElementVNode("view", utsMapOf("style" to normalizeStyle(unref(blockStylesC))), null, 4)
                            );
                        }
                        ), "_" to 1), 8, utsArrayOf(
                            "show"
                        )),
                        createVNode(_component_com_card, utsMapOf("class" to "com-card", "title" to "下滑淡入"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_button, utsMapOf("text" to "播放", "style" to normalizeStyle(utsMapOf("z-index" to "2")), "onClick" to fun(){
                                    play(5);
                                }
                                ), null, 8, utsArrayOf(
                                    "style",
                                    "onClick"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_sn_transition, utsMapOf("mode" to "fadeDown", "show" to unref(values)[5]), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createElementVNode("view", utsMapOf("style" to normalizeStyle(unref(blockStylesC))), null, 4)
                            );
                        }
                        ), "_" to 1), 8, utsArrayOf(
                            "show"
                        )),
                        createVNode(_component_com_card, utsMapOf("class" to "com-card", "title" to "左滑淡入"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_button, utsMapOf("text" to "播放", "style" to normalizeStyle(utsMapOf("z-index" to "2")), "onClick" to fun(){
                                    play(6);
                                }
                                ), null, 8, utsArrayOf(
                                    "style",
                                    "onClick"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_sn_transition, utsMapOf("mode" to "fadeLeft", "show" to unref(values)[6]), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createElementVNode("view", utsMapOf("style" to normalizeStyle(unref(blockStylesC))), null, 4)
                            );
                        }
                        ), "_" to 1), 8, utsArrayOf(
                            "show"
                        )),
                        createVNode(_component_com_card, utsMapOf("class" to "com-card", "title" to "上拉"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_button, utsMapOf("text" to "播放", "style" to normalizeStyle(utsMapOf("z-index" to "2")), "onClick" to fun(){
                                    play(7);
                                }
                                ), null, 8, utsArrayOf(
                                    "style",
                                    "onClick"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_sn_transition, utsMapOf("mode" to "slideUp", "show" to unref(values)[7]), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createElementVNode("view", utsMapOf("style" to normalizeStyle(unref(blockStylesC))), null, 4)
                            );
                        }
                        ), "_" to 1), 8, utsArrayOf(
                            "show"
                        )),
                        createVNode(_component_com_card, utsMapOf("class" to "com-card", "title" to "右拉"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_button, utsMapOf("text" to "播放", "style" to normalizeStyle(utsMapOf("z-index" to "2")), "onClick" to fun(){
                                    play(8);
                                }
                                ), null, 8, utsArrayOf(
                                    "style",
                                    "onClick"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_sn_transition, utsMapOf("mode" to "slideRight", "show" to unref(values)[8]), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createElementVNode("view", utsMapOf("style" to normalizeStyle(unref(blockStylesC))), null, 4)
                            );
                        }
                        ), "_" to 1), 8, utsArrayOf(
                            "show"
                        )),
                        createVNode(_component_com_card, utsMapOf("class" to "com-card", "title" to "下拉"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_button, utsMapOf("text" to "播放", "style" to normalizeStyle(utsMapOf("z-index" to "2")), "onClick" to fun(){
                                    play(9);
                                }
                                ), null, 8, utsArrayOf(
                                    "style",
                                    "onClick"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_sn_transition, utsMapOf("mode" to "slideDown", "show" to unref(values)[9]), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createElementVNode("view", utsMapOf("style" to normalizeStyle(unref(blockStylesC))), null, 4)
                            );
                        }
                        ), "_" to 1), 8, utsArrayOf(
                            "show"
                        )),
                        createVNode(_component_com_card, utsMapOf("class" to "com-card", "title" to "左拉"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_button, utsMapOf("text" to "播放", "style" to normalizeStyle(utsMapOf("z-index" to "2")), "onClick" to fun(){
                                    play(10);
                                }
                                ), null, 8, utsArrayOf(
                                    "style",
                                    "onClick"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_sn_transition, utsMapOf("mode" to "slideLeft", "show" to unref(values)[10]), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createElementVNode("view", utsMapOf("style" to normalizeStyle(unref(blockStylesC))), null, 4)
                            );
                        }
                        ), "_" to 1), 8, utsArrayOf(
                            "show"
                        )),
                        createVNode(_component_sn_gap)
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
                return utsMapOf("com-card" to padStyleMapOf(utsMapOf("zIndex" to 1)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
