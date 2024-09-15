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
open class GenUniModulesSinleUiComponentsSnCardSnCard : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var title: String by `$props`;
    open var titleColor: String by `$props`;
    open var titleFont: String by `$props`;
    open var titleSize: String by `$props`;
    open var bgColor: String by `$props`;
    open var border: String by `$props`;
    open var borderRadius: String by `$props`;
    open var section: Boolean by `$props`;
    open var sectionColor: String by `$props`;
    open var customStyle: Any by `$props`;
    open var customHeaderStyle: Any by `$props`;
    open var customTitleStyle: Any by `$props`;
    open var customBodyStyle: Any by `$props`;
    open var customFooterStyle: Any by `$props`;
    open var customActionStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnCardSnCard) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnCardSnCard;
            val _cache = __ins.renderCache;
            val snu = `$snui`.utils;
            val colors = `$snui`.colors;
            val props = __props;
            val titleEmpty = computed(fun(): Boolean {
                return snu.text.isEmpty(props.title);
            }
            );
            val bottomBorderRadius = computed(fun(): String {
                var arr = props.borderRadius.split(" ");
                when (arr.length) {
                    1 -> 
                        {
                            return "0 0 " + arr[0] + " " + arr[0];
                            return "0 0 5px 5px";
                        }
                    2 -> 
                        {
                            return "0 0 " + arr[0] + " " + arr[1];
                            return "0 0 5px 5px";
                        }
                    3 -> 
                        {
                            return "0 0 " + arr[0] + " " + arr[1];
                            return "0 0 5px 5px";
                        }
                    4 -> 
                        {
                            return "0 0 " + arr[2] + " " + arr[3];
                            return "0 0 5px 5px";
                        }
                    else -> 
                        return "0 0 5px 5px";
                }
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
            val borderC = computed(fun(): String {
                return if (props.border == "") {
                    "1px solid " + colors.value.line;
                } else {
                    props.border;
                }
                ;
            }
            );
            val sectionColorC = computed(fun(): String {
                return if (props.sectionColor == "") {
                    colors.value.primary;
                } else {
                    props.sectionColor;
                }
                ;
            }
            );
            val titleSizeC = computed(fun(): String {
                return if (props.titleSize == "") {
                    `$snui`.configs.font.size(4);
                } else {
                    props.titleSize;
                }
                ;
            }
            );
            val borderRadiusC = computed(fun(): String {
                return if (props.borderRadius == "") {
                    `$snui`.configs.radius.normal;
                } else {
                    props.borderRadius;
                }
                ;
            }
            );
            val cardStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("background", bgColorC.value);
                styles.set("border", borderC.value);
                styles.set("border-radius", borderRadiusC.value);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            return fun(): Any? {
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                return createElementVNode("view", utsMapOf("class" to "sn-card", "style" to normalizeStyle(utsArrayOf(
                    unref(cardStylesC),
                    _ctx.customStyle
                ))), utsArrayOf(
                    if (isTrue(!unref(titleEmpty) || _ctx.`$slots`["avatar"] != null || _ctx.`$slots`["header-extra"] != null)) {
                        createElementVNode("view", utsMapOf("key" to 0, "class" to "sn-card-header", "style" to normalizeStyle(utsArrayOf(
                            utsMapOf("transitionDuration" to unref(`$snui`).configs.aniTime.normal),
                            _ctx.customHeaderStyle
                        ))), utsArrayOf(
                            createElementVNode("view", utsMapOf("class" to "sn-card-header-left"), utsArrayOf(
                                renderSlot(_ctx.`$slots`, "avatar"),
                                renderSlot(_ctx.`$slots`, "title", UTSJSONObject(), fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        if (isTrue(_ctx.section)) {
                                            createElementVNode("view", utsMapOf("key" to 0, "class" to "titleArea"), utsArrayOf(
                                                createElementVNode("view", utsMapOf("class" to "line", "style" to normalizeStyle(utsMapOf("background" to unref(sectionColorC), "borderRadius" to unref(`$snui`).configs.radius.circle))), null, 4),
                                                createVNode(_component_sn_text, utsMapOf("class" to "sn-card-title", "text" to _ctx.title, "size" to unref(titleSizeC), "color" to unref(titleColorC), "font" to _ctx.titleFont, "style" to normalizeStyle(utsArrayOf(
                                                    _ctx.customTitleStyle
                                                ))), null, 8, utsArrayOf(
                                                    "text",
                                                    "size",
                                                    "color",
                                                    "font",
                                                    "style"
                                                ))
                                            ));
                                        } else {
                                            createVNode(_component_sn_text, utsMapOf("key" to 1, "class" to "sn-card-title", "text" to _ctx.title, "size" to unref(titleSizeC), "color" to unref(titleColorC), "font" to _ctx.titleFont, "style" to normalizeStyle(utsArrayOf(
                                                _ctx.customTitleStyle
                                            ))), null, 8, utsArrayOf(
                                                "text",
                                                "size",
                                                "color",
                                                "font",
                                                "style"
                                            ));
                                        }
                                    );
                                })
                            )),
                            renderSlot(_ctx.`$slots`, "header-extra")
                        ), 4);
                    } else {
                        createCommentVNode("v-if", true);
                    }
                    ,
                    createElementVNode("view", utsMapOf("class" to "sn-card-body", "style" to normalizeStyle(utsArrayOf(
                        utsMapOf("background" to unref(bgColorC), "borderRadius" to if ((_ctx.`$slots`["footer"] == null && _ctx.`$slots`["action"] == null)) {
                            unref(bottomBorderRadius);
                        } else {
                            "";
                        }
                        , "transitionDuration" to unref(`$snui`).configs.aniTime.normal),
                        _ctx.customBodyStyle
                    ))), utsArrayOf(
                        renderSlot(_ctx.`$slots`, "default")
                    ), 4),
                    if (_ctx.`$slots`["footer"] != null) {
                        createElementVNode("view", utsMapOf("key" to 1, "class" to "sn-card-footer", "style" to normalizeStyle(utsArrayOf(
                            utsMapOf("borderRadius" to if (_ctx.`$slots`["action"] == null) {
                                unref(bottomBorderRadius);
                            } else {
                                "";
                            }, "transitionDuration" to unref(`$snui`).configs.aniTime.normal),
                            _ctx.customFooterStyle
                        ))), utsArrayOf(
                            renderSlot(_ctx.`$slots`, "footer")
                        ), 4);
                    } else {
                        createCommentVNode("v-if", true);
                    }
                    ,
                    if (_ctx.`$slots`["action"] != null) {
                        createElementVNode("view", utsMapOf("key" to 2, "class" to "sn-card-action", "style" to normalizeStyle(utsArrayOf(
                            utsMapOf("borderRadius" to unref(bottomBorderRadius), "transitionDuration" to unref(`$snui`).configs.aniTime.normal),
                            _ctx.customActionStyle
                        ))), utsArrayOf(
                            renderSlot(_ctx.`$slots`, "action")
                        ), 4);
                    } else {
                        createCommentVNode("v-if", true);
                    }
                ), 4);
            }
            ;
        }
        ;
        var name = "sn-card";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-card" to padStyleMapOf(utsMapOf("marginTop" to 5, "marginRight" to 5, "marginBottom" to 5, "marginLeft" to 5)), "sn-card-header" to padStyleMapOf(utsMapOf("paddingTop" to 15, "paddingRight" to 20, "paddingBottom" to 2, "paddingLeft" to 20, "display" to "flex", "flexDirection" to "row", "alignItems" to "center", "justifyContent" to "space-between")), "titleArea" to utsMapOf(".sn-card-header " to utsMapOf("display" to "flex", "flexDirection" to "row", "alignItems" to "center")), "line" to utsMapOf(".sn-card-header .titleArea " to utsMapOf("width" to 3, "height" to 22, "marginRight" to 6)), "sn-card-header-left" to padStyleMapOf(utsMapOf("flexDirection" to "row", "alignItems" to "center")), "sn-card-body" to padStyleMapOf(utsMapOf("paddingTop" to 10, "paddingRight" to 10, "paddingBottom" to 10, "paddingLeft" to 10)), "sn-card-title" to padStyleMapOf(utsMapOf("fontWeight" to "bold")), "sn-card-footer" to padStyleMapOf(utsMapOf("marginTop" to 10, "paddingTop" to 0, "paddingRight" to 15, "paddingBottom" to 0, "paddingLeft" to 15)), "sn-card-action" to padStyleMapOf(utsMapOf("marginTop" to 5, "paddingTop" to 15, "paddingRight" to 15, "paddingBottom" to 4, "paddingLeft" to 15)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf("title" to utsMapOf("type" to "String", "default" to ""), "titleColor" to utsMapOf("type" to "String", "default" to ""), "titleFont" to utsMapOf("type" to "String", "default" to "misans-semibold"), "titleSize" to utsMapOf("type" to "String", "default" to ""), "bgColor" to utsMapOf("type" to "String", "default" to ""), "border" to utsMapOf("type" to "String", "default" to ""), "borderRadius" to utsMapOf("type" to "String", "default" to ""), "section" to utsMapOf("type" to "Boolean", "default" to false), "sectionColor" to utsMapOf("type" to "String", "default" to ""), "customStyle" to utsMapOf("default" to UTSJSONObject()), "customHeaderStyle" to utsMapOf("default" to UTSJSONObject()), "customTitleStyle" to utsMapOf("default" to UTSJSONObject()), "customBodyStyle" to utsMapOf("default" to UTSJSONObject()), "customFooterStyle" to utsMapOf("default" to UTSJSONObject()), "customActionStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "title",
            "titleColor",
            "titleFont",
            "titleSize",
            "bgColor",
            "border",
            "borderRadius",
            "section",
            "sectionColor",
            "customStyle",
            "customHeaderStyle",
            "customTitleStyle",
            "customBodyStyle",
            "customFooterStyle",
            "customActionStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
