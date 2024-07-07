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
open class GenPagesLibsUtilsPageVerify : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesLibsUtilsPageVerify) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesLibsUtilsPageVerify;
            val _cache = __ins.renderCache;
            val snu = `$snui`.utils;
            val d1 = "2023-01-01";
            val d2 = "非日期文本";
            val d3 = Date();
            val d4 = "http://www.example.com";
            val d5 = "https://www.baidu.com/s?ie=utf-8&wd=SinleUI";
            val d6 = "ftp://example:example";
            val d7 = "not a URL";
            val d8 = "12345";
            val d9 = "1515.14";
            val d10 = "-145.7452";
            val d11 = "x+y=10";
            val d12 = "abcdEFG";
            val d13 = "\u5929\u5730\u7384\u9EC4";
            val d14 = "\u571F\u5730\u5E73\u65F7AND\u5C4B\u820D\u4FE8\u7136";
            val d15 = "12345abc@test.com";
            val d16 = "0000test.com";
            val d17 = "13523456789";
            val d18 = "10000000000";
            val d19 = "027-62039999";
            val d20 = "123456789000";
            val d21 = "10000";
            val d22 = "1445645789";
            val d23 = "2400:da00::6666";
            val d24 = "2001:da8:208:10::6";
            val d25 = "101.470.215.442";
            val d26 = "180.76.76.76";
            val d27 = "41048219911004595X";
            val d28 = "350783199003058516";
            val d29 = "41272219801215771X";
            val d30 = "/static/sub/com.jpeg";
            val d31 = "\u89C6\u98911.m3u8";
            val d32 = "\u4EACA12345";
            val d33 = "\u6E1DA000124";
            val d34 = "not a valid car number";
            fun genIsIDCardFn(code: String): Boolean {
                var cities = utsArrayOf(
                    "11",
                    "12",
                    "13",
                    "14",
                    "15",
                    "21",
                    "22",
                    "23",
                    "31",
                    "32",
                    "33",
                    "34",
                    "35",
                    "36",
                    "37",
                    "41",
                    "42",
                    "43",
                    "44",
                    "45",
                    "46",
                    "50",
                    "51",
                    "52",
                    "53",
                    "54",
                    "61",
                    "62",
                    "63",
                    "64",
                    "65",
                    "71",
                    "81",
                    "82",
                    "91"
                );
                var case1 = code.trim() == "" || !UTSRegExp("^\\d{6}(18|19|20)?\\d{2}(0[1-9]|1[012])(0[1-9]|[12]\\d|3[01])\\d{3}(\\d|X)\$", "i").test(code);
                var case2 = !cities.includes(code.slice(0, 2));
                if (case1 || case2) {
                    return false;
                }
                if (code.length == 18) {
                    var _code = code.split("");
                    var factor: UTSArray<Number> = utsArrayOf(
                        7,
                        9,
                        10,
                        5,
                        8,
                        4,
                        2,
                        1,
                        6,
                        3,
                        7,
                        9,
                        10,
                        5,
                        8,
                        4,
                        2
                    );
                    var parity = utsArrayOf(
                        "1",
                        "0",
                        "X",
                        "9",
                        "8,",
                        "7",
                        "6",
                        "5",
                        "4",
                        "3",
                        "2"
                    );
                    var sum: Number = 0;
                    var ai: Number = 0;
                    var wi: Number = 0;
                    run {
                        var i: Number = 0;
                        while(i < 17){
                            ai = parseInt(_code[i]);
                            wi = factor[i];
                            sum += ai * wi;
                            i++;
                        }
                    }
                    if (parity[sum % 11] != _code[17]) {
                        return false;
                    }
                }
                return true;
            }
            val isIDCard = ::genIsIDCardFn;
            return fun(): Any? {
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                return createElementVNode(Fragment, null, utsArrayOf(
                    createVNode(_component_com_card, utsMapOf("title" to "是否为日期", "note" to "验证输入的值是否为有效的日期。\\n如果传入Date构造器的参数字符串不合法，在web平台会抛出 Invalid Date 异常\\n在Android/IOS平台，会转换为程序执行时的时间"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + d1 + "\u3011  \u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isDate(d1))), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + d2 + "\u3011  \u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isDate(d2))), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + unref(d3) + "\u3011  \u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isDate(unref(d3)))), null, 8, utsArrayOf(
                                "text"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "是否为URL", "note" to "验证输入的字符串是否为有效的URL。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + d4 + "\u3011\n\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isURL(d4))), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + d5 + "\u3011\n\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isURL(d5))), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + d6 + "\u3011\n\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isURL(d6))), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + d7 + "\u3011\n\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isURL(d7))), null, 8, utsArrayOf(
                                "text"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "是否为数字", "note" to "验证输入的字符串是否为有效的数字。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + d8 + "\u3011\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isNumber(d8))), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + d9 + "\u3011\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isNumber(d9))), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + d10 + "\u3011\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isNumber(d10))), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + d11 + "\u3011\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isNumber(d11))), null, 8, utsArrayOf(
                                "text"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "是否为字母", "note" to "验证输入的字符串是否为有效的字母。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + d12 + "\u3011\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isAbc(d12))), null, 8, utsArrayOf(
                                "text"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "是否为中文", "note" to "验证输入的字符串是否为有效的中文。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + d13 + "\u3011\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isChinese(d13))), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + d14 + "\u3011\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isChinese(d14))), null, 8, utsArrayOf(
                                "text"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "是否为邮箱", "note" to "验证输入的字符串是否为有效的邮箱地址。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + d15 + "\u3011\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isEmail(d15))), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + d16 + "\u3011\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isEmail(d16))), null, 8, utsArrayOf(
                                "text"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "是否为手机号", "note" to "验证输入的字符串是否为有效的手机号。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + d17 + "\u3011\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isPhone(d17))), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + d18 + "\u3011\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isPhone(d18))), null, 8, utsArrayOf(
                                "text"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "是否为座机号", "note" to "验证输入的字符串是否为有效的座机号。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + d19 + "\u3011\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isLandline(d19))), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + d20 + "\u3011\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isLandline(d20))), null, 8, utsArrayOf(
                                "text"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "是否为QQ号", "note" to "验证输入的字符串是否为有效的QQ号。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + d21 + "\u3011\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isQQNumber(d21))), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + d22 + "\u3011\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isQQNumber(d22))), null, 8, utsArrayOf(
                                "text"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "是否为IPv6", "note" to "验证输入的字符串是否为有效的IPv6地址。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + d23 + "\u3011\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isIPv6(d23))), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + d24 + "\u3011\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isIPv6(d24))), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + d25 + "\u3011\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isIPv6(d25))), null, 8, utsArrayOf(
                                "text"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "是否为IPv4", "note" to "验证输入的字符串是否为有效的IPv4地址。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + d25 + "\u3011\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isIPv4(d25))), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + d26 + "\u3011\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isIPv4(d26))), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + d23 + "\u3011\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isIPv4(d23))), null, 8, utsArrayOf(
                                "text"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "是否为第二代公民身份号码", "note" to "验证输入的字符串是否为有效的中华人民共和国居民身份证（第二代）号码。自动计算身份证校验码是否正确。\\n（身份证号来源：公安部网站）"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + d27 + "\u3011\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isIDCard(d27))), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + d28 + "\u3011\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isIDCard(d28))), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + d29 + "\u3011\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isIDCard(d29))), null, 8, utsArrayOf(
                                "text"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "是否为图片文件", "note" to "验证输入的字符串是否为有效的图片文件名。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + d30 + "\u3011\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isImage(d30))), null, 8, utsArrayOf(
                                "text"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "是否为视频文件", "note" to "验证输入的字符串是否为有效的视频文件名。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + d31 + "\u3011\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isVideo(d31))), null, 8, utsArrayOf(
                                "text"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "是否为车牌号码", "note" to "验证输入的字符串是否为有效的中华人民共和国车辆牌照号码。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + d32 + "\u3011\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isCarNumber(d32))), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + d33 + "\u3011\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isCarNumber(d33))), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6570\u636E\u3010" + d34 + "\u3011\u6821\u9A8C\u7ED3\u679C\uFF1A" + unref(snu).verify.isCarNumber(d34))), null, 8, utsArrayOf(
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
