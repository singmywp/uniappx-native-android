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
open class GenPagesComponentsSnLine : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _cache = this.`$`.renderCache;
        val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
        val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
        val _component_sn_line = resolveEasyComponent("sn-line", GenUniModulesSinleUiComponentsSnLineSnLineClass);
        val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
        val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
        return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
            return utsArrayOf(
                createVNode(_component_sn_topbar, utsMapOf("title" to "Line 线条")),
                createVNode(_component_com_card, utsMapOf("title" to "基础用法", "note" to "普普通通的分割线，用于切割内容"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_text, utsMapOf("class" to "introduction", "text" to "\u3000\u3000段落1")),
                        createVNode(_component_sn_line),
                        createVNode(_component_sn_text, utsMapOf("class" to "introduction", "text" to "\u3000\u3000段落2"))
                    );
                }
                ), "_" to 1)),
                createVNode(_component_com_card, utsMapOf("title" to "插入文字", "note" to "放点有趣的东西，比如旁白君"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_text, utsMapOf("class" to "introduction", "text" to "\u3000\u3000段落1")),
                        createVNode(_component_sn_line, utsMapOf("text" to "这是一条分割线")),
                        createVNode(_component_sn_text, utsMapOf("class" to "introduction", "text" to "\u3000\u3000段落2"))
                    );
                }
                ), "_" to 1)),
                createVNode(_component_com_card, utsMapOf("title" to "以点代字", "note" to "装饰美观，强制设置title为•"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_text, utsMapOf("class" to "introduction", "text" to "\u3000\u3000段落1")),
                        createVNode(_component_sn_line, utsMapOf("text" to "这是一条分割线", "dot" to "")),
                        createVNode(_component_sn_text, utsMapOf("class" to "introduction", "text" to "\u3000\u3000段落2"))
                    );
                }
                ), "_" to 1)),
                createVNode(_component_com_card, utsMapOf("title" to "虚线", "note" to "总有时候会用到"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_text, utsMapOf("class" to "introduction", "text" to "\u3000\u3000段落1")),
                        createVNode(_component_sn_line, utsMapOf("dashed" to "")),
                        createVNode(_component_sn_text, utsMapOf("class" to "introduction", "text" to "\u3000\u3000段落2"))
                    );
                }
                ), "_" to 1)),
                createVNode(_component_com_card, utsMapOf("title" to "自定义样式", "note" to "对于热衷于突显自己特色的开发者来说是个好东西"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("align-items" to "center"))), utsArrayOf(
                            createVNode(_component_sn_line, utsMapOf("line-color" to "#000", "height" to "5px", "width" to "70%", "border-radius" to "100px", "style" to normalizeStyle(utsMapOf("margin" to "10px auto"))), null, 8, utsArrayOf(
                                "style"
                            )),
                            createVNode(_component_sn_line, utsMapOf("line-color" to "#f03c46", "height" to "6px", "style" to normalizeStyle(utsMapOf("margin" to "10px auto"))), null, 8, utsArrayOf(
                                "style"
                            )),
                            createVNode(_component_sn_line, utsMapOf("dashed" to "", "line-color" to "#ffd800", "height" to "2px", "style" to normalizeStyle(utsMapOf("margin" to "10px auto"))), null, 8, utsArrayOf(
                                "style"
                            ))
                        ), 4)
                    );
                }
                ), "_" to 1))
            );
        }
        ), "_" to 1));
    }
    companion object {
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
