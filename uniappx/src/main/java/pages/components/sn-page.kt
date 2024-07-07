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
open class GenPagesComponentsSnPage : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnPage) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnPage;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val colorLib = `$snui`.libs.color;
            val bgColor = ref(colors.value.page);
            val padding = ref("15");
            val frontColorC = computed(fun(): String {
                return colorLib.tinyColor(bgColor.value).contrasting().toHexString();
            }
            );
            val cardBgC = computed(fun(): String {
                if (frontColorC.value == "#ffffff") {
                    return colorLib.tinyColor(bgColor.value).lighten(15).toHexString();
                } else {
                    return colorLib.tinyColor(bgColor.value).darken(4).toHexString();
                }
            }
            );
            val activeBtnBgColor = computed(fun(): String {
                if (frontColorC.value == "#ffffff") {
                    return colorLib.tinyColor(bgColor.value).lighten(5).toHexString();
                } else {
                    return colorLib.tinyColor(bgColor.value).darken(2).toHexString();
                }
            }
            );
            fun genRandomBgColorFn() {
                var allow = false;
                while(!allow){
                    var _bg = colorLib.random();
                    var _front = colorLib.tinyColor(_bg).contrasting();
                    var _cardBg = _bg;
                    if (_front.toHexString() == "#ffffff") {
                        _cardBg = _bg.lighten(15);
                    } else {
                        _cardBg = colorLib.tinyColor(_bg).darken(4);
                    }
                    var apca = Math.abs(colorLib.calcAPCA(_cardBg, _bg));
                    if (apca > 5) {
                        bgColor.value = _bg.toHexString();
                        break;
                    }
                }
            }
            val randomBgColor = ::genRandomBgColorFn;
            fun genResetBgColorFn() {
                bgColor.value = colors.value.page;
            }
            val resetBgColor = ::genResetBgColorFn;
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_button = resolveEasyComponent("sn-button", GenUniModulesSinleUiComponentsSnButtonSnButtonClass);
                val _component_sn_button_group = resolveEasyComponent("sn-button-group", GenUniModulesSinleUiComponentsSnButtonGroupSnButtonGroupClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, utsMapOf("bgColor" to unref(bgColor)), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Page 页面", "bgColor" to unref(bgColor), "titleColor" to unref(frontColorC), "buttonBgColor" to unref(bgColor), "buttonActiveBgColor" to unref(activeBtnBgColor), "customButtonIconStyle" to object : UTSJSONObject() {
                            var color = unref(frontColorC)
                        }), null, 8, utsArrayOf(
                            "bgColor",
                            "titleColor",
                            "buttonBgColor",
                            "buttonActiveBgColor",
                            "customButtonIconStyle"
                        )),
                        createVNode(_component_com_card, utsMapOf("title" to "基础用法", "note" to "页面容器，是页面的根节点。使用页面容器可帮助您快速布局页面，无需手动管理滚动相关组件及事件。\\n支持动态修改页面背景色、全局背景色。", "noteColor" to unref(frontColorC), "titleColor" to unref(frontColorC), "bgColor" to unref(cardBgC)), null, 8, utsArrayOf(
                            "noteColor",
                            "titleColor",
                            "bgColor"
                        )),
                        createVNode(_component_com_card, utsMapOf("title" to "修改背景色", "titleColor" to unref(frontColorC), "bgColor" to unref(cardBgC)), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_button_group, utsMapOf("vertical" to ""), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_button, utsMapOf("text" to "随机背景色", "long" to "", "bgColor" to unref(bgColor), "textColor" to unref(frontColorC), "activeBgColor" to unref(activeBtnBgColor), "onClick" to randomBgColor), null, 8, utsArrayOf(
                                            "bgColor",
                                            "textColor",
                                            "activeBgColor"
                                        )),
                                        createVNode(_component_sn_button, utsMapOf("text" to "还原", "long" to "", "bgColor" to unref(bgColor), "textColor" to unref(frontColorC), "activeBgColor" to unref(activeBtnBgColor), "onClick" to resetBgColor), null, 8, utsArrayOf(
                                            "bgColor",
                                            "textColor",
                                            "activeBgColor"
                                        ))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1), 8, utsArrayOf(
                            "titleColor",
                            "bgColor"
                        ))
                    );
                }
                ), "_" to 1), 8, utsArrayOf(
                    "bgColor"
                ));
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
