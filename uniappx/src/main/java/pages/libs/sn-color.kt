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
open class GenPagesLibsSnColor : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesLibsSnColor) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesLibsSnColor;
            val _cache = __ins.renderCache;
            val colors = `$snui`.colors;
            val colorLib = `$snui`.libs.color;
            val colorsArr = ref(UTSJSONObject());
            fun genTinyColorFn(color: Any): TinyColor {
                return colorLib.tinyColor(color);
            }
            val tinyColor = ::genTinyColorFn;
            onLoad(fun(_){
                var colorGroup = utsArrayOf(
                    "#4f78ff",
                    "#f6b142",
                    "#39c478",
                    "#fc5454"
                );
                var paletteTmp = utsArrayOf<UTSArray<String>>();
                run {
                    var j: Number = 0;
                    while(j < colorGroup.length){
                        paletteTmp.push(colorLib.generate(colorGroup[j], LGenerateOptions(backgroundColor = colors.value.page, theme = "light")));
                        j++;
                    }
                }
                colorsArr.value["palette"] = paletteTmp;
                var lightenTmp = utsArrayOf<String>();
                var darkenTmp = utsArrayOf<String>();
                var apcaTmp = utsArrayOf<UTSJSONObject>();
                run {
                    var i: Number = 1;
                    while(i <= 10){
                        lightenTmp.push(tinyColor(colorGroup[0]).lighten(i * 10).toHexString());
                        i++;
                    }
                }
                colorsArr.value["lighten"] = lightenTmp;
                run {
                    var i: Number = 1;
                    while(i <= 10){
                        darkenTmp.push(tinyColor(colorGroup[2]).darken(i * 10).toHexString());
                        i++;
                    }
                }
                colorsArr.value["darken"] = darkenTmp;
                colorsArr.value["mean"] = utsArrayOf(
                    colorGroup[1],
                    colorLib.mean(utsArrayOf(
                        tinyColor(colorGroup[1]),
                        tinyColor(colorGroup[3])
                    )).toHexString(),
                    colorGroup[3]
                );
                var complementColor = tinyColor(colorGroup[0]).complement().toHexString();
                colorsArr.value["complement"] = utsArrayOf(
                    object : UTSJSONObject() {
                        var v = colorGroup[0]
                        var k = Math.trunc(tinyColor(colorGroup[0]).toHsl().h)
                    },
                    object : UTSJSONObject() {
                        var v = complementColor
                        var k = Math.trunc(tinyColor(complementColor).toHsl().h)
                    }
                );
                run {
                    var i: Number = 0;
                    while(i < colorGroup.length){
                        var textColor = tinyColor(colorGroup[i]).darken(20);
                        var bgColor = tinyColor(colorGroup[Math.abs(colorGroup.length - 1 - i)]).lighten(50);
                        apcaTmp.push(object : UTSJSONObject() {
                            var textColor = textColor
                            var bgColor = bgColor
                            var apca = colorLib.calcAPCA(textColor, bgColor)
                        });
                        i++;
                    }
                }
                colorsArr.value["apca"] = apcaTmp;
            }
            );
            return fun(): Any? {
                val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
                val _component_sn_alert = resolveEasyComponent("sn-alert", GenUniModulesSinleUiComponentsSnAlertSnAlertClass);
                val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
                val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
                val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
                return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_topbar, utsMapOf("title" to "Color 颜色库")),
                        createVNode(_component_sn_alert, utsMapOf("type" to "primary", "text" to "SinleUI 颜色处理插件，基于 lime-color 插件", "icon" to "notification-fill")),
                        if ((unref(colorsArr) as UTSJSONObject)["palette"] != null) {
                            createVNode(_component_com_card, utsMapOf("key" to 0, "title" to "色板生成演示"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    createElementVNode(Fragment, null, RenderHelpers.renderList((unref(colorsArr)["palette"] as UTSArray<UTSArray<String>>), fun(row, rindex, _, _): VNode {
                                        return createElementVNode("view", utsMapOf("class" to "color-row", "key" to rindex), utsArrayOf(
                                            createElementVNode(Fragment, null, RenderHelpers.renderList(row, fun(e, iindex, _, _): VNode {
                                                return createElementVNode("view", utsMapOf("class" to "color", "key" to iindex, "style" to normalizeStyle(utsMapOf("background" to e))), null, 4);
                                            }), 128)
                                        ));
                                    }), 128)
                                );
                            }), "_" to 1));
                        } else {
                            createCommentVNode("v-if", true);
                        }
                        ,
                        createVNode(_component_com_card, utsMapOf("title" to "颜色操作演示"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "lighten 淡化")),
                                if (unref(colorsArr)["lighten"] != null) {
                                    createElementVNode("view", utsMapOf("key" to 0, "class" to "color-row"), utsArrayOf(
                                        createElementVNode(Fragment, null, RenderHelpers.renderList((unref(colorsArr)["lighten"] as UTSArray<String>), fun(e, i, _, _): VNode {
                                            return createElementVNode("view", utsMapOf("class" to "color", "key" to i, "style" to normalizeStyle(utsMapOf("background" to e))), null, 4);
                                        }), 128)
                                    ));
                                } else {
                                    createCommentVNode("v-if", true);
                                }
                                ,
                                createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "darken 深化")),
                                if (unref(colorsArr)["darken"] != null) {
                                    createElementVNode("view", utsMapOf("key" to 1, "class" to "color-row"), utsArrayOf(
                                        createElementVNode(Fragment, null, RenderHelpers.renderList((unref(colorsArr)["darken"] as UTSArray<String>), fun(e, i, _, _): VNode {
                                            return createElementVNode("view", utsMapOf("class" to "color", "key" to i, "style" to normalizeStyle(utsMapOf("background" to e))), null, 4);
                                        }), 128)
                                    ));
                                } else {
                                    createCommentVNode("v-if", true);
                                }
                                ,
                                createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "mean 平均颜色 - 中间项是两边的平均颜色")),
                                if (unref(colorsArr)["mean"] != null) {
                                    createElementVNode("view", utsMapOf("key" to 2, "class" to "color-row"), utsArrayOf(
                                        createElementVNode(Fragment, null, RenderHelpers.renderList((unref(colorsArr)["mean"] as UTSArray<String>), fun(e, i, _, _): VNode {
                                            return createElementVNode("view", utsMapOf("class" to "color", "key" to i, "style" to normalizeStyle(utsMapOf("background" to e))), utsArrayOf(
                                                createElementVNode("text", utsMapOf("class" to "color-text", "style" to normalizeStyle(utsMapOf("color" to tinyColor(e).contrasting().toHexString(), "fontSize" to "14px"))), toDisplayString(tinyColor(e).toRgb().r) + "," + toDisplayString(tinyColor(e).toRgb().g) + "," + toDisplayString(tinyColor(e).toRgb().b), 5)
                                            ), 4);
                                        }), 128)
                                    ));
                                } else {
                                    createCommentVNode("v-if", true);
                                }
                                ,
                                createVNode(_component_sn_text, utsMapOf("type" to "info", "text" to "互补色 - 色相旋转180°得到的颜色")),
                                if (unref(colorsArr)["complement"] != null) {
                                    createElementVNode("view", utsMapOf("key" to 3, "class" to "color-row"), utsArrayOf(
                                        createElementVNode(Fragment, null, RenderHelpers.renderList((unref(colorsArr)["complement"] as UTSArray<UTSJSONObject>), fun(e, i, _, _): VNode {
                                            return createElementVNode("view", utsMapOf("class" to "color", "key" to i, "style" to normalizeStyle(utsMapOf("background" to (e as UTSJSONObject)["v"]))), utsArrayOf(
                                                createElementVNode("text", utsMapOf("class" to "color-text", "style" to normalizeStyle(utsMapOf("color" to (unref(colorsArr)["complement"] as UTSArray<UTSJSONObject>)[Math.abs(i - 1)]["v"]))), "色相 " + toDisplayString(e["k"]), 5)
                                            ), 4);
                                        }), 128)
                                    ));
                                } else {
                                    createCommentVNode("v-if", true);
                                }
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_com_card, utsMapOf("title" to "APCA 对比度", "note" to "可访问的感知对比度算法（APCA），基于字形属性、文本与背景的感知亮度差异、环境与上下文等特征进行对比度计算，目标是更接近人眼的实际感受。\\nWCAG 3.0 无障碍标准候选方法之一。\\n由于 WCAG 2.0 对暗黑背景的支持较差，故选用了APCA 作为计算文字-背景颜色对比度的方法。\\n因该项目处于实验阶段，未来可能会进行一定调整。"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createElementVNode("view", utsMapOf("class" to "color-row"), utsArrayOf(
                                    createElementVNode(Fragment, null, RenderHelpers.renderList((unref(colorsArr)["apca"] as UTSArray<UTSJSONObject>), fun(row, rindex, _, _): VNode {
                                        return createElementVNode("view", utsMapOf("class" to "color", "key" to rindex, "style" to normalizeStyle(utsMapOf("background" to (row as UTSJSONObject)["bgColor"]))), utsArrayOf(
                                            createElementVNode("text", utsMapOf("class" to "color-text", "style" to normalizeStyle(utsMapOf("color" to row["textColor"]))), toDisplayString(row["apca"]), 5)
                                        ), 4);
                                    }
                                    ), 128)
                                ))
                            );
                        }
                        ), "_" to 1))
                    );
                }
                ), "_" to 1));
            }
            ;
        }
        ;
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ), utsArrayOf(
                    GenApp.styles
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("color-row" to padStyleMapOf(utsMapOf("width" to "100%", "flex" to 1, "flexDirection" to "row", "marginTop" to 2, "marginRight" to 2, "marginBottom" to 2, "marginLeft" to 2, "borderRadius" to 13)), "color" to utsMapOf(".color-row " to utsMapOf("flex" to 1, "height" to 60, "justifyContent" to "center")), "color-text" to utsMapOf(".color-row .color " to utsMapOf("fontSize" to 20, "textAlign" to "center", "fontWeight" to "bold")), "description" to padStyleMapOf(utsMapOf("fontSize" to 15, "color" to "#6e7073")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
