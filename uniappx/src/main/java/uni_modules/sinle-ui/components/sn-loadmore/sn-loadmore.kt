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
open class GenUniModulesSinleUiComponentsSnLoadmoreSnLoadmore : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var status: String by `$props`;
    open var loadmoreText: String by `$props`;
    open var nomoreText: String by `$props`;
    open var loadingText: String by `$props`;
    open var textSize: String by `$props`;
    open var iconColor: String by `$props`;
    open var textColor: String by `$props`;
    open var lineColor: String by `$props`;
    open var lineHeight: String by `$props`;
    open var dashed: Boolean by `$props`;
    open var customStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnLoadmoreSnLoadmore) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnLoadmoreSnLoadmore;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            fun emit(event: String, vararg do_not_transform_spread: Any?) {
                __ins.emit(event, *do_not_transform_spread);
            }
            val props = __props;
            val textSizeC = computed(fun(): String {
                return if (props.textSize == "") {
                    "" + (`$snui`.utils.getPx(`$snui`.configs.font.size(2)) + 1);
                } else {
                    props.textSize;
                }
                ;
            }
            );
            val iconColorC = computed(fun(): String {
                return if (props.iconColor == "") {
                    colors.value.lineText;
                } else {
                    props.iconColor;
                }
                ;
            }
            );
            val textColorC = computed(fun(): String {
                return if (props.textColor == "") {
                    colors.value.lineText;
                } else {
                    props.textColor;
                }
                ;
            }
            );
            val lineColorC = computed(fun(): String {
                return if (props.lineColor == "") {
                    colors.value.line;
                } else {
                    props.lineColor;
                }
                ;
            }
            );
            fun genLoadmoreFn() {
                if (props.status == "loadmore") {
                    emit("loadmore");
                }
            }
            val loadmore = ::genLoadmoreFn;
            return fun(): Any? {
                val _component_sn_loading = resolveEasyComponent("sn-loading", GenUniModulesSinleUiComponentsSnLoadingSnLoadingClass);
                val _component_sn_line = resolveEasyComponent("sn-line", GenUniModulesSinleUiComponentsSnLineSnLineClass);
                return createElementVNode("view", utsMapOf("class" to "sn-loadmore"), utsArrayOf(
                    createVNode(_component_sn_line, utsMapOf("text" to if (_ctx.status == "loadmore") {
                        _ctx.loadmoreText;
                    } else {
                        _ctx.nomoreText;
                    }
                    , "textSize" to unref(textSizeC), "height" to _ctx.lineHeight, "lineColor" to unref(lineColorC), "dashed" to _ctx.dashed, "textColor" to unref(textColorC), "onClick" to loadmore), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            if (_ctx.status == "loading") {
                                createVNode(_component_sn_loading, utsMapOf("key" to 0, "class" to "sn-loadmore-loading", "text" to _ctx.loadingText, "textSize" to unref(textSizeC), "iconColor" to unref(iconColorC), "textColor" to unref(textColorC)), null, 8, utsArrayOf(
                                    "text",
                                    "textSize",
                                    "iconColor",
                                    "textColor"
                                ));
                            } else {
                                createCommentVNode("v-if", true);
                            }
                        );
                    }
                    ), "_" to 1), 8, utsArrayOf(
                        "text",
                        "textSize",
                        "height",
                        "lineColor",
                        "dashed",
                        "textColor"
                    ))
                ));
            }
            ;
        }
        ;
        var name = "sn-loadmore";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-loadmore" to padStyleMapOf(utsMapOf("width" to "100%")), "sn-loadmore-loading" to padStyleMapOf(utsMapOf("marginTop" to 6, "marginRight" to "auto", "marginBottom" to 6, "marginLeft" to "auto")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf("loadmore" to null);
        var props = normalizePropsOptions(utsMapOf("status" to utsMapOf("type" to "String", "default" to "loadmore"), "loadmoreText" to utsMapOf("type" to "String", "default" to "加载更多"), "nomoreText" to utsMapOf("type" to "String", "default" to "没有更多了"), "loadingText" to utsMapOf("type" to "String", "default" to "加载中"), "textSize" to utsMapOf("type" to "String", "default" to ""), "iconColor" to utsMapOf("type" to "String", "default" to ""), "textColor" to utsMapOf("type" to "String", "default" to ""), "lineColor" to utsMapOf("type" to "String", "default" to ""), "lineHeight" to utsMapOf("type" to "String", "default" to "1px"), "dashed" to utsMapOf("type" to "Boolean", "default" to false), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "status",
            "loadmoreText",
            "nomoreText",
            "loadingText",
            "textSize",
            "iconColor",
            "textColor",
            "lineColor",
            "lineHeight",
            "dashed",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
