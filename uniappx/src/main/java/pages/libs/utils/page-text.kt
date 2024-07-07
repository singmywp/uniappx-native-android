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
open class GenPagesLibsUtilsPageText : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesLibsUtilsPageText) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesLibsUtilsPageText;
            val _cache = __ins.renderCache;
            val snu = `$snui`.utils;
            val t1 = "文本一 😁abcd";
            val t2 = "\u3000\u3000\u3000\u3000\u3000\u3000    \u3000";
            val t3 = "😆😏😫😘Abcd文字";
            val t4 = "sinle-ui-text";
            val t5 = "sinleUiText";
            val t6 = "124569655868.16";
            val t7 = "张三";
            val t8 = "李二狗";
            val t9 = "慕容京诸葛";
            val t10 = "13700001234";
            val t11 = "10086";
            val t12 = "066-66668888";
            val t13 = "131124198508122256";
            val t14 = "sinleui@sinleui.com";
            val t15 = "6217006666666666111";
            val t16 = "1234567890";
            val t17 = "-1234567890";
            val t18 = "2123456765568.5556";
            return fun(): Any? {
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                return createElementVNode(Fragment, null, utsArrayOf(
                    createVNode(_component_com_card, utsMapOf("title" to "是否为空文本", "note" to "判断字符串是否为空（自动去除空格）"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6587\u672C\u3010" + t1 + "\u3011  \u662F\u5426\u4E3A\u7A7A\uFF1A" + unref(snu).text.isEmpty(t1))), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6587\u672C\u3010" + t2 + "\u3011  \u662F\u5426\u4E3A\u7A7A\uFF1A" + unref(snu).text.isEmpty(t2))), null, 8, utsArrayOf(
                                "text"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "计算文本字数", "note" to "计算文本字数。使用 emoji-regex 库，能够正确计算表情符号的数量。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6587\u672C\u3010" + t3 + "\u3011  \u5B57\u6570\uFF1A" + unref(snu).text.len(t3))), null, 8, utsArrayOf(
                                "text"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "Kebab命名法转小驼峰命名法", "note" to "将Kebab命名法的文本转为小驼峰命名法"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6587\u672C\u3010" + t4 + "\u3011\n\u8F6C\u6362\u7ED3\u679C\uFF1A" + unref(snu).text.kebabCaseToCamelCase(t4))), null, 8, utsArrayOf(
                                "text"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "小驼峰命名法转Kebab命名法", "note" to "将小驼峰命名法的文本转为Kebab命名法"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6587\u672C\u3010" + t5 + "\u3011\n\u8F6C\u6362\u7ED3\u679C\uFF1A" + unref(snu).text.camelCaseToKebabCase(t5))), null, 8, utsArrayOf(
                                "text"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "数字转大写金额", "note" to "将阿拉伯数字转换为中文大写金额。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6587\u672C\u3010" + t6 + "\u3011\n\u8F6C\u6362\u7ED3\u679C\uFF1A" + unref(snu).text.numToUpper(t6))), null, 8, utsArrayOf(
                                "text"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "姓名脱敏", "note" to "为姓名脱敏。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6587\u672C\u3010" + t7 + "\u3011	\u8F6C\u6362\u7ED3\u679C\uFF1A" + unref(snu).text.encryptName(t7))), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6587\u672C\u3010" + t8 + "\u3011	\u8F6C\u6362\u7ED3\u679C\uFF1A" + unref(snu).text.encryptName(t8))), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6587\u672C\u3010" + t9 + "\u3011	\u8F6C\u6362\u7ED3\u679C\uFF1A" + unref(snu).text.encryptName(t9))), null, 8, utsArrayOf(
                                "text"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "电话号码脱敏", "note" to "为电话号码脱敏。支持 11 位手机号码和座机号码。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6587\u672C\u3010" + t10 + "\u3011	\u8F6C\u6362\u7ED3\u679C\uFF1A" + unref(snu).text.encryptPhone(t10))), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6587\u672C\u3010" + t11 + "\u3011	\u8F6C\u6362\u7ED3\u679C\uFF1A" + unref(snu).text.encryptPhone(t11))), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6587\u672C\u3010" + t12 + "\u3011	\u8F6C\u6362\u7ED3\u679C\uFF1A" + unref(snu).text.encryptPhone(t12))), null, 8, utsArrayOf(
                                "text"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "身份证号脱敏", "note" to "为身份证号脱敏。隐藏中间的11位数字，只保留前3位和后4位。\\n（身份证号来源： 公安部网站）"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6587\u672C\u3010" + t13 + "\u3011\n\u8F6C\u6362\u7ED3\u679C\uFF1A" + unref(snu).text.encryptIDCard(t13))), null, 8, utsArrayOf(
                                "text"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "邮箱脱敏", "note" to "为邮箱邮箱。隐藏用户名的一部分。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6587\u672C\u3010" + t14 + "\u3011\n\u8F6C\u6362\u7ED3\u679C\uFF1A" + unref(snu).text.encryptEmail(t14))), null, 8, utsArrayOf(
                                "text"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "银行卡号脱敏", "note" to "为银行卡号脱敏，隐藏中间的部分数字，只保留前3位和后4位。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6587\u672C\u3010" + t15 + "\u3011\n\u8F6C\u6362\u7ED3\u679C\uFF1A" + unref(snu).text.encryptBankCard(t15))), null, 8, utsArrayOf(
                                "text"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "分割数字", "note" to "将数字字符串格式化为带有指定分隔符的格式，例如每三位数字后加一个逗号。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6587\u672C\u3010" + t16 + "\u3011\n\u8F6C\u6362\u7ED3\u679C\uFF1A" + unref(snu).text.separateNumber(t16))), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6587\u672C\u3010" + t17 + "\u3011\n\u8F6C\u6362\u7ED3\u679C\uFF1A" + unref(snu).text.separateNumber(t17, 4))), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6587\u672C\u3010" + t18 + "\u3011\n\u8F6C\u6362\u7ED3\u679C\uFF1A" + unref(snu).text.separateNumber(t18, 3, "|"))), null, 8, utsArrayOf(
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
