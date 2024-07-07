@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME")
package uts.sdk.modules.snESvg;
import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.SVGImageView;
import io.dcloud.uniapp.*;
import io.dcloud.uniapp.UniSDKEngine;
import io.dcloud.uniapp.appframe.PageProxy;
import io.dcloud.uniapp.dom.node.DomNode;
import io.dcloud.uniapp.dom.node.PageNode;
import io.dcloud.uniapp.extapi.*;
import io.dcloud.uniapp.framework.*;
import io.dcloud.uniapp.interfaces.INodeData;
import io.dcloud.uniapp.runtime.*;
import io.dcloud.uniapp.ui.component.IComponentData;
import io.dcloud.uniapp.vue.*;
import io.dcloud.uniapp.vue.shared.*;
import io.dcloud.uts.*;
import io.dcloud.uts.Map;
import io.dcloud.uts.Set;
import io.dcloud.uts.UTSAndroid;
import io.dcloud.uts.component.UTSComponent;
import java.io.File;
import java.io.FileInputStream;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.async;
fun getPath(path: String): String {
    if (path.startsWith("file://")) {
        return path.substring(7);
    }
    return if (path.startsWith("/storage")) {
        path;
    } else {
        UTSAndroid.getResourcePath(path);
    }
    ;
}
open class SnESvgComponent : UTSComponent<SVGImageView> {
    constructor(proxy: PageProxy, componentData: IComponentData) : super(proxy, componentData) ;
    open var src: String = "";
    override fun NVLoad(): SVGImageView {
        return SVGImageView(this.`$androidContext`);
    }
    open fun resetSource(newPath: String) {
        if (newPath.startsWith("<")) {
            this.`$el`?.setSVG(SVG.getFromString(newPath));
        } else {
            var path = getPath(newPath);
            if (File(path).exists()) {
                this.`$el`?.setSVG(SVG.getFromInputStream(FileInputStream(path)));
            } else {
                console.error("sn-e-svg: Svg path [" + path + "] donnot exist", " at uni_modules/sn-e-svg/utssdk/app-android/index.vue:35");
            }
        }
    }
    override fun `$init`() {
        this.`$watch`<String>("src", fun(path){
            this.resetSource(path);
        }
        );
    }
    companion object {
        var name = "sn-e-svg";
        init {
            io.dcloud.uniapp.UniSDKEngine.registerUniComponent("sn-e-svg", SnESvgComponent::class.java, SnESvgElement::class.java);
        }
    }
}
open class SnESvgElement : DomNode {
    constructor(data: INodeData, pageNode: PageNode) : super(data, pageNode) ;
    open fun resetSource(newPath: String) {
        return (getComponent() as SnESvgComponent).resetSource(newPath);
    }
}
