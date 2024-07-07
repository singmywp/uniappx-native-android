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
open class GenUniModulesSinleUiComponentsSnSelectSnSelect : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var modelValue: Number by `$props`;
    open var data: UTSArray<Any?> by `$props`;
    open var width: String by `$props`;
    open var bgColor: String by `$props`;
    open var activeBgColor: String by `$props`;
    open var popBgColor: String by `$props`;
    open var popActiveBgColor: String by `$props`;
    open var textSize: String by `$props`;
    open var textColor: String by `$props`;
    open var popTextSize: String by `$props`;
    open var popActiveTextColor: String by `$props`;
    open var popTextColor: String by `$props`;
    open var borderRadius: String by `$props`;
    open var maxHeight: String by `$props`;
    open var disabled: Boolean by `$props`;
    open var customPopStyle: Any by `$props`;
    open var customPopTextStyle: Any by `$props`;
    open var customTextStyle: Any by `$props`;
    open var customStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnSelectSnSelect) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnSelectSnSelect;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val snu = `$snui`.utils;
            fun emit(event: String, vararg do_not_transform_spread: Any?) {
                __ins.emit(event, *do_not_transform_spread);
            }
            val props = __props;
            val isHover = ref(false);
            val showOverlay = ref(false);
            val showPop = ref(false);
            val selectEle = ref(null as UniElement?);
            val popEle = ref(null as UniElement?);
            val nodeInfo = ref(object : UTSJSONObject() {
                var top: Number = 0
                var left: Number = 0
            });
            val listviewMode = ref(false);
            val contentHeight = ref(0);
            val model = computed<Number>(WritableComputedOptions(get = fun(): Number {
                return props.modelValue;
            }
            , set = fun(value: Number){
                emit("update:modelValue", value);
            }
            ));
            val theme = computed(fun(): String {
                return `$snui`.configs.app.theme;
            }
            );
            val dataC = computed(fun(): UTSArray<UTSJSONObject> {
                return props.data as UTSArray<UTSJSONObject>;
            }
            );
            val selectedData = computed(fun(): UTSJSONObject {
                var data = if (dataC.value.length > 0) {
                    dataC.value[model.value];
                } else {
                    UTSJSONObject();
                }
                ;
                return object : UTSJSONObject() {
                    var id = data["id"] ?: ""
                    var text = data["text"] ?: ""
                };
            }
            );
            val activeBgColorC = computed(fun(): String {
                return if (props.activeBgColor == "") {
                    colors.value.infoActive;
                } else {
                    props.activeBgColor;
                }
                ;
            }
            );
            val popBgColorC = computed(fun(): String {
                return if (props.popBgColor == "") {
                    colors.value[if (theme.value == "light") {
                        "front";
                    } else {
                        "info";
                    }] as String;
                } else {
                    props.popBgColor;
                }
                ;
            }
            );
            val popActiveBgColorC = computed(fun(): String {
                return if (props.popActiveBgColor == "") {
                    colors.value[if (theme.value == "light") {
                        "info";
                    } else {
                        "infoActive";
                    }] as String;
                } else {
                    props.popActiveBgColor;
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
            val textColorC = computed(fun(): String {
                var textColor = if (props.textColor == "") {
                    colors.value.text;
                } else {
                    props.textColor;
                }
                ;
                return if (props.disabled) {
                    colors.value.disabledText;
                } else {
                    textColor;
                }
                ;
            }
            );
            val popTextSizeC = computed(fun(): String {
                return if (props.popTextSize == "") {
                    `$snui`.configs.font.size(2);
                } else {
                    props.popTextSize;
                }
                ;
            }
            );
            val popActiveTextColorC = computed(fun(): String {
                return if (props.popActiveTextColor == "") {
                    colors.value.primaryDark;
                } else {
                    props.popActiveTextColor;
                }
                ;
            }
            );
            val popTextColorC = computed(fun(): String {
                return if (props.popTextColor == "") {
                    colors.value.text;
                } else {
                    props.popTextColor;
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
            val bgColorC = computed(fun(): String {
                var bgColor = if (props.bgColor == "") {
                    colors.value.front;
                } else {
                    props.bgColor;
                }
                ;
                return if (props.disabled) {
                    colors.value.disabled;
                } else {
                    if (isHover.value) {
                        props.activeBgColor;
                    } else {
                        bgColor;
                    }
                    ;
                }
                ;
            }
            );
            val selectStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("width", props.width);
                styles.set("background", if (isHover.value) {
                    activeBgColorC.value;
                } else {
                    bgColorC.value;
                }
                );
                styles.set("border-radius", borderRadiusC.value);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val iconStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("transform", "rotate(" + (if (showOverlay.value) {
                    180;
                } else {
                    0;
                }
                ) + "deg)");
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val popStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("background", popBgColorC.value);
                styles.set("border-radius", borderRadiusC.value);
                styles.set("width", props.width);
                styles.set("top", "" + (nodeInfo.value["top"] ?: 0) + "px");
                styles.set("left", "" + (nodeInfo.value["left"] ?: 0) + "px");
                styles.set("maxHeight", props.maxHeight);
                styles.set("zIndex", `$snui`.configs.zIndex.popup);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            fun genSetshowOverlayFn(status: Boolean) {
                if (!props.disabled) {
                    if (status == true && selectEle.value != null) {
                        var info = selectEle.value!!.getBoundingClientRect();
                        nodeInfo.value = object : UTSJSONObject() {
                            var top = info.top + info.height + 5
                            var left = info.left
                        };
                    }
                    showOverlay.value = status;
                    if (status == true && popEle.value != null) {
                        nextTick(fun(){
                            var height = popEle.value!!.getBoundingClientRect().height;
                            if (height != 0) {
                                contentHeight.value = height;
                            }
                            listviewMode.value = if (contentHeight.value == snu.getPx(props.maxHeight)) {
                                true;
                            } else {
                                false;
                            }
                            ;
                        }
                        );
                    }
                }
            }
            val setshowOverlay = ::genSetshowOverlayFn;
            fun genClickItemFn(index: Number, event: Any) {
                model.value = index;
                emit("change", object : UTSJSONObject() {
                    var id = (props.data as UTSArray<UTSJSONObject>)[index]["id"]
                    var event = event
                });
                setshowOverlay(false);
            }
            val clickItem = ::genClickItemFn;
            val bindTimer = ref(0);
            watch(showOverlay, fun(value: Boolean){
                clearTimeout(bindTimer.value);
                if (value) {
                    nextTick(fun(){
                        bindTimer.value = setTimeout(fun(){
                            showPop.value = true;
                        }, 1);
                    });
                } else {
                    showPop.value = false;
                    bindTimer.value = setTimeout(fun(){
                        showOverlay.value = false;
                    }
                    , parseInt(`$snui`.configs.aniTime.long));
                }
            }
            );
            return fun(): Any? {
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_sn_icon = resolveEasyComponent("sn-icon", GenUniModulesSinleUiComponentsSnIconSnIconClass);
                val _component_sn_menu_item = resolveEasyComponent("sn-menu-item", GenUniModulesSinleUiComponentsSnMenuItemSnMenuItemClass);
                val _component_sn_overlay = resolveEasyComponent("sn-overlay", GenUniModulesSinleUiComponentsSnOverlaySnOverlayClass);
                return createElementVNode(Fragment, null, utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "sn-select", "ref_key" to "selectEle", "ref" to selectEle, "onTouchstart" to fun(){
                        isHover.value = true;
                    }
                    , "onClick" to fun(){
                        setshowOverlay(!unref(showOverlay));
                    }
                    , "onTouchend" to fun(){
                        isHover.value = false;
                    }
                    , "onTouchcancel" to fun(){
                        isHover.value = false;
                    }
                    , "style" to normalizeStyle(utsArrayOf(
                        unref(selectStylesC),
                        _ctx.customStyle
                    ))), utsArrayOf(
                        createVNode(_component_sn_text, utsMapOf("class" to "sn-select-text", "text" to unref(selectedData)["text"], "size" to unref(textSizeC), "color" to unref(textColorC), "customStyle" to _ctx.customTextStyle), null, 8, utsArrayOf(
                            "text",
                            "size",
                            "color",
                            "customStyle"
                        )),
                        createVNode(_component_sn_icon, utsMapOf("name" to "arrow-down-s-line", "size" to unref(textSizeC), "color" to unref(textColorC), "style" to normalizeStyle(unref(iconStylesC))), null, 8, utsArrayOf(
                            "size",
                            "color",
                            "style"
                        ))
                    ), 44, utsArrayOf(
                        "onTouchstart",
                        "onClick",
                        "onTouchend",
                        "onTouchcancel"
                    )),
                    createVNode(_component_sn_overlay, utsMapOf("show" to unref(showOverlay), "opacity" to 0, "aniDur" to parseInt(unref(`$snui`).configs.aniTime.long), "onClick" to fun(){
                        setshowOverlay(false);
                    }
                    ), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createElementVNode("view", utsMapOf("class" to normalizeClass(utsArrayOf(
                                "sn-select-popup",
                                utsMapOf("sn-select-popup__show" to unref(showPop))
                            )), "ref_key" to "popEle", "ref" to popEle, "style" to normalizeStyle(utsArrayOf(
                                unref(popStylesC),
                                _ctx.customPopStyle
                            )), "onClick" to withModifiers(fun(){}, utsArrayOf(
                                "stop"
                            ))), utsArrayOf(
                                if (isTrue(unref(listviewMode))) {
                                    createElementVNode("list-view", utsMapOf("key" to 0, "class" to "sn-select-popup-listview", "direction" to "vertical", "show-scrollbar" to false), utsArrayOf(
                                        createElementVNode(Fragment, null, RenderHelpers.renderList(unref(dataC), fun(e, index, _, _): VNode {
                                            return createVNode(_component_sn_menu_item, utsMapOf("listMode" to "", "key" to index, "bgColor" to unref(popBgColorC), "activeBgColor" to unref(popActiveBgColorC), "text" to e["text"], "textSize" to _ctx.popTextSize, "textColor" to if (index == unref(model)) {
                                                unref(popActiveTextColorC);
                                            } else {
                                                unref(popTextColorC);
                                            }, "textAlign" to "center", "customTextStyle" to _ctx.customPopTextStyle, "customStyle" to object : UTSJSONObject() {
                                                var width = _ctx.width
                                            }, "onClick" to fun(`$event`: Any){
                                                clickItem(index, `$event`);
                                            }), null, 8, utsArrayOf(
                                                "bgColor",
                                                "activeBgColor",
                                                "text",
                                                "textSize",
                                                "textColor",
                                                "customTextStyle",
                                                "customStyle",
                                                "onClick"
                                            ));
                                        }), 128)
                                    ));
                                } else {
                                    createCommentVNode("v-if", true);
                                }
                                ,
                                if (isTrue(!unref(listviewMode))) {
                                    createElementVNode(Fragment, utsMapOf("key" to 1), RenderHelpers.renderList(unref(dataC), fun(e, index, _, _): VNode {
                                        return createVNode(_component_sn_menu_item, utsMapOf("textAlign" to "center", "bgColor" to unref(popBgColorC), "activeBgColor" to unref(popActiveBgColorC), "key" to index, "text" to e["text"], "textSize" to unref(popTextSizeC), "textColor" to if (index == unref(model)) {
                                            unref(popActiveTextColorC);
                                        } else {
                                            unref(popTextColorC);
                                        }, "onClick" to fun(`$event`: Any){
                                            clickItem(index, `$event`);
                                        }, "customTextStyle" to _ctx.customPopTextStyle, "customStyle" to object : UTSJSONObject() {
                                            var width = _ctx.width
                                        }), null, 8, utsArrayOf(
                                            "bgColor",
                                            "activeBgColor",
                                            "text",
                                            "textSize",
                                            "textColor",
                                            "onClick",
                                            "customTextStyle",
                                            "customStyle"
                                        ));
                                    }), 128);
                                } else {
                                    createCommentVNode("v-if", true);
                                }
                            ), 14, utsArrayOf(
                                "onClick"
                            ))
                        );
                    }
                    ), "_" to 1), 8, utsArrayOf(
                        "show",
                        "aniDur",
                        "onClick"
                    ))
                ), 64);
            }
            ;
        }
        ;
        var name = "sn-select";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-select" to padStyleMapOf(utsMapOf("display" to "flex", "flexDirection" to "row", "alignItems" to "center", "minWidth" to 100, "paddingTop" to 10, "paddingRight" to 12, "paddingBottom" to 10, "paddingLeft" to 12)), "sn-select-text" to padStyleMapOf(utsMapOf("flex" to 1)), "sn-select-popup" to padStyleMapOf(utsMapOf("position" to "absolute", "justifyContent" to "center", "alignItems" to "center", "boxShadow" to "0px 2px 15px -1px rgba(0, 0, 0, 0.2)", "transform" to "translate(-10px, -30px) scale(0.8)", "opacity" to 0, "transitionProperty" to "transform,backgroundColor,opacity")), "sn-select-popup-listview" to padStyleMapOf(utsMapOf("flex" to 1, "paddingTop" to 0, "paddingRight" to 0, "paddingBottom" to 0, "paddingLeft" to 0)), "sn-select-popup__show" to padStyleMapOf(utsMapOf("transform" to "translate(0px, 0px) scale(1)", "opacity" to 1)), "@TRANSITION" to utsMapOf("sn-select-popup" to utsMapOf("property" to "transform,backgroundColor,opacity")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf("change" to null, "update:modelValue" to null);
        var props = normalizePropsOptions(utsMapOf("modelValue" to utsMapOf("type" to "Number", "default" to 0), "data" to utsMapOf("type" to "Array", "default" to utsArrayOf<UTSJSONObject>()), "width" to utsMapOf("type" to "String", "default" to "100px"), "bgColor" to utsMapOf("type" to "String", "default" to ""), "activeBgColor" to utsMapOf("type" to "String", "default" to ""), "popBgColor" to utsMapOf("type" to "String", "default" to ""), "popActiveBgColor" to utsMapOf("type" to "String", "default" to ""), "textSize" to utsMapOf("type" to "String", "default" to ""), "textColor" to utsMapOf("type" to "String", "default" to ""), "popTextSize" to utsMapOf("type" to "String", "default" to ""), "popActiveTextColor" to utsMapOf("type" to "String", "default" to ""), "popTextColor" to utsMapOf("type" to "String", "default" to ""), "borderRadius" to utsMapOf("type" to "String", "default" to ""), "maxHeight" to utsMapOf("type" to "String", "default" to "500px"), "disabled" to utsMapOf("type" to "Boolean", "default" to false), "customPopStyle" to utsMapOf("default" to UTSJSONObject()), "customPopTextStyle" to utsMapOf("default" to UTSJSONObject()), "customTextStyle" to utsMapOf("default" to UTSJSONObject()), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "modelValue",
            "data",
            "width",
            "bgColor",
            "activeBgColor",
            "popBgColor",
            "popActiveBgColor",
            "textSize",
            "textColor",
            "popTextSize",
            "popActiveTextColor",
            "popTextColor",
            "borderRadius",
            "maxHeight",
            "disabled",
            "customPopStyle",
            "customPopTextStyle",
            "customTextStyle",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
