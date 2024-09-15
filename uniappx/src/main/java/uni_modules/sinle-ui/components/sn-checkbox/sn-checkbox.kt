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
open class GenUniModulesSinleUiComponentsSnCheckboxSnCheckbox : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var text: String by `$props`;
    open var icon: String by `$props`;
    open var disabled: Boolean by `$props`;
    open var customContainStyle: Any by `$props`;
    open var customStyle: Any by `$props`;
    open var updateValue: (v: Boolean) -> Unit
        get() {
            return unref(this.`$exposed`["updateValue"]) as (v: Boolean) -> Unit;
        }
        set(value) {
            setRefValue(this.`$exposed`, "updateValue", value);
        }
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnCheckboxSnCheckbox, _arg1: SetupContext) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props, ref1): Any? {
            var __expose = ref1.expose;
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnCheckboxSnCheckbox;
            val _cache = __ins.renderCache;
            val snu = `$snui`.utils;
            val colors = `$snui`.colors;
            val instance = getCurrentInstance()!!;
            val props = __props;
            val spacing = inject("spacing", "15px");
            val boxSize = inject("boxSize", "" + (`$snui`.utils.getPx(`$snui`.configs.font.size(3)) + 6) + "px");
            val boxBorderRadius = inject("boxBorderRadius", "5px");
            val boxBorderWidth = inject("boxBorderWidth", "2px");
            val boxTextSize = inject("boxTextSize", `$snui`.configs.font.size(3));
            val boxTextColor = inject("boxTextColor", "#000");
            val disabledBoxTextColor = inject("disabledBoxTextColor", colors.value.disabledText);
            val boxIcon = inject("boxIcon", "check-fill");
            val boxIconSize = inject("boxIconSize", `$snui`.configs.font.size(3));
            val boxIconColor = inject("boxIconColor", "#fff");
            val disabledBoxIconColor = inject("disabledBoxIconColor", "#fff");
            val boxBorderColor = inject("boxBorderColor", colors.value.line);
            val disabledBoxBorderColor = inject("disabledBoxBorderColor", colors.value.disabled);
            val boxActiveBorderColor = inject("boxActiveBorderColor", colors.value.primary);
            val disabledBoxActiveBorderColor = inject("disabledBoxActiveBorderColor", colors.value.disabledText);
            val boxBgColor = inject("boxBgColor", "transparent");
            val disabledBoxBgColor = inject("disabledBoxBgColor", colors.value.disabled);
            val boxActiveBgColor = inject("boxActiveBgColor", colors.value.primary);
            val disabledBoxActiveBgColor = inject("disabledBoxActiveBgColor", colors.value.disabledText);
            val customBoxContainStyle = inject("customBoxContainStyle", UTSJSONObject());
            val customBoxStyle = inject("customBoxStyle", UTSJSONObject());
            val customBoxIconStyle = inject("customBoxIconStyle", UTSJSONObject());
            val customTextStyle = inject("customTextStyle", UTSJSONObject());
            val checked = ref(false);
            val checkboxEle = ref(null as UniElement?);
            val group = computed(fun(): ComponentPublicInstance {
                return instance.proxy!!.`$parent` as ComponentPublicInstance;
            }
            );
            val containStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("marginRight", spacing!!);
                styles.set("marginBottom", spacing!!);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val checkboxStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("width", boxSize!!);
                styles.set("height", boxSize!!);
                styles.set("border-radius", boxBorderRadius!!);
                styles.set("border", "" + parseInt(boxBorderWidth as String) + "px solid " + (if (props.disabled) {
                    if (checked.value) {
                        disabledBoxActiveBorderColor;
                    } else {
                        disabledBoxBorderColor;
                    };
                } else {
                    if (checked.value) {
                        boxActiveBorderColor;
                    } else {
                        boxBorderColor;
                    }
                    ;
                }
                ));
                styles.set("background", if (props.disabled) {
                    if (checked.value) {
                        disabledBoxActiveBgColor;
                    } else {
                        disabledBoxBgColor;
                    };
                } else {
                    if (checked.value) {
                        boxActiveBgColor;
                    } else {
                        boxBgColor;
                    }
                    ;
                }
                !!);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val isHover = ref(false);
            val originTransform = ref("");
            watch(isHover, fun(nv: Boolean){
                if (checkboxEle.value != null) {
                    if (snu.text.isEmpty(originTransform.value)) {
                        originTransform.value = "scale(1)";
                    }
                    (checkboxEle.value as UniElement).style.setProperty("transform", if (nv) {
                        "" + originTransform.value.replace(UTSRegExp("scale\\((\\d+(\\.\\d+)?)\\)", "g"), "scale(0.9)");
                    } else {
                        originTransform.value;
                    }
                    );
                }
            }
            );
            fun genUpdateValueFn(v: Boolean) {
                checked.value = v;
            }
            val updateValue = ::genUpdateValueFn;
            fun genCheckboxClickedFn() {
                if (!props.disabled) {
                    group.value.`$callMethod`("syncData", instance.proxy!! as ComponentPublicInstance, !checked.value);
                }
            }
            val checkboxClicked = ::genCheckboxClickedFn;
            __expose(utsMapOf("updateValue" to updateValue));
            onMounted(fun(){
                nextTick(fun(){
                    group.value.`$callMethod`("register", instance.proxy!! as ComponentPublicInstance);
                }
                );
            }
            );
            val showText = computed(fun(): Boolean {
                return !snu.text.isEmpty(props.text as String);
            }
            );
            val iconC = computed(fun(): String {
                return if (snu.text.isEmpty(props.icon as String)) {
                    boxIcon as String;
                } else {
                    props.icon as String;
                }
                ;
            }
            );
            return fun(): Any? {
                val _component_sn_icon = resolveEasyComponent("sn-icon", GenUniModulesSinleUiComponentsSnIconSnIconClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                return createElementVNode("view", utsMapOf("class" to "sn-checkbox-contain", "onTouchstart" to fun(){
                    isHover.value = true;
                }
                , "onTouchend" to fun(){
                    isHover.value = false;
                }
                , "onTouchcancel" to fun(){
                    isHover.value = false;
                }
                , "onClick" to checkboxClicked, "style" to normalizeStyle(utsArrayOf(
                    unref(containStylesC),
                    unref(customBoxContainStyle),
                    _ctx.customContainStyle
                ))), utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "sn-checkbox", "ref_key" to "checkboxEle", "ref" to checkboxEle, "style" to normalizeStyle(utsArrayOf(
                        unref(checkboxStylesC),
                        unref(customBoxStyle),
                        _ctx.customStyle
                    ))), utsArrayOf(
                        createVNode(_component_sn_icon, utsMapOf("class" to normalizeClass(utsArrayOf(
                            "sn-checkbox-icon",
                            if (unref(checked)) {
                                "sn-checkbox-icon__active";
                            } else {
                                "";
                            }
                        )), "name" to unref(iconC), "color" to if (_ctx.disabled) {
                            unref(disabledBoxIconColor);
                        } else {
                            unref(boxIconColor);
                        }
                        , "size" to unref(boxIconSize), "style" to normalizeStyle(utsArrayOf(
                            unref(customBoxIconStyle)
                        ))), null, 8, utsArrayOf(
                            "class",
                            "name",
                            "color",
                            "size",
                            "style"
                        ))
                    ), 4),
                    renderSlot(_ctx.`$slots`, "default", UTSJSONObject(), fun(): UTSArray<Any> {
                        return utsArrayOf(
                            if (isTrue(unref(showText))) {
                                createVNode(_component_sn_text, utsMapOf("key" to 0, "class" to "sn-checkbox-text", "text" to _ctx.text, "color" to if (_ctx.disabled) {
                                    unref(disabledBoxTextColor);
                                } else {
                                    unref(boxTextColor);
                                }, "size" to unref(boxTextSize), "style" to normalizeStyle(utsArrayOf(
                                    unref(customTextStyle)
                                ))), null, 8, utsArrayOf(
                                    "text",
                                    "color",
                                    "size",
                                    "style"
                                ));
                            } else {
                                createCommentVNode("v-if", true);
                            }
                        );
                    }
                    )
                ), 44, utsArrayOf(
                    "onTouchstart",
                    "onTouchend",
                    "onTouchcancel"
                ));
            }
            ;
        }
        ;
        var name = "sn-checkbox";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-checkbox" to padStyleMapOf(utsMapOf("justifyContent" to "center", "transitionDuration" to "200ms")), "sn-checkbox-contain" to padStyleMapOf(utsMapOf("flexDirection" to "row", "alignItems" to "center")), "sn-checkbox-text" to padStyleMapOf(utsMapOf("marginLeft" to 6, "lineHeight" to 1)), "sn-checkbox-icon" to padStyleMapOf(utsMapOf("transform" to "scale(0.001)", "textAlign" to "center")), "sn-checkbox-icon__active" to padStyleMapOf(utsMapOf("transform" to "scale(1)")), "@TRANSITION" to utsMapOf("sn-checkbox" to utsMapOf("duration" to "200ms")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf("text" to utsMapOf("type" to "String", "default" to ""), "icon" to utsMapOf("type" to "String", "default" to ""), "disabled" to utsMapOf("type" to "Boolean", "default" to false), "customContainStyle" to utsMapOf("default" to UTSJSONObject()), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "text",
            "icon",
            "disabled",
            "customContainStyle",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
