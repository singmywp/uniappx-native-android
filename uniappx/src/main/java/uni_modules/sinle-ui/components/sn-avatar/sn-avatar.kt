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
import io.dcloud.uniapp.extapi.previewImage as uni_previewImage;
open class GenUniModulesSinleUiComponentsSnAvatarSnAvatar : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var mode: String by `$props`;
    open var imageMode: String by `$props`;
    open var src: String by `$props`;
    open var text: String by `$props`;
    open var icon: String by `$props`;
    open var size: String by `$props`;
    open var textSize: String by `$props`;
    open var textColor: String by `$props`;
    open var iconSize: String by `$props`;
    open var iconColor: String by `$props`;
    open var bgColor: String by `$props`;
    open var shape: String by `$props`;
    open var borderRadius: String by `$props`;
    open var enablePreview: Boolean by `$props`;
    open var customStyle: Any by `$props`;
    open var customTextStyle: Any by `$props`;
    open var customIconStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnAvatarSnAvatar) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnAvatarSnAvatar;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            fun emit(event: String, vararg do_not_transform_spread: Any?) {
                __ins.emit(event, *do_not_transform_spread);
            }
            val props = __props;
            val failed = ref(false);
            val dbclickTimer = ref(null as Number?);
            val clickType = ref("click");
            val theme = computed(fun(): String {
                return `$snui`.configs.app.theme;
            }
            );
            val iconColorC = computed(fun(): String {
                var color = if (theme.value == "light") {
                    colors.value.infoDark;
                } else {
                    colors.value.dark as String;
                }
                ;
                return if (props.iconColor == "") {
                    color;
                } else {
                    props.iconColor;
                }
                ;
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
            val textColorC = computed(fun(): String {
                var color = if (theme.value == "light") {
                    colors.value.infoDark as String;
                } else {
                    colors.value.dark as String;
                }
                ;
                return if (props.textColor == "") {
                    color;
                } else {
                    props.textColor;
                }
                ;
            }
            );
            val borderRadiusC = computed(fun(): String {
                return if (props.borderRadius == "") {
                    `$snui`.configs.radius.xsmall;
                } else {
                    props.borderRadius;
                }
                ;
            }
            );
            val imageStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("width", props.size);
                styles.set("height", props.size);
                styles.set("border-radius", if (props.shape != "circle") {
                    borderRadiusC.value;
                } else {
                    `$snui`.configs.radius.circle;
                }
                );
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val placeholderStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("width", props.size);
                styles.set("height", props.size);
                styles.set("border-radius", if (props.shape != "circle") {
                    borderRadiusC.value;
                } else {
                    `$snui`.configs.radius.circle;
                }
                );
                styles.set("background", if (failed.value) {
                    colors.value.disabled as String;
                } else {
                    bgColorC.value;
                }
                );
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            fun genLoadOkFn(e: UniImageLoadEvent) {
                emit("load", e);
            }
            val loadOk = ::genLoadOkFn;
            fun genLoadFailFn(e: UniImageErrorEvent) {
                failed.value = true;
                emit("error", e);
            }
            val loadFail = ::genLoadFailFn;
            fun genOnClickFn(event: UniPointerEvent) {
                setTimeout(fun(){
                    if (props.enablePreview && !failed.value && props.mode == "image" && clickType.value == "click") {
                        uni_previewImage(PreviewImageOptions(urls = utsArrayOf(
                            props.src
                        )));
                    }
                }
                , 300);
                if (dbclickTimer.value == null) {
                    dbclickTimer.value = setTimeout(fun(){
                        dbclickTimer.value = null;
                    }, 300);
                    clickType.value = "click";
                } else {
                    clearTimeout(dbclickTimer.value!!);
                    dbclickTimer.value = null;
                    clickType.value = "dbclick";
                }
                var e = snPointerEvent(type = clickType.value, x = event.clientX, y = event.clientY);
                emit(if (clickType.value == "click") {
                    "click";
                } else {
                    "dbclick";
                }
                , e);
            }
            val onClick = ::genOnClickFn;
            fun genOnlongpressFn(e: UniEvent) {
                emit("longpress", e);
            }
            val onlongpress = ::genOnlongpressFn;
            return fun(): Any? {
                val _component_sn_icon = resolveEasyComponent("sn-icon", GenUniModulesSinleUiComponentsSnIconSnIconClass);
                return createElementVNode("view", utsMapOf("class" to "sn-avatar", "style" to normalizeStyle(utsArrayOf(
                    unref(imageStylesC)
                ))), utsArrayOf(
                    if (isTrue(_ctx.mode == "image" && !unref(failed))) {
                        createElementVNode("image", utsMapOf("key" to 0, "class" to "sn-avatar-image", "fade-show" to "", "mode" to _ctx.imageMode, "src" to _ctx.src, "onLoad" to loadOk, "onError" to loadFail, "onClick" to onClick, "onLongpress" to onlongpress, "style" to normalizeStyle(utsArrayOf(
                            unref(imageStylesC),
                            _ctx.customStyle
                        ))), null, 44, utsArrayOf(
                            "mode",
                            "src"
                        ));
                    } else {
                        createCommentVNode("v-if", true);
                    }
                    ,
                    if (isTrue(_ctx.mode != "image" || unref(failed))) {
                        createElementVNode("view", utsMapOf("key" to 1, "class" to "sn-avatar-placeholder", "style" to normalizeStyle(utsArrayOf(
                            unref(placeholderStylesC),
                            _ctx.customStyle
                        )), "onLongpress" to onlongpress, "onClick" to onClick), utsArrayOf(
                            if (_ctx.mode == "text") {
                                createElementVNode("text", utsMapOf("key" to 0, "class" to "sn-avatar-placeholder-text", "style" to normalizeStyle(utsArrayOf(
                                    utsMapOf("color" to unref(textColorC), "fontSize" to _ctx.textSize),
                                    _ctx.customTextStyle
                                ))), toDisplayString(_ctx.text.charAt(0)), 5);
                            } else {
                                if (isTrue(_ctx.mode == "icon" || unref(failed))) {
                                    createVNode(_component_sn_icon, utsMapOf("key" to 1, "class" to "sn-avatar-placeholder-icon", "color" to if (unref(failed)) {
                                        unref(colors).errorActive;
                                    } else {
                                        unref(iconColorC);
                                    }, "name" to if (unref(failed)) {
                                        "close-circle-fill";
                                    } else {
                                        _ctx.icon;
                                    }, "size" to _ctx.iconSize, "customStyle" to _ctx.customIconStyle), null, 8, utsArrayOf(
                                        "color",
                                        "name",
                                        "size",
                                        "customStyle"
                                    ));
                                } else {
                                    createCommentVNode("v-if", true);
                                };
                            }
                        ), 36);
                    } else {
                        createCommentVNode("v-if", true);
                    }
                ), 4);
            }
            ;
        }
        ;
        var name = "sn-avatar";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-avatar-placeholder" to padStyleMapOf(utsMapOf("display" to "flex", "flexDirection" to "column", "justifyContent" to "center")), "sn-avatar-placeholder-text" to padStyleMapOf(utsMapOf("textAlign" to "center")), "sn-avatar-placeholder-icon" to padStyleMapOf(utsMapOf("textAlign" to "center")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf("click" to null, "dbclick" to null, "load" to null, "error" to null, "longpress" to null);
        var props = normalizePropsOptions(utsMapOf("mode" to utsMapOf("type" to "String", "default" to "image"), "imageMode" to utsMapOf("type" to "String", "default" to "scaleToFill"), "src" to utsMapOf("type" to "String", "default" to ""), "text" to utsMapOf("type" to "String", "default" to ""), "icon" to utsMapOf("type" to "String", "default" to ""), "size" to utsMapOf("type" to "String", "default" to "40px"), "textSize" to utsMapOf("type" to "String", "default" to "25px"), "textColor" to utsMapOf("type" to "String", "default" to ""), "iconSize" to utsMapOf("type" to "String", "default" to "25px"), "iconColor" to utsMapOf("type" to "String", "default" to ""), "bgColor" to utsMapOf("type" to "String", "default" to ""), "shape" to utsMapOf("type" to "String", "default" to "square"), "borderRadius" to utsMapOf("type" to "String", "default" to ""), "enablePreview" to utsMapOf("type" to "Boolean", "default" to false), "customStyle" to utsMapOf("default" to UTSJSONObject()), "customTextStyle" to utsMapOf("default" to UTSJSONObject()), "customIconStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "mode",
            "imageMode",
            "src",
            "text",
            "icon",
            "size",
            "textSize",
            "textColor",
            "iconSize",
            "iconColor",
            "bgColor",
            "shape",
            "borderRadius",
            "enablePreview",
            "customStyle",
            "customTextStyle",
            "customIconStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
