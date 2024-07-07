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
open class GenPagesComponentsSnText : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnText) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnText;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_line = resolveEasyComponent("sn-line", GenUniModulesSinleUiComponentsSnLineSnLineClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Text 文本")),
                        createVNode(_component_com_card, utsMapOf("title" to "基础用法", "note" to "这个组件的作用就不用再说了吧"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("text" to "孤帆远影碧空尽，唯见长江天际流。"))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "加粗", "note" to "更突出、更显眼\\n（部分字体不生效，如本框架内置字体 Misans）"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("text" to "窗含西岭千秋雪，门泊东吴万里船。", "font" to " ", "bold" to ""))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "类型", "note" to "根据场景的不同，应当使用不同类型的文本，更具识别度"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("class" to "spacing", "type" to "info", "text" to "粉骨碎身浑不怕，要留清白在人间。")),
                                createVNode(_component_sn_text, utsMapOf("class" to "spacing", "type" to "primary", "text" to "接天莲叶无穷碧，映日荷花别样红。")),
                                createVNode(_component_sn_text, utsMapOf("class" to "spacing", "type" to "success", "text" to "春风又绿江南岸，明月何时照我还？")),
                                createVNode(_component_sn_text, utsMapOf("class" to "spacing", "type" to "warning", "text" to "劝君更尽一杯酒，西出阳关无故人。")),
                                createVNode(_component_sn_text, utsMapOf("class" to "spacing", "type" to "error", "text" to "人生自古谁无死？留取丹心照汗青。"))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "尺寸", "note" to "选择合适的大小也是一门技术活️"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("size" to "14px", "text" to "烟笼寒水月笼沙，夜泊秦淮近酒家。")),
                                createVNode(_component_sn_text, utsMapOf("size" to "18px", "text" to "商女不知亡国恨，隔江犹唱后庭花。"))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "超出隐藏", "note" to "超出️指定行数后自动隐藏后续文本"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("text" to unref(longText1), "lines" to 6), null, 8, utsArrayOf(
                                    "text"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "可选择", "note" to "使文本段落可以被复制"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to unref(longText1), "lines" to 6, "size" to "18px", "selectable" to ""), null, 8, utsArrayOf(
                                    "text"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "模式", "note" to "特殊的️情景需要特殊对待"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("text" to "拨打电话(需用户确认)", "color" to unref(colors).lineText), null, 8, utsArrayOf(
                                    "color"
                                )),
                                createVNode(_component_sn_text, utsMapOf("mode" to "phone", "type" to "primary", "text" to "10086")),
                                createVNode(_component_sn_line),
                                createVNode(_component_sn_text, utsMapOf("text" to "直接拨打电话(无需用户确认)", "color" to unref(colors).lineText), null, 8, utsArrayOf(
                                    "color"
                                )),
                                createVNode(_component_sn_text, utsMapOf("mode" to "phone-direct", "type" to "primary", "text" to "10086")),
                                createVNode(_component_sn_line),
                                createVNode(_component_sn_text, utsMapOf("text" to "日期", "color" to unref(colors).lineText), null, 8, utsArrayOf(
                                    "color"
                                )),
                                createVNode(_component_sn_text, utsMapOf("mode" to "date", "text" to Date().valueOf().toString()), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_text, utsMapOf("mode" to "date-cn", "text" to Date().valueOf().toString()), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_line),
                                createVNode(_component_sn_text, utsMapOf("text" to "超链接 (该功能较简单, 推荐使用sn-link) ", "color" to unref(colors).lineText), null, 8, utsArrayOf(
                                    "color"
                                )),
                                createVNode(_component_sn_text, utsMapOf("mode" to "link", "type" to "primary", "text" to "https://www.baidu.com")),
                                createVNode(_component_sn_text, utsMapOf("mode" to "link", "type" to "primary", "text" to "tel:123456")),
                                createVNode(_component_sn_text, utsMapOf("mode" to "link", "type" to "primary", "text" to "weixin://")),
                                createVNode(_component_sn_line),
                                createVNode(_component_sn_text, utsMapOf("text" to "价格", "color" to unref(colors).lineText), null, 8, utsArrayOf(
                                    "color"
                                )),
                                createVNode(_component_sn_text, utsMapOf("mode" to "price", "text" to "3999.67")),
                                createVNode(_component_sn_text, utsMapOf("mode" to "price-upper", "text" to "168201.03")),
                                createVNode(_component_sn_line),
                                createVNode(_component_sn_text, utsMapOf("text" to "脱敏", "color" to unref(colors).lineText), null, 8, utsArrayOf(
                                    "color"
                                )),
                                createVNode(_component_sn_text, utsMapOf("class" to "spacing", "mode" to "name", "text" to "张三", "encrypt" to "")),
                                createVNode(_component_sn_text, utsMapOf("mode" to "name", "text" to "李金刚", "encrypt" to "")),
                                createVNode(_component_sn_text, utsMapOf("mode" to "idcard", "text" to "110105199001012345", "encrypt" to "")),
                                createVNode(_component_sn_text, utsMapOf("mode" to "bankcard", "text" to "123456789012345678", "encrypt" to "")),
                                createVNode(_component_sn_text, utsMapOf("mode" to "email", "type" to "primary", "text" to "123456789@example.com", "encrypt" to "")),
                                createVNode(_component_sn_text, utsMapOf("mode" to "phone", "type" to "primary", "text" to "10086", "encrypt" to "")),
                                createVNode(_component_sn_text, utsMapOf("mode" to "phone", "type" to "primary", "text" to "13700001234", "encrypt" to ""))
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
                return utsMapOf("spacing" to padStyleMapOf(utsMapOf("marginBottom" to 10)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
