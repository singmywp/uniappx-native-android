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
open class GenPagesComponentsSnAlert : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _cache = this.`$`.renderCache;
        val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
        val _component_sn_alert = resolveEasyComponent("sn-alert", GenUniModulesSinleUiComponentsSnAlertSnAlertClass);
        val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
        val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
        return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
            return utsArrayOf(
                createVNode(_component_sn_topbar, utsMapOf("title" to "Alert 警告信息")),
                createVNode(_component_com_card, utsMapOf("title" to "基础用法", "note" to "用于向用户说明或警告信息"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_alert, utsMapOf("text" to "道可道，非常道")),
                        createVNode(_component_sn_alert, utsMapOf("type" to "primary", "text" to "名可名，非常名")),
                        createVNode(_component_sn_alert, utsMapOf("type" to "success", "text" to "无名，天地之始")),
                        createVNode(_component_sn_alert, utsMapOf("type" to "warning", "text" to "有名，万物之母")),
                        createVNode(_component_sn_alert, utsMapOf("type" to "error", "text" to "故常无欲，以观其妙，常有欲，以观其徼。"))
                    );
                }
                ), "_" to 1)),
                createVNode(_component_com_card, utsMapOf("title" to "颜色效果", "note" to "内置两种颜色效果：深色和浅色。默认为浅色"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_alert, utsMapOf("effect" to "dark", "text" to "道可道，非常道")),
                        createVNode(_component_sn_alert, utsMapOf("effect" to "dark", "type" to "primary", "text" to "名可名，非常名")),
                        createVNode(_component_sn_alert, utsMapOf("effect" to "dark", "type" to "success", "text" to "无名，天地之始")),
                        createVNode(_component_sn_alert, utsMapOf("effect" to "dark", "type" to "warning", "text" to "有名，万物之母")),
                        createVNode(_component_sn_alert, utsMapOf("effect" to "dark", "type" to "error", "text" to "故常无欲，以观其妙，常有欲，以观其徼"))
                    );
                }
                ), "_" to 1)),
                createVNode(_component_com_card, utsMapOf("title" to "图标", "note" to "在警告信息旁添上图标。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_alert, utsMapOf("icon" to "home-smile-fill", "icon-color" to "#6d6d6d", "text" to "天下皆知美之为美，斯恶已，皆知善之为善，斯不善已")),
                        createVNode(_component_sn_alert, utsMapOf("icon" to "cloud-fill", "icon-color" to "#5777ff", "type" to "primary", "text" to "故有无相生，难易相成，长短相形，高下相倾，音声相和，前后相随")),
                        createVNode(_component_sn_alert, utsMapOf("icon" to "bookmark-3-fill", "icon-color" to "#06ad56", "type" to "success", "text" to "是以圣人处无为之事，行不言之教，万物作焉而不辞")),
                        createVNode(_component_sn_alert, utsMapOf("icon" to "chat-1-fill", "icon-color" to "#f6b142", "type" to "warning", "text" to "生而不有，为而不恃，功成而弗居")),
                        createVNode(_component_sn_alert, utsMapOf("icon" to "contrast-drop-line", "icon-color" to "#fc5454", "type" to "error", "text" to "夫惟弗居，是以不去"))
                    );
                }
                ), "_" to 1)),
                createVNode(_component_com_card, utsMapOf("title" to "自定义样式", "note" to "更多样式，随心而变。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_alert, utsMapOf("bgColor" to "#fff", "text" to "\u3000天下皆知美之为美，斯恶已，皆知善之为善，斯不善已", "textColor" to "#000", "textSize" to "18px", "custom-style" to object : UTSJSONObject() {
                            var border = "4px solid #000"
                            var borderRadius = "16px"
                        }))
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
