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
import io.dcloud.uniapp.extapi.createSelectorQuery as uni_createSelectorQuery;
import io.dcloud.uniapp.extapi.getElementById as uni_getElementById;
import io.dcloud.uniapp.extapi.previewImage as uni_previewImage;
open class GenUniModulesSinleUiComponentsSnImageSnImage : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var width: String by `$props`;
    open var height: String by `$props`;
    open var src: String by `$props`;
    open var mode: String by `$props`;
    open var borderRadius: String by `$props`;
    open var loadingBgColor: String by `$props`;
    open var loadingSize: String by `$props`;
    open var lazyLoad: Boolean by `$props`;
    open var fadeShow: Boolean by `$props`;
    open var enablePreview: Boolean by `$props`;
    open var customStyle: Any by `$props`;
    open var customImageStyle: Any by `$props`;
    open var customLoadingStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnImageSnImage) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnImageSnImage;
            val _cache = __ins.renderCache;
            val snu = `$snui`.utils;
            val colors = `$snui`.colors;
            val instance = getCurrentInstance()!!;
            fun emit(event: String, vararg do_not_transform_spread: Any?) {
                __ins.emit(event, *do_not_transform_spread);
            }
            val props = __props;
            val id = randomId();
            val failed = ref(false);
            val loaded = ref(false);
            val width = ref("auto");
            val height = ref("auto");
            val imageDetail = ref(UniImageLoadEventDetail(width = 0, height = 0));
            val customWidth = computed(fun(): Boolean {
                return props.width != "auto" && props.width != "";
            }
            );
            val customHeight = computed(fun(): Boolean {
                return props.height != "auto" && props.height != "";
            }
            );
            val fullMode = computed(fun(): Boolean {
                return props.mode == "aspectFit" && props.height == "";
            }
            );
            val loadingBgColorC = computed(fun(): String {
                return if (props.loadingBgColor == "") {
                    colors.value.info;
                } else {
                    props.loadingBgColor;
                }
                ;
            }
            );
            val borderRadiusC = computed(fun(): String {
                return if (props.borderRadius == "") {
                    `$snui`.configs.radius.small;
                } else {
                    props.borderRadius;
                }
                ;
            }
            );
            val loadingIconColorC = computed(fun(): String {
                return if (props.loadingBgColor == "") {
                    colors.value.infoDark;
                } else {
                    props.loadingBgColor;
                }
                ;
            }
            );
            val stylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                if (fullMode.value) {
                    if (customWidth.value) {
                        styles.set("flex", if (width.value != props.width) {
                            "1";
                        } else {
                            "";
                        });
                        styles.set("width", width.value);
                        styles.set("height", height.value);
                    } else {
                        styles.set("flex", "1");
                    }
                } else {
                    styles.set("width", width.value);
                    styles.set("height", height.value);
                }
                styles.set("border-radius", borderRadiusC.value);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val imageStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("width", width.value);
                styles.set("height", height.value);
                styles.set("border-radius", borderRadiusC.value);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val loadingStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("background", loadingBgColorC.value);
                styles.set("width", props.loadingSize);
                styles.set("height", props.loadingSize);
                styles.set("border-radius", borderRadiusC.value);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            fun genOnErrorFn(event: UniImageErrorEvent) {
                emit("error", event);
                failed.value = true;
            }
            val onError = ::genOnErrorFn;
            fun genResizeFn() {
                var detail = imageDetail.value;
                if (detail.width != 0) {
                    uni_createSelectorQuery().select("#" + id).boundingClientRect().exec(fun(ret){
                        if (ret.length > 0) {
                            var node = ret[0] as NodeInfo;
                            width.value = "" + node.width!! + "px";
                            height.value = "" + node.width!! * (detail.height / detail.width) + "px";
                        }
                    }
                    );
                }
            }
            val resize = ::genResizeFn;
            fun genOnLoadFn(event: UniImageLoadEvent) {
                loaded.value = true;
                emit("load", event);
                if (fullMode.value) {
                    nextTick(fun(){
                        imageDetail.value = event.detail;
                        resize();
                        onResize(uni_getElementById(id), fun(){
                            resize();
                        }
                        );
                    }
                    );
                }
            }
            val onLoad1 = ::genOnLoadFn;
            fun genOnClickFn(event: snPointerEvent) {
                snu.other.debounce(fun(){
                    if (props.enablePreview && !failed.value) {
                        uni_previewImage(PreviewImageOptions(urls = utsArrayOf(
                            props.src
                        )));
                    }
                    emit("click", event);
                }
                , 300);
            }
            val onClick = ::genOnClickFn;
            fun genOnDbclickFn(event: snPointerEvent) {
                snu.other.debounce(fun(){
                    emit("dbclick", event);
                }
                , 300);
            }
            val onDbclick = ::genOnDbclickFn;
            onMounted(fun(){
                if (fullMode.value) {
                    if (customWidth.value) {
                        width.value = props.width;
                    }
                } else {
                    width.value = props.width;
                    height.value = props.height;
                }
            }
            );
            return fun(): Any? {
                val _component_sn_view = resolveEasyComponent("sn-view", GenUniModulesSinleUiComponentsSnViewSnViewClass);
                val _component_sn_icon = resolveEasyComponent("sn-icon", GenUniModulesSinleUiComponentsSnIconSnIconClass);
                return createElementVNode("view", utsMapOf("class" to "sn-image-contain", "style" to normalizeStyle(utsArrayOf(
                    unref(stylesC),
                    _ctx.customStyle
                ))), utsArrayOf(
                    withDirectives(createVNode(_component_sn_view, utsMapOf("class" to "sn-image", "id" to unref(id), "onClick" to onClick, "onDbclick" to onDbclick, "style" to normalizeStyle(utsArrayOf(
                        unref(stylesC),
                        _ctx.customStyle
                    ))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createElementVNode("image", utsMapOf("class" to "sn-image-image", "src" to _ctx.src, "mode" to _ctx.mode, "lazyLoad" to _ctx.lazyLoad, "fadeShow" to _ctx.fadeShow, "onError" to onError, "onLoad" to onLoad1, "style" to normalizeStyle(utsArrayOf(
                                unref(imageStylesC),
                                _ctx.customImageStyle
                            ))), null, 44, utsArrayOf(
                                "src",
                                "mode",
                                "lazyLoad",
                                "fadeShow"
                            ))
                        );
                    }
                    ), "_" to 1), 8, utsArrayOf(
                        "id",
                        "style"
                    )), utsArrayOf(
                        utsArrayOf(
                            vShow,
                            unref(loaded)
                        )
                    )),
                    if (isTrue(!unref(loaded))) {
                        createElementVNode("view", utsMapOf("key" to 0, "class" to "sn-image-unloaded", "style" to normalizeStyle(utsArrayOf(
                            unref(loadingStylesC),
                            _ctx.customLoadingStyle
                        ))), utsArrayOf(
                            createVNode(_component_sn_icon, utsMapOf("name" to "image-line", "color" to unref(loadingIconColorC)), null, 8, utsArrayOf(
                                "color"
                            ))
                        ), 4);
                    } else {
                        createCommentVNode("v-if", true);
                    }
                ), 4);
            }
            ;
        }
        ;
        var name = "sn-image";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-image" to padStyleMapOf(utsMapOf("width" to "auto", "height" to "auto")), "sn-image-image" to padStyleMapOf(utsMapOf("width" to "100%", "height" to "auto")), "sn-image-unloaded" to padStyleMapOf(utsMapOf("alignItems" to "center", "justifyContent" to "center")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf("click" to null, "dbclick" to null, "load" to null, "error" to null, "longpress" to null);
        var props = normalizePropsOptions(utsMapOf("width" to utsMapOf("type" to "String", "default" to ""), "height" to utsMapOf("type" to "String", "default" to ""), "src" to utsMapOf("type" to "String", "default" to ""), "mode" to utsMapOf("type" to "String", "default" to "aspectFit"), "borderRadius" to utsMapOf("type" to "String", "default" to ""), "loadingBgColor" to utsMapOf("type" to "String", "default" to ""), "loadingSize" to utsMapOf("type" to "String", "default" to "80px"), "lazyLoad" to utsMapOf("type" to "Boolean", "default" to false), "fadeShow" to utsMapOf("type" to "Boolean", "default" to true), "enablePreview" to utsMapOf("type" to "Boolean", "default" to false), "customStyle" to utsMapOf("default" to UTSJSONObject()), "customImageStyle" to utsMapOf("default" to UTSJSONObject()), "customLoadingStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "width",
            "height",
            "src",
            "mode",
            "borderRadius",
            "loadingBgColor",
            "loadingSize",
            "lazyLoad",
            "fadeShow",
            "enablePreview",
            "customStyle",
            "customImageStyle",
            "customLoadingStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
