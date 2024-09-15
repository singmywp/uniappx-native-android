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
open class GenPagesComponentsSnList : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnList) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnList;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_alert = resolveEasyComponent("sn-alert", GenUniModulesSinleUiComponentsSnAlertSnAlertClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_list_item = resolveEasyComponent("sn-list-item", GenUniModulesSinleUiComponentsSnListItemSnListItemClass);
                val _component_sn_list = resolveEasyComponent("sn-list", GenUniModulesSinleUiComponentsSnListSnListClass);
                val _component_sn_list_chat = resolveEasyComponent("sn-list-chat", GenUniModulesSinleUiComponentsSnListChatSnListChatClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "List 列表")),
                        createVNode(_component_sn_alert, utsMapOf("type" to "primary", "text" to "一次性初始化太多列表项，因为创建大量 vnode 耗时，会导致列表初始化变慢。此时推荐使用官方的扩展组件 uni-recycle-view 来解决初始化慢的问题，该组件内部会分批创建节点，自动实现节点复用。")),
                        createVNode(_component_com_card, utsMapOf("title" to "基础用法", "note" to "List 组件用于显示列表信息、聊天信息，内置一套精美的组件模板。在 Android 端基于 recycle-view，性能优秀（设置固定的高度才支持高性能滚动）。\\nsn-list 下的子组件可为 sn-list-item 和 sn-list-chat。")),
                        createVNode(_component_sn_list, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_list_item, utsMapOf("title" to "列表文字")),
                                createVNode(_component_sn_list_item, utsMapOf("title" to "列表文字", "rightText" to "右侧文字")),
                                createVNode(_component_sn_list_item, utsMapOf("title" to "列表文字", "note" to "列表描述信息", "rightText" to "右侧文字"))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "禁用状态", "note" to "可为单独的子项设置禁用状态")),
                        createVNode(_component_sn_list, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_list_item, utsMapOf("title" to "列表启用状态", "rightText" to "右侧文字")),
                                createVNode(_component_sn_list_item, utsMapOf("title" to "列表禁用状态", "disabled" to "")),
                                createVNode(_component_sn_list_item, utsMapOf("title" to "列表启用状态", "rightText" to "右侧文字"))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "右侧箭头", "note" to "可为单独的子项设置右侧箭头")),
                        createVNode(_component_sn_list, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_list_item, utsMapOf("title" to "列表文字", "rightText" to "右侧文字")),
                                createVNode(_component_sn_list_item, utsMapOf("title" to "列表文字", "rightText" to "右侧文字", "showArrow" to ""))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "无分割线", "note" to "可为单独的子项设置右侧箭头")),
                        createVNode(_component_sn_list, utsMapOf("showBorder" to false), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_list_item, utsMapOf("title" to "列表文字", "rightText" to "右侧文字")),
                                createVNode(_component_sn_list_item, utsMapOf("title" to "列表文字", "rightText" to "右侧文字"))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "文本溢出隐藏", "note" to "可设置最大行数，超过则以省略号隐藏文本")),
                        createVNode(_component_sn_list, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_list_item, utsMapOf("title" to unref(longText1), "ellipsis" to 1), null, 8, utsArrayOf(
                                    "title"
                                )),
                                createVNode(_component_sn_list_item, utsMapOf("rightText" to "2 行", "title" to unref(longText2), "ellipsis" to 2), null, 8, utsArrayOf(
                                    "title"
                                )),
                                createVNode(_component_sn_list_item, utsMapOf("rightText" to "3 行", "title" to unref(longText3), "ellipsis" to 3, "showArrow" to ""), null, 8, utsArrayOf(
                                    "title"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "显示图标或图片", "note" to "每个单独的子项都可以设置图标或图片")),
                        createVNode(_component_sn_list, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_list_item, utsMapOf("title" to "列表左侧带扩展图标", "note" to "列表描述信息", "icon" to "settings-line", "showArrow" to "")),
                                createVNode(_component_sn_list_item, utsMapOf("title" to "列表左侧带缩略图", "note" to "列表描述信息", "avatar" to "https://img01.sogoucdn.com/app/a/100520093/8379901cc65ba509-45c21ceb904429fc-fffc7639a9a4d453515b56b6c1a3fc58.jpg", "showArrow" to "")),
                                createVNode(_component_sn_list_item, utsMapOf("title" to "列表左侧带缩略图", "note" to "列表描述信息", "rightText" to "大图", "avatar" to "http://img.wxcha.com/m00/bb/18/bc2167461f0ba311a992f3f00a45c58d.jpg", "avatarSize" to "40px", "showArrow" to ""))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "聊天列表", "note" to "像聊天列表一样")),
                        createVNode(_component_sn_list, utsMapOf("showBorder" to false), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_list_chat, utsMapOf("title" to "琴易文", "note" to "你好, 这里是 SinleUI", "avatar" to "https://img01.sogoucdn.com/app/a/100520093/8379901cc65ba509-45c21ceb904429fc-fffc7639a9a4d453515b56b6c1a3fc58.jpg", "avatarShape" to "circle")),
                                createVNode(_component_sn_list_chat, utsMapOf("title" to "道夏柳", "note" to "emmm... 这个问题有点复杂了", "avatar" to "https://ww3.sinaimg.cn/mw690/007QvzfIly1ho2zt8iyznj30sg0sgneb.jpg", "time" to Date.now(), "badgeValue" to 32, "badgeMax" to 99), null, 8, utsArrayOf(
                                    "time"
                                )),
                                createVNode(_component_sn_list_chat, utsMapOf("title" to "乜晨", "note" to "[图片] 这种报错如何解决", "avatar" to "http://img.wxcha.com/m00/bb/18/bc2167461f0ba311a992f3f00a45c58d.jpg", "time" to Date.now(), "badgePosition" to "right", "badgeValue" to 158, "badgeMax" to 99), null, 8, utsArrayOf(
                                    "time"
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
