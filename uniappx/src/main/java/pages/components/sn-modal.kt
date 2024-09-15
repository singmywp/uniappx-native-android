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
open class GenPagesComponentsSnModal : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnModal) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnModal;
            val _cache = __ins.renderCache;
            val snu = `$snui`.utils;
            val colors = `$snui`.colors;
            val modalEle = ref(null as GenUniModulesSinleUiComponentsSnModalSnModalComponentPublicInstance?);
            val showCancel = ref(true);
            val showConfirm = ref(true);
            val disabled = ref(false);
            val maskClose = ref(false);
            val preventBack = ref(false);
            val content = ref(0);
            val title = ref("标题");
            val contentColor = ref("");
            val contentSize = ref("");
            val contentFont = ref("misans-normal");
            val titleColor = ref("");
            val titleSize = ref("");
            val titleFont = ref("misans-semibold");
            val confirmText = ref("确定");
            val cancelText = ref("取消");
            val buttonType = ref(0);
            val position = ref(1);
            val positions = utsArrayOf(
                object : UTSJSONObject() {
                    var id = "top"
                    var text = "居顶"
                },
                object : UTSJSONObject() {
                    var id = "center"
                    var text = "居中"
                },
                object : UTSJSONObject() {
                    var id = "bottom"
                    var text = "居底"
                }
            );
            val contentData = utsArrayOf(
                object : UTSJSONObject() {
                    var id = "short"
                    var text = "短文本"
                },
                object : UTSJSONObject() {
                    var id = "long"
                    var text = "长文本（可滚动）"
                }
            );
            val buttonTypeData = utsArrayOf(
                object : UTSJSONObject() {
                    var id = "embed"
                    var text = "嵌入式"
                },
                object : UTSJSONObject() {
                    var id = "float"
                    var text = "浮动式"
                }
            );
            val textC = computed(fun(): String {
                when (content.value) {
                    0 -> 
                        {
                            return "如果需要对话框，那么官方的 uni.showModal 足以满足你的需求。当你需要更自由地控制动画、插槽时，不妨试试本组件。";
                            return "如果需要对话框，那么官方的 uni.showModal 足以满足你的需求。当你需要更自由地控制动画、插槽时，不妨试试本组件。";
                        }
                    1 -> 
                        {
                            return article1;
                            return "如果需要对话框，那么官方的 uni.showModal 足以满足你的需求。当你需要更自由地控制动画、插槽时，不妨试试本组件。";
                        }
                    else -> 
                        return "如果需要对话框，那么官方的 uni.showModal 足以满足你的需求。当你需要更自由地控制动画、插槽时，不妨试试本组件。";
                }
            }
            );
            fun genShowFn() {
                snu.other.throttle(fun(){
                    (modalEle.value as GenUniModulesSinleUiComponentsSnModalSnModalComponentPublicInstance).open();
                }
                , 50);
            }
            val show = ::genShowFn;
            fun genButtonClickedFn(e: UTSJSONObject) {
                var id = (e["id"] ?: "") as String;
                if (id == "run") {
                    show();
                }
            }
            val buttonClicked = ::genButtonClickedFn;
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_gap = resolveEasyComponent("sn-gap", GenUniModulesSinleUiComponentsSnGapSnGapClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_sn_switch = resolveEasyComponent("sn-switch", GenUniModulesSinleUiComponentsSnSwitchSnSwitchClass);
                val _component_sn_row = resolveEasyComponent("sn-row", GenUniModulesSinleUiComponentsSnRowSnRowClass);
                val _component_sn_select = resolveEasyComponent("sn-select", GenUniModulesSinleUiComponentsSnSelectSnSelectClass);
                val _component_sn_input = resolveEasyComponent("sn-input", GenUniModulesSinleUiComponentsSnInputSnInputClass);
                val _component_sn_button = resolveEasyComponent("sn-button", GenUniModulesSinleUiComponentsSnButtonSnButtonClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                val _component_sn_modal = resolveEasyComponent("sn-modal", GenUniModulesSinleUiComponentsSnModalSnModalClass);
                return createElementVNode(Fragment, null, utsArrayOf(
                    createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_topbar, utsMapOf("title" to "Modal 模态框", "features" to utsArrayOf(
                                object : UTSJSONObject() {
                                    var id = "run"
                                    var icon = "play-circle-fill"
                                }
                            ), "onButtonClick" to buttonClicked)),
                            createVNode(_component_sn_gap),
                            createVNode(_component_com_card, utsMapOf("title" to "组件演示", "note" to "如果需要对话框，那么官方的 uni.showModal 应该足以满足你的需求。\\n当你需要更自由地控制动画、插槽时，不妨试试本组件。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "显示确认按钮")),
                                            createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(showConfirm), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                                trySetRefValue(showConfirm, `$event`);
                                            }
                                            ), null, 8, utsArrayOf(
                                                "modelValue"
                                            ))
                                        );
                                    }
                                    ), "_" to 1), 8, utsArrayOf(
                                        "style"
                                    )),
                                    createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "显示取消按钮")),
                                            createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(showCancel), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                                trySetRefValue(showCancel, `$event`);
                                            }
                                            ), null, 8, utsArrayOf(
                                                "modelValue"
                                            ))
                                        );
                                    }
                                    ), "_" to 1), 8, utsArrayOf(
                                        "style"
                                    )),
                                    createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "禁用")),
                                            createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(disabled), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                                trySetRefValue(disabled, `$event`);
                                            }
                                            ), null, 8, utsArrayOf(
                                                "modelValue"
                                            ))
                                        );
                                    }
                                    ), "_" to 1), 8, utsArrayOf(
                                        "style"
                                    )),
                                    createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "遮罩关闭")),
                                            createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(maskClose), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                                trySetRefValue(maskClose, `$event`);
                                            }
                                            ), null, 8, utsArrayOf(
                                                "modelValue"
                                            ))
                                        );
                                    }
                                    ), "_" to 1), 8, utsArrayOf(
                                        "style"
                                    )),
                                    createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "阻止返回事件")),
                                            createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(preventBack), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                                trySetRefValue(preventBack, `$event`);
                                            }
                                            ), null, 8, utsArrayOf(
                                                "modelValue"
                                            ))
                                        );
                                    }
                                    ), "_" to 1), 8, utsArrayOf(
                                        "style"
                                    )),
                                    createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "位置")),
                                            createVNode(_component_sn_select, utsMapOf("modelValue" to unref(position), "onUpdate:modelValue" to fun(`$event`: Number){
                                                trySetRefValue(position, `$event`);
                                            }
                                            , "width" to "200px", "data" to positions), null, 8, utsArrayOf(
                                                "modelValue"
                                            ))
                                        );
                                    }
                                    ), "_" to 1), 8, utsArrayOf(
                                        "style"
                                    )),
                                    createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "按钮风格")),
                                            createVNode(_component_sn_select, utsMapOf("modelValue" to unref(buttonType), "onUpdate:modelValue" to fun(`$event`: Number){
                                                trySetRefValue(buttonType, `$event`);
                                            }
                                            , "width" to "200px", "data" to buttonTypeData), null, 8, utsArrayOf(
                                                "modelValue"
                                            ))
                                        );
                                    }
                                    ), "_" to 1), 8, utsArrayOf(
                                        "style"
                                    )),
                                    createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "内容")),
                                            createVNode(_component_sn_select, utsMapOf("modelValue" to unref(content), "onUpdate:modelValue" to fun(`$event`: Number){
                                                trySetRefValue(content, `$event`);
                                            }
                                            , "width" to "200px", "data" to contentData), null, 8, utsArrayOf(
                                                "modelValue"
                                            ))
                                        );
                                    }
                                    ), "_" to 1), 8, utsArrayOf(
                                        "style"
                                    )),
                                    createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "标题")),
                                            createVNode(_component_sn_input, utsMapOf("class" to "input", "modelValue" to unref(title), "onUpdate:modelValue" to fun(`$event`: String){
                                                trySetRefValue(title, `$event`);
                                            }
                                            , "placeholder" to "默认值"), null, 8, utsArrayOf(
                                                "modelValue"
                                            ))
                                        );
                                    }
                                    ), "_" to 1), 8, utsArrayOf(
                                        "style"
                                    )),
                                    createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "内容字体")),
                                            createVNode(_component_sn_input, utsMapOf("class" to "input", "modelValue" to unref(contentFont), "onUpdate:modelValue" to fun(`$event`: String){
                                                trySetRefValue(contentFont, `$event`);
                                            }
                                            , "placeholder" to "默认值"), null, 8, utsArrayOf(
                                                "modelValue"
                                            ))
                                        );
                                    }
                                    ), "_" to 1), 8, utsArrayOf(
                                        "style"
                                    )),
                                    createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "内容颜色")),
                                            createVNode(_component_sn_input, utsMapOf("class" to "input", "modelValue" to unref(contentColor), "onUpdate:modelValue" to fun(`$event`: String){
                                                trySetRefValue(contentColor, `$event`);
                                            }
                                            , "placeholder" to "默认值"), null, 8, utsArrayOf(
                                                "modelValue"
                                            ))
                                        );
                                    }
                                    ), "_" to 1), 8, utsArrayOf(
                                        "style"
                                    )),
                                    createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "内容字体大小")),
                                            createVNode(_component_sn_input, utsMapOf("class" to "input", "modelValue" to unref(contentSize), "onUpdate:modelValue" to fun(`$event`: String){
                                                trySetRefValue(contentSize, `$event`);
                                            }
                                            , "placeholder" to "默认值"), null, 8, utsArrayOf(
                                                "modelValue"
                                            ))
                                        );
                                    }
                                    ), "_" to 1), 8, utsArrayOf(
                                        "style"
                                    )),
                                    createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "标题字体")),
                                            createVNode(_component_sn_input, utsMapOf("class" to "input", "modelValue" to unref(titleFont), "onUpdate:modelValue" to fun(`$event`: String){
                                                trySetRefValue(titleFont, `$event`);
                                            }
                                            , "placeholder" to "默认值"), null, 8, utsArrayOf(
                                                "modelValue"
                                            ))
                                        );
                                    }
                                    ), "_" to 1), 8, utsArrayOf(
                                        "style"
                                    )),
                                    createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "标题颜色")),
                                            createVNode(_component_sn_input, utsMapOf("class" to "input", "modelValue" to unref(titleColor), "onUpdate:modelValue" to fun(`$event`: String){
                                                trySetRefValue(titleColor, `$event`);
                                            }
                                            , "placeholder" to "默认值"), null, 8, utsArrayOf(
                                                "modelValue"
                                            ))
                                        );
                                    }
                                    ), "_" to 1), 8, utsArrayOf(
                                        "style"
                                    )),
                                    createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "标题字体大小")),
                                            createVNode(_component_sn_input, utsMapOf("class" to "input", "modelValue" to unref(titleSize), "onUpdate:modelValue" to fun(`$event`: String){
                                                trySetRefValue(titleSize, `$event`);
                                            }
                                            , "placeholder" to "默认值"), null, 8, utsArrayOf(
                                                "modelValue"
                                            ))
                                        );
                                    }
                                    ), "_" to 1), 8, utsArrayOf(
                                        "style"
                                    )),
                                    createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "标题字体")),
                                            createVNode(_component_sn_input, utsMapOf("class" to "input", "modelValue" to unref(titleFont), "onUpdate:modelValue" to fun(`$event`: String){
                                                trySetRefValue(titleFont, `$event`);
                                            }
                                            , "placeholder" to "默认值"), null, 8, utsArrayOf(
                                                "modelValue"
                                            ))
                                        );
                                    }
                                    ), "_" to 1), 8, utsArrayOf(
                                        "style"
                                    )),
                                    createVNode(_component_sn_row, utsMapOf("align" to "center", "justify" to "space-between", "spacing" to "20px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "标题颜色")),
                                            createVNode(_component_sn_input, utsMapOf("class" to "input", "modelValue" to unref(titleColor), "onUpdate:modelValue" to fun(`$event`: String){
                                                trySetRefValue(titleColor, `$event`);
                                            }
                                            , "placeholder" to "默认值"), null, 8, utsArrayOf(
                                                "modelValue"
                                            ))
                                        );
                                    }
                                    ), "_" to 1)),
                                    createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "标题字体大小")),
                                            createVNode(_component_sn_input, utsMapOf("class" to "input", "modelValue" to unref(titleSize), "onUpdate:modelValue" to fun(`$event`: String){
                                                trySetRefValue(titleSize, `$event`);
                                            }
                                            , "placeholder" to "默认值"), null, 8, utsArrayOf(
                                                "modelValue"
                                            ))
                                        );
                                    }
                                    ), "_" to 1), 8, utsArrayOf(
                                        "style"
                                    )),
                                    createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "确定按钮文字")),
                                            createVNode(_component_sn_input, utsMapOf("class" to "input", "modelValue" to unref(confirmText), "onUpdate:modelValue" to fun(`$event`: String){
                                                trySetRefValue(confirmText, `$event`);
                                            }
                                            , "placeholder" to "默认值"), null, 8, utsArrayOf(
                                                "modelValue"
                                            ))
                                        );
                                    }
                                    ), "_" to 1), 8, utsArrayOf(
                                        "style"
                                    )),
                                    createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "取消按钮文字")),
                                            createVNode(_component_sn_input, utsMapOf("class" to "input", "modelValue" to unref(cancelText), "onUpdate:modelValue" to fun(`$event`: String){
                                                trySetRefValue(cancelText, `$event`);
                                            }
                                            , "placeholder" to "默认值"), null, 8, utsArrayOf(
                                                "modelValue"
                                            ))
                                        );
                                    }
                                    ), "_" to 1), 8, utsArrayOf(
                                        "style"
                                    )),
                                    createVNode(_component_sn_button, utsMapOf("text" to "打开", "level" to "second", "type" to "primary", "onClick" to fun(){
                                        show();
                                    }
                                    , "style" to normalizeStyle(utsMapOf("margin-top" to "10px"))), null, 8, utsArrayOf(
                                        "onClick",
                                        "style"
                                    ))
                                );
                            }
                            ), "_" to 1)),
                            createVNode(_component_sn_gap)
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_sn_modal, utsMapOf("ref_key" to "modalEle", "ref" to modalEle, "title" to unref(title), "content" to unref(textC), "buttonType" to (buttonTypeData[unref(buttonType)]["id"] ?: ""), "position" to (positions[unref(position)]["id"] ?: ""), "showConfirm" to unref(showConfirm), "showCancel" to unref(showCancel), "disabled" to unref(disabled), "maskClose" to unref(maskClose), "preventBack" to unref(preventBack), "titleSize" to unref(titleSize), "titleColor" to unref(titleColor), "titleFont" to unref(titleFont), "confirmText" to unref(confirmText), "cancelText" to unref(cancelText)), null, 8, utsArrayOf(
                        "title",
                        "content",
                        "buttonType",
                        "position",
                        "showConfirm",
                        "showCancel",
                        "disabled",
                        "maskClose",
                        "preventBack",
                        "titleSize",
                        "titleColor",
                        "titleFont",
                        "confirmText",
                        "cancelText"
                    ))
                ), 64);
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
                return utsMapOf("input" to padStyleMapOf(utsMapOf("flex" to 1, "marginLeft" to 10)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
