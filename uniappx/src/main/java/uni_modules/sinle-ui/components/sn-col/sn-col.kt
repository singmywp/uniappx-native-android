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
open class GenUniModulesSinleUiComponentsSnColSnCol : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var gutter: String by `$props`;
    open var flex: Boolean by `$props`;
    open var span: Number by `$props`;
    open var offset: Number by `$props`;
    open var justify: String by `$props`;
    open var align: String by `$props`;
    open var customStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnColSnCol) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnColSnCol;
            val _cache = __ins.renderCache;
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
            val gutterC = computed(fun(): Number {
                return Math.max(snu.getPx(props.gutter), 0);
            }
            );
            val offsetC = computed(fun(): Number {
                return Math.max(props.offset, 0);
            }
            );
            val colStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("width", "" + (100 as Number) / 12 * props.span + "%");
                styles.set("justifyContent", justifyC.value);
                styles.set("alignItems", alignItemsC.value);
                styles.set("paddingLeft", "" + gutterC.value / 2 + "px");
                styles.set("paddingRight", "" + gutterC.value / 2 + "px");
                styles.set("marginLeft", "" + (100 as Number) / 12 * offsetC.value + "%");
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            return fun(): Any? {
                return createElementVNode("view", utsMapOf("class" to "sn-col", "style" to normalizeStyle(utsArrayOf(
                    unref(colStylesC),
                    _ctx.customStyle
                ))), utsArrayOf(
                    renderSlot(_ctx.`$slots`, "default")
                ), 4);
            }
            ;
        }
        ;
        var name = "sn-col";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-col" to padStyleMapOf(utsMapOf("display" to "flex")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf("gutter" to utsMapOf("type" to "String", "default" to "0px"), "flex" to utsMapOf("type" to "Boolean", "default" to true), "span" to utsMapOf("type" to "Number", "default" to 12), "offset" to utsMapOf("type" to "Number", "default" to 0), "justify" to utsMapOf("type" to "String", "default" to "center"), "align" to utsMapOf("type" to "String", "default" to "left"), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "gutter",
            "flex",
            "span",
            "offset",
            "justify",
            "align",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
