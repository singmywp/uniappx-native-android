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
open class GenUniModulesSinleUiComponentsSnTooltipSnTooltip : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var width: String by `$props`;
    open var height: String by `$props`;
    open var borderRadius: String by `$props`;
    open var position: String by `$props`;
    open var padding: String by `$props`;
    open var bgColor: String by `$props`;
    open var boxShadow: String by `$props`;
    open var customStyle: Any by `$props`;
    open var customTooltipStyle: Any by `$props`;
    open var customTriggerStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnTooltipSnTooltip) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnTooltipSnTooltip;
            val _cache = __ins.renderCache;
            val snu = `$snui`.utils;
            val colors = `$snui`.colors;
            val props = __props;
            val tooltipNode = ref(UTSJSONObject());
            val triggerNode = ref(UTSJSONObject());
            val containEle = ref(null as UniElement?);
            val tooltipEle = ref(null as UniElement?);
            val show = ref(false);
            val bgColorC = computed(fun(): String {
                return if (props.bgColor == "") {
                    colors.value.info;
                } else {
                    props.bgColor;
                }
                ;
            }
            );
            val boxShadowC = computed(fun(): String {
                return if (props.boxShadow == "") {
                    "0px 2px 10px 0px " + colors.value.infoDark;
                } else {
                    props.boxShadow;
                }
                ;
            }
            );
            val widthC = computed(fun(): String {
                return if (props.width == "") {
                    "";
                } else {
                    props.width;
                }
                ;
            }
            );
            val heightC = computed(fun(): String {
                return if (props.height == "") {
                    "";
                } else {
                    props.height;
                }
                ;
            }
            );
            val showCustomWidth = computed(fun(): Boolean {
                return !snu.text.isEmpty(props.width);
            }
            );
            val showCustomHeight = computed(fun(): Boolean {
                return !snu.text.isEmpty(props.height);
            }
            );
            val positionStyle = computed(fun(): String {
                var styles = UTSJSONObject();
                val format = fun(n: Number): Number {
                    return Math.max(0, n);
                }
                ;
                if (triggerNode.value["height"] != null && triggerNode.value["width"] != null) {
                    var triggerHeight = triggerNode.value["height"] as Number;
                    var triggerWidth = triggerNode.value["width"] as Number;
                    var tooltipHeight = tooltipNode.value["height"] as Number;
                    var tooltipWidth = tooltipNode.value["width"] as Number;
                    var values = object : UTSJSONObject() {
                        var `bottom-top-start` = -format(triggerWidth - tooltipWidth)
                        var `bottom-top` = format((triggerWidth - tooltipWidth) / 10)
                        var `bottom-top-end` = format(triggerWidth - tooltipWidth)
                        var `left-x` = -format(triggerWidth - tooltipWidth) - tooltipWidth
                        var `right-x` = format(triggerWidth - tooltipWidth) + tooltipWidth
                    };
                    styles["top-start"] = "translateX(" + values["bottom-top-start"] as Number + "px) translateY(" + (-tooltipHeight - 5) + "px)";
                    styles["top"] = "translateX(" + values["bottom-top"] as Number + "px) translateY(" + (-tooltipHeight - 5) + "px)";
                    styles["top-end"] = "translateX(" + values["bottom-top-end"] as Number + "px) translateY(" + (-tooltipHeight - 5) + "px)";
                    styles["bottom-start"] = "translateX(" + values["bottom-top-start"] + "px) translateY(" + (triggerHeight + 5) + "px)";
                    styles["bottom"] = "translateX(" + values["bottom-top"] + "px) translateY(" + (triggerHeight + 5) + "px)";
                    styles["bottom-end"] = "translateX(" + values["bottom-top-end"] + "px) translateY(" + (triggerHeight + 5) + "px)";
                    styles["left-start"] = "translateX(" + values["left-x"] as Number + "px) translateY(" + (-tooltipHeight - 5) + "px)";
                    styles["left"] = "translateX(" + values["left-x"] + "px)  translateY(" + (triggerHeight - tooltipHeight) / 2 + "px)";
                    styles["left-end"] = "translateX(" + values["left-x"] + "px) translateY(" + triggerHeight + "px)";
                    styles["right-start"] = "translateX(" + values["right-x"] as Number + "px) translateY(" + (-tooltipHeight - 5) + "px)";
                    styles["right"] = "translateX(" + values["right-x"] + "px) translateY(" + (triggerHeight - tooltipHeight) / 2 + "px)";
                    styles["right-end"] = "translateX(" + values["right-x"] + "px) translateY(" + triggerHeight + "px)";
                }
                console.log(styles[props.position], " at uni_modules/sinle-ui/components/sn-tooltip/sn-tooltip.uvue:133");
                return if (styles[props.position] != null) {
                    styles[props.position];
                } else {
                    styles["top-start"] ?: "";
                }
                 as String;
            }
            );
            val tooltipStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("width", widthC.value);
                styles.set("height", heightC.value);
                styles.set("background", bgColorC.value);
                styles.set("border-radius", props.borderRadius);
                styles.set("padding", props.padding);
                styles.set("box-shadow", boxShadowC.value);
                styles.set("zIndex", `$snui`.configs.zIndex.floatButton);
                styles.set("transform", "scale(" + (if (show.value) {
                    1;
                } else {
                    "0.000001";
                }
                ) + ") " + positionStyle.value);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            fun genOnClickFn() {
                show.value = !show.value;
            }
            val onClick = ::genOnClickFn;
            onMounted(fun(){
                nextTick(fun(){
                    var obj = tooltipEle.value!!.getBoundingClientRect();
                    tooltipNode.value = object : UTSJSONObject() {
                        var width = obj.width
                        var height = obj.height
                        var top = obj.top
                        var left = obj.left
                        var right = obj.right
                        var bottom = obj.bottom
                    };
                    var children = snu.other.reArray(containEle.value!!.children as UTSArray<Any>) as UTSArray<UniElement>;
                    children.forEach(fun(e: UniElement){
                        var classList = snu.other.reArray(e.classList as UTSArray<Any>) as UTSArray<String>;
                        if (classList.includes("sn-tooltip-trigger")) {
                            var obj2 = e.getBoundingClientRect();
                            triggerNode.value = object : UTSJSONObject() {
                                var width = obj2.width
                                var height = obj2.height
                                var top = obj2.top
                                var left = obj2.left
                                var right = obj2.right
                                var bottom = obj2.bottom
                            };
                        }
                    }
                    );
                }
                );
            }
            );
            return fun(): Any? {
                return createElementVNode("view", utsMapOf("class" to "sn-tooltip-contain", "ref_key" to "containEle", "ref" to containEle, "style" to normalizeStyle(utsArrayOf(
                    _ctx.customStyle
                ))), utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "sn-tooltip-trigger", "onClick" to onClick, "style" to normalizeStyle(utsArrayOf(
                        _ctx.customTriggerStyle
                    ))), utsArrayOf(
                        renderSlot(_ctx.`$slots`, "trigger")
                    ), 4),
                    createElementVNode("view", utsMapOf("class" to "sn-tooltip", "ref_key" to "tooltipEle", "ref" to tooltipEle, "style" to normalizeStyle(utsArrayOf(
                        unref(tooltipStylesC),
                        _ctx.customTooltipStyle
                    ))), utsArrayOf(
                        renderSlot(_ctx.`$slots`, "default")
                    ), 4)
                ), 4);
            }
            ;
        }
        ;
        var name = "sn-tooltip";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-tooltip-contain" to padStyleMapOf(utsMapOf("overflow" to "visible", "justifyContent" to "center", "flexDirection" to "row")), "sn-tooltip" to utsMapOf(".sn-tooltip-contain " to utsMapOf("position" to "absolute", "transitionProperty" to "transform")), "@TRANSITION" to utsMapOf("sn-tooltip" to utsMapOf("property" to "transform")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf("width" to utsMapOf("type" to "String", "default" to ""), "height" to utsMapOf("type" to "String", "default" to ""), "borderRadius" to utsMapOf("type" to "String", "default" to "12px"), "position" to utsMapOf("type" to "String", "default" to "top-start"), "padding" to utsMapOf("type" to "String", "default" to "10px 10px"), "bgColor" to utsMapOf("type" to "String", "default" to ""), "boxShadow" to utsMapOf("type" to "String", "default" to ""), "customStyle" to utsMapOf("default" to UTSJSONObject()), "customTooltipStyle" to utsMapOf("default" to UTSJSONObject()), "customTriggerStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "width",
            "height",
            "borderRadius",
            "position",
            "padding",
            "bgColor",
            "boxShadow",
            "customStyle",
            "customTooltipStyle",
            "customTriggerStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
