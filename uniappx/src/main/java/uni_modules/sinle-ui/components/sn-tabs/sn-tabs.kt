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
open class GenUniModulesSinleUiComponentsSnTabsSnTabs : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var modelValue: Number by `$props`;
    open var scrollable: Boolean by `$props`;
    open var data: UTSArray<SnTab> by `$props`;
    open var width: String by `$props`;
    open var height: String by `$props`;
    open var bgColor: String by `$props`;
    open var textColor: String by `$props`;
    open var textSize: String by `$props`;
    open var disabledTextColor: String by `$props`;
    open var activeTextColor: String by `$props`;
    open var itemPadding: String by `$props`;
    open var lineColor: String by `$props`;
    open var lineWidth: String by `$props`;
    open var lineHeight: String by `$props`;
    open var customItemStyle: Any by `$props`;
    open var customTextStyle: Any by `$props`;
    open var customActiveItemStyle: Any by `$props`;
    open var customStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnTabsSnTabs) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnTabsSnTabs;
            val _cache = __ins.renderCache;
            val snu = `$snui`.utils;
            val colors = `$snui`.colors;
            fun emit(event: String, vararg do_not_transform_spread: Any?) {
                __ins.emit(event, *do_not_transform_spread);
            }
            val props = __props;
            val containEle = ref(null as UniElement?);
            val scrollEle = ref<UniElement?>(null);
            val leftEle = ref<UniElement?>(null);
            val rightEle = ref<UniElement?>(null);
            val itemsEle = ref<UTSArray<UniElement>?>(null);
            val lineLeft = ref(0);
            val lineWidth = ref(0);
            val totalWidth = ref(0);
            val scrollToViewId = ref("");
            val model = computed<Number>(WritableComputedOptions(get = fun(): Number {
                return props.modelValue;
            }
            , set = fun(value: Number){
                emit("update:modelValue", value);
            }
            ));
            val bgColorC = computed(fun(): String {
                return if (props.bgColor == "") {
                    colors.value.front;
                } else {
                    props.bgColor;
                }
                ;
            }
            );
            val textColorC = computed(fun(): String {
                return if (props.textColor == "") {
                    colors.value.title;
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
            val activeTextColorC = computed(fun(): String {
                return if (props.activeTextColor == "") {
                    colors.value.primary;
                } else {
                    props.activeTextColor;
                }
                ;
            }
            );
            val disabledTextColorC = computed(fun(): String {
                return if (props.disabledTextColor == "") {
                    colors.value.disabledText;
                } else {
                    props.disabledTextColor;
                }
                ;
            }
            );
            val lineColorC = computed(fun(): String {
                return if (props.lineColor == "") {
                    colors.value.primary;
                } else {
                    props.lineColor;
                }
                ;
            }
            );
            val containStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("width", props.width);
                styles.set("height", props.height);
                styles.set("background", bgColorC.value);
                styles.set("border-radius", `$snui`.configs.radius.normal);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val itemStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                var padding = snu.getPx((props.itemPadding as String).split(" ")[0] as String);
                if (!props.scrollable) {
                    styles.set("flex", "1");
                } else {
                    styles.set("padding-left", "" + padding + "px");
                    styles.set("padding-right", "" + padding + "px");
                }
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val lineStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("transform", "translateX(" + lineLeft.value + "px");
                styles.set("width", "" + lineWidth.value + "px");
                styles.set("height", props.lineHeight);
                styles.set("bottom", "" + snu.getPx(props.lineHeight) + "px");
                styles.set("background", lineColorC.value);
                styles.set("border-radius", `$snui`.configs.radius.circle);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            fun genResizeFn(id: String) {
                if (props.data.length == 0) {
                    return;
                }
                var tmpTotalWidth: Number = 0;
                var tmpLineLeft: Number = 0;
                var found = false;
                itemsEle.value!!.forEach(fun(ele: UniElement, _: Number){
                    var nodeWidth = ele.getBoundingClientRect().width;
                    tmpTotalWidth += nodeWidth;
                    if (id == ele.getAttribute("id")!!) {
                        found = true;
                    } else if (!found) {
                        tmpLineLeft += nodeWidth;
                    }
                }
                );
                totalWidth.value = tmpTotalWidth;
                var itemWidth = itemsEle.value!![model.value].getBoundingClientRect().width;
                var tmpLineWidth = if (props.lineWidth == "") {
                    itemWidth * 0.7;
                } else {
                    snu.getPx(props.lineWidth);
                }
                ;
                tmpLineLeft += (itemWidth - tmpLineWidth) / 2;
                lineWidth.value = tmpLineWidth;
                lineLeft.value = tmpLineLeft;
                var rect = (itemsEle.value!![model.value] as UniElement).getBoundingClientRect();
                var scrollRect = scrollEle.value!!.getBoundingClientRect()!!;
                var left = scrollRect.left - (leftEle.value?.getBoundingClientRect()?.width ?: 0);
                var right = scrollRect.right - (rightEle.value?.getBoundingClientRect()?.width ?: 0);
                var tmpScrollToViewId = "";
                if (left <= rect.left) {
                    var item = itemsEle.value!![Math.max(0, model.value - 2)] as UniElement;
                    tmpScrollToViewId = item.attributes.get("id") as String;
                } else if (right <= rect.right) {
                    var item = itemsEle.value!![Math.min(itemsEle.value!!.length - 1, model.value + 2)] as UniElement;
                    tmpScrollToViewId = item.attributes.get("id") as String;
                } else {
                    var item = itemsEle.value!![Math.max(0, model.value - 2)] as UniElement;
                    tmpScrollToViewId = item.attributes.get("id") as String;
                }
                scrollToViewId.value = tmpScrollToViewId;
            }
            val resize = ::genResizeFn;
            fun genOnClickFn(item: SnTab, index: Number) {
                if (item.disabled ?: false) {
                    return;
                }
                model.value = index;
                emit("change", index);
                resize(item.id);
                nextTick(fun(){
                    resize(item.id);
                }
                );
            }
            val onClick = ::genOnClickFn;
            watch(fun(): Number {
                return props.modelValue;
            }
            , fun(newVal: Number, oldVal: Number){
                if (newVal == model.value) {
                    return;
                }
                if (newVal >= props.data.length || newVal < 0 || ((props.data[newVal] as SnTab).disabled ?: false)) {
                    model.value = oldVal;
                }
                emit("change", newVal);
                resize(props.data[newVal].id);
            }
            );
            onMounted(fun(){
                fun update() {
                    if (props.data.length > 0) {
                        resize(props.data[Math.min(props.data.length - 1, Math.max(0, model.value))].id);
                    }
                }
                nextTick(fun(){
                    update();
                }
                );
                onResize(containEle.value!!, fun(){
                    update();
                }
                );
            }
            );
            return fun(): Any? {
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_sn_badge = resolveEasyComponent("sn-badge", GenUniModulesSinleUiComponentsSnBadgeSnBadgeClass);
                return createElementVNode("view", utsMapOf("class" to "sn-tabs", "ref_key" to "containEle", "ref" to containEle, "style" to normalizeStyle(utsArrayOf(
                    unref(containStylesC),
                    _ctx.customStyle
                ))), utsArrayOf(
                    createElementVNode("view", utsMapOf("ref_key" to "leftEle", "ref" to leftEle), utsArrayOf(
                        renderSlot(_ctx.`$slots`, "left")
                    ), 512),
                    createElementVNode("scroll-view", utsMapOf("class" to "sn-tabs-scroll", "ref_key" to "scrollEle", "ref" to scrollEle, "show-scrollbar" to false, "direction" to if (_ctx.scrollable) {
                        "horizontal";
                    } else {
                        "none";
                    }
                    , "scroll-into-view" to unref(scrollToViewId), "scroll-with-animation" to ""), utsArrayOf(
                        createElementVNode(Fragment, null, RenderHelpers.renderList((_ctx.data as UTSArray<SnTab>), fun(tab, index, _, _): VNode {
                            return createElementVNode("view", utsMapOf("class" to "sn-tabs-item", "ref_for" to true, "ref_key" to "itemsEle", "ref" to itemsEle, "key" to index, "id" to tab.id, "onClick" to fun(){
                                onClick(tab, index);
                            }
                            , "style" to normalizeStyle(if ((index == unref(model))) {
                                utsArrayOf(
                                    unref(itemStylesC),
                                    _ctx.customItemStyle
                                );
                            } else {
                                utsArrayOf(
                                    unref(itemStylesC),
                                    _ctx.customActiveItemStyle
                                );
                            }
                            )), utsArrayOf(
                                if (tab.badge == null) {
                                    createVNode(_component_sn_text, utsMapOf("key" to 0, "class" to "sn-tabs-item-text", "align" to "center", "text" to tab.text, "size" to unref(textSizeC), "color" to if (((tab.disabled ?: false) as Boolean)) {
                                        unref(disabledTextColorC);
                                    } else {
                                        if (index == unref(model)) {
                                            unref(activeTextColorC);
                                        } else {
                                            unref(textColorC);
                                        };
                                    }), null, 8, utsArrayOf(
                                        "text",
                                        "size",
                                        "color"
                                    ));
                                } else {
                                    createVNode(_component_sn_badge, utsMapOf("key" to 1, "offset" to "translate(2px, -7px)", "value" to (tab.badge!!.value ?: 0), "max" to (tab.badge!!.max ?: -1), "size" to (tab.badge!!.size ?: ""), "mode" to (tab.badge!!.mode ?: "number"), "text" to (tab.badge!!.text ?: ""), "showZero" to (tab.badge!!.showZero ?: false), "textColor" to (tab.badge!!.textColor ?: ""), "bgColor" to (tab.badge!!.bgColor ?: "")), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            createVNode(_component_sn_text, utsMapOf("class" to "sn-tabs-item-text", "align" to "center", "text" to tab.text, "size" to unref(textSizeC), "color" to if (((tab.disabled ?: false) as Boolean)) {
                                                unref(disabledTextColorC);
                                            } else {
                                                if (index == unref(model)) {
                                                    unref(activeTextColorC);
                                                } else {
                                                    unref(textColorC);
                                                }
                                                ;
                                            }
                                            , "style" to normalizeStyle(utsArrayOf(
                                                _ctx.customTextStyle
                                            ))), null, 8, utsArrayOf(
                                                "text",
                                                "size",
                                                "color",
                                                "style"
                                            ))
                                        );
                                    }
                                    ), "_" to 2), 1032, utsArrayOf(
                                        "value",
                                        "max",
                                        "size",
                                        "offset",
                                        "mode",
                                        "text",
                                        "showZero",
                                        "textColor",
                                        "bgColor"
                                    ));
                                }
                            ), 12, utsArrayOf(
                                "id",
                                "onClick"
                            ));
                        }
                        ), 128),
                        createElementVNode("view", utsMapOf("class" to "sn-tabs-line", "style" to normalizeStyle(unref(lineStylesC))), null, 4)
                    ), 8, utsArrayOf(
                        "direction",
                        "scroll-into-view"
                    )),
                    createElementVNode("view", utsMapOf("ref_key" to "rightEle", "ref" to rightEle), utsArrayOf(
                        renderSlot(_ctx.`$slots`, "right")
                    ), 512)
                ), 4);
            }
            ;
        }
        ;
        var name = "sn-tabs";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-tabs" to padStyleMapOf(utsMapOf("width" to "100%", "display" to "flex", "flexDirection" to "row", "alignItems" to "center")), "sn-tabs-scroll" to padStyleMapOf(utsMapOf("flex" to 1, "height" to "100%", "display" to "flex", "flexDirection" to "row", "flexWrap" to "nowrap", "justifyContent" to "flex-start", "alignItems" to "center", "position" to "relative")), "sn-tabs-item" to padStyleMapOf(utsMapOf("display" to "flex", "height" to "100%", "flexDirection" to "row", "flexWrap" to "nowrap", "justifyContent" to "center", "alignItems" to "center")), "sn-tabs-line" to padStyleMapOf(utsMapOf("position" to "absolute", "left" to 0)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf("change" to null, "update:modelValue" to null);
        var props = normalizePropsOptions(utsMapOf("modelValue" to utsMapOf("type" to "Number", "default" to 0), "scrollable" to utsMapOf("type" to "Boolean", "default" to false), "data" to utsMapOf("type" to "Array", "default" to utsArrayOf<SnTab>()), "width" to utsMapOf("type" to "String", "default" to "100%"), "height" to utsMapOf("type" to "String", "default" to "40px"), "bgColor" to utsMapOf("type" to "String", "default" to ""), "textColor" to utsMapOf("type" to "String", "default" to ""), "textSize" to utsMapOf("type" to "String", "default" to ""), "disabledTextColor" to utsMapOf("type" to "String", "default" to ""), "activeTextColor" to utsMapOf("type" to "String", "default" to ""), "itemPadding" to utsMapOf("type" to "String", "default" to "12px"), "lineColor" to utsMapOf("type" to "String", "default" to ""), "lineWidth" to utsMapOf("type" to "String", "default" to ""), "lineHeight" to utsMapOf("type" to "String", "default" to "2px"), "customItemStyle" to utsMapOf("default" to UTSJSONObject()), "customTextStyle" to utsMapOf("default" to UTSJSONObject()), "customActiveItemStyle" to utsMapOf("default" to UTSJSONObject()), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "modelValue",
            "scrollable",
            "data",
            "width",
            "height",
            "bgColor",
            "textColor",
            "textSize",
            "disabledTextColor",
            "activeTextColor",
            "itemPadding",
            "lineColor",
            "lineWidth",
            "lineHeight",
            "customItemStyle",
            "customTextStyle",
            "customActiveItemStyle",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
