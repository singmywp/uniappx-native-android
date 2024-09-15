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
open class GenComponentsComCardComCard : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var title: String by `$props`;
    open var note: String by `$props`;
    open var titleColor: String by `$props`;
    open var noteColor: String by `$props`;
    open var bgColor: String by `$props`;
    open var spaceBeforeParagraph: Boolean by `$props`;
    open var customStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenComponentsComCardComCard) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenComponentsComCardComCard;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val props = __props;
            val noteColorC = computed(fun(): String {
                return if (props.noteColor == "") {
                    colors.value.textLight;
                } else {
                    props.noteColor;
                }
                ;
            }
            );
            val titleColorC = computed(fun(): String {
                return if (props.titleColor == "") {
                    colors.value.title;
                } else {
                    props.titleColor;
                }
                ;
            }
            );
            val bgColorC = computed(fun(): String {
                return if (props.bgColor == "") {
                    colors.value.front;
                } else {
                    props.bgColor;
                }
                ;
            }
            );
            val noteC = computed(fun(): String {
                if (!props.spaceBeforeParagraph) {
                    return props.note;
                }
                return "\u3000\u3000" + props.note.replaceAll("\\n", "\n\u3000\u3000");
            }
            );
            val cardStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("background", bgColorC.value);
                styles.set("border-radius", `$snui`.configs.radius.normal);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            return fun(): Any? {
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                return createElementVNode("view", utsMapOf("class" to "com-card", "style" to normalizeStyle(utsArrayOf(
                    unref(cardStylesC),
                    _ctx.customStyle
                ))), utsArrayOf(
                    if (_ctx.title != "") {
                        createVNode(_component_sn_text, utsMapOf("key" to 0, "class" to "com-card-title", "font" to "misans-semibold", "text" to _ctx.title, "size" to unref(`$snui`).configs.font.size(4), "color" to unref(titleColorC), "style" to normalizeStyle(utsArrayOf(
                            utsMapOf("marginBottom" to if (!unref(`$snui`).utils.text.isEmpty(unref(noteC))) {
                                "10px";
                            } else {
                                "0px";
                            })
                        ))), null, 8, utsArrayOf(
                            "text",
                            "size",
                            "color",
                            "style"
                        ));
                    } else {
                        createCommentVNode("v-if", true);
                    }
                    ,
                    if (_ctx.note != "") {
                        createVNode(_component_sn_text, utsMapOf("key" to 1, "class" to "com-card-note", "text" to unref(noteC), "size" to unref(`$snui`).configs.font.size(2), "color" to unref(noteColorC), "style" to normalizeStyle(utsArrayOf(
                            utsMapOf("marginBottom" to if (_ctx.`$slots`["default"] != null) {
                                "10px";
                            } else {
                                "0px";
                            })
                        ))), null, 8, utsArrayOf(
                            "text",
                            "size",
                            "color",
                            "style"
                        ));
                    } else {
                        createCommentVNode("v-if", true);
                    }
                    ,
                    renderSlot(_ctx.`$slots`, "default")
                ), 4);
            }
            ;
        }
        ;
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("com-card" to padStyleMapOf(utsMapOf("width" to "100%", "minHeight" to 10, "paddingTop" to 10, "paddingRight" to 15, "paddingBottom" to 10, "paddingLeft" to 15, "marginTop" to 5, "marginRight" to 0, "marginBottom" to 5, "marginLeft" to 0)), "com-card-title" to padStyleMapOf(utsMapOf("paddingTop" to 5, "paddingRight" to 5, "paddingBottom" to 5, "paddingLeft" to 5)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf("title" to utsMapOf("type" to "String", "default" to ""), "note" to utsMapOf("type" to "String", "default" to ""), "titleColor" to utsMapOf("type" to "String", "default" to ""), "noteColor" to utsMapOf("type" to "String", "default" to ""), "bgColor" to utsMapOf("type" to "String", "default" to ""), "spaceBeforeParagraph" to utsMapOf("type" to "Boolean", "default" to true), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "title",
            "note",
            "titleColor",
            "noteColor",
            "bgColor",
            "spaceBeforeParagraph",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
