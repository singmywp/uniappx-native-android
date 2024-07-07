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
import io.dcloud.uniapp.extapi.navigateBack as uni_navigateBack;
open class GenUniModulesSinleUiComponentsSnTopbarSnTopbar : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var height: String by `$props`;
    open var title: String by `$props`;
    open var titleColor: String by `$props`;
    open var titleFont: String by `$props`;
    open var titleSize: String by `$props`;
    open var bgColor: String by `$props`;
    open var menuBgColor: String by `$props`;
    open var activeMenuBgColor: String by `$props`;
    open var fixed: Boolean by `$props`;
    open var boxShadow: String by `$props`;
    open var border: String by `$props`;
    open var borderRadius: String by `$props`;
    open var backButton: Boolean by `$props`;
    open var menuButton: Boolean by `$props`;
    open var buttonSize: String by `$props`;
    open var buttonBgColor: String by `$props`;
    open var buttonActiveBgColor: String by `$props`;
    open var buttonSpacing: String by `$props`;
    open var titleAlign: String by `$props`;
    open var features: UTSArray<Any?> by `$props`;
    open var menuData: UTSArray<Any?> by `$props`;
    open var customTitleStyle: Any by `$props`;
    open var customButtonStyle: Any by `$props`;
    open var customButtonIconStyle: Any by `$props`;
    open var customMenuStyle: Any by `$props`;
    open var customStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnTopbarSnTopbar) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnTopbarSnTopbar;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val snu = `$snui`.utils;
            fun emit(event: String, vararg do_not_transform_spread: Any?) {
                __ins.emit(event, *do_not_transform_spread);
            }
            val props = __props;
            val showMenuOverlay = ref(false);
            val showMenu = ref(false);
            val menuLocking = ref(false);
            val menuLockTimer = ref(0);
            val theme = computed(fun(): String {
                return `$snui`.configs.app.theme;
            }
            );
            val showTitleC = computed(fun(): Boolean {
                return !snu.text.isEmpty(props.title);
            }
            );
            val opacityC = computed(fun(): Number {
                return if (`$snui`.configs.app.theme == "light") {
                    0.15;
                } else {
                    0.5;
                }
                ;
            }
            );
            val titleColorC = computed(fun(): String {
                return if (props.titleColor == "") {
                    colors.value.title;
                } else {
                    props.titleColor;
                }
                ;
            }
            );
            val heightC = computed(fun(): String {
                return if (props.height == "") {
                    `$snui`.configs.page.topbarHeight;
                } else {
                    props.height;
                }
                ;
            }
            );
            val titleSizeC = computed(fun(): String {
                return if (props.titleSize == "") {
                    `$snui`.configs.font.size(4);
                } else {
                    props.titleSize;
                }
                ;
            }
            );
            val bgColorC = computed(fun(): String {
                return if (props.bgColor == "") {
                    colors.value.page;
                } else {
                    props.bgColor;
                }
                ;
            }
            );
            val menuBgColorC = computed(fun(): String {
                return if (props.menuBgColor == "") {
                    colors.value["" + (if (theme.value == "light") {
                        "front";
                    } else {
                        "info";
                    })] as String;
                } else {
                    props.menuBgColor;
                }
                ;
            }
            );
            val activeMenuBgColorC = computed(fun(): String {
                return if (props.menuBgColor == "") {
                    colors.value["" + (if (theme.value == "light") {
                        "info";
                    } else {
                        "infoLight";
                    })] as String;
                } else {
                    props.menuBgColor;
                }
                ;
            }
            );
            val buttonBgColorC = computed(fun(): String {
                var color = if (`$snui`.configs.app.theme == "light") {
                    255;
                } else {
                    0;
                }
                ;
                return if (props.buttonBgColor == "") {
                    "rgba(" + color + "," + color + "," + color + ",0)";
                } else {
                    props.buttonBgColor;
                }
                ;
            }
            );
            val buttonActiveBgColorC = computed(fun(): String {
                return if (props.buttonActiveBgColor == "") {
                    colors.value.infoActive;
                } else {
                    props.buttonActiveBgColor;
                }
                ;
            }
            );
            val topbarStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("height", heightC.value);
                styles.set("box-shadow", props.boxShadow);
                styles.set("border-radius", props.borderRadius);
                styles.set("border", props.border);
                styles.set("backgroundColor", bgColorC.value);
                styles.set("zIndex", `$snui`.configs.zIndex.navTabBar);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            val menuStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("top", heightC.value);
                styles.set("background", menuBgColorC.value);
                styles.set("zIndex", `$snui`.configs.zIndex.popup);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            watch(showMenuOverlay, fun(value: Boolean){
                if (value) {
                    nextTick(fun(){
                        setTimeout(fun(){
                            showMenu.value = true;
                        }, 1);
                    });
                } else {
                    showMenu.value = false;
                    setTimeout(fun(){
                        showMenuOverlay.value = false;
                    }
                    , parseInt(`$snui`.configs.aniTime.long));
                }
            }
            );
            fun genSetShowMenuFn(status: Boolean) {
                if (!menuLocking.value) {
                    clearTimeout(menuLockTimer.value);
                    menuLocking.value = true;
                    showMenuOverlay.value = status;
                    setTimeout(fun(){
                        menuLocking.value = false;
                    }
                    , parseInt(`$snui`.configs.aniTime.long) + 10);
                }
            }
            val setShowMenu = ::genSetShowMenuFn;
            fun genMenuClickFn(id: String) {
                emit("menu-click", object : UTSJSONObject() {
                    var id = id
                });
                setShowMenu(false);
            }
            val menuClick = ::genMenuClickFn;
            fun genButtonClickFn(id: String) {
                if (id == "menu") {
                    setShowMenu(true);
                }
                emit("button-click", object : UTSJSONObject() {
                    var id = id
                });
            }
            val buttonClick = ::genButtonClickFn;
            fun genBackFn() {
                uni_navigateBack(null);
            }
            val back = ::genBackFn;
            return fun(): Any? {
                val _component_sn_icon = resolveEasyComponent("sn-icon", GenUniModulesSinleUiComponentsSnIconSnIconClass);
                val _component_sn_button = resolveEasyComponent("sn-button", GenUniModulesSinleUiComponentsSnButtonSnButtonClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_sn_button_group = resolveEasyComponent("sn-button-group", GenUniModulesSinleUiComponentsSnButtonGroupSnButtonGroupClass);
                val _component_sn_menu_item = resolveEasyComponent("sn-menu-item", GenUniModulesSinleUiComponentsSnMenuItemSnMenuItemClass);
                val _component_sn_overlay = resolveEasyComponent("sn-overlay", GenUniModulesSinleUiComponentsSnOverlaySnOverlayClass);
                return createElementVNode(Fragment, null, utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to normalizeClass(utsArrayOf(
                        "sn-topbar",
                        if (_ctx.fixed == true) {
                            "sn-topbar-fixed";
                        } else {
                            "";
                        }
                    )), "style" to normalizeStyle(utsArrayOf(
                        unref(topbarStylesC),
                        _ctx.customStyle
                    ))), utsArrayOf(
                        renderSlot(_ctx.`$slots`, "header", UTSJSONObject(), fun(): UTSArray<Any> {
                            return utsArrayOf(
                                if (isTrue(_ctx.backButton)) {
                                    createVNode(_component_sn_button, utsMapOf("key" to 0, "round" to "", "roundSize" to _ctx.buttonSize, "bgColor" to unref(buttonBgColorC), "activeBgColor" to unref(buttonActiveBgColorC), "onClick" to back, "style" to normalizeStyle(utsArrayOf(
                                        _ctx.customButtonStyle
                                    ))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            createVNode(_component_sn_icon, utsMapOf("name" to "arrow-left-s-line", "style" to normalizeStyle(utsArrayOf(
                                                _ctx.customButtonIconStyle
                                            ))), null, 8, utsArrayOf(
                                                "style"
                                            ))
                                        );
                                    }), "_" to 1), 8, utsArrayOf(
                                        "roundSize",
                                        "bgColor",
                                        "activeBgColor",
                                        "style"
                                    ));
                                } else {
                                    createCommentVNode("v-if", true);
                                }
                            );
                        }
                        ),
                        renderSlot(_ctx.`$slots`, "default", UTSJSONObject(), fun(): UTSArray<Any> {
                            return utsArrayOf(
                                if (isTrue(unref(showTitleC))) {
                                    createVNode(_component_sn_text, utsMapOf("key" to 0, "overflow" to "ellipsis", "lines" to 1, "text" to _ctx.title, "color" to unref(titleColorC), "align" to _ctx.titleAlign, "font" to _ctx.titleFont, "size" to unref(titleSizeC), "style" to normalizeStyle(utsArrayOf(
                                        "flex: 1;margin: 0px 10px",
                                        _ctx.customTitleStyle
                                    ))), null, 8, utsArrayOf(
                                        "text",
                                        "color",
                                        "align",
                                        "font",
                                        "size",
                                        "style"
                                    ));
                                } else {
                                    createCommentVNode("v-if", true);
                                }
                            );
                        }
                        ),
                        renderSlot(_ctx.`$slots`, "footer", UTSJSONObject(), fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_button_group, utsMapOf("align" to "center", "spacing" to _ctx.buttonSpacing), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        createElementVNode(Fragment, null, RenderHelpers.renderList((_ctx.features as UTSArray<UTSJSONObject>), fun(e, index, _, _): VNode {
                                            return createVNode(_component_sn_button, utsMapOf("round" to "", "key" to index, "roundSize" to _ctx.buttonSize, "bgColor" to unref(buttonBgColorC), "activeBgColor" to unref(buttonBgColorC), "onClick" to fun(){
                                                buttonClick(e["id"] as String);
                                            }
                                            , "style" to normalizeStyle(utsArrayOf(
                                                _ctx.customButtonStyle
                                            ))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                                return utsArrayOf(
                                                    createVNode(_component_sn_icon, utsMapOf("name" to e["icon"]), null, 8, utsArrayOf(
                                                        "name"
                                                    ))
                                                );
                                            }
                                            ), "_" to 2), 1032, utsArrayOf(
                                                "roundSize",
                                                "bgColor",
                                                "activeBgColor",
                                                "onClick",
                                                "style"
                                            ));
                                        }
                                        ), 128),
                                        if (isTrue(_ctx.menuButton)) {
                                            createVNode(_component_sn_button, utsMapOf("key" to 0, "round" to "", "roundSize" to _ctx.buttonSize, "activeBgColor" to unref(buttonBgColorC), "bgColor" to unref(buttonBgColorC), "onClick" to fun(){
                                                buttonClick("menu");
                                            }, "style" to normalizeStyle(utsArrayOf(
                                                _ctx.customButtonStyle
                                            ))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                                return utsArrayOf(
                                                    createVNode(_component_sn_icon, utsMapOf("name" to "more-fill"))
                                                );
                                            }), "_" to 1), 8, utsArrayOf(
                                                "roundSize",
                                                "activeBgColor",
                                                "bgColor",
                                                "onClick",
                                                "style"
                                            ));
                                        } else {
                                            createCommentVNode("v-if", true);
                                        }
                                    );
                                }
                                ), "_" to 1), 8, utsArrayOf(
                                    "spacing"
                                ))
                            );
                        }
                        )
                    ), 6),
                    createVNode(_component_sn_overlay, utsMapOf("show" to unref(showMenuOverlay), "opacity" to unref(opacityC), "onTouchstart" to fun(){
                        setShowMenu(!unref(showMenuOverlay));
                    }
                    ), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            renderSlot(_ctx.`$slots`, "menu", UTSJSONObject(), fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    createElementVNode("view", utsMapOf("class" to normalizeClass(utsArrayOf(
                                        "sn-topbar-menu",
                                        utsMapOf("sn-topbar-menu-show" to unref(showMenu))
                                    )), "onTouchstart" to withModifiers(fun(){}, utsArrayOf(
                                        "stop"
                                    )), "style" to normalizeStyle(utsArrayOf(
                                        unref(menuStylesC),
                                        _ctx.customMenuStyle
                                    ))), utsArrayOf(
                                        createElementVNode(Fragment, null, RenderHelpers.renderList((_ctx.menuData as UTSArray<UTSJSONObject>), fun(e, index, _, _): VNode {
                                            return createVNode(_component_sn_menu_item, utsMapOf("key" to index, "bgColor" to unref(menuBgColorC), "activeBgColor" to unref(activeMenuBgColorC), "icon" to e["icon"], "text" to e["text"], "onClick" to fun(){
                                                menuClick(e["id"] as String);
                                            }
                                            ), null, 8, utsArrayOf(
                                                "bgColor",
                                                "activeBgColor",
                                                "icon",
                                                "text",
                                                "onClick"
                                            ));
                                        }
                                        ), 128)
                                    ), 46, utsArrayOf(
                                        "onTouchstart"
                                    ))
                                );
                            }
                            )
                        );
                    }
                    ), "_" to 3), 8, utsArrayOf(
                        "show",
                        "opacity",
                        "onTouchstart"
                    )),
                    if (isTrue(_ctx.fixed)) {
                        createElementVNode("view", utsMapOf("key" to 0, "class" to "fixed-placeholder", "style" to normalizeStyle(utsMapOf("height" to unref(heightC)))), null, 4);
                    } else {
                        createCommentVNode("v-if", true);
                    }
                ), 64);
            }
            ;
        }
        ;
        var name = "sn-topbar";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-topbar" to padStyleMapOf(utsMapOf("width" to "100%", "display" to "flex", "flexDirection" to "row", "alignItems" to "center", "paddingTop" to CSS_VAR_STATUS_BAR_HEIGHT, "paddingRight" to 10, "paddingBottom" to 10, "paddingLeft" to 20)), "sn-topbar-fixed" to padStyleMapOf(utsMapOf("position" to "fixed", "top" to 0, "left" to 0, "right" to 0)), "sn-topbar-menu" to padStyleMapOf(utsMapOf("position" to "fixed", "display" to "flex", "flexDirection" to "column", "alignContent" to "stretch", "minWidth" to 150, "minHeight" to 20, "borderRadius" to 10, "marginTop" to 10, "marginRight" to 10, "marginBottom" to 10, "marginLeft" to 10, "overflow" to "hidden", "right" to 5, "opacity" to 0, "transform" to "translate(50px, -100px) scale(0.5)")), "sn-topbar-menu-show" to padStyleMapOf(utsMapOf("transform" to "translate(0px, -20px) scale(1)", "opacity" to 1)), "fixed-placeholder" to padStyleMapOf(utsMapOf("width" to "100%", "backgroundColor" to "rgba(0,0,0,0)")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf("button-click" to null, "menu-click" to null);
        var props = normalizePropsOptions(utsMapOf("height" to utsMapOf("type" to "String", "default" to ""), "title" to utsMapOf("type" to "String", "default" to ""), "titleColor" to utsMapOf("type" to "String", "default" to ""), "titleFont" to utsMapOf("type" to "String", "default" to "alipuhuiheavy"), "titleSize" to utsMapOf("type" to "String", "default" to ""), "bgColor" to utsMapOf("type" to "String", "default" to ""), "menuBgColor" to utsMapOf("type" to "String", "default" to ""), "activeMenuBgColor" to utsMapOf("type" to "String", "default" to ""), "fixed" to utsMapOf("type" to "Boolean", "default" to true), "boxShadow" to utsMapOf("type" to "String", "default" to ""), "border" to utsMapOf("type" to "String", "default" to ""), "borderRadius" to utsMapOf("type" to "String", "default" to ""), "backButton" to utsMapOf("type" to "Boolean", "default" to true), "menuButton" to utsMapOf("type" to "Boolean", "default" to false), "buttonSize" to utsMapOf("type" to "String", "default" to "35px"), "buttonBgColor" to utsMapOf("type" to "String", "default" to ""), "buttonActiveBgColor" to utsMapOf("type" to "String", "default" to ""), "buttonSpacing" to utsMapOf("type" to "String", "default" to "0px"), "titleAlign" to utsMapOf("type" to "String", "default" to "left"), "features" to utsMapOf("type" to "Array", "default" to utsArrayOf<UTSJSONObject>(), "validator" to fun(value: UTSArray<Any>): Boolean {
            run {
                var i: Number = 0;
                while(i < value.length){
                    var e = value[i];
                    if ((e as UTSJSONObject)["icon"] != null && e["id"] != null) {
                        if (e["id"] != "menu") {
                            i++;
                            continue;
                        } else {
                            throw UTSError("The id of item of \"features\" cannot be \"menu\"");
                        }
                    } else {
                        throw UTSError("The forms of items of \"features\" is not correct");
                    }
                    i++;
                }
            }
            return true;
        }
        ), "menuData" to utsMapOf("type" to "Array", "default" to utsArrayOf<UTSJSONObject>(), "validator" to fun(value: UTSArray<Any>): Boolean {
            run {
                var i: Number = 0;
                while(i < value.length){
                    var e = value[i];
                    if ((e as UTSJSONObject)["icon"] == null || e["id"] == null) {
                        throw UTSError("The form of items of \"menuData\" is not correct");
                    }
                    i++;
                }
            }
            return true;
        }
        ), "customTitleStyle" to utsMapOf("default" to UTSJSONObject()), "customButtonStyle" to utsMapOf("default" to UTSJSONObject()), "customButtonIconStyle" to utsMapOf("default" to UTSJSONObject()), "customMenuStyle" to utsMapOf("default" to UTSJSONObject()), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "height",
            "title",
            "titleColor",
            "titleFont",
            "titleSize",
            "bgColor",
            "menuBgColor",
            "activeMenuBgColor",
            "fixed",
            "boxShadow",
            "border",
            "borderRadius",
            "backButton",
            "menuButton",
            "buttonSize",
            "buttonBgColor",
            "buttonActiveBgColor",
            "buttonSpacing",
            "titleAlign",
            "features",
            "menuData",
            "customTitleStyle",
            "customButtonStyle",
            "customButtonIconStyle",
            "customMenuStyle",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
