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
package org.apache.sling.scripting.sightly.apps.capstone.components.footer;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class footer__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_footermodel = null;
Collection var_collectionvar1_list_coerced$ = null;
_global_footermodel = renderContext.call("use", com.gofortrainings.capstone.core.models.FooterModel.class.getName(), obj());
out.write("\n\n<div class=\"container-fluid fh5co_footer_bg pb-3\">\n    <div class=\"container animate-box\">\n        <div class=\"row\">\n            <div class=\"col-12 spdp_right py-5\"><img src=\"/content/dam/capstone/images/white_logo.png\" alt=\"img\" class=\"footer_logo\"/></div>\n            <div class=\"clearfix\"></div>\n            <div class=\"col-12 col-md-4 col-lg-3\">\n                <div class=\"footer_main_title py-3\"> About</div>\n                <div class=\"footer_sub_about pb-3\">");
{
    String var_0 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_footermodel, "aboutText"), "text")) + "\n                ");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</div>\n                ");
{
    Object var_collectionvar1 = renderContext.getObjectModel().resolveProperty(_global_footermodel, "footerLogo");
    {
        long var_size2 = ((var_collectionvar1_list_coerced$ == null ? (var_collectionvar1_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar1)) : var_collectionvar1_list_coerced$).size());
        {
            boolean var_notempty3 = (var_size2 > 0);
            if (var_notempty3) {
                {
                    long var_end6 = var_size2;
                    {
                        boolean var_validstartstepend7 = (((0 < var_size2) && true) && (var_end6 > 0));
                        if (var_validstartstepend7) {
                            out.write("<div class=\"footer_mediya_icon\">");
                            if (var_collectionvar1_list_coerced$ == null) {
                                var_collectionvar1_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar1);
                            }
                            long var_index8 = 0;
                            for (Object logo : var_collectionvar1_list_coerced$) {
                                {
                                    boolean var_traversal10 = (((var_index8 >= 0) && (var_index8 <= var_end6)) && true);
                                    if (var_traversal10) {
                                        out.write(" \n                    <div class=\"text-center d-inline-block\"><a class=\"fh5co_display_table_footer\">\n                        <div class=\"fh5co_verticle_middle\"><i");
                                        {
                                            Object var_attrvalue11 = logo;
                                            {
                                                Object var_attrcontent12 = renderContext.call("xss", var_attrvalue11, "attribute");
                                                {
                                                    boolean var_shoulddisplayattr14 = (((null != var_attrcontent12) && (!"".equals(var_attrcontent12))) && ((!"".equals(var_attrvalue11)) && (!((Object)false).equals(var_attrvalue11))));
                                                    if (var_shoulddisplayattr14) {
                                                        out.write(" class");
                                                        {
                                                            boolean var_istrueattr13 = (var_attrvalue11.equals(true));
                                                            if (!var_istrueattr13) {
                                                                out.write("=\"");
                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent12));
                                                                out.write("\"");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        out.write("></i></div>\n                    </a></div>\n                ");
                                    }
                                }
                                var_index8++;
                            }
                            out.write("</div>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar1_list_coerced$ = null;
}
out.write("\n            </div>\n            <div class=\"col-12 col-md-3 col-lg-2\">\n                <div class=\"footer_main_title py-3\"> Category</div>\n                <ul class=\"footer_menu\">\n                    <li><a href=\"#\" class=\"\"><i class=\"fa fa-angle-right\"></i>&nbsp;&nbsp; Business</a></li>\n                    <li><a href=\"#\" class=\"\"><i class=\"fa fa-angle-right\"></i>&nbsp;&nbsp; Entertainment</a></li>\n                    <li><a href=\"#\" class=\"\"><i class=\"fa fa-angle-right\"></i>&nbsp;&nbsp; Environment</a></li>\n                    <li><a href=\"#\" class=\"\"><i class=\"fa fa-angle-right\"></i>&nbsp;&nbsp; Health</a></li>\n                    <li><a href=\"#\" class=\"\"><i class=\"fa fa-angle-right\"></i>&nbsp;&nbsp; Life style</a></li>\n                    <li><a href=\"#\" class=\"\"><i class=\"fa fa-angle-right\"></i>&nbsp;&nbsp; Politics</a></li>\n                    <li><a href=\"#\" class=\"\"><i class=\"fa fa-angle-right\"></i>&nbsp;&nbsp; Technology</a></li>\n                    <li><a href=\"#\" class=\"\"><i class=\"fa fa-angle-right\"></i>&nbsp;&nbsp; World</a></li>\n                </ul>\n            </div>\n            <div class=\"col-12 col-md-5 col-lg-3 position_footer_relative\">\n                <div class=\"footer_main_title py-3\"> Most Viewed Posts</div>\n                <div class=\"footer_makes_sub_font\"> Dec 31, 2016</div>\n                <a href=\"#\" class=\"footer_post pb-4\"> Success is not a good teacher failure makes you humble </a>\n                <div class=\"footer_makes_sub_font\"> Dec 31, 2016</div>\n                <a href=\"#\" class=\"footer_post pb-4\"> Success is not a good teacher failure makes you humble </a>\n                <div class=\"footer_makes_sub_font\"> Dec 31, 2016</div>\n                <a href=\"#\" class=\"footer_post pb-4\"> Success is not a good teacher failure makes you humble </a>\n                <div class=\"footer_position_absolute\"><img src=\"/content/dam/capstone/images/footer_sub_tipik.png\" alt=\"img\" class=\"width_footer_sub_img\"/></div>\n            </div>\n            <div class=\"col-12 col-md-12 col-lg-4 \">\n                <div class=\"footer_main_title py-3\"> Last Modified Posts</div>\n                <a href=\"#\" class=\"footer_img_post_6\"><img src=\"/content/dam/capstone/images/allef-vinicius-108153.jpg\" alt=\"img\"/></a>\n                <a href=\"#\" class=\"footer_img_post_6\"><img src=\"/content/dam/capstone/images/32-450x260.jpg\" alt=\"img\"/></a>\n                <a href=\"#\" class=\"footer_img_post_6\"><img src=\"/content/dam/capstone/images/download (1).jpg\" alt=\"img\"/></a>\n                <a href=\"#\" class=\"footer_img_post_6\"><img src=\"/content/dam/capstone/images/science-578x362.jpg\" alt=\"img\"/></a>\n                <a href=\"#\" class=\"footer_img_post_6\"><img src=\"/content/dam/capstone/images/vil-son-35490.jpg\" alt=\"img\"/></a>\n                <a href=\"#\" class=\"footer_img_post_6\"><img src=\"/content/dam/capstone/images/zack-minor-15104.jpg\" alt=\"img\"/></a>\n                <a href=\"#\" class=\"footer_img_post_6\"><img src=\"/content/dam/capstone/images/download.jpg\" alt=\"img\"/></a>\n                <a href=\"#\" class=\"footer_img_post_6\"><img src=\"/content/dam/capstone/images/download (2).jpg\" alt=\"img\"/></a>\n                <a href=\"#\" class=\"footer_img_post_6\"><img src=\"/content/dam/capstone/images/ryan-moreno-98837.jpg\" alt=\"img\"/></a>\n            </div>\n        </div>\n        <div class=\"row justify-content-center pt-2 pb-4\">\n            <div class=\"col-12 col-md-8 col-lg-7 \">\n                <div class=\"input-group\">\n                    <span class=\"input-group-addon fh5co_footer_text_box\" id=\"basic-addon1\"><i class=\"fa fa-envelope\"></i></span>\n                    <input type=\"text\" class=\"form-control fh5co_footer_text_box\" placeholder=\"Enter your email...\" aria-describedby=\"basic-addon1\"/>\n                    <a href=\"#\" class=\"input-group-addon fh5co_footer_subcribe\" id=\"basic-addon12\"> <i class=\"fa fa-paper-plane-o\"></i>&nbsp;&nbsp;Subscribe</a>\n                </div>\n            </div>\n        </div>\n    </div>\n</div>\n<div class=\"container-fluid fh5co_footer_right_reserved\">\n    <div class=\"container\">\n        <div class=\"row  \">\n            <div class=\"col-12 col-md-6 py-4 Reserved\"> \u00A9 Copyright 2018, All rights reserved. Design by <a href=\"https://freehtml5.co\" title=\"Free HTML5 Bootstrap templates\">FreeHTML5.co</a>. </div>\n            <div class=\"col-12 col-md-6 spdp_right py-4\">\n                <a href=\"#\" class=\"footer_last_part_menu\">Home</a>\n                <a href=\"Contact_us.html\" class=\"footer_last_part_menu\">About</a>\n                <a href=\"Contact_us.html\" class=\"footer_last_part_menu\">Contact</a>\n                <a href=\"blog.html\" class=\"footer_last_part_menu\">Latest News</a></div>\n        </div>\n    </div>\n</div>\n\n<div class=\"gototop js-top\">\n    <a href=\"#\" class=\"js-gotop\"><i class=\"fa fa-arrow-up\"></i></a>\n</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

