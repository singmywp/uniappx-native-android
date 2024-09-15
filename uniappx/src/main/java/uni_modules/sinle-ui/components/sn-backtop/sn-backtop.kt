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
import io.dcloud.uniapp.extapi.getElementById as uni_getElementById;
import io.dcloud.uniapp.extapi.pageScrollTo as uni_pageScrollTo;
open class GenUniModulesSinleUiComponentsSnBacktopSnBacktop : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var listenTo: String by `$props`;
    open var icon: String by `$props`;
    open var shape: String by `$props`;
    open var bgColor: String by `$props`;
    open var zIndex: Number by `$props`;
    open var aniDur: Number by `$props`;
    open var size: String by `$props`;
    open var top: Number by `$props`;
    open var right: Number by `$props`;
    open var bottom: Number by `$props`;
    open var iconSize: String by `$props`;
    open var iconColor: String by `$props`;
    open var type: String by `$props`;
    open var level: String by `$props`;
    open var disabled: Boolean by `$props`;
    open var customStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnBacktopSnBacktop) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnBacktopSnBacktop;
            val _cache = __ins.renderCache;
            val snu = `$snui`.utils;
            val colors = `$snui`.colors;
            val props = __props;
            val show = ref(false);
            val backtopEle = ref(null as UniElement?);
            val zIndexC = computed(fun(): Number {
                return if (props.zIndex == `$snui`.configs.zIndex.floatButton) {
                    `$snui`.configs.zIndex.floatButton;
                } else {
                    props.zIndex;
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
            val aniDurC = computed(fun(): Number {
                return if (props.aniDur == parseInt(`$snui`.configs.aniTime.normal)) {
                    parseInt(`$snui`.configs.aniTime.normal);
                } else {
                    props.aniDur;
                }
                ;
            }
            );
            val levelC = computed(fun(): String {
                var types = utsArrayOf(
                    "first",
                    "second",
                    "third",
                    "least"
                );
                return if (types.includes(props.level)) {
                    props.level;
                } else {
                    "first";
                }
                ;
            }
            );
            val typeC = computed(fun(): String {
                var types = utsArrayOf(
                    "info",
                    "warning",
                    "error",
                    "success",
                    "primary"
                );
                return if (types.includes(props.type)) {
                    props.type;
                } else {
                    "info";
                }
                ;
            }
            );
            val bgColorC = computed(fun(): String {
                if (!props.disabled) {
                    if (snu.text.isEmpty(props.bgColor)) {
                        if (typeC.value == "info" && levelC.value != "least") {
                            return colors.value.info;
                        }
                        when (levelC.value) {
                            "first" -> 
                                {
                                    return colors.value["" + typeC.value] as String;
                                    return colors.value["" + typeC.value] as String;
                                }
                            "second" -> 
                                {
                                    return colors.value["" + typeC.value + "Light"] as String;
                                    return colors.value["" + typeC.value] as String;
                                }
                            "third" -> 
                                {
                                    return colors.value.info;
                                    return colors.value["" + typeC.value] as String;
                                }
                            else -> 
                                return colors.value["" + typeC.value] as String;
                        }
                    } else {
                        return props.bgColor;
                    }
                } else {
                    return colors.value.disabled as String;
                }
            }
            );
            val iconColorC = computed(fun(): String {
                if (!props.disabled) {
                    if (snu.text.isEmpty(props.iconColor)) {
                        if (typeC.value == "info") {
                            return colors.value.infoText;
                        }
                        return if ((levelC.value == "first")) {
                            colors.value["" + typeC.value + "Text"] as String;
                        } else {
                            colors.value["" + typeC.value + "LightText"] as String;
                        };
                    } else {
                        return props.iconColor;
                    }
                } else {
                    return colors.value.disabledText;
                }
            }
            );
            val backTopStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("border-radius", if (props.shape == "square") {
                    `$snui`.configs.radius.small;
                } else {
                    `$snui`.configs.radius.circle;
                }
                );
                styles.set("background", bgColorC.value);
                styles.set("width", snu.addUnit(props.size));
                styles.set("height", snu.addUnit(props.size));
                styles.set("right", snu.addPx(props.right));
                styles.set("bottom", snu.addPx(props.bottom));
                styles.set("zIndex", zIndexC.value.toString());
                styles.set("transform", "scale(" + (if (show.value) {
                    1;
                } else {
                    0.001;
                }
                ) + ")");
                styles.set("transition-duration", "" + aniDurC.value + "ms");
                return styles;
            }
            );
            val parentEle = computed(fun(): UniElement? {
                return if (!snu.text.isEmpty(props.listenTo)) {
                    uni_getElementById(props.listenTo);
                } else {
                    null;
                }
                ;
            }
            );
            val parentScrollTop = computed(fun(): Number {
                return parentEle.value?.scrollTop ?: 0;
            }
            );
            watch(parentScrollTop, fun(v: Number){
                show.value = if (v >= props.top) {
                    true;
                } else {
                    false;
                }
                ;
            }
            );
            fun genOnClickFn() {
                if (!props.disabled) {
                    show.value = false;
                    if (parentEle.value == null) {
                        uni_pageScrollTo(PageScrollToOptions(scrollTop = 10, duration = aniDurC.value));
                    } else {
                        parentEle.value!!.scrollTo(0, 0);
                    }
                }
            }
            val onClick = ::genOnClickFn;
            onPageScroll(fun(options: OnPageScrollOptions){
                if (parentEle.value == null) {
                    var scrollTop = options.scrollTop;
                    show.value = if (scrollTop >= props.top) {
                        true;
                    } else {
                        false;
                    }
                    ;
                }
            }
            );
            return fun(): Any? {
                val _component_sn_icon = resolveEasyComponent("sn-icon", GenUniModulesSinleUiComponentsSnIconSnIconClass);
                return createElementVNode("view", utsMapOf("class" to "sn-backtop", "ref_key" to "backtopEle", "ref" to backtopEle, "onClick" to onClick, "style" to normalizeStyle(utsArrayOf(
                    unref(backTopStylesC),
                    _ctx.customStyle
                ))), utsArrayOf(
                    createVNode(_component_sn_icon, utsMapOf("name" to _ctx.icon, "size" to unref(iconSizeC), "color" to unref(iconColorC)), null, 8, utsArrayOf(
                        "name",
                        "size",
                        "color"
                    ))
                ), 4);
            }
            ;
        }
        ;
        var name = "sn-backtop";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-backtop" to padStyleMapOf(utsMapOf("position" to "fixed", "flexDirection" to "column", "alignItems" to "center", "justifyContent" to "center")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf("listenTo" to utsMapOf("type" to "String", "default" to ""), "icon" to utsMapOf("type" to "String", "default" to "skip-up-line"), "shape" to utsMapOf("type" to "String", "default" to "circle"), "bgColor" to utsMapOf("type" to "String", "default" to ""), "zIndex" to utsMapOf("type" to "Number", "default" to `$snui`.configs.zIndex.floatButton), "aniDur" to utsMapOf("type" to "Number", "default" to parseInt(`$snui`.configs.aniTime.normal)), "size" to utsMapOf("type" to "String", "default" to "50px"), "top" to utsMapOf("type" to "Number", "default" to 400), "right" to utsMapOf("type" to "Number", "default" to 30), "bottom" to utsMapOf("type" to "Number", "default" to 100), "iconSize" to utsMapOf("type" to "String", "default" to ""), "iconColor" to utsMapOf("type" to "String", "default" to ""), "type" to utsMapOf("type" to "String", "default" to "primary"), "level" to utsMapOf("type" to "String", "default" to "first"), "disabled" to utsMapOf("type" to "Boolean", "default" to false), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "listenTo",
            "icon",
            "shape",
            "bgColor",
            "zIndex",
            "aniDur",
            "size",
            "top",
            "right",
            "bottom",
            "iconSize",
            "iconColor",
            "type",
            "level",
            "disabled",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
