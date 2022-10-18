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
package org.apache.sling.scripting.sightly.apps.capstone.components.nevigationheader;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class nevigationheader__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

out.write("<div class=\"container-fluid bg-faded fh5co_padd_mediya padding_786\">\n    <div class=\"container padding_786\">\n        <nav class=\"navbar navbar-toggleable-md navbar-light \">\n            <button class=\"navbar-toggler navbar-toggler-right mt-3\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"><span class=\"fa fa-bars\"></span></button>\n            <a class=\"navbar-brand\" href=\"#\"><img src=\"/content/dam/capstone/images/white_logo.png\" alt=\"img\" class=\"mobile_logo_width\"/></a>\n            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n                <ul class=\"navbar-nav mr-auto\">\n                    <li class=\"nav-item active\">\n                        <a class=\"nav-link\" href=\"index.html\">Home <span class=\"sr-only\">(current)</span></a>\n                    </li>\n                    <li class=\"nav-item \">\n                        <a class=\"nav-link\" href=\"blog.html\">Blog <span class=\"sr-only\">(current)</span></a>\n                    </li>\n                    <li class=\"nav-item \">\n                        <a class=\"nav-link\" href=\"single.html\">Single <span class=\"sr-only\">(current)</span></a>\n                    </li>\n                    <li class=\"nav-item dropdown\">\n                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"dropdownMenuButton2\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">World <span class=\"sr-only\">(current)</span></a>\n                        <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuLink_1\">\n                            <a class=\"dropdown-item\" href=\"#\">Action in</a>\n                            <a class=\"dropdown-item\" href=\"#\">Another action</a>\n                            <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n                        </div>\n                    </li>\n                    <li class=\"nav-item dropdown\">\n                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"dropdownMenuButton3\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Community<span class=\"sr-only\">(current)</span></a>\n                        <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuLink_1\">\n                            <a class=\"dropdown-item\" href=\"#\">Action in</a>\n                            <a class=\"dropdown-item\" href=\"#\">Another action</a>\n                            <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n                        </div>\n                    </li>\n                    <li class=\"nav-item \">\n                        <a class=\"nav-link\" href=\"Contact_us.html\">Contact <span class=\"sr-only\">(current)</span></a>\n                    </li>\n                </ul>\n            </div>\n        </nav>\n    </div>\n</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

