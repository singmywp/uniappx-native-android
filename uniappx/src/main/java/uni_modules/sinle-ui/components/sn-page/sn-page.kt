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
open class GenUniModulesSinleUiComponentsSnPageSnPage : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var scrollOn: Boolean by `$props`;
    open var scrollWithAnimation: Boolean by `$props`;
    open var direction: String by `$props`;
    open var bgColor: String by `$props`;
    open var padding: String by `$props`;
    open var bounces: Boolean by `$props`;
    open var customStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnPageSnPage) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnPageSnPage;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            fun emit(event: String, vararg do_not_transform_spread: Any?) {
                __ins.emit(event, *do_not_transform_spread);
            }
            val props = __props;
            val pageStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                var bgColor = if (props.bgColor == "") {
                    colors.value.page;
                } else {
                    props.bgColor;
                }
                ;
                styles.set("background", bgColor);
                styles.set("padding", props.padding);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            fun genRefresherpullingFn(e: UniRefresherEvent) {
                emit("refresherpulling", e);
            }
            val refresherpulling = ::genRefresherpullingFn;
            fun genRefresherrefreshFn(e: UniRefresherEvent) {
                emit("refresherrefresh", e);
            }
            val refresherrefresh = ::genRefresherrefreshFn;
            fun genRefresherrestoreFn(e: UniRefresherEvent) {
                emit("refresherrestore", e);
            }
            val refresherrestore = ::genRefresherrestoreFn;
            fun genRefresherabortFn(e: UniRefresherEvent) {
                emit("refresherabort", e);
            }
            val refresherabort = ::genRefresherabortFn;
            fun genScrolltoupperFn(e: UniScrollToUpperEvent) {
                emit("scrolltoupper", e);
            }
            val scrolltoupper = ::genScrolltoupperFn;
            fun genScrolltolowerFn(e: UniScrollToLowerEvent) {
                emit("scrolltolower", e);
            }
            val scrolltolower = ::genScrolltolowerFn;
            fun genScrollFn(e: UniScrollEvent) {
                emit("scroll", e);
            }
            val scroll = ::genScrollFn;
            fun genScrollendFn(e: UniScrollEvent) {
                emit("scrollend", e);
            }
            val scrollend = ::genScrollendFn;
            fun genStartnestedscrollFn(e: UniStartNestedScrollEvent) {
                emit("startnestedscroll", e);
            }
            val startnestedscroll = ::genStartnestedscrollFn;
            fun genNestedprescrollFn(e: UniNestedPreScrollEvent) {
                emit("nestedprescroll", e);
            }
            val nestedprescroll = ::genNestedprescrollFn;
            fun genStopnestedscrollFn(e: UniStopNestedScrollEvent) {
                emit("stopnestedscroll", e);
            }
            val stopnestedscroll = ::genStopnestedscrollFn;
            onLoad(fun(_){
                var bgColor = if (props.bgColor == "") {
                    colors.value.page;
                } else {
                    props.bgColor;
                }
                ;
                var pages = getCurrentPages();
                var uniPage = pages[pages.length - 1];
                var uniPageStyle = uniPage.`$getPageStyle`();
                uniPageStyle["backgroundColorContent"] = bgColor;
                uniPage.`$setPageStyle`(uniPageStyle);
            }
            );
            return fun(): Any? {
                return if (isTrue(_ctx.scrollOn)) {
                    createElementVNode("scroll-view", utsMapOf("key" to 0, "class" to "sn-page", "bounces" to _ctx.bounces, "show-scrollbar" to false, "direction" to _ctx.direction, "scrollWithAnimation" to _ctx.scrollWithAnimation, "onRefresherpulling" to refresherpulling, "onRefresherrefresh" to refresherrefresh, "onRefresherrestore" to refresherrestore, "onRefresherabort" to refresherabort, "onScrolltoupper" to scrolltoupper, "onScrolltolower" to scrolltolower, "onScroll" to scroll, "onScrollend" to scrollend, "onStartnestedscroll" to startnestedscroll, "onNestedprescroll" to nestedprescroll, "onStopnestedscroll" to stopnestedscroll, "style" to normalizeStyle(utsArrayOf(
                        unref(pageStylesC),
                        _ctx.customStyle
                    ))), utsArrayOf(
                        renderSlot(_ctx.`$slots`, "default")
                    ), 44, utsArrayOf(
                        "bounces",
                        "direction",
                        "scrollWithAnimation"
                    ));
                } else {
                    createElementVNode("view", utsMapOf("key" to 1, "class" to "sn-page", "style" to normalizeStyle(utsArrayOf(
                        unref(pageStylesC),
                        _ctx.customStyle
                    ))), utsArrayOf(
                        renderSlot(_ctx.`$slots`, "default")
                    ), 4);
                }
                ;
            }
            ;
        }
        ;
        var name = "sn-page";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-page" to padStyleMapOf(utsMapOf("flex" to 1, "height" to "100%", "width" to "100%")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf("refresherpulling" to null, "refresherrefresh" to null, "refresherrestore" to null, "refresherabort" to null, "scrolltoupper" to null, "scrolltolower" to null, "scroll" to null, "scrollend" to null, "startnestedscroll" to null, "nestedprescroll" to null, "stopnestedscroll" to null);
        var props = normalizePropsOptions(utsMapOf("scrollOn" to utsMapOf("type" to "Boolean", "default" to true), "scrollWithAnimation" to utsMapOf("type" to "Boolean", "default" to true), "direction" to utsMapOf("type" to "String", "default" to "vertical"), "bgColor" to utsMapOf("type" to "String", "default" to ""), "padding" to utsMapOf("type" to "String", "default" to "0 15px"), "bounces" to utsMapOf("type" to "Boolean", "default" to true), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "scrollOn",
            "scrollWithAnimation",
            "direction",
            "bgColor",
            "padding",
            "bounces",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
