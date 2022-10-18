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
package org.apache.sling.scripting.sightly.apps.capstone.components.trending__002d__videos;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class trending__002d__videos__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_videoplaylistmodel = null;
Collection var_collectionvar0_list_coerced$ = null;
_global_videoplaylistmodel = renderContext.call("use", com.gofortrainings.capstone.core.models.VideoPlayListModel.class.getName(), obj());
out.write("\n<div class=\"container-fluid fh5co_video_news_bg pb-4\">\n    <div class=\"container animate-box\" data-animate-effect=\"fadeIn\">\n        <div>\n            <div class=\"fh5co_heading fh5co_heading_border_bottom pt-5 pb-2 mb-4\">Video News</div>\n        </div>\n        <div>\n            ");
{
    Object var_collectionvar0 = renderContext.getObjectModel().resolveProperty(_global_videoplaylistmodel, "videoList");
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
                            out.write("<div class=\"owl-carousel owl-theme\" id=\"slider3\">");
                            if (var_collectionvar0_list_coerced$ == null) {
                                var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0);
                            }
                            long var_index7 = 0;
                            for (Object video : var_collectionvar0_list_coerced$) {
                                {
                                    boolean var_traversal9 = (((var_index7 >= 0) && (var_index7 <= var_end5)) && true);
                                    if (var_traversal9) {
                                        out.write("\n                <div class=\"item px-2\">\n                    <div class=\"fh5co_hover_news_img\">\n                        <div class=\"fh5co_hover_news_img_video_tag_position_relative\">\n                            <div class=\"fh5co_news_img\">");
                                        {
                                            String var_10 = (("\n                                " + renderContext.getObjectModel().toString(renderContext.call("xss", video, "html"))) + "\n                            ");
                                            out.write(renderContext.getObjectModel().toString(var_10));
                                        }
                                        out.write("</div>\n                            <div class=\"fh5co_hover_news_img_video_tag_position_absolute fh5co_hide\">\n                                <img src=\"images/ariel-lustre-208615.jpg\" alt=\"\"/>\n                            </div>\n                            <div class=\"fh5co_hover_news_img_video_tag_position_absolute_1 fh5co_hide\" id=\"play-video\">\n                                <div class=\"fh5co_hover_news_img_video_tag_position_absolute_1_play_button_1\">\n                                    <div class=\"fh5co_hover_news_img_video_tag_position_absolute_1_play_button\">\n                                        <span><i class=\"fa fa-play\"></i></span>\n                                    </div>\n                                </div>\n                            </div>\n                        </div>\n                        <div class=\"pt-2\">\n                            <a href=\"#\" class=\"d-block fh5co_small_post_heading fh5co_small_post_heading_1\">\n                            <span class=\"\">The top 10 funniest videos on YouTube </span></a>\n                            <div class=\"c_g\"><i class=\"fa fa-clock-o\"></i> Oct 16,2017</div>\n                        </div>\n                    </div>\n                </div>\n            ");
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
out.write("\n        </div>\n    </div>\n</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

