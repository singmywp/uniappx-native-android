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
open class GenPagesComponentsSnLink : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnLink) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnLink;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_link = resolveEasyComponent("sn-link", GenUniModulesSinleUiComponentsSnLinkSnLinkClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Link 超链接")),
                        createVNode(_component_com_card, utsMapOf("title" to "基础用法", "note" to "链接直达"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_link, utsMapOf("class" to "spacing", "text" to "uni-app x 官网", "href" to "https://doc.dcloud.net.cn/uni-app-x/")),
                                createVNode(_component_sn_link, utsMapOf("class" to "spacing", "text" to "拨号给 中国联通", "href" to "tel:10010")),
                                createVNode(_component_sn_link, utsMapOf("class" to "spacing", "text" to "打开QQ", "href" to "mqq://"))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "下划线", "note" to "通常超链接都是这样的经典样式"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_link, utsMapOf("text" to "百度首页", "href" to "https://www.baidu.com/", "underline" to ""))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "前后图标", "note" to "大厂的链接都是这样的"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_link, utsMapOf("class" to "spacing", "text" to "Ant Design", "href" to "https://ant-design.antgroup.com/index-cn/", "prefixIcon" to "link")),
                                createVNode(_component_sn_link, utsMapOf("class" to "spacing", "text" to "TDesign", "href" to "https://tdesign.tencent.com/", "suffixIcon" to "external-link-line"))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "自定义颜色", "note" to "也许你需要将链接隐藏在彩色的文字中"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_link, utsMapOf("text" to "uni-app x 官网", "href" to "https://doc.dcloud.net.cn/uni-app-x/", "color" to unref(colors).successDark), null, 8, utsArrayOf(
                                    "color"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "尺寸", "note" to "选择合适的大小也是一门技术活️"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_link, utsMapOf("class" to "spacing", "text" to "Dcloud 插件市场", "href" to "https://ext.dcloud.net.cn/", "size" to "14px")),
                                createVNode(_component_sn_link, utsMapOf("class" to "spacing", "text" to "问答社区", "href" to "https://ask.dcloud.net.cn/explore/", "size" to "18px"))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "本地", "note" to "使用本地内置Webview打开（仅对Web URL生效）"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_link, utsMapOf("text" to "必应", "local" to "", "href" to "https://cn.bing.com/"))
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
                return utsMapOf("spacing" to padStyleMapOf(utsMapOf("marginBottom" to 10)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
