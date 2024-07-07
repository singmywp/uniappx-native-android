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
import io.dcloud.uniapp.extapi.showModal as uni_showModal;
open class GenPagesComponentsSnAvatar : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnAvatar) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnAvatar;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            fun genOnClickFn(e: Any) {
                uni_showModal(ShowModalOptions(title = "事件监听：点击事件", content = JSON.stringify(e), showCancel = false));
            }
            val onClick = ::genOnClickFn;
            fun genOnLongpressFn(e: Any) {
                uni_showModal(ShowModalOptions(title = "事件监听：长按事件", content = JSON.stringify(e), showCancel = false));
            }
            val onLongpress = ::genOnLongpressFn;
            fun genOnDbclickFn(e: Any) {
                uni_showModal(ShowModalOptions(title = "事件监听：双击事件", content = JSON.stringify(e), showCancel = false));
            }
            val onDbclick = ::genOnDbclickFn;
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_avatar = resolveEasyComponent("sn-avatar", GenUniModulesSinleUiComponentsSnAvatarSnAvatarClass);
                val _component_sn_row = resolveEasyComponent("sn-row", GenUniModulesSinleUiComponentsSnRowSnRowClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Avatar 头像")),
                        createVNode(_component_com_card, utsMapOf("title" to "基础用法", "note" to "头像展示。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_avatar, utsMapOf("class" to "avatar", "src" to "https://i03piccdn.sogoucdn.com/25c6ee8e954336a8")),
                                        createVNode(_component_sn_avatar, utsMapOf("class" to "avatar", "src" to "https://img01.sogoucdn.com/app/a/100520093/8379901cc65ba509-45c21ceb904429fc-fffc7639a9a4d453515b56b6c1a3fc58.jpg")),
                                        createVNode(_component_sn_avatar, utsMapOf("class" to "avatar", "src" to "http://img.wxcha.com/m00/bb/18/bc2167461f0ba311a992f3f00a45c58d.jpg")),
                                        createVNode(_component_sn_avatar, utsMapOf("class" to "avatar", "src" to "http://5b0988e595225.cdn.sohucs.com/images/20191101/5f5afff53cff4ddfb6a98e4c09a67ea9.jpeg"))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "文字头像", "note" to "无图片时使用文字代替（只会显示文字的首个字符）"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_avatar, utsMapOf("class" to "avatar", "mode" to "text", "text" to "张三")),
                                        createVNode(_component_sn_avatar, utsMapOf("class" to "avatar", "mode" to "text", "text" to "李四")),
                                        createVNode(_component_sn_avatar, utsMapOf("class" to "avatar", "mode" to "text", "text" to "王五"))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "图标头像", "note" to "可以使用图标来实现部分情形的需求（如内置的加载失败样式）"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_avatar, utsMapOf("class" to "avatar", "mode" to "icon", "icon" to "star-fill")),
                                        createVNode(_component_sn_avatar, utsMapOf("class" to "avatar", "mode" to "icon", "icon" to "heart-fill"))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "颜色 【Text&Icon特色】", "note" to "类型为text或icon的头像组件可以设置颜色。\\n（type=“image”时此属性无效）"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_avatar, utsMapOf("class" to "avatar", "mode" to "text", "text" to "李四", "textColor" to unref(colors).primary, "bgColor" to unref(colors).primaryLight), null, 8, utsArrayOf(
                                            "textColor",
                                            "bgColor"
                                        )),
                                        createVNode(_component_sn_avatar, utsMapOf("class" to "avatar", "mode" to "icon", "icon" to "heart-fill", "iconColor" to "#fff", "bgColor" to unref(colors).warning), null, 8, utsArrayOf(
                                            "bgColor"
                                        ))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "形状", "note" to "不同的形状适用于不同的场景"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_avatar, utsMapOf("class" to "avatar", "shape" to "square", "src" to "https://i03piccdn.sogoucdn.com/70e95b16d3488d9b")),
                                        createVNode(_component_sn_avatar, utsMapOf("class" to "avatar", "shape" to "circle", "src" to "https://ww3.sinaimg.cn/mw690/007QvzfIly1ho2zt8iyznj30sg0sgneb.jpg"))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "圆角 【Square特色】", "note" to "形状为square的头像组件可设置圆角边框样式。\\n（type=“circle”时此属性无效）"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_avatar, utsMapOf("class" to "avatar", "shape" to "square", "borderRadius" to "16px", "src" to "http://inews.gtimg.com/newsapp_bt/0/14745715096/1000")),
                                        createVNode(_component_sn_avatar, utsMapOf("class" to "avatar", "shape" to "square", "borderRadius" to "16px 0 16px 0", "src" to "http://inews.gtimg.com/newsapp_bt/0/14373264708/1000"))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "尺寸", "note" to "有时头像很大，比如个人主页；有时却很小，比如聊天列表"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_avatar, utsMapOf("class" to "avatar", "shape" to "square", "size" to "50px", "src" to "https://i04piccdn.sogoucdn.com/67dfe1e38c115dab", "margin" to "5px 20px 5px 5px")),
                                        createVNode(_component_sn_avatar, utsMapOf("class" to "avatar", "shape" to "circle", "size" to "80px", "src" to "https://p3.itc.cn/q_70/images03/20210128/fcfa1c924d7946eba1363c00a097f370.jpeg"))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "裁剪方式", "note" to "可选值及效果与官方的image相同"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, utsMapOf("style" to normalizeStyle(utsMapOf("flex-wrap" to "wrap"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_avatar, utsMapOf("class" to "avatar", "imageMode" to "scaleToFill", "size" to "60px", "border-radius" to "16px", "src" to "/static/scene.jpg")),
                                        createVNode(_component_sn_avatar, utsMapOf("class" to "avatar", "imageMode" to "aspectFit", "size" to "60px", "border-radius" to "16px", "src" to "/static/scene.jpg")),
                                        createVNode(_component_sn_avatar, utsMapOf("class" to "avatar", "imageMode" to "aspectFill", "size" to "60px", "border-radius" to "16px", "src" to "/static/scene.jpg")),
                                        createVNode(_component_sn_avatar, utsMapOf("class" to "avatar", "imageMode" to "widthFix", "size" to "60px", "border-radius" to "16px", "src" to "/static/scene.jpg")),
                                        createVNode(_component_sn_avatar, utsMapOf("class" to "avatar", "imageMode" to "heightFix", "size" to "60px", "border-radius" to "16px", "src" to "/static/scene.jpg")),
                                        createVNode(_component_sn_avatar, utsMapOf("class" to "avatar", "imageMode" to "widthFix", "size" to "60px", "border-radius" to "16px", "src" to "/static/scene.jpg")),
                                        createVNode(_component_sn_avatar, utsMapOf("class" to "avatar", "imageMode" to "heightFix", "size" to "60px", "border-radius" to "16px", "src" to "/static/scene.jpg")),
                                        createVNode(_component_sn_avatar, utsMapOf("class" to "avatar", "imageMode" to "top", "size" to "60px", "border-radius" to "16px", "src" to "/static/scene.jpg")),
                                        createVNode(_component_sn_avatar, utsMapOf("class" to "avatar", "imageMode" to "bottom", "size" to "60px", "border-radius" to "16px", "src" to "/static/scene.jpg")),
                                        createVNode(_component_sn_avatar, utsMapOf("class" to "avatar", "imageMode" to "center", "size" to "60px", "border-radius" to "16px", "src" to "/static/scene.jpg")),
                                        createVNode(_component_sn_avatar, utsMapOf("class" to "avatar", "imageMode" to "left", "size" to "60px", "border-radius" to "16px", "src" to "/static/scene.jpg")),
                                        createVNode(_component_sn_avatar, utsMapOf("class" to "avatar", "imageMode" to "right", "size" to "60px", "border-radius" to "16px", "src" to "/static/scene.jpg")),
                                        createVNode(_component_sn_avatar, utsMapOf("class" to "avatar", "imageMode" to "top left", "size" to "60px", "border-radius" to "16px", "src" to "/static/scene.jpg")),
                                        createVNode(_component_sn_avatar, utsMapOf("class" to "avatar", "imageMode" to "top right", "size" to "60px", "border-radius" to "16px", "src" to "/static/scene.jpg")),
                                        createVNode(_component_sn_avatar, utsMapOf("class" to "avatar", "imageMode" to "bottom left", "size" to "60px", "border-radius" to "16px", "src" to "/static/scene.jpg")),
                                        createVNode(_component_sn_avatar, utsMapOf("class" to "avatar", "imageMode" to "bottom right", "size" to "60px", "border-radius" to "16px", "src" to "/static/scene.jpg"))
                                    );
                                }
                                ), "_" to 1), 8, utsArrayOf(
                                    "style"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "查看大图", "note" to "单击头像查看大图"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_avatar, utsMapOf("enablePreview" to "", "shape" to "circle", "size" to "60px", "src" to "http://inews.gtimg.com/newsapp_bt/0/13148105054/1000"))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "加载失败", "note" to "图片加载失败"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_avatar, utsMapOf("shape" to "circle", "size" to "40px", "src" to "https://it.does.not.exsit/the-picture.png"))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "事件", "note" to "监听头像的点击、双击和长按事件"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_avatar, utsMapOf("shape" to "circle", "size" to "40px", "src" to "https://nimg.ws.126.net/?url=http%3A%2F%2Fdingyue.ws.126.net%2F2022%2F1225%2F92e5a263j00rng4qi001bd000hs00h8p.jpg&thumbnail=660x2147483647&quality=80&type=jpg", "onClick" to onClick, "onLongpress" to onLongpress, "onDbclick" to onDbclick))
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
                return utsMapOf("avatar" to padStyleMapOf(utsMapOf("marginTop" to 0, "marginRight" to 5, "marginBottom" to 5, "marginLeft" to 0)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
