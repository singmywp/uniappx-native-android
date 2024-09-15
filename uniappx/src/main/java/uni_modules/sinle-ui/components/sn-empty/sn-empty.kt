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
open class GenUniModulesSinleUiComponentsSnEmptySnEmpty : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var mode: String by `$props`;
    open var text: String by `$props`;
    open var textSize: String by `$props`;
    open var textColor: String by `$props`;
    open var imageSize: String by `$props`;
    open var customTextStyle: Any by `$props`;
    open var customStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnEmptySnEmpty) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnEmptySnEmpty;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val props = __props;
            val imgSrc = computed(fun(): String {
                return getImage(props.mode) as String;
            }
            );
            val textSizeC = computed(fun(): String {
                return if (props.textSize == "") {
                    `$snui`.configs.font.size(3);
                } else {
                    props.textSize;
                }
                ;
            }
            );
            val textColorC = computed(fun(): String {
                return if (props.textColor == "") {
                    colors.value.disabledText;
                } else {
                    props.textColor;
                }
                ;
            }
            );
            return fun(): Any? {
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                return createElementVNode("view", utsMapOf("class" to "sn-empty", "style" to normalizeStyle(utsArrayOf(
                    _ctx.customStyle
                ))), utsArrayOf(
                    renderSlot(_ctx.`$slots`, "image", UTSJSONObject(), fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createElementVNode(uts.sdk.modules.snESvg.SnESvgComponent.name, utsMapOf("src" to unref(imgSrc), "style" to normalizeStyle(utsMapOf("width" to _ctx.imageSize, "height" to _ctx.imageSize))), null, 12, utsArrayOf(
                                "src"
                            ))
                        );
                    }
                    ),
                    renderSlot(_ctx.`$slots`, "text", UTSJSONObject(), fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_sn_text, utsMapOf("text" to _ctx.text, "size" to unref(textSizeC), "color" to unref(textColorC), "customStyle" to _ctx.customTextStyle, "style" to normalizeStyle(utsMapOf("margin" to "15px 0 5px 0", "fontFamily" to "misans-normal"))), null, 8, utsArrayOf(
                                "text",
                                "size",
                                "color",
                                "customStyle",
                                "style"
                            ))
                        );
                    }
                    ),
                    renderSlot(_ctx.`$slots`, "action")
                ), 4);
            }
            ;
        }
        ;
        var name = "sn-empty";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-empty" to padStyleMapOf(utsMapOf("alignItems" to "center", "justifyContent" to "center")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf("mode" to utsMapOf("type" to "String", "default" to "page"), "text" to utsMapOf("type" to "String", "default" to ""), "textSize" to utsMapOf("type" to "String", "default" to ""), "textColor" to utsMapOf("type" to "String", "default" to ""), "imageSize" to utsMapOf("type" to "String", "default" to "200px"), "customTextStyle" to utsMapOf("default" to UTSJSONObject()), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "mode",
            "text",
            "textSize",
            "textColor",
            "imageSize",
            "customTextStyle",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
