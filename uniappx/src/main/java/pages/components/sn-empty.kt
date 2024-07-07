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
open class GenPagesComponentsSnEmpty : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnEmpty) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnEmpty;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val showSlot = ref(false);
            val mode = ref(0);
            val contents = ref(object : UTSJSONObject() {
                var data = "啊哦，数据竟然丢失了"
                var page = "你似乎来到了一片荒野"
                var shopping = "你的购物车空空如也"
                var loaded = "加载失败，再试试看"
                var network = "断……断网了……"
                var search = "没找到有用信息哇"
                var message = "孤单的人呐"
                var bill = "家徒四壁"
                var wifi = "没有WiFi的世界……难以想象"
                var star = "没有感兴趣的内容啊"
                var envelope = "远方无人来信"
                var reservation = "暂无预约"
                var card = ""
                var favor = "还没发现有用的东西(doge"
                var record = "无影无痕"
                var clockin = "别人叫我摆烂大师"
                var point = "没有积分捏"
                var coupon = "优惠券……用光了"
                var notice = "暂无通知"
                var present = "居然连礼物都没有"
                var image = "尚未发现精彩图片"
                var email = "空荡荡的邮箱"
                var deal = "暂无交易记录"
                var video = "尚未发现精彩视频"
                var printer = "尚未连接打印机"
                var permission = "闲杂人等无权访问"
                var location = "定位……失效了？"
                var income = "穷苦人家"
                var comment = "还没人评论，抢个沙发~"
                var schedule = "近来无事"
            });
            val data = ref(utsArrayOf(
                object : UTSJSONObject() {
                    var id = "data"
                    var text = "数据"
                },
                object : UTSJSONObject() {
                    var id = "page"
                    var text = "页面"
                },
                object : UTSJSONObject() {
                    var id = "shopping"
                    var text = "购物车"
                },
                object : UTSJSONObject() {
                    var id = "loaded"
                    var text = "加载"
                },
                object : UTSJSONObject() {
                    var id = "network"
                    var text = "网络"
                },
                object : UTSJSONObject() {
                    var id = "search"
                    var text = "搜索"
                },
                object : UTSJSONObject() {
                    var id = "message"
                    var text = "消息"
                },
                object : UTSJSONObject() {
                    var id = "bill"
                    var text = "账单"
                },
                object : UTSJSONObject() {
                    var id = "wifi"
                    var text = "WiFi"
                },
                object : UTSJSONObject() {
                    var id = "star"
                    var text = "收藏"
                },
                object : UTSJSONObject() {
                    var id = "envelope"
                    var text = "信封"
                },
                object : UTSJSONObject() {
                    var id = "reservation"
                    var text = "预约"
                },
                object : UTSJSONObject() {
                    var id = "card"
                    var text = "卡包"
                },
                object : UTSJSONObject() {
                    var id = "favor"
                    var text = "收藏夹"
                },
                object : UTSJSONObject() {
                    var id = "record"
                    var text = "记录"
                },
                object : UTSJSONObject() {
                    var id = "clockin"
                    var text = "打卡"
                },
                object : UTSJSONObject() {
                    var id = "point"
                    var text = "积分"
                },
                object : UTSJSONObject() {
                    var id = "coupon"
                    var text = "优惠券"
                },
                object : UTSJSONObject() {
                    var id = "notice"
                    var text = "公告"
                },
                object : UTSJSONObject() {
                    var id = "present"
                    var text = "礼物"
                },
                object : UTSJSONObject() {
                    var id = "image"
                    var text = "图片"
                },
                object : UTSJSONObject() {
                    var id = "email"
                    var text = "邮件"
                },
                object : UTSJSONObject() {
                    var id = "deal"
                    var text = "交易"
                },
                object : UTSJSONObject() {
                    var id = "video"
                    var text = "视频"
                },
                object : UTSJSONObject() {
                    var id = "printer"
                    var text = "打印机"
                },
                object : UTSJSONObject() {
                    var id = "permission"
                    var text = "权限"
                },
                object : UTSJSONObject() {
                    var id = "location"
                    var text = "地址"
                },
                object : UTSJSONObject() {
                    var id = "income"
                    var text = "收入"
                },
                object : UTSJSONObject() {
                    var id = "comment"
                    var text = "评论"
                },
                object : UTSJSONObject() {
                    var id = "schedule"
                    var text = "日程"
                }
            ));
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_sn_select = resolveEasyComponent("sn-select", GenUniModulesSinleUiComponentsSnSelectSnSelectClass);
                val _component_sn_row = resolveEasyComponent("sn-row", GenUniModulesSinleUiComponentsSnRowSnRowClass);
                val _component_sn_switch = resolveEasyComponent("sn-switch", GenUniModulesSinleUiComponentsSnSwitchSnSwitchClass);
                val _component_sn_button = resolveEasyComponent("sn-button", GenUniModulesSinleUiComponentsSnButtonSnButtonClass);
                val _component_sn_empty = resolveEasyComponent("sn-empty", GenUniModulesSinleUiComponentsSnEmptySnEmptyClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Empty 空白页")),
                        createVNode(_component_com_card, utsMapOf("title" to "组件演示"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "空白页模式")),
                                        createVNode(_component_sn_select, utsMapOf("modelValue" to unref(mode), "onUpdate:modelValue" to fun(`$event`: Number){
                                            trySetRefValue(mode, `$event`);
                                        }
                                        , "data" to unref(data), "width" to "150px"), null, 8, utsArrayOf(
                                            "modelValue",
                                            "data"
                                        ))
                                    );
                                }
                                ), "_" to 1), 8, utsArrayOf(
                                    "style"
                                )),
                                createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "显示插槽")),
                                        createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(showSlot), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                            trySetRefValue(showSlot, `$event`);
                                        }
                                        ), null, 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1), 8, utsArrayOf(
                                    "style"
                                )),
                                createVNode(_component_sn_empty, utsMapOf("mode" to unref(data)[unref(mode)]["id"], "text" to unref(contents)[unref(data)[unref(mode)]["id"] as String]), utsMapOf("action" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        if (isTrue(unref(showSlot))) {
                                            createVNode(_component_sn_button, utsMapOf("key" to 0, "text" to "返回", "style" to normalizeStyle(utsMapOf("width" to "100px", "margin" to "30px auto"))), null, 8, utsArrayOf(
                                                "style"
                                            ));
                                        } else {
                                            createCommentVNode("v-if", true);
                                        }
                                    );
                                }
                                ), "_" to 1), 8, utsArrayOf(
                                    "mode",
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
