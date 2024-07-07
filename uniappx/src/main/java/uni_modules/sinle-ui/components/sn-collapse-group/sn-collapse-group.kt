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
open class GenUniModulesSinleUiComponentsSnCollapseGroupSnCollapseGroup : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var accordion: Boolean by `$props`;
    open var aniDur: Number by `$props`;
    open var bgColor: String by `$props`;
    open var titleSize: String by `$props`;
    open var titleColor: String by `$props`;
    open var activeTitleColor: String by `$props`;
    open var customTitleStyle: Any by `$props`;
    open var customHolderStyle: Any by `$props`;
    open var customStyle: Any by `$props`;
    open var register: (node: ComponentPublicInstance) -> Unit
        get() {
            return unref(this.`$exposed`["register"]) as (node: ComponentPublicInstance) -> Unit;
        }
        set(value) {
            setRefValue(this.`$exposed`, "register", value);
        }
    open var closeAll: () -> Unit
        get() {
            return unref(this.`$exposed`["closeAll"]) as () -> Unit;
        }
        set(value) {
            setRefValue(this.`$exposed`, "closeAll", value);
        }
    open var getChildren: () -> UTSArray<UniElement>
        get() {
            return unref(this.`$exposed`["getChildren"]) as () -> UTSArray<UniElement>;
        }
        set(value) {
            setRefValue(this.`$exposed`, "getChildren", value);
        }
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnCollapseGroupSnCollapseGroup, _arg1: SetupContext) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props, ref1): Any? {
            var __expose = ref1.expose;
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnCollapseGroupSnCollapseGroup;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val props = __props;
            val nodesList = ref(utsArrayOf<ComponentPublicInstance>());
            val groupEle = ref(null as UniElement?);
            val aniDurC = computed(fun(): Number {
                return if (props.aniDur == parseFloat(`$snui`.configs.aniTime.normal)) {
                    parseFloat(`$snui`.configs.aniTime.normal);
                } else {
                    props.aniDur;
                }
                ;
            }
            );
            val bgColorC = computed(fun(): String {
                return if (props.bgColor == "") {
                    colors.value.front;
                } else {
                    props.bgColor;
                }
                ;
            }
            );
            val titleSizeC = computed(fun(): String {
                return if (props.titleSize == "") {
                    `$snui`.configs.font.size(3);
                } else {
                    props.titleSize;
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
            val activeTitleColorC = computed(fun(): String {
                return if (props.titleColor == "") {
                    colors.value.primary;
                } else {
                    props.titleColor;
                }
                ;
            }
            );
            val groupStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("border-radius", `$snui`.configs.radius.normal);
                styles.set("background", bgColorC.value);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            provide("aniDur", aniDurC.value);
            provide("bgColor", bgColorC.value);
            provide("titleSize", titleSizeC.value);
            provide("titleColor", titleColorC.value);
            provide("activeTitleColor", activeTitleColorC.value);
            provide("customTitleStyle", props.customTitleStyle);
            provide("customHolderStyle", props.customHolderStyle);
            fun genRegisterFn(node: ComponentPublicInstance) {
                nodesList.value.push(node);
            }
            val register = ::genRegisterFn;
            fun genCloseAllFn() {
                if (props.accordion && nodesList.value.length > 0) {
                    nodesList.value.forEach(fun(e: ComponentPublicInstance){
                        e.`$callMethod`("close");
                    }
                    );
                }
            }
            val closeAll = ::genCloseAllFn;
            fun genGetChildrenFn(): UTSArray<UniElement> {
                var children = utsArrayOf<UniElement>();
                groupEle.value!!.children.map(fun(ele: UniElement){
                    if (ele.dataset.get("sn-type") == "sn-collapse-item") {
                        children.push(ele);
                    }
                }
                );
                return children;
            }
            val getChildren = ::genGetChildrenFn;
            __expose(utsMapOf("register" to register, "closeAll" to closeAll, "getChildren" to getChildren));
            return fun(): Any? {
                return createElementVNode("view", utsMapOf("class" to "sn-collapse-group", "ref_key" to "groupEle", "ref" to groupEle, "style" to normalizeStyle(utsArrayOf(
                    unref(groupStylesC),
                    _ctx.customStyle
                ))), utsArrayOf(
                    renderSlot(_ctx.`$slots`, "default")
                ), 4);
            }
            ;
        }
        ;
        var name = "sn-collapse-group";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-collapse-group" to padStyleMapOf(utsMapOf("display" to "flex", "flexDirection" to "column")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf("accordion" to utsMapOf("type" to "Boolean", "default" to false), "aniDur" to utsMapOf("type" to "Number", "default" to parseFloat(`$snui`.configs.aniTime.normal)), "bgColor" to utsMapOf("type" to "String", "default" to ""), "titleSize" to utsMapOf("type" to "String", "default" to ""), "titleColor" to utsMapOf("type" to "String", "default" to ""), "activeTitleColor" to utsMapOf("type" to "String", "default" to ""), "customTitleStyle" to utsMapOf("default" to UTSJSONObject()), "customHolderStyle" to utsMapOf("default" to UTSJSONObject()), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "accordion",
            "aniDur",
            "bgColor",
            "titleSize",
            "titleColor",
            "activeTitleColor",
            "customTitleStyle",
            "customHolderStyle",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
