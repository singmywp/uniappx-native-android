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
open class GenPagesComponentsSnIconAll : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnIconAll) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnIconAll;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val page = ref(1);
            val pageItems: Number = 30;
            val _icons = icons.split(",") as UTSArray<String>;
            val _iconsLength = _icons.length;
            val iconsData = computed(fun(): UTSArray<String> {
                return _icons.splice(0, page.value * pageItems);
            }
            );
            val groupsData = computed(fun(): UTSArray<UTSArray<String>> {
                val groups = utsArrayOf<UTSArray<String>>();
                run {
                    var i: Number = 0;
                    while(i < iconsData.value.length){
                        groups.push(iconsData.value.slice(i, i + 3));
                        i += 3;
                    }
                }
                return groups;
            }
            );
            val itemStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("background", colors.value.front);
                styles.set("border-radius", `$snui`.configs.radius.small);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            fun genLoadmoreFn() {
                page.value++;
            }
            val loadmore = ::genLoadmoreFn;
            fun genCopyFn(str: String) {
                `$snui`.utils.platform.setClipboardData(str);
                `$snui`.utils.platform.showToast(object : UTSJSONObject() {
                    var title = "复制成功"
                });
            }
            val copy = ::genCopyFn;
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_icon = resolveEasyComponent("sn-icon", GenUniModulesSinleUiComponentsSnIconSnIconClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_sn_line = resolveEasyComponent("sn-line", GenUniModulesSinleUiComponentsSnLineSnLineClass);
                val _component_sn_gap = resolveEasyComponent("sn-gap", GenUniModulesSinleUiComponentsSnGapSnGapClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, utsMapOf("scrollOn" to false), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to ("\u56FE\u6807\u9884\u89C8\uFF08\u5171" + unref(_iconsLength) + "\u4E2A\uFF09")), null, 8, utsArrayOf(
                            "title"
                        )),
                        createElementVNode("list-view", utsMapOf("class" to "icon-group", "bounces" to false, "show-scrollbar" to false, "onScrolltolower" to loadmore), utsArrayOf(
                            createElementVNode(Fragment, null, RenderHelpers.renderList((unref(groupsData) as UTSArray<UTSArray<String>>), fun(e1, index1, _, _): VNode {
                                return createElementVNode("list-item", utsMapOf("class" to "icon-row", "key" to index1), utsArrayOf(
                                    createElementVNode(Fragment, null, RenderHelpers.renderList((e1 as UTSArray<String>), fun(e2, index2, _, _): VNode {
                                        return createElementVNode("view", utsMapOf("class" to "icon-item", "key" to index2, "onClick" to fun(){
                                            copy(e2);
                                        }
                                        , "style" to normalizeStyle(unref(itemStylesC))), utsArrayOf(
                                            createVNode(_component_sn_icon, utsMapOf("name" to e2), null, 8, utsArrayOf(
                                                "name"
                                            )),
                                            createVNode(_component_sn_text, utsMapOf("text" to e2, "align" to "center", "size" to unref(`$snui`).configs.font.size(1)), null, 8, utsArrayOf(
                                                "text",
                                                "size"
                                            ))
                                        ), 12, utsArrayOf(
                                            "onClick"
                                        ));
                                    }
                                    ), 128)
                                ));
                            }
                            ), 128),
                            createElementVNode("list-item", null, utsArrayOf(
                                createVNode(_component_sn_line, utsMapOf("text" to "加载中")),
                                createVNode(_component_sn_gap, utsMapOf("height" to "50px"))
                            ))
                        ), 32)
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
                return utsMapOf("icon-group" to padStyleMapOf(utsMapOf("flex" to 1)), "icon-row" to utsMapOf(".icon-group " to utsMapOf("flexDirection" to "row")), "icon-item" to utsMapOf(".icon-group " to utsMapOf("flex" to 1, "flexDirection" to "column", "alignItems" to "center", "paddingTop" to 10, "paddingRight" to 10, "paddingBottom" to 10, "paddingLeft" to 10, "marginTop" to 5, "marginRight" to 5, "marginBottom" to 5, "marginLeft" to 5)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
