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
open class GenPagesComponentsSnRadio : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnRadio) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnRadio;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val v1 = ref(0);
            val v2 = ref(0);
            val v3 = ref(0);
            val v4 = ref(0);
            val v5 = ref(1);
            val v6 = ref(0);
            val v7 = ref(0);
            val v8 = ref(0);
            val v9 = ref(0);
            val v10 = ref(0);
            val loadingComponents = ref(true);
            val theme = computed(fun(): String {
                return `$snui`.configs.app.theme;
            }
            );
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
                val _component_sn_radio = resolveEasyComponent("sn-radio", GenUniModulesSinleUiComponentsSnRadioSnRadioClass);
                val _component_sn_radio_group = resolveEasyComponent("sn-radio-group", GenUniModulesSinleUiComponentsSnRadioGroupSnRadioGroupClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_radio_tag = resolveEasyComponent("sn-radio-tag", GenUniModulesSinleUiComponentsSnRadioTagSnRadioTagClass);
                val _component_sn_button = resolveEasyComponent("sn-button", GenUniModulesSinleUiComponentsSnButtonSnButtonClass);
                val _component_sn_button_group = resolveEasyComponent("sn-button-group", GenUniModulesSinleUiComponentsSnButtonGroupSnButtonGroupClass);
                val _component_sn_view = resolveEasyComponent("sn-view", GenUniModulesSinleUiComponentsSnViewSnViewClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Radio 单选")),
                        createVNode(_component_sn_view, utsMapOf("loading" to unref(loadingComponents)), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_com_card, utsMapOf("title" to "基础用法", "note" to "普普通通的单选组件，用于数据选择\\n（注意：一组sn-radio、sn-radio-tag必须放在sn-radio-group里）"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_radio_group, utsMapOf("modelValue" to unref(v1), "onUpdate:modelValue" to fun(`$event`: Number){
                                            trySetRefValue(v1, `$event`);
                                        }
                                        ), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_radio, utsMapOf("text" to "确定")),
                                                createVNode(_component_sn_radio, utsMapOf("text" to "取消"))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "类型", "note" to "自定义单选组显示的样式（支持两种组件：sn-radio 和 sn-radio-tag）"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_radio_group, utsMapOf("class" to "spacing", "modelValue" to unref(v2), "onUpdate:modelValue" to fun(`$event`: Number){
                                            trySetRefValue(v2, `$event`);
                                        }
                                        ), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_radio, utsMapOf("text" to "东方")),
                                                createVNode(_component_sn_radio, utsMapOf("text" to "西方"))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "modelValue"
                                        )),
                                        createVNode(_component_sn_radio_group, utsMapOf("class" to "spacing", "modelValue" to unref(v2), "onUpdate:modelValue" to fun(`$event`: Number){
                                            trySetRefValue(v2, `$event`);
                                        }
                                        ), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_radio_tag, utsMapOf("text" to "东方")),
                                                createVNode(_component_sn_radio_tag, utsMapOf("text" to "西方"))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "间隔", "note" to "单选组件可设置统一的间隔。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_radio_group, utsMapOf("modelValue" to unref(v3), "onUpdate:modelValue" to fun(`$event`: Number){
                                            trySetRefValue(v3, `$event`);
                                        }
                                        , "spacing" to "30px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_radio, utsMapOf("text" to "男")),
                                                createVNode(_component_sn_radio, utsMapOf("text" to "女")),
                                                createVNode(_component_sn_radio, utsMapOf("text" to "未知"))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "modelValue"
                                        )),
                                        createVNode(_component_sn_radio_group, utsMapOf("modelValue" to unref(v3), "onUpdate:modelValue" to fun(`$event`: Number){
                                            trySetRefValue(v3, `$event`);
                                        }
                                        , "spacing" to "30px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_radio_tag, utsMapOf("text" to "男")),
                                                createVNode(_component_sn_radio_tag, utsMapOf("text" to "女")),
                                                createVNode(_component_sn_radio_tag, utsMapOf("text" to "未知"))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "圆角 【Tag 特色】", "note" to "tag 单选组件可设置统一的圆角。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_radio_group, utsMapOf("modelValue" to unref(v3), "onUpdate:modelValue" to fun(`$event`: Number){
                                            trySetRefValue(v3, `$event`);
                                        }
                                        , "tagBorderRadius" to "100px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_radio_tag, utsMapOf("text" to "男")),
                                                createVNode(_component_sn_radio_tag, utsMapOf("text" to "女")),
                                                createVNode(_component_sn_radio_tag, utsMapOf("text" to "未知"))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "方向", "note" to "单选组可以设置排列的方向（竖向和横向），适用于多种场景"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_radio_group, utsMapOf("modelValue" to unref(v4), "onUpdate:modelValue" to fun(`$event`: Number){
                                            trySetRefValue(v4, `$event`);
                                        }
                                        , "vertical" to "", "spacing" to "20px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_radio, utsMapOf("text" to "中文")),
                                                createVNode(_component_sn_radio, utsMapOf("text" to "英文")),
                                                createVNode(_component_sn_radio, utsMapOf("text" to "法文"))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "modelValue"
                                        )),
                                        createVNode(_component_sn_radio_group, utsMapOf("modelValue" to unref(v4), "onUpdate:modelValue" to fun(`$event`: Number){
                                            trySetRefValue(v4, `$event`);
                                        }
                                        , "vertical" to "", "spacing" to "10px", "tagPadding" to "8px 0"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_radio_tag, utsMapOf("text" to "中文")),
                                                createVNode(_component_sn_radio_tag, utsMapOf("text" to "英文")),
                                                createVNode(_component_sn_radio_tag, utsMapOf("text" to "法文"))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "默认值", "note" to "单选组可以设置默认的选项，更懂用户的选择"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_radio_group, utsMapOf("modelValue" to unref(v5), "onUpdate:modelValue" to fun(`$event`: Number){
                                            trySetRefValue(v5, `$event`);
                                        }
                                        , "spacing" to "30px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_radio, utsMapOf("text" to "篮球")),
                                                createVNode(_component_sn_radio, utsMapOf("text" to "足球")),
                                                createVNode(_component_sn_radio, utsMapOf("text" to "网球"))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "modelValue"
                                        )),
                                        createVNode(_component_sn_radio_group, utsMapOf("modelValue" to unref(v5), "onUpdate:modelValue" to fun(`$event`: Number){
                                            trySetRefValue(v5, `$event`);
                                        }
                                        , "type" to "tag", "spacing" to "30px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_radio_tag, utsMapOf("text" to "篮球")),
                                                createVNode(_component_sn_radio_tag, utsMapOf("text" to "足球")),
                                                createVNode(_component_sn_radio_tag, utsMapOf("text" to "网球"))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "颜色", "note" to "单选可以设置一个统一的颜色"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_radio_group, utsMapOf("modelValue" to unref(v6), "onUpdate:modelValue" to fun(`$event`: Number){
                                            trySetRefValue(v6, `$event`);
                                        }
                                        , "spacing" to "30px", "radioBorderColor" to unref(colors).dark, "radioActiveColor" to unref(colors).dark, "radioActiveBorderColor" to unref(colors).dark), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_radio, utsMapOf("text" to "篮球")),
                                                createVNode(_component_sn_radio, utsMapOf("text" to "足球")),
                                                createVNode(_component_sn_radio, utsMapOf("text" to "网球"))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "modelValue",
                                            "radioBorderColor",
                                            "radioActiveColor",
                                            "radioActiveBorderColor"
                                        )),
                                        createVNode(_component_sn_radio_group, utsMapOf("modelValue" to unref(v6), "onUpdate:modelValue" to fun(`$event`: Number){
                                            trySetRefValue(v6, `$event`);
                                        }
                                        , "spacing" to "30px", "tagActiveBorderColor" to unref(colors).dark, "tagActiveTextColor" to unref(colors).front, "tagTextColor" to unref(colors).infoDark, "tagActiveBgColor" to unref(colors).dark), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_radio_tag, utsMapOf("text" to "篮球")),
                                                createVNode(_component_sn_radio_tag, utsMapOf("text" to "足球")),
                                                createVNode(_component_sn_radio_tag, utsMapOf("text" to "网球"))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "modelValue",
                                            "tagActiveBorderColor",
                                            "tagActiveTextColor",
                                            "tagTextColor",
                                            "tagActiveBgColor"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "禁用", "note" to "为单个单选设置禁用状态\\n注意：只是禁用手动点击，不会屏蔽数据的修改"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_radio_group, utsMapOf("modelValue" to unref(v7), "onUpdate:modelValue" to fun(`$event`: Number){
                                            trySetRefValue(v7, `$event`);
                                        }
                                        , "spacing" to "30px", "radioActiveColor" to "#b8ccc0"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_radio, utsMapOf("text" to "UTS")),
                                                createVNode(_component_sn_radio, utsMapOf("text" to "TS")),
                                                createVNode(_component_sn_radio, utsMapOf("text" to "JS", "disabled" to ""))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "modelValue"
                                        )),
                                        createVNode(_component_sn_radio_group, utsMapOf("modelValue" to unref(v8), "onUpdate:modelValue" to fun(`$event`: Number){
                                            trySetRefValue(v8, `$event`);
                                        }
                                        , "spacing" to "30px", "radioActiveColor" to "#b8ccc0"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_radio, utsMapOf("disabled" to "", "text" to "百年难遇")),
                                                createVNode(_component_sn_radio, utsMapOf("text" to "普通")),
                                                createVNode(_component_sn_radio, utsMapOf("text" to "珍贵"))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "modelValue"
                                        )),
                                        createVNode(_component_sn_radio_group, utsMapOf("modelValue" to unref(v7), "onUpdate:modelValue" to fun(`$event`: Number){
                                            trySetRefValue(v7, `$event`);
                                        }
                                        ), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_radio_tag, utsMapOf("text" to "UTS")),
                                                createVNode(_component_sn_radio_tag, utsMapOf("text" to "TS")),
                                                createVNode(_component_sn_radio_tag, utsMapOf("text" to "JS", "disabled" to ""))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "modelValue"
                                        )),
                                        createVNode(_component_sn_radio_group, utsMapOf("modelValue" to unref(v8), "onUpdate:modelValue" to fun(`$event`: Number){
                                            trySetRefValue(v8, `$event`);
                                        }
                                        ), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_radio_tag, utsMapOf("disabled" to "", "text" to "百年难遇")),
                                                createVNode(_component_sn_radio_tag, utsMapOf("text" to "普通")),
                                                createVNode(_component_sn_radio_tag, utsMapOf("text" to "珍贵"))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "手动修改", "note" to "手动修改radio的值，适用于自动化等场景"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_button_group, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_button, utsMapOf("text" to "选中UTS", "onClick" to fun(){
                                                    v9.value = 0;
                                                }
                                                ), null, 8, utsArrayOf(
                                                    "onClick"
                                                )),
                                                createVNode(_component_sn_button, utsMapOf("text" to "选中TS", "onClick" to fun(){
                                                    v9.value = 1;
                                                }
                                                ), null, 8, utsArrayOf(
                                                    "onClick"
                                                )),
                                                createVNode(_component_sn_button, utsMapOf("text" to "选中JS", "onClick" to fun(){
                                                    v9.value = 2;
                                                }
                                                ), null, 8, utsArrayOf(
                                                    "onClick"
                                                ))
                                            );
                                        }
                                        ), "_" to 1)),
                                        createVNode(_component_sn_radio_group, utsMapOf("modelValue" to unref(v9), "onUpdate:modelValue" to fun(`$event`: Number){
                                            trySetRefValue(v9, `$event`);
                                        }
                                        , "spacing" to "30px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_radio, utsMapOf("text" to "UTS")),
                                                createVNode(_component_sn_radio, utsMapOf("text" to "TS")),
                                                createVNode(_component_sn_radio, utsMapOf("text" to "JS", "disabled" to ""))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "modelValue"
                                        )),
                                        createVNode(_component_sn_radio_group, utsMapOf("modelValue" to unref(v9), "onUpdate:modelValue" to fun(`$event`: Number){
                                            trySetRefValue(v9, `$event`);
                                        }
                                        , "type" to "tag", "style" to normalizeStyle(utsMapOf("margin" to "10px 0"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_radio_tag, utsMapOf("text" to "UTS")),
                                                createVNode(_component_sn_radio_tag, utsMapOf("text" to "TS")),
                                                createVNode(_component_sn_radio_tag, utsMapOf("text" to "JS", "disabled" to ""))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "modelValue",
                                            "style"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "自定义样式", "note" to "通过丰富的组件属性，你可以自由地控制组件每个部分的样式，实现一些很酷的东西，比如下面这个高仿某大厂软件界面"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_radio_group, utsMapOf("modelValue" to unref(v10), "onUpdate:modelValue" to fun(`$event`: Number){
                                            trySetRefValue(v10, `$event`);
                                        }
                                        , "spacing" to "10px", "tagActiveTextColor" to "#f55009", "tagBorderColor" to unref(colors).infoLight, "tagBgColor" to unref(colors).infoLight, "tagActiveBorderColor" to unref(colors).infoLight, "tagActiveBgColor" to unref(colors).infoLight, "tagBorderRadius" to "100px", "tagPadding" to "4px 8px", "tagTextSize" to "12px", "tagTextColor" to if (unref(theme) == "light") {
                                            "#d6d6db";
                                        } else {
                                            "#8e8f91";
                                        }
                                        , "customContainStyle" to object : UTSJSONObject() {
                                            var marginBottom = "10px"
                                        }), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_radio_tag, utsMapOf("text" to "近朱者赤，近你者甜")),
                                                createVNode(_component_sn_radio_tag, utsMapOf("text" to "风止于秋水，我止于你")),
                                                createVNode(_component_sn_radio_tag, utsMapOf("text" to "眼里都是你，亿万星辰犹不及"))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "modelValue",
                                            "tagBorderColor",
                                            "tagBgColor",
                                            "tagActiveBorderColor",
                                            "tagActiveBgColor",
                                            "tagTextColor"
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
                return utsMapOf("spacing" to padStyleMapOf(utsMapOf("marginTop" to 0, "marginRight" to 5, "marginBottom" to 5, "marginLeft" to 0)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
