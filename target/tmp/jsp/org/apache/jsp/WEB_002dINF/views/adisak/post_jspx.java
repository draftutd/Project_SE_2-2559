package org.apache.jsp.WEB_002dINF.views.adisak;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class post_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_url_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_url_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      if (_jspx_meth_spring_url_1(_jspx_page_context))
        return;
      out.write("<html>");
      out.write("<head>");
      out.write("<style>");
      out.write("\n");
      out.write(".button {\n");
      out.write("    position: relative;\n");
      out.write("    background-color: #c1ff80;\n");
      out.write("    border: none;\n");
      out.write("    font-size: 15px;\n");
      out.write("    color: #FFFFFF;\n");
      out.write("    padding: 5%;\n");
      out.write("    width: 100%;\n");
      out.write("    text-align: center;\n");
      out.write("    -webkit-transition-duration: 0.4s; /* Safari */\n");
      out.write("    transition-duration: 0.4s;\n");
      out.write("    text-decoration: none;\n");
      out.write("    overflow: hidden;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button:after {\n");
      out.write("    content: \"\";\n");
      out.write("    background: #ceff99;\n");
      out.write("    display: block;\n");
      out.write("    position: absolute;\n");
      out.write("    padding-top: 300%;\n");
      out.write("    padding-left: 350%;\n");
      out.write("    margin-left: -20px!important;\n");
      out.write("    margin-top: -120%;\n");
      out.write("    opacity: 0;\n");
      out.write("    transition: all 0.8s\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button:active:after {\n");
      out.write("    padding: 0;\n");
      out.write("    margin: 0;\n");
      out.write("    opacity: 1;\n");
      out.write("    transition: 0s\n");
      out.write("}\n");
      out.write("</style>");
      out.write("</head>");
      out.write("<style type=\"text/css\">");
      out.write("\n");
      out.write("  \n");
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
      out.write("</style>");
      out.write("<body>");
      out.write("<img id=\"full-screen-background-image\" src=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${moneytree}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\" alt=\"full screen background image\" />");
      out.write("<div role=\"alert\" class=\"alert alert-warning\">");
      out.write("<table>");
      out.write("<tr>");
      out.write("<td>");
      out.write("<font size=\"5\">");
      out.write("<img style=\"width:60px;height:50px;\" alt=\"Mountain View\" src=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pen}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\" />");
      out.write(" สอบถาม ข้อเสนอแนะ อื่นๆ เกี่ยวกับการบริการของร้าน \n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t");
      out.write("</font>");
      out.write("<br />");
      out.write("<font size=\"3\">");
      out.write("<span style=\"margin-left:3em\">");
      out.write("ทุกความคิดเห็น จะเป็นส่วนหนึ่งในการพัฒนา เพื่อปรับปรุงการบริการที่ดีขึ้น ขอบคุณครับ");
      out.write("</span>");
      out.write("</font>");
      out.write("</td>");
      out.write("</tr>");
      out.write("</table>");
      out.write("</div>");
      out.write("<div>");
      out.write("<div class=\"container\">");
      out.write("<div align=\"right\">");
      out.write("<button data-target=\"#myModal\" data-toggle=\"modal\" class=\"btn btn-info btn-lg\" type=\"button\">");
      out.write("+New Post");
      out.write("</button>");
      out.write("</div>");
      out.write("<div align=\"left\" role=\"dialog\" id=\"myModal\" class=\"modal fade\">");
      out.write("<div class=\"modal-dialog\">");
      out.write("<div class=\"modal-content\">");
      out.write("<div class=\"modal-header\">");
      out.write("<button data-dismiss=\"modal\" class=\"close\" type=\"button\">");
      out.write("&times;");
      out.write("</button>");
      out.write("<h4 class=\"modal-title\">");
      out.write("Create Post");
      out.write("</h4>");
      out.write("</div>");
      out.write("<div class=\"modal-body\">");
      out.write("<textarea id=\"posttext\" rows=\"5\" class=\"form-control\">");
      out.write("...");
      out.write("</textarea>");
      out.write("</div>");
      out.write("<div class=\"modal-footer\">");
      out.write("<button onclick=\"createpost()\" data-dismiss=\"modal\" class=\"btn btn-default\" type=\"button\">");
      out.write("Post");
      out.write("</button>");
      out.write("<button data-dismiss=\"modal\" class=\"btn btn-default\" type=\"button\">");
      out.write("Close");
      out.write("</button>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("<br />");
      out.write("<div align=\"left\" id=\"accordion\" class=\"panel-group\">");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("</div>");
      out.write("</div>");
      out.write("<script type=\"text/javascript\">");
      out.write("\n");
      out.write("\t    function createpost() {\n");
      out.write("\t        var posttext = $('#posttext').val();\n");
      out.write("\t        $.ajax({\n");
      out.write("\t            url: \"createPost\",\n");
      out.write("\t            type: \"GET\",\n");
      out.write("\t            data:{\n");
      out.write("\t            \tposttext : posttext\n");
      out.write("\t            },\n");
      out.write("\t            async: false,\n");
      out.write("\t            cache: false,\n");
      out.write("\t            success: function(){\n");
      out.write("\t            \tlocation.reload()\n");
      out.write("\t            },\n");
      out.write("\t            error: function(){\n");
      out.write("\t            \talert(\"fail\")\n");
      out.write("\t            }\n");
      out.write("\t        });\n");
      out.write("\t    }\n");
      out.write("\t    function commentPost(idPost,comment){\n");
      out.write("\t        $.ajax({\n");
      out.write("\t            url: \"commentPost\",\n");
      out.write("\t            type: \"GET\",\n");
      out.write("\t            data: {\n");
      out.write("\t            \tidPost: idPost.id,\n");
      out.write("\t            \tcomment: comment\n");
      out.write("\t            },\n");
      out.write("\t            async: false,\n");
      out.write("\t            cache: false,\n");
      out.write("\t            success: function(){\n");
      out.write("\t                location.reload()\n");
      out.write("\t            },\n");
      out.write("\t            error: function(){\n");
      out.write("\t            \talert(\"fail\")\n");
      out.write("\t            }\n");
      out.write("\t        });\n");
      out.write("\t    }\n");
      out.write("\t");
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
    _jspx_th_spring_url_0.setVar("moneytree");
    _jspx_th_spring_url_0.setValue("/resources/images/gbg.jpg");
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

  private boolean _jspx_meth_spring_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_1 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_var_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_1.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_1.setParent(null);
    _jspx_th_spring_url_1.setVar("pen");
    _jspx_th_spring_url_1.setValue("/resources/images/pen01.png");
    int[] _jspx_push_body_count_spring_url_1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_1 = _jspx_th_spring_url_1.doStartTag();
      if (_jspx_th_spring_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_1.doFinally();
      _jspx_tagPool_spring_url_var_value_nobody.reuse(_jspx_th_spring_url_1);
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listpost}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("post");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<div class=\"panel panel-success\">");
          out.write("<div class=\"panel-heading\">");
          out.write("<h4 class=\"panel-title\">");
          if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("<a href=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${collapse}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\" data-parent=\"#accordion\" data-toggle=\"collapse\">");
          out.write("\n");
          out.write("       \t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.users}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" : ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.text}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("       \t");
          out.write("</a>");
          out.write("</h4>");
          out.write("</div>");
          out.write("<div class=\"panel-collapse collapse in\" id=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.id}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\">");
          out.write("<div align=\"right\" class=\"panel-body\">");
          if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</div>");
          out.write("<div align=\"right\" class=\"panel-body\">");
          out.write("<table style=\"width: 95%\" border=\"0\">");
          out.write("<tr>");
          out.write("<td style=\"width: 80%\">");
          if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("<input style=\"width: 100%\" placeholder=\"comment\" name=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${comment}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\" id=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${comment}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\" class=\"form-control\" type=\"text\" />");
          out.write("</td>");
          out.write("<td>");
          if (_jspx_meth_c_set_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("<button onclick=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("commentPost(this,$('${commented}').val())", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\" class=\"btn btn-info\" id=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.id}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\" style=\"width:100px;height:33px;\">");
          out.write("<b>");
          out.write("comment");
          out.write("</b>");
          out.write("</button>");
          out.write("</td>");
          out.write("</tr>");
          out.write("</table>");
          out.write("</div>");
          out.write("</div>");
          out.write("</div>");
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

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${'#'}${post.id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_0.setVar("collapse");
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listcomment}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("comment");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
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

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${comment.post.id == post.id}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<div align=\"left\" style=\"width:95%\" class=\"alert alert-info\">");
        out.write("<strong>");
        out.write(' ');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${comment.users}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(' ');
        out.write(':');
        out.write("</strong>");
        out.write(' ');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${comment.text}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("  \t\t\t");
        out.write("</div>");
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

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${'c'}${post.id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_1.setVar("comment");
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_set_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${'#'}${comment}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_2.setVar("commented");
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }
}
