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
open class GenPagesComponentsSnCard : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnCard) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnCard;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val fav = ref(false);
            val like = ref(false);
            val theme = computed(fun(): String {
                return `$snui`.configs.app.theme;
            }
            );
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_sn_card = resolveEasyComponent("sn-card", GenUniModulesSinleUiComponentsSnCardSnCardClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_avatar = resolveEasyComponent("sn-avatar", GenUniModulesSinleUiComponentsSnAvatarSnAvatarClass);
                val _component_sn_icon = resolveEasyComponent("sn-icon", GenUniModulesSinleUiComponentsSnIconSnIconClass);
                val _component_sn_button = resolveEasyComponent("sn-button", GenUniModulesSinleUiComponentsSnButtonSnButtonClass);
                val _component_sn_button_group = resolveEasyComponent("sn-button-group", GenUniModulesSinleUiComponentsSnButtonGroupSnButtonGroupClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Card 卡片")),
                        createVNode(_component_com_card, utsMapOf("title" to "基础用法", "note" to "卡片的基础用法"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_card, utsMapOf("title" to "卡片"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("text" to "卡片内容"))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "边框", "note" to "也可以没有边界感的 (bush"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_card, utsMapOf("title" to "卡片", "border" to "none"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("text" to "卡片内容"))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "阴影", "note" to "自带阴影的卡片，更有层次感了\\n\\n不推荐使用阴影，uni-app x 的阴影可能导致很多不必要的 bug，如 hover 不生效、border 意外消失等"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_card, utsMapOf("title" to "卡片", "customStyle" to object : UTSJSONObject() {
                                    var boxShadow = "0px 6px 16px -4px rgba(0, 0, 0, 0.08)"
                                }), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("text" to "卡片内容"))
                                    );
                                }
                                ), "_" to 1), 8, utsArrayOf(
                                    "customStyle"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "圆角", "note" to "自定义圆角边框，显示更出彩"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_card, utsMapOf("title" to "卡片", "borderRadius" to "100px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("text" to "卡片内容"))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "无标题", "note" to "没有标题，适用于不会总结的懒人，比如我"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_card, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        " 卡片内容 "
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "章节标符", "note" to "也许是锦上添花吧"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_card, utsMapOf("title" to "SinleUI", "sectionColor" to "#5777ff", "section" to ""), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("text" to "\u3000\u3000一个简洁、轻巧的现代移动应用UI框架。"))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "自定义样式", "note" to "当你想要插入一段信息而担忧影响总体观感时，不妨试试自定义样式"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_card, utsMapOf("title" to "??️ 艾伦·图灵", "bgColor" to if (unref(theme) == "light") {
                                    "#f9f9fa";
                                } else {
                                    "#2b2b2b";
                                }
                                , "border" to "none", "borderRadius" to "10px", "customHeaderStyle" to object : UTSJSONObject() {
                                    var padding = "20px 20px 10px 20px"
                                }), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("class" to "paragraph", "selectable" to "", "text" to "\u3000\u3000艾伦·图灵于1912年6月23日出生于英国伦敦，是英国著名的数学家、逻辑学家，被称为计算机科学之父、人工智能之父。\n\u3000\u3000图灵的贡献举世瞩目。他是一位极富创造力的科学家，对计算机事业的发展做出了重要的贡献。然而，他因同性恋倾向而被审判并定以严重猥亵的罪名，遭到的迫害使得他的职业生涯尽毁。1954年，他吃下含有氰化物的苹果中毒身亡，年仅42岁。\n\u3000\u3000随着时间的推移，人们开始重新认图灵和他所经历的不公平对待。\n\u3000\u30002009年，时任首相戈登·布朗代表英国政府作出正式道歉。2013年，英国女王伊丽莎白二世向图灵追加了“皇家赦免令”"))
                                    );
                                }
                                ), "_" to 1), 8, utsArrayOf(
                                    "bgColor"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "插槽", "note" to "插槽分为 avatar, header-extra, body, footer, action"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_card, utsMapOf("title" to "SinleUI", "titleFont" to "alipuhuiheavy", "bgColor" to unref(colors).front), utsMapOf("avatar" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_avatar, utsMapOf("src" to "/static/logo.png"))
                                    );
                                }
                                ), "header-extra" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_button_group, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_button, utsMapOf("round" to "", "onClick" to fun(){
                                                    fav.value = !unref(fav);
                                                }
                                                ), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                                    return utsArrayOf(
                                                        createVNode(_component_sn_icon, utsMapOf("name" to "star-fill", "size" to "20px", "color" to if (unref(fav)) {
                                                            unref(colors).warning;
                                                        } else {
                                                            unref(colors).infoDark;
                                                        }
                                                        ), null, 8, utsArrayOf(
                                                            "color"
                                                        ))
                                                    );
                                                }
                                                ), "_" to 1), 8, utsArrayOf(
                                                    "onClick"
                                                )),
                                                createVNode(_component_sn_button, utsMapOf("round" to "", "onClick" to fun(){
                                                    like.value = !unref(like);
                                                }
                                                ), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                                    return utsArrayOf(
                                                        createVNode(_component_sn_icon, utsMapOf("name" to "heart-3-fill", "size" to "20px", "color" to if (unref(like)) {
                                                            unref(colors).error;
                                                        } else {
                                                            unref(colors).infoDark;
                                                        }
                                                        ), null, 8, utsArrayOf(
                                                            "color"
                                                        ))
                                                    );
                                                }
                                                ), "_" to 1), 8, utsArrayOf(
                                                    "onClick"
                                                ))
                                            );
                                        }
                                        ), "_" to 1))
                                    );
                                }
                                ), "footer" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("text" to "By: Aaron Lan", "align" to "right", "size" to unref(`$snui`).configs.font.size(2), "color" to unref(colors).text, "customStyle" to object : UTSJSONObject() {
                                            var width = "100%"
                                        }), null, 8, utsArrayOf(
                                            "size",
                                            "color"
                                        ))
                                    );
                                }
                                ), "action" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_button_group, utsMapOf("style" to normalizeStyle(utsMapOf("justify-content" to "flex-end"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_button, utsMapOf("text" to "分享", "type" to "primary", "level" to "second")),
                                                createVNode(_component_sn_button, utsMapOf("text" to "支持", "type" to "primary", "level" to "second"))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "style"
                                        ))
                                    );
                                }
                                ), "default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("text" to "\u3000\u3000一个简洁、轻巧的现代移动应用UI框架。"))
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
                return utsMapOf("black" to padStyleMapOf(utsMapOf("color" to "#000000", "transitionProperty" to "color", "transitionDuration" to "0.2s")), "fav-active" to padStyleMapOf(utsMapOf("color" to "#f3d00a")), "like-active" to padStyleMapOf(utsMapOf("color" to "#ff8069")), "@TRANSITION" to utsMapOf("black" to utsMapOf("property" to "color", "duration" to "0.2s")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
