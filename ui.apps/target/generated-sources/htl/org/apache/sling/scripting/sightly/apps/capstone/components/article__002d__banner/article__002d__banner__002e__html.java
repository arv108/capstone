/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.capstone.components.article__002d__banner;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class article__002d__banner__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_articlebanner = null;
Object _dynamic_pageproperties = bindings.get("pageproperties");
_global_articlebanner = renderContext.call("use", com.gofortrainings.capstone.core.models.ArticleBannerModel.class.getName(), obj());
out.write("\n\n<div id=\"fh5co-title-box\"");
{
    String var_attrcontent0 = (("background-image: url(" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_articlebanner, "bannerImage"), "unsafe"))) + ");");
    out.write(" style=\"");
    out.write(renderContext.getObjectModel().toString(var_attrcontent0));
    out.write("\"");
}
out.write(" background-position: -25px -164.919px;data-stellar-background-ratio=\"0.5\">\n    <div class=\"overlay\"></div>\n    <div class=\"page-title\">\n        <img");
{
    Object var_attrvalue1 = renderContext.getObjectModel().resolveProperty(_global_articlebanner, "bannerImage");
    {
        Object var_attrcontent2 = renderContext.call("xss", var_attrvalue1, "uri");
        {
            boolean var_shoulddisplayattr4 = (((null != var_attrcontent2) && (!"".equals(var_attrcontent2))) && ((!"".equals(var_attrvalue1)) && (!((Object)false).equals(var_attrvalue1))));
            if (var_shoulddisplayattr4) {
                out.write(" src");
                {
                    boolean var_istrueattr3 = (var_attrvalue1.equals(true));
                    if (!var_istrueattr3) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent2));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" alt=\"Free HTML5 by FreeHTMl5.co\"/>\n        <span>");
{
    Object var_5 = renderContext.call("xss", renderContext.call("format", "MMMM dd, yyyy", obj().with("format", renderContext.getObjectModel().resolveProperty(_dynamic_pageproperties, "jcr:created"))), "text");
    out.write(renderContext.getObjectModel().toString(var_5));
}
out.write("</span>\n        <h2>");
{
    Object var_6 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_articlebanner, "bannerText"), "text");
    out.write(renderContext.getObjectModel().toString(var_6));
}
out.write("</h2>\n    </div>\n</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

