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
open class GenUniModulesSinleUiComponentsSnBadgeSnBadge : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var value: Number by `$props`;
    open var text: String by `$props`;
    open var bgColor: String by `$props`;
    open var textColor: String by `$props`;
    open var mode: String by `$props`;
    open var max: Number by `$props`;
    open var size: String by `$props`;
    open var showZero: Boolean by `$props`;
    open var offset: String by `$props`;
    open var customStyle: Any by `$props`;
    open var customTextStyle: Any by `$props`;
    open var customDotStyle: Any by `$props`;
    open var customContainStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnBadgeSnBadge) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnBadgeSnBadge;
            val _cache = __ins.renderCache;
            val snu = `$snui`.utils;
            val colors = `$snui`.colors;
            val props = __props;
            val modeC = computed(fun(): String {
                var types = utsArrayOf(
                    "number",
                    "dot",
                    "text"
                );
                return if (types.includes(props.mode)) {
                    props.mode;
                } else {
                    "number";
                }
                ;
            }
            );
            val showText = computed(fun(): Boolean {
                return !snu.text.isEmpty(props.text);
            }
            );
            val bgColorC = computed(fun(): String {
                return if (props.bgColor == "") {
                    colors.value.error;
                } else {
                    props.bgColor;
                }
                ;
            }
            );
            val sizeC = computed(fun(): String {
                return if (props.size == "") {
                    `$snui`.configs.font.size(1);
                } else {
                    props.size;
                }
                ;
            }
            );
            val badgeTransform = computed(fun(): String {
                if (snu.text.isEmpty(props.offset)) {
                    return if (modeC.value == "dot") {
                        "translate(-7px, -2px)";
                    } else {
                        "translate(-10px, -5px)";
                    };
                } else {
                    return props.offset;
                }
            }
            );
            val contentC = computed(fun(): String {
                if (modeC.value == "number") {
                    var max = props.max;
                    var value = props.value;
                    return if (max == -1 || (value <= max)) {
                        value.toString();
                    } else {
                        max.toString() + "+";
                    };
                } else if (modeC.value == "text") {
                    return props.text;
                }
                return "";
            }
            );
            val dotStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("background", bgColorC.value);
                styles.set("transform", badgeTransform.value);
                styles.set("width", sizeC.value);
                styles.set("height", sizeC.value);
                styles.set("zIndex", `$snui`.configs.zIndex.badge);
                styles.set("border-radius", `$snui`.configs.radius.circle);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val numberTextStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("transform", badgeTransform.value);
                styles.set("background", bgColorC.value);
                styles.set("zIndex", `$snui`.configs.zIndex.badge);
                styles.set("border-radius", `$snui`.configs.radius.circle);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val containStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            return fun(): Any? {
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                return createElementVNode("view", utsMapOf("class" to "sn-badge", "ref" to "badgeEle", "style" to normalizeStyle(utsArrayOf(
                    unref(containStylesC),
                    _ctx.customStyle
                ))), utsArrayOf(
                    renderSlot(_ctx.`$slots`, "default"),
                    if (isTrue(unref(modeC) == "dot" || (unref(modeC) == "text" && !unref(showText)))) {
                        createElementVNode("view", utsMapOf("key" to 0, "class" to "sn-badge-dot", "style" to normalizeStyle(utsArrayOf(
                            unref(dotStylesC),
                            _ctx.customDotStyle
                        ))), null, 4);
                    } else {
                        if (isTrue((unref(modeC) == "number" && (if (_ctx.value == 0) {
                            _ctx.showZero;
                        } else {
                            true;
                        }
                        )) || (unref(modeC) == "text" && unref(showText)))) {
                            createElementVNode("view", utsMapOf("key" to 1, "class" to "sn-badge-number-text", "style" to normalizeStyle(utsArrayOf(
                                unref(numberTextStylesC),
                                _ctx.customStyle
                            ))), utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("class" to "sn-badge-number-text-text", "font" to "sans-serif", "text" to unref(contentC), "color" to if (_ctx.textColor == "") {
                                    "#fff";
                                } else {
                                    _ctx.textColor;
                                }, "size" to unref(sizeC), "style" to normalizeStyle(utsArrayOf(
                                    _ctx.customTextStyle
                                ))), null, 8, utsArrayOf(
                                    "text",
                                    "color",
                                    "size",
                                    "style"
                                ))
                            ), 4);
                        } else {
                            createCommentVNode("v-if", true);
                        }
                        ;
                    }
                ), 4);
            }
            ;
        }
        ;
        var name = "sn-badge";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-badge" to padStyleMapOf(utsMapOf("display" to "flex", "flexDirection" to "row", "alignItems" to "flex-start", "overflow" to "visible", "paddingTop" to 5, "paddingRight" to 5, "paddingBottom" to 5, "paddingLeft" to 5)), "sn-badge-number-text" to padStyleMapOf(utsMapOf("display" to "flex", "justifyContent" to "center")), "sn-badge-number-text-text" to padStyleMapOf(utsMapOf("paddingTop" to 1, "paddingRight" to 5, "paddingBottom" to 1, "paddingLeft" to 5, "flex" to 1, "textAlign" to "center")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf("value" to utsMapOf("type" to "Number", "default" to 0), "text" to utsMapOf("type" to "String", "default" to ""), "bgColor" to utsMapOf("type" to "String", "default" to ""), "textColor" to utsMapOf("type" to "String", "default" to "#fff"), "mode" to utsMapOf("type" to "String", "default" to "number"), "max" to utsMapOf("type" to "Number", "default" to -1), "size" to utsMapOf("type" to "String", "default" to ""), "showZero" to utsMapOf("type" to "Boolean", "default" to false), "offset" to utsMapOf("type" to "String", "default" to ""), "customStyle" to utsMapOf("default" to UTSJSONObject()), "customTextStyle" to utsMapOf("default" to UTSJSONObject()), "customDotStyle" to utsMapOf("default" to UTSJSONObject()), "customContainStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "value",
            "text",
            "bgColor",
            "textColor",
            "mode",
            "max",
            "size",
            "showZero",
            "offset",
            "customStyle",
            "customTextStyle",
            "customDotStyle",
            "customContainStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
