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
open class GenPagesComponentsSnLoadmore : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnLoadmore) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnLoadmore;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val status1 = ref("loadmore");
            val status2 = ref("loadmore");
            fun genLoadmoreFn() {
                status1.value = "loading";
                setTimeout(fun(){
                    status1.value = "nomore";
                }
                , 3000);
            }
            val loadmore = ::genLoadmoreFn;
            fun genLoadmore2Fn() {
                status2.value = "loading";
                setTimeout(fun(){
                    status2.value = "nomore";
                }
                , 3000);
            }
            val loadmore2 = ::genLoadmore2Fn;
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_loadmore = resolveEasyComponent("sn-loadmore", GenUniModulesSinleUiComponentsSnLoadmoreSnLoadmoreClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Loadmore 加载更多")),
                        createVNode(_component_com_card, utsMapOf("title" to "基础用法", "note" to "长列表必备，给用户一个等待的理由"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_loadmore, utsMapOf("class" to "spacing", "status" to "loadmore")),
                                createVNode(_component_sn_loadmore, utsMapOf("class" to "spacing", "status" to "nomore")),
                                createVNode(_component_sn_loadmore, utsMapOf("class" to "spacing", "status" to "loading"))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "事件", "note" to "提供loadmore事件，当组件被点击且status为 loadmore 时触发此事件"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_loadmore, utsMapOf("status" to unref(status1), "onLoadmore" to loadmore), null, 8, utsArrayOf(
                                    "status"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "自定义提示语", "note" to "自由定制提示语"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_loadmore, utsMapOf("class" to "spacing", "status" to "loadmore", "loadmoreText" to "点我继续搜索")),
                                createVNode(_component_sn_loadmore, utsMapOf("class" to "spacing", "status" to "nomore", "nomoreText" to "额……没有了")),
                                createVNode(_component_sn_loadmore, utsMapOf("class" to "spacing", "status" to "loading", "loadingText" to "努力加载吖"))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "自定义样式", "note" to "我就是我，不一样的烟火~"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_loadmore, utsMapOf("lineHeight" to "2px", "status" to unref(status2), "line-color" to unref(colors).successLight, "dashed" to "", "textColor" to unref(colors).success, "icon-color" to unref(colors).success, "onLoadmore" to loadmore2), null, 8, utsArrayOf(
                                    "status",
                                    "line-color",
                                    "textColor",
                                    "icon-color"
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
