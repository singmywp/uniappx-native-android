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
open class GenPagesComponentsSnCheckbox : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnCheckbox) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnCheckbox;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val v1 = ref(utsArrayOf<Number>());
            val v2 = ref(utsArrayOf<Number>());
            val v3 = ref(utsArrayOf<Number>());
            val v4 = ref(utsArrayOf<Number>());
            val v5 = ref(utsArrayOf<Number>());
            val v6 = ref(utsArrayOf<Number>());
            val v7 = ref(utsArrayOf<Number>(0, 2));
            val v8 = ref(utsArrayOf<Number>(0, 1, 3));
            val v9 = ref(utsArrayOf<Number>());
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
                val _component_sn_checkbox = resolveEasyComponent("sn-checkbox", GenUniModulesSinleUiComponentsSnCheckboxSnCheckboxClass);
                val _component_sn_checkbox_group = resolveEasyComponent("sn-checkbox-group", GenUniModulesSinleUiComponentsSnCheckboxGroupSnCheckboxGroupClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_checkbox_tag = resolveEasyComponent("sn-checkbox-tag", GenUniModulesSinleUiComponentsSnCheckboxTagSnCheckboxTagClass);
                val _component_sn_line = resolveEasyComponent("sn-line", GenUniModulesSinleUiComponentsSnLineSnLineClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_sn_view = resolveEasyComponent("sn-view", GenUniModulesSinleUiComponentsSnViewSnViewClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Checkbox 复选")),
                        createVNode(_component_sn_view, utsMapOf("loading" to unref(loadingComponents)), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_com_card, utsMapOf("title" to "基础用法", "note" to "跟radio的用法很像，但可以多选\\n（注意：一组sn-checkbox、sn-checkbox-tag必须放在sn-checkbox-group里）"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_checkbox_group, utsMapOf("modelValue" to unref(v1), "onUpdate:modelValue" to fun(`$event`: UTSArray<Number>){
                                            trySetRefValue(v1, `$event`);
                                        }
                                        ), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_checkbox, utsMapOf("text" to "苹果")),
                                                createVNode(_component_sn_checkbox, utsMapOf("text" to "香蕉")),
                                                createVNode(_component_sn_checkbox, utsMapOf("text" to "菠萝"))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "类型", "note" to "自定义复选组显示的样式（支持两种组件：sn-checkbox和sn-checkbox-tag）"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_checkbox_group, utsMapOf("modelValue" to unref(v2), "onUpdate:modelValue" to fun(`$event`: UTSArray<Number>){
                                            trySetRefValue(v2, `$event`);
                                        }
                                        ), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_checkbox, utsMapOf("text" to "及格")),
                                                createVNode(_component_sn_checkbox, utsMapOf("text" to "良好")),
                                                createVNode(_component_sn_checkbox, utsMapOf("text" to "优秀"))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "modelValue"
                                        )),
                                        createVNode(_component_sn_checkbox_group, utsMapOf("modelValue" to unref(v2), "onUpdate:modelValue" to fun(`$event`: UTSArray<Number>){
                                            trySetRefValue(v2, `$event`);
                                        }
                                        ), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_checkbox_tag, utsMapOf("text" to "及格")),
                                                createVNode(_component_sn_checkbox_tag, utsMapOf("text" to "良好")),
                                                createVNode(_component_sn_checkbox_tag, utsMapOf("text" to "优秀"))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "间隔", "note" to "复选组件可设置统一的间隔"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_checkbox_group, utsMapOf("modelValue" to unref(v3), "onUpdate:modelValue" to fun(`$event`: UTSArray<Number>){
                                            trySetRefValue(v3, `$event`);
                                        }
                                        , "spacing" to "30px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_checkbox, utsMapOf("text" to "橘子")),
                                                createVNode(_component_sn_checkbox, utsMapOf("text" to "柠檬")),
                                                createVNode(_component_sn_checkbox, utsMapOf("text" to "芒果"))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "modelValue"
                                        )),
                                        createVNode(_component_sn_checkbox_group, utsMapOf("modelValue" to unref(v3), "onUpdate:modelValue" to fun(`$event`: UTSArray<Number>){
                                            trySetRefValue(v3, `$event`);
                                        }
                                        , "spacing" to "30px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_checkbox_tag, utsMapOf("text" to "橘子")),
                                                createVNode(_component_sn_checkbox_tag, utsMapOf("text" to "柠檬")),
                                                createVNode(_component_sn_checkbox_tag, utsMapOf("text" to "芒果"))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "圆角", "note" to "复选组件可设置统一的圆角"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_checkbox_group, utsMapOf("modelValue" to unref(v4), "onUpdate:modelValue" to fun(`$event`: UTSArray<Number>){
                                            trySetRefValue(v4, `$event`);
                                        }
                                        , "boxBorderRadius" to "100px", "boxIconSize" to "13px", "customBoxContainStyle" to object : UTSJSONObject() {
                                            var marginBottom = "15px"
                                        }), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_checkbox, utsMapOf("text" to "小桥流水")),
                                                createVNode(_component_sn_checkbox, utsMapOf("text" to "烟火")),
                                                createVNode(_component_sn_checkbox, utsMapOf("text" to "夕阳"))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "modelValue"
                                        )),
                                        createVNode(_component_sn_line),
                                        createVNode(_component_sn_checkbox_group, utsMapOf("modelValue" to unref(v4), "onUpdate:modelValue" to fun(`$event`: UTSArray<Number>){
                                            trySetRefValue(v4, `$event`);
                                        }
                                        , "tagBorderRadius" to "100px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_checkbox_tag, utsMapOf("text" to "小桥流水")),
                                                createVNode(_component_sn_checkbox_tag, utsMapOf("text" to "烟火")),
                                                createVNode(_component_sn_checkbox_tag, utsMapOf("text" to "夕阳"))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "图标 【Box特色】", "note" to "box 复选组件可设置选中图标。既可以给整个复选组设置统一图标，也可以为某一个子组件单独设置"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_checkbox_group, utsMapOf("modelValue" to unref(v5), "onUpdate:modelValue" to fun(`$event`: UTSArray<Number>){
                                            trySetRefValue(v5, `$event`);
                                        }
                                        , "boxSize" to "26px", "boxBorderRadius" to "8px", "boxIcon" to "heart-3-fill"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_checkbox, utsMapOf("text" to "A1")),
                                                createVNode(_component_sn_checkbox, utsMapOf("text" to "B2", "icon" to "user-smile-fill")),
                                                createVNode(_component_sn_checkbox, utsMapOf("text" to "C3")),
                                                createVNode(_component_sn_checkbox, utsMapOf("text" to "D4"))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "方向", "note" to "复选组可以设置排列的方向（竖向和横向），适用于多种场景"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_checkbox_group, utsMapOf("modelValue" to unref(v6), "onUpdate:modelValue" to fun(`$event`: UTSArray<Number>){
                                            trySetRefValue(v6, `$event`);
                                        }
                                        , "vertical" to "", "customBoxContainStyle" to object : UTSJSONObject() {
                                            var marginBottom = "15px"
                                        }), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_checkbox, utsMapOf("text" to "一曲新词酒一杯")),
                                                createVNode(_component_sn_checkbox, utsMapOf("text" to "去年天气旧亭台")),
                                                createVNode(_component_sn_checkbox, utsMapOf("text" to "夕阳西下几时回"))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "modelValue"
                                        )),
                                        createVNode(_component_sn_line),
                                        createVNode(_component_sn_checkbox_group, utsMapOf("modelValue" to unref(v6), "onUpdate:modelValue" to fun(`$event`: UTSArray<Number>){
                                            trySetRefValue(v6, `$event`);
                                        }
                                        , "vertical" to "", "spacing" to "5px", "tagBorderRadius" to "15px", "tagPadding" to "10px 15px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_checkbox_tag, utsMapOf("text" to "无可奈何花落去")),
                                                createVNode(_component_sn_checkbox_tag, utsMapOf("text" to "似曾相识燕归来")),
                                                createVNode(_component_sn_checkbox_tag, utsMapOf("text" to "小园香径独徘徊"))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "默认值", "note" to "复选组可以设置默认的选项，更懂用户的选择"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_checkbox_group, utsMapOf("modelValue" to unref(v7), "onUpdate:modelValue" to fun(`$event`: UTSArray<Number>){
                                            trySetRefValue(v7, `$event`);
                                        }
                                        ), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_checkbox, utsMapOf("text" to "李白")),
                                                createVNode(_component_sn_checkbox, utsMapOf("text" to "杜甫")),
                                                createVNode(_component_sn_checkbox, utsMapOf("text" to "王勃")),
                                                createVNode(_component_sn_checkbox, utsMapOf("text" to "苏轼")),
                                                createVNode(_component_sn_checkbox, utsMapOf("text" to "李清照"))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "modelValue"
                                        )),
                                        createVNode(_component_sn_line),
                                        createVNode(_component_sn_checkbox_group, utsMapOf("modelValue" to unref(v7), "onUpdate:modelValue" to fun(`$event`: UTSArray<Number>){
                                            trySetRefValue(v7, `$event`);
                                        }
                                        , "spacing" to "5px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_checkbox_tag, utsMapOf("text" to "李白")),
                                                createVNode(_component_sn_checkbox_tag, utsMapOf("text" to "杜甫")),
                                                createVNode(_component_sn_checkbox_tag, utsMapOf("text" to "王勃")),
                                                createVNode(_component_sn_checkbox_tag, utsMapOf("text" to "苏轼")),
                                                createVNode(_component_sn_checkbox_tag, utsMapOf("text" to "李清照"))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "禁用", "note" to "为单个单选设置禁用状态\\n 注意：只是禁用手动点击，不会屏蔽数据的修改"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("class" to "introduction", "text" to "\u3000\u3000")),
                                        createVNode(_component_sn_checkbox_group, utsMapOf("modelValue" to unref(v8), "onUpdate:modelValue" to fun(`$event`: UTSArray<Number>){
                                            trySetRefValue(v8, `$event`);
                                        }
                                        ), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_checkbox, utsMapOf("text" to "秦朝", "disabled" to "")),
                                                createVNode(_component_sn_checkbox, utsMapOf("text" to "汉朝")),
                                                createVNode(_component_sn_checkbox, utsMapOf("text" to "晋朝", "disabled" to "")),
                                                createVNode(_component_sn_checkbox, utsMapOf("text" to "唐朝")),
                                                createVNode(_component_sn_checkbox, utsMapOf("text" to "清朝", "disabled" to ""))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "modelValue"
                                        )),
                                        createVNode(_component_sn_line),
                                        createVNode(_component_sn_checkbox_group, utsMapOf("modelValue" to unref(v8), "onUpdate:modelValue" to fun(`$event`: UTSArray<Number>){
                                            trySetRefValue(v8, `$event`);
                                        }
                                        , "spacing" to "5px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_checkbox_tag, utsMapOf("text" to "秦朝", "disabled" to "")),
                                                createVNode(_component_sn_checkbox_tag, utsMapOf("text" to "汉朝")),
                                                createVNode(_component_sn_checkbox_tag, utsMapOf("text" to "晋朝", "disabled" to "")),
                                                createVNode(_component_sn_checkbox_tag, utsMapOf("text" to "唐朝")),
                                                createVNode(_component_sn_checkbox_tag, utsMapOf("text" to "清朝", "disabled" to ""))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_com_card, utsMapOf("title" to "自定义样式", "note" to "通过丰富的组件属性，你可以自由地控制组件每个部分的样式，实现一些很酷的东西"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_checkbox_group, utsMapOf("modelValue" to unref(v9), "onUpdate:modelValue" to fun(`$event`: UTSArray<Number>){
                                            trySetRefValue(v9, `$event`);
                                        }
                                        , "spacing" to "7px", "tagActiveTextColor" to "#e54e09", "tagTextColor" to unref(colors).infoText, "tagActiveBgColor" to unref(colors).info, "tagBgColor" to unref(colors).info, "tagBorderRadius" to "100px", "tagPadding" to "5px 13px", "tagTextSize" to "14px"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                            return utsArrayOf(
                                                createVNode(_component_sn_checkbox_tag, utsMapOf("text" to "梦入江南烟水路")),
                                                createVNode(_component_sn_checkbox_tag, utsMapOf("text" to "丹枫万叶碧云边")),
                                                createVNode(_component_sn_checkbox_tag, utsMapOf("text" to "小院闲庭，轻寒翠袖生"))
                                            );
                                        }
                                        ), "_" to 1), 8, utsArrayOf(
                                            "modelValue",
                                            "tagTextColor",
                                            "tagActiveBgColor",
                                            "tagBgColor"
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
                return normalizeCssStyles(utsArrayOf(), utsArrayOf(
                    GenApp.styles
                ));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
