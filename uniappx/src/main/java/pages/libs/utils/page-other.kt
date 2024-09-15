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
open class GenPagesLibsUtilsPageOther : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesLibsUtilsPageOther) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesLibsUtilsPageOther;
            val _cache = __ins.renderCache;
            val snu = `$snui`.utils;
            val d1 = ref(10.0);
            val d2 = ref(1201.51);
            val d3 = ref(object : UTSJSONObject() {
                var a = "原始数据"
                var b: Number = 2
            });
            val d4 = ref(d3.value);
            val d5 = ref(snu.other.deepClone(d3.value));
            val d6 = ref(utsArrayOf(
                0,
                1,
                2,
                3,
                4,
                5,
                6,
                7,
                8,
                9,
                10
            ));
            val d7 = ref(snu.other.shuffle(snu.other.deepClone(d6.value) as UTSArray<Any>));
            val d8 = ref(0);
            val d9 = ref(0);
            val d10 = ref(0);
            val d11 = ref(156.1);
            val d12 = ref("120");
            val d13 = ref(utsArrayOf(
                0,
                1,
                2
            ));
            val d14 = ref(0);
            fun genDebounceFn() {
                d9.value++;
                snu.other.debounce(fun(){
                    d10.value = d9.value;
                }
                , 1000);
            }
            val debounce = ::genDebounceFn;
            fun genChangeOriginFn() {
                d14.value++;
                d3.value["a"] = "\u6539\u52A8\u6570\u636E" + d14.value;
            }
            val changeOrigin = ::genChangeOriginFn;
            return fun(): Any? {
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_button = resolveEasyComponent("sn-button", GenUniModulesSinleUiComponentsSnButtonSnButtonClass);
                return createElementVNode(Fragment, null, utsArrayOf(
                    createVNode(_component_com_card, utsMapOf("title" to "格式化数字", "note" to "返回给定数字的格式化结果，如果数字为整数，则返回整数部分（例如 12.0 转换为 12）；如果数字为小数，则返回原数字。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u5B57\u3010" + unref(d1) + "\u3011\n\u8F6C\u6362\u7ED3\u679C\uFF1A" + unref(snu).other.formatNumber(unref(d1)))), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_text, utsMapOf("text" to ("\n\u6570\u5B57\u3010" + unref(d2) + "\u3011\n\u8F6C\u6362\u7ED3\u679C\uFF1A" + unref(snu).other.formatNumber(unref(d2)))), null, 8, utsArrayOf(
                                "text"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "深拷贝", "note" to "使用 TypeScript 实现的深拷贝函数。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u539F\u59CB\u5BF9\u8C61\uFF1A" + JSON.stringify(unref(d3)) + "\n\u6D45\u62F7\u8D1D\u5BF9\u8C61\uFF1A" + JSON.stringify(unref(d4)) + "\n\u6DF1\u62F7\u8D1D\u5BF9\u8C61\uFF1A" + JSON.stringify(unref(d5)) + "\n\n")), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_button, utsMapOf("type" to "primary", "text" to "修改原始数据的属性 a", "onClick" to changeOrigin))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "数组洗牌", "note" to "使用 Fisher–Yates 算法对数组进行洗牌，打乱数组的顺序。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u539F\u59CB\u6570\u636E\uFF1A" + JSON.stringify(unref(d6)) + "\n\u6253\u4E71\u540E\u6570\u636E\uFF1A" + JSON.stringify(unref(d7)) + "\n\n")), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_button, utsMapOf("type" to "primary", "text" to "打乱顺序", "onClick" to fun(){
                                d7.value = unref(snu).other.shuffle(unref(snu).other.deepClone(unref(d6)) as UTSArray<Any>);
                            }
                            ), null, 8, utsArrayOf(
                                "onClick"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "节流函数", "note" to "创建一个节流函数，指定的时间内多次执行，只执行第一次调用"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("cnt: " + unref(d8) + "\n\n")), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_button, utsMapOf("type" to "primary", "text" to "cnt ++ (每 1s 只允许执行一次)", "onClick" to fun(){
                                unref(snu).other.throttle(fun(){
                                    d8.value++;
                                }
                                , 1000);
                            }
                            ), null, 8, utsArrayOf(
                                "onClick"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "防抖函数", "note" to "创建一个防抖函数，指定的时间运行多次，将重新计时，并只执行最后一次调用"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("cnt: " + unref(d9))), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_text, utsMapOf("text" to ("result: " + unref(d10) + "\n\n")), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_button, utsMapOf("type" to "primary", "text" to "result = cnt\n(\u5EF6\u65F6 1s \u6267\u884C\u6700\u540E\u4E00\u6B21\u8C03\u7528)", "onClick" to fun(){
                                debounce();
                            }
                            ), null, 8, utsArrayOf(
                                "text",
                                "onClick"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "是否为 Number 类型", "note" to "检查输入的值是否为 Number 类型。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + unref(d11) + "\u3011\n\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).other.isNumber(unref(d11)))), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_text, utsMapOf("text" to ("\n\u6570\u636E\u3010'" + unref(d12) + "'\u3011\n\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).other.isNumber(unref(d12)))), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_text, utsMapOf("text" to ("\n\u6570\u636E\u3010" + unref(d13) + "\u3011\n\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).other.isNumber(unref(d13)))), null, 8, utsArrayOf(
                                "text"
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
