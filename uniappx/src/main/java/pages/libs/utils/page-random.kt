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
open class GenPagesLibsUtilsPageRandom : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesLibsUtilsPageRandom) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesLibsUtilsPageRandom;
            val _cache = __ins.renderCache;
            val snu = `$snui`.utils;
            val colors = `$snui`.colors;
            val d1 = ref(snu.random.randint(0, 100).toString());
            val d2 = ref(snu.other.formatNumber(snu.random.randomNumber(5)).toString());
            val d3 = ref(snu.random.uuid());
            return fun(): Any? {
                val _component_sn_button = resolveEasyComponent("sn-button", GenUniModulesSinleUiComponentsSnButtonSnButtonClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                return createElementVNode(Fragment, null, utsArrayOf(
                    createVNode(_component_com_card, utsMapOf("title" to "生成随机整数", "note" to "生成一个介于最小值和最大值之间的随机整数。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_button, utsMapOf("type" to "primary", "text" to "生成 0 ~ 100 之间的随机整数", "onClick" to fun(){
                                d1.value = unref(snu).random.randint(0, 100).toString();
                            }
                            ), null, 8, utsArrayOf(
                                "onClick"
                            )),
                            createVNode(_component_com_card, utsMapOf("title" to unref(d1), "bgColor" to unref(colors).info), null, 8, utsArrayOf(
                                "title",
                                "bgColor"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "生成指定位数的随机整数", "note" to "生成一个指定位数的随机整数。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_button, utsMapOf("type" to "primary", "text" to "生成 5 位的随机整数", "onClick" to fun(){
                                d2.value = unref(snu).other.formatNumber(unref(snu).random.randomNumber(5)).toString();
                            }
                            ), null, 8, utsArrayOf(
                                "onClick"
                            )),
                            createVNode(_component_com_card, utsMapOf("title" to unref(d2), "bgColor" to unref(colors).info), null, 8, utsArrayOf(
                                "title",
                                "bgColor"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "生成UUID", "note" to "生成一个UUID格式的字符串。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_button, utsMapOf("type" to "primary", "text" to "生成 UUID", "onClick" to fun(){
                                d3.value = unref(snu).random.uuid();
                            }
                            ), null, 8, utsArrayOf(
                                "onClick"
                            )),
                            createVNode(_component_com_card, utsMapOf("title" to unref(d3), "bgColor" to unref(colors).info), null, 8, utsArrayOf(
                                "title",
                                "bgColor"
                            ))
                        );
                    }
                    ), "_" to 1))
                ), 64);
            }
            ;
        }
        ;
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf());
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
