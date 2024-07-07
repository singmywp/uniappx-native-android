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
import io.dcloud.uniapp.extapi.navigateTo as uni_navigateTo;
open class GenPagesIndexIndex : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesIndexIndex) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesIndexIndex;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val snu = `$snui`.utils;
            val theme = computed(fun(): String {
                return `$snui`.configs.app.theme;
            }
            );
            val fontSizeValue = ref(14);
            val autoTheme = ref(true);
            watch(fun(): Boolean {
                return `$snui`.configs.app.autoTheme;
            }
            , fun(v: Boolean){
                autoTheme.value = v;
            }
            );
            watch(autoTheme, fun(v: Boolean){
                `$snui`.configs.app.autoTheme = v;
            }
            );
            onLoad(fun(_){
                autoTheme.value = `$snui`.configs.app.autoTheme;
            }
            );
            fun genChangeSizeFn(e: UniSliderChangeEvent) {
                console.log("" + e.detail.value + "px", " at pages/index/index.uvue:29");
                `$snui`.configs.font.baseSize = "" + e.detail.value + "px";
            }
            val changeSize = ::genChangeSizeFn;
            fun genChangeThemeFn() {
                `$snui`.configs.app.theme = if (theme.value == "light") {
                    "dark";
                } else {
                    "light";
                }
                ;
            }
            val changeTheme = ::genChangeThemeFn;
            val basicList = utsArrayOf(
                object : UTSJSONObject() {
                    var icon = "text"
                    var text = "文本"
                    var name = "sn-text"
                },
                object : UTSJSONObject() {
                    var icon = "rectangle-line"
                    var text = "按钮"
                    var name = "sn-button"
                },
                object : UTSJSONObject() {
                    var icon = "instance-line"
                    var text = "视图容器"
                    var name = "sn-view"
                },
                object : UTSJSONObject() {
                    var icon = "image-line"
                    var text = "图片"
                    var name = "sn-image"
                },
                object : UTSJSONObject() {
                    var icon = "remixicon-line"
                    var text = "图标"
                    var name = "sn-icon"
                },
                object : UTSJSONObject() {
                    var icon = "separator"
                    var text = "分割线"
                    var name = "sn-line"
                },
                object : UTSJSONObject() {
                    var icon = "link"
                    var text = "链接"
                    var name = "sn-link"
                },
                object : UTSJSONObject() {
                    var icon = "remix-run-line"
                    var text = "过渡动画"
                    var name = "sn-transition"
                }
            );
            val formList = utsArrayOf(
                object : UTSJSONObject() {
                    var icon = "article-line"
                    var text = "表单"
                    var name = "sn-form"
                },
                object : UTSJSONObject() {
                    var icon = "toggle-line"
                    var text = "开关"
                    var name = "sn-switch"
                },
                object : UTSJSONObject() {
                    var icon = "checkbox-line"
                    var text = "复选框"
                    var name = "sn-checkbox"
                },
                object : UTSJSONObject() {
                    var icon = "radio-button-line"
                    var text = "单选框"
                    var name = "sn-radio"
                },
                object : UTSJSONObject() {
                    var icon = "input-field"
                    var text = "输入框"
                    var name = "sn-input"
                },
                object : UTSJSONObject() {
                    var icon = "text-block"
                    var text = "文本域"
                    var name = "sn-textarea"
                },
                object : UTSJSONObject() {
                    var icon = "star-line"
                    var text = "评分"
                    var name = "sn-rate"
                },
                object : UTSJSONObject() {
                    var icon = "skip-down-line"
                    var text = "选择框"
                    var name = "sn-select"
                },
                object : UTSJSONObject() {
                    var icon = "add-box-line"
                    var text = "步进器"
                    var name = "sn-stepper"
                }
            );
            val displayList = utsArrayOf(
                object : UTSJSONObject() {
                    var icon = "notification-4-line"
                    var text = "警告信息"
                    var name = "sn-alert"
                },
                object : UTSJSONObject() {
                    var icon = "user-smile-line"
                    var text = "头像"
                    var name = "sn-avatar"
                },
                object : UTSJSONObject() {
                    var icon = "notification-badge-line"
                    var text = "徽标"
                    var name = "sn-badge"
                },
                object : UTSJSONObject() {
                    var icon = "price-tag-3-line"
                    var text = "标签"
                    var name = "sn-tag"
                },
                object : UTSJSONObject() {
                    var icon = "id-card-line"
                    var text = "卡片"
                    var name = "sn-card"
                },
                object : UTSJSONObject() {
                    var icon = "file-list-2-line"
                    var text = "列表"
                    var name = "sn-list"
                },
                object : UTSJSONObject() {
                    var icon = "timer-2-line"
                    var text = "倒计时"
                    var name = "sn-countdown"
                },
                object : UTSJSONObject() {
                    var icon = "number-6"
                    var text = "数字滚动"
                    var name = "sn-countto"
                },
                object : UTSJSONObject() {
                    var icon = "timer-line"
                    var text = "计时器"
                    var name = "sn-timer"
                },
                object : UTSJSONObject() {
                    var icon = "loader-4-line"
                    var text = "加载"
                    var name = "sn-loading"
                },
                object : UTSJSONObject() {
                    var icon = "loader-3-line"
                    var text = "加载页"
                    var name = "sn-loading-page"
                },
                object : UTSJSONObject() {
                    var icon = "skip-down-line"
                    var text = "加载更多"
                    var name = "sn-loadmore"
                },
                object : UTSJSONObject() {
                    var icon = "star-smile-line"
                    var text = "动画"
                    var name = "sn-animation"
                },
                object : UTSJSONObject() {
                    var icon = "sticky-note-line"
                    var text = "弹出提示"
                    var name = "sn-tooltip"
                }
            );
            val feedbackList = utsArrayOf(
                object : UTSJSONObject() {
                    var icon = "question-mark"
                    var text = "空白页"
                    var name = "sn-empty"
                },
                object : UTSJSONObject() {
                    var icon = "file-check-line"
                    var text = "结果页"
                    var name = "sn-result"
                },
                object : UTSJSONObject() {
                    var icon = "shadow-line"
                    var text = "遮罩层"
                    var name = "sn-overlay"
                },
                object : UTSJSONObject() {
                    var icon = "chat-3-line"
                    var text = "弹出层"
                    var name = "sn-popup"
                },
                object : UTSJSONObject() {
                    var icon = "chat-smile-2-line"
                    var text = "模态框"
                    var name = "sn-modal"
                },
                object : UTSJSONObject() {
                    var icon = "message-3-line"
                    var text = "轻提示"
                    var name = "sn-toast"
                }
            );
            val layoutList = utsArrayOf(
                object : UTSJSONObject() {
                    var icon = "pages-line"
                    var text = "页面"
                    var name = "sn-page"
                },
                object : UTSJSONObject() {
                    var icon = "space"
                    var text = "占位间隔"
                    var name = "sn-gap"
                },
                object : UTSJSONObject() {
                    var icon = "skip-up-line"
                    var text = "返回顶部"
                    var name = "sn-backtop"
                },
                object : UTSJSONObject() {
                    var icon = "layout-bottom-line"
                    var text = "折叠面板"
                    var name = "sn-collapse"
                },
                object : UTSJSONObject() {
                    var icon = "layout-row-line"
                    var text = "水平布局"
                    var name = "sn-row"
                },
                object : UTSJSONObject() {
                    var icon = "layout-column-line"
                    var text = "垂直布局"
                    var name = "sn-col"
                },
                object : UTSJSONObject() {
                    var icon = "grid-line"
                    var text = "宫格布局"
                    var name = "sn-grid"
                },
                object : UTSJSONObject() {
                    var icon = "kanban-view-2"
                    var text = "分段器"
                    var name = "sn-subsection"
                },
                object : UTSJSONObject() {
                    var icon = "folder-3-line"
                    var text = "标签页"
                    var name = "sn-tabs"
                },
                object : UTSJSONObject() {
                    var icon = "compass-discover-line"
                    var text = "导航栏"
                    var name = "sn-topbar"
                }
            );
            val functionList = utsArrayOf(
                object : UTSJSONObject() {
                    var icon = "qr-scan-2-line"
                    var text = "扫码"
                    var name = "sn-scan"
                }
            );
            val comLists = utsArrayOf(
                object : UTSJSONObject() {
                    var name = "基础组件"
                    var data = basicList
                },
                object : UTSJSONObject() {
                    var name = "表单组件"
                    var data = formList
                },
                object : UTSJSONObject() {
                    var name = "展示组件"
                    var data = displayList
                },
                object : UTSJSONObject() {
                    var name = "反馈组件"
                    var data = feedbackList
                },
                object : UTSJSONObject() {
                    var name = "布局组件"
                    var data = layoutList
                },
                object : UTSJSONObject() {
                    var name = "功能组件"
                    var data = functionList
                }
            );
            val libList = utsArrayOf(
                object : UTSJSONObject() {
                    var icon = "tools-line"
                    var text = "工具库"
                    var name = "sn-utils"
                },
                object : UTSJSONObject() {
                    var icon = "palette-line"
                    var text = "颜色库"
                    var name = "sn-color"
                },
                object : UTSJSONObject() {
                    var icon = "hand"
                    var text = "手势库"
                    var name = "sn-gesture"
                },
                object : UTSJSONObject() {
                    var icon = "calendar-2-line"
                    var text = "日期库"
                    var name = "sn-date"
                }
            );
            fun genGotoComponentPageFn(e: UTSJSONObject) {
                uni_navigateTo(NavigateToOptions(url = "/pages/components/" + e["name"] as String));
            }
            val gotoComponentPage = ::genGotoComponentPageFn;
            fun genGotoLibPageFn(e: UTSJSONObject) {
                uni_navigateTo(NavigateToOptions(url = "/pages/libs/" + e["name"] as String));
            }
            val gotoLibPage = ::genGotoLibPageFn;
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_alert = resolveEasyComponent("sn-alert", GenUniModulesSinleUiComponentsSnAlertSnAlertClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_sn_switch = resolveEasyComponent("sn-switch", GenUniModulesSinleUiComponentsSnSwitchSnSwitchClass);
                val _component_sn_row = resolveEasyComponent("sn-row", GenUniModulesSinleUiComponentsSnRowSnRowClass);
                val _component_slider = resolveComponent("slider");
                val _component_sn_button = resolveEasyComponent("sn-button", GenUniModulesSinleUiComponentsSnButtonSnButtonClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_icon = resolveEasyComponent("sn-icon", GenUniModulesSinleUiComponentsSnIconSnIconClass);
                val _component_sn_grid_item = resolveEasyComponent("sn-grid-item", GenUniModulesSinleUiComponentsSnGridItemSnGridItemClass);
                val _component_sn_grid_group = resolveEasyComponent("sn-grid-group", GenUniModulesSinleUiComponentsSnGridGroupSnGridGroupClass);
                val _component_sn_backtop = resolveEasyComponent("sn-backtop", GenUniModulesSinleUiComponentsSnBacktopSnBacktopClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "SinleUI", "height" to "80px", "menuButton" to "", "bgColor" to unref(colors).page, "backButton" to false, "features" to utsArrayOf(
                            object : UTSJSONObject() {
                                var id = "add"
                                var icon = "add-line"
                            }
                        ), "menuData" to utsArrayOf(
                            object : UTSJSONObject() {
                                var id = "add"
                                var icon = "add-line"
                                var text = "选项第一"
                            },
                            object : UTSJSONObject() {
                                var id = "delete"
                                var icon = "delete-bin-line"
                                var text = "选项第二"
                            },
                            object : UTSJSONObject() {
                                var id = "delete"
                                var icon = "home-smile-line"
                                var text = "选项第三"
                            },
                            object : UTSJSONObject() {
                                var id = "delete"
                                var icon = "mail-line"
                                var text = "选项第四"
                            },
                            object : UTSJSONObject() {
                                var id = "delete"
                                var icon = "chat-3-line"
                                var text = "选项第五"
                            },
                            object : UTSJSONObject() {
                                var id = "delete"
                                var icon = "contrast-drop-line"
                                var text = "选项第六"
                            },
                            object : UTSJSONObject() {
                                var id = "delete"
                                var icon = "tv-line"
                                var text = "选项第七"
                            },
                            object : UTSJSONObject() {
                                var id = "delete"
                                var icon = "fingerprint-line"
                                var text = "选项第八"
                            },
                            object : UTSJSONObject() {
                                var id = "delete"
                                var icon = "copper-coin-line"
                                var text = "选项第九"
                            }
                        )), null, 8, utsArrayOf(
                            "bgColor"
                        )),
                        createVNode(_component_com_card, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_alert, utsMapOf("type" to "primary", "text" to "SinleUI 全新发布", "icon" to "notification-fill")),
                                createVNode(_component_sn_row, utsMapOf("justify" to "space-between"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createVNode(_component_sn_text, utsMapOf("text" to "跟随系统主题")),
                                        createVNode(_component_sn_switch, utsMapOf("modelValue" to unref(autoTheme), "onUpdate:modelValue" to fun(`$event`: Boolean){
                                            trySetRefValue(autoTheme, `$event`);
                                        }
                                        ), null, 8, utsArrayOf(
                                            "modelValue"
                                        ))
                                    );
                                }
                                ), "_" to 1)),
                                createVNode(_component_slider, utsMapOf("value" to unref(fontSizeValue), "max" to 30, "min" to 5, "show-value" to "", "onChange" to changeSize), null, 8, utsArrayOf(
                                    "value"
                                )),
                                createVNode(_component_sn_button, utsMapOf("type" to "primary", "text" to ("\u5207\u6362\u4E3B\u9898(\u5F53\u524D:" + unref(theme) + ")"), "onClick" to changeTheme), null, 8, utsArrayOf(
                                    "text"
                                ))
                            );
                        }
                        ), "_" to 1)),
                        createElementVNode(Fragment, null, RenderHelpers.renderList((comLists as UTSArray<UTSJSONObject>), fun(list, listIndex, _, _): VNode {
                            return createVNode(_component_com_card, utsMapOf("key" to listIndex, "title" to list["name"]), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    createVNode(_component_sn_grid_group, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            createElementVNode(Fragment, null, RenderHelpers.renderList((list["data"] as UTSArray<UTSJSONObject>), fun(e, index, _, _): VNode {
                                                return createVNode(_component_sn_grid_item, utsMapOf("class" to "com-item", "key" to index, "onClick" to fun(){
                                                    gotoComponentPage(e);
                                                }
                                                ), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                                    return utsArrayOf(
                                                        createVNode(_component_sn_icon, utsMapOf("name" to (e["icon"] ?: "")), null, 8, utsArrayOf(
                                                            "name"
                                                        )),
                                                        createVNode(_component_sn_text, utsMapOf("align" to "center", "text" to (e["text"] ?: ""), "size" to unref(`$snui`).configs.font.size(1)), null, 8, utsArrayOf(
                                                            "text",
                                                            "size"
                                                        ))
                                                    );
                                                }
                                                ), "_" to 2), 1032, utsArrayOf(
                                                    "onClick"
                                                ));
                                            }
                                            ), 128)
                                        );
                                    }
                                    ), "_" to 2), 1024)
                                );
                            }
                            ), "_" to 2), 1032, utsArrayOf(
                                "title"
                            ));
                        }
                        ), 128),
                        createVNode(_component_com_card, utsMapOf("title" to "核心库"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_grid_group, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createElementVNode(Fragment, null, RenderHelpers.renderList((libList as UTSArray<UTSJSONObject>), fun(e, index, _, _): VNode {
                                            return createVNode(_component_sn_grid_item, utsMapOf("class" to "com-item", "key" to index, "onClick" to fun(){
                                                gotoLibPage(e);
                                            }
                                            ), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                                return utsArrayOf(
                                                    createVNode(_component_sn_icon, utsMapOf("name" to (e["icon"] ?: "")), null, 8, utsArrayOf(
                                                        "name"
                                                    )),
                                                    createVNode(_component_sn_text, utsMapOf("text" to (e["text"] ?: ""), "size" to unref(`$snui`).configs.font.size(1)), null, 8, utsArrayOf(
                                                        "text",
                                                        "size"
                                                    ))
                                                );
                                            }
                                            ), "_" to 2), 1032, utsArrayOf(
                                                "onClick"
                                            ));
                                        }
                                        ), 128)
                                    );
                                }
                                ), "_" to 1))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_sn_backtop, utsMapOf("type" to "primary", "level" to "second"))
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
                return utsMapOf("components-list" to padStyleMapOf(utsMapOf("marginTop" to 20)), "content" to padStyleMapOf(utsMapOf("display" to "flex", "flex" to 1)), "contain" to padStyleMapOf(utsMapOf("paddingTop" to 30, "paddingRight" to 20, "paddingBottom" to 30, "paddingLeft" to 20)), "description" to padStyleMapOf(utsMapOf("fontSize" to 15, "color" to "#6e7073")), "popup-content" to padStyleMapOf(utsMapOf("backgroundColor" to "#FFFFFF", "paddingTop" to 10, "paddingRight" to 10, "paddingBottom" to 10, "paddingLeft" to 10, "width" to "80%", "marginTop" to 10, "marginRight" to "auto", "marginBottom" to 10, "marginLeft" to "auto", "borderRadius" to 15)), "com-item" to padStyleMapOf(utsMapOf("paddingTop" to 10, "paddingRight" to 0, "paddingBottom" to 10, "paddingLeft" to 0)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
