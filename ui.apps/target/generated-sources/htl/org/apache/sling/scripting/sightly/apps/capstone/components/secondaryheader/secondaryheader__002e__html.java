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
package org.apache.sling.scripting.sightly.apps.capstone.components.secondaryheader;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class secondaryheader__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_secondaymodel = null;
Collection var_collectionvar4_list_coerced$ = null;
_global_secondaymodel = renderContext.call("use", com.gofortrainings.capstone.core.models.SecondarySlingModel.class.getName(), obj());
out.write("\n\n<div class=\"container-fluid\">\n    <div class=\"container\">\n        <div class=\"row\">\n            <div class=\"col-12 col-md-3 fh5co_padding_menu\">\n                <img");
{
    Object var_attrvalue0 = renderContext.getObjectModel().resolveProperty(_global_secondaymodel, "logo");
    {
        Object var_attrcontent1 = renderContext.call("xss", var_attrvalue0, "uri");
        {
            boolean var_shoulddisplayattr3 = (((null != var_attrcontent1) && (!"".equals(var_attrcontent1))) && ((!"".equals(var_attrvalue0)) && (!((Object)false).equals(var_attrvalue0))));
            if (var_shoulddisplayattr3) {
                out.write(" src");
                {
                    boolean var_istrueattr2 = (var_attrvalue0.equals(true));
                    if (!var_istrueattr2) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent1));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" alt=\"img\" class=\"fh5co_logo_width\"/>\n            </div>\n            <div class=\"col-12 col-md-9 align-self-center fh5co_mediya_right\">\n                <div class=\"text-center d-inline-block\">\n                    <a class=\"fh5co_display_table\"><div class=\"fh5co_verticle_middle\"><i class=\"fa fa-search\"></i></div></a>\n                </div>\n                <div class=\"text-center d-inline-block\">\n                    <a class=\"fh5co_display_table\"><div class=\"fh5co_verticle_middle\"><i class=\"fa fa-linkedin\"></i></div></a>\n                </div>\n                <div class=\"text-center d-inline-block\">\n                    <a class=\"fh5co_display_table\"><div class=\"fh5co_verticle_middle\"><i class=\"fa fa-google-plus\"></i></div></a>\n                </div>\n                <div class=\"text-center d-inline-block\">\n                    <a href=\"https://twitter.com/fh5co\" target=\"_blank\" class=\"fh5co_display_table\"><div class=\"fh5co_verticle_middle\"><i class=\"fa fa-twitter\"></i></div></a>\n                </div>\n                <div class=\"text-center d-inline-block\">\n                    <a href=\"https://fb.com/fh5co\" target=\"_blank\" class=\"fh5co_display_table\"><div class=\"fh5co_verticle_middle\"><i class=\"fa fa-facebook\"></i></div></a>\n                </div>\n                <!--<div class=\"d-inline-block text-center\"><img src=\"images/country.png\" alt=\"img\" class=\"fh5co_country_width\"/></div>-->\n                <div class=\"d-inline-block text-center dd_position_relative \">\n                    ");
{
    Object var_testvariable11 = renderContext.getObjectModel().resolveProperty(_global_secondaymodel, "displayLanguages");
    if (renderContext.getObjectModel().toBoolean(var_testvariable11)) {
        {
            Object var_collectionvar4 = renderContext.getObjectModel().resolveProperty(_global_secondaymodel, "languages");
            {
                long var_size5 = ((var_collectionvar4_list_coerced$ == null ? (var_collectionvar4_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar4)) : var_collectionvar4_list_coerced$).size());
                {
                    boolean var_notempty6 = (var_size5 > 0);
                    if (var_notempty6) {
                        {
                            long var_end9 = var_size5;
                            {
                                boolean var_validstartstepend10 = (((0 < var_size5) && true) && (var_end9 > 0));
                                if (var_validstartstepend10) {
                                    out.write("<select class=\"form-control fh5co_text_select_option\">");
                                    if (var_collectionvar4_list_coerced$ == null) {
                                        var_collectionvar4_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar4);
                                    }
                                    long var_index12 = 0;
                                    for (Object lang : var_collectionvar4_list_coerced$) {
                                        {
                                            boolean var_traversal14 = (((var_index12 >= 0) && (var_index12 <= var_end9)) && true);
                                            if (var_traversal14) {
                                                out.write("\n                        <option>");
                                                {
                                                    Object var_15 = renderContext.call("xss", lang, "text");
                                                    out.write(renderContext.getObjectModel().toString(var_15));
                                                }
                                                out.write("</option>\n                    ");
                                            }
                                        }
                                        var_index12++;
                                    }
                                    out.write("</select>");
                                }
                            }
                        }
                    }
                }
            }
            var_collectionvar4_list_coerced$ = null;
        }
    }
}
out.write("\n                </div>\n                <div class=\"clearfix\"></div>\n            </div>\n        </div>\n    </div>\n</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

