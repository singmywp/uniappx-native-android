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
open class GenPagesComponentsSnImage : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnImage) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnImage;
            val _cache = __ins.renderCache;
            val loadingComponents = ref(true);
            onMounted(fun(){
                nextTick(fun(){
                    setTimeout(fun(){
                        loadingComponents.value = false;
                    }
                    , 500);
                }
                );
            }
            );
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_image = resolveEasyComponent("sn-image", GenUniModulesSinleUiComponentsSnImageSnImageClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_row = resolveEasyComponent("sn-row", GenUniModulesSinleUiComponentsSnRowSnRowClass);
                val _component_sn_gap = resolveEasyComponent("sn-gap", GenUniModulesSinleUiComponentsSnGapSnGapClass);
                val _component_sn_view = resolveEasyComponent("sn-view", GenUniModulesSinleUiComponentsSnViewSnViewClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Image 图片")),
                        createVNode(_component_sn_view, utsMapOf("loading" to unref(loadingComponents)), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_com_card, utsMapOf("title" to "基础用法", "note" to "相比于内置 image 组件更加方便使用。\\n支持图片加载占位、图片预览、懒加载（同 image 组件）、动画效果（同 image 组件）\\n默认为 aspectFit 模式"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_image, utsMapOf("src" to "https://img1.baidu.com/it/u=2572795898,2432467619&fm=253&fmt=auto&app=138&f=JPEG?w=640&h=427"))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "模式", "note" to "支持设置图片裁剪、缩放模式，其值同内置 image 组件"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_row, utsMapOf("style" to normalizeStyle(utsMapOf("flex-wrap" to "wrap"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_image, utsMapOf("class" to "spacing", "mode" to "scaleToFill", "src" to "/static/strawberry.jpg", "width" to "80px", "height" to "80px")),
                                                createVNode(_component_sn_image, utsMapOf("class" to "spacing", "mode" to "aspectFit", "src" to "/static/strawberry.jpg", "width" to "80px", "height" to "80px")),
                                                createVNode(_component_sn_image, utsMapOf("class" to "spacing", "mode" to "aspectFill", "src" to "/static/strawberry.jpg", "width" to "80px", "height" to "80px")),
                                                createVNode(_component_sn_image, utsMapOf("class" to "spacing", "mode" to "widthFix", "src" to "/static/strawberry.jpg", "width" to "80px", "height" to "80px")),
                                                createVNode(_component_sn_image, utsMapOf("class" to "spacing", "mode" to "heightFix", "src" to "/static/strawberry.jpg", "width" to "80px", "height" to "80px")),
                                                createVNode(_component_sn_image, utsMapOf("class" to "spacing", "mode" to "top", "src" to "/static/strawberry.jpg", "width" to "80px", "height" to "80px")),
                                                createVNode(_component_sn_image, utsMapOf("class" to "spacing", "mode" to "bottom", "src" to "/static/strawberry.jpg", "width" to "80px", "height" to "80px")),
                                                createVNode(_component_sn_image, utsMapOf("class" to "spacing", "mode" to "center", "src" to "/static/strawberry.jpg", "width" to "80px", "height" to "80px")),
                                                createVNode(_component_sn_image, utsMapOf("class" to "spacing", "mode" to "left", "src" to "/static/strawberry.jpg", "width" to "80px", "height" to "80px")),
                                                createVNode(_component_sn_image, utsMapOf("class" to "spacing", "mode" to "right", "src" to "/static/strawberry.jpg", "width" to "80px", "height" to "80px")),
                                                createVNode(_component_sn_image, utsMapOf("class" to "spacing", "mode" to "top left", "src" to "/static/strawberry.jpg", "width" to "80px", "height" to "80px")),
                                                createVNode(_component_sn_image, utsMapOf("class" to "spacing", "mode" to "top right", "src" to "/static/strawberry.jpg", "width" to "80px", "height" to "80px")),
                                                createVNode(_component_sn_image, utsMapOf("class" to "spacing", "mode" to "bottom left", "src" to "/static/strawberry.jpg", "width" to "80px", "height" to "80px")),
                                                createVNode(_component_sn_image, utsMapOf("class" to "spacing", "mode" to "bottom right", "src" to "/static/strawberry.jpg", "width" to "80px", "height" to "80px"))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "style"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "自动计算长宽", "note" to "aspectFit 模式支持根据父容器自动设置图片长宽、给定宽度自动计算长度，设置 height 属性后此功能失效"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_image, utsMapOf("class" to "spacing", "src" to "https://img0.baidu.com/it/u=854650116,3372822797&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=667")),
                                                createVNode(_component_sn_image, utsMapOf("class" to "spacing", "src" to "https://img2.baidu.com/it/u=448582925,1585814755&fm=253&fmt=auto&app=138&f=JPEG?w=333&h=500")),
                                                createVNode(_component_sn_image, utsMapOf("class" to "spacing", "src" to "https://img1.baidu.com/it/u=1431796479,1028246143&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=743"))
                                            );
                                        }
                                        ), "_" to 1))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_image, utsMapOf("class" to "spacing", "src" to "https://img2.baidu.com/it/u=3307857314,3539337404&fm=253&fmt=auto&app=120&f=JPEG?w=1280&h=800", "width" to "150px")),
                                                createVNode(_component_sn_image, utsMapOf("class" to "spacing", "src" to "https://img1.baidu.com/it/u=3587186811,3730884801&fm=253&fmt=auto&app=138&f=JPEG?w=424&h=600", "width" to "70px"))
                                            );
                                        }
                                        ), "_" to 1))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "图片预览", "note" to "调用内置的 uni.previewImage 进行图片预览"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_image, utsMapOf("enablePreview" to "", "src" to "https://img1.baidu.com/it/u=253682624,1679759773&fm=253&fmt=auto&app=138&f=JPEG?w=900&h=500"))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_sn_gap)
                            );
                        }
                        ), "_" to 1), 8, utsArrayOf(
                            "loading"
                        ))
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
                return utsMapOf("spacing" to padStyleMapOf(utsMapOf("marginTop" to 0, "marginRight" to 5, "marginBottom" to 5, "marginLeft" to 0)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
