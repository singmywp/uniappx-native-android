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
open class GenPagesLibsSnDate : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesLibsSnDate) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesLibsSnDate;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val DateLib = `$snui`.libs.date;
            val d1 = DateLib.dayuts();
            val d2 = ref(DateLib.dayuts());
            val d3 = DateLib.dayuts("2019-01-25 03:01:52");
            val d4 = DateLib.dayuts("2018-06-05 13:51:20");
            val ins1 = DateLib.dayuts("1999-01-01 03:01:08", null, "zh-cn");
            val ins2 = DateLib.dayuts("2015-12-06 15:11:20", null, "zh-cn");
            val ins3 = DateLib.dayuts("2024-12-05 14:02:45", null, "zh-cn");
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_alert = resolveEasyComponent("sn-alert", GenUniModulesSinleUiComponentsSnAlertSnAlertClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_button = resolveEasyComponent("sn-button", GenUniModulesSinleUiComponentsSnButtonSnButtonClass);
                val _component_sn_button_group = resolveEasyComponent("sn-button-group", GenUniModulesSinleUiComponentsSnButtonGroupSnButtonGroupClass);
                val _component_sn_line = resolveEasyComponent("sn-line", GenUniModulesSinleUiComponentsSnLineSnLineClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Date 日期库")),
                        createVNode(_component_sn_alert, utsMapOf("type" to "primary", "text" to "此库基于陌上年华的开源 UTS 插件 lime-dayuts 开发，几乎和 Day.js 保持一样的API。")),
                        createVNode(_component_com_card, utsMapOf("title" to "当前时间", "note" to "直接调用 dayuts() 将返回一个包含当前日期和时间的 Dayuts 对象。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("" + unref(d1))), null, 8, utsArrayOf(
                                    "text"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "解析字符串", "note" to "解析传入的符合 UTS Date 格式的字符串并返回一个 Dayuts 对象实例。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u5B57\u7B26\u4E32\uFF1A2023/08/13 12:35:54\n\u89E3\u6790\u7ED3\u679C\uFF1A" + unref(DateLib).dayuts("2023/08/13 12:35:54"))), null, 8, utsArrayOf(
                                    "text"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "解析 Unix 时间戳 (毫秒)", "note" to "解析传入的一个 Unix 时间戳 (13 位数字，从1970年1月1日 UTC 午夜开始所经过的毫秒数) 创建一个 Dayuts 对象。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u65F6\u95F4\u6233\uFF1A1318781796406\n\u89E3\u6790\u7ED3\u679C\uFF1A" + unref(DateLib).dayuts(1318781796406))), null, 8, utsArrayOf(
                                    "text"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "解析 Date 对象", "note" to "使用 UTS Date 内置对象创建一个 Dayuts 对象。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u5BF9\u8C61\uFF1Anew Date(2010,1,5)\n\u89E3\u6790\u7ED3\u679C\uFF1A" + unref(DateLib).dayuts(Date(2010, 1, 5)))), null, 8, utsArrayOf(
                                    "text"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "解析数组", "note" to "您可以传入一个数组来创建一个 Dayuts 对象，数组和结构和 new Date() 十分类似。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u6570\u7EC4\uFF1A[2018,8,6,12,54]\n\u89E3\u6790\u7ED3\u679C\uFF1A" + unref(DateLib).dayuts(utsArrayOf(
                                    2018,
                                    8,
                                    6,
                                    12,
                                    54
                                )))), null, 8, utsArrayOf(
                                    "text"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "格式化", "note" to "根据传入的占位符返回格式化后的日期。\\n将字符放在方括号中，即可原样返回而不被格式化替换 (例如， [MM])"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("" + unref(DateLib).dayuts("2019-01-25").format("DD/MM/YYYY"))), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("" + unref(DateLib).dayuts("2019-01-25").format("YYYY-MM-DD HH:mm:ss"))), null, 8, utsArrayOf(
                                    "text"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "取值/赋值", "note" to "在设计上 Dayuts 的 getter 和 setter 使用了相同的 API，也就是说，不传参数调用方法即为 getter，调用并传入参数为 setter。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("" + unref(d1))), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u5E74:" + unref(d1).year())), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u6708:" + unref(d1).month())), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u65E5:" + unref(d1).date())), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u5468:" + unref(d1).day())), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u65F6:" + unref(d1).hour())), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u5206:" + unref(d1).minute())), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u79D2:" + unref(d1).second())), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u6BEB\u79D2:" + unref(d1).millisecond())), null, 8, utsArrayOf(
                                    "text"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "操作", "note" to "提供一系列日期操作方法。支持链式调用。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("" + unref(d2).format("YYYY-MM-DD HH:mm:ss"))), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_button_group, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_button, utsMapOf("text" to "+1时", "onClick" to fun(){
                                            d2.value = unref(d2).add(1, "hour");
                                        }
                                        ), null, 8, utsArrayOf(
                                            "onClick"
                                        )),
                                        createVNode(_component_sn_button, utsMapOf("text" to "+1天", "onClick" to fun(){
                                            d2.value = unref(d2).add(1, "day");
                                        }
                                        ), null, 8, utsArrayOf(
                                            "onClick"
                                        )),
                                        createVNode(_component_sn_button, utsMapOf("text" to "+1月", "onClick" to fun(){
                                            d2.value = unref(d2).add(1, "month");
                                        }
                                        ), null, 8, utsArrayOf(
                                            "onClick"
                                        )),
                                        createVNode(_component_sn_button, utsMapOf("text" to "+1年", "onClick" to fun(){
                                            d2.value = unref(d2).add(1, "year");
                                        }
                                        ), null, 8, utsArrayOf(
                                            "onClick"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_sn_button_group, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_button, utsMapOf("text" to "-2时", "onClick" to fun(){
                                            d2.value = unref(d2).subtract(2, "hour");
                                        }
                                        ), null, 8, utsArrayOf(
                                            "onClick"
                                        )),
                                        createVNode(_component_sn_button, utsMapOf("text" to "-2天", "onClick" to fun(){
                                            d2.value = unref(d2).subtract(2, "day");
                                        }
                                        ), null, 8, utsArrayOf(
                                            "onClick"
                                        )),
                                        createVNode(_component_sn_button, utsMapOf("text" to "-2月", "onClick" to fun(){
                                            d2.value = unref(d2).subtract(2, "month");
                                        }
                                        ), null, 8, utsArrayOf(
                                            "onClick"
                                        )),
                                        createVNode(_component_sn_button, utsMapOf("text" to "-2年", "onClick" to fun(){
                                            d2.value = unref(d2).subtract(2, "year");
                                        }
                                        ), null, 8, utsArrayOf(
                                            "onClick"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_sn_line),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u8F6CDate\uFF1A\n" + unref(d2).toDate() + "\n")), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u8F6CArray\uFF1A\n" + unref(d2).toArray() + "\n")), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u8F6CJSON\uFF1A\n" + unref(d2).toJSON() + "\n")), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u8F6CObject\uFF1A\n" + JSON.stringify(unref(d2).toObject()) + "\n")), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u8F6CString\uFF1A\n" + unref(d2).toString())), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_line),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u672C\u6708\u5F00\u59CB\u65E5\u671F\uFF1A" + unref(d2).startOf("month").format("YYYY-MM-DD HH:mm:ss"))), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u672C\u5E74\u7EC8\u6B62\u65E5\u671F\uFF1A" + unref(d2).startOf("year").format("YYYY-MM-DD HH:mm:ss"))), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_line),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u662F\u5426\u4ECA\u65E5\uFF1A" + unref(d2).isToday())), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u672C\u6708\u5929\u6570\uFF1A" + unref(d2).daysInMonth())), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u4ECA\u5E74\u662F\u5426\u95F0\u5E74\uFF1A" + unref(d2).isLeapYear())), null, 8, utsArrayOf(
                                    "text"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "相对时间", "note" to "返回日期与现在日期或其他日期的相对时间差异。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u5B9E\u4F8B1\uFF1A" + unref(ins1).format("YYYY-MM-DD HH:mm:ss"))), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u5B9E\u4F8B2\uFF1A" + unref(ins2).format("YYYY-MM-DD HH:mm:ss"))), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u5B9E\u4F8B1\u76F8\u5BF9\u4E8E\u73B0\u5728\uFF1A" + unref(ins1).fromNow())), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u5B9E\u4F8B1\u76F8\u5BF9\u4E8E\u5B9E\u4F8B2\uFF1A" + unref(ins1).from(unref(ins2)))), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u73B0\u5728\u76F8\u5BF9\u4E8E\u5B9E\u4F8B1\uFF1A" + unref(ins1).toNow())), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u5B9E\u4F8B2\u76F8\u5BF9\u4E8E\u5B9E\u4F8B1\uFF1A" + unref(ins1).to(unref(ins2)))), null, 8, utsArrayOf(
                                    "text"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "差异", "note" to "返回指定单位下两个日期时间之间的差异。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u65E5\u671F1\uFF1A" + unref(d3).format("YYYY-MM-DD HH:mm:ss"))), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u65E5\u671F2\uFF1A" + unref(d4).format("YYYY-MM-DD HH:mm:ss"))), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u6BEB\u79D2\u4E3A\u5355\u4F4D\uFF1A" + unref(d3).diff(unref(d4)))), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u5929\u4E3A\u5355\u4F4D\uFF1A" + unref(d3).diff(unref(d4), "days"))), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u6708\u4E3A\u5355\u4F4D\uFF1A" + unref(d3).diff(unref(d4), "months"))), null, 8, utsArrayOf(
                                    "text"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "Unix 时间戳 (毫秒)", "note" to "返回当前实例的 UNIX 时间戳，13位数字，毫秒。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("" + unref(d1) + "\n" + unref(d1).valueOf())), null, 8, utsArrayOf(
                                    "text"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "查询", "note" to "返回当前实例的 UNIX 时间戳，13位数字，毫秒。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u5B9E\u4F8B1\uFF1A" + unref(ins1).format("YYYY-MM-DD HH:mm:ss"))), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u5B9E\u4F8B2\uFF1A" + unref(ins3).format("YYYY-MM-DD HH:mm:ss"))), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u5B9E\u4F8B1\u662F\u5426\u5728\u73B0\u5728\u4E4B\u524D\uFF1A" + unref(ins1).isBefore(unref(d1)))), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u5B9E\u4F8B2\u662F\u5426\u5728\u73B0\u5728\u4E4B\u540E\uFF1A" + unref(ins3).isAfter(unref(d1)))), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u5B9E\u4F8B2\u662F\u5426\u5728\u672C\u6708\uFF1A" + unref(ins3).isSame(unref(d1), "month"))), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u5B9E\u4F8B2\u662F\u5426\u5728\u4ECA\u5E74\uFF1A" + unref(ins3).isSame(unref(d1), "year"))), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u5B9E\u4F8B2\u662F\u5426\u4E0E\u73B0\u5728\u76F8\u540C\u6216\u5728\u73B0\u5728\u4E4B\u540E\uFF1A" + unref(ins3).isSameOrAfter(unref(d1)))), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u73B0\u5728\u662F\u5426\u5728\u5B9E\u4F8B1\u548C\u5B9E\u4F8B2\u4E4B\u95F4\uFF1A" + unref(d1).isBetween(unref(ins1), unref(ins3)))), null, 8, utsArrayOf(
                                    "text"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "国际化", "note" to "目前内置了中英两种语言"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u4E2D\u6587\n" + unref(d1) + "\n" + unref(d1).locale("zh-cn").toNow() + "\n\n")), null, 8, utsArrayOf(
                                    "text"
                                )),
                                createVNode(_component_sn_text, utsMapOf("type" to "primary", "text" to ("\u82F1\u6587\n" + unref(d1) + "\n" + unref(d1).locale("en").toNow())), null, 8, utsArrayOf(
                                    "text"
                                ))
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
