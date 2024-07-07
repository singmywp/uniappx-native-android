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
open class GenUniModulesSinleUiComponentsSnButtonGroupSnButtonGroup : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var vertical: Boolean by `$props`;
    open var spacing: String by `$props`;
    open var merge: Boolean by `$props`;
    open var justify: String by `$props`;
    open var align: String by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnButtonGroupSnButtonGroup) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnButtonGroupSnButtonGroup;
            val _cache = __ins.renderCache;
            val props = __props;
            val buttonGroupEle = ref(null as UniElement?);
            onMounted(fun(){
                nextTick(fun(){
                    var children = buttonGroupEle.value!!.children;
                    var merge = props.merge;
                    run {
                        var i: Number = 0;
                        while(i < children.length){
                            var v = children[i] as UniElement;
                            if (v.tagName != "COMMENT") {
                                v.style.setProperty("transition-duration", `$snui`.configs.aniTime.normal);
                                v.style.setProperty("margin-right", if (merge) {
                                    "0";
                                } else {
                                    props.spacing;
                                }
                                );
                                v.style.setProperty("margin-bottom", if (merge) {
                                    "0";
                                } else {
                                    props.spacing;
                                }
                                );
                            }
                            i++;
                        }
                    }
                }
                );
            }
            );
            val groupStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("flexDirection", if (props.vertical) {
                    "column";
                } else {
                    "row";
                }
                );
                styles.set("justifyContent", props.justify);
                styles.set("alignItems", props.align);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            return fun(): Any? {
                return createElementVNode("view", utsMapOf("ref_key" to "buttonGroupEle", "ref" to buttonGroupEle, "class" to "sn-button-group", "style" to normalizeStyle(unref(groupStylesC))), utsArrayOf(
                    renderSlot(_ctx.`$slots`, "default")
                ), 4);
            }
            ;
        }
        ;
        var name = "sn-button-group";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-button-group" to padStyleMapOf(utsMapOf("display" to "flex", "flexWrap" to "wrap")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf("vertical" to utsMapOf("type" to "Boolean", "default" to false), "spacing" to utsMapOf("type" to "String", "default" to "5px"), "merge" to utsMapOf("type" to "Boolean", "default" to false), "justify" to utsMapOf("type" to "String", "default" to "flex-start"), "align" to utsMapOf("type" to "String", "default" to "flex-start")));
        var propsNeedCastKeys = utsArrayOf(
            "vertical",
            "spacing",
            "merge",
            "justify",
            "align"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
