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
open class GenPagesComponentsSnToast : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnToast) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnToast;
            val _cache = __ins.renderCache;
            val snu = `$snui`.utils;
            val toastEle = ref(null as GenUniModulesSinleUiComponentsSnToastSnToastComponentPublicInstance?);
            fun genShowToastFn() {
                var showIcon = if (snu.random.randint(0, 1) == 1) {
                    true;
                } else {
                    false;
                }
                ;
                toastEle.value!!.show(SnToastParam(position = "center", duration = 2000, borderRadius = if (showIcon) {
                    `$snui`.configs.radius.circle;
                } else {
                    `$snui`.configs.radius.normal;
                }
                , padding = "10px 18px", text = if (showIcon) {
                    "操作完成";
                } else {
                    "这是一条轻提示";
                }
                , icon = if (showIcon) {
                    "checkbox-circle-line";
                } else {
                    "";
                }
                ));
            }
            val showToast = ::genShowToastFn;
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_button = resolveEasyComponent("sn-button", GenUniModulesSinleUiComponentsSnButtonSnButtonClass);
                val _component_sn_toast = resolveEasyComponent("sn-toast", GenUniModulesSinleUiComponentsSnToastSnToastClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Toast 轻提示")),
                        createVNode(_component_com_card, utsMapOf("title" to "基本用法", "note" to "很常见的吐司，但可玩性较高。通过 ref 方法使用。\\n提供 15+ 配置属性，支持 props 和方法参数两种配置方法，能够面对绝大部分使用场景。")),
                        createVNode(_component_com_card, utsMapOf("title" to "开发中……"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_button, utsMapOf("text" to "预览", "onClick" to fun(){
                                    showToast();
                                }
                                ), null, 8, utsArrayOf(
                                    "onClick"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_sn_toast, utsMapOf("ref_key" to "toastEle", "ref" to toastEle), null, 512)
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
