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
open class GenUniModulesSinleUiComponentsSnToastSnToast : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var text: String by `$props`;
    open var bgColor: String by `$props`;
    open var overlay: Boolean by `$props`;
    open var position: String by `$props`;
    open var duration: Number by `$props`;
    open var textSize: String by `$props`;
    open var textColor: String by `$props`;
    open var borderRadius: String by `$props`;
    open var padding: String by `$props`;
    open var icon: String by `$props`;
    open var iconSize: String by `$props`;
    open var iconColor: String by `$props`;
    open var textAlign: String by `$props`;
    open var loading: Boolean by `$props`;
    open var textLines: Number by `$props`;
    open var customStyle: Any by `$props`;
    open var show: (param: SnToastParam) -> Unit
        get() {
            return unref(this.`$exposed`["show"]) as (param: SnToastParam) -> Unit;
        }
        set(value) {
            setRefValue(this.`$exposed`, "show", value);
        }
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnToastSnToast, _arg1: SetupContext) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props, ref1): Any? {
            var __expose = ref1.expose;
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnToastSnToast;
            val _cache = __ins.renderCache;
            val snu = `$snui`.utils;
            val colors = `$snui`.colors;
            val props = __props;
            val showOverlay = ref(false);
            val showToast = ref(false);
            val config = ref(SnToastParam());
            val showIcon = computed(fun(): Boolean {
                var icon = config.value.icon as String?;
                return icon != null && icon.trim() != "";
            }
            );
            val textColorC = computed(fun(): String {
                return if (props.textColor == "") {
                    "#fff";
                } else {
                    props.textColor;
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
            val iconColorC = computed(fun(): String {
                return if (props.textColor == "") {
                    "#fff";
                } else {
                    props.textColor;
                }
                ;
            }
            );
            val iconSizeC = computed(fun(): String {
                return if (props.textSize == "") {
                    `$snui`.configs.font.size(5);
                } else {
                    props.textSize;
                }
                ;
            }
            );
            val bgColorC = computed(fun(): String {
                return if (props.bgColor == "") {
                    colors.value.toast;
                } else {
                    props.bgColor;
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
            val positionC = computed(fun(): String {
                var positions = utsArrayOf(
                    "center",
                    "top",
                    "bottom"
                );
                return if (positions.includes(props.position)) {
                    props.position;
                } else {
                    "center";
                }
                ;
            }
            );
            val containStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("z-index", `$snui`.configs.zIndex.toast);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val iconStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("margin-right", "6px");
                return styles;
            }
            );
            val textStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("word-break", "break-all");
                styles.set("flex", "1");
                return styles;
            }
            );
            val toastStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("border-radius", config.value.borderRadius ?: props.borderRadius);
                styles.set("padding", config.value.padding ?: props.padding);
                styles.set("background", config.value.bgColor ?: bgColorC.value);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val containClassesC = computed(fun(): Map<String, Any> {
                var classes = Map<String, Any>();
                classes.set("top", config.value.position == "top");
                classes.set("center", config.value.position == "center");
                classes.set("bottom", config.value.position == "bottom");
                classes.set("hover", showToast.value);
                return classes;
            }
            );
            fun genShowFn(param: SnToastParam) {
                config.value.bgColor = param.bgColor ?: bgColorC.value;
                config.value.borderRadius = param.borderRadius ?: borderRadiusC.value;
                config.value.text = param.text ?: props.text;
                config.value.overlay = param.overlay ?: props.overlay;
                config.value.loading = param.loading ?: props.loading;
                config.value.position = param.position ?: positionC.value;
                config.value.duration = param.duration ?: props.duration;
                config.value.textSize = param.textSize ?: textSizeC.value;
                config.value.textColor = param.textColor ?: textColorC.value;
                config.value.iconSize = param.iconSize ?: iconSizeC.value;
                config.value.iconColor = param.iconColor ?: iconColorC.value;
                config.value.padding = param.padding ?: props.padding;
                config.value.icon = param.icon ?: props.icon;
                config.value.textLines = param.textLines ?: props.textLines;
                config.value.textAlign = param.textAlign ?: props.textAlign;
                showToast.value = true;
                if (props.overlay) {
                    showOverlay.value = true;
                }
                snu.other.debounce(fun(){
                    showToast.value = false;
                    showOverlay.value = false;
                }
                , config.value.duration!!);
            }
            val show = ::genShowFn;
            __expose(utsMapOf("show" to show));
            return fun(): Any? {
                val _component_sn_icon = resolveEasyComponent("sn-icon", GenUniModulesSinleUiComponentsSnIconSnIconClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_sn_overlay = resolveEasyComponent("sn-overlay", GenUniModulesSinleUiComponentsSnOverlaySnOverlayClass);
                return createElementVNode(Fragment, null, utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to normalizeClass(utsArrayOf(
                        "sn-toast-contain",
                        unref(containClassesC)
                    )), "style" to normalizeStyle(unref(containStylesC))), utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "sn-toast", "style" to normalizeStyle(unref(toastStylesC))), utsArrayOf(
                            if (isTrue(unref(showIcon))) {
                                createVNode(_component_sn_icon, utsMapOf("key" to 0, "name" to (unref(config).icon ?: ""), "color" to (unref(config).iconColor ?: ""), "size" to (unref(config).iconSize ?: ""), "style" to normalizeStyle(unref(iconStylesC))), null, 8, utsArrayOf(
                                    "name",
                                    "color",
                                    "size",
                                    "style"
                                ));
                            } else {
                                createCommentVNode("v-if", true);
                            }
                            ,
                            createVNode(_component_sn_text, utsMapOf("text" to (unref(config).text ?: ""), "align" to "center", "color" to (unref(config).textColor ?: ""), "size" to (unref(config).textSize ?: ""), "lines" to (unref(config).textLines ?: 0), "style" to normalizeStyle(unref(textStylesC))), null, 8, utsArrayOf(
                                "text",
                                "color",
                                "size",
                                "lines",
                                "style"
                            ))
                        ), 4)
                    ), 6),
                    createVNode(_component_sn_overlay, utsMapOf("show" to unref(showOverlay), "opacity" to 0), null, 8, utsArrayOf(
                        "show"
                    ))
                ), 64);
            }
            ;
        }
        ;
        var name = "sn-toast";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-toast-contain" to utsMapOf("" to utsMapOf("paddingTop" to 40, "paddingRight" to 40, "paddingBottom" to 40, "paddingLeft" to 40, "alignItems" to "center", "justifyContent" to "center", "position" to "fixed", "pointerEvents" to "none", "left" to 0, "right" to 0, "opacity" to 0), ".top" to utsMapOf("top" to 0, "transform" to "scale(0.9) translateY(0px)"), ".top.hover" to utsMapOf("opacity" to 1, "transform" to "scale(1) translateY(20px)"), ".center" to utsMapOf("top" to "50%", "transform" to "scale(0.9) translateY(-50%)"), ".center.hover" to utsMapOf("opacity" to 1, "transform" to "scale(1) translateY(-50%)"), ".bottom" to utsMapOf("bottom" to 0, "transform" to "scale(0.9) translateY(0px)"), ".bottom.hover" to utsMapOf("opacity" to 1, "transform" to "scale(1) translateY(-20px)")), "sn-toast" to padStyleMapOf(utsMapOf("alignItems" to "center", "justifyContent" to "center", "flexDirection" to "row", "paddingTop" to 12, "paddingRight" to 15, "paddingBottom" to 12, "paddingLeft" to 15)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf("text" to utsMapOf("type" to "String", "default" to ""), "bgColor" to utsMapOf("type" to "String", "default" to ""), "overlay" to utsMapOf("type" to "Boolean", "default" to false), "position" to utsMapOf("type" to "String", "default" to "center"), "duration" to utsMapOf("type" to "Number", "default" to 2000), "textSize" to utsMapOf("type" to "String", "default" to ""), "textColor" to utsMapOf("type" to "String", "default" to ""), "borderRadius" to utsMapOf("type" to "String", "default" to ""), "padding" to utsMapOf("type" to "String", "default" to "12px 15px"), "icon" to utsMapOf("type" to "String", "default" to ""), "iconSize" to utsMapOf("type" to "String", "default" to ""), "iconColor" to utsMapOf("type" to "String", "default" to ""), "textAlign" to utsMapOf("type" to "String", "default" to "center"), "loading" to utsMapOf("type" to "Boolean", "default" to false), "textLines" to utsMapOf("type" to "Number", "default" to 0), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "text",
            "bgColor",
            "overlay",
            "position",
            "duration",
            "textSize",
            "textColor",
            "borderRadius",
            "padding",
            "icon",
            "iconSize",
            "iconColor",
            "textAlign",
            "loading",
            "textLines",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
