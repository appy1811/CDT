package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navbar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<!-- Basic Page Info -->\n");
      out.write("\t\t<meta charset=\"utf-8\" />\n");
      out.write("\t\t<title>CDT</title>\n");
      out.write("\n");
      out.write("\t\t<!-- Site favicon -->\n");
      out.write("\t\t<link\n");
      out.write("\t\t\trel=\"apple-touch-icon\"\n");
      out.write("\t\t\tsizes=\"180x180\"\n");
      out.write("\t\t\thref=\"vendors/images/apple-touch-ico.png\"\n");
      out.write("\t\t/>\n");
      out.write("\t\t<link\n");
      out.write("\t\t\trel=\"icon\"\n");
      out.write("\t\t\ttype=\"image/png\"\n");
      out.write("\t\t\tsizes=\"32x32\"\n");
      out.write("\t\t\thref=\"vendors/images/favicon-32x3.png\"\n");
      out.write("\t\t/>\n");
      out.write("\t\t<link\n");
      out.write("\t\t\trel=\"icon\"\n");
      out.write("\t\t\ttype=\"image/png\"\n");
      out.write("\t\t\tsizes=\"16x16\"\n");
      out.write("\t\t\thref=\"vendors/images/favicon-16x1.png\"\n");
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
      out.write("\t\t<link\n");
      out.write("\t\t\trel=\"stylesheet\"\n");
      out.write("\t\t\ttype=\"text/css\"\n");
      out.write("\t\t\thref=\"src/plugins/datatables/css/dataTables.bootstrap4.min.css\"\n");
      out.write("\t\t/>\n");
      out.write("\t\t<link\n");
      out.write("\t\t\trel=\"stylesheet\"\n");
      out.write("\t\t\ttype=\"text/css\"\n");
      out.write("\t\t\thref=\"src/plugins/datatables/css/responsive.bootstrap4.min.css\"\n");
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
      out.write("\t<body>\n");
      out.write("<!--\t\t<div class=\"pre-loader\">\n");
      out.write("\t\t\t<div class=\"pre-loader-box\">\n");
      out.write("\t\t\t\t<div class=\"loader-logo\">\n");
      out.write("\t\t\t\t\t<img src=\"vendors/images/deskapp-logo.svg\" alt=\"\" />\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"loader-progress\" id=\"progress_div\">\n");
      out.write("\t\t\t\t\t<div class=\"bar\" id=\"bar1\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"percent\" id=\"percent1\">0%</div>\n");
      out.write("\t\t\t\t<div class=\"loading-text\">Loading...</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>-->\n");
      out.write("\n");
      out.write("\t\t<div class=\"header\">\n");
      out.write("\t\t\t<div class=\"header-left\">\n");
      out.write("\t\t\t\t<div class=\"menu-icon bi bi-list\"></div>\n");
      out.write("\t\t\t\t<div\n");
      out.write("\t\t\t\t\tclass=\"search-toggle-icon bi bi-search\"\n");
      out.write("\t\t\t\t\tdata-toggle=\"header_search\"\n");
      out.write("\t\t\t\t></div>\n");
      out.write("\t\t\t\t<div class=\"header-search\">\n");
      out.write("\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group mb-0\">\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"header-right\">\n");
      out.write("\t\t\t\t<!-- <div class=\"dashboard-setting user-notification\">\n");
      out.write("\t\t\t\t\t<div class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t<a\n");
      out.write("\t\t\t\t\t\t\tclass=\"dropdown-toggle no-arrow\"\n");
      out.write("\t\t\t\t\t\t\thref=\"javascript:;\"\n");
      out.write("\t\t\t\t\t\t\tdata-toggle=\"right-sidebar\"\n");
      out.write("\t\t\t\t\t\t>\n");
      out.write("\t\t\t\t\t\t\t<i class=\"dw dw-settings2\"></i>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div> -->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"user-info-dropdown\">\n");
      out.write("\t\t\t\t\t<div class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t<a\n");
      out.write("\t\t\t\t\t\t\tclass=\"dropdown-toggle\"\n");
      out.write("\t\t\t\t\t\t\thref=\"#\"\n");
      out.write("\t\t\t\t\t\t\trole=\"button\"\n");
      out.write("\t\t\t\t\t\t\tdata-toggle=\"dropdown\"\n");
      out.write("\t\t\t\t\t\t>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"user-icon\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"vendors/images/photo1.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"user-name\">Welcome</span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t<div\n");
      out.write("\t\t\t\t\t\t\tclass=\"dropdown-menu dropdown-menu-right dropdown-menu-icon-list\"\n");
      out.write("\t\t\t\t\t\t>\n");
      out.write("\t\t\t\t\t\t\t \n");
      out.write("\t\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"acp.jsp\"\n");
      out.write("\t\t\t\t\t\t\t\t><i class=\"dw dw-settings2\"></i> Setting</a\n");
      out.write("\t\t\t\t\t\t\t>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"logout.jsp\"\n");
      out.write("\t\t\t\t\t\t\t\t><i class=\"dw dw-logout\"></i> Log Out</a\n");
      out.write("\t\t\t\t\t\t\t>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"right-sidebar\">\n");
      out.write("\t\t\t<div class=\"sidebar-title\">\n");
      out.write("\t\t\t\t<h3 class=\"weight-600 font-16 text-blue\">\n");
      out.write("\t\t\t\t\tLayout Settings\n");
      out.write("\t\t\t\t\t<span class=\"btn-block font-weight-400 font-12\"\n");
      out.write("\t\t\t\t\t\t>User Interface Settings</span\n");
      out.write("\t\t\t\t\t>\n");
      out.write("\t\t\t\t</h3>\n");
      out.write("\t\t\t\t<div class=\"close-sidebar\" data-toggle=\"right-sidebar-close\">\n");
      out.write("\t\t\t\t\t<i class=\"icon-copy ion-close-round\"></i>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"right-sidebar-body customscroll\">\n");
      out.write("\t\t\t\t<div class=\"right-sidebar-body-content\">\n");
      out.write("\t\t\t\t\t<h4 class=\"weight-600 font-18 pb-10\">Header Background</h4>\n");
      out.write("\t\t\t\t\t<div class=\"sidebar-btn-group pb-30 mb-10\">\n");
      out.write("\t\t\t\t\t\t<a\n");
      out.write("\t\t\t\t\t\t\thref=\"javascript:void(0);\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn btn-outline-primary header-white active\"\n");
      out.write("\t\t\t\t\t\t\t>White</a\n");
      out.write("\t\t\t\t\t\t>\n");
      out.write("\t\t\t\t\t\t<a\n");
      out.write("\t\t\t\t\t\t\thref=\"javascript:void(0);\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn btn-outline-primary header-dark\"\n");
      out.write("\t\t\t\t\t\t\t>Dark</a\n");
      out.write("\t\t\t\t\t\t>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<h4 class=\"weight-600 font-18 pb-10\">Sidebar Background</h4>\n");
      out.write("\t\t\t\t\t<div class=\"sidebar-btn-group pb-30 mb-10\">\n");
      out.write("\t\t\t\t\t\t<a\n");
      out.write("\t\t\t\t\t\t\thref=\"javascript:void(0);\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn btn-outline-primary sidebar-light\"\n");
      out.write("\t\t\t\t\t\t\t>White</a\n");
      out.write("\t\t\t\t\t\t>\n");
      out.write("\t\t\t\t\t\t<a\n");
      out.write("\t\t\t\t\t\t\thref=\"javascript:void(0);\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn btn-outline-primary sidebar-dark active\"\n");
      out.write("\t\t\t\t\t\t\t>Dark</a\n");
      out.write("\t\t\t\t\t\t>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<h4 class=\"weight-600 font-18 pb-10\">Menu Dropdown Icon</h4>\n");
      out.write("\t\t\t\t\t<div class=\"sidebar-radio-group pb-10 mb-10\">\n");
      out.write("\t\t\t\t\t\t<div class=\"custom-control custom-radio custom-control-inline\">\n");
      out.write("\t\t\t\t\t\t\t<input\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"radio\"\n");
      out.write("\t\t\t\t\t\t\t\tid=\"sidebaricon-1\"\n");
      out.write("\t\t\t\t\t\t\t\tname=\"menu-dropdown-icon\"\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"custom-control-input\"\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"icon-style-1\"\n");
      out.write("\t\t\t\t\t\t\t\tchecked=\"\"\n");
      out.write("\t\t\t\t\t\t\t/>\n");
      out.write("\t\t\t\t\t\t\t<label class=\"custom-control-label\" for=\"sidebaricon-1\"\n");
      out.write("\t\t\t\t\t\t\t\t><i class=\"fa fa-angle-down\"></i\n");
      out.write("\t\t\t\t\t\t\t></label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"custom-control custom-radio custom-control-inline\">\n");
      out.write("\t\t\t\t\t\t\t<input\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"radio\"\n");
      out.write("\t\t\t\t\t\t\t\tid=\"sidebaricon-2\"\n");
      out.write("\t\t\t\t\t\t\t\tname=\"menu-dropdown-icon\"\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"custom-control-input\"\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"icon-style-2\"\n");
      out.write("\t\t\t\t\t\t\t/>\n");
      out.write("\t\t\t\t\t\t\t<label class=\"custom-control-label\" for=\"sidebaricon-2\"\n");
      out.write("\t\t\t\t\t\t\t\t><i class=\"ion-plus-round\"></i\n");
      out.write("\t\t\t\t\t\t\t></label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"custom-control custom-radio custom-control-inline\">\n");
      out.write("\t\t\t\t\t\t\t<input\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"radio\"\n");
      out.write("\t\t\t\t\t\t\t\tid=\"sidebaricon-3\"\n");
      out.write("\t\t\t\t\t\t\t\tname=\"menu-dropdown-icon\"\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"custom-control-input\"\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"icon-style-3\"\n");
      out.write("\t\t\t\t\t\t\t/>\n");
      out.write("\t\t\t\t\t\t\t<label class=\"custom-control-label\" for=\"sidebaricon-3\"\n");
      out.write("\t\t\t\t\t\t\t\t><i class=\"fa fa-angle-double-right\"></i\n");
      out.write("\t\t\t\t\t\t\t></label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<h4 class=\"weight-600 font-18 pb-10\">Menu List Icon</h4>\n");
      out.write("\t\t\t\t\t<div class=\"sidebar-radio-group pb-30 mb-10\">\n");
      out.write("\t\t\t\t\t\t<div class=\"custom-control custom-radio custom-control-inline\">\n");
      out.write("\t\t\t\t\t\t\t<input\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"radio\"\n");
      out.write("\t\t\t\t\t\t\t\tid=\"sidebariconlist-1\"\n");
      out.write("\t\t\t\t\t\t\t\tname=\"menu-list-icon\"\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"custom-control-input\"\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"icon-list-style-1\"\n");
      out.write("\t\t\t\t\t\t\t\tchecked=\"\"\n");
      out.write("\t\t\t\t\t\t\t/>\n");
      out.write("\t\t\t\t\t\t\t<label class=\"custom-control-label\" for=\"sidebariconlist-1\"\n");
      out.write("\t\t\t\t\t\t\t\t><i class=\"ion-minus-round\"></i\n");
      out.write("\t\t\t\t\t\t\t></label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"custom-control custom-radio custom-control-inline\">\n");
      out.write("\t\t\t\t\t\t\t<input\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"radio\"\n");
      out.write("\t\t\t\t\t\t\t\tid=\"sidebariconlist-2\"\n");
      out.write("\t\t\t\t\t\t\t\tname=\"menu-list-icon\"\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"custom-control-input\"\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"icon-list-style-2\"\n");
      out.write("\t\t\t\t\t\t\t/>\n");
      out.write("\t\t\t\t\t\t\t<label class=\"custom-control-label\" for=\"sidebariconlist-2\"\n");
      out.write("\t\t\t\t\t\t\t\t><i class=\"fa fa-circle-o\" aria-hidden=\"true\"></i\n");
      out.write("\t\t\t\t\t\t\t></label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"custom-control custom-radio custom-control-inline\">\n");
      out.write("\t\t\t\t\t\t\t<input\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"radio\"\n");
      out.write("\t\t\t\t\t\t\t\tid=\"sidebariconlist-3\"\n");
      out.write("\t\t\t\t\t\t\t\tname=\"menu-list-icon\"\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"custom-control-input\"\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"icon-list-style-3\"\n");
      out.write("\t\t\t\t\t\t\t/>\n");
      out.write("\t\t\t\t\t\t\t<label class=\"custom-control-label\" for=\"sidebariconlist-3\"\n");
      out.write("\t\t\t\t\t\t\t\t><i class=\"dw dw-check\"></i\n");
      out.write("\t\t\t\t\t\t\t></label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"custom-control custom-radio custom-control-inline\">\n");
      out.write("\t\t\t\t\t\t\t<input\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"radio\"\n");
      out.write("\t\t\t\t\t\t\t\tid=\"sidebariconlist-4\"\n");
      out.write("\t\t\t\t\t\t\t\tname=\"menu-list-icon\"\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"custom-control-input\"\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"icon-list-style-4\"\n");
      out.write("\t\t\t\t\t\t\t\tchecked=\"\"\n");
      out.write("\t\t\t\t\t\t\t/>\n");
      out.write("\t\t\t\t\t\t\t<label class=\"custom-control-label\" for=\"sidebariconlist-4\"\n");
      out.write("\t\t\t\t\t\t\t\t><i class=\"icon-copy dw dw-next-2\"></i\n");
      out.write("\t\t\t\t\t\t\t></label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"custom-control custom-radio custom-control-inline\">\n");
      out.write("\t\t\t\t\t\t\t<input\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"radio\"\n");
      out.write("\t\t\t\t\t\t\t\tid=\"sidebariconlist-5\"\n");
      out.write("\t\t\t\t\t\t\t\tname=\"menu-list-icon\"\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"custom-control-input\"\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"icon-list-style-5\"\n");
      out.write("\t\t\t\t\t\t\t/>\n");
      out.write("\t\t\t\t\t\t\t<label class=\"custom-control-label\" for=\"sidebariconlist-5\"\n");
      out.write("\t\t\t\t\t\t\t\t><i class=\"dw dw-fast-forward-1\"></i\n");
      out.write("\t\t\t\t\t\t\t></label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"custom-control custom-radio custom-control-inline\">\n");
      out.write("\t\t\t\t\t\t\t<input\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"radio\"\n");
      out.write("\t\t\t\t\t\t\t\tid=\"sidebariconlist-6\"\n");
      out.write("\t\t\t\t\t\t\t\tname=\"menu-list-icon\"\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"custom-control-input\"\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"icon-list-style-6\"\n");
      out.write("\t\t\t\t\t\t\t/>\n");
      out.write("\t\t\t\t\t\t\t<label class=\"custom-control-label\" for=\"sidebariconlist-6\"\n");
      out.write("\t\t\t\t\t\t\t\t><i class=\"dw dw-next\"></i\n");
      out.write("\t\t\t\t\t\t\t></label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"reset-options pt-30 text-center\">\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-danger\" id=\"reset-settings\">\n");
      out.write("\t\t\t\t\t\t\tReset Settings\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"left-side-bar\">\n");
      out.write("\t\t\t<div class=\"brand-logo\">\n");
      out.write("\t\t\t\t<a href=\"index.html\">\n");
      out.write("                                    <img src=\"CDT_logo1.jpg\" alt=\"\" class=\"dark-logo\" />\n");
      out.write("\t\t\t\t\t <img src=\"CDT_logo1.jpg\" alt=\"\" \n");
      out.write("\t\t\t\t\t\tclass=\"light-logo\"\n");
      out.write("\t\t\t\t\t/>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t<div class=\"close-sidebar\" data-toggle=\"left-sidebar-close\">\n");
      out.write("\t\t\t\t\t<i class=\"ion-close-round\"></i>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"menu-block customscroll\">\n");
      out.write("\t\t\t\t<div class=\"sidebar-menu\">\n");
      out.write("\t\t\t\t\t<ul id=\"accordion-menu\">\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:;\" class=\"dropdown-toggle\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"micon bi bi-house\"></span\n");
      out.write("\t\t\t\t\t\t\t\t><span class=\"mtext\">Home</span>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"submenu\">\n");
      out.write("                                                            <li><a href=\"dashboard.jsp\">Dashboard</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"aUsers.jsp\">Manage Users</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:;\" class=\"dropdown-toggle\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"micon bi bi-textarea-resize\"></span\n");
      out.write("\t\t\t\t\t\t\t\t><span class=\"mtext\">Flat details</span>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"submenu\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"FlatDetails.jsp\">view</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:;\" class=\"dropdown-toggle\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"micon bi bi-table\"></span\n");
      out.write("\t\t\t\t\t\t\t\t><span class=\"mtext\">Customer detailes</span>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"submenu\">\n");
      out.write("                                                            <li><a href=\"aCustomers.jsp\">view</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:;\" class=\"dropdown-toggle\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"micon bi bi-archive\"></span\n");
      out.write("\t\t\t\t\t\t\t\t><span class=\"mtext\">Gallery </span>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"submenu\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"AGallery.jsp\">view</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:;\" class=\"dropdown-toggle\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"micon bi bi-command\"></span\n");
      out.write("\t\t\t\t\t\t\t\t><span class=\"mtext\">Reports</span>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"submenu\">\n");
      out.write("                                                            <li><a href=\"avbookings.jsp\">Booking Details</a></li>\n");
      out.write("                                                            <li><a href=\"avCancel.jsp\">Cancellation Details</a></li>\n");
      out.write("                                                                <li><a href=\"avAgreement.jsp\">Agreement Details</a></li>\n");
      out.write("                                                                <li><a href=\"avpayments.jsp\">Payment Details</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"mobile-menu-overlay\"></div>\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- welcome modal start -->\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- welcome modal end -->\n");
      out.write("\t\t<!-- js -->\n");
      out.write("<!--\t\t<script src=\"vendors/scripts/core.js\"></script>\n");
      out.write("\t\t<script src=\"vendors/scripts/script.min.js\"></script>\n");
      out.write("\t\t<script src=\"vendors/scripts/process.js\"></script>\n");
      out.write("\t\t<script src=\"vendors/scripts/layout-settings.js\"></script>\n");
      out.write("\t\t<script src=\"src/plugins/apexcharts/apexcharts.min.js\"></script>\n");
      out.write("\t\t<script src=\"src/plugins/datatables/js/jquery.dataTables.min.js\"></script>\n");
      out.write("\t\t<script src=\"src/plugins/datatables/js/dataTables.bootstrap4.min.js\"></script>\n");
      out.write("\t\t<script src=\"src/plugins/datatables/js/dataTables.responsive.min.js\"></script>\n");
      out.write("\t\t<script src=\"src/plugins/datatables/js/responsive.bootstrap4.min.js\"></script>\n");
      out.write("\t\t<script src=\"vendors/scripts/dashboard3.js\"></script>\n");
      out.write("\t\t Google Tag Manager (noscript) \n");
      out.write("\t\t<noscript\n");
      out.write("\t\t\t><iframe\n");
      out.write("\t\t\t\tsrc=\"https://www.googletagmanager.com/ns.html?id=GTM-NXZMQSS\"\n");
      out.write("\t\t\t\theight=\"0\"\n");
      out.write("\t\t\t\twidth=\"0\"\n");
      out.write("\t\t\t\tstyle=\"display: none; visibility: hidden\"\n");
      out.write("\t\t\t></iframe\n");
      out.write("\t\t></noscript>-->\n");
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
