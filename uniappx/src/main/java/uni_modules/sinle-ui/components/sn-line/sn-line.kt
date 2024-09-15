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
open class GenUniModulesSinleUiComponentsSnLineSnLine : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var width: String by `$props`;
    open var height: String by `$props`;
    open var lineColor: String by `$props`;
    open var textColor: String by `$props`;
    open var margin: String by `$props`;
    open var dashed: Boolean by `$props`;
    open var dot: Boolean by `$props`;
    open var text: String by `$props`;
    open var textSize: String by `$props`;
    open var borderRadius: String by `$props`;
    open var customStyle: Any by `$props`;
    open var customTextStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnLineSnLine) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnLineSnLine;
            val _cache = __ins.renderCache;
            val snu = `$snui`.utils;
            val colors = `$snui`.colors;
            val props = __props;
            val textSizeC = computed(fun(): String {
                return if (props.textSize == "") {
                    `$snui`.configs.font.size(1);
                } else {
                    props.textSize;
                }
                ;
            }
            );
            val showTextC = computed(fun(): Boolean {
                return !snu.text.isEmpty(props.text) || props.dot;
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
            val textColorC = computed(fun(): String {
                return if (props.textColor == "") {
                    colors.value.lineText;
                } else {
                    props.textColor;
                }
                ;
            }
            );
            val lineStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("width", props.width);
                styles.set("margin", props.margin);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val borderStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("borderBottomStyle", if (props.dashed) {
                    "dashed";
                } else {
                    "solid";
                }
                );
                styles.set("borderBottomWidth", props.height);
                styles.set("borderBottomColor", lineColorC.value);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val borderLeftStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                if (showTextC.value || useSlots()["default"] != null) {
                    styles.set("margin-right", "10px");
                }
                return styles;
            }
            );
            val borderRightStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("margin-left", "10px");
                return styles;
            }
            );
            return fun(): Any? {
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                return createElementVNode("view", utsMapOf("class" to "sn-line", "style" to normalizeStyle(utsArrayOf(
                    unref(lineStylesC),
                    _ctx.customStyle
                ))), utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "sn-line-border", "style" to normalizeStyle(utsArrayOf(
                        unref(borderStylesC),
                        unref(borderLeftStylesC)
                    ))), null, 4),
                    renderSlot(_ctx.`$slots`, "default", UTSJSONObject(), fun(): UTSArray<Any> {
                        return utsArrayOf(
                            if (isTrue(unref(showTextC))) {
                                createVNode(_component_sn_text, utsMapOf("key" to 0, "class" to "sn-line-text", "text" to if (_ctx.dot) {
                                    "•";
                                } else {
                                    _ctx.text;
                                }, "color" to unref(textColorC), "size" to unref(textSizeC), "style" to normalizeStyle(utsArrayOf(
                                    _ctx.customTextStyle
                                ))), null, 8, utsArrayOf(
                                    "text",
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
                    if (isTrue(unref(showTextC) || _ctx.`$slots`["default"] != null)) {
                        createElementVNode("view", utsMapOf("key" to 0, "class" to "sn-line-border", "style" to normalizeStyle(utsArrayOf(
                            unref(borderStylesC),
                            unref(borderRightStylesC)
                        ))), null, 4);
                    } else {
                        createCommentVNode("v-if", true);
                    }
                ), 4);
            }
            ;
        }
        ;
        var name = "sn-line";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-line" to padStyleMapOf(utsMapOf("display" to "flex", "flexDirection" to "row", "alignItems" to "center", "justifyContent" to "center")), "sn-line-bg" to utsMapOf(".sn-line " to utsMapOf("flex" to 1)), "sn-line-border" to utsMapOf(".sn-line " to utsMapOf("flex" to 1)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf("width" to utsMapOf("type" to "String", "default" to "100%"), "height" to utsMapOf("type" to "String", "default" to "1px"), "lineColor" to utsMapOf("type" to "String", "default" to ""), "textColor" to utsMapOf("type" to "String", "default" to ""), "margin" to utsMapOf("type" to "String", "default" to "10px 0"), "dashed" to utsMapOf("type" to "Boolean", "default" to false), "dot" to utsMapOf("type" to "Boolean", "default" to false), "text" to utsMapOf("type" to "String", "default" to ""), "textSize" to utsMapOf("type" to "String", "default" to ""), "borderRadius" to utsMapOf("type" to "String", "default" to ""), "customStyle" to utsMapOf("default" to UTSJSONObject()), "customTextStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "width",
            "height",
            "lineColor",
            "textColor",
            "margin",
            "dashed",
            "dot",
            "text",
            "textSize",
            "borderRadius",
            "customStyle",
            "customTextStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
