package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(" \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<!-- Basic Page Info -->\n");
      out.write("\t\t<meta charset=\"utf-8\" />\n");
      out.write("\t\t<title>Construction data tracking</title>\n");
      out.write("\n");
      out.write("\t\t<!-- Site favicon -->\n");
      out.write("\t\t<link\n");
      out.write("\t\t\trel=\"apple-touch-icon\"\n");
      out.write("\t\t\tsizes=\"180x180\"\n");
      out.write("\t\t\thref=\"vendors/images/apple-touch-icon.png\"\n");
      out.write("\t\t/>\n");
      out.write("\t\t<link\n");
      out.write("\t\t\trel=\"icon\"\n");
      out.write("\t\t\ttype=\"image/png\"\n");
      out.write("\t\t\tsizes=\"32x32\"\n");
      out.write("\t\t\thref=\"vendors/images/favicon-32x32.png\"\n");
      out.write("\t\t/>\n");
      out.write("\t\t<link\n");
      out.write("\t\t\trel=\"icon\"\n");
      out.write("\t\t\ttype=\"image/png\"\n");
      out.write("\t\t\tsizes=\"16x16\"\n");
      out.write("\t\t\thref=\"vendors/images/favicon-16x16.png\"\n");
      out.write("\t\t/>\n");
      out.write("\n");
      out.write("\t\t<!-- Mobile Specific Metas -->\n");
      out.write("\t\t<meta\n");
      out.write("\t\t\tname=\"viewport\"\n");
      out.write("\t\t\tcontent=\"width=device-width, initial-scale=1, maximum-scale=1\"\n");
      out.write("\t\t/>\n");
      out.write("\n");
      out.write("\t\t<!-- Google Font -->\n");
      out.write("\t\t<link\n");
      out.write("\t\t\thref=\"https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600;700;800&display=swap\"\n");
      out.write("\t\t\trel=\"stylesheet\"\n");
      out.write("\t\t/>\n");
      out.write("\t\t<!-- CSS -->\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendors/styles/core.css\" />\n");
      out.write("\t\t<link\n");
      out.write("\t\t\trel=\"stylesheet\"\n");
      out.write("\t\t\ttype=\"text/css\"\n");
      out.write("\t\t\thref=\"vendors/styles/icon-font.min.css\"\n");
      out.write("\t\t/>\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendors/styles/style.css\" />\n");
      out.write("\n");
      out.write("\t\t<!-- Global site tag (gtag.js) - Google Analytics -->\n");
      out.write("\t\t<script\n");
      out.write("\t\t\tasync\n");
      out.write("\t\t\tsrc=\"https://www.googletagmanager.com/gtag/js?id=G-GBZ3SGGX85\"\n");
      out.write("\t\t></script>\n");
      out.write("\t\t<script>\n");
      out.write("\t\t\twindow.dataLayer = window.dataLayer || [];\n");
      out.write("\t\t\tfunction gtag() {\n");
      out.write("\t\t\t\tdataLayer.push(arguments);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tgtag(\"js\", new Date());\n");
      out.write("\n");
      out.write("\t\t\tgtag(\"config\", \"G-GBZ3SGGX85\");\n");
      out.write("\t\t</script>\n");
      out.write("\t\t<!-- Google Tag Manager -->\n");
      out.write("\t\t<script>\n");
      out.write("\t\t\t(function (w, d, s, l, i) {\n");
      out.write("\t\t\t\tw[l] = w[l] || [];\n");
      out.write("\t\t\t\tw[l].push({ \"gtm.start\": new Date().getTime(), event: \"gtm.js\" });\n");
      out.write("\t\t\t\tvar f = d.getElementsByTagName(s)[0],\n");
      out.write("\t\t\t\t\tj = d.createElement(s),\n");
      out.write("\t\t\t\t\tdl = l != \"dataLayer\" ? \"&l=\" + l : \"\";\n");
      out.write("\t\t\t\tj.async = true;\n");
      out.write("\t\t\t\tj.src = \"https://www.googletagmanager.com/gtm.js?id=\" + i + dl;\n");
      out.write("\t\t\t\tf.parentNode.insertBefore(j, f);\n");
      out.write("\t\t\t})(window, document, \"script\", \"dataLayer\", \"GTM-NXZMQSS\");\n");
      out.write("\t\t</script>\n");
      out.write("\t\t<!-- End Google Tag Manager -->\n");
      out.write("\t</head>\n");
      out.write("\t<body class=\"login-page\">\n");
      out.write("\t\t<div class=\"login-header box-shadow\">\n");
      out.write("\t\t\t<div\n");
      out.write("\t\t\t\tclass=\"container-fluid d-flex justify-content-between align-items-center\"\n");
      out.write("\t\t\t>\n");
      out.write("\t\t\t\t<div class=\"brand-logo\">\n");
      out.write("                                    <a href=\"adminLogin.jsp\">\n");
      out.write("\t\t\t\t\t <img src=\"CDT_logo1.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"login-menu\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div\n");
      out.write("\t\t\tclass=\"login-wrap d-flex align-items-center flex-wrap justify-content-center\"\n");
      out.write("\t\t>\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row align-items-center\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 col-lg-7\">\n");
      out.write("\t\t\t\t\t\t<img src=\"vendors/images/login-page-img.png\" alt=\"\" />\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 col-lg-5\">\n");
      out.write("\t\t\t\t\t\t<div class=\"login-box bg-white box-shadow border-radius-10\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"login-title\">\n");
      out.write("\t\t\t\t\t\t\t\t<h2 class=\"text-center text-primary\">Login</h2>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                                    <form method=\"post\" action=\"pLogin.jsp\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"select-role\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group custom\">\n");
      out.write("                                                                    <input name=\"un\" required=\"\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"form-control form-control-lg\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"Username\"\n");
      out.write("\t\t\t\t\t\t\t\t\t/>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group-append custom\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"input-group-text\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t><i class=\"icon-copy dw dw-user1\"></i\n");
      out.write("\t\t\t\t\t\t\t\t\t\t></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group custom\">\n");
      out.write("                                                                    <input name=\"pass\" required=\"\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=\"password\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"form-control form-control-lg\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"**********\"\n");
      out.write("\t\t\t\t\t\t\t\t\t/>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group-append custom\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"input-group-text\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t><i class=\"dw dw-padlock1\"></i\n");
      out.write("\t\t\t\t\t\t\t\t\t\t></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row pb-30\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"custom-control custom-checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");

                                                                                        try{
                                                                                            out.println(""+session.getAttribute("msg").toString() );
                                                                                            session.setAttribute("msg", "");
                                                                                        }catch(Exception e){System.out.println(e);}
                                                                                        
                                                                                        
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t \n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"input-group mb-0\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<!--\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tuse code for form submit\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input class=\"btn btn-primary btn-lg btn-block\" type=\"submit\" value=\"Sign In\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t-->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"btn btn-primary btn-lg btn-block\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                                                                                value=\"Sign In\"/>\t\n");
      out.write("                                                                                </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-16 weight-600 pt-10 pb-10 text-center\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tdata-color=\"#707373\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"input-group mb-0\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- welcome modal start -->\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- welcome modal end -->\n");
      out.write("\t\t<!-- js -->\n");
      out.write("\t\t<script src=\"vendors/scripts/core.js\"></script>\n");
      out.write("\t\t<script src=\"vendors/scripts/script.min.js\"></script>\n");
      out.write("\t\t<script src=\"vendors/scripts/process.js\"></script>\n");
      out.write("\t\t<script src=\"vendors/scripts/layout-settings.js\"></script>\n");
      out.write("\t\t<!-- Google Tag Manager (noscript) -->\n");
      out.write("\t\t<noscript\n");
      out.write("\t\t\t><iframe\n");
      out.write("\t\t\t\tsrc=\"https://www.googletagmanager.com/ns.html?id=GTM-NXZMQSS\"\n");
      out.write("\t\t\t\theight=\"0\"\n");
      out.write("\t\t\t\twidth=\"0\"\n");
      out.write("\t\t\t\tstyle=\"display: none; visibility: hidden\"\n");
      out.write("\t\t\t></iframe\n");
      out.write("\t\t></noscript>\n");
      out.write("\t\t<!-- End Google Tag Manager (noscript) -->\n");
      out.write("\t</body>\n");
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
