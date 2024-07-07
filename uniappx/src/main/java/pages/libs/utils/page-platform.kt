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
open class GenPagesLibsUtilsPagePlatform : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesLibsUtilsPagePlatform) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesLibsUtilsPagePlatform;
            val _cache = __ins.renderCache;
            val snu = `$snui`.utils;
            val clipboardData = ref("");
            val osTheme = ref("");
            val windowHeight = ref(0);
            fun genGetClipboardDataFn() {
                snu.platform.getClipboardData().then(fun(text: String){
                    clipboardData.value = text;
                }
                );
            }
            val getClipboardData = ::genGetClipboardDataFn;
            fun genShowToastFn() {
                snu.platform.showToast(object : UTSJSONObject() {
                    var title = "Hello, SinleUI!"
                    var position = "center"
                });
            }
            val showToast = ::genShowToastFn;
            return fun(): Any? {
                val _component_sn_button = resolveEasyComponent("sn-button", GenUniModulesSinleUiComponentsSnButtonSnButtonClass);
                val _component_sn_button_group = resolveEasyComponent("sn-button-group", GenUniModulesSinleUiComponentsSnButtonGroupSnButtonGroupClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                return createElementVNode(Fragment, null, utsArrayOf(
                    createVNode(_component_com_card, utsMapOf("title" to "打开链接", "note" to "使用默认应用打开链接（Url、Schemes等）。Android 必须加上协议，否则会报错。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_button_group, utsMapOf("vertical" to ""), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    createVNode(_component_sn_button, utsMapOf("type" to "primary", "text" to "tel:10086", "long" to "", "onClick" to fun(){
                                        unref(snu).platform.openLink("tel:10086");
                                    }
                                    ), null, 8, utsArrayOf(
                                        "onClick"
                                    )),
                                    createVNode(_component_sn_button, utsMapOf("type" to "primary", "text" to "https://www.dcloud.net.cn", "long" to "", "onClick" to fun(){
                                        unref(snu).platform.openLink("https://www.dcloud.net.cn");
                                    }
                                    ), null, 8, utsArrayOf(
                                        "onClick"
                                    )),
                                    createVNode(_component_sn_button, utsMapOf("type" to "primary", "text" to "mqq://", "long" to "", "onClick" to fun(){
                                        unref(snu).platform.openLink("mqq://");
                                    }
                                    ), null, 8, utsArrayOf(
                                        "onClick"
                                    ))
                                );
                            }
                            ), "_" to 1))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "拨打电话", "note" to "直接拨打指定的电话号码。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_button, utsMapOf("type" to "primary", "text" to "拨打 10086", "onClick" to fun(){
                                unref(snu).platform.makePhoneCall("10086");
                            }
                            ), null, 8, utsArrayOf(
                                "onClick"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "写入剪切板", "note" to "将文本写入剪切板。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_button, utsMapOf("type" to "primary", "text" to "写入文本: Hello, SinleUI!", "onClick" to fun(){
                                unref(snu).platform.setClipboardData("Hello, SinleUI!");
                            }
                            ), null, 8, utsArrayOf(
                                "onClick"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "从剪切板读取", "note" to "从剪切板读取文本数据。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u526A\u5207\u677F\u6570\u636E\uFF1A" + unref(clipboardData))), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_button, utsMapOf("type" to "primary", "text" to "读取文本", "onClick" to fun(){
                                getClipboardData();
                            }
                            ), null, 8, utsArrayOf(
                                "onClick"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "显示提示框", "note" to "在不同平台上显示原生提示框。Android 平台可设置提示框的显示时长和位置。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_button, utsMapOf("type" to "primary", "text" to "Toast", "onClick" to fun(){
                                showToast();
                            }
                            ), null, 8, utsArrayOf(
                                "onClick"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "使用内置全屏Webview打开网址", "note" to "使用内置全屏 Webview 打开网址。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_button, utsMapOf("type" to "primary", "text" to "https://cn.bing.com/", "onClick" to fun(){
                                unref(snu).platform.viewUrlByWebview("https://cn.bing.com/");
                            }
                            ), null, 8, utsArrayOf(
                                "onClick"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "获取平台主题", "note" to "获取当前平台的主题设置，包括暗黑模式和浅色模式。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u5F53\u524D\u5E73\u53F0\u4E3B\u9898\uFF1A" + unref(osTheme))), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_button, utsMapOf("type" to "primary", "text" to "获取主题", "onClick" to fun(){
                                osTheme.value = unref(snu).platform.getOsTheme();
                            }
                            ), null, 8, utsArrayOf(
                                "onClick"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "获取窗口高度", "note" to "获取当前窗口的高度，以像素为单位。支持分屏模式。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u7A97\u53E3\u9AD8\u5EA6\uFF1A" + unref(windowHeight))), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_button, utsMapOf("type" to "primary", "text" to "获取高度", "onClick" to fun(){
                                windowHeight.value = unref(snu).platform.getWindowHeight();
                            }
                            ), null, 8, utsArrayOf(
                                "onClick"
                            ))
                        );
                    }
                    ), "_" to 1))
                ), 64);
            }
            ;
        }
        ;
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf());
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
