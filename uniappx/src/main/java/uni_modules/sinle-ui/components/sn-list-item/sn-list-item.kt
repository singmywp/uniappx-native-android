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
open class GenUniModulesSinleUiComponentsSnListItemSnListItem : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    open var ellipsis: Number by `$props`;
    open var disabled: Boolean by `$props`;
    open var title: String by `$props`;
    open var titleSize: String by `$props`;
    open var titleColor: String by `$props`;
    open var note: String by `$props`;
    open var noteSize: String by `$props`;
    open var noteColor: String by `$props`;
    open var rightText: String by `$props`;
    open var rightTextSize: String by `$props`;
    open var rightTextColor: String by `$props`;
    open var avatar: String by `$props`;
    open var avatarSize: String by `$props`;
    open var avatarBorderRadius: String by `$props`;
    open var icon: String by `$props`;
    open var iconSize: String by `$props`;
    open var iconColor: String by `$props`;
    open var showArrow: Boolean by `$props`;
    open var bgColor: String by `$props`;
    open var disabledBgColor: String by `$props`;
    open var disabledTextColor: String by `$props`;
    open var activeBgColor: String by `$props`;
    open var padding: String by `$props`;
    open var customTitleStyle: Any by `$props`;
    open var customNoteStyle: Any by `$props`;
    open var customRightTextStyle: Any by `$props`;
    open var customAvatarStyle: Any by `$props`;
    open var customIconStyle: Any by `$props`;
    open var customBodyStyle: Any by `$props`;
    open var customHeaderStyle: Any by `$props`;
    open var customFooterStyle: Any by `$props`;
    open var customStyle: Any by `$props`;
    open var setChildren: (childrenList: UTSArray<ComponentPublicInstance>) -> Unit
        get() {
            return unref(this.`$exposed`["setChildren"]) as (childrenList: UTSArray<ComponentPublicInstance>) -> Unit;
        }
        set(value) {
            setRefValue(this.`$exposed`, "setChildren", value);
        }
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesSinleUiComponentsSnListItemSnListItem, _arg1: SetupContext) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props, ref1): Any? {
            var __expose = ref1.expose;
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesSinleUiComponentsSnListItemSnListItem;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val snu = `$snui`.utils;
            fun emit(event: String, vararg do_not_transform_spread: Any?) {
                __ins.emit(event, *do_not_transform_spread);
            }
            val props = __props;
            val id = ref("");
            val listChildren = ref(utsArrayOf<ComponentPublicInstance>());
            val isHover = ref(false);
            val itemEle = ref(null as UniElement?);
            val showBorder = inject("showBorder", true) as Boolean;
            val titleColorC = computed(fun(): String {
                return if (props.titleColor == "") {
                    colors.value.title;
                } else {
                    props.titleColor;
                }
                ;
            }
            );
            val noteColorC = computed(fun(): String {
                return if (props.noteColor == "") {
                    colors.value.textLight;
                } else {
                    props.noteColor;
                }
                ;
            }
            );
            val rightTextColorC = computed(fun(): String {
                return if (props.rightTextColor == "") {
                    colors.value.textLight;
                } else {
                    props.rightTextColor;
                }
                ;
            }
            );
            val iconColorC = computed(fun(): String {
                return if (props.iconColor == "") {
                    colors.value.title;
                } else {
                    props.iconColor;
                }
                ;
            }
            );
            val disabledBgColorC = computed(fun(): String {
                return if (props.disabledBgColor == "") {
                    colors.value.disabled;
                } else {
                    props.disabledBgColor;
                }
                ;
            }
            );
            val disabledTextColorC = computed(fun(): String {
                return if (props.disabledTextColor == "") {
                    colors.value.disabledText;
                } else {
                    props.disabledTextColor;
                }
                ;
            }
            );
            val activeBgColorC = computed(fun(): String {
                return if (props.activeBgColor == "") {
                    colors.value.info;
                } else {
                    props.activeBgColor;
                }
                ;
            }
            );
            val bgColorC = computed(fun(): String {
                var bgColor = if (props.bgColor == "") {
                    colors.value["transparent"] as String;
                } else {
                    props.bgColor;
                }
                ;
                return if (props.disabled) {
                    disabledBgColorC.value;
                } else {
                    if (isHover.value) {
                        activeBgColorC.value;
                    } else {
                        bgColor;
                    }
                    ;
                }
                ;
            }
            );
            val showAvatar = computed(fun(): Boolean {
                return !snu.text.isEmpty(props.avatar);
            }
            );
            val showIcon = computed(fun(): Boolean {
                return !showAvatar.value && !snu.text.isEmpty(props.icon);
            }
            );
            val titleSizeC = computed(fun(): String {
                return if (props.titleSize == "") {
                    `$snui`.configs.font.size(2);
                } else {
                    props.titleSize;
                }
                ;
            }
            );
            val noteSizeC = computed(fun(): String {
                return if (props.noteSize == "") {
                    `$snui`.configs.font.size(1);
                } else {
                    props.noteSize;
                }
                ;
            }
            );
            val rightTextSizeC = computed(fun(): String {
                return if (props.rightTextSize == "") {
                    `$snui`.configs.font.size(1);
                } else {
                    props.rightTextSize;
                }
                ;
            }
            );
            val avatarBorderRadiusC = computed(fun(): String {
                return if (props.avatarBorderRadius == "") {
                    `$snui`.configs.radius.xsmall;
                } else {
                    props.avatarBorderRadius;
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
            fun genOnClickFn(e: UniPointerEvent) {
                if (props.disabled == false) {
                    var index: Number = 0;
                    run {
                        var i: Number = 0;
                        while(i < listChildren.value.length){
                            var el = (listChildren.value[i] as ComponentPublicInstance).`$el` as UniElement;
                            if (el.dataset.get("sn-id") == id.value) {
                                index = i;
                            }
                            i++;
                        }
                    }
                    emit("click", object : UTSJSONObject() {
                        var id = index
                        var event = e
                    });
                }
            }
            val onClick = ::genOnClickFn;
            fun genDrawLinesFn() {
                if (showBorder) {
                    nextTick(fun(){
                        var brothers = utsArrayOf<UniElement>();
                        var cnt: Number = 0;
                        run {
                            var i: Number = 0;
                            while(i < listChildren.value.length){
                                var el = listChildren.value[i].`$el` as UniElement;
                                if (el.dataset.get("sn-type") == "sn-list-item") {
                                    brothers.push(el);
                                    if (el.dataset.get("sn-id") == id.value) {
                                        cnt = i;
                                    }
                                }
                                i++;
                            }
                        }
                        if (cnt != brothers.length - 1) {
                            var item = itemEle.value;
                            var rectInfo = item!!.getBoundingClientRect()!!;
                            var ctx = item!!.getDrawableContext()!!;
                            ctx.reset();
                            ctx.lineCap = "round";
                            ctx.lineWidth = 1;
                            ctx.strokeStyle = colors.value.line;
                            var pieceWidth = rectInfo.width / 10;
                            ctx.moveTo(pieceWidth * 1, rectInfo.height);
                            ctx.lineTo(pieceWidth * 9, rectInfo.height);
                            ctx.stroke();
                            ctx.update();
                        }
                    }
                    );
                }
            }
            val drawLines = ::genDrawLinesFn;
            fun genSetChildrenFn(childrenList: UTSArray<ComponentPublicInstance>) {
                listChildren.value = childrenList;
                drawLines();
            }
            val setChildren = ::genSetChildrenFn;
            __expose(utsMapOf("setChildren" to setChildren));
            id.value = randomId();
            return fun(): Any? {
                val _component_sn_avatar = resolveEasyComponent("sn-avatar", GenUniModulesSinleUiComponentsSnAvatarSnAvatarClass);
                val _component_sn_icon = resolveEasyComponent("sn-icon", GenUniModulesSinleUiComponentsSnIconSnIconClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                return createElementVNode("list-item", utsMapOf("class" to "sn-list-item", "ref_key" to "itemEle", "ref" to itemEle, "data-sn-type" to "sn-list-item", "data-sn-id" to unref(id), "onClick" to onClick, "onTouchstart" to fun(){
                    isHover.value = true;
                }
                , "onTouchend" to fun(){
                    isHover.value = false;
                }
                , "onTouchcancel" to fun(){
                    isHover.value = false;
                }
                , "style" to normalizeStyle(utsArrayOf(
                    utsMapOf("padding" to _ctx.padding, "background" to unref(bgColorC), "transitionDuration" to unref(`$snui`).configs.aniTime.normal),
                    _ctx.customStyle
                ))), utsArrayOf(
                    if (isTrue(unref(showAvatar) || unref(showIcon) || _ctx.`$slots`["header"] != null)) {
                        createElementVNode("view", utsMapOf("key" to 0, "class" to "sn-list-item-header", "style" to normalizeStyle(utsArrayOf(
                            utsMapOf("marginRight" to if (unref(showAvatar) || unref(showIcon)) {
                                "5px";
                            } else {
                                "";
                            }),
                            _ctx.customHeaderStyle
                        ))), utsArrayOf(
                            renderSlot(_ctx.`$slots`, "header", UTSJSONObject(), fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    if (isTrue(_ctx.disabled && unref(showAvatar))) {
                                        createElementVNode("view", utsMapOf("key" to 0, "class" to "sn-list-item-avatar-overlay", "style" to normalizeStyle(utsMapOf("width" to _ctx.avatarSize, "height" to _ctx.avatarSize, "borderRadius" to unref(avatarBorderRadiusC), "background" to unref(disabledBgColorC)))), null, 4);
                                    } else {
                                        createCommentVNode("v-if", true);
                                    },
                                    if (isTrue(unref(showAvatar))) {
                                        createVNode(_component_sn_avatar, utsMapOf("key" to 1, "size" to _ctx.avatarSize, "src" to _ctx.avatar, "borderRadius" to unref(avatarBorderRadiusC), "customStyle" to _ctx.customAvatarStyle), null, 8, utsArrayOf(
                                            "size",
                                            "src",
                                            "borderRadius",
                                            "customStyle"
                                        ));
                                    } else {
                                        createCommentVNode("v-if", true);
                                    },
                                    if (isTrue(unref(showIcon))) {
                                        createVNode(_component_sn_icon, utsMapOf("key" to 2, "name" to _ctx.icon, "size" to unref(iconSizeC), "color" to if (_ctx.disabled) {
                                            unref(disabledTextColorC);
                                        } else {
                                            unref(iconColorC);
                                        }, "customStyle" to _ctx.customIconStyle), null, 8, utsArrayOf(
                                            "name",
                                            "size",
                                            "color",
                                            "customStyle"
                                        ));
                                    } else {
                                        createCommentVNode("v-if", true);
                                    }
                                );
                            })
                        ), 4);
                    } else {
                        createCommentVNode("v-if", true);
                    }
                    ,
                    createElementVNode("view", utsMapOf("class" to "sn-list-item-body", "style" to normalizeStyle(utsArrayOf(
                        _ctx.customBodyStyle
                    ))), utsArrayOf(
                        renderSlot(_ctx.`$slots`, "default", UTSJSONObject(), fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("class" to "sn-list-item-title", "text" to _ctx.title, "size" to unref(titleSizeC), "color" to if (_ctx.disabled) {
                                    unref(disabledTextColorC);
                                } else {
                                    unref(titleColorC);
                                }
                                , "custom-style" to _ctx.customTitleStyle, "style" to normalizeStyle(utsMapOf("lines" to if (_ctx.ellipsis == 0) {
                                    -1;
                                } else {
                                    _ctx.ellipsis;
                                }
                                , "textOverflow" to "ellipsis"))), null, 8, utsArrayOf(
                                    "text",
                                    "size",
                                    "color",
                                    "custom-style",
                                    "style"
                                )),
                                createVNode(_component_sn_text, utsMapOf("class" to "sn-list-item-note", "text" to _ctx.note, "size" to unref(noteSizeC), "color" to if (_ctx.disabled) {
                                    unref(disabledTextColorC);
                                } else {
                                    unref(noteColorC);
                                }
                                , "custom-style" to _ctx.customNoteStyle, "style" to normalizeStyle(utsMapOf("lines" to if (_ctx.ellipsis == 0) {
                                    -1;
                                } else {
                                    _ctx.ellipsis;
                                }
                                , "textOverflow" to "ellipsis"))), null, 8, utsArrayOf(
                                    "text",
                                    "size",
                                    "color",
                                    "custom-style",
                                    "style"
                                ))
                            );
                        }
                        )
                    ), 4),
                    createElementVNode("view", utsMapOf("class" to "sn-list-item-footer", "style" to normalizeStyle(utsArrayOf(
                        _ctx.customFooterStyle
                    ))), utsArrayOf(
                        renderSlot(_ctx.`$slots`, "footer", UTSJSONObject(), fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("class" to "sn-list-item-right-text", "text" to _ctx.rightText, "size" to unref(rightTextSizeC), "color" to if (_ctx.disabled) {
                                    unref(disabledTextColorC);
                                } else {
                                    unref(rightTextColorC);
                                }
                                , "custom-style" to _ctx.customRightTextStyle, "style" to normalizeStyle(utsMapOf("lines" to 1, "textOverflow" to "ellipsis"))), null, 8, utsArrayOf(
                                    "text",
                                    "size",
                                    "color",
                                    "custom-style",
                                    "style"
                                )),
                                if (isTrue(_ctx.showArrow)) {
                                    createVNode(_component_sn_icon, utsMapOf("key" to 0, "name" to "arrow-right-s-line", "size" to ("" + unref(snu).getPx(unref(rightTextSizeC)) * 1.5 + "px"), "color" to if (_ctx.disabled) {
                                        unref(disabledTextColorC);
                                    } else {
                                        unref(rightTextColorC);
                                    }, "customStyle" to _ctx.customRightTextStyle), null, 8, utsArrayOf(
                                        "size",
                                        "color",
                                        "customStyle"
                                    ));
                                } else {
                                    createCommentVNode("v-if", true);
                                }
                            );
                        }
                        )
                    ), 4)
                ), 44, utsArrayOf(
                    "data-sn-id",
                    "onTouchstart",
                    "onTouchend",
                    "onTouchcancel"
                ));
            }
            ;
        }
        ;
        var name = "sn-list-item";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("sn-list-item" to padStyleMapOf(utsMapOf("width" to "100%", "display" to "flex", "flexDirection" to "row", "alignItems" to "center")), "sn-list-item-avatar-overlay" to padStyleMapOf(utsMapOf("transitionProperty" to "backgroundColor", "position" to "absolute", "zIndex" to 1, "opacity" to 0.8)), "sn-list-item-body" to padStyleMapOf(utsMapOf("flex" to 1, "flexDirection" to "column")), "sn-list-item-footer" to padStyleMapOf(utsMapOf("flexDirection" to "row", "justifyContent" to "center", "alignItems" to "center")), "@TRANSITION" to utsMapOf("sn-list-item-avatar-overlay" to utsMapOf("property" to "backgroundColor")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf("click" to null);
        var props = normalizePropsOptions(utsMapOf("ellipsis" to utsMapOf("type" to "Number", "default" to 0), "disabled" to utsMapOf("type" to "Boolean", "default" to false), "title" to utsMapOf("type" to "String", "default" to ""), "titleSize" to utsMapOf("type" to "String", "default" to ""), "titleColor" to utsMapOf("type" to "String", "default" to ""), "note" to utsMapOf("type" to "String", "default" to ""), "noteSize" to utsMapOf("type" to "String", "default" to ""), "noteColor" to utsMapOf("type" to "String", "default" to ""), "rightText" to utsMapOf("type" to "String", "default" to ""), "rightTextSize" to utsMapOf("type" to "String", "default" to ""), "rightTextColor" to utsMapOf("type" to "String", "default" to ""), "avatar" to utsMapOf("type" to "String", "default" to ""), "avatarSize" to utsMapOf("type" to "String", "default" to "30px"), "avatarBorderRadius" to utsMapOf("type" to "String", "default" to ""), "icon" to utsMapOf("type" to "String", "default" to ""), "iconSize" to utsMapOf("type" to "String", "default" to ""), "iconColor" to utsMapOf("type" to "String", "default" to ""), "showArrow" to utsMapOf("type" to "Boolean", "default" to false), "bgColor" to utsMapOf("type" to "String", "default" to ""), "disabledBgColor" to utsMapOf("type" to "String", "default" to ""), "disabledTextColor" to utsMapOf("type" to "String", "default" to ""), "activeBgColor" to utsMapOf("type" to "String", "default" to ""), "padding" to utsMapOf("type" to "String", "default" to "10px 15px"), "customTitleStyle" to utsMapOf("default" to UTSJSONObject()), "customNoteStyle" to utsMapOf("default" to UTSJSONObject()), "customRightTextStyle" to utsMapOf("default" to UTSJSONObject()), "customAvatarStyle" to utsMapOf("default" to UTSJSONObject()), "customIconStyle" to utsMapOf("default" to UTSJSONObject()), "customBodyStyle" to utsMapOf("default" to UTSJSONObject()), "customHeaderStyle" to utsMapOf("default" to UTSJSONObject()), "customFooterStyle" to utsMapOf("default" to UTSJSONObject()), "customStyle" to utsMapOf("default" to UTSJSONObject())));
        var propsNeedCastKeys = utsArrayOf(
            "ellipsis",
            "disabled",
            "title",
            "titleSize",
            "titleColor",
            "note",
            "noteSize",
            "noteColor",
            "rightText",
            "rightTextSize",
            "rightTextColor",
            "avatar",
            "avatarSize",
            "avatarBorderRadius",
            "icon",
            "iconSize",
            "iconColor",
            "showArrow",
            "bgColor",
            "disabledBgColor",
            "disabledTextColor",
            "activeBgColor",
            "padding",
            "customTitleStyle",
            "customNoteStyle",
            "customRightTextStyle",
            "customAvatarStyle",
            "customIconStyle",
            "customBodyStyle",
            "customHeaderStyle",
            "customFooterStyle",
            "customStyle"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}