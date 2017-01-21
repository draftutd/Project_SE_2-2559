package org.apache.jsp.WEB_002dINF.views.jedsupha;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class allproduct_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("allproduct");
      out.write("</title>");
      out.write("</head>");
      out.write("<body>");
      out.write("<div class=\"btn-group btn-group-justified\">");
      out.write("<a class=\"btn btn-primary\" href=\"http://localhost:8080/team01/page1/allproduct\">");
      out.write("จัดโปรโมชัน");
      out.write("</a>");
      out.write("<a class=\"btn btn-primary\" href=\"http://localhost:8080/team01/page1/detal\">");
      out.write("เพิ่มโปรโมชัน");
      out.write("</a>");
      out.write("</div>");
      out.write("<h4>");
      out.write("สินค้า");
      out.write("</h4>");
      out.write("<br />");
      out.write("<div align=\"center\" style=\"width: 60%\">");
      out.write("<table class=\"table table-bordered\">");
      out.write("<thead>");
      out.write("<tr>");
      out.write("<th>");
      out.write("ชื่อ");
      out.write("</th>");
      out.write("<th>");
      out.write("ราคา");
      out.write("</th>");
      out.write("<th>");
      out.write("จำนวน");
      out.write("</th>");
      out.write("<th>");
      out.write("ข้อมูล");
      out.write("</th>");
      out.write("<th>");
      out.write("จัดโปรโมชัน");
      out.write("</th>");
      out.write("</tr>");
      out.write("</thead>");
      out.write("<tbody>");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("</tbody>");
      out.write("</table>");
      out.write("</div>");
      out.write("<hr size=\"3\" />");
      out.write("<h4>");
      out.write("โปรโมชันที่มีอยู่");
      out.write("</h4>");
      out.write("<br />");
      out.write("<div align=\"center\" style=\"width: 60%\">");
      out.write("<table class=\"table table-bordered\">");
      out.write("<thead>");
      out.write("<tr>");
      out.write("<th>");
      out.write("สินค้า");
      out.write("</th>");
      out.write("<th>");
      out.write("โปรโมชัน");
      out.write("</th>");
      out.write("<th>");
      out.write("ส่วนลด");
      out.write("</th>");
      out.write("<th>");
      out.write("รายระเอีด");
      out.write("</th>");
      out.write("</tr>");
      out.write("</thead>");
      out.write("<tbody>");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("</tbody>");
      out.write("</table>");
      out.write("</div>");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listproduct}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("pro");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<tr>");
          out.write("<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>");
          out.write("<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>");
          out.write("<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.amount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>");
          out.write("<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.detail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>");
          out.write("<td>");
          out.write("<a href=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("http://localhost:8080/team01/page1/add?pid=${pro.id}&pname=${pro.name}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\">");
          out.write("<button class=\"btn btn-primary\">");
          out.write("จัดโปรโมชัน");
          out.write("</button>");
          out.write("</a>");
          out.write("</td>");
          out.write("</tr>");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listadd}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("pro");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<tr>");
          out.write("<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.product.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>");
          out.write("<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.promotion.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>");
          out.write("<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.promotion.discount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>");
          out.write("<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.promotion.detail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>");
          out.write("</tr>");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
