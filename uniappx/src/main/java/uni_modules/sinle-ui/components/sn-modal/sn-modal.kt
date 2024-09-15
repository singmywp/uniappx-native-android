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
open class GenUniModulesSinleUiComponentsSnModalSnModal : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var title: String by `$props`;
    open var titleAlign: String by `$props`;
    open var titleSize: String by `$props`;
    open var titleFont: String by `$props`;
    open var titleColor: String by `$props`;
    open var bgColor: String by `$props`;
    open var content: String by `$props`;
    open var contentAlign: String by `$props`;
    open var contentSize: String by `$props`;
    open var contentColor: String by `$props`;
    open var contentFont: String by `$props`;
    open var buttonType: String by `$props`;
    open var buttonBorder: String by `$props`;
    open var confirmText: String by `$props`;
    open var confirmTextColor: String by `$props`;
    open var confirmTextSize: String by `$props`;
    open var showCancel: Boolean by `$props`;
    open var showConfirm: Boolean by `$props`;
    open var cancelText: String by `$props`;
    open var cancelTextColor: String by `$props`;
    open var cancelTextSize: String by `$props`;
    open var position: String by `$props`;
    open var aniDur: Number by `$props`;
    open var maskClose: Boolean by `$props`;
    open var disabled: Boolean by `$props`;
    open var preventBack: Boolean by `$props`;
    open var maskOpacity: Number by `$props`;
    open var customStyle: Any by `$props`;
    open var open: () -> Unit
        get() {
            return unref(this.`$exposed`["open"]) as () -> Unit;
        }
        set(value) {
            setRefValue(this.`$exposed`, "open", value);
        }
    open var close: () -> Unit
        get() {
            return unref(this.`$exposed`["close"]) as () -> Unit;
        }
        set(value) {
            setRefValue(this.`$exposed`, "close", value);
        }
    open var confirm: () -> Unit
        get() {
            return unref(this.`$exposed`["confirm"]) as () -> Unit;
        }
        set(value) {
            setRefValue(this.`$exposed`, "confirm", value);
        }
    open var cancel: () -> Unit
        get() {
            return unref(this.`$exposed`["cancel"]) as () -> Unit;
        }
        set(value) {
            setRefValue(this.`$exposed`, "cancel", value);
        }
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnModalSnModal, _arg1: SetupContext) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props, ref1): Any? {
            var __expose = ref1.expose;
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnModalSnModal;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val snu = `$snui`.utils;
            val instance = getCurrentInstance()!!;
            fun emit(event: String, vararg do_not_transform_spread: Any?) {
                __ins.emit(event, *do_not_transform_spread);
            }
            val props = __props;
            val showOverlay = ref(false);
            val showModal = ref(false);
            val scrollTop = ref(0);
            val maxHeight = ref(0);
            val actionHeight = ref(50);
            val headerHeight = ref(0);
            val headerEle = ref(null as UniElement?);
            val buttonTypeC = computed(fun(): String {
                var types = utsArrayOf(
                    "embed",
                    "float"
                );
                return if (types.includes(props.buttonType)) {
                    props.buttonType;
                } else {
                    "embed";
                }
                ;
            }
            );
            val showActions = computed(fun(): Boolean {
                return props.showCancel || props.showConfirm;
            }
            );
            val aniDurC = computed(fun(): Number {
                var aniDur = props.aniDur;
                return if (aniDur > 100) {
                    aniDur - 100;
                } else {
                    aniDur;
                }
                ;
            }
            );
            val theme = computed(fun(): String {
                return `$snui`.configs.app.theme;
            }
            );
            val titleSizeC = computed(fun(): String {
                return if (props.titleSize == "") {
                    "" + (`$snui`.utils.getPx(`$snui`.configs.font.size(3)) + 1) + "px";
                } else {
                    props.titleSize;
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
                    colors.value["" + (if (theme.value == "light") {
                        "front";
                    } else {
                        "info";
                    })] as String;
                } else {
                    props.bgColor;
                }
                ;
            }
            );
            val contentColorC = computed(fun(): String {
                return if (props.contentColor == "") {
                    colors.value.text;
                } else {
                    props.contentColor;
                }
                ;
            }
            );
            val buttonBorderC = computed(fun(): String {
                return if (props.buttonBorder == "") {
                    "0.5px solid " + colors.value.line;
                } else {
                    props.buttonBorder;
                }
                ;
            }
            );
            val confirmTextColorC = computed(fun(): String {
                return if (props.confirmTextColor == "") {
                    colors.value.primaryDark;
                } else {
                    props.confirmTextColor;
                }
                ;
            }
            );
            val confirmTextSizeC = computed(fun(): String {
                return if (props.confirmTextSize == "") {
                    `$snui`.configs.font.size(3);
                } else {
                    props.confirmTextSize;
                }
                ;
            }
            );
            val cancelTextColorC = computed(fun(): String {
                return if (props.cancelTextColor == "") {
                    colors.value.text;
                } else {
                    props.cancelTextColor;
                }
                ;
            }
            );
            val cancelTextSizeC = computed(fun(): String {
                return if (props.cancelTextSize == "") {
                    `$snui`.configs.font.size(3);
                } else {
                    props.cancelTextSize;
                }
                ;
            }
            );
            val contentSizeC = computed(fun(): String {
                return if (props.contentSize == "") {
                    "" + (`$snui`.utils.getPx(`$snui`.configs.font.baseSize) + 1) + "px";
                } else {
                    props.contentSize;
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
            val modalStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("max-height", "" + maxHeight.value + "px");
                styles.set("background", bgColorC.value);
                styles.set("border-radius", `$snui`.configs.radius.normal);
                styles.set("padding-top", "32px");
                styles.set("transition-duration", "" + props.aniDur + "ms");
                if (buttonTypeC.value == "float") {
                    styles.set("padding-bottom", "5px");
                }
                return styles;
            }
            );
            val overlayStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("justifyContent", if (positionC.value == "center") {
                    "center";
                } else {
                    if (positionC.value == "top") {
                        "flex-start";
                    } else {
                        "flex-end";
                    }
                    ;
                }
                );
                return styles;
            }
            );
            val modalClassesC = computed(fun(): Map<String, Any> {
                var classes = Map<String, Any>();
                classes.set("animation", props.aniDur > 0);
                classes.set("hover", showModal.value);
                classes.set("center", positionC.value == "center");
                classes.set("bottom", positionC.value == "bottom");
                classes.set("top", positionC.value == "top");
                return classes;
            }
            );
            val headerStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("margin", "0px 24px 8px");
                styles.set("transition-duration", "0ms");
                return styles;
            }
            );
            val contentStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("margin", "8px 24px 0px");
                styles.set("transition-duration", "0ms");
                return styles;
            }
            );
            val actionLeftStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("height", "" + actionHeight.value + "px");
                styles.set("background", bgColorC.value);
                styles.set("border-top", buttonBorderC.value);
                styles.set("border-right", buttonBorderC.value);
                styles.set("margin-top", "10px");
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val actionRightStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("height", "" + actionHeight.value + "px");
                styles.set("background", bgColorC.value);
                styles.set("border-top", buttonBorderC.value);
                styles.set("margin-top", "10px");
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val floatButtonStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("height", "" + actionHeight.value + "px");
                styles.set("padding", "0px 15px 7px");
                styles.set("flex-direction", "row");
                styles.set("align-items", "center");
                styles.set("background", bgColorC.value);
                return styles;
            }
            );
            val bodyStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("padding-bottom", "10px");
                styles.set("height", "auto");
                styles.set("max-height", "" + (maxHeight.value - actionHeight.value - headerHeight.value - 50) + "px");
                return styles;
            }
            );
            fun genOpenFn() {
                scrollTop.value = 0;
                showOverlay.value = true;
                emit("open");
                nextTick(fun(){
                    maxHeight.value = snu.platform.getWindowHeight() * 0.8;
                    nextTick(fun(){
                        headerHeight.value = headerEle.value?.getBoundingClientRect()?.height ?: 0;
                    }
                    );
                }
                );
            }
            val open = ::genOpenFn;
            fun genCloseFn() {
                showOverlay.value = false;
                showModal.value = false;
                emit("close");
            }
            val close = ::genCloseFn;
            fun genClickMaskFn() {
                if (!props.disabled) {
                    emit("clickMask");
                    if (props.maskClose == true) {
                        close();
                    }
                }
            }
            val clickMask = ::genClickMaskFn;
            fun genCancelFn() {
                if (!props.disabled) {
                    emit("cancel");
                    close();
                }
            }
            val cancel = ::genCancelFn;
            fun genConfirmFn() {
                if (!props.disabled) {
                    emit("confirm");
                    close();
                }
            }
            val confirm = ::genConfirmFn;
            __expose(utsMapOf("open" to open, "close" to close, "confirm" to confirm, "cancel" to cancel));
            watch(showOverlay, fun(v: Boolean){
                if (v) {
                    setTimeout(fun(){
                        showModal.value = true;
                    }
                    , 10);
                }
            }
            );
            onBackPress(fun(options: OnBackPressOptions): Boolean {
                if (showModal.value) {
                    if (!props.preventBack) {
                        close();
                    }
                    return true;
                } else {
                    return false;
                }
            }
            );
            return fun(): Any? {
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_sn_button = resolveEasyComponent("sn-button", GenUniModulesSinleUiComponentsSnButtonSnButtonClass);
                val _component_sn_overlay = resolveEasyComponent("sn-overlay", GenUniModulesSinleUiComponentsSnOverlaySnOverlayClass);
                return createVNode(_component_sn_overlay, utsMapOf("class" to "sn-modal-overlay", "aniDur" to unref(aniDurC), "opacity" to _ctx.maskOpacity, "show" to unref(showOverlay), "onClick" to clickMask, "style" to normalizeStyle(unref(overlayStylesC))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to normalizeClass(utsArrayOf(
                            "sn-modal",
                            unref(modalClassesC)
                        )), "style" to normalizeStyle(unref(modalStylesC))), utsArrayOf(
                            createElementVNode("view", utsMapOf("class" to "sn-modal-header", "ref_key" to "headerEle", "ref" to headerEle, "style" to normalizeStyle(unref(headerStylesC))), utsArrayOf(
                                renderSlot(_ctx.`$slots`, "header", UTSJSONObject(), fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("class" to "sn-modal-title", "text" to _ctx.title, "font" to _ctx.titleFont, "align" to _ctx.titleAlign, "color" to unref(titleColorC), "size" to unref(titleSizeC)), null, 8, utsArrayOf(
                                            "text",
                                            "font",
                                            "align",
                                            "color",
                                            "size"
                                        ))
                                    );
                                }
                                )
                            ), 4),
                            createElementVNode("scroll-view", utsMapOf("class" to "sn-modal-body", "show-scrollbar" to false, "bounces" to false, "scroll-top" to unref(scrollTop), "style" to normalizeStyle(unref(bodyStylesC))), utsArrayOf(
                                renderSlot(_ctx.`$slots`, "content", UTSJSONObject(), fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("text" to _ctx.content, "font" to _ctx.contentFont, "align" to _ctx.contentAlign, "color" to unref(contentColorC), "size" to unref(contentSizeC), "style" to normalizeStyle(unref(contentStylesC))), null, 8, utsArrayOf(
                                            "text",
                                            "font",
                                            "align",
                                            "color",
                                            "size",
                                            "style"
                                        ))
                                    );
                                }
                                )
                            ), 12, utsArrayOf(
                                "scroll-top"
                            )),
                            if (isTrue(unref(showActions))) {
                                renderSlot(_ctx.`$slots`, "actions", utsMapOf("key" to 0), fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        if (unref(buttonTypeC) == "embed") {
                                            createElementVNode("view", utsMapOf("key" to 0, "class" to "sn-modal-action-group"), utsArrayOf(
                                                if (isTrue(_ctx.showCancel)) {
                                                    createElementVNode("view", utsMapOf("key" to 0, "class" to "sn-modal-action", "onClick" to cancel, "style" to normalizeStyle(unref(actionLeftStylesC))), utsArrayOf(
                                                        createVNode(_component_sn_text, utsMapOf("font" to "misans-normal", "align" to "center", "text" to _ctx.cancelText, "size" to unref(cancelTextSizeC), "color" to if (_ctx.disabled) {
                                                            unref(colors).disabledText;
                                                        } else {
                                                            unref(cancelTextColorC);
                                                        }), null, 8, utsArrayOf(
                                                            "text",
                                                            "size",
                                                            "color"
                                                        ))
                                                    ), 4);
                                                } else {
                                                    createCommentVNode("v-if", true);
                                                },
                                                if (isTrue(_ctx.showConfirm)) {
                                                    createElementVNode("view", utsMapOf("key" to 1, "class" to "sn-modal-action", "onClick" to confirm, "style" to normalizeStyle(unref(actionRightStylesC))), utsArrayOf(
                                                        createVNode(_component_sn_text, utsMapOf("font" to "misans-semibold", "align" to "center", "text" to _ctx.confirmText, "size" to unref(confirmTextSizeC), "color" to if (_ctx.disabled) {
                                                            unref(colors).disabledText;
                                                        } else {
                                                            unref(confirmTextColorC);
                                                        }), null, 8, utsArrayOf(
                                                            "text",
                                                            "size",
                                                            "color"
                                                        ))
                                                    ), 4);
                                                } else {
                                                    createCommentVNode("v-if", true);
                                                }
                                            ));
                                        } else {
                                            if (unref(buttonTypeC) == "float") {
                                                createElementVNode("view", utsMapOf("key" to 1, "style" to normalizeStyle(utsArrayOf(
                                                    unref(floatButtonStylesC)
                                                ))), utsArrayOf(
                                                    createVNode(_component_sn_button, utsMapOf("type" to "primary", "level" to "second", "long" to "", "disabled" to _ctx.disabled, "text" to _ctx.cancelText, "textSize" to unref(cancelTextSizeC), "style" to normalizeStyle(utsMapOf("margin-right" to "10px")), "onClick" to cancel), null, 8, utsArrayOf(
                                                        "disabled",
                                                        "text",
                                                        "textSize",
                                                        "style"
                                                    )),
                                                    createVNode(_component_sn_button, utsMapOf("type" to "primary", "long" to "", "disabled" to _ctx.disabled, "text" to _ctx.confirmText, "textSize" to unref(confirmTextSizeC), "onClick" to confirm), null, 8, utsArrayOf(
                                                        "disabled",
                                                        "text",
                                                        "textSize"
                                                    ))
                                                ), 4);
                                            } else {
                                                createCommentVNode("v-if", true);
                                            };
                                        }
                                    );
                                });
                            } else {
                                createCommentVNode("v-if", true);
                            }
                        ), 6)
                    );
                }
                ), "_" to 3), 8, utsArrayOf(
                    "aniDur",
                    "opacity",
                    "show",
                    "style"
                ));
            }
            ;
        }
        ;
        var name = "sn-modal";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-modal" to utsMapOf("" to utsMapOf("maxWidth" to 300, "width" to "80%", "minHeight" to 20, "transitionProperty" to "transform,backgroundColor,opacity,borderRadius"), ".animation.center" to utsMapOf("transform" to "scale(0.9) translateY(0px)", "opacity" to 0), ".animation.center.hover" to utsMapOf("transform" to "scale(1) translateY(0px)", "opacity" to 1), ".animation.bottom" to utsMapOf("transform" to "translateY(100%) scale(0.1)", "opacity" to 0), ".animation.bottom.hover" to utsMapOf("transform" to "translateY(-10%) scale(1)", "opacity" to 1), ".animation.top" to utsMapOf("transform" to "translateY(-100%) scale(0.1)", "opacity" to 0), ".animation.top.hover" to utsMapOf("transform" to "translateY(20%) scale(1)", "opacity" to 1)), "sn-modal-overlay" to padStyleMapOf(utsMapOf("alignItems" to "center")), "sn-modal-action-group" to padStyleMapOf(utsMapOf("flexDirection" to "row", "alignItems" to "center", "flex" to 1)), "sn-modal-action" to utsMapOf(".sn-modal-action-group " to utsMapOf("flex" to 1, "justifyContent" to "center")), "@TRANSITION" to utsMapOf("sn-modal" to utsMapOf("property" to "transform,backgroundColor,opacity,borderRadius")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf("open" to null, "close" to null, "clickMask" to null, "confirm" to null, "cancel" to null);
        var props = normalizePropsOptions(utsMapOf("title" to utsMapOf("type" to "String", "default" to ""), "titleAlign" to utsMapOf("type" to "String", "default" to "center"), "titleSize" to utsMapOf("type" to "String", "default" to ""), "titleFont" to utsMapOf("type" to "String", "default" to "misans-semibold"), "titleColor" to utsMapOf("type" to "String", "default" to ""), "bgColor" to utsMapOf("type" to "String", "default" to ""), "content" to utsMapOf("type" to "String", "default" to ""), "contentAlign" to utsMapOf("type" to "String", "default" to "center"), "contentSize" to utsMapOf("type" to "String", "default" to ""), "contentColor" to utsMapOf("type" to "String", "default" to ""), "contentFont" to utsMapOf("type" to "String", "default" to "misans-normal"), "buttonType" to utsMapOf("type" to "String", "default" to "embed"), "buttonBorder" to utsMapOf("type" to "String", "default" to ""), "confirmText" to utsMapOf("type" to "String", "default" to "确定"), "confirmTextColor" to utsMapOf("type" to "String", "default" to ""), "confirmTextSize" to utsMapOf("type" to "String", "default" to ""), "showCancel" to utsMapOf("type" to "Boolean", "default" to true), "showConfirm" to utsMapOf("type" to "Boolean", "default" to true), "cancelText" to utsMapOf("type" to "String", "default" to "取消"), "cancelTextColor" to utsMapOf("type" to "String", "default" to ""), "cancelTextSize" to utsMapOf("type" to "String", "default" to ""), "position" to utsMapOf("type" to "String", "default" to "center"), "aniDur" to utsMapOf("type" to "Number", "default" to 350), "maskClose" to utsMapOf("type" to "Boolean", "default" to false), "disabled" to utsMapOf("type" to "Boolean", "default" to false), "preventBack" to utsMapOf("type" to "Boolean", "default" to false), "maskOpacity" to utsMapOf("type" to "Number", "default" to 0.4), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "title",
            "titleAlign",
            "titleSize",
            "titleFont",
            "titleColor",
            "bgColor",
            "content",
            "contentAlign",
            "contentSize",
            "contentColor",
            "contentFont",
            "buttonType",
            "buttonBorder",
            "confirmText",
            "confirmTextColor",
            "confirmTextSize",
            "showCancel",
            "showConfirm",
            "cancelText",
            "cancelTextColor",
            "cancelTextSize",
            "position",
            "aniDur",
            "maskClose",
            "disabled",
            "preventBack",
            "maskOpacity",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
