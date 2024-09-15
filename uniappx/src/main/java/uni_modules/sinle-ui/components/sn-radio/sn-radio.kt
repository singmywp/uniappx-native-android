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
open class GenUniModulesSinleUiComponentsSnRadioSnRadio : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var text: String by `$props`;
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
        var setup: (__props: GenUniModulesSinleUiComponentsSnRadioSnRadio, _arg1: SetupContext) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props, ref1): Any? {
            var __expose = ref1.expose;
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnRadioSnRadio;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val snu = `$snui`.utils;
            val instance = getCurrentInstance()!!;
            val props = __props;
            val spacing = inject("spacing", "15px");
            val radioSize = inject("radioSize", "20px");
            val radioBorderWidth = inject("radioBorderWidth", "2.5px");
            val radioTextSize = inject("radioTextSize", `$snui`.configs.font.size(3));
            val radioBgColor = inject("radioBgColor", colors.value.front);
            val disabledRadioBgColor = inject("disabledRadioBgColor", colors.value.front);
            val radioActiveBgColor = inject("radioActiveBgColor", colors.value.front);
            val disabledRadioActiveBgColor = inject("disabledRadioActiveBgColor", colors.value.front);
            val radioTextColor = inject("radioTextColor", colors.value.text);
            val disabledRadioTextColor = inject("disabledRadioTextColor", colors.value.disabledText);
            val radioBorderColor = inject("radioBorderColor", colors.value.line);
            val disabledRadioBorderColor = inject("disabledRadioBorderColor", colors.value.disabled);
            val radioActiveBorderColor = inject("radioActiveBorderColor", colors.value.primary);
            val disabledRadioActiveBorderColor = inject("disabledRadioActiveBorderColor", colors.value.disabledDark);
            val customRadioContainStyle = inject("customRadioContainStyle", UTSJSONObject());
            val customRadioStyle = inject("customRadioStyle", UTSJSONObject());
            val customTextStyle = inject("customTextStyle", UTSJSONObject());
            val selected = ref(false);
            val group = computed(fun(): ComponentPublicInstance {
                return instance.proxy!!.`$parent` as ComponentPublicInstance;
            }
            );
            val radioSizeC = computed(fun(): Number {
                return snu.getPx(radioSize as String);
            }
            );
            val radioBorderWidthC = computed(fun(): Number {
                return snu.getPx(radioBorderWidth as String);
            }
            );
            val showTextC = computed(fun(): Boolean {
                return !snu.text.isEmpty(props.text);
            }
            );
            val containStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("marginBottom", spacing as String);
                styles.set("marginRight", spacing as String);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val radioStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("width", snu.addPx(radioSizeC.value));
                styles.set("height", snu.addPx(radioSizeC.value));
                styles.set("border-radius", `$snui`.configs.radius.circle);
                styles.set("backgroundColor", if (selected.value) {
                    if (props.disabled) {
                        disabledRadioActiveBorderColor;
                    } else {
                        radioActiveBorderColor;
                    } as String;
                } else {
                    if (props.disabled) {
                        disabledRadioBorderColor;
                    } else {
                        radioBorderColor;
                    }
                     as String;
                }
                );
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val dotStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("width", snu.addPx(radioSizeC.value - 2 * radioBorderWidthC.value));
                styles.set("height", snu.addPx(radioSizeC.value - 2 * radioBorderWidthC.value));
                styles.set("left", snu.addPx(radioBorderWidthC.value));
                styles.set("backgroundColor", if (selected.value) {
                    if (props.disabled) {
                        disabledRadioActiveBgColor;
                    } else {
                        radioActiveBgColor;
                    } as String;
                } else {
                    if (props.disabled) {
                        disabledRadioBgColor;
                    } else {
                        radioBgColor;
                    }
                     as String;
                }
                );
                styles.set("border-radius", `$snui`.configs.radius.circle);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val textStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("fontSize", radioTextSize as String);
                styles.set("color", if (props.disabled) {
                    disabledRadioTextColor;
                } else {
                    radioTextColor;
                }
                 as String);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            fun genUpdateValueFn(v: Boolean) {
                selected.value = v;
            }
            val updateValue = ::genUpdateValueFn;
            fun genRadioClickedFn() {
                if (!props.disabled) {
                    group.value.`$callMethod`("syncData", instance.proxy!! as ComponentPublicInstance);
                }
            }
            val radioClicked = ::genRadioClickedFn;
            __expose(utsMapOf("updateValue" to updateValue));
            onMounted(fun(){
                nextTick(fun(){
                    group.value.`$callMethod`("register", instance.proxy!! as ComponentPublicInstance);
                }
                );
            }
            );
            return fun(): Any? {
                return createElementVNode("view", utsMapOf("class" to "sn-radio-contain", "android-layer-type" to "hardware", "onClick" to radioClicked, "style" to normalizeStyle(utsArrayOf(
                    unref(containStylesC),
                    unref(customRadioContainStyle),
                    _ctx.customContainStyle
                ))), utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "sn-radio", "style" to normalizeStyle(utsArrayOf(
                        unref(radioStylesC),
                        _ctx.customStyle,
                        unref(customRadioStyle)
                    ))), utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to normalizeClass("sn-radio-dot" + (if (unref(selected)) {
                            "-active";
                        } else {
                            "";
                        }
                        )), "style" to normalizeStyle(unref(dotStylesC))), null, 6)
                    ), 4),
                    renderSlot(_ctx.`$slots`, "default", UTSJSONObject(), fun(): UTSArray<Any> {
                        return utsArrayOf(
                            if (isTrue(unref(showTextC))) {
                                createElementVNode("text", utsMapOf("key" to 0, "class" to "sn-radio-text", "style" to normalizeStyle(utsArrayOf(
                                    unref(textStylesC),
                                    unref(customTextStyle)
                                ))), toDisplayString(_ctx.text), 5);
                            } else {
                                createCommentVNode("v-if", true);
                            }
                        );
                    }
                    )
                ), 4);
            }
            ;
        }
        ;
        var name = "sn-radio";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-radio-contain" to padStyleMapOf(utsMapOf("display" to "flex", "flexDirection" to "row", "alignItems" to "center")), "sn-radio" to padStyleMapOf(utsMapOf("marginRight" to 6, "boxSizing" to "border-box", "display" to "flex", "justifyContent" to "center")), "sn-radio-dot" to padStyleMapOf(utsMapOf("position" to "relative", "transform" to "scale(1)", "transitionProperty" to "transform")), "sn-radio-dot-active" to padStyleMapOf(utsMapOf("transform" to "scale(0.625)")), "@TRANSITION" to utsMapOf("sn-radio-dot" to utsMapOf("property" to "transform")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf("text" to utsMapOf("type" to "String", "default" to ""), "disabled" to utsMapOf("type" to "Boolean", "default" to false), "customContainStyle" to utsMapOf("default" to UTSJSONObject()), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "text",
            "disabled",
            "customContainStyle",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
