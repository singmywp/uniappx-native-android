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
open class GenUniModulesSinleUiComponentsSnLoadingSnLoading : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var mode: String by `$props`;
    open var text: String by `$props`;
    open var icon: String by `$props`;
    open var iconColor: String by `$props`;
    open var iconSize: String by `$props`;
    open var textColor: String by `$props`;
    open var textSize: String by `$props`;
    open var vertical: Boolean by `$props`;
    open var customStyle: Any by `$props`;
    open var customLoadingStyle: Any by `$props`;
    open var customTextStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnLoadingSnLoading) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnLoadingSnLoading;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val props = __props;
            val width = ref(0);
            val height = ref(0);
            val loadingEle = ref(null as UniElement?);
            val timer = ref(0);
            val rotateCnt = ref(0);
            val modeC = computed(fun(): String {
                val modes = utsArrayOf(
                    "icon",
                    "draw"
                );
                return if (modes.includes(props.mode)) {
                    props.mode;
                } else {
                    "icon";
                }
                ;
            }
            );
            val iconColorC = computed(fun(): String {
                return if (props.iconColor == "") {
                    colors.value.primary;
                } else {
                    props.iconColor;
                }
                ;
            }
            );
            val textColorC = computed(fun(): String {
                return if (props.textColor == "") {
                    colors.value.primaryDark;
                } else {
                    props.textColor;
                }
                ;
            }
            );
            val textSizeC = computed(fun(): String {
                return if (props.textSize == "") {
                    `$snui`.configs.font.size(3);
                } else {
                    props.textSize;
                }
                ;
            }
            );
            val iconSizeC = computed(fun(): String {
                return if (props.iconSize == "") {
                    `$snui`.configs.font.size(5);
                } else {
                    props.iconSize;
                }
                ;
            }
            );
            val loadingViewStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("width", iconSizeC.value);
                styles.set("height", iconSizeC.value);
                return styles;
            }
            );
            val iconLoaderStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("width", iconSizeC.value);
                styles.set("height", iconSizeC.value);
                styles.set("padding", "0px");
                styles.set("transform", "rotate(" + rotateCnt.value * 360 + "deg)");
                styles.set("transition-duration", "1200ms");
                return styles;
            }
            );
            fun genIconLoaderRotateFn(initial: Number) {
                rotateCnt.value = initial + 1;
            }
            val iconLoaderRotate = ::genIconLoaderRotateFn;
            fun genStopDrawingFn() {
                clearInterval(timer.value);
                nextTick(fun(){
                    val ctx = loadingEle.value?.getDrawableContext();
                    ctx?.reset();
                }
                );
            }
            val stopDrawing = ::genStopDrawingFn;
            fun genStartDrawingFn() {
                stopDrawing();
                nextTick(fun(){
                    val el = loadingEle.value as UniElement;
                    val ctx = el.getDrawableContext();
                    val rect = el.getBoundingClientRect();
                    width.value = rect.width;
                    height.value = rect.height;
                    if (ctx == null) {
                        return;
                    }
                    useDrawLoading(ctx, width.value, iconColorC, timer);
                }
                );
            }
            val startDrawing = ::genStartDrawingFn;
            watch(modeC, fun(v: String, o: String){
                if (v == "draw") {
                    if (v == o) {
                        return;
                    }
                    startDrawing();
                } else {
                    stopDrawing();
                }
            }
            );
            fun genRunFn() {
                if (modeC.value == "draw") {
                    nextTick(fun(){
                        startDrawing();
                    });
                } else if (modeC.value == "icon") {
                    nextTick(fun(){
                        setTimeout(fun(){
                            iconLoaderRotate(0);
                        }
                        , 10);
                    }
                    );
                }
            }
            val run = ::genRunFn;
            onPageShow(fun(){
                run();
            }
            );
            onMounted(fun(){
                run();
            }
            );
            onPageHide(fun(){
                if (modeC.value == "draw") {
                    nextTick(fun(){
                        stopDrawing();
                    }
                    );
                }
            }
            );
            return fun(): Any? {
                val _component_sn_icon = resolveEasyComponent("sn-icon", GenUniModulesSinleUiComponentsSnIconSnIconClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                return createElementVNode("view", utsMapOf("class" to normalizeClass(utsArrayOf(
                    "sn-loading",
                    if (_ctx.vertical) {
                        "sn-loading-vertical";
                    } else {
                        "";
                    }
                )), "style" to normalizeStyle(utsArrayOf(
                    _ctx.customStyle
                ))), utsArrayOf(
                    if (unref(modeC) == "icon") {
                        createElementVNode("view", utsMapOf("key" to 0, "class" to "sn-loading-icon-loader", "onTransitionend" to fun(){
                            iconLoaderRotate(unref(rotateCnt));
                        }, "style" to normalizeStyle(utsArrayOf(
                            unref(iconLoaderStylesC),
                            _ctx.customLoadingStyle
                        ))), utsArrayOf(
                            createVNode(_component_sn_icon, utsMapOf("name" to _ctx.icon, "size" to unref(iconSizeC), "color" to unref(iconColorC)), null, 8, utsArrayOf(
                                "name",
                                "size",
                                "color"
                            ))
                        ), 44, utsArrayOf(
                            "onTransitionend"
                        ));
                    } else {
                        if (unref(modeC) == "draw") {
                            createElementVNode("view", utsMapOf("key" to 1, "class" to "sn-loading-view", "android-layer-type" to "hardware", "ref_key" to "loadingEle", "ref" to loadingEle, "style" to normalizeStyle(utsArrayOf(
                                unref(loadingViewStylesC),
                                _ctx.customLoadingStyle
                            ))), null, 4);
                        } else {
                            createCommentVNode("v-if", true);
                        }
                        ;
                    }
                    ,
                    if (isTrue(_ctx.`$slots`["default"] != null || _ctx.text !== "")) {
                        createVNode(_component_sn_text, utsMapOf("key" to 2, "class" to "sn-loading-text", "text" to _ctx.text, "size" to unref(textSizeC), "color" to unref(textColorC), "style" to normalizeStyle(utsArrayOf(
                            _ctx.customTextStyle
                        ))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                renderSlot(_ctx.`$slots`, "default")
                            );
                        }), "_" to 3), 8, utsArrayOf(
                            "text",
                            "size",
                            "color",
                            "style"
                        ));
                    } else {
                        createCommentVNode("v-if", true);
                    }
                ), 6);
            }
            ;
        }
        ;
        var name = "sn-loading";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-loading" to padStyleMapOf(utsMapOf("flexDirection" to "row", "alignItems" to "center")), "sn-loading-icon-loader" to padStyleMapOf(utsMapOf("alignItems" to "center", "justifyContent" to "center", "transformOrigin" to "center", "transitionProperty" to "transform", "transitionTimingFunction" to "linear")), "sn-loading-text" to utsMapOf("" to utsMapOf("marginLeft" to 8), ".sn-loading-vertical " to utsMapOf("marginTop" to 4, "marginRight" to 0, "marginBottom" to 0, "marginLeft" to 0)), "sn-loading-vertical" to padStyleMapOf(utsMapOf("flexDirection" to "column")), "@TRANSITION" to utsMapOf("sn-loading-icon-loader" to utsMapOf("property" to "transform", "timingFunction" to "linear")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf("mode" to utsMapOf("type" to "String", "default" to "icon"), "text" to utsMapOf("type" to "String", "default" to ""), "icon" to utsMapOf("type" to "String", "default" to "loader-4-line"), "iconColor" to utsMapOf("type" to "String", "default" to ""), "iconSize" to utsMapOf("type" to "String", "default" to ""), "textColor" to utsMapOf("type" to "String", "default" to ""), "textSize" to utsMapOf("type" to "String", "default" to ""), "vertical" to utsMapOf("type" to "Boolean", "default" to false), "customStyle" to utsMapOf("default" to UTSJSONObject()), "customLoadingStyle" to utsMapOf("default" to UTSJSONObject()), "customTextStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "mode",
            "text",
            "icon",
            "iconColor",
            "iconSize",
            "textColor",
            "textSize",
            "vertical",
            "customStyle",
            "customLoadingStyle",
            "customTextStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
