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
open class GenUniModulesSinleUiComponentsSnRowSnRow : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var justify: String by `$props`;
    open var align: String by `$props`;
    open var customStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnRowSnRow) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnRowSnRow;
            val _cache = __ins.renderCache;
            val instance = getCurrentInstance()!!;
            val snu = `$snui`.utils;
            val props = __props;
            val justifyC = computed(fun(): String {
                var justify = props.justify;
                if (justify == "left" || justify == "start") {
                    return "flex-start";
                } else if (justify == "right" || justify == "end") {
                    return "flex-end";
                } else if (justify == "around" || justify == "between") {
                    return "space-" + justify;
                }
                return justify;
            }
            );
            val alignItemsC = computed(fun(): String {
                var align = props.align;
                if (align == "top" || align == "start") {
                    return "flex-start";
                } else if (align == "bottom" || align == "end") {
                    return "flex-end";
                } else if (align == "around" || align == "between") {
                    return "space-" + align;
                }
                return align;
            }
            );
            val rowStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("justifyContent", justifyC.value);
                styles.set("alignItems", alignItemsC.value);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            return fun(): Any? {
                return createElementVNode("view", utsMapOf("class" to "sn-row", "style" to normalizeStyle(utsArrayOf(
                    unref(rowStylesC),
                    _ctx.customStyle
                ))), utsArrayOf(
                    renderSlot(_ctx.`$slots`, "default")
                ), 4);
            }
            ;
        }
        ;
        var name = "sn-row";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-row" to padStyleMapOf(utsMapOf("display" to "flex", "flexDirection" to "row")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf("justify" to utsMapOf("type" to "String", "default" to "start"), "align" to utsMapOf("type" to "String", "default" to "center"), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "justify",
            "align",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
