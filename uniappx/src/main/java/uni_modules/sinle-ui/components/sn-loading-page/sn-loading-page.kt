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
open class GenUniModulesSinleUiComponentsSnLoadingPageSnLoadingPage : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var show: Boolean by `$props`;
    open var text: String by `$props`;
    open var imgSrc: String by `$props`;
    open var bgColor: String by `$props`;
    open var textColor: String by `$props`;
    open var textSize: String by `$props`;
    open var iconColor: String by `$props`;
    open var iconSize: String by `$props`;
    open var aniDur: Number by `$props`;
    open var customImgStyle: Any by `$props`;
    open var customTextStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnLoadingPageSnLoadingPage) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnLoadingPageSnLoadingPage;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val snu = `$snui`.utils;
            val props = __props;
            val showV = ref(false);
            val showImage = computed(fun(): Boolean {
                return !snu.text.isEmpty(props.imgSrc);
            }
            );
            val theme = computed(fun(): String {
                return `$snui`.configs.app.theme;
            }
            );
            val bgColorC = computed(fun(): String {
                return if (props.bgColor == "") {
                    colors.value.info;
                } else {
                    props.bgColor;
                }
                ;
            }
            );
            val aniDurC = computed(fun(): Number {
                return if (props.aniDur == parseInt(`$snui`.configs.aniTime.normal)) {
                    parseInt(`$snui`.configs.aniTime.normal);
                } else {
                    props.aniDur;
                }
                ;
            }
            );
            val textColorC = computed(fun(): String {
                return if (props.textColor == "") {
                    colors.value["" + (if (theme.value == "light") {
                        "infoDark";
                    } else {
                        "dark";
                    })] as String;
                } else {
                    props.textColor;
                }
                ;
            }
            );
            val textSizeC = computed(fun(): String {
                return if (props.textSize == "") {
                    `$snui`.configs.font.size(4);
                } else {
                    props.textSize;
                }
                ;
            }
            );
            val iconColorC = computed(fun(): String {
                return if (props.iconColor == "") {
                    colors.value["" + (if (theme.value == "light") {
                        "infoDark";
                    } else {
                        "dark";
                    })] as String;
                } else {
                    props.iconColor;
                }
                ;
            }
            );
            val iconSizeC = computed(fun(): String {
                return if (props.iconSize == "") {
                    `$snui`.configs.font.size(7);
                } else {
                    props.iconSize;
                }
                ;
            }
            );
            val loadingPageStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("transition-duration", "" + aniDurC.value + "ms");
                return styles;
            }
            );
            watch(fun(): Boolean {
                return props.show;
            }
            , fun(n: Boolean){
                setTimeout(fun(){
                    showV.value = n;
                }
                , 50);
            }
            , WatchOptions(immediate = true));
            return fun(): Any? {
                val _component_sn_loading = resolveEasyComponent("sn-loading", GenUniModulesSinleUiComponentsSnLoadingSnLoadingClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_sn_overlay = resolveEasyComponent("sn-overlay", GenUniModulesSinleUiComponentsSnOverlaySnOverlayClass);
                return createVNode(_component_sn_overlay, utsMapOf("show" to _ctx.show, "aniDur" to unref(aniDurC), "bgColor" to unref(bgColorC), "opacity" to 1), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to normalizeClass(utsArrayOf(
                            "sn-loading-page",
                            if (unref(showV)) {
                                "sn-loading-page__show";
                            } else {
                                "";
                            }
                        )), "style" to normalizeStyle(unref(loadingPageStylesC))), utsArrayOf(
                            if (isTrue(!unref(showImage))) {
                                createVNode(_component_sn_loading, utsMapOf("key" to 0, "iconColor" to unref(iconColorC), "iconSize" to unref(iconSizeC)), null, 8, utsArrayOf(
                                    "iconColor",
                                    "iconSize"
                                ));
                            } else {
                                createElementVNode("image", utsMapOf("key" to 1, "fade-show" to "", "src" to _ctx.imgSrc, "style" to normalizeStyle(utsArrayOf(
                                    _ctx.customImgStyle
                                ))), null, 12, utsArrayOf(
                                    "src"
                                ));
                            }
                            ,
                            createVNode(_component_sn_text, utsMapOf("color" to unref(textColorC), "size" to unref(textSizeC), "text" to _ctx.text, "custom-style" to _ctx.customTextStyle), null, 8, utsArrayOf(
                                "color",
                                "size",
                                "text",
                                "custom-style"
                            ))
                        ), 6)
                    );
                }
                ), "_" to 1), 8, utsArrayOf(
                    "show",
                    "aniDur",
                    "bgColor"
                ));
            }
            ;
        }
        ;
        var name = "sn-loading-page";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-loading-page" to padStyleMapOf(utsMapOf("marginTop" to "auto", "marginRight" to "auto", "marginBottom" to "auto", "marginLeft" to "auto", "flexDirection" to "column", "alignItems" to "center", "opacity" to 0, "transitionProperty" to "opacity", "transform" to "translateY(-50%)")), "sn-loading-page__show" to padStyleMapOf(utsMapOf("opacity" to 1)), "@TRANSITION" to utsMapOf("sn-loading-page" to utsMapOf("property" to "opacity")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf("show" to utsMapOf("type" to "Boolean", "default" to false), "text" to utsMapOf("type" to "String", "default" to "加载中"), "imgSrc" to utsMapOf("type" to "String", "default" to ""), "bgColor" to utsMapOf("type" to "String", "default" to ""), "textColor" to utsMapOf("type" to "String", "default" to ""), "textSize" to utsMapOf("type" to "String", "default" to ""), "iconColor" to utsMapOf("type" to "String", "default" to ""), "iconSize" to utsMapOf("type" to "String", "default" to ""), "aniDur" to utsMapOf("type" to "Number", "default" to parseInt(`$snui`.configs.aniTime.normal)), "customImgStyle" to utsMapOf("default" to object : UTSJSONObject() {
            var width = "70px"
            var height = "70px"
        }), "customTextStyle" to utsMapOf("default" to object : UTSJSONObject() {
            var marginTop = "15px"
        })));
        var propsNeedCastKeys = utsArrayOf(
            "show",
            "text",
            "imgSrc",
            "bgColor",
            "textColor",
            "textSize",
            "iconColor",
            "iconSize",
            "aniDur",
            "customImgStyle",
            "customTextStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
