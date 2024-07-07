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
open class GenUniModulesSinleUiComponentsSnCollapseItemSnCollapseItem : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var title: String by `$props`;
    open var icon: String by `$props`;
    open var open: Boolean by `$props`;
    open var border: Boolean by `$props`;
    open var disabled: Boolean by `$props`;
    open var customStyle: Any by `$props`;
    open var close: () -> Unit
        get() {
            return unref(this.`$exposed`["close"]) as () -> Unit;
        }
        set(value) {
            setRefValue(this.`$exposed`, "close", value);
        }
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnCollapseItemSnCollapseItem, _arg1: SetupContext) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props, ref1): Any? {
            var __expose = ref1.expose;
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnCollapseItemSnCollapseItem;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val instance = getCurrentInstance()!!;
            val props = __props;
            val aniDur = inject("aniDur", parseFloat(`$snui`.configs.aniTime.normal));
            val bgColor = inject("bgColor", colors.value.front);
            val titleSize = inject("titleSize", `$snui`.configs.font.size(3));
            val titleColor = inject("titleColor", colors.value.title);
            val activeTitleColor = inject("activeTitleColor", colors.value.primary);
            val customTitleStyle = inject("customTitleStyle", UTSJSONObject());
            val customHolderStyle = inject("customHolderStyle", UTSJSONObject());
            val id = randomId();
            val opened = ref(false);
            val showBorder = ref(false);
            val holderEle = ref(null as UniElement?);
            val height = ref(0);
            val group = computed(fun(): ComponentPublicInstance {
                return instance.proxy!!.`$parent` as ComponentPublicInstance;
            }
            );
            val itemStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("transitionProperty", "background-color, border");
                if (showBorder.value) {
                    styles.set("border-bottom", "0.5px solid " + colors.value.line);
                }
                styles.set("background", if (props.disabled) {
                    colors.value.disabled;
                } else {
                    bgColor;
                }
                );
                styles.set("transition-duration", "" + aniDur + "ms");
                return styles;
            }
            );
            val titleStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("padding", "10px 0");
                styles.set("flex", "1");
                styles.set("transition-duration", "" + aniDur + "ms");
                return styles;
            }
            );
            val prefixStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("padding", "15px 0");
                styles.set("transition-duration", "" + aniDur + "ms");
                return styles;
            }
            );
            val suffixStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("padding", "15px 0");
                styles.set("transform", "rotate(" + (if (opened.value) {
                    90;
                } else {
                    0;
                }
                ) + "deg)");
                styles.set("transition-duration", "" + aniDur + "ms");
                return styles;
            }
            );
            val wrapStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("height", if (opened.value) {
                    height.value;
                } else {
                    "0px";
                }
                );
                styles.set("transition-duration", "" + aniDur + "ms");
                return styles;
            }
            );
            fun genOnClickFn() {
                var open = opened.value;
                if (!props.disabled) {
                    group.value?.`$callMethod`("closeAll");
                    opened.value = !open;
                }
            }
            val onClick = ::genOnClickFn;
            fun genCloseFn() {
                opened.value = false;
            }
            val close = ::genCloseFn;
            fun genSetShowBorderFn() {
                if (props.border) {
                    var children = group.value!!.`$callMethod`("getChildren") as UTSArray<UniElement>;
                    children.map(fun(ele: UniElement, index: Number){
                        if (ele.dataset.get("sn-id") == id && index != children.length - 1) {
                            showBorder.value = true;
                        }
                    }
                    );
                }
            }
            val setShowBorder = ::genSetShowBorderFn;
            fun genInitFn() {
                nextTick(fun(){
                    setShowBorder();
                    height.value = holderEle.value!!.getBoundingClientRect()!!.height;
                }
                );
            }
            val init = ::genInitFn;
            __expose(utsMapOf("close" to close));
            onMounted(fun(){
                opened.value = props.open;
                group.value?.`$callMethod`("register", instance.proxy!!);
                init();
            }
            );
            onUpdated(fun(){
                init();
            }
            );
            return fun(): Any? {
                val _component_sn_icon = resolveEasyComponent("sn-icon", GenUniModulesSinleUiComponentsSnIconSnIconClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                return createElementVNode("view", utsMapOf("class" to "sn-collapse-item", "data-sn-type" to "sn-collapse-item", "data-sn-id" to unref(id), "onClick" to onClick, "style" to normalizeStyle(utsArrayOf(
                    unref(itemStylesC),
                    _ctx.customStyle
                ))), utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "sn-collapse-item-header"), utsArrayOf(
                        createVNode(_component_sn_icon, utsMapOf("class" to "sn-collapse-item-prefix", "name" to _ctx.icon, "size" to unref(titleSize), "color" to if (_ctx.disabled) {
                            unref(colors).disabledText;
                        } else {
                            if (unref(opened)) {
                                unref(activeTitleColor);
                            } else {
                                unref(titleColor);
                            }
                            ;
                        }
                        , "customStyle" to unref(customTitleStyle), "style" to normalizeStyle(utsArrayOf(
                            unref(prefixStylesC)
                        ))), null, 8, utsArrayOf(
                            "name",
                            "size",
                            "color",
                            "customStyle",
                            "style"
                        )),
                        createVNode(_component_sn_text, utsMapOf("text" to _ctx.title, "lines" to 1, "size" to unref(titleSize), "color" to if (_ctx.disabled) {
                            unref(colors).disabledText;
                        } else {
                            if (unref(opened)) {
                                unref(activeTitleColor);
                            } else {
                                unref(titleColor);
                            }
                            ;
                        }
                        , "customStyle" to unref(customTitleStyle), "style" to normalizeStyle(utsArrayOf(
                            unref(titleStylesC)
                        ))), null, 8, utsArrayOf(
                            "text",
                            "size",
                            "color",
                            "customStyle",
                            "style"
                        )),
                        createVNode(_component_sn_icon, utsMapOf("class" to "sn-collapse-item-icon-suffix", "name" to "arrow-right-s-line", "size" to unref(titleSize), "color" to if (_ctx.disabled) {
                            unref(colors).disabledText;
                        } else {
                            if (unref(opened)) {
                                unref(activeTitleColor);
                            } else {
                                unref(titleColor);
                            }
                            ;
                        }
                        , "customStyle" to unref(customTitleStyle), "style" to normalizeStyle(utsArrayOf(
                            unref(suffixStylesC)
                        ))), null, 8, utsArrayOf(
                            "size",
                            "color",
                            "customStyle",
                            "style"
                        ))
                    )),
                    createElementVNode("view", utsMapOf("class" to "sn-collapse-item-wrap", "onClick" to withModifiers(fun(){}, utsArrayOf(
                        "stop"
                    )), "style" to normalizeStyle(utsArrayOf(
                        unref(wrapStylesC),
                        unref(customHolderStyle)
                    ))), utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "sn-collapse-item-holder", "ref_key" to "holderEle", "ref" to holderEle, "onClick" to withModifiers(fun(){}, utsArrayOf(
                            "stop"
                        )), "style" to normalizeStyle(utsArrayOf(
                            unref(customHolderStyle)
                        ))), utsArrayOf(
                            renderSlot(_ctx.`$slots`, "default")
                        ), 12, utsArrayOf(
                            "onClick"
                        ))
                    ), 12, utsArrayOf(
                        "onClick"
                    ))
                ), 12, utsArrayOf(
                    "data-sn-id"
                ));
            }
            ;
        }
        ;
        var name = "sn-collapse-item";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-collapse-item" to padStyleMapOf(utsMapOf("paddingTop" to 0, "paddingRight" to 10, "paddingBottom" to 0, "paddingLeft" to 10)), "sn-collapse-item-header" to padStyleMapOf(utsMapOf("flexDirection" to "row", "alignItems" to "center")), "sn-collapse-item-prefix" to utsMapOf(".sn-collapse-item-header " to utsMapOf("marginRight" to 5)), "sn-collapse-item-suffix" to utsMapOf(".sn-collapse-item-header " to utsMapOf("marginLeft" to 5)), "sn-collapse-item-wrap" to padStyleMapOf(utsMapOf("transitionProperty" to "backgroundColor,height")), "sn-collapse-item-holder" to utsMapOf(".sn-collapse-item-wrap " to utsMapOf("paddingTop" to 5, "paddingRight" to 0, "paddingBottom" to 5, "paddingLeft" to 0)), "@TRANSITION" to utsMapOf("sn-collapse-item-wrap" to utsMapOf("property" to "backgroundColor,height")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf("title" to utsMapOf("type" to "String", "default" to ""), "icon" to utsMapOf("type" to "String", "default" to ""), "open" to utsMapOf("type" to "Boolean", "default" to false), "border" to utsMapOf("type" to "Boolean", "default" to true), "disabled" to utsMapOf("type" to "Boolean", "default" to false), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "title",
            "icon",
            "open",
            "border",
            "disabled",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
