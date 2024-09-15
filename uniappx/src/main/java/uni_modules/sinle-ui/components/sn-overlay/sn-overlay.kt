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
open class GenUniModulesSinleUiComponentsSnOverlaySnOverlay : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var show: Boolean by `$props`;
    open var opacity: Number by `$props`;
    open var aniDur: Number by `$props`;
    open var bgColor: String by `$props`;
    open var customStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnOverlaySnOverlay) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnOverlaySnOverlay;
            val _cache = __ins.renderCache;
            val props = __props;
            val ifV = ref(false);
            val showV = ref(false);
            val overlayEle = ref(null as UniElement?);
            val aniTimer = ref(0);
            val bgColorC = computed(fun(): UTSArray<Number> {
                var origin = props.bgColor;
                var color = `$snui`.libs.color.tinyColor(origin);
                var rgb = if (color.isValid) {
                    color.toRgb();
                } else {
                    `$snui`.libs.color.tinyColor("#000").toRgb();
                }
                ;
                return utsArrayOf(
                    rgb.r,
                    rgb.g,
                    rgb.b
                );
            }
            );
            val aniDurC = computed(fun(): Number {
                return if (props.aniDur == parseInt(`$snui`.configs.aniTime.long)) {
                    parseInt(`$snui`.configs.aniTime.long);
                } else {
                    props.aniDur;
                }
                ;
            }
            );
            val overlayStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("zIndex", `$snui`.configs.zIndex.overlay);
                styles.set("transition-duration", "" + aniDurC.value + "ms");
                return styles;
            }
            );
            fun genSetStatusFn(status: Boolean) {
                if (overlayEle.value != null) {
                    var styles = overlayEle.value!!.style;
                    setTimeout(fun(){
                        styles.setProperty("background-color", "rgba(" + bgColorC.value[0] + ", " + bgColorC.value[1] + ", " + bgColorC.value[2] + ", " + props.opacity + ")");
                        styles.setProperty("opacity", "" + (if (status) {
                            1;
                        } else {
                            0;
                        }
                        ));
                    }
                    , 20);
                }
            }
            val setStatus = ::genSetStatusFn;
            watch(fun(): Boolean {
                return props.show;
            }
            , fun(value: Boolean){
                clearTimeout(aniTimer.value);
                if (value) {
                    ifV.value = true;
                }
                nextTick(fun(){
                    setStatus(value);
                    setTimeout(fun(){
                        showV.value = value;
                        if (!value) {
                            ifV.value = false;
                        }
                    }
                    , aniDurC.value);
                }
                );
            }
            , WatchOptions(immediate = true));
            return fun(): Any? {
                return if (isTrue(unref(ifV))) {
                    createElementVNode("view", utsMapOf("key" to 0, "class" to "sn-overlay", "ref_key" to "overlayEle", "ref" to overlayEle, "style" to normalizeStyle(utsArrayOf(
                        unref(overlayStylesC),
                        _ctx.customStyle
                    ))), utsArrayOf(
                        renderSlot(_ctx.`$slots`, "default")
                    ), 4);
                } else {
                    createCommentVNode("v-if", true);
                }
                ;
            }
            ;
        }
        ;
        var name = "sn-overlay";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-overlay" to padStyleMapOf(utsMapOf("position" to "fixed", "left" to 0, "bottom" to 0, "right" to 0, "top" to 0)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf("show" to utsMapOf("type" to "Boolean", "default" to false), "opacity" to utsMapOf("type" to "Number", "default" to 0.3), "aniDur" to utsMapOf("type" to "Number", "default" to parseInt(`$snui`.configs.aniTime.long)), "bgColor" to utsMapOf("type" to "String", "default" to "#000"), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "show",
            "opacity",
            "aniDur",
            "bgColor",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
