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
package org.apache.sling.scripting.sightly.apps.capstone.components.trending__002d__articles;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class trending__002d__articles__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_trendingarticle = null;
Collection var_collectionvar0_list_coerced$ = null;
_global_trendingarticle = renderContext.call("use", com.gofortrainings.capstone.core.models.TrendingArticleModel.class.getName(), obj());
out.write("\n<div class=\"container-fluid pb-4 pt-5\">\n    <div class=\"container animate-box fadeInUp animated-fast\">\n        <div>\n            <div class=\"fh5co_heading fh5co_heading_border_bottom py-2 mb-4\">Trending</div>\n        </div>\n        ");
{
    Object var_collectionvar0 = renderContext.getObjectModel().resolveProperty(_global_trendingarticle, "trendingArticles");
    {
        long var_size1 = ((var_collectionvar0_list_coerced$ == null ? (var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0)) : var_collectionvar0_list_coerced$).size());
        {
            boolean var_notempty2 = (var_size1 > 0);
            if (var_notempty2) {
                {
                    long var_end5 = var_size1;
                    {
                        boolean var_validstartstepend6 = (((0 < var_size1) && true) && (var_end5 > 0));
                        if (var_validstartstepend6) {
                            out.write("<div class=\"owl-carousel owl-theme owl-loaded owl-drag\" id=\"slider2\">");
                            if (var_collectionvar0_list_coerced$ == null) {
                                var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0);
                            }
                            long var_index7 = 0;
                            for (Object articles : var_collectionvar0_list_coerced$) {
                                {
                                    boolean var_traversal9 = (((var_index7 >= 0) && (var_index7 <= var_end5)) && true);
                                    if (var_traversal9) {
                                        out.write("\n            <div class=\"item px-2\">\n                <div class=\"fh5co_hover_news_img\">\n                    <div class=\"fh5co_news_img\">\n                        <img");
                                        {
                                            Object var_attrvalue10 = renderContext.getObjectModel().resolveProperty(articles, "bannerImage");
                                            {
                                                Object var_attrcontent11 = renderContext.call("xss", var_attrvalue10, "uri");
                                                {
                                                    boolean var_shoulddisplayattr13 = (((null != var_attrcontent11) && (!"".equals(var_attrcontent11))) && ((!"".equals(var_attrvalue10)) && (!((Object)false).equals(var_attrvalue10))));
                                                    if (var_shoulddisplayattr13) {
                                                        out.write(" src");
                                                        {
                                                            boolean var_istrueattr12 = (var_attrvalue10.equals(true));
                                                            if (!var_istrueattr12) {
                                                                out.write("=\"");
                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent11));
                                                                out.write("\"");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        out.write(" alt=\"\"/>\n                    </div>\n                    <div>\n                        <a href=\"#\" class=\"d-block fh5co_small_post_heading\">\n                            <span class=\"\">");
                                        {
                                            Object var_14 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(articles, "bannerText"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_14));
                                        }
                                        out.write("</span>\n                        </a>\n                        <div class=\"c_g\"><i class=\"fa fa-clock-o\"></i>");
                                        {
                                            String var_15 = (" " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(articles, "pageCreatedDate"), "text")));
                                            out.write(renderContext.getObjectModel().toString(var_15));
                                        }
                                        out.write("</div>\n                    </div>\n                </div>\n            </div>\n        ");
                                    }
                                }
                                var_index7++;
                            }
                            out.write("</div>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar0_list_coerced$ = null;
}
out.write("\n    </div>\n</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

