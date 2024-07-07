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
open class GenPagesComponentsSnPopup : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnPopup) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnPopup;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val theme = computed(fun(): String {
                return `$snui`.configs.app.theme;
            }
            );
            val text = ref("君不见，黄河之水天上来，奔流到海不复回。\n君不见，高堂明镜悲白发，朝如青丝暮成雪。");
            val position = ref("center");
            val maskClose = ref(false);
            val aniDur = ref(300);
            val disabled = ref(true);
            val popupEle = ref(null as GenUniModulesSinleUiComponentsSnPopupSnPopupComponentPublicInstance?);
            val countMode = ref(false);
            val timer = ref(null as Number?);
            fun genClosePopupFn() {
                if (disabled.value == false) {
                    (popupEle.value!! as GenUniModulesSinleUiComponentsSnPopupSnPopupComponentPublicInstance).close();
                }
            }
            val closePopup = ::genClosePopupFn;
            fun genStartCountingFn() {
                disabled.value = true;
                timer.value = setTimeout(fun(){
                    disabled.value = false;
                    clearTimeout(timer.value!!);
                    timer.value = null;
                }
                , 2000);
            }
            val startCounting = ::genStartCountingFn;
            fun genGetPositionFn(): String {
                var positions = utsArrayOf(
                    "top",
                    "center",
                    "bottom"
                );
                var i = positions.indexOf(position.value);
                return if (i < positions.length - 1) {
                    positions[i + 1];
                } else {
                    positions[0];
                }
                ;
            }
            val getPosition = ::genGetPositionFn;
            fun genShowPopupFn(props: UTSJSONObject) {
                disabled.value = false;
                position.value = if (props["position"] != null) {
                    props["position"] as String;
                } else {
                    "center";
                }
                ;
                aniDur.value = if (props["aniDur"] != null) {
                    props["aniDur"] as Number;
                } else {
                    300;
                }
                ;
                maskClose.value = if (props["maskClose"] != null) {
                    props["maskClose"] as Boolean;
                } else {
                    true;
                }
                ;
                countMode.value = if (props["countMode"] != null) {
                    props["countMode"] as Boolean;
                } else {
                    false;
                }
                ;
                setTimeout(fun(){
                    (popupEle.value!! as GenUniModulesSinleUiComponentsSnPopupSnPopupComponentPublicInstance).open();
                }
                , 100);
            }
            val showPopup = ::genShowPopupFn;
            fun genActionFn(id: String) {
                when (id) {
                    "basic" -> 
                        showPopup(UTSJSONObject());
                    "position" -> 
                        showPopup(object : UTSJSONObject() {
                            var position = getPosition()
                        });
                    "ani-dur" -> 
                        showPopup(object : UTSJSONObject() {
                            var aniDur: Number = 1000
                        });
                    "no-animation" -> 
                        showPopup(object : UTSJSONObject() {
                            var showAnimation = false
                        });
                    "no-mask-close" -> 
                        {
                            showPopup(object : UTSJSONObject() {
                                var maskClose = false
                                var countMode = true
                            });
                            startCounting();
                        }
                    else -> 
                        showPopup(UTSJSONObject());
                }
            }
            val action = ::genActionFn;
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_button = resolveEasyComponent("sn-button", GenUniModulesSinleUiComponentsSnButtonSnButtonClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_gap = resolveEasyComponent("sn-gap", GenUniModulesSinleUiComponentsSnGapSnGapClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_sn_card = resolveEasyComponent("sn-card", GenUniModulesSinleUiComponentsSnCardSnCardClass);
                val _component_sn_popup = resolveEasyComponent("sn-popup", GenUniModulesSinleUiComponentsSnPopupSnPopupClass);
                return createElementVNode(Fragment, null, utsArrayOf(
                    createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_topbar, utsMapOf("title" to "Popup 弹出层")),
                            createVNode(_component_com_card, utsMapOf("title" to "基础用法", "note" to "需要弹窗？试试它吧"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    createVNode(_component_sn_button, utsMapOf("text" to "Click Me", "level" to "second", "type" to "primary", "onClick" to fun(){
                                        action("basic");
                                    }
                                    ), null, 8, utsArrayOf(
                                        "onClick"
                                    ))
                                );
                            }
                            ), "_" to 1)),
                            createVNode(_component_com_card, utsMapOf("title" to "位置", "note" to "试试改变弹出层的位置。注意，动效也会随之而变哦"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    createVNode(_component_sn_button, utsMapOf("text" to "Click Me", "level" to "second", "type" to "primary", "onClick" to fun(){
                                        action("position");
                                    }
                                    ), null, 8, utsArrayOf(
                                        "onClick"
                                    ))
                                );
                            }
                            ), "_" to 1)),
                            createVNode(_component_com_card, utsMapOf("title" to "动画时长", "note" to "自由调节动画的播放时长"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    createVNode(_component_sn_button, utsMapOf("text" to "Click Me", "level" to "second", "type" to "primary", "onClick" to fun(){
                                        action("ani-dur");
                                    }
                                    ), null, 8, utsArrayOf(
                                        "onClick"
                                    ))
                                );
                            }
                            ), "_" to 1)),
                            createVNode(_component_com_card, utsMapOf("title" to "禁用遮罩关闭", "note" to "有时候，你并不想让用户那么容易地关闭弹窗"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    createVNode(_component_sn_button, utsMapOf("text" to "Click Me", "level" to "second", "type" to "primary", "onClick" to fun(){
                                        action("no-mask-close");
                                    }
                                    ), null, 8, utsArrayOf(
                                        "onClick"
                                    ))
                                );
                            }
                            ), "_" to 1)),
                            createVNode(_component_sn_gap)
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_sn_popup, utsMapOf("ref_key" to "popupEle", "ref" to popupEle, "position" to unref(position), "aniDur" to unref(aniDur), "maskClose" to unref(maskClose)), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createElementVNode("view", utsMapOf("class" to "pop-content", "style" to normalizeStyle(utsMapOf("background" to unref(colors)[if (unref(theme) == "light") {
                                "front";
                            } else {
                                "info";
                            }
                            ], "borderRadius" to unref(`$snui`).configs.radius.normal))), utsArrayOf(
                                createVNode(_component_sn_card, utsMapOf("title" to "将进酒", "border" to "0", "bgColor" to "transparent"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("type" to "info", "line-height" to "1.6", "text" to unref(text)), null, 8, utsArrayOf(
                                            "text"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                if (isTrue(unref(countMode))) {
                                    createVNode(_component_sn_button, utsMapOf("key" to 0, "type" to "primary", "level" to "second", "text" to if (unref(disabled)) {
                                        "2 \u79D2\u540E\u53EF\u5173\u95ED";
                                    } else {
                                        "关闭";
                                    }, "disabled" to unref(disabled), "onClick" to fun(){
                                        closePopup();
                                    }), null, 8, utsArrayOf(
                                        "text",
                                        "disabled",
                                        "onClick"
                                    ));
                                } else {
                                    createCommentVNode("v-if", true);
                                }
                            ), 4)
                        );
                    }
                    ), "_" to 1), 8, utsArrayOf(
                        "position",
                        "aniDur",
                        "maskClose"
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
                return utsMapOf("pop-content" to padStyleMapOf(utsMapOf("paddingTop" to 10, "paddingRight" to 10, "paddingBottom" to 10, "paddingLeft" to 10, "width" to "80%", "marginTop" to 10, "marginRight" to "auto", "marginBottom" to 10, "marginLeft" to "auto", "boxShadow" to "0px 2px 20px -3px rgba(0, 0, 0, 0.09)")), "placeholder1" to padStyleMapOf(utsMapOf("width" to "100%", "height" to 40, "backgroundColor" to "rgba(0,0,0,0)")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
