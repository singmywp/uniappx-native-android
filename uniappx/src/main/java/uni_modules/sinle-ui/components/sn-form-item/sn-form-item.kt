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
open class GenUniModulesSinleUiComponentsSnFormItemSnFormItem : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var type: String by `$props`;
    open var field: String by `$props`;
    open var rule: SnFormItemRule by `$props`;
    open var label: String by `$props`;
    open var labelColor: String by `$props`;
    open var labelSize: String by `$props`;
    open var labelWidth: String by `$props`;
    open var setProps: (data: Map<String, Any>) -> Unit
        get() {
            return unref(this.`$exposed`["setProps"]) as (data: Map<String, Any>) -> Unit;
        }
        set(value) {
            setRefValue(this.`$exposed`, "setProps", value);
        }
    open var verify: (value: Any, callback: (res: SnFormItemVerifyResult) -> Unit) -> Unit
        get() {
            return unref(this.`$exposed`["verify"]) as (value: Any, callback: (res: SnFormItemVerifyResult) -> Unit) -> Unit;
        }
        set(value) {
            setRefValue(this.`$exposed`, "verify", value);
        }
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnFormItemSnFormItem, _arg1: SetupContext) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props, ref1): Any? {
            var __expose = ref1.expose;
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnFormItemSnFormItem;
            val _cache = __ins.renderCache;
            val snu = `$snui`.utils;
            val colors = `$snui`.colors;
            val instance = getCurrentInstance()!!;
            val props = __props;
            val isValid = ref(true);
            val hintMessage = ref("\u3000");
            val type = ref("embed");
            val labelColor = ref(colors.value.textLight);
            val labelSize = ref(`$snui`.configs.font.size(3) as String);
            val showBorder = ref(true);
            val showError = ref(true);
            val typeC = computed(fun(): String {
                return if (props.type == "") {
                    type.value;
                } else {
                    props.type;
                }
                ;
            }
            );
            val required = computed(fun(): Boolean {
                return props.rule.required ?: false;
            }
            );
            val labelColorC = computed(fun(): String {
                return if (props.labelColor == "") {
                    labelColor.value;
                } else {
                    props.labelColor;
                }
                ;
            }
            );
            val labelSizeC = computed(fun(): String {
                return if (props.labelSize == "") {
                    labelSize.value;
                } else {
                    props.labelSize;
                }
                ;
            }
            );
            val bodyStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                if (typeC.value == "float") {
                    styles.set("padding", "10px 15px");
                    styles.set("border-radius", `$snui`.configs.radius.circle);
                    styles.set("background", colors.value.infoLight);
                }
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val labelStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("width", props.labelWidth);
                return styles;
            }
            );
            fun genVerifyFn(value: Any, callback: (res: SnFormItemVerifyResult) -> Unit) {
                return useVerify(isValid, hintMessage, props.field as String, props.rule, value, callback);
            }
            val verify = ::genVerifyFn;
            fun genRegisterFn() {
                var that = instance.proxy!!;
                var parent = snu.findParent(that, "sn-form");
                var item = SnFormItem(field = props.field as String, instance = that);
                if (parent != null) {
                    parent.`$callMethod`("register", item);
                }
            }
            val register = ::genRegisterFn;
            fun genSetPropsFn(data: Map<String, Any>) {
                type.value = data.get("type") as String;
                labelColor.value = data.get("labelColor") as String;
                labelSize.value = data.get("labelSize") as String;
                showBorder.value = data.get("showBorder") as Boolean;
                showError.value = data.get("showError") as Boolean;
            }
            val setProps = ::genSetPropsFn;
            __expose(utsMapOf("setProps" to setProps, "verify" to verify));
            onMounted(fun(){
                register();
            }
            );
            return fun(): Any? {
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_sn_alert = resolveEasyComponent("sn-alert", GenUniModulesSinleUiComponentsSnAlertSnAlertClass);
                val _component_sn_line = resolveEasyComponent("sn-line", GenUniModulesSinleUiComponentsSnLineSnLineClass);
                return createElementVNode("view", utsMapOf("class" to "sn-form-item"), utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "sn-form-item-body", "style" to normalizeStyle(unref(bodyStylesC))), utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "sn-form-item-label", "style" to normalizeStyle(unref(labelStylesC))), utsArrayOf(
                            if (isTrue(unref(required))) {
                                createVNode(_component_sn_text, utsMapOf("key" to 0, "class" to "sn-form-item-label-required", "text" to "*", "color" to unref(colors).error, "size" to unref(labelSizeC)), null, 8, utsArrayOf(
                                    "color",
                                    "size"
                                ));
                            } else {
                                createCommentVNode("v-if", true);
                            }
                            ,
                            createVNode(_component_sn_text, utsMapOf("text" to _ctx.label, "color" to unref(labelColorC), "size" to unref(labelSizeC)), null, 8, utsArrayOf(
                                "text",
                                "color",
                                "size"
                            ))
                        ), 4),
                        createElementVNode("view", utsMapOf("class" to "sn-form-item-content"), utsArrayOf(
                            renderSlot(_ctx.`$slots`, "default")
                        ))
                    ), 4),
                    if (isTrue(unref(showError) && !unref(isValid))) {
                        renderSlot(_ctx.`$slots`, "error", utsMapOf("key" to 0), fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_alert, utsMapOf("type" to "error", "class" to "sn-form-item-error", "text" to unref(hintMessage)), null, 8, utsArrayOf(
                                    "text"
                                ))
                            );
                        });
                    } else {
                        createCommentVNode("v-if", true);
                    }
                    ,
                    if (isTrue(unref(showBorder) && unref(typeC) == "embed")) {
                        createVNode(_component_sn_line, utsMapOf("key" to 1, "margin" to "15px 0 0 0"));
                    } else {
                        createCommentVNode("v-if", true);
                    }
                ));
            }
            ;
        }
        ;
        var name = "sn-form-item";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-form-item" to padStyleMapOf(utsMapOf("width" to "100%", "flexDirection" to "column", "paddingBottom" to 15)), "sn-form-item-body" to padStyleMapOf(utsMapOf("flexDirection" to "row")), "sn-form-item-error" to padStyleMapOf(utsMapOf("marginTop" to 10)), "sn-form-item-label" to padStyleMapOf(utsMapOf("marginRight" to 10, "flexDirection" to "row", "alignItems" to "center", "justifyContent" to "flex-start")), "sn-form-item-label-required" to padStyleMapOf(utsMapOf("marginRight" to 5)), "sn-form-item-content" to padStyleMapOf(utsMapOf("flex" to 1, "justifyContent" to "flex-end", "flexDirection" to "row")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf("type" to utsMapOf("type" to "String", "default" to ""), "field" to utsMapOf("type" to "String", "default" to ""), "rule" to utsMapOf("type" to "Object", "default" to fun(): SnFormItemRule {
            return SnFormItemRule();
        }
        ), "label" to utsMapOf("type" to "String", "default" to ""), "labelColor" to utsMapOf("type" to "String", "default" to ""), "labelSize" to utsMapOf("type" to "String", "default" to ""), "labelWidth" to utsMapOf("type" to "String", "default" to "auto")));
        var propsNeedCastKeys = utsArrayOf(
            "type",
            "field",
            "rule",
            "label",
            "labelColor",
            "labelSize",
            "labelWidth"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
