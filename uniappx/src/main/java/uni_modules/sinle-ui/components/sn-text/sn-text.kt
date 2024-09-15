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
import io.dcloud.uniapp.extapi.showModal as uni_showModal;
import io.dcloud.uniapp.extapi.showToast as uni_showToast;
open class GenUniModulesSinleUiComponentsSnTextSnText : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var mode: String by `$props`;
    open var text: String by `$props`;
    open var color: String by `$props`;
    open var type: String by `$props`;
    open var font: String by `$props`;
    open var size: String by `$props`;
    open var align: String by `$props`;
    open var overflow: String by `$props`;
    open var decorationLine: String by `$props`;
    open var space: String by `$props`;
    open var decode: Boolean by `$props`;
    open var bold: Boolean by `$props`;
    open var encrypt: Boolean by `$props`;
    open var selectable: Boolean by `$props`;
    open var lines: Number by `$props`;
    open var lineHeight: String by `$props`;
    open var customStyle: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnTextSnText) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnTextSnText;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val snu = `$snui`.utils;
            fun emit(event: String, vararg do_not_transform_spread: Any?) {
                __ins.emit(event, *do_not_transform_spread);
            }
            val props = __props;
            val showCustomTextDecorationLine = computed(fun(): Boolean {
                return !snu.text.isEmpty(props.decorationLine);
            }
            );
            val textC = computed(fun(): String {
                var text = props.text;
                var date = Date();
                when (props.mode) {
                    "date" -> 
                        {
                            date = Date(parseInt(text));
                            return "" + date.getFullYear() + "-" + (date.getMonth() + 1).toString().padStart(2, "0") + "-" + date.getDate().toString().padStart(2, "0");
                        }
                    "date-cn" -> 
                        {
                            date = Date(parseInt(text));
                            return "" + date.getFullYear() + "\u5E74" + (date.getMonth() + 1).toString().padStart(2, "0") + "\u6708" + date.getDate().toString().padStart(2, "0") + "\u65E5";
                        }
                    "price" -> 
                        return "￥" + text;
                    "price-upper" -> 
                        return snu.text.numToUpper(text);
                    "name" -> 
                        if (props.encrypt) {
                            return snu.text.encryptName(text);
                        }
                    "bankcard" -> 
                        if (props.encrypt) {
                            return snu.text.encryptBankCard(text);
                        }
                    "idcard" -> 
                        if (props.encrypt) {
                            return snu.text.encryptIDCard(text);
                        }
                    "email" -> 
                        if (props.encrypt) {
                            return snu.text.encryptEmail(text);
                        }
                    "phone" -> 
                        if (props.encrypt) {
                            return snu.text.encryptPhone(text);
                        }
                }
                return text;
            }
            );
            val typeC = computed(fun(): String {
                var types = utsArrayOf(
                    "info",
                    "warning",
                    "error",
                    "success",
                    "primary"
                );
                return if (types.includes(props.type)) {
                    props.type;
                } else {
                    "info";
                }
                ;
            }
            );
            val colorC = computed(fun(): String {
                var color = props.color;
                if (snu.text.isEmpty(color)) {
                    if (typeC.value == "info") {
                        return colors.value["text"] as String;
                    }
                    return if (colors.value["" + typeC.value + "Dark"] != null) {
                        colors.value["" + typeC.value + "Dark"] as String;
                    } else {
                        color;
                    };
                } else {
                    return color;
                }
            }
            );
            val fontC = computed(fun(): String {
                return if (props.font == "") {
                    `$snui`.configs.font.mainFamily;
                } else {
                    props.font;
                }
                ;
            }
            );
            val sizeC = computed(fun(): String {
                return if (props.size == "") {
                    `$snui`.configs.font.size(2);
                } else {
                    props.size;
                }
                ;
            }
            );
            val textStylesC = computed(fun(): Map<String, Any> {
                var styles = Map<String, Any>();
                styles.set("color", colorC.value);
                styles.set("font-weight", if (props.bold) {
                    "bold";
                } else {
                    "";
                }
                );
                styles.set("font-size", sizeC.value);
                styles.set("font-family", fontC.value);
                styles.set("lines", props.lines);
                styles.set("text-decorationLine", if (showCustomTextDecorationLine.value) {
                    props.decorationLine;
                } else {
                    if (props.mode == "link") {
                        "underline";
                    } else {
                        props.decorationLine;
                    }
                    ;
                }
                );
                styles.set("line-height", props.lineHeight);
                styles.set("text-align", props.align);
                styles.set("text-overflow", props.overflow);
                styles.set("transition-duration", `$snui`.configs.aniTime.normal);
                return styles;
            }
            );
            fun genOnClickFn(e: UniPointerEvent) {
                if (!props.encrypt) {
                    emit("click", e);
                    var phoneNumbers = props.text.match(UTSRegExp("^\\d+\$", "gsim")) ?: utsArrayOf<String>();
                    when (props.mode) {
                        "phone" -> 
                            if (phoneNumbers.length == 0) {
                                uni_showToast(ShowToastOptions(title = "未匹配到电话号码", icon = "error"));
                            } else {
                                var phone = phoneNumbers[0] as String;
                                uni_showModal(ShowModalOptions(title = "提示", content = "拨打 " + phone, success = fun(res){
                                    if (res.confirm) {
                                        snu.platform.makePhoneCall(phone);
                                    }
                                }
                                ));
                            }
                        "phone-direct" -> 
                            if (phoneNumbers.length == 0) {
                                uni_showToast(ShowToastOptions(title = "未匹配到电话号码", icon = "error"));
                            } else {
                                snu.platform.makePhoneCall(phoneNumbers[0] as String);
                            }
                        "link" -> 
                            snu.platform.openLink(props.text);
                    }
                }
            }
            val onClick = ::genOnClickFn;
            return fun(): Any? {
                return createElementVNode("text", utsMapOf("class" to "sn-text", "selectable" to _ctx.selectable, "space" to _ctx.space, "decode" to _ctx.decode, "style" to normalizeStyle(utsArrayOf(
                    unref(textStylesC),
                    _ctx.customStyle
                )), "onClick" to onClick), toDisplayString(unref(textC)), 13, utsArrayOf(
                    "selectable",
                    "space",
                    "decode"
                ));
            }
            ;
        }
        ;
        var name = "sn-text";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-text" to padStyleMapOf(utsMapOf("transitionProperty" to "color,fontSize")), "@TRANSITION" to utsMapOf("sn-text" to utsMapOf("property" to "color,fontSize")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf("click" to null);
        var props = normalizePropsOptions(utsMapOf("mode" to utsMapOf("type" to "String", "default" to "text"), "text" to utsMapOf("type" to "String", "default" to ""), "color" to utsMapOf("type" to "String", "default" to ""), "type" to utsMapOf("type" to "String", "default" to "info"), "font" to utsMapOf("type" to "String", "default" to ""), "size" to utsMapOf("type" to "String", "default" to ""), "align" to utsMapOf("type" to "String", "default" to "left"), "overflow" to utsMapOf("type" to "String", "default" to "ellipsis"), "decorationLine" to utsMapOf("type" to "String", "default" to ""), "space" to utsMapOf("type" to "String", "default" to ""), "decode" to utsMapOf("type" to "Boolean", "default" to false), "bold" to utsMapOf("type" to "Boolean", "default" to false), "encrypt" to utsMapOf("type" to "Boolean", "default" to false), "selectable" to utsMapOf("type" to "Boolean", "default" to false), "lines" to utsMapOf("type" to "Number", "default" to 0), "lineHeight" to utsMapOf("type" to "String", "default" to "1.2"), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "mode",
            "text",
            "color",
            "type",
            "font",
            "size",
            "align",
            "overflow",
            "decorationLine",
            "space",
            "decode",
            "bold",
            "encrypt",
            "selectable",
            "lines",
            "lineHeight",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
