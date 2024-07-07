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
open class GenPagesComponentsSnButton : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnButton) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnButton;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val paused = ref(false);
            val loading = ref(false);
            val loading2 = ref(false);
            val disabled = ref(false);
            fun genLoadDataFn() {
                loading.value = true;
                setTimeout(fun(){
                    loading.value = false;
                }
                , 2000);
            }
            val loadData = ::genLoadDataFn;
            fun genLoadData2Fn() {
                if (!disabled.value) {
                    loading2.value = true;
                    setTimeout(fun(){
                        loading2.value = false;
                    }
                    , 2000);
                }
            }
            val loadData2 = ::genLoadData2Fn;
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_button = resolveEasyComponent("sn-button", GenUniModulesSinleUiComponentsSnButtonSnButtonClass);
                val _component_sn_row = resolveEasyComponent("sn-row", GenUniModulesSinleUiComponentsSnRowSnRowClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_icon = resolveEasyComponent("sn-icon", GenUniModulesSinleUiComponentsSnIconSnIconClass);
                val _component_sn_button_group = resolveEasyComponent("sn-button-group", GenUniModulesSinleUiComponentsSnButtonGroupSnButtonGroupClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_sn_switch = resolveEasyComponent("sn-switch", GenUniModulesSinleUiComponentsSnSwitchSnSwitchClass);
                val _component_sn_card = resolveEasyComponent("sn-card", GenUniModulesSinleUiComponentsSnCardSnCardClass);
                val _component_sn_line = resolveEasyComponent("sn-line", GenUniModulesSinleUiComponentsSnLineSnLineClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Button 按钮")),
                        createVNode(_component_com_card, utsMapOf("title" to "基础用法", "note" to "普普通通的按钮，内置了一套样式，自由可调"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, utsMapOf("style" to normalizeStyle(utsMapOf("flex-wrap" to "wrap"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "text" to "Info")),
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "text" to "Primary", "type" to "primary")),
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "text" to "Warning", "type" to "warning")),
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "text" to "Success", "type" to "success")),
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "text" to "Error", "type" to "error"))
                                    );
                                }
                                ), "_" to 1), 8, utsArrayOf(
                                    "style"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "二级按钮", "note" to "第二级的按钮，用于次要操作"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, utsMapOf("style" to normalizeStyle(utsMapOf("flex-wrap" to "wrap"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "level" to "second", "text" to "Info")),
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "level" to "second", "text" to "Primary", "type" to "primary")),
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "level" to "second", "text" to "Warning", "type" to "warning")),
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "level" to "second", "text" to "Success", "type" to "success")),
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "level" to "second", "text" to "Error", "type" to "error"))
                                    );
                                }
                                ), "_" to 1), 8, utsArrayOf(
                                    "style"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "三级按钮", "note" to "第三级的按钮，用于不是太重要的操作"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, utsMapOf("style" to normalizeStyle(utsMapOf("flex-wrap" to "wrap"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "level" to "third", "text" to "Info")),
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "level" to "third", "text" to "Primary", "type" to "primary")),
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "level" to "third", "text" to "Warning", "type" to "warning")),
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "level" to "third", "text" to "Success", "type" to "success")),
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "level" to "third", "text" to "Error", "type" to "error"))
                                    );
                                }
                                ), "_" to 1), 8, utsArrayOf(
                                    "style"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "最低级按钮", "note" to "最低级的按钮，或许也能用来美化界面"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, utsMapOf("style" to normalizeStyle(utsMapOf("flex-wrap" to "wrap"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "level" to "least", "text" to "Info")),
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "level" to "least", "text" to "Primary", "type" to "primary")),
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "level" to "least", "text" to "Warning", "type" to "warning")),
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "level" to "least", "text" to "Success", "type" to "success")),
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "level" to "least", "text" to "Error", "type" to "error")),
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "level" to "least", "round" to "", "roundSize" to "35px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_icon, utsMapOf("name" to "home-5-line"))
                                            );
                                        }
                                        ), "_" to 1)),
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "level" to "least", "round" to "", "roundSize" to "35px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_icon, utsMapOf("name" to "bookmark-2-line"))
                                            );
                                        }
                                        ), "_" to 1))
                                    );
                                }
                                ), "_" to 1), 8, utsArrayOf(
                                    "style"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "虚线按钮", "note" to "看腻了传统的按钮边框？试试虚线边框"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, utsMapOf("style" to normalizeStyle(utsMapOf("flex-wrap" to "wrap"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "dashed" to "", "text" to "Info")),
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "dashed" to "", "text" to "Primary", "type" to "primary")),
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "dashed" to "", "text" to "Warning", "type" to "warning")),
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "dashed" to "", "text" to "Success", "type" to "success")),
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "dashed" to "", "text" to "Error", "type" to "error")),
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "dashed" to "", "round" to "", "type" to "success"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_icon, utsMapOf("name" to "headphone-line", "color" to "#35b571"))
                                            );
                                        }
                                        ), "_" to 1))
                                    );
                                }
                                ), "_" to 1), 8, utsArrayOf(
                                    "style"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "加载动效", "note" to "加载中的按钮，使用户更有耐心去等待"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_button_group, utsMapOf("vertical" to ""), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "width" to "80px", "loading" to unref(loading), "level" to "second", "text" to "Info", "onClick" to fun(){
                                            loadData();
                                        }
                                        ), null, 8, utsArrayOf(
                                            "loading",
                                            "onClick"
                                        )),
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "width" to "80px", "loading" to unref(loading), "level" to "second", "text" to "Primary", "type" to "primary", "onClick" to fun(){
                                            loadData();
                                        }
                                        ), null, 8, utsArrayOf(
                                            "loading",
                                            "onClick"
                                        )),
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "width" to "80px", "loading" to unref(loading), "level" to "second", "text" to "Warning", "type" to "warning", "onClick" to fun(){
                                            loadData();
                                        }
                                        ), null, 8, utsArrayOf(
                                            "loading",
                                            "onClick"
                                        )),
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "width" to "80px", "loading" to unref(loading), "level" to "second", "text" to "Success", "type" to "success", "onClick" to fun(){
                                            loadData();
                                        }
                                        ), null, 8, utsArrayOf(
                                            "loading",
                                            "onClick"
                                        )),
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "width" to "80px", "loading" to unref(loading), "level" to "second", "text" to "Error", "type" to "error", "onClick" to fun(){
                                            loadData();
                                        }
                                        ), null, 8, utsArrayOf(
                                            "loading",
                                            "onClick"
                                        )),
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "round-size" to "45px", "loading" to unref(loading), "round" to "", "type" to "info", "onClick" to fun(){
                                            loadData();
                                        }
                                        ), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_icon, utsMapOf("name" to "heart-2-fill"))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "loading",
                                            "onClick"
                                        ))
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "禁用按钮", "note" to "无关人员止步，前方机密要地"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_card, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_row, utsMapOf("align" to "center", "justify" to "space-between"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_text, utsMapOf("text" to "是否禁用", "size" to ("" + (unref(`$snui`).utils.getPx(unref(`$snui`).configs.font.size(3)) + 1) + "px")), null, 8, utsArrayOf(
                                                    "size"
                                                )),
                                                createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(disabled), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                                    trySetRefValue(disabled, `$event`);
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
                                createVNode(_component_sn_row, utsMapOf("style" to normalizeStyle(utsMapOf("flex-wrap" to "wrap"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "level" to "second", "text" to "获取机密数据", "loading" to unref(loading2), "disabled" to unref(disabled), "onClick" to fun(){
                                            loadData2();
                                        }
                                        ), null, 8, utsArrayOf(
                                            "loading",
                                            "disabled",
                                            "onClick"
                                        ))
                                    );
                                }
                                ), "_" to 1), 8, utsArrayOf(
                                    "style"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "自定义样式", "note" to "多姿多彩，追求独特"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_line),
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "round" to ""), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_icon, utsMapOf("name" to "headphone-fill", "size" to "20px"))
                                            );
                                        }
                                        ), "_" to 1)),
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "type" to "primary", "round" to ""), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_icon, utsMapOf("name" to "home-smile-fill", "color" to "#fff", "size" to "20px"))
                                            );
                                        }
                                        ), "_" to 1)),
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "level" to "second", "type" to "error", "round" to ""), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_icon, utsMapOf("name" to "heart-fill", "color" to "#fc5454", "size" to "20px"))
                                            );
                                        }
                                        ), "_" to 1)),
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "level" to "third", "type" to "warning", "round" to ""), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_icon, utsMapOf("name" to "star-fill", "color" to "#f6b142", "size" to "20px"))
                                            );
                                        }
                                        ), "_" to 1))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_sn_line),
                                createVNode(_component_sn_row, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "round-size" to "50px", "round" to ""), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_icon, utsMapOf("name" to "skip-left-fill"))
                                            );
                                        }
                                        ), "_" to 1)),
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "round-size" to "60px", "round" to "", "onClick" to fun(){
                                            paused.value = !unref(paused);
                                        }
                                        ), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_icon, utsMapOf("name" to if (unref(paused)) {
                                                    "pause-fill";
                                                } else {
                                                    "play-fill";
                                                }
                                                ), null, 8, utsArrayOf(
                                                    "name"
                                                ))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "onClick"
                                        )),
                                        createVNode(_component_sn_button, utsMapOf("class" to "button", "round-size" to "50px", "round" to ""), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_icon, utsMapOf("name" to "skip-right-fill"))
                                            );
                                        }
                                        ), "_" to 1))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_sn_line),
                                createVNode(_component_sn_row, utsMapOf("align" to "center", "merge" to ""), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_button, utsMapOf("text" to "Left", "border-radius" to "100px 0 0 100px", "bounces" to false)),
                                        createVNode(_component_sn_button, utsMapOf("text" to "Center", "border-radius" to "0", "bounces" to false, "style" to normalizeStyle(utsMapOf("border-left" to "1px solid #ededed", "border-right" to "1px solid #ededed"))), null, 8, utsArrayOf(
                                            "style"
                                        )),
                                        createVNode(_component_sn_button, utsMapOf("bounces" to false, "border-radius" to "0 100px 100px 0", "text" to "Right"))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_sn_line),
                                createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("flex-direction" to "row", "justify-content" to "space-around"))), utsArrayOf(
                                    createVNode(_component_sn_button_group, utsMapOf("vertical" to "", "merge" to ""), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            createVNode(_component_sn_button, utsMapOf("bounces" to false, "type" to "primary", "level" to "second", "border-radius" to "20px 20px 0 0", "text" to "运动", "style" to normalizeStyle(utsMapOf("width" to "100px"))), null, 8, utsArrayOf(
                                                "style"
                                            )),
                                            createVNode(_component_sn_button, utsMapOf("bounces" to false, "type" to "success", "level" to "second", "border-radius" to "0", "text" to "睡眠", "style" to normalizeStyle(utsMapOf("width" to "100px"))), null, 8, utsArrayOf(
                                                "style"
                                            )),
                                            createVNode(_component_sn_button, utsMapOf("bounces" to false, "type" to "warning", "level" to "second", "border-radius" to "0", "text" to "学习", "style" to normalizeStyle(utsMapOf("width" to "100px"))), null, 8, utsArrayOf(
                                                "style"
                                            )),
                                            createVNode(_component_sn_button, utsMapOf("bounces" to false, "type" to "error", "level" to "second", "border-radius" to "0 0 20px 20px", "text" to "工作", "style" to normalizeStyle(utsMapOf("width" to "100px"))), null, 8, utsArrayOf(
                                                "style"
                                            ))
                                        );
                                    }
                                    ), "_" to 1)),
                                    createVNode(_component_sn_button_group, utsMapOf("vertical" to ""), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            createVNode(_component_sn_button, utsMapOf("bgColor" to "#ceddf0", "activeBgColor" to "#becddd", "width" to "120px", "text" to "莫兰迪蓝", "textColor" to "#2b2b2b")),
                                            createVNode(_component_sn_button, utsMapOf("bgColor" to "#bfd2bd", "activeBgColor" to "#aebfac", "width" to "120px", "text" to "莫兰迪绿", "textColor" to "#2b2b2b")),
                                            createVNode(_component_sn_button, utsMapOf("bgColor" to "#e6dec0", "activeBgColor" to "#c8c1a7", "width" to "120px", "text" to "莫兰迪棕", "textColor" to "#2b2b2b")),
                                            createVNode(_component_sn_button, utsMapOf("bgColor" to "#e3e4df", "activeBgColor" to "#cfd0cc", "width" to "120px", "text" to "莫兰迪灰", "textColor" to "#2b2b2b"))
                                        );
                                    }
                                    ), "_" to 1))
                                ), 4)
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "竖向排列&长按钮", "note" to "像列表一样的长按钮组，你喜欢吗"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_button_group, utsMapOf("vertical" to ""), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_button, utsMapOf("long" to "", "text" to "Info")),
                                        createVNode(_component_sn_button, utsMapOf("long" to "", "text" to "Primary", "type" to "primary", "level" to "second")),
                                        createVNode(_component_sn_button, utsMapOf("long" to "", "text" to "Success", "type" to "success", "level" to "second")),
                                        createVNode(_component_sn_button, utsMapOf("long" to "", "text" to "Warning", "type" to "warning", "level" to "second")),
                                        createVNode(_component_sn_button, utsMapOf("long" to "", "text" to "Error", "type" to "error", "level" to "second"))
                                    );
                                }
                                ), "_" to 1))
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
                return utsMapOf("button" to padStyleMapOf(utsMapOf("marginTop" to 0, "marginRight" to 5, "marginBottom" to 5, "marginLeft" to 0)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
