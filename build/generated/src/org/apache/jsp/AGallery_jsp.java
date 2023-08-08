package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import me.java.app.DBCON;
import java.sql.ResultSet;

public final class AGallery_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <!-- Basic Page Info -->\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <title>CDT</title>\n");
      out.write("\n");
      out.write("        <!-- Site favicon -->\n");
      out.write("        <link\n");
      out.write("            rel=\"apple-touch-icon\"\n");
      out.write("            sizes=\"180x180\"\n");
      out.write("            href=\"vendors/images/apple-touch-icon.png\"\n");
      out.write("            />\n");
      out.write("        <link\n");
      out.write("            rel=\"icon\"\n");
      out.write("            type=\"image/png\"\n");
      out.write("            sizes=\"32x32\"\n");
      out.write("            href=\"vendors/images/favicon-32x32.png\"\n");
      out.write("            />\n");
      out.write("        <link\n");
      out.write("            rel=\"icon\"\n");
      out.write("            type=\"image/png\"\n");
      out.write("            sizes=\"16x16\"\n");
      out.write("            href=\"vendors/images/favicon-16x16.png\"\n");
      out.write("            />\n");
      out.write("\n");
      out.write("        <!-- Mobile Specific Metas -->\n");
      out.write("        <meta\n");
      out.write("            name=\"viewport\"\n");
      out.write("            content=\"width=device-width, initial-scale=1, maximum-scale=1\"\n");
      out.write("            />\n");
      out.write("\n");
      out.write("        <!-- Google Font -->\n");
      out.write("        <link\n");
      out.write("            href=\"https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600;700;800&display=swap\"\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            />\n");
      out.write("        <!-- CSS -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendors/styles/core.css\" />\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            type=\"text/css\"\n");
      out.write("            href=\"vendors/styles/icon-font.min.css\"\n");
      out.write("            />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendors/styles/style.css\" />\n");
      out.write("\n");
      out.write("        <!-- Global site tag (gtag.js) - Google Analytics -->\n");
      out.write("        <script\n");
      out.write("            async\n");
      out.write("            src=\"https://www.googletagmanager.com/gtag/js?id=G-GBZ3SGGX85\"\n");
      out.write("        ></script>\n");
      out.write("        <script>\n");
      out.write("            window.dataLayer = window.dataLayer || [];\n");
      out.write("            function gtag() {\n");
      out.write("                dataLayer.push(arguments);\n");
      out.write("            }\n");
      out.write("            gtag(\"js\", new Date());\n");
      out.write("\n");
      out.write("            gtag(\"config\", \"G-GBZ3SGGX85\");\n");
      out.write("        </script>\n");
      out.write("        <!-- Google Tag Manager -->\n");
      out.write("        <script>\n");
      out.write("            (function (w, d, s, l, i) {\n");
      out.write("                w[l] = w[l] || [];\n");
      out.write("                w[l].push({\"gtm.start\": new Date().getTime(), event: \"gtm.js\"});\n");
      out.write("                var f = d.getElementsByTagName(s)[0],\n");
      out.write("                        j = d.createElement(s),\n");
      out.write("                        dl = l != \"dataLayer\" ? \"&l=\" + l : \"\";\n");
      out.write("                j.async = true;\n");
      out.write("                j.src = \"https://www.googletagmanager.com/gtm.js?id=\" + i + dl;\n");
      out.write("                f.parentNode.insertBefore(j, f);\n");
      out.write("            })(window, document, \"script\", \"dataLayer\", \"GTM-NXZMQSS\");\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            function matchPassword() {\n");
      out.write("                var pw1 = document.getElementById(\"pass\").value;\n");
      out.write("                var pw2 = document.getElementById(\"rpass\").value;\n");
      out.write("                if (pw1 != pw2)\n");
      out.write("                {\n");
      out.write("                    alert(\"Passwords did not match\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                 if(pw1==\"\" || pw2==\"\")\n");
      out.write("  {\n");
      out.write("       alert(\"Please fill Passwords\");  \n");
      out.write("    return false;\n");
      out.write("  }  \n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("        </script>  \n");
      out.write("        <!-- End Google Tag Manager -->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"main-container\">\n");
      out.write("            <div class=\"pd-ltr-20 xs-pd-20-10\">\n");
      out.write("                 \n");
      out.write("                            <hr><h3>View Flat-Gallery</h3><hr>\n");
      out.write("                            <table class=\"table table-responsive-lg pagination-sm\">\n");
      out.write("                                <thead>\n");
      out.write("                                <th>ID</th>\n");
      out.write("                               <th>Description</th>  <th>Photo</th> \n");
      out.write("                               </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                  ");

                                                    try{
                                                    ResultSet rs=DBCON.getConnection().createStatement().executeQuery("select * from gallery");
                                                    for(int i=1;rs.next();i++)
                                                    {
                                                        
      out.write("\n");
      out.write("                                                     <tr>\n");
      out.write("                                                        <td>");
      out.print(i);
      out.write("</td>\n");
      out.write("                                                        <td>");
      out.print(rs.getString("Description"));
      out.write("</td>\n");
      out.write("                                                        <td class=\"cell\"><img src=\"getImage?id=");
      out.print(rs.getString("id"));
      out.write("\" height=\"300\" width=\"300\"></td>  \n");
      out.write("                                                          </tr>\n");
      out.write("                                                    \n");
      out.write("                                                    ");

                                                    }
                                                    
                                                    }
                                                    catch(Exception e){System.err.println(e);}
                                                    
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- welcome modal start -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- welcome modal end -->\n");
      out.write("        <!-- js -->\n");
      out.write("        <script src=\"vendors/scripts/core.js\"></script>\n");
      out.write("        <script src=\"vendors/scripts/script.min.js\"></script>\n");
      out.write("        <script src=\"vendors/scripts/process.js\"></script>\n");
      out.write("        <script src=\"vendors/scripts/layout-settings.js\"></script>\n");
      out.write("        <!-- Google Tag Manager (noscript) -->\n");
      out.write("        <noscript\n");
      out.write("            ><iframe\n");
      out.write("            src=\"https://www.googletagmanager.com/ns.html?id=GTM-NXZMQSS\"\n");
      out.write("            height=\"0\"\n");
      out.write("            width=\"0\"\n");
      out.write("            style=\"display: none; visibility: hidden\"\n");
      out.write("            ></iframe\n");
      out.write("        ></noscript>\n");
      out.write("        <!-- End Google Tag Manager (noscript) -->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
