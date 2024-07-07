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
open class GenUniModulesSinleUiComponentsSnRadioTagSnRadioTag : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var text: String by `$props`;
    open var type: String by `$props`;
    open var level: String by `$props`;
    open var disabled: Boolean by `$props`;
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
        var setup: (__props: GenUniModulesSinleUiComponentsSnRadioTagSnRadioTag, _arg1: SetupContext) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props, ref1): Any? {
            var __expose = ref1.expose;
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnRadioTagSnRadioTag;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val snu = `$snui`.utils;
            val instance = getCurrentInstance()!!;
            val props = __props;
            val spacing = inject("spacing", "15px");
            val tagType = inject("tagType", "primary");
            val tagLevel = inject("tagLevel", "second");
            val tagTextColor = inject("tagTextColor", "");
            val disabledTagTextColor = inject("disabledTagTextColor", "");
            val tagActiveTextColor = inject("tagActiveTextColor", "");
            val disabledTagActiveTextColor = inject("disabledTagActiveTextColor", "");
            val tagTextSize = inject("tagTextSize", "");
            val tagBorderRadius = inject("tagBorderRadius", "10px");
            val tagPadding = inject("tagPadding", "5px 8px");
            val tagBgColor = inject("tagBgColor", "");
            val disabledTagBgColor = inject("disabledTagBgColor", "");
            val tagActiveBgColor = inject("tagActiveBgColor", "");
            val disabledTagActiveBgColor = inject("disabledTagActiveBgColor", "");
            val customTagStyle = inject("customTagStyle", UTSJSONObject());
            val customTextStyle = inject("customTextStyle", UTSJSONObject());
            val checked = ref(false);
            val tagEle = ref(null as UniElement?);
            val group = computed(fun(): ComponentPublicInstance {
                return instance.proxy!!.`$parent` as ComponentPublicInstance;
            }
            );
            val disabledC = computed(fun(): Boolean {
                return props.disabled;
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
                var type = props.type;
                type = if (snu.text.isEmpty(type)) {
                    tagType as String;
                } else {
                    type;
                }
                ;
                return if (types.includes(type)) {
                    type;
                } else {
                    "info";
                }
                ;
            }
            );
            val levelC = computed(fun(): String {
                var levels = utsArrayOf(
                    "first",
                    "second"
                );
                var level = props.level;
                level = if (snu.text.isEmpty(level)) {
                    tagLevel as String;
                } else {
                    level;
                }
                ;
                return if (levels.includes(level)) {
                    level;
                } else {
                    "second";
                }
                ;
            }
            );
            val bgColorC = computed(fun(): String {
                if (disabledC.value) {
                    if (checked.value) {
                        if (!snu.text.isEmpty(disabledTagActiveBgColor as String)) {
                            return disabledTagActiveBgColor as String;
                        }
                        return colors.value.disabledDark;
                    } else {
                        if (!snu.text.isEmpty(disabledTagBgColor as String)) {
                            return disabledTagBgColor as String;
                        }
                        return colors.value.disabled;
                    }
                } else {
                    if (checked.value) {
                        if (!snu.text.isEmpty(tagActiveBgColor as String)) {
                            return tagActiveBgColor as String;
                        }
                        if (typeC.value == "info") {
                            return colors.value.dark;
                        }
                        return colors.value["" + typeC.value + (if (levelC.value == "second") {
                            "Light";
                        } else {
                            "";
                        })] as String;
                    } else {
                        if (!snu.text.isEmpty(tagBgColor as String)) {
                            return tagBgColor as String;
                        }
                        return colors.value.info;
                    }
                }
            }
            );
            val textColorC = computed(fun(): String {
                if (disabledC.value) {
                    if (checked.value) {
                        if (!snu.text.isEmpty(disabledTagActiveTextColor as String)) {
                            return disabledTagActiveTextColor as String;
                        }
                        return colors.value.disabledDarkText;
                    } else {
                        if (!snu.text.isEmpty(disabledTagTextColor as String)) {
                            return disabledTagTextColor as String;
                        }
                        return colors.value.disabledText;
                    }
                } else {
                    if (checked.value) {
                        if (!snu.text.isEmpty(tagActiveTextColor as String)) {
                            return tagActiveTextColor as String;
                        }
                        if (typeC.value == "info") {
                            return colors.value.front;
                        }
                        return colors.value["" + typeC.value + (if (levelC.value == "second") {
                            "";
                        } else {
                            "Dark";
                        })] as String;
                    } else {
                        if (!snu.text.isEmpty(tagTextColor as String)) {
                            return tagTextColor as String;
                        }
                        return colors.value.text;
                    }
                }
            }
            );
            val tagStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("marginRight", spacing!!);
                styles.set("marginBottom", spacing!!);
                styles.set("border-radius", tagBorderRadius!!);
                styles.set("padding", tagPadding!!);
                return styles;
            }
            );
            fun genUpdateValueFn(v: Boolean) {
                checked.value = v;
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
                val _component_sn_tag = resolveEasyComponent("sn-tag", GenUniModulesSinleUiComponentsSnTagSnTagClass);
                return createVNode(_component_sn_tag, utsMapOf("ref_key" to "tagEle", "ref" to tagEle, "text" to _ctx.text, "bgColor" to unref(bgColorC), "textColor" to unref(textColorC), "textSize" to unref(tagTextSize), "customTextStyle" to unref(customTextStyle), "customStyle" to _ctx.customStyle, "onClick" to radioClicked, "style" to normalizeStyle(utsArrayOf(
                    unref(tagStylesC),
                    unref(customTagStyle)
                ))), null, 8, utsArrayOf(
                    "text",
                    "bgColor",
                    "textColor",
                    "textSize",
                    "customTextStyle",
                    "customStyle",
                    "style"
                ));
            }
            ;
        }
        ;
        var name = "sn-radio-tag";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf());
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf("text" to utsMapOf("type" to "String", "default" to ""), "type" to utsMapOf("type" to "String", "default" to ""), "level" to utsMapOf("type" to "String", "default" to ""), "disabled" to utsMapOf("type" to "Boolean", "default" to false), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "text",
            "type",
            "level",
            "disabled",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
