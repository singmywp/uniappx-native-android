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
open class GenPagesComponentsSnTimer : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnTimer) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnTimer;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val running = ref(false);
            val timedata = ref(SnTimerTime(d = 0, h = 0, m = 0, s = 0, ms = 0));
            val timerEle = ref(null as GenUniModulesSinleUiComponentsSnTimerSnTimerComponentPublicInstance?);
            fun genOnChangeFn(data: SnTimerTime) {
                timedata.value = data;
            }
            val onChange = ::genOnChangeFn;
            fun genPlayOrPauseFn() {
                running.value = !running.value;
                if (running.value) {
                    timerEle.value!!.start();
                } else {
                    timerEle.value!!.pause();
                }
            }
            val playOrPause = ::genPlayOrPauseFn;
            fun genResetFn() {
                running.value = false;
                timerEle.value!!.reset();
            }
            val reset = ::genResetFn;
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_timer = resolveEasyComponent("sn-timer", GenUniModulesSinleUiComponentsSnTimerSnTimerClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_tag = resolveEasyComponent("sn-tag", GenUniModulesSinleUiComponentsSnTagSnTagClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_sn_row = resolveEasyComponent("sn-row", GenUniModulesSinleUiComponentsSnRowSnRowClass);
                val _component_sn_icon = resolveEasyComponent("sn-icon", GenUniModulesSinleUiComponentsSnIconSnIconClass);
                val _component_sn_button = resolveEasyComponent("sn-button", GenUniModulesSinleUiComponentsSnButtonSnButtonClass);
                val _component_sn_button_group = resolveEasyComponent("sn-button-group", GenUniModulesSinleUiComponentsSnButtonGroupSnButtonGroupClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Timer 计时器")),
                        createVNode(_component_com_card, utsMapOf("title" to "基础使用", "note" to "顾名思义，就是一个计时器。\\n推荐使用插槽布局为主，样式更好调。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_timer)
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "自定义样式", "note" to "可以自由设置文本的颜色和大小等样式"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_timer, utsMapOf("textColor" to unref(colors).successDark, "textSize" to unref(`$snui`).configs.font.size(3), "customStyle" to object : UTSJSONObject() {
                                    var fontFamily = "alipuhuiheavy"
                                }), null, 8, utsArrayOf(
                                    "textColor",
                                    "textSize"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "格式化", "note" to "计时器内置文字支持时间格式化（参照Day.js）。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_timer, utsMapOf("format" to "DD 天 HH 小时 mm 分钟 ss 秒"))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "毫秒精度", "note" to "虽然使用一般模式也支持获取毫秒，但误差极大，不如此模式精确。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_timer, utsMapOf("format" to "mm:ss.SS", "millisecond" to ""))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "插槽", "note" to "推荐使用插槽模式，自由度更高。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_timer, utsMapOf("millisecond" to "", "onChange" to onChange), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "type" to "primary", "text" to ("" + unref(timedata).h)), null, 8, utsArrayOf(
                                                    "text"
                                                )),
                                                createVNode(_component_sn_text, utsMapOf("class" to "spacing", "text" to "时", "font" to "alipuhuiheavy")),
                                                createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "type" to "primary", "text" to ("" + unref(timedata).m)), null, 8, utsArrayOf(
                                                    "text"
                                                )),
                                                createVNode(_component_sn_text, utsMapOf("class" to "spacing", "text" to "分", "font" to "alipuhuiheavy")),
                                                createVNode(_component_sn_tag, utsMapOf("class" to "spacing", "type" to "primary", "text" to ("" + unref(timedata).s)), null, 8, utsArrayOf(
                                                    "text"
                                                )),
                                                createVNode(_component_sn_text, utsMapOf("class" to "spacing", "text" to "秒", "font" to "alipuhuiheavy"))
                                            );
                                        }
                                        ), "_" to 1))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "自由控制", "note" to "提供 API 以自由控制计时器的状态。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("align-items" to "center"))), utsArrayOf(
                                    createVNode(_component_sn_timer, utsMapOf("ref_key" to "timerEle", "ref" to timerEle, "format" to "mm:ss.SS", "millisecond" to "", "autoplay" to false), null, 512),
                                    createVNode(_component_sn_button_group, utsMapOf("align" to "center"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            createVNode(_component_sn_button, utsMapOf("onClick" to reset), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                                return utsArrayOf(
                                                    createVNode(_component_sn_icon, utsMapOf("name" to "refresh-line"))
                                                );
                                            }
                                            ), "_" to 1)),
                                            createVNode(_component_sn_button, utsMapOf("type" to "primary", "level" to "second", "onClick" to playOrPause), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
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
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ), utsArrayOf(
                    GenApp.styles
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("spacing" to padStyleMapOf(utsMapOf("marginRight" to 5)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
