package org.apache.jsp.WEB_002dINF.views.stock;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addstock_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_url_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_spring_url_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_spring_url_var_value_nobody.release();
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

      if (_jspx_meth_spring_url_0(_jspx_page_context))
        return;
      out.write("<html>");
      out.write("<body background=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${DRAFTBG }", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\">");
      out.write("<br />");
      out.write("<div id=\"alertsuccess\" />");
      out.write("<div aria-label=\"...\" role=\"group\" class=\"btn-group btn-group-justified\">");
      out.write("<div role=\"group\" class=\"btn-group\">");
      out.write("<a href=\"http://localhost:8080/team01/stock/all\">");
      out.write("<button class=\"btn btn-default\" type=\"button\">");
      out.write("<b>");
      out.write("แสดงประวัติการสั่งชื้อทั้งหมด");
      out.write("</b>");
      out.write("</button>");
      out.write("</a>");
      out.write("</div>");
      out.write("<div role=\"group\" class=\"btn-group\">");
      out.write("<a href=\"http://localhost:8080/team01/stock/add\">");
      out.write("<button class=\"btn btn-default\" type=\"button\">");
      out.write("<b>");
      out.write("เพิ่มประวัติการสั่งชื้อ");
      out.write("</b>");
      out.write("</button>");
      out.write("</a>");
      out.write("</div>");
      out.write("<div role=\"group\" class=\"btn-group hhh\">");
      out.write("<a href=\"http://localhost:8080/team01/stock/edit\">");
      out.write("<button class=\"btn btn-default\" type=\"button\">");
      out.write("<b>");
      out.write("แก้ไข/ลบ ประวัติการสั่งชื้อ");
      out.write("</b>");
      out.write("</button>");
      out.write("</a>");
      out.write("</div>");
      out.write("</div>");
      out.write("<form method=\"post\" name=\"createstock\" id=\"createstock\">");
      out.write("<table class=\"table table-bordered\">");
      out.write("<br />");
      out.write("<tr>");
      out.write("<td>");
      out.write("<b>");
      out.write("รายการสินค้า");
      out.write("</b>");
      out.write("</td>");
      out.write("<td>");
      out.write("<input size=\"80\" id=\"product_name\" name=\"product_name\" type=\"text\" />");
      out.write("</td>");
      out.write("</tr>");
      out.write("<tr>");
      out.write("<td>");
      out.write("<b>");
      out.write("จำนวน");
      out.write("</b>");
      out.write("</td>");
      out.write("<td>");
      out.write("<input size=\"20\" id=\"product_num\" name=\"product_num\" type=\"text\" />");
      out.write("</td>");
      out.write("</tr>");
      out.write("<tr>");
      out.write("<td>");
      out.write("<b>");
      out.write("ราคาทั้งหมด");
      out.write("</b>");
      out.write("</td>");
      out.write("<td>");
      out.write("<input size=\"20\" id=\"allproduct_price\" name=\"allproduct_price\" type=\"text\" />");
      out.write("</td>");
      out.write("</tr>");
      out.write("<tr>");
      out.write("<td>");
      out.write("<b>");
      out.write("สถานะการสั่งชื้อ");
      out.write("</b>");
      out.write("</td>");
      out.write("<td>");
      out.write("<input name=\"status\" id=\"status\" type=\"checkbox\" />");
      out.write("</td>");
      out.write("</tr>");
      out.write("<tr>");
      out.write("<td>");
      out.write("<b>");
      out.write("วันที่สั่งชื้อ");
      out.write("</b>");
      out.write("</td>");
      out.write("<td>");
      out.write("<input value=\"2014-02-09\" name=\"date_pro\" id=\"date_pro\" type=\"date\" />");
      out.write("</td>");
      out.write("</tr>");
      out.write("</table>");
      out.write("<button onclick=\"createStock()\" class=\"btn btn-default\" type=\"submit\">");
      out.write("<b>");
      out.write("ยืนยันการสั่งชื้อ");
      out.write("</b>");
      out.write("</button>");
      out.write("</form>");
      out.write("<br />");
      out.write("<script>");
      out.write("\n");
      out.write("      function createStock() {\n");
      out.write("        var data = $('#createstock').serialize();\n");
      out.write("        $.ajax({\n");
      out.write("            url: \"createStock\",\n");
      out.write("            type: \"POST\",\n");
      out.write("            data: data,\n");
      out.write("            async: false,\n");
      out.write("            cache: false,\n");
      out.write("            success: function(){\n");
      out.write("            \tvar newRowContent = \"<div class=\\\"alert alert-success\\\">ทำรายการสั่งชื้อแล้ว!</div>\";\n");
      out.write("          \t  \n");
      out.write("                $(\"#alertsuccess\").html(newRowContent);\n");
      out.write("            },\n");
      out.write("            error: function(){\n");
      out.write("            \tvar newRowContent = \"<div class=\\\"alert alert-danger\\\">รายการสั่งชื้อไม่สำเร็จ!</div>\";\n");
      out.write("          \t  \n");
      out.write("                $(\"#alertsuccess\").html(newRowContent);\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("         }\n");
      out.write("\n");
      out.write("      ");
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

  private boolean _jspx_meth_spring_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_0 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_var_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_0.setParent(null);
    _jspx_th_spring_url_0.setVar("DRAFTBG");
    _jspx_th_spring_url_0.setValue("/resources/images/DRAFTBG.jpg");
    int[] _jspx_push_body_count_spring_url_0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_0 = _jspx_th_spring_url_0.doStartTag();
      if (_jspx_th_spring_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_0.doFinally();
      _jspx_tagPool_spring_url_var_value_nobody.reuse(_jspx_th_spring_url_0);
    }
    return false;
  }
}
