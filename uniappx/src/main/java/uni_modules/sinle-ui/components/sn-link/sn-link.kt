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
open class GenUniModulesSinleUiComponentsSnLinkSnLink : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var text: String by `$props`;
    open var prefixIcon: String by `$props`;
    open var suffixIcon: String by `$props`;
    open var href: String by `$props`;
    open var color: String by `$props`;
    open var size: String by `$props`;
    open var underline: Boolean by `$props`;
    open var local: Boolean by `$props`;
    open var customStyle: Any by `$props`;
    open var customTextStyle: Any by `$props`;
    open var customIconStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnLinkSnLink) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnLinkSnLink;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val snu = `$snui`.utils;
            val props = __props;
            val colorC = computed(fun(): String {
                return if (props.color == "") {
                    colors.value.primaryDark;
                } else {
                    props.color;
                }
                ;
            }
            );
            val sizeC = computed(fun(): String {
                return if (props.size == "") {
                    `$snui`.configs.font.size(3);
                } else {
                    props.size;
                }
                ;
            }
            );
            val linkStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            fun genOnClickFn() {
                var href = props.href;
                if (!snu.text.isEmpty(href)) {
                    var urlPattern = UTSRegExp("(?:^|[\\s\\n])((?:http(s)?\\:)?\\/\\/)?([\\w-]+\\.)+[\\w-]+[\\w\\/\\.\\-]*(?![^<]*>|[^<>]*<\\/a>)", "gi");
                    href = href.replace(urlPattern, fun(match, p1, p2, p3, offset, string): String {
                        if (p1 != null) {
                            return match;
                        }
                        return "https://" + match;
                    }
                    );
                    if (props.local) {
                        snu.platform.viewUrlByWebview(href);
                    } else {
                        snu.platform.openLink(href);
                    }
                }
            }
            val onClick = ::genOnClickFn;
            return fun(): Any? {
                val _component_sn_icon = resolveEasyComponent("sn-icon", GenUniModulesSinleUiComponentsSnIconSnIconClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                return createElementVNode("view", utsMapOf("class" to "sn-link", "onClick" to onClick, "style" to normalizeStyle(utsArrayOf(
                    unref(linkStylesC),
                    _ctx.customStyle
                ))), utsArrayOf(
                    renderSlot(_ctx.`$slots`, "prefix", UTSJSONObject(), fun(): UTSArray<Any> {
                        return utsArrayOf(
                            if (_ctx.prefixIcon.trim() != "") {
                                createVNode(_component_sn_icon, utsMapOf("key" to 0, "name" to _ctx.prefixIcon, "color" to unref(colorC), "size" to unref(sizeC), "style" to normalizeStyle(utsArrayOf(
                                    _ctx.customIconStyle
                                ))), null, 8, utsArrayOf(
                                    "name",
                                    "color",
                                    "size",
                                    "style"
                                ));
                            } else {
                                createCommentVNode("v-if", true);
                            }
                        );
                    }
                    ),
                    createVNode(_component_sn_text, utsMapOf("text" to _ctx.text, "color" to unref(colorC), "size" to unref(sizeC), "decorationLine" to if (_ctx.underline) {
                        "underline";
                    } else {
                        "";
                    }
                    , "customStyle" to _ctx.customTextStyle), null, 8, utsArrayOf(
                        "text",
                        "color",
                        "size",
                        "decorationLine",
                        "customStyle"
                    )),
                    renderSlot(_ctx.`$slots`, "suffix", UTSJSONObject(), fun(): UTSArray<Any> {
                        return utsArrayOf(
                            if (_ctx.suffixIcon.trim() != "") {
                                createVNode(_component_sn_icon, utsMapOf("key" to 0, "name" to _ctx.suffixIcon, "color" to unref(colorC), "size" to unref(sizeC), "style" to normalizeStyle(utsArrayOf(
                                    _ctx.customIconStyle
                                ))), null, 8, utsArrayOf(
                                    "name",
                                    "color",
                                    "size",
                                    "style"
                                ));
                            } else {
                                createCommentVNode("v-if", true);
                            }
                        );
                    }
                    )
                ), 4);
            }
            ;
        }
        ;
        var name = "sn-link";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-link" to padStyleMapOf(utsMapOf("flex" to 1, "flexDirection" to "row", "transitionProperty" to "color,fontSize")), "@TRANSITION" to utsMapOf("sn-link" to utsMapOf("property" to "color,fontSize")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf("text" to utsMapOf("type" to "String", "default" to ""), "prefixIcon" to utsMapOf("type" to "String", "default" to ""), "suffixIcon" to utsMapOf("type" to "String", "default" to ""), "href" to utsMapOf("type" to "String", "default" to ""), "color" to utsMapOf("type" to "String", "default" to ""), "size" to utsMapOf("type" to "String", "default" to ""), "underline" to utsMapOf("type" to "Boolean", "default" to false), "local" to utsMapOf("type" to "Boolean", "default" to false), "customStyle" to utsMapOf("default" to UTSJSONObject()), "customTextStyle" to utsMapOf("default" to UTSJSONObject()), "customIconStyle" to utsMapOf("default" to object : UTSJSONObject() {
            var margin = "0 5px"
        })));
        var propsNeedCastKeys = utsArrayOf(
            "text",
            "prefixIcon",
            "suffixIcon",
            "href",
            "color",
            "size",
            "underline",
            "local",
            "customStyle",
            "customTextStyle",
            "customIconStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
