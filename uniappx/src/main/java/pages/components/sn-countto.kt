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
open class GenPagesComponentsSnCountto : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnCountto) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnCountto;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val running = ref(true);
            val counttoEle = ref(null as GenUniModulesSinleUiComponentsSnCounttoSnCounttoComponentPublicInstance?);
            fun genPlayOrPauseFn() {
                running.value = !running.value;
                if (running.value) {
                    counttoEle.value!!.play();
                } else {
                    counttoEle.value!!.pause();
                }
            }
            val playOrPause = ::genPlayOrPauseFn;
            fun genStopFn() {
                running.value = false;
                counttoEle.value!!.stop();
            }
            val stop = ::genStopFn;
            fun genResetFn() {
                running.value = true;
                counttoEle.value!!.reset();
            }
            val reset = ::genResetFn;
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_countto = resolveEasyComponent("sn-countto", GenUniModulesSinleUiComponentsSnCounttoSnCounttoClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_icon = resolveEasyComponent("sn-icon", GenUniModulesSinleUiComponentsSnIconSnIconClass);
                val _component_sn_button = resolveEasyComponent("sn-button", GenUniModulesSinleUiComponentsSnButtonSnButtonClass);
                val _component_sn_button_group = resolveEasyComponent("sn-button-group", GenUniModulesSinleUiComponentsSnButtonGroupSnButtonGroupClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Countto 数字滚动")),
                        createVNode(_component_com_card, utsMapOf("title" to "基础使用", "note" to "滚动的数字，常用在 PPT 的大屏上"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_countto, utsMapOf("endVal" to 6666))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "开始值 & 结束值", "note" to "支持自定义开始和结束的数值"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_countto, utsMapOf("startVal" to 6666, "endVal" to 7777))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "小数精度", "note" to "支持自定义小数滚动位数"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_countto, utsMapOf("startVal" to 6666, "endVal" to 7777, "decimals" to 2)),
                                createVNode(_component_sn_countto, utsMapOf("startVal" to 6666, "endVal" to 7777, "decimals" to 8))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "动画时长", "note" to "支持自定义动画时长"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_countto, utsMapOf("aniDur" to 10000, "startVal" to 6666, "endVal" to 7777))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "缓动动画", "note" to "以 easeOutSine 缓动动画代替默认的 linear 动画，使得动画在结束前减速"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_countto, utsMapOf("easing" to "", "aniDur" to 5000, "endVal" to 7777))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "自定义样式", "note" to "多姿多样，丰富多彩"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_countto, utsMapOf("endVal" to 7777, "textColor" to unref(colors).successDark, "textSize" to unref(`$snui`).configs.font.size(3), "customStyle" to object : UTSJSONObject() {
                                    var fontFamily = "alipuhuiheavy"
                                }), null, 8, utsArrayOf(
                                    "textColor",
                                    "textSize"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "自由控制", "note" to "提供 API 以自由控制数字滚动的状态。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("align-items" to "center"))), utsArrayOf(
                                    createVNode(_component_sn_countto, utsMapOf("ref_key" to "counttoEle", "ref" to counttoEle, "aniDur" to 5000, "endVal" to 7777), null, 512),
                                    createVNode(_component_sn_button_group, utsMapOf("align" to "center"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            createVNode(_component_sn_button, utsMapOf("round-size" to "50px", "round" to "", "onClick" to reset), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                                return utsArrayOf(
                                                    createVNode(_component_sn_icon, utsMapOf("name" to "refresh-line"))
                                                );
                                            }
                                            ), "_" to 1)),
                                            createVNode(_component_sn_button, utsMapOf("type" to "primary", "level" to "second", "round-size" to "60px", "round" to "", "onClick" to playOrPause), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                                return utsArrayOf(
                                                    createVNode(_component_sn_icon, utsMapOf("name" to ("" + (if (unref(running)) {
                                                        "pause";
                                                    } else {
                                                        "play";
                                                    }
                                                    ) + "-fill"), "color" to unref(colors).primary), null, 8, utsArrayOf(
                                                        "name",
                                                        "color"
                                                    ))
                                                );
                                            }
                                            ), "_" to 1)),
                                            createVNode(_component_sn_button, utsMapOf("round-size" to "50px", "round" to "", "onClick" to stop), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                                return utsArrayOf(
                                                    createVNode(_component_sn_icon, utsMapOf("name" to "stop-circle-fill"))
                                                );
                                            }
                                            ), "_" to 1))
                                        );
                                    }
                                    ), "_" to 1))
                                ), 4)
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
