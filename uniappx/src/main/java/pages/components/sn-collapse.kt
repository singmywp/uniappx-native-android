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
open class GenPagesComponentsSnCollapse : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _cache = this.`$`.renderCache;
        val _component_sn_topbar = resolveEasyComponent("sn-topbar", GenUniModulesSinleUiComponentsSnTopbarSnTopbarClass);
        val _component_sn_alert = resolveEasyComponent("sn-alert", GenUniModulesSinleUiComponentsSnAlertSnAlertClass);
        val _component_com_card = resolveEasyComponent("com-card", GenComponentsComCardComCardClass);
        val _component_sn_text = resolveEasyComponent("sn-text", GenUniModulesSinleUiComponentsSnTextSnTextClass);
        val _component_sn_collapse_item = resolveEasyComponent("sn-collapse-item", GenUniModulesSinleUiComponentsSnCollapseItemSnCollapseItemClass);
        val _component_sn_collapse_group = resolveEasyComponent("sn-collapse-group", GenUniModulesSinleUiComponentsSnCollapseGroupSnCollapseGroupClass);
        val _component_sn_page = resolveEasyComponent("sn-page", GenUniModulesSinleUiComponentsSnPageSnPageClass);
        return createVNode(_component_sn_page, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
            return utsArrayOf(
                createVNode(_component_sn_topbar, utsMapOf("title" to "Collapse 折叠面板")),
                createVNode(_component_sn_alert, utsMapOf("type" to "warning", "icon" to "error-warning-fill", "text" to "sn-collapse-item 必须为 sn-collapse-group 的直接子节点。")),
                createVNode(_component_com_card, utsMapOf("title" to "基础使用", "note" to "通过折叠面板收纳内容区域。")),
                createVNode(_component_sn_collapse_group, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_collapse_item, utsMapOf("title" to "地形多种多样"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("text" to "\u3000\u3000在中国辽阔的大地上，有雄伟的高原、起伏的山岭、广阔的平原、低缓的丘陵，还有四周群山环抱、中间低平的大小盆地。陆地上的5种基本地形类型，中国均有分布，这为中国工农业的发展提供了多种多样的条件。"))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_sn_collapse_item, utsMapOf("title" to "山区面积广大"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("text" to "\u3000\u3000通常人们把山地、丘陵和比较崎岖的高原称为山区。中国山区面积占全国总面积的2/3，这是中国地形的又一显著特征。山区面积广大，给交通运输和农业发展带来一定困难，但山区可提供林产、矿产、水能和旅游资源，为改变山区面貌、发展山区经济提供了资源保证。"))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_sn_collapse_item, utsMapOf("title" to "地势西高东低"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("text" to "\u3000\u3000呈阶梯状分布地势是地表高低起伏的总趋势。中国地势西高东低，大致呈阶梯状分布。"))
                            );
                        }
                        ), "_" to 1))
                    );
                }
                ), "_" to 1)),
                createVNode(_component_com_card, utsMapOf("title" to "手风琴模式", "note" to "只允许打开一个子项。")),
                createVNode(_component_sn_collapse_group, utsMapOf("accordion" to ""), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_collapse_item, utsMapOf("title" to "量子计算机核心部件在安徽实现突破"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("text" to "\u3000\u3000记者从安徽省量子计算工程研究中心获悉：中国第三代自主超导量子计算机“本源悟空”核心部件——高密度微波互连模组在皖完成重大突破，并实现国产化。\n\n\u3000\u3000据介绍，量子芯片可以被比作“量子计算大脑”，需要在极低温环境中运行，高密度微波互连模组则如同“神经网络”，该模组中有一根至关重要的“线”——极低温特种高频同轴线缆。有了这根线，高密度微波互连模组既能准确传输信号，又能隔绝热量，为“量子计算大脑”与外部设备之间的量子信息传输建立起高速、稳定的通道。\n\n\u3000\u3000为了解决这根“线”的关键技术难题，本源量子计算科技（合肥）股份有限公司联合中国电子科技集团第40研究所申报安徽省揭榜挂帅项目，日前顺利完成适用于极低温环境的高密度微波互连模组技术攻关。这款国产高密度微波互连模组可为超100位量子芯片提供微波信号传输通道，能够在极低热泄漏环境下实现微波信号的跨温区稳定传输。"))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_sn_collapse_item, utsMapOf("title" to "构建高水平社会主义市场经济体制"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("text" to "\u3000\u3000市场经济是人类文明发展的共同成果。作为市场经济的原始形态，商品生产和商品交换在各国早已有之。资本主义产生后，简单商品经济逐步发展成为近代市场经济，极大促进了生产力发展。历史和现实表明，市场经济是资源配置最有效率的体制，也是发展生产力最有效的手段。\n\n\u3000\u3000社会主义和市场经济不是对立的。改革开放以来，我国实现了从高度集中的计划经济体制到充满活力的社会主义市场经济体制的历史性转变。"))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_sn_collapse_item, utsMapOf("title" to "壮大数字经济 拓展就业空间"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("text" to "\u3000\u3000在深圳市职业技能培训指导中心，围绕深圳市“20+8”战略性产业集群而组织开展的新职业、新工种、新技术示范性培训班已有400余个。该中心培训部部长俞益飞介绍，为更好地满足产业所需，培训课程开发由行业协会、龙头企业主导，实时更新。\n\n\u3000\u3000广东先行先试推动数字经济领域“一试两证”，并逐步建立职业技能等级与企业数字技能认证证书互认机制。企业组织一次考试，就可以同时核发人社部门认可的技能等级证书和企业认证证书，让职业技能标准评价体系更加适应产业发展需求。"))
                            );
                        }
                        ), "_" to 1))
                    );
                }
                ), "_" to 1)),
                createVNode(_component_com_card, utsMapOf("title" to "动画时长", "note" to "可以自定义动画时长，比如当你对性能有要求时，可以设置其为 0。")),
                createVNode(_component_sn_collapse_group, utsMapOf("aniDur" to 0), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_collapse_item, utsMapOf("title" to "中国"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("text" to "\u3000\u3000中华人民共和国（the People's Republic of China），简称“中国”，成立于1949年10月1日，位于亚洲东部，太平洋西岸，是工人阶级领导的、以工农联盟为基础的人民民主专政的社会主义国家，以五星红旗为国旗、《义勇军进行曲》为国歌，国徽中间是五星照耀下的天安门，周围是谷穗和齿轮，通用语言文字是普通话和规范汉字，首都北京，是一个以汉族为主体、56个民族共同组成的统一的多民族国家。"))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_sn_collapse_item, utsMapOf("title" to "美国"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("text" to "\u3000\u3000美利坚合众国（The United States of America），简称美国，首都华盛顿。位于北美洲中部，北与加拿大接壤，南靠墨西哥湾，西临太平洋，东濒大西洋。大部分地区属大陆性气候，南部属亚热带气候，地形总体西高东低，自然资源丰富，矿产资源总探明储量居世界首位。总面积937万平方千米，海岸线长22680千米，美国共分为50个州和1个特区（哥伦比亚特区），有3143个县。截至2023年2月，美国总人口约3.33亿，非拉美裔白人占57.8%，居民大多信奉基督教及天主教，通用英语。"))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_sn_collapse_item, utsMapOf("title" to "俄罗斯"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("text" to "\u3000\u3000俄罗斯联邦（俄语：Российская Федерация），由85个平等的联邦主体组成。亦称俄罗斯，首都莫斯科。国土横跨欧亚大陆，总面积1709.82万平方千米，与14个国家接壤。国界线长60933千米，其中海岸线长达38807千米、陆界长达14509千米。截至2023年4月，俄罗斯总人口约为1.46亿人。共有194个民族，以俄罗斯族为主。大多信奉东正教，官方语言为俄语。"))
                            );
                        }
                        ), "_" to 1))
                    );
                }
                ), "_" to 1)),
                createVNode(_component_com_card, utsMapOf("title" to "下划线 & 禁用", "note" to "允许自由控制各项的下划线及禁用状态。")),
                createVNode(_component_sn_collapse_group, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_sn_collapse_item, utsMapOf("title" to "字节跳动", "border" to false), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("text" to "\u3000\u3000北京抖音信息服务有限公司，成立于2012年3月9日，2021年全年的营业收入约为580亿美元，地址位于北京市海淀区北三环西路甲23号院1号楼2层222。公司以建设“全球创作与交流平台”为愿景。字节跳动的全球化布局始于2015年，“技术出海”是字节跳动全球化发展的核心战略，其旗下产品有今日头条、西瓜视频、抖音、头条百科、皮皮虾、懂车帝、悟空问答等。"))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_sn_collapse_item, utsMapOf("title" to "百度"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("text" to "\u3000\u3000百度（Baidu）是拥有强大互联网基础的领先AI公司。百度愿景是：成为最懂用户，并能帮助人们成长的全球顶级高科技公司。"))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_sn_collapse_item, utsMapOf("title" to "阿里巴巴", "disabled" to ""), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("text" to "\u3000\u3000阿里巴巴集团控股有限公司（简称：阿里巴巴集团），2024财年收入9411.68亿元，同比增长8%。是以曾担任英语教师的马云为首的18人于1999年在浙江省杭州市创立的公司。"))
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_sn_collapse_item, utsMapOf("title" to "腾讯"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createVNode(_component_sn_text, utsMapOf("text" to "\u3000\u3000腾讯，全称深圳市腾讯计算机系统有限公司，1998年11月由马化腾、张志东、许晨晔、陈一丹、曾李青五位创始人共同创立，2023年总收入6090.15亿元。"))
                            );
                        }
                        ), "_" to 1))
                    );
                }
                ), "_" to 1))
            );
        }
        ), "_" to 1));
    }
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(), utsArrayOf(
                    GenApp.styles
                ));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
