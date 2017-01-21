package org.apache.jsp.WEB_002dINF.views.ratthanan;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pshow_005fadmin_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_url_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_url_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_spring_url_var_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("<head>");
      out.write("<title>");
      out.write("xxx");
      out.write("</title>");
      out.write("<script type=\"text/javascript\">");
      out.write("\n");
      out.write("  \n");
      out.write("  function changeStatus(change){\n");
      out.write("    $.ajax({\n");
      out.write("        url: \"changeStatus\",\n");
      out.write("        type: \"GET\",\n");
      out.write("        data: {\n");
      out.write("          change: change.id\n");
      out.write("        },\n");
      out.write("        async: false,\n");
      out.write("        cache: false,\n");
      out.write("        success: function(data){\n");
      out.write("            location.reload()\n");
      out.write("        },\n");
      out.write("        error: function(){\n");
      out.write("            sweetAlert(\"fail\")\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>");
      out.write("<style type=\"text/css\">");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("#full-screen-background-image {\n");
      out.write("  z-index: -999;\n");
      out.write("  min-height: 100%;\n");
      out.write("  min-width: 1024px;\n");
      out.write("  width: 100%;\n");
      out.write("  height: auto;\n");
      out.write("  position: fixed;\n");
      out.write("  top: 0;\n");
      out.write("  left: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#wrapper {\n");
      out.write("  position: relative;\n");
      out.write("  width: 800px;\n");
      out.write("  min-height: 400px;\n");
      out.write("  margin: 100px auto;\n");
      out.write("  color: #333;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button7{\n");
      out.write("\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 5px solid #FFF8DC;\n");
      out.write("    padding: 10px 20px;\n");
      out.write("    color: #fff;\n");
      out.write("-   text-decoration: none;  \n");
      out.write("    font-size: 50px;\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  }\n");
      out.write("  .button7:hover{\n");
      out.write("\n");
      out.write("    background: #fff;\n");
      out.write("    color: #000;\n");
      out.write("  }\n");
      out.write("\n");
      out.write(".demo {\n");
      out.write("  font-family: \"palatino linotype\", palatino, serif;\n");
      out.write("  font-size: 19px;\n");
      out.write("  color: #53FF40;\n");
      out.write("  font-style: italic;\n");
      out.write("  font-weight: bold;\n");
      out.write("  font-variant: normal;\n");
      out.write("  text-align: left;\n");
      out.write("  letter-spacing: 1.2px;\n");
      out.write("  line-height: 20px;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".tb5 {\n");
      out.write("\n");
      out.write("  border:2px solid #eec111;\n");
      out.write("  border-radius:10px;\n");
      out.write("  height: 22px;\n");
      out.write("  width: 230px;\n");
      out.write("  background: #eec111;\n");
      out.write("  color: #123456;\n");
      out.write("  \n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button5 {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    border: none;\n");
      out.write("    color: white;\n");
      out.write("    padding: 10px 20px;\n");
      out.write("    text-align: center;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: inline-block;\n");
      out.write("    font-size: 25px;\n");
      out.write("    margin: 4px 2px;\n");
      out.write("    -webkit-transition-duration: 0.4s; \n");
      out.write("    transition-duration: 0.4s;\n");
      out.write("    cursor: pointer;\n");
      out.write("    border-radius:10px;\n");
      out.write("    width: 150px;\n");
      out.write("    height: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button5:hover{\n");
      out.write("background: black;  \n");
      out.write("color: green;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button55 {\n");
      out.write("    background-color: red; \n");
      out.write("    border: none;\n");
      out.write("    color: white;\n");
      out.write("    padding: 10px 20px;\n");
      out.write("    text-align: center;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: inline-block;\n");
      out.write("    font-size: 25px;\n");
      out.write("    margin: 4px 2px;\n");
      out.write("    -webkit-transition-duration: 0.4s; \n");
      out.write("    transition-duration: 0.4s;\n");
      out.write("    cursor: pointer;\n");
      out.write("    border-radius:10px;\n");
      out.write("     width: 150px;\n");
      out.write("    height: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button55:hover{\n");
      out.write("  background: blue;\n");
      out.write("  color: red;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".m1{\n");
      out.write("  width: 230px;\n");
      out.write("  border-radius:10px;\n");
      out.write("  font-size: 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".m2{\n");
      out.write("\n");
      out.write("background: #eec111;\n");
      out.write("border-radius:20px;\n");
      out.write("width: 500px;\n");
      out.write("height: 100px\n");
      out.write("padding:10px 10px;\n");
      out.write("text-align: center;\n");
      out.write("font-size: 30px;\n");
      out.write("\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("::-webkit-input-placeholder {\n");
      out.write("   color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("table, th, td {\n");
      out.write("    border: 3px solid #8B4513;\n");
      out.write("    border-collapse: collapse;\n");
      out.write("    font-size: 20px;\n");
      out.write("    color: #8B4513;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 5px 7px;\n");
      out.write("    \n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write(".t1{\n");
      out.write("  display: inline-block;\n");
      out.write("  border: 0px solid #FFF8DC;\n");
      out.write("    padding: 10px 20px;\n");
      out.write("    color: #8B4513;\n");
      out.write("-   text-decoration: none;  \n");
      out.write("    font-size: 50px;\n");
      out.write("    border-radius:0px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>");
      out.write("</head>");
      out.write("<body>");
      out.write("<img id=\"full-screen-background-image\" src=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f5}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\" alt=\"full screen background image\" />");
      out.write("<div class=\"t1\">");
      out.write("<b>");
      out.write("PREORDER PRODUCT");
      out.write("</b>");
      out.write("</div>");
      out.write("<br />");
      out.write("<br />");
      out.write("<br />");
      out.write("<table style=\"width:100%\">");
      out.write("<thead>");
      out.write("<tr>");
      out.write("<th>");
      out.write("PreOrder No.");
      out.write("</th>");
      out.write("<th>");
      out.write("UserName.");
      out.write("</th>");
      out.write("<th>");
      out.write("Name.");
      out.write("</th>");
      out.write("<th>");
      out.write("Amount");
      out.write("</th>");
      out.write("<th>");
      out.write("Date");
      out.write("</th>");
      out.write("<th>");
      out.write("Status");
      out.write("</th>");
      out.write("</tr>");
      out.write("</thead>");
      out.write("<tbody id=\"change\">");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("</tbody>");
      out.write("</table>");
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
    _jspx_th_spring_url_0.setVar("f5");
    _jspx_th_spring_url_0.setValue("/resources/images/f5.jpg");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("order");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<tr>");
          out.write("<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>");
          out.write("<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.uname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>");
          out.write("<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>");
          out.write("<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.amount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>");
          out.write("<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.dates}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
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

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.status == false}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<td>");
        out.write("<button onclick=\"changeStatus(this)\" id=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.id}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\" style=\"background: red\">");
        out.write("Confirm");
        out.write("</button>");
        out.write("</td>");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.status == true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<td>");
        out.write("<button style=\"background: green\">");
        out.write("Confirmed");
        out.write("</button>");
        out.write("</td>");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
