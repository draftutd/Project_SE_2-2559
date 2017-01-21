package org.apache.jsp.WEB_002dINF.views.userlog;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jspx extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>");
      out.write("<head>");
      out.write("<title>");
      out.write("Add-Customer");
      out.write("</title>");
      out.write("</head>");
      out.write("<body style=\"background: #2F4F4F\">");
      out.write("<div id=\"alertsuccess\" />");
      out.write("<br />");
      out.write("<br />");
      out.write("<div style=\"width: 50%\" class=\"panel panel-default\">");
      out.write("<div class=\"panel-heading\">");
      out.write("<h3>");
      out.write("REGISTER");
      out.write("</h3>");
      out.write("</div>");
      out.write("<div class=\"panel-body\">");
      out.write("<table width=\"500\" align=\"center\">");
      out.write("<tr>");
      out.write("<td>");
      out.write("<form method=\"POST\" id=\"formUser\" class=\"form-horizontal\">");
      out.write("<table style=\"width: 100%\" border=\"0\">");
      out.write("<tr>");
      out.write("<td valign=\"top\">");
      out.write("Username : ");
      out.write("</td>");
      out.write("<td>");
      out.write("<input name=\"username\" id=\"username\" class=\"form-control\" type=\"text\" />");
      out.write("<br />");
      out.write("</td>");
      out.write("</tr>");
      out.write("<tr>");
      out.write("<td valign=\"top\">");
      out.write("Password : ");
      out.write("</td>");
      out.write("<td valign=\"\">");
      out.write("<input name=\"password\" id=\"password\" class=\"form-control\" type=\"password\" />");
      out.write("<br />");
      out.write("</td>");
      out.write("</tr>");
      out.write("<tr>");
      out.write("<td valign=\"top\">");
      out.write("Firstname : ");
      out.write("</td>");
      out.write("<td>");
      out.write("<input name=\"firstname\" id=\"firstname\" class=\"form-control\" type=\"text\" />");
      out.write("<br />");
      out.write("</td>");
      out.write("</tr>");
      out.write("<tr>");
      out.write("<td valign=\"top\">");
      out.write("lastname : ");
      out.write("</td>");
      out.write("<td>");
      out.write("<input name=\"lastname\" id=\"lastname\" class=\"form-control\" type=\"text\" />");
      out.write("<br />");
      out.write("</td>");
      out.write("</tr>");
      out.write("<tr>");
      out.write("<td valign=\"top\">");
      out.write("Phone : ");
      out.write("</td>");
      out.write("<td>");
      out.write("<input name=\"phone\" id=\"phone\" class=\"form-control\" type=\"text\" />");
      out.write("<br />");
      out.write("</td>");
      out.write("</tr>");
      out.write("<tr>");
      out.write("<td valign=\"top\">");
      out.write("Address : ");
      out.write("</td>");
      out.write("<td>");
      out.write("<input name=\"address\" id=\"address\" class=\"form-control\" type=\"text\" />");
      out.write("<br />");
      out.write("</td>");
      out.write("</tr>");
      out.write("<tr>");
      out.write("<td />");
      out.write("<td>");
      out.write("<button id=\"create\" onclick=\"createUser()\" class=\"btn btn-primary\" type=\"submit\">");
      out.write("Save");
      out.write("</button>");
      out.write("</td>");
      out.write("</tr>");
      out.write("</table>");
      out.write("</form>");
      out.write("</td>");
      out.write("</tr>");
      out.write("</table>");
      out.write("</div>");
      out.write("</div>");
      out.write("<script type=\"text/javascript\">");
      out.write("\n");
      out.write("\t    function createUser() {\n");
      out.write("\t        var data = $('#formUser').serialize();\n");
      out.write("\t        $.ajax({\n");
      out.write("\t            url: \"createUser\",\n");
      out.write("\t            type: \"POST\",\n");
      out.write("\t            data:data,\n");
      out.write("\t            async: false,\n");
      out.write("\t            cache: false,\n");
      out.write("\t            success: function(data){\n");
      out.write("\t            \tvar newRowContent = \"<br/><br/><br/><div class=\\\"alert alert-success\\\">Success!</div><br/><a href=\\\"http://localhost:8080/team01/login\\\"><button class=\\\"btn btn-default\\\">Sing In</button></a>\";\n");
      out.write("                    $(\"#alertsuccess\").html(newRowContent);\n");
      out.write("\t            },\n");
      out.write("\t            error: function(){\n");
      out.write("\t            \tvar newRowContent = \"<br/><br/><br/><div class=\\\"alert alert-danger\\\">FAIL!</div><br/><button class=\\\"btn btn-default\\\" onclick=\\\"location.reload()\\\">กลับ</button>\";\n");
      out.write("                    $(\"#alertsuccess\").html(newRowContent);\n");
      out.write("\t            }\n");
      out.write("\t        });\n");
      out.write("\t    }\n");
      out.write("    ");
      out.write("</script>");
      out.write("</body>");
      out.write("</html>");
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
