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
import io.dcloud.uniapp.extapi.showModal as uni_showModal;
open class GenPagesComponentsSnScanView : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentsSnScanView) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesComponentsSnScanView;
            val _cache = __ins.renderCache;
            val data = ref(SnScanParam(enableDing = true, showTorch = true, dingFileSrc = "", scanType = "all", continuous = false, scanOnlyOnce = false, title = "扫一扫", initZoomScale = 0.4, continuousSleep = 100, showAlbum = true, showBackButton = true, showAni = true, enableZoom = true));
            val scanEle = ref(null as GenUniModulesSinleUiComponentsSnScanSnScanComponentPublicInstance?);
            onLoad(fun(options){
                if (options["data"] != null) {
                    data.value = JSON.parseObject(decodeURI(options["data"] as String) as String) as SnScanParam;
                }
            }
            );
            fun genGoinFn(data: UTSJSONObject) {
                uni_showModal(ShowModalOptions(title = "扫描结果", content = data["value"] as String, showCancel = false, complete = fun(_){
                    scanEle.value!!.rescan();
                }
                ));
            }
            val goin = ::genGoinFn;
            return fun(): Any? {
                val _component_sn_scan = resolveEasyComponent("sn-scan", GenUniModulesSinleUiComponentsSnScanSnScanClass);
                return createVNode(_component_sn_scan, utsMapOf("ref_key" to "scanEle", "ref" to scanEle, "enableDing" to unref(data)["enableDing"], "showTorch" to unref(data)["showTorch"], "dingFileSrc" to unref(data)["dingFileSrc"], "scanType" to unref(data)["scanType"], "continuous" to unref(data)["continuous"], "scanOnlyOnce" to unref(data)["scanOnlyOnce"], "title" to unref(data)["title"], "initZoomScale" to unref(data)["initZoomScale"], "continuousSleep" to unref(data)["continuousSleep"], "showAlbum" to unref(data)["showAlbum"], "showBackButton" to unref(data)["showBackButton"], "showAni" to unref(data)["showAni"], "enableZoom" to unref(data)["enableZoom"], "onGoin" to goin), null, 8, utsArrayOf(
                    "enableDing",
                    "showTorch",
                    "dingFileSrc",
                    "scanType",
                    "continuous",
                    "scanOnlyOnce",
                    "title",
                    "initZoomScale",
                    "continuousSleep",
                    "showAlbum",
                    "showBackButton",
                    "showAni",
                    "enableZoom"
                ));
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
