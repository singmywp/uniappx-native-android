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
open class GenPagesLibsUtilsPagePermission : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesLibsUtilsPagePermission) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesLibsUtilsPagePermission;
            val _cache = __ins.renderCache;
            val snu = `$snui`.utils;
            val p1 = utsArrayOf(
                "android.permission.CAMERA"
            );
            val p2 = ref("");
            val p3 = utsArrayOf(
                "android.permission.CAMERA",
                "android.permission.ACCESS_FINE_LOCATION"
            );
            val p4 = ref("");
            val p5 = utsArrayOf(
                "android.permission.CAMERA",
                "android.permission.READ_MEDIA_IMAGES"
            );
            val p6 = utsArrayOf(
                "android.permission.MANAGE_EXTERNAL_STORAGE"
            );
            fun genRequestPermFn() {
                var tip = "";
                snu.permission.requestSystemPermission(requestSystemPermissionOptions(permissions = p5, success = fun(allRight: Boolean, grantedList: UTSArray<String>){
                    if (allRight) {
                        tip = "所有权限皆已授予";
                    } else {
                        tip = "用户授予了部分权限";
                    }
                    uni_showModal(ShowModalOptions(title = "提示", content = "" + tip + "\n\n\u5DF2\u6388\u4E88\u6743\u9650\u5217\u8868\uFF1A\n" + grantedList));
                }
                , fail = fun(doNotAskAgain: Boolean, deniedList: UTSArray<String>){
                    if (doNotAskAgain) {
                        tip = "用户拒绝了所有权限且选择不再询问";
                    } else {
                        tip = "用户拒绝了部分权限";
                    }
                    uni_showModal(ShowModalOptions(title = "提示", content = "" + tip + "\n\n\u5DF2\u62D2\u7EDD\u6743\u9650\u5217\u8868\uFF1A\n" + deniedList));
                }
                ));
            }
            val requestPerm = ::genRequestPermFn;
            return fun(): Any? {
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_sn_button = resolveEasyComponent("sn-button", GenUniModulesSinleUiComponentsSnButtonSnButtonClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                return createElementVNode(Fragment, null, utsArrayOf(
                    createVNode(_component_com_card, utsMapOf("title" to "是否具备指定权限", "note" to "检查当前应用是否已经具备指定权限。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6743\u9650\uFF1A" + JSON.stringify(p1) + "\n\u662F\u5426\u5177\u5907\uFF1A" + unref(p2) + "\n\n")), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_button, utsMapOf("type" to "primary", "text" to "检查权限", "onClick" to fun(){
                                p2.value = unref(snu).permission.checkSystemPermissionGranted(p1).toString();
                            }
                            ), null, 8, utsArrayOf(
                                "onClick"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "获取未授权的系统权限", "note" to "检查当前应用是否已经具备指定权限。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u6743\u9650\uFF1A" + JSON.stringify(p3) + "\n\u672A\u6388\u6743\u5217\u8868\uFF1A" + unref(p4) + "\n\n")), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_button, utsMapOf("type" to "primary", "text" to "获取权限列表", "onClick" to fun(){
                                p4.value = JSON.stringify(unref(snu).permission.getSystemPermissionDenied(p3));
                            }
                            ), null, 8, utsArrayOf(
                                "onClick"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "请求系统权限", "note" to "向用户请求指定的系统权限。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u8BF7\u6C42\u6743\u9650\uFF1A" + JSON.stringify(p5) + "\n\n")), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_button, utsMapOf("type" to "primary", "text" to "请求权限", "onClick" to fun(){
                                requestPerm();
                            }
                            ), null, 8, utsArrayOf(
                                "onClick"
                            ))
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_com_card, utsMapOf("title" to "跳转到系统权限设置页面", "note" to "跳转到操作系统的权限设置页面，以便用户可以直接在系统设置中管理应用权限。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to ("\u8BF7\u6C42\u6743\u9650\uFF1A" + JSON.stringify(p6) + "\n\n")), null, 8, utsArrayOf(
                                "text"
                            )),
                            createVNode(_component_sn_button, utsMapOf("type" to "primary", "text" to "跳转", "onClick" to fun(){
                                unref(snu).permission.gotoSystemPermissionActivity(p6);
                            }
                            ), null, 8, utsArrayOf(
                                "onClick"
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
