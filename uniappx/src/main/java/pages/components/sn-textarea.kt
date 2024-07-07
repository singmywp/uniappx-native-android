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
open class GenPagesComponentsSnTextarea : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnTextarea) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnTextarea;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val focus = ref(false);
            val v1 = ref("");
            val v2 = ref("");
            val v3 = ref("");
            val v4 = ref("");
            val v5 = ref("");
            val v6 = ref("");
            val v7 = ref("");
            val v8 = ref("");
            val v9 = ref("");
            val v10 = ref("");
            val v11 = ref("");
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_sn_textarea = resolveEasyComponent("sn-textarea", GenUniModulesSinleUiComponentsSnTextareaSnTextareaClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_switch = resolveEasyComponent("sn-switch", GenUniModulesSinleUiComponentsSnSwitchSnSwitchClass);
                val _component_sn_row = resolveEasyComponent("sn-row", GenUniModulesSinleUiComponentsSnRowSnRowClass);
                val _component_sn_card = resolveEasyComponent("sn-card", GenUniModulesSinleUiComponentsSnCardSnCardClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Textarea 文本域")),
                        createVNode(_component_com_card, utsMapOf("title" to "基础用法", "note" to "普普通通的文本域"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("class" to "introduction", "text" to "\u3000\u3000")),
                                createVNode(_component_sn_textarea, utsMapOf("modelValue" to unref(v1), "onUpdate:modelValue" to fun(`$event`: String){
                                    trySetRefValue(v1, `$event`);
                                }
                                ), null, 8, utsArrayOf(
                                    "modelValue"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "提示文字", "note" to "为文本域添加提示文字，让用户更懂你的意图"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_textarea, utsMapOf("modelValue" to unref(v2), "onUpdate:modelValue" to fun(`$event`: String){
                                    trySetRefValue(v2, `$event`);
                                }
                                , "class" to "spacing", "placeholder" to "带有placeholder的文本域"), null, 8, utsArrayOf(
                                    "modelValue"
                                )),
                                createVNode(_component_sn_textarea, utsMapOf("modelValue" to unref(v2), "onUpdate:modelValue" to fun(`$event`: String){
                                    trySetRefValue(v2, `$event`);
                                }
                                , "placeholder" to "自定义placeholder的样式", "placeholderStyle" to "color: black"), null, 8, utsArrayOf(
                                    "modelValue"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "自动增高", "note" to "自动增高的文本域，自由根据用户需求变化"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_textarea, utsMapOf("modelValue" to unref(v3), "onUpdate:modelValue" to fun(`$event`: String){
                                    trySetRefValue(v3, `$event`);
                                }
                                , "placeholder" to "自动增高", "autoHeight" to ""), null, 8, utsArrayOf(
                                    "modelValue"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "圆角", "note" to "自定义文本域的圆角，更具特色"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_textarea, utsMapOf("modelValue" to unref(v4), "onUpdate:modelValue" to fun(`$event`: String){
                                    trySetRefValue(v4, `$event`);
                                }
                                , "class" to "spacing", "placeholder" to "方形", "border-radius" to "0px"), null, 8, utsArrayOf(
                                    "modelValue"
                                )),
                                createVNode(_component_sn_textarea, utsMapOf("modelValue" to unref(v4), "onUpdate:modelValue" to fun(`$event`: String){
                                    trySetRefValue(v4, `$event`);
                                }
                                , "placeholder" to "异形", "border-radius" to "15px 0 15px 0"), null, 8, utsArrayOf(
                                    "modelValue"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "颜色", "note" to "文本域的各种颜色，由你决定"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_textarea, utsMapOf("modelValue" to unref(v5), "onUpdate:modelValue" to fun(`$event`: String){
                                    trySetRefValue(v5, `$event`);
                                }
                                , "placeholder" to "自定义颜色", "borderRadius" to "15px", "bgColor" to unref(colors).info, "borderColor" to unref(colors).info, "textColor" to "#35b571", "activeBorderColor" to "#35b571", "cursorColor" to "#35b571"), null, 8, utsArrayOf(
                                    "modelValue",
                                    "bgColor",
                                    "borderColor"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "边框", "note" to "当默认的边框太过突兀时，可以取消边框的显示"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_textarea, utsMapOf("modelValue" to unref(v6), "onUpdate:modelValue" to fun(`$event`: String){
                                    trySetRefValue(v6, `$event`);
                                }
                                , "class" to "spacing", "placeholder" to "无边框", "borderRadius" to "15px", "bgColor" to unref(colors).info, "activeBgColor" to unref(colors).info, "border-color" to "transparent"), null, 8, utsArrayOf(
                                    "modelValue",
                                    "bgColor",
                                    "activeBgColor"
                                )),
                                createVNode(_component_sn_textarea, utsMapOf("modelValue" to unref(v6), "onUpdate:modelValue" to fun(`$event`: String){
                                    trySetRefValue(v6, `$event`);
                                }
                                , "class" to "spacing", "placeholder" to "无焦点边框", "border-radius" to "15px", "bgColor" to unref(colors).info, "activeBgColor" to unref(colors).info, "activeBorder" to false), null, 8, utsArrayOf(
                                    "modelValue",
                                    "bgColor",
                                    "activeBgColor"
                                )),
                                createVNode(_component_sn_textarea, utsMapOf("modelValue" to unref(v6), "onUpdate:modelValue" to fun(`$event`: String){
                                    trySetRefValue(v6, `$event`);
                                }
                                , "class" to "spacing", "placeholder" to "完全无边框", "borderRadius" to "15px", "bgColor" to unref(colors).info, "activeBgColor" to unref(colors).info, "borderColor" to "transparent", "activeBorder" to false), null, 8, utsArrayOf(
                                    "modelValue",
                                    "bgColor",
                                    "activeBgColor"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "上推界面", "note" to "用于确定键盘弹起时是否自动上推页面，默认开启"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_textarea, utsMapOf("modelValue" to unref(v7), "onUpdate:modelValue" to fun(`$event`: String){
                                    trySetRefValue(v7, `$event`);
                                }
                                , "adjustPosition" to false, "placeholder" to "禁用自动上推界面", "borderRadius" to "15px", "bgColor" to unref(colors).info, "borderColor" to unref(colors).info), null, 8, utsArrayOf(
                                    "modelValue",
                                    "bgColor",
                                    "borderColor"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "焦点", "note" to "文本域也可以自由控制焦点"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_card, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_row, utsMapOf("justify" to "space-between"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_text, utsMapOf("text" to "获得焦点", "size" to ("" + (unref(`$snui`).utils.getPx(unref(`$snui`).configs.font.size(3)) + 1) + "px")), null, 8, utsArrayOf(
                                                    "size"
                                                )),
                                                createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(focus), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                                    trySetRefValue(focus, `$event`);
                                                }
                                                ), null, 8, utsArrayOf(
                                                    "modelValue"
                                                ))
                                            );
                                        }
                                        ), "_" to 1))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_sn_textarea, utsMapOf("modelValue" to unref(v8), "onUpdate:modelValue" to fun(`$event`: String){
                                    trySetRefValue(v8, `$event`);
                                }
                                , "placeholder" to "自由控制焦点", "borderRadius" to "15px", "bgColor" to unref(colors).info, "borderColor" to unref(colors).info, "focus" to unref(focus), "onFocus" to fun(){
                                    focus.value = true;
                                }
                                , "onBlur" to fun(){
                                    focus.value = false;
                                }
                                ), null, 8, utsArrayOf(
                                    "modelValue",
                                    "bgColor",
                                    "borderColor",
                                    "focus",
                                    "onFocus",
                                    "onBlur"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "禁用", "note" to "禁用文本域，也许能让有些人闭嘴"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_textarea, utsMapOf("modelValue" to unref(v9), "onUpdate:modelValue" to fun(`$event`: String){
                                    trySetRefValue(v9, `$event`);
                                }
                                , "placeholder" to "禁用", "border-radius" to "15px", "bgColor" to unref(colors).info, "border-color" to "transparent", "disabled" to ""), null, 8, utsArrayOf(
                                    "modelValue",
                                    "bgColor"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "最大输入长度", "note" to "限制字数的工具，默认设为-1（不限制）"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_textarea, utsMapOf("modelValue" to unref(v11), "onUpdate:modelValue" to fun(`$event`: String){
                                    trySetRefValue(v11, `$event`);
                                }
                                , "class" to "spacing", "placeholder" to "限制100字", "borderRadius" to "15px", "maxlength" to 100), null, 8, utsArrayOf(
                                    "modelValue"
                                )),
                                createVNode(_component_sn_textarea, utsMapOf("modelValue" to unref(v11), "onUpdate:modelValue" to fun(`$event`: String){
                                    trySetRefValue(v11, `$event`);
                                }
                                , "placeholder" to "限制100字 (自定义计字器样式) ", "borderRadius" to "15px", "bgColor" to unref(colors).info, "borderColor" to unref(colors).info, "activeBgColor" to unref(colors).info, "counterBgColor" to unref(colors).front, "counterColor" to unref(colors).text, "maxlength" to 100), null, 8, utsArrayOf(
                                    "modelValue",
                                    "bgColor",
                                    "borderColor",
                                    "activeBgColor",
                                    "counterBgColor",
                                    "counterColor"
                                ))
                            );
                        }
                        ), "_" to 1))
                    );
                }
                ), "_" to 1));
            }
            ;
        }
        ;
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ), utsArrayOf(
                    GenApp.styles
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("spacing" to padStyleMapOf(utsMapOf("marginBottom" to 5)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
