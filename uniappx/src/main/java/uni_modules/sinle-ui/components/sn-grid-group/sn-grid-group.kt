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
open class GenUniModulesSinleUiComponentsSnGridGroupSnGridGroup : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var col: Number by `$props`;
    open var align: String by `$props`;
    open var customStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnGridGroupSnGridGroup) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnGridGroupSnGridGroup;
            val _cache = __ins.renderCache;
            val props = __props;
            provide("col", props.col);
            val justifyC = computed(fun(): String {
                var align = props.align;
                if (align == "left" || align == "start") {
                    return "flex-start";
                } else if (align == "right" || align == "end") {
                    return "flex-end";
                } else if (align == "around" || align == "between") {
                    return "space-" + align;
                }
                return align;
            }
            );
            val groupStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("justify-content", justifyC.value);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            return fun(): Any? {
                return createElementVNode("view", utsMapOf("class" to "sn-grid-group", "style" to normalizeStyle(utsArrayOf(
                    unref(groupStylesC),
                    _ctx.customStyle
                ))), utsArrayOf(
                    renderSlot(_ctx.`$slots`, "default")
                ), 4);
            }
            ;
        }
        ;
        var name = "sn-grid-group";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-grid-group" to padStyleMapOf(utsMapOf("flexDirection" to "row", "flexWrap" to "wrap")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf("col" to utsMapOf("type" to "Number", "default" to 4), "align" to utsMapOf("type" to "String", "default" to "left"), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "col",
            "align",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
