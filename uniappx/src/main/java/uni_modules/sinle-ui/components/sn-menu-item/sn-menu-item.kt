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
open class GenUniModulesSinleUiComponentsSnMenuItemSnMenuItem : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var listMode: Boolean by `$props`;
    open var icon: String by `$props`;
    open var text: String by `$props`;
    open var iconColor: String by `$props`;
    open var iconSize: String by `$props`;
    open var textColor: String by `$props`;
    open var textSize: String by `$props`;
    open var textAlign: String by `$props`;
    open var disabled: Boolean by `$props`;
    open var bgColor: String by `$props`;
    open var activeBgColor: String by `$props`;
    open var customIconStyle: Any by `$props`;
    open var customTextStyle: Any by `$props`;
    open var customStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnMenuItemSnMenuItem) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnMenuItemSnMenuItem;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val snu = `$snui`.utils;
            val props = __props;
            val isHover = ref(false);
            val iconColorC = computed(fun(): String {
                return if (props.iconColor == "") {
                    colors.value.text;
                } else {
                    props.iconColor;
                }
                ;
            }
            );
            val textColorC = computed(fun(): String {
                return if (props.textColor == "") {
                    colors.value.text;
                } else {
                    props.textColor;
                }
                ;
            }
            );
            val activeBgColorC = computed(fun(): String {
                return if (props.activeBgColor == "") {
                    colors.value.info;
                } else {
                    props.activeBgColor;
                }
                ;
            }
            );
            val iconSizeC = computed(fun(): String {
                return if (props.iconSize == "") {
                    `$snui`.configs.font.size(4);
                } else {
                    props.iconSize;
                }
                ;
            }
            );
            val textSizeC = computed(fun(): String {
                return if (props.textSize == "") {
                    `$snui`.configs.font.size(2);
                } else {
                    props.textSize;
                }
                ;
            }
            );
            val itemStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                var bgColor = if (props.disabled) {
                    colors.value.disabled;
                } else {
                    if (isHover.value) {
                        activeBgColorC.value;
                    } else {
                        if (props.bgColor == "") {
                            colors.value.front;
                        } else {
                            props.bgColor;
                        }
                        ;
                    }
                    ;
                }
                ;
                styles.set("background", bgColor);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val iconStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("marginRight", "" + snu.getPx(iconSizeC.value) / 2 + "px");
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val showIcon = computed(fun(): Boolean {
                return !snu.text.isEmpty(props.icon);
            }
            );
            return fun(): Any? {
                val _component_sn_icon = resolveEasyComponent("sn-icon", GenUniModulesSinleUiComponentsSnIconSnIconClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                return if (isTrue(!_ctx.listMode)) {
                    createElementVNode("view", utsMapOf("key" to 0, "class" to "sn-menu-item", "onTouchstart" to fun(){
                        isHover.value = true;
                    }, "onTouchend" to fun(){
                        isHover.value = false;
                    }, "onTouchcancel" to fun(){
                        isHover.value = false;
                    }, "style" to normalizeStyle(utsArrayOf(
                        unref(itemStylesC),
                        _ctx.customStyle
                    ))), utsArrayOf(
                        if (isTrue(unref(showIcon))) {
                            createVNode(_component_sn_icon, utsMapOf("key" to 0, "name" to _ctx.icon, "size" to unref(iconSizeC), "color" to if (_ctx.disabled) {
                                unref(colors).disabled;
                            } else {
                                unref(iconColorC);
                            }, "style" to normalizeStyle(unref(iconStylesC)), "customStyle" to _ctx.customIconStyle), null, 8, utsArrayOf(
                                "name",
                                "size",
                                "color",
                                "style",
                                "customStyle"
                            ));
                        } else {
                            createCommentVNode("v-if", true);
                        },
                        createVNode(_component_sn_text, utsMapOf("class" to "sn-menu-item-text", "text" to _ctx.text, "align" to _ctx.textAlign, "size" to unref(textSizeC), "color" to if (_ctx.disabled) {
                            unref(colors).disabled;
                        } else {
                            unref(textColorC);
                        }, "customStyle" to _ctx.customTextStyle), null, 8, utsArrayOf(
                            "text",
                            "align",
                            "size",
                            "color",
                            "customStyle"
                        ))
                    ), 44, utsArrayOf(
                        "onTouchstart",
                        "onTouchend",
                        "onTouchcancel"
                    ));
                } else {
                    if (isTrue(_ctx.listMode)) {
                        createElementVNode("list-item", utsMapOf("key" to 1, "class" to "sn-menu-item", "onTouchstart" to fun(){
                            isHover.value = true;
                        }, "onTouchend" to fun(){
                            isHover.value = false;
                        }, "onTouchcancel" to fun(){
                            isHover.value = false;
                        }, "style" to normalizeStyle(utsArrayOf(
                            unref(itemStylesC),
                            _ctx.customStyle
                        ))), utsArrayOf(
                            if (isTrue(unref(showIcon))) {
                                createVNode(_component_sn_icon, utsMapOf("key" to 0, "name" to _ctx.icon, "size" to unref(iconSizeC), "color" to if (_ctx.disabled) {
                                    unref(colors).disabled;
                                } else {
                                    unref(iconColorC);
                                }, "customStyle" to _ctx.customIconStyle, "style" to normalizeStyle(unref(iconStylesC))), null, 8, utsArrayOf(
                                    "name",
                                    "size",
                                    "color",
                                    "customStyle",
                                    "style"
                                ));
                            } else {
                                createCommentVNode("v-if", true);
                            },
                            createVNode(_component_sn_text, utsMapOf("class" to "sn-menu-item-text", "text" to _ctx.text, "align" to _ctx.textAlign, "size" to unref(textSizeC), "color" to if (_ctx.disabled) {
                                unref(colors).disabled;
                            } else {
                                unref(textColorC);
                            }, "customStyle" to _ctx.customTextStyle), null, 8, utsArrayOf(
                                "text",
                                "align",
                                "size",
                                "color",
                                "customStyle"
                            ))
                        ), 44, utsArrayOf(
                            "onTouchstart",
                            "onTouchend",
                            "onTouchcancel"
                        ));
                    } else {
                        createCommentVNode("v-if", true);
                    }
                    ;
                }
                ;
            }
            ;
        }
        ;
        var name = "sn-menu-item";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-menu-item" to padStyleMapOf(utsMapOf("display" to "flex", "width" to "100%", "minWidth" to 150, "flexDirection" to "row", "paddingTop" to 12, "paddingRight" to 15, "paddingBottom" to 12, "paddingLeft" to 15, "alignItems" to "center")), "sn-menu-item-text" to padStyleMapOf(utsMapOf("textOverflow" to "ellipsis", "flex" to 1)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf("listMode" to utsMapOf("type" to "Boolean", "default" to false), "icon" to utsMapOf("type" to "String", "default" to ""), "text" to utsMapOf("type" to "String", "default" to ""), "iconColor" to utsMapOf("type" to "String", "default" to ""), "iconSize" to utsMapOf("type" to "String", "default" to ""), "textColor" to utsMapOf("type" to "String", "default" to ""), "textSize" to utsMapOf("type" to "String", "default" to ""), "textAlign" to utsMapOf("type" to "String", "default" to "left"), "disabled" to utsMapOf("type" to "Boolean", "default" to false), "bgColor" to utsMapOf("type" to "String", "default" to ""), "activeBgColor" to utsMapOf("type" to "String", "default" to ""), "customIconStyle" to utsMapOf("default" to UTSJSONObject()), "customTextStyle" to utsMapOf("default" to UTSJSONObject()), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "listMode",
            "icon",
            "text",
            "iconColor",
            "iconSize",
            "textColor",
            "textSize",
            "textAlign",
            "disabled",
            "bgColor",
            "activeBgColor",
            "customIconStyle",
            "customTextStyle",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
