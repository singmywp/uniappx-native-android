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
import io.dcloud.uniapp.extapi.getSystemInfoSync as uni_getSystemInfoSync;
import io.dcloud.uniapp.extapi.navigateTo as uni_navigateTo;
open class GenPagesComponentsSnScan : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnScan) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnScan;
            val _cache = __ins.renderCache;
            val enableDing = ref(true);
            val showTorch = ref(true);
            val dingFileSrc = ref(0);
            val scanType = ref(0);
            val continuous = ref(false);
            val scanOnlyOnce = ref(false);
            val title = ref("扫一扫");
            val initZoomScale = ref("0.4");
            val continuousSleep = ref("100");
            val showAlbum = ref(true);
            val showBackButton = ref(true);
            val showAni = ref(true);
            val enableZoom = ref(true);
            val scanTypes = utsArrayOf(
                object : UTSJSONObject() {
                    var id = "all"
                    var text = "全部"
                },
                object : UTSJSONObject() {
                    var id = "barcode"
                    var text = "仅条码"
                },
                object : UTSJSONObject() {
                    var id = "qrcode"
                    var text = "仅二维码"
                }
            );
            val dingFiles = utsArrayOf(
                object : UTSJSONObject() {
                    var id = "default"
                    var text = "默认"
                },
                object : UTSJSONObject() {
                    var id = "scannedSuccessF"
                    var text = "女声:扫码成功"
                },
                object : UTSJSONObject() {
                    var id = "scannedSuccessM"
                    var text = "男声:扫码成功"
                },
                object : UTSJSONObject() {
                    var id = "jump"
                    var text = "(轻快)嘟"
                },
                object : UTSJSONObject() {
                    var id = "processing"
                    var text = "(长)biubiubiu~"
                }
            );
            watch(scanOnlyOnce, fun(v: Boolean){
                if (v) {
                    continuous.value = false;
                }
            }
            );
            fun genScanFn() {
                var sys = uni_getSystemInfoSync();
                if (sys.uniPlatform != "app" || sys.osName != "android") {
                    `$snui`.utils.platform.showToast(object : UTSJSONObject() {
                        var title = "扫码组件暂时只支持 Android 平台"
                    });
                    return;
                }
                var data = object : UTSJSONObject() {
                    var enableDing = enableDing.value
                    var dingFileSrc = if (dingFileSrc.value != 0) {
                        "static/media/" + dingFiles[dingFileSrc.value]["id"] + ".mp3";
                    } else {
                        "";
                    }
                    var scanType = scanTypes[scanType.value]["id"]
                    var scanOnlyOnce = scanOnlyOnce.value
                    var continuous = continuous.value
                    var title = title.value
                    var showTorch = showTorch.value
                    var showAlbum = showAlbum.value
                    var showBackButton = showBackButton.value
                    var showAni = showAni.value
                    var enableZoom = enableZoom.value
                    var initZoomScale = parseFloat(initZoomScale.value)
                    var continuousSleep = parseFloat(continuousSleep.value)
                };
                uni_navigateTo(NavigateToOptions(url = "/pages/components/sn-scan__view?data=" + encodeURI(JSON.stringify(data))));
            }
            val scan = ::genScanFn;
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_alert = resolveEasyComponent("sn-alert", GenUniModulesSinleUiComponentsSnAlertSnAlertClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_sn_select = resolveEasyComponent("sn-select", GenUniModulesSinleUiComponentsSnSelectSnSelectClass);
                val _component_sn_row = resolveEasyComponent("sn-row", GenUniModulesSinleUiComponentsSnRowSnRowClass);
                val _component_sn_switch = resolveEasyComponent("sn-switch", GenUniModulesSinleUiComponentsSnSwitchSnSwitchClass);
                val _component_sn_input = resolveEasyComponent("sn-input", GenUniModulesSinleUiComponentsSnInputSnInputClass);
                val _component_sn_button = resolveEasyComponent("sn-button", GenUniModulesSinleUiComponentsSnButtonSnButtonClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Scan 扫码")),
                        createVNode(_component_sn_alert, utsMapOf("type" to "primary", "text" to "\u3000注意，本插件分为两部分：\n\u3000• sn-scan-provider\n\u3000\u3000这是组件的核心部分，负责摄像头预览、扫码解析等基础工作，并向外部提供接口。\n\u3000• sn-scan\n\u3000\u3000这是组件的界面部分，主要负责在界面中处理用户操作并调用相应的API。应当将该组件放置在独立的页面中，并设置其flex: 1。如果您有自定义界面的需求，可参考此组件源码实现，重写UI。")),
                        createVNode(_component_sn_alert, utsMapOf("type" to "error", "text" to "\u3000\u3000本插件核心 sn-scan-provider 属于扩展组件，需要您另外在插件市场下载。\n\u3000\u3000sn-scan 则属于 SinleUI 基础组件的一部分，无需您额外下载。")),
                        createVNode(_component_com_card, utsMapOf("title" to "组件演示"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("class" to "introduction", "text" to "\u3000\u3000一款基于 Google MLKit 的 UTS扫码插件。")),
                                createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "扫码类型")),
                                        createVNode(_component_sn_select, utsMapOf("modelValue" to unref(scanType), "onUpdate:modelValue" to fun(`$event`: Number){
                                            trySetRefValue(scanType, `$event`);
                                        }
                                        , "width" to "150px", "data" to scanTypes), null, 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1), 8, utsArrayOf(
                                    "style"
                                )),
                                createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "自定义提示声")),
                                        createVNode(_component_sn_select, utsMapOf("modelValue" to unref(dingFileSrc), "onUpdate:modelValue" to fun(`$event`: Number){
                                            trySetRefValue(dingFileSrc, `$event`);
                                        }
                                        , "width" to "150px", "data" to dingFiles), null, 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1), 8, utsArrayOf(
                                    "style"
                                )),
                                createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "只扫一次")),
                                        createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(scanOnlyOnce), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                            trySetRefValue(scanOnlyOnce, `$event`);
                                        }
                                        ), null, 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1), 8, utsArrayOf(
                                    "style"
                                )),
                                createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "连续扫描")),
                                        createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(continuous), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                            trySetRefValue(continuous, `$event`);
                                        }
                                        , "disabled" to unref(scanOnlyOnce)), null, 8, utsArrayOf(
                                            "modelValue",
                                            "disabled"
                                        ))
                                    );
                                }
                                ), "_" to 1), 8, utsArrayOf(
                                    "style"
                                )),
                                createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "显示动画")),
                                        createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(showAni), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                            trySetRefValue(showAni, `$event`);
                                        }
                                        ), null, 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1), 8, utsArrayOf(
                                    "style"
                                )),
                                createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "显示手电筒")),
                                        createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(showTorch), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                            trySetRefValue(showTorch, `$event`);
                                        }
                                        ), null, 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1), 8, utsArrayOf(
                                    "style"
                                )),
                                createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "显示相册选择")),
                                        createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(showAlbum), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                            trySetRefValue(showAlbum, `$event`);
                                        }
                                        ), null, 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1), 8, utsArrayOf(
                                    "style"
                                )),
                                createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "显示返回按钮")),
                                        createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(showBackButton), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                            trySetRefValue(showBackButton, `$event`);
                                        }
                                        ), null, 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1), 8, utsArrayOf(
                                    "style"
                                )),
                                createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "启用手势缩放")),
                                        createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(enableZoom), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                            trySetRefValue(enableZoom, `$event`);
                                        }
                                        ), null, 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1), 8, utsArrayOf(
                                    "style"
                                )),
                                createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "启用成功提示声")),
                                        createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(enableDing), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                            trySetRefValue(enableDing, `$event`);
                                        }
                                        ), null, 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1), 8, utsArrayOf(
                                    "style"
                                )),
                                createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "界面标题")),
                                        createVNode(_component_sn_input, utsMapOf("class" to "input", "modelValue" to unref(title), "onUpdate:modelValue" to fun(`$event`: String){
                                            trySetRefValue(title, `$event`);
                                        }
                                        ), null, 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1), 8, utsArrayOf(
                                    "style"
                                )),
                                createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "初始焦距")),
                                        createVNode(_component_sn_input, utsMapOf("class" to "input", "modelValue" to unref(initZoomScale), "onUpdate:modelValue" to fun(`$event`: String){
                                            trySetRefValue(initZoomScale, `$event`);
                                        }
                                        ), null, 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1), 8, utsArrayOf(
                                    "style"
                                )),
                                createVNode(_component_sn_row, utsMapOf("justify" to "space-between", "style" to normalizeStyle(utsMapOf("margin-bottom" to "20px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "连续扫描间隔(ms)")),
                                        createVNode(_component_sn_input, utsMapOf("class" to "input", "modelValue" to unref(continuousSleep), "onUpdate:modelValue" to fun(`$event`: String){
                                            trySetRefValue(continuousSleep, `$event`);
                                        }
                                        ), null, 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1), 8, utsArrayOf(
                                    "style"
                                )),
                                createVNode(_component_sn_button, utsMapOf("text" to "扫码", "level" to "second", "type" to "primary", "onClick" to fun(){
                                    scan();
                                }
                                , "style" to normalizeStyle(utsMapOf("margin-top" to "10px"))), null, 8, utsArrayOf(
                                    "onClick",
                                    "style"
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
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ), utsArrayOf(
                    GenApp.styles
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("input" to padStyleMapOf(utsMapOf("flex" to 1, "marginLeft" to 10)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
