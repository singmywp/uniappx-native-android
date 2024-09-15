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
open class GenUniModulesSinleUiComponentsSnListSnList : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var associativeContainer: String by `$props`;
    open var bounces: Boolean by `$props`;
    open var upperThreshold: Number by `$props`;
    open var lowerThreshold: Number by `$props`;
    open var scrollTop: Number by `$props`;
    open var showScrollbar: Boolean by `$props`;
    open var scrollIntoView: String by `$props`;
    open var scrollWithAnimation: Boolean by `$props`;
    open var refresherEnabled: Boolean by `$props`;
    open var refresherThreshold: Number by `$props`;
    open var refresherMaxDragDistance: Number by `$props`;
    open var refresherDefaultStyle: String by `$props`;
    open var refresherBackground: String by `$props`;
    open var refresherTriggered: Boolean by `$props`;
    open var enableBackToTop: Boolean by `$props`;
    open var customNestedScroll: Boolean by `$props`;
    open var showBorder: Boolean by `$props`;
    open var bgColor: String by `$props`;
    open var customStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnListSnList) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnListSnList;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val snu = `$snui`.utils;
            val instance = getCurrentInstance()!!;
            val props = __props;
            provide("showBorder", props.showBorder);
            val bgColorC = computed(fun(): String {
                return if (props.bgColor == "") {
                    colors.value.front;
                } else {
                    props.bgColor;
                }
                ;
            }
            );
            fun genInjectChildrenFn() {
                var children = instance.proxy!!.`$children`;
                children.forEach(fun(child: ComponentPublicInstance){
                    child.`$callMethod`("setChildren", children);
                }
                );
            }
            val injectChildren = ::genInjectChildrenFn;
            onMounted(fun(){
                injectChildren();
            }
            );
            onUpdated(fun(){
                injectChildren();
            }
            );
            return fun(): Any? {
                return createElementVNode("list-view", utsMapOf("class" to "sn-list", "associativeContainer" to _ctx.associativeContainer, "bounces" to _ctx.bounces, "upperThreshold" to _ctx.upperThreshold, "lowerThreshold" to _ctx.lowerThreshold, "scrollTop" to _ctx.scrollTop, "showScrollbar" to _ctx.showScrollbar, "scrollIntoView" to _ctx.scrollIntoView, "scrollWithAnimation" to _ctx.scrollWithAnimation, "refresherEnabled" to _ctx.refresherEnabled, "refresherThreshold" to _ctx.refresherThreshold, "refresherMaxDragDistance" to _ctx.refresherMaxDragDistance, "refresherDefaultStyle" to _ctx.refresherDefaultStyle, "refresherBackground" to _ctx.refresherBackground, "refresherTriggered" to _ctx.refresherTriggered, "enableBackToTop" to _ctx.enableBackToTop, "customNestedScroll" to _ctx.customNestedScroll, "style" to normalizeStyle(utsArrayOf(
                    utsMapOf("background" to unref(bgColorC), "borderRadius" to unref(`$snui`).configs.radius.normal, "transitionDuration" to unref(`$snui`).configs.aniTime.normal),
                    _ctx.customStyle
                ))), utsArrayOf(
                    renderSlot(_ctx.`$slots`, "default")
                ), 12, utsArrayOf(
                    "associativeContainer",
                    "bounces",
                    "upperThreshold",
                    "lowerThreshold",
                    "scrollTop",
                    "showScrollbar",
                    "scrollIntoView",
                    "scrollWithAnimation",
                    "refresherEnabled",
                    "refresherThreshold",
                    "refresherMaxDragDistance",
                    "refresherDefaultStyle",
                    "refresherBackground",
                    "refresherTriggered",
                    "enableBackToTop",
                    "customNestedScroll"
                ));
            }
            ;
        }
        ;
        var name = "sn-list";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-list" to padStyleMapOf(utsMapOf("minHeight" to 20, "width" to "100%", "marginTop" to 0, "marginRight" to "auto", "marginBottom" to 0, "marginLeft" to "auto", "display" to "flex", "flexDirection" to "column", "overflow" to "hidden")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf("click" to null);
        var props = normalizePropsOptions(utsMapOf("associativeContainer" to utsMapOf("type" to "String", "default" to ""), "bounces" to utsMapOf("type" to "Boolean", "default" to false), "upperThreshold" to utsMapOf("type" to "Number", "default" to 50), "lowerThreshold" to utsMapOf("type" to "Number", "default" to 50), "scrollTop" to utsMapOf("type" to "Number", "default" to 0), "showScrollbar" to utsMapOf("type" to "Boolean", "default" to true), "scrollIntoView" to utsMapOf("type" to "String", "default" to ""), "scrollWithAnimation" to utsMapOf("type" to "Boolean", "default" to false), "refresherEnabled" to utsMapOf("type" to "Boolean", "default" to false), "refresherThreshold" to utsMapOf("type" to "Number", "default" to 45), "refresherMaxDragDistance" to utsMapOf("type" to "Number", "default" to 100), "refresherDefaultStyle" to utsMapOf("type" to "String", "default" to "black"), "refresherBackground" to utsMapOf("type" to "String", "default" to "transparent"), "refresherTriggered" to utsMapOf("type" to "Boolean", "default" to false), "enableBackToTop" to utsMapOf("type" to "Boolean", "default" to false), "customNestedScroll" to utsMapOf("type" to "Boolean", "default" to false), "showBorder" to utsMapOf("type" to "Boolean", "default" to true), "bgColor" to utsMapOf("type" to "String", "default" to ""), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "associativeContainer",
            "bounces",
            "upperThreshold",
            "lowerThreshold",
            "scrollTop",
            "showScrollbar",
            "scrollIntoView",
            "scrollWithAnimation",
            "refresherEnabled",
            "refresherThreshold",
            "refresherMaxDragDistance",
            "refresherDefaultStyle",
            "refresherBackground",
            "refresherTriggered",
            "enableBackToTop",
            "customNestedScroll",
            "showBorder",
            "bgColor",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
