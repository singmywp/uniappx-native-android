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
open class GenPagesComponentsSnBacktop : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _cache = this.`$`.renderCache;
        val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
        val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
        val _component_sn_alert = resolveEasyComponent("sn-alert", GenUniModulesSinleUiComponentsSnAlertSnAlertClass);
        val _component_sn_gap = resolveEasyComponent("sn-gap", GenUniModulesSinleUiComponentsSnGapSnGapClass);
        val _component_sn_backtop = resolveEasyComponent("sn-backtop", GenUniModulesSinleUiComponentsSnBacktopSnBacktopClass);
        val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
        return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
            return utsArrayOf(
                createVNode(_component_sn_topbar, utsMapOf("title" to "Backtop 回到顶部")),
                createVNode(_component_com_card, utsMapOf("title" to "基础使用", "note" to "滚动一定高度后就会显示出来\\n支持绑定 scroll-list 和 list-view，如果不设置父节点 id，自动绑定页面根节点滚动容器")),
                createVNode(_component_com_card, utsMapOf("title" to "丰富属性", "note" to "支持自由设置滚动出现高度，图标及其颜色、尺寸，以及主题和背景色，禁用，所处位置，动画时长等多种属性")),
                createVNode(_component_sn_alert, utsMapOf("type" to "primary", "text" to "下滑页面查看效果")),
                createVNode(_component_sn_gap, utsMapOf("height" to "200%")),
                createVNode(_component_sn_backtop, utsMapOf("top" to 200)),
                createVNode(_component_sn_backtop, utsMapOf("icon" to "close-line", "disabled" to "", "right" to 90)),
                createVNode(_component_sn_backtop, utsMapOf("type" to "success", "right" to 150)),
                createVNode(_component_sn_backtop, utsMapOf("type" to "warning", "level" to "second", "icon" to "arrow-up-line", "size" to "60px", "right" to 210, "bottom" to 80))
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
