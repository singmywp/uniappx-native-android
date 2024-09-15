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
open class GenPagesLibsSnUtils : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesLibsSnUtils) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesLibsSnUtils;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val curTab = ref(0);
            val ifList = ref(utsArrayOf<Number>(0));
            val tabs = utsArrayOf<SnTab>(SnTab(id = "text", text = "文本类"), SnTab(id = "verify", text = "校验类"), SnTab(id = "os", text = "系统类"), SnTab(id = "platform", text = "平台类"), SnTab(id = "random", text = "随机类"), SnTab(id = "other", text = "其他类"), SnTab(id = "permission", text = "权限类"));
            fun genChangeTabFn(index: Number) {
                if (!ifList.value.includes(index)) {
                    ifList.value.push(index);
                }
            }
            val changeTab = ::genChangeTabFn;
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_tabs = resolveEasyComponent("sn-tabs", GenUniModulesSinleUiComponentsSnTabsSnTabsClass);
                val _component_sn_gap = resolveEasyComponent("sn-gap", GenUniModulesSinleUiComponentsSnGapSnGapClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Utils 工具库")),
                        createVNode(_component_sn_tabs, utsMapOf("modelValue" to unref(curTab), "onUpdate:modelValue" to fun(`$event`: Number){
                            trySetRefValue(curTab, `$event`);
                        }
                        , "scrollable" to "", "data" to tabs, "bgColor" to unref(colors).page, "onChange" to changeTab, "customStyle" to object : UTSJSONObject() {
                            var position = "fixed"
                            var top = unref(`$snui`).configs.page.topbarHeight
                        }), null, 8, utsArrayOf(
                            "modelValue",
                            "bgColor",
                            "customStyle"
                        )),
                        createVNode(_component_sn_gap, utsMapOf("height" to "40px")),
                        if (isTrue(unref(ifList).includes(0))) {
                            createElementVNode("view", utsMapOf("key" to 0, "style" to normalizeStyle(utsMapOf("visibility" to if (unref(curTab) == 0) {
                                "visible";
                            } else {
                                "hidden";
                            }, "height" to if (unref(curTab) == 0) {
                                "";
                            } else {
                                "0";
                            }))), utsArrayOf(
                                createVNode(unref(GenPagesLibsUtilsPageTextClass))
                            ), 4);
                        } else {
                            createCommentVNode("v-if", true);
                        }
                        ,
                        if (isTrue(unref(ifList).includes(1))) {
                            createElementVNode("view", utsMapOf("key" to 1, "style" to normalizeStyle(utsMapOf("visibility" to if (unref(curTab) == 1) {
                                "visible";
                            } else {
                                "hidden";
                            }, "height" to if (unref(curTab) == 1) {
                                "";
                            } else {
                                "0";
                            }))), utsArrayOf(
                                createVNode(unref(GenPagesLibsUtilsPageVerifyClass))
                            ), 4);
                        } else {
                            createCommentVNode("v-if", true);
                        }
                        ,
                        if (isTrue(unref(ifList).includes(2))) {
                            createElementVNode("view", utsMapOf("key" to 2, "style" to normalizeStyle(utsMapOf("visibility" to if (unref(curTab) == 2) {
                                "visible";
                            } else {
                                "hidden";
                            }, "height" to if (unref(curTab) == 2) {
                                "";
                            } else {
                                "0";
                            }))), utsArrayOf(
                                createVNode(unref(GenPagesLibsUtilsPageOsClass))
                            ), 4);
                        } else {
                            createCommentVNode("v-if", true);
                        }
                        ,
                        if (isTrue(unref(ifList).includes(3))) {
                            createElementVNode("view", utsMapOf("key" to 3, "style" to normalizeStyle(utsMapOf("visibility" to if (unref(curTab) == 3) {
                                "visible";
                            } else {
                                "hidden";
                            }, "height" to if (unref(curTab) == 3) {
                                "";
                            } else {
                                "0";
                            }))), utsArrayOf(
                                createVNode(unref(GenPagesLibsUtilsPagePlatformClass))
                            ), 4);
                        } else {
                            createCommentVNode("v-if", true);
                        }
                        ,
                        if (isTrue(unref(ifList).includes(4))) {
                            createElementVNode("view", utsMapOf("key" to 4, "style" to normalizeStyle(utsMapOf("visibility" to if (unref(curTab) == 4) {
                                "visible";
                            } else {
                                "hidden";
                            }, "height" to if (unref(curTab) == 4) {
                                "";
                            } else {
                                "0";
                            }))), utsArrayOf(
                                createVNode(unref(GenPagesLibsUtilsPageRandomClass))
                            ), 4);
                        } else {
                            createCommentVNode("v-if", true);
                        }
                        ,
                        if (isTrue(unref(ifList).includes(5))) {
                            createElementVNode("view", utsMapOf("key" to 5, "style" to normalizeStyle(utsMapOf("visibility" to if (unref(curTab) == 5) {
                                "visible";
                            } else {
                                "hidden";
                            }, "height" to if (unref(curTab) == 5) {
                                "";
                            } else {
                                "0";
                            }))), utsArrayOf(
                                createVNode(unref(GenPagesLibsUtilsPageOtherClass))
                            ), 4);
                        } else {
                            createCommentVNode("v-if", true);
                        }
                        ,
                        if (isTrue(unref(ifList).includes(6))) {
                            createElementVNode("view", utsMapOf("key" to 6, "style" to normalizeStyle(utsMapOf("visibility" to if (unref(curTab) == 6) {
                                "visible";
                            } else {
                                "hidden";
                            }, "height" to if (unref(curTab) == 6) {
                                "";
                            } else {
                                "0";
                            }))), utsArrayOf(
                                createVNode(unref(GenPagesLibsUtilsPagePermissionClass))
                            ), 4);
                        } else {
                            createCommentVNode("v-if", true);
                        }
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
                return utsMapOf("com-item" to padStyleMapOf(utsMapOf("paddingTop" to 10, "paddingRight" to 0, "paddingBottom" to 10, "paddingLeft" to 0)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
