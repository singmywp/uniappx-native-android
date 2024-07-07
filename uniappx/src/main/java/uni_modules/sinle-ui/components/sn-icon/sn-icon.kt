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
open class GenUniModulesSinleUiComponentsSnIconSnIcon : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var name: String by `$props`;
    open var font: String by `$props`;
    open var color: String by `$props`;
    open var size: String by `$props`;
    open var customStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnIconSnIcon) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnIconSnIcon;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val props = __props;
            val unicodes = computed(fun(): String {
                var names = props.name.match(UTSRegExp("[^,]+", "gsim")) ?: utsArrayOf<String>();
                var res = "";
                run {
                    var i: Number = 0;
                    while(i < names.length){
                        var codes = iconData.find(fun(item: UTSJSONObject): Boolean {
                            return item["name"] == names[i];
                        }
                        );
                        if (codes !== null) {
                            res += codes["unicode"] as String;
                        }
                        i++;
                    }
                }
                return res;
            }
            );
            val colorC = computed(fun(): String {
                return if (props.color == "") {
                    colors.value.text;
                } else {
                    props.color;
                }
                ;
            }
            );
            val sizeC = computed(fun(): String {
                return if (props.size == "") {
                    `$snui`.configs.font.size(5);
                } else {
                    props.size;
                }
                ;
            }
            );
            val iconStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("color", colorC.value);
                styles.set("fontFamily", props.font);
                styles.set("fontSize", sizeC.value);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            return fun(): Any? {
                return createElementVNode("text", utsMapOf("class" to "sn-icon", "style" to normalizeStyle(utsArrayOf(
                    unref(iconStylesC),
                    _ctx.customStyle
                ))), toDisplayString(unref(unicodes)), 5);
            }
            ;
        }
        ;
        var name = "sn-icon";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-icon" to padStyleMapOf(utsMapOf("transitionProperty" to "color,fontSize,transform")), "@TRANSITION" to utsMapOf("sn-icon" to utsMapOf("property" to "color,fontSize,transform")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf("name" to utsMapOf("type" to "String", "default" to ""), "font" to utsMapOf("type" to "String", "default" to "remixicon"), "color" to utsMapOf("type" to "String", "default" to ""), "size" to utsMapOf("type" to "String", "default" to ""), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "name",
            "font",
            "color",
            "size",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
