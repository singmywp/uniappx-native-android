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
import io.dcloud.uniapp.extapi.getElementById as uni_getElementById;
open class GenUniModulesSinleUiComponentsSnRateSnRate : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var modelValue: Number by `$props`;
    open var count: Number by `$props`;
    open var readonly: Boolean by `$props`;
    open var clearable: Boolean by `$props`;
    open var allowHalf: Boolean by `$props`;
    open var spacing: String by `$props`;
    open var inactiveColor: String by `$props`;
    open var activeColor: String by `$props`;
    open var icon: String by `$props`;
    open var iconSize: String by `$props`;
    open var activeIcon: String by `$props`;
    open var halfIcon: String by `$props`;
    open var customStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnRateSnRate) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnRateSnRate;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val snu = `$snui`.utils;
            fun emit(event: String, vararg do_not_transform_spread: Any?) {
                __ins.emit(event, *do_not_transform_spread);
            }
            val props = __props;
            val prefixId = randomId();
            val suffixId = randomId();
            val prefixEle = ref(null as UniElement?);
            val suffixEle = ref(null as UniElement?);
            onMounted(fun(){
                nextTick(fun(){
                    prefixEle.value = uni_getElementById(prefixId);
                    suffixEle.value = uni_getElementById(suffixId);
                }
                );
            }
            );
            val model = computed<Number>(WritableComputedOptions(get = fun(): Number {
                return props.modelValue;
            }
            , set = fun(value: Number){
                emit("update:modelValue", value);
            }
            ));
            val activeIconC = computed(fun(): String {
                var givenIcon = props.activeIcon;
                return if (snu.text.isEmpty(givenIcon)) {
                    props.icon;
                } else {
                    givenIcon;
                }
                ;
            }
            );
            val activeValue = computed(fun(): Number {
                return Math.min(props.count, Math.max(model.value, 0));
            }
            );
            val prefixText = computed(fun(): String {
                if (props.allowHalf) {
                    var activeValueInt = Math.trunc(activeValue.value);
                    return (activeIconC.value + ",").repeat(activeValueInt) + (if (activeValue.value - activeValueInt == 0.5) {
                        props.halfIcon;
                    } else {
                        "";
                    });
                } else {
                    return (activeIconC.value + ",").repeat(activeValue.value);
                }
            }
            );
            val restCount = computed(fun(): Number {
                return Math.max(props.count - activeValue.value, 0);
            }
            );
            val suffixText = computed(fun(): String {
                var icon = if (props.allowHalf) {
                    if (props.icon == "star-fill") {
                        "star-line";
                    } else {
                        props.icon;
                    };
                } else {
                    props.icon;
                }
                ;
                return (icon as String + ",").repeat(Math.trunc(restCount.value));
            }
            );
            val componentPos = computed(fun(): UTSArray<Number> {
                if (activeValue.value > 0 && prefixEle.value != null && suffixEle.value != null) {
                    var pre = (prefixEle.value as UniElement).getBoundingClientRect() as DOMRect;
                    return utsArrayOf(
                        pre.x as Number,
                        pre.y as Number
                    );
                } else if (activeValue.value == 0 && suffixEle != null) {
                    var suf = (suffixEle.value as UniElement).getBoundingClientRect() as DOMRect;
                    return utsArrayOf(
                        suf.x as Number,
                        suf.y as Number
                    );
                } else {
                    return utsArrayOf(
                        0,
                        0
                    );
                }
            }
            );
            val componentWidth = computed(fun(): Number {
                if (prefixEle.value != null && suffixEle.value != null) {
                    return (prefixEle.value as UniElement).offsetWidth as Number + (suffixEle.value as UniElement).offsetWidth as Number;
                } else {
                    return 0;
                }
            }
            );
            val inactiveColorC = computed(fun(): String {
                return if (props.inactiveColor == "") {
                    colors.value.infoDark;
                } else {
                    props.inactiveColor;
                }
                ;
            }
            );
            val activeColorC = computed(fun(): String {
                return if (props.activeColor == "") {
                    colors.value.warning;
                } else {
                    props.activeColor;
                }
                ;
            }
            );
            val iconSizeC = computed(fun(): String {
                return if (props.iconSize == "") {
                    `$snui`.configs.font.size(4);
                } else {
                    props.iconSize;
                }
                ;
            }
            );
            val iconStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("letterSpacing", props.spacing);
                return styles;
            }
            );
            fun genRateTouchedFn(e: UniTouchEvent) {
                var count = props.count;
                if (!props.readonly) {
                    var touch = e.touches[0];
                    var itemX = touch.clientX as Number - componentPos.value[0];
                    var itemWidth = componentWidth.value / count;
                    var itemValueInt = parseInt((itemX / itemWidth).toString());
                    var itemValue = itemValueInt + (if (props.allowHalf) {
                        if (itemX / itemWidth - itemValueInt > 0.5) {
                            1;
                        } else {
                            0.5;
                        };
                    } else {
                        1;
                    }
                    );
                    if (itemValue > count) {
                        itemValue = count;
                    } else if (itemValue < 0) {
                        itemValue = 0;
                    }
                    if (props.clearable && itemValue == model.value) {
                        itemValue = 0;
                    }
                    model.value = itemValue;
                    emit("change", object : UTSJSONObject() {
                        var value = itemValue
                    });
                }
            }
            val rateTouched = ::genRateTouchedFn;
            return fun(): Any? {
                val _component_sn_icon = resolveEasyComponent("sn-icon", GenUniModulesSinleUiComponentsSnIconSnIconClass);
                return if (_ctx.count > 0) {
                    createElementVNode("view", utsMapOf("key" to 0, "class" to "sn-rate", "style" to normalizeStyle(utsArrayOf(
                        _ctx.customStyle
                    ))), utsArrayOf(
                        withDirectives(createVNode(_component_sn_icon, utsMapOf("class" to "sn-rate-prefix", "id" to unref(prefixId), "name" to unref(prefixText), "color" to unref(activeColorC), "size" to unref(iconSizeC), "onTouchstart" to rateTouched, "style" to normalizeStyle(unref(iconStylesC))), null, 8, utsArrayOf(
                            "id",
                            "name",
                            "color",
                            "size",
                            "style"
                        )), utsArrayOf(
                            utsArrayOf(
                                vShow,
                                unref(activeValue) > 0
                            )
                        )),
                        withDirectives(createVNode(_component_sn_icon, utsMapOf("class" to "sn-rate-suffix", "id" to unref(suffixId), "name" to unref(suffixText), "color" to unref(inactiveColorC), "size" to unref(iconSizeC), "onTouchstart" to rateTouched, "style" to normalizeStyle(unref(iconStylesC))), null, 8, utsArrayOf(
                            "id",
                            "name",
                            "color",
                            "size",
                            "style"
                        )), utsArrayOf(
                            utsArrayOf(
                                vShow,
                                unref(restCount) > 0
                            )
                        ))
                    ), 4);
                } else {
                    createCommentVNode("v-if", true);
                }
                ;
            }
            ;
        }
        ;
        var name = "sn-rate";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-rate" to padStyleMapOf(utsMapOf("flexDirection" to "row", "flexWrap" to "nowrap")), "sn-rate-prefix" to padStyleMapOf(utsMapOf("lines" to 1)), "sn-rate-suffix" to padStyleMapOf(utsMapOf("lines" to 1)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf("change" to null, "update:modelValue" to null);
        var props = normalizePropsOptions(utsMapOf("modelValue" to utsMapOf("type" to "Number", "default" to 0), "count" to utsMapOf("type" to "Number", "default" to 5), "readonly" to utsMapOf("type" to "Boolean", "default" to false), "clearable" to utsMapOf("type" to "Boolean", "default" to false), "allowHalf" to utsMapOf("type" to "Boolean", "default" to false), "spacing" to utsMapOf("type" to "String", "default" to "5px"), "inactiveColor" to utsMapOf("type" to "String", "default" to ""), "activeColor" to utsMapOf("type" to "String", "default" to ""), "icon" to utsMapOf("type" to "String", "default" to "star-fill"), "iconSize" to utsMapOf("type" to "String", "default" to ""), "activeIcon" to utsMapOf("type" to "String", "default" to ""), "halfIcon" to utsMapOf("type" to "String", "default" to "star-half-fill"), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "modelValue",
            "count",
            "readonly",
            "clearable",
            "allowHalf",
            "spacing",
            "inactiveColor",
            "activeColor",
            "icon",
            "iconSize",
            "activeIcon",
            "halfIcon",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
