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
open class GenPagesComponentsSnInput : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnInput) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnInput;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val focus = ref(false);
            val loading = ref(false);
            val kVal = ref("");
            val loadingComponents = ref(true);
            onMounted(fun(){
                nextTick(fun(){
                    setTimeout(fun(){
                        loadingComponents.value = false;
                    }
                    , 500);
                }
                );
            }
            );
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_input = resolveEasyComponent("sn-input", GenUniModulesSinleUiComponentsSnInputSnInputClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_sn_switch = resolveEasyComponent("sn-switch", GenUniModulesSinleUiComponentsSnSwitchSnSwitchClass);
                val _component_sn_row = resolveEasyComponent("sn-row", GenUniModulesSinleUiComponentsSnRowSnRowClass);
                val _component_sn_card = resolveEasyComponent("sn-card", GenUniModulesSinleUiComponentsSnCardSnCardClass);
                val _component_sn_icon = resolveEasyComponent("sn-icon", GenUniModulesSinleUiComponentsSnIconSnIconClass);
                val _component_sn_button = resolveEasyComponent("sn-button", GenUniModulesSinleUiComponentsSnButtonSnButtonClass);
                val _component_sn_view = resolveEasyComponent("sn-view", GenUniModulesSinleUiComponentsSnViewSnViewClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Input 输入框")),
                        createVNode(_component_sn_view, utsMapOf("loading" to unref(loadingComponents)), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_com_card, utsMapOf("title" to "基础用法", "note" to "普普通通的输入框"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_input, utsMapOf("modelValue" to unref(kVal), "onUpdate:modelValue" to fun(`$event`: String){
                                            trySetRefValue(kVal, `$event`);
                                        }
                                        ), null, 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "提示文字", "note" to "为输入框添加提示文字，让用户更懂你的意图"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_input, utsMapOf("modelValue" to unref(kVal), "onUpdate:modelValue" to fun(`$event`: String){
                                            trySetRefValue(kVal, `$event`);
                                        }
                                        , "class" to "spacing", "placeholder" to "带有placeholder的输入框"), null, 8, utsArrayOf(
                                            "modelValue"
                                        )),
                                        createVNode(_component_sn_input, utsMapOf("modelValue" to unref(kVal), "onUpdate:modelValue" to fun(`$event`: String){
                                            trySetRefValue(kVal, `$event`);
                                        }
                                        , "class" to "spacing", "placeholder" to "自定义placeholder的样式", "placeholder-style" to "color: black"), null, 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "圆角", "note" to "自定义输入框的圆角，更具特色"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_input, utsMapOf("modelValue" to unref(kVal), "onUpdate:modelValue" to fun(`$event`: String){
                                            trySetRefValue(kVal, `$event`);
                                        }
                                        , "class" to "spacing", "placeholder" to "圆形", "border-radius" to "100px"), null, 8, utsArrayOf(
                                            "modelValue"
                                        )),
                                        createVNode(_component_sn_input, utsMapOf("modelValue" to unref(kVal), "onUpdate:modelValue" to fun(`$event`: String){
                                            trySetRefValue(kVal, `$event`);
                                        }
                                        , "class" to "spacing", "placeholder" to "圆角矩形", "border-radius" to "15px"), null, 8, utsArrayOf(
                                            "modelValue"
                                        )),
                                        createVNode(_component_sn_input, utsMapOf("modelValue" to unref(kVal), "onUpdate:modelValue" to fun(`$event`: String){
                                            trySetRefValue(kVal, `$event`);
                                        }
                                        , "placeholder" to "异形", "border-radius" to "15px 0 15px 0"), null, 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "颜色", "note" to "输入框的各种颜色，由你决定"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_input, utsMapOf("modelValue" to unref(kVal), "onUpdate:modelValue" to fun(`$event`: String){
                                            trySetRefValue(kVal, `$event`);
                                        }
                                        , "placeholder" to "自定义颜色", "border-radius" to "15px", "bgColor" to unref(colors).info, "activeBgColor" to unref(colors).info, "text-color" to "#35b571", "active-border-color" to "#35b571", "border-width" to "2px", "cursor-color" to "#35b571"), null, 8, utsArrayOf(
                                            "modelValue",
                                            "bgColor",
                                            "activeBgColor"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "边框", "note" to "当默认的边框太过突兀时，可以取消边框的显示"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_input, utsMapOf("modelValue" to unref(kVal), "onUpdate:modelValue" to fun(`$event`: String){
                                            trySetRefValue(kVal, `$event`);
                                        }
                                        , "class" to "spacing", "placeholder" to "无边框", "borderRadius" to "15px", "bgColor" to unref(colors).info, "activeBgColor" to unref(colors).info, "border-color" to "transparent"), null, 8, utsArrayOf(
                                            "modelValue",
                                            "bgColor",
                                            "activeBgColor"
                                        )),
                                        createVNode(_component_sn_input, utsMapOf("modelValue" to unref(kVal), "onUpdate:modelValue" to fun(`$event`: String){
                                            trySetRefValue(kVal, `$event`);
                                        }
                                        , "class" to "spacing", "placeholder" to "无焦点边框", "border-radius" to "15px", "bgColor" to unref(colors).info, "activeBgColor" to unref(colors).info, "activeBorder" to false), null, 8, utsArrayOf(
                                            "modelValue",
                                            "bgColor",
                                            "activeBgColor"
                                        )),
                                        createVNode(_component_sn_input, utsMapOf("modelValue" to unref(kVal), "onUpdate:modelValue" to fun(`$event`: String){
                                            trySetRefValue(kVal, `$event`);
                                        }
                                        , "class" to "spacing", "placeholder" to "完全无边框", "borderRadius" to "15px", "bgColor" to unref(colors).info, "activeBgColor" to unref(colors).info, "border" to false), null, 8, utsArrayOf(
                                            "modelValue",
                                            "bgColor",
                                            "activeBgColor"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "类型", "note" to "不同的场景对输入的数据也是有要求的"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_input, utsMapOf("type" to "text", "class" to "spacing", "placeholder" to "文字输入框", "border-radius" to "15px", "bgColor" to unref(colors).info, "borderColor" to unref(colors).info), null, 8, utsArrayOf(
                                            "bgColor",
                                            "borderColor"
                                        )),
                                        createVNode(_component_sn_input, utsMapOf("type" to "password", "class" to "spacing", "placeholder" to "密码输入框", "border-radius" to "15px", "bgColor" to unref(colors).info, "borderColor" to unref(colors).info), null, 8, utsArrayOf(
                                            "bgColor",
                                            "borderColor"
                                        )),
                                        createVNode(_component_sn_input, utsMapOf("type" to "number", "class" to "spacing", "placeholder" to "数字输入框", "border-radius" to "15px", "bgColor" to unref(colors).info, "borderColor" to unref(colors).info), null, 8, utsArrayOf(
                                            "bgColor",
                                            "borderColor"
                                        )),
                                        createVNode(_component_sn_input, utsMapOf("type" to "digit", "class" to "spacing", "placeholder" to "带小数点数字输入框", "border-radius" to "15px", "bgColor" to unref(colors).info, "borderColor" to unref(colors).info), null, 8, utsArrayOf(
                                            "bgColor",
                                            "borderColor"
                                        )),
                                        createVNode(_component_sn_input, utsMapOf("type" to "tel", "class" to "spacing", "placeholder" to "电话输入框", "border-radius" to "15px", "bgColor" to unref(colors).info, "borderColor" to unref(colors).info), null, 8, utsArrayOf(
                                            "bgColor",
                                            "borderColor"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "键盘右下角按钮", "note" to "自定义键盘右下角显示的文字，也许能帮你省下一个按钮的空间\\n（输入法不同，实际显示会有一定差异）"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_input, utsMapOf("modelValue" to unref(kVal), "onUpdate:modelValue" to fun(`$event`: String){
                                            trySetRefValue(kVal, `$event`);
                                        }
                                        , "class" to "spacing", "confirm-type" to "done", "placeholder" to "完成", "border-radius" to "15px", "bgColor" to unref(colors).info, "borderColor" to unref(colors).info), null, 8, utsArrayOf(
                                            "modelValue",
                                            "bgColor",
                                            "borderColor"
                                        )),
                                        createVNode(_component_sn_input, utsMapOf("modelValue" to unref(kVal), "onUpdate:modelValue" to fun(`$event`: String){
                                            trySetRefValue(kVal, `$event`);
                                        }
                                        , "class" to "spacing", "confirm-type" to "next", "placeholder" to "下一步", "border-radius" to "15px", "bgColor" to unref(colors).info, "borderColor" to unref(colors).info), null, 8, utsArrayOf(
                                            "modelValue",
                                            "bgColor",
                                            "borderColor"
                                        )),
                                        createVNode(_component_sn_input, utsMapOf("modelValue" to unref(kVal), "onUpdate:modelValue" to fun(`$event`: String){
                                            trySetRefValue(kVal, `$event`);
                                        }
                                        , "class" to "spacing", "confirm-type" to "send", "placeholder" to "发送", "border-radius" to "15px", "bgColor" to unref(colors).info, "borderColor" to unref(colors).info), null, 8, utsArrayOf(
                                            "modelValue",
                                            "bgColor",
                                            "borderColor"
                                        )),
                                        createVNode(_component_sn_input, utsMapOf("modelValue" to unref(kVal), "onUpdate:modelValue" to fun(`$event`: String){
                                            trySetRefValue(kVal, `$event`);
                                        }
                                        , "class" to "spacing", "confirm-type" to "search", "placeholder" to "搜索", "border-radius" to "15px", "bgColor" to unref(colors).info, "borderColor" to unref(colors).info), null, 8, utsArrayOf(
                                            "modelValue",
                                            "bgColor",
                                            "borderColor"
                                        )),
                                        createVNode(_component_sn_input, utsMapOf("modelValue" to unref(kVal), "onUpdate:modelValue" to fun(`$event`: String){
                                            trySetRefValue(kVal, `$event`);
                                        }
                                        , "class" to "spacing", "confirm-type" to "go", "placeholder" to "前往", "border-radius" to "15px", "bgColor" to unref(colors).info, "borderColor" to unref(colors).info), null, 8, utsArrayOf(
                                            "modelValue",
                                            "bgColor",
                                            "borderColor"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "上推界面", "note" to "用于确定键盘弹起时是否自动上推页面，默认开启"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_input, utsMapOf("modelValue" to unref(kVal), "onUpdate:modelValue" to fun(`$event`: String){
                                            trySetRefValue(kVal, `$event`);
                                        }
                                        , "class" to "spacing", "adjust-position" to false, "placeholder" to "禁用自动上推界面", "border-radius" to "15px", "bgColor" to unref(colors).info, "borderColor" to unref(colors).info), null, 8, utsArrayOf(
                                            "modelValue",
                                            "bgColor",
                                            "borderColor"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "焦点", "note" to "输入框也可以自由控制焦点"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_card, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_row, utsMapOf("justify" to "space-between"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                                    return utsArrayOf(
                                                        createVNode(_component_sn_text, utsMapOf("text" to "获得焦点", "size" to unref(`$snui`).utils.addUnit(unref(`$snui`).utils.getPx(unref(`$snui`).configs.font.size(3)) + 1)), null, 8, utsArrayOf(
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
                                        createVNode(_component_sn_input, utsMapOf("modelValue" to unref(kVal), "onUpdate:modelValue" to fun(`$event`: String){
                                            trySetRefValue(kVal, `$event`);
                                        }
                                        , "placeholder" to "自由控制焦点", "border-radius" to "15px", "bgColor" to unref(colors).info, "focus" to unref(focus), "maxlength" to 10, "borderColor" to unref(colors).info), null, 8, utsArrayOf(
                                            "modelValue",
                                            "bgColor",
                                            "focus",
                                            "borderColor"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "最大输入长度", "note" to "限制字数的工具，默认设为-1（不限制）"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_input, utsMapOf("placeholder" to "限制10字", "border-radius" to "15px", "bgColor" to unref(colors).info, "maxlength" to 10, "borderColor" to unref(colors).info), null, 8, utsArrayOf(
                                            "bgColor",
                                            "borderColor"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "加载", "note" to "给输入框加入加载动效，至少看起来没有在偷懒"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_card, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_row, utsMapOf("justify" to "space-between"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                                    return utsArrayOf(
                                                        createVNode(_component_sn_text, utsMapOf("text" to "加载中", "size" to unref(`$snui`).utils.addUnit(unref(`$snui`).utils.getPx(unref(`$snui`).configs.font.size(3)) + 1)), null, 8, utsArrayOf(
                                                            "size"
                                                        )),
                                                        createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(loading), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                                            trySetRefValue(loading, `$event`);
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
                                        createVNode(_component_sn_input, utsMapOf("modelValue" to unref(kVal), "onUpdate:modelValue" to fun(`$event`: String){
                                            trySetRefValue(kVal, `$event`);
                                        }
                                        , "placeholder" to "加载中", "border-radius" to "15px", "bgColor" to unref(colors).info, "border-color" to "transparent", "loading" to unref(loading)), null, 8, utsArrayOf(
                                            "modelValue",
                                            "bgColor",
                                            "loading"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "禁用", "note" to "禁用输入框，也许能让有些人闭嘴"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_input, utsMapOf("modelValue" to unref(kVal), "onUpdate:modelValue" to fun(`$event`: String){
                                            trySetRefValue(kVal, `$event`);
                                        }
                                        , "placeholder" to "禁用", "border-radius" to "15px", "bgColor" to unref(colors).info, "border-color" to "transparent", "disabled" to ""), null, 8, utsArrayOf(
                                            "modelValue",
                                            "bgColor"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "可清除内容", "note" to "有时候可能会需要快捷地清除已输入的内容，为了少写点代码，就内置了这个功能"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_input, utsMapOf("modelValue" to unref(kVal), "onUpdate:modelValue" to fun(`$event`: String){
                                            trySetRefValue(kVal, `$event`);
                                        }
                                        , "placeholder" to "搜索", "border-radius" to "15px", "clearable" to "", "border" to false, "bgColor" to unref(colors).info, "activeBgColor" to unref(colors).info), null, 8, utsArrayOf(
                                            "modelValue",
                                            "bgColor",
                                            "activeBgColor"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "字体大小", "note" to "适配多种复杂场景"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_input, utsMapOf("placeholder" to "搜索", "text-size" to "23px", "padding" to "18px 20px", "border-radius" to "100px", "icon-size" to "24px", "icon-color" to "#676767", "prefix-icon" to "search-2-line", "bgColor" to unref(colors).info, "activeBgColor" to unref(colors).info, "border" to false), null, 8, utsArrayOf(
                                            "bgColor",
                                            "activeBgColor"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "前缀&后缀", "note" to "在输入框的前后插入一些元素，比如图标"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_input, utsMapOf("placeholder" to "搜索", "class" to "spacing", "border-radius" to "15px", "prefix-icon" to "search-2-line", "icon-size" to "16px", "icon-color" to "#676767", "border" to false, "bgColor" to unref(colors).info, "activeBgColor" to unref(colors).info), null, 8, utsArrayOf(
                                            "bgColor",
                                            "activeBgColor"
                                        )),
                                        createVNode(_component_sn_input, utsMapOf("placeholder" to "请输入网址", "border-radius" to "15px", "bgColor" to unref(colors).info, "activeBgColor" to unref(colors).info, "border" to false), utsMapOf("prefix" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_text, utsMapOf("text" to "https://", "color" to unref(colors).text, "size" to "18px", "style" to normalizeStyle(utsMapOf("margin-right" to "5px"))), null, 8, utsArrayOf(
                                                    "color",
                                                    "style"
                                                ))
                                            );
                                        }
                                        ), "suffix" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_button, utsMapOf("level" to "second", "type" to "primary", "round-size" to "35px", "round" to "", "style" to normalizeStyle(utsMapOf("margin" to "0px -3px 0px 5px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                                    return utsArrayOf(
                                                        createVNode(_component_sn_icon, utsMapOf("name" to "arrow-right-line", "color" to unref(colors).primary, "size" to "18px"), null, 8, utsArrayOf(
                                                            "color"
                                                        ))
                                                    );
                                                }
                                                ), "_" to 1), 8, utsArrayOf(
                                                    "style"
                                                ))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "bgColor",
                                            "activeBgColor"
                                        ))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1), 8, utsArrayOf(
                            "loading"
                        ))
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
