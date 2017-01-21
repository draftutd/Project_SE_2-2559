package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:escapeXml", org.apache.taglibs.standard.functions.Functions.class, "escapeXml", new Class[] {java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_message_code_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_escapeBody_javaScriptEscape;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_url_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_message_var_htmlEscape_code_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_spring_message_code_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_escapeBody_javaScriptEscape = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_url_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_message_var_htmlEscape_code_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_spring_message_code_nobody.release();
    _jspx_tagPool_spring_escapeBody_javaScriptEscape.release();
    _jspx_tagPool_spring_url_var_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_set_var.release();
    _jspx_tagPool_spring_message_var_htmlEscape_code_nobody.release();
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
      if (_jspx_meth_spring_url_2(_jspx_page_context))
        return;
      if (_jspx_meth_spring_url_3(_jspx_page_context))
        return;
      if (_jspx_meth_spring_url_4(_jspx_page_context))
        return;
      if (_jspx_meth_spring_url_5(_jspx_page_context))
        return;
      if (_jspx_meth_spring_url_6(_jspx_page_context))
        return;
      out.write("<html>");
      out.write("<head>");
      out.write("<title>");
      out.write("login");
      out.write("</title>");
      out.write("<style>");
      out.write("\n");
      out.write("  h3, h4 {\n");
      out.write("      margin: 10px 0 30px 0;\n");
      out.write("      letter-spacing: 10px;      \n");
      out.write("      font-size: 20px;\n");
      out.write("      color: #111;\n");
      out.write("  }\n");
      out.write("  .container {\n");
      out.write("      padding: 80px 120px;\n");
      out.write("  }\n");
      out.write("  .person {\n");
      out.write("      border: 10px solid transparent;\n");
      out.write("      margin-bottom: 25px;\n");
      out.write("      width: 80%;\n");
      out.write("      height: 80%;\n");
      out.write("      opacity: 0.7;\n");
      out.write("  }\n");
      out.write("  .person:hover {\n");
      out.write("      border-color: #f1f1f1;\n");
      out.write("  }\n");
      out.write("  .carousel-inner img {\n");
      out.write("     \n");
      out.write("     \n");
      out.write("      width: 100%; /* Set width to 100% */\n");
      out.write("      margin: auto;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .bg-1 {\n");
      out.write("      background: #2d2d30;\n");
      out.write("      color: #bdbdbd;\n");
      out.write("  }\n");
      out.write("  .bg-1 h3 {color: #fff;}\n");
      out.write("  .bg-1 p {font-style: italic;}\n");
      out.write("  .list-group-item:first-child {\n");
      out.write("      border-top-right-radius: 0;\n");
      out.write("      border-top-left-radius: 0;\n");
      out.write("  }\n");
      out.write("  .list-group-item:last-child {\n");
      out.write("      border-bottom-right-radius: 0;\n");
      out.write("      border-bottom-left-radius: 0;\n");
      out.write("  }\n");
      out.write("  .thumbnail {\n");
      out.write("      padding: 0 0 15px 0;\n");
      out.write("      border: none;\n");
      out.write("      border-radius: 0;\n");
      out.write("  }\n");
      out.write("  .thumbnail p {\n");
      out.write("      margin-top: 15px;\n");
      out.write("      color: #555;\n");
      out.write("  }\n");
      out.write("  .btn {\n");
      out.write("      padding: 10px 20px;\n");
      out.write("      background-color: #333;\n");
      out.write("      color: #f1f1f1;\n");
      out.write("      border-radius: 0;\n");
      out.write("      transition: .2s;\n");
      out.write("  }\n");
      out.write("  .btn:hover, .btn:focus {\n");
      out.write("      border: 1px solid #333;\n");
      out.write("      background-color: #fff;\n");
      out.write("      color: #000;\n");
      out.write("  }\n");
      out.write("  .modal-header, h4, .close {\n");
      out.write("      background-color: #333;\n");
      out.write("      color: #fff !important;\n");
      out.write("      text-align: center;\n");
      out.write("      font-size: 30px;\n");
      out.write("  }\n");
      out.write("  .modal-header, .modal-body {\n");
      out.write("      padding: 20px 50px;\n");
      out.write("  }\n");
      out.write("  .nav-tabs li a {\n");
      out.write("      color: #777;\n");
      out.write("  }\n");
      out.write("  .navbar {\n");
      out.write("      font-family: Montserrat, sans-serif;\n");
      out.write("      margin-bottom: 0;\n");
      out.write("      background-color: #2d2d30;\n");
      out.write("      border: 0;\n");
      out.write("      font-size: 11px !important;\n");
      out.write("      letter-spacing: 4px;\n");
      out.write("      opacity: 0.9;\n");
      out.write("  }\n");
      out.write("  .navbar li a, .navbar .navbar-brand { \n");
      out.write("      color: #d5d5d5 !important;\n");
      out.write("  }\n");
      out.write("  .navbar-nav li a:hover {\n");
      out.write("      color: #fff !important;\n");
      out.write("  }\n");
      out.write("  .navbar-nav li.active a {\n");
      out.write("      color: #fff !important;\n");
      out.write("      background-color: #29292c !important;\n");
      out.write("  }\n");
      out.write("  .navbar-default .navbar-toggle {\n");
      out.write("      border-color: transparent;\n");
      out.write("  }\n");
      out.write("  .open .dropdown-toggle {\n");
      out.write("      color: #fff;\n");
      out.write("      background-color: #555 !important;\n");
      out.write("  }\n");
      out.write("  .dropdown-menu li a {\n");
      out.write("      color: #000 !important;\n");
      out.write("  }\n");
      out.write("  .dropdown-menu li a:hover {\n");
      out.write("      background-color: red !important;\n");
      out.write("  }\n");
      out.write("  .form-control {\n");
      out.write("      border-radius: 0;\n");
      out.write("  }\n");
      out.write("  ");
      out.write("</style>");
      out.write("</head>");
      out.write("<body data-offset=\"50\" data-target=\".navbar\" data-spy=\"scroll\" id=\"myPage\">");
      out.write("<nav class=\"navbar navbar-default navbar-fixed-top\">");
      out.write("<div class=\"container-fluid\">");
      out.write("<div class=\"navbar-header\">");
      out.write("<button data-target=\"#myNavbar\" data-toggle=\"collapse\" class=\"navbar-toggle\" type=\"button\">");
      out.write("<span class=\"icon-bar\" />");
      out.write("<span class=\"icon-bar\" />");
      out.write("<span class=\"icon-bar\" />");
      out.write("</button>");
      out.write("<a href=\"#myPage\" class=\"navbar-brand\">");
      out.write("Online Store");
      out.write("</a>");
      out.write("</div>");
      out.write("<div id=\"myNavbar\" class=\"collapse navbar-collapse\">");
      out.write("<ul class=\"nav navbar-nav navbar-right\">");
      out.write("<li>");
      out.write("<a href=\"#myPage\">");
      out.write("HOME");
      out.write("</a>");
      out.write("</li>");
      out.write("<li>");
      out.write("<a href=\"#band\">");
      out.write("ABOUT");
      out.write("</a>");
      out.write("</li>");
      out.write("<li>");
      out.write("<a href=\"#contact\">");
      out.write("CONTACT");
      out.write("</a>");
      out.write("</li>");
      out.write("<li>");
      out.write("<a href=\"http://localhost:8080/team01/user/register\">");
      out.write("REGISTER");
      out.write("</a>");
      out.write("</li>");
      out.write("<li data-target=\"#myModal\" data-toggle=\"modal\">");
      out.write("<a href=\"#\">");
      out.write("LOGIN");
      out.write("</a>");
      out.write("</li>");
      out.write("</ul>");
      out.write("</div>");
      out.write("</div>");
      out.write("</nav>");
      out.write("<div data-ride=\"carousel\" class=\"carousel slide\" id=\"myCarousel\">");
      out.write("<ol class=\"carousel-indicators\">");
      out.write("<li class=\"active\" data-slide-to=\"0\" data-target=\"#myCarousel\" />");
      out.write("<li data-slide-to=\"1\" data-target=\"#myCarousel\" />");
      out.write("<li data-slide-to=\"2\" data-target=\"#myCarousel\" />");
      out.write("<li data-slide-to=\"3\" data-target=\"#myCarousel\" />");
      out.write("<li data-slide-to=\"4\" data-target=\"#myCarousel\" />");
      out.write("<li data-slide-to=\"5\" data-target=\"#myCarousel\" />");
      out.write("<li data-slide-to=\"6\" data-target=\"#myCarousel\" />");
      out.write("</ol>");
      out.write("<div role=\"listbox\" class=\"carousel-inner\">");
      out.write("<div class=\"item active\">");
      out.write("<img height=\"700\" width=\"1200\" alt=\"Online Store\" src=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${login0}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\" />");
      out.write("</div>");
      out.write("<div class=\"item\">");
      out.write("<img height=\"700\" width=\"1200\" alt=\"Chaii\" src=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${login1}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\" />");
      out.write("</div>");
      out.write("<div class=\"item\">");
      out.write("<img height=\"700\" width=\"1200\" alt=\"Noiy\" src=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${login2}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\" />");
      out.write("</div>");
      out.write("<div class=\"item\">");
      out.write("<img height=\"700\" width=\"1200\" alt=\"Fluew\" src=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${login3}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\" />");
      out.write("</div>");
      out.write("<div class=\"item\">");
      out.write("<img height=\"700\" width=\"1200\" alt=\"Amm\" src=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${login4}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\" />");
      out.write("</div>");
      out.write("<div class=\"item\">");
      out.write("<img height=\"700\" width=\"1200\" alt=\"Darw\" src=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${login5}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\" />");
      out.write("</div>");
      out.write("<div class=\"item\">");
      out.write("<img height=\"700\" width=\"1200\" alt=\"Draft\" src=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${login6}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<a data-slide=\"prev\" role=\"button\" href=\"#myCarousel\" class=\"left carousel-control\">");
      out.write("<span aria-hidden=\"true\" class=\"glyphicon glyphicon-chevron-left\" />");
      out.write("<span class=\"sr-only\">");
      out.write("Previous");
      out.write("</span>");
      out.write("</a>");
      out.write("<a data-slide=\"next\" role=\"button\" href=\"#myCarousel\" class=\"right carousel-control\">");
      out.write("<span aria-hidden=\"true\" class=\"glyphicon glyphicon-chevron-right\" />");
      out.write("<span class=\"sr-only\">");
      out.write("Next");
      out.write("</span>");
      out.write("</a>");
      out.write("</div>");
      out.write("<div class=\"container text-center\" id=\"band\">");
      out.write("<h3>");
      out.write("ABOUT OF ME");
      out.write("</h3>");
      out.write("<p>");
      out.write("<em>");
      out.write("Online store!");
      out.write("</em>");
      out.write("</p>");
      out.write("<p>");
      out.write("ในปัจจุบันคนเราเริ่ม ซื้อของออนไลน์ มากขึ้น เนื่องจากการเปลี่ยนแปลงพฤติกรรมในสังคม จากอดีตที่ต้องเดินออกจากบ้านเพื่อไปหาซื้อของเข้าบ้าน ก็เปลี่ยนเป็นใช้นิ้วจิ้มคอมพิวเตอร์ไม่กี่ครั้ง หรือ ใช้นิ้วจิ้มมือถือไม่กี่ทีก็สามารถซื้อของที่ต้องการได้แล้ว จากความสะดวกสบายที่เพิ่มขึ้น จึงเป็นเหตุผลสนับสนุนได้ว่า ทำไมปัจจุบันคนจึงหันมา “ซื้อของออนไลน์”\n");
      out.write("        แน่นอนว่าการใช้นิ้วไปสัมผัสหน้าจอไม่กี่ครั้ง และรอเพียงไม่นานของก็มาอยู่ในบ้านแล้ว เหนื่อยก็ไม่เหนื่อย เมื่อยก็ไม่เมื่อย แถมยังประหยัดเวลา ซึ่งใครๆก็ต้องการที่จะประหยัดเวลาของตัวเอง และในการซื้อของออนไลน์ มีตัวเลือกมากมายให้ลูกค้าได้เลือกซื้อ สมมุติร้านค้าออนไลน์เอไม่มีสินค้าที่ผู้ซื้อต้องการ ผู้ซื้อก็สามารถไปเลือกซื้อสินค้าที่ร้านค้าออนไลน์บี ร้านค้าออนไลน์ซี ได้อย่างง่ายดาย เพราะในชีวิตจริงหากจะให้ผู้ซื้อไปเดินห้างสิบห้างพร้อมกัน เพื่อค้นหาสินค้าที่ต้องการ พร้อมสำรวจราคาที่ถูกที่สุด ก็คงจะลำบากเกินไป แต่ที่ร้านค้าออนไลน์เพียงแค่อยู่กับที่ก็มีรายละเอียดบอกไว้ทุกอย่าง ผู้ซื้อจึงสามารถเปรียบเทียบคุณสมบัติและราคาแต่ละร้านได้อย่างง่ายดาย \n");
      out.write("        ด้วยเหตุผลทั้งหมดที่กล่าวมานี้ ทำให้ผู้ซื้อมีความสะดวกสบายในการซื้อสินค้าบนโลกออนไลน์มากขึ้น แต่การที่ผู้ซื้อจะสามารถเลือกซื้อ และเปรียบเทียบราคาสินค้าได้อย่างง่ายดายแบบนี้ ในฐานะเจ้าของร้านค้าออนไลน์ อาจต้องทำการสำรวจราคาสินค้าในท้องตลาด มีการอัพเดทสินค้าให้มีรายละเอียดของสินค้า และความน่าสนใจอยู่เสมอ หรืออาจสร้างความแตกต่างให้กับสินค้าของตนเอง เพียงเท่านี้การขายสินค้าในร้านค้าออนไลน์ของท่านก็เป็นไปอย่างง่ายดาย");
      out.write("</p>");
      out.write("<br />");
      out.write("</div>");
      out.write("<div class=\"bg-1\" id=\"contact\">");
      out.write("<div class=\"container\">");
      out.write("<h3 class=\"text-center\">");
      out.write("Contact");
      out.write("</h3>");
      out.write("<div align=\"center\" class=\"row\">");
      out.write("<p>");
      out.write("<span class=\"glyphicon glyphicon-map-marker\" />");
      out.write(" Thailand, TH");
      out.write("</p>");
      out.write("<p>");
      out.write("<span class=\"glyphicon glyphicon-phone\" />");
      out.write(" Phone: +66 846850845");
      out.write("</p>");
      out.write("<p>");
      out.write("<span class=\"glyphicon glyphicon-envelope\" />");
      out.write(" Email: kachan_noi@hotmail.com");
      out.write("</p>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div aria-labelledby=\"myModalLabel\" role=\"dialog\" tabindex=\"-1\" id=\"myModal\" class=\"modal fade\">");
      out.write("<div role=\"document\" class=\"modal-dialog\">");
      out.write("<div class=\"modal-content\">");
      out.write("<div class=\"modal-header\">");
      out.write("<button aria-label=\"Close\" data-dismiss=\"modal\" class=\"close\" type=\"button\">");
      out.write("<span aria-hidden=\"true\">");
      out.write("&times;");
      out.write("</span>");
      out.write("</button>");
      out.write("<h4 id=\"myModalLabel\" class=\"modal-title\">");
      out.write("LOGIN");
      out.write("</h4>");
      out.write("</div>");
      out.write("<div class=\"modal-body\">");
      out.write("<table align=\"center\">");
      out.write("<tr>");
      out.write("<td width=\"400\">");
      out.write("<div align=\"center\" style=\"width: 100%\" class=\"panel panel-default\">");
      out.write("<div class=\"panel-heading\">");
      out.write("เข้าสู่ระบบ");
      out.write("</div>");
      out.write("<div class=\"panel-body\">");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      if (_jspx_meth_spring_url_7(_jspx_page_context))
        return;
      out.write("<form method=\"POST\" action=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:escapeXml(form_url)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0) + "\" name=\"f\">");
      out.write("<div>");
      out.write("<label for=\"j_username\">");
      if (_jspx_meth_spring_message_0(_jspx_page_context))
        return;
      out.write("</label>");
      out.write("<input class=\"form-control\" style=\"width:250px\" name=\"j_username\" type=\"text\" id=\"j_username\" />");
      if (_jspx_meth_spring_message_1(_jspx_page_context))
        return;
      out.write("<script type=\"text/javascript\">");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t          Spring.addDecoration(new Spring.ElementDecoration({elementId : \"j_username\", widgetAttrs : {promptMessage: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sec_name_msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\", required : true}})); \n");
      out.write("\t\t\t\t        ");
      out.write("</script>");
      out.write("</div>");
      out.write("<br />");
      out.write("<div>");
      out.write("<label for=\"j_password\">");
      if (_jspx_meth_spring_message_2(_jspx_page_context))
        return;
      out.write("</label>");
      out.write("<input class=\"form-control\" style=\"width:250px\" name=\"j_password\" type=\"password\" id=\"j_password\" />");
      if (_jspx_meth_spring_message_3(_jspx_page_context))
        return;
      out.write("<script type=\"text/javascript\">");
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t          Spring.addDecoration(new Spring.ElementDecoration({elementId : \"j_password\", widgetAttrs : {promptMessage: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sec_pwd_msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\", required : true}})); \n");
      out.write("\t\t\t\t        ");
      out.write("</script>");
      out.write("</div>");
      out.write("<br />");
      out.write("<div class=\"submit\">");
      out.write("<script type=\"text/javascript\">");
      out.write("Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'proceed', event:'onclick'}));");
      out.write("</script>");
      if (_jspx_meth_spring_message_4(_jspx_page_context))
        return;
      out.write("<input style=\"width: 100%\" class=\"btn btn-default\" value=\"Sign In\" type=\"submit\" id=\"proceed\" />");
      out.write("</div>");
      out.write("</form>");
      out.write("</div>");
      out.write("</div>");
      out.write("</td>");
      out.write("</tr>");
      out.write("</table>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
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

  private boolean _jspx_meth_spring_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_0 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_var_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_0.setParent(null);
    _jspx_th_spring_url_0.setVar("login0");
    _jspx_th_spring_url_0.setValue("/resources/images/noline.jpg");
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
    _jspx_th_spring_url_1.setVar("login1");
    _jspx_th_spring_url_1.setValue("/resources/images/chaibg.jpg");
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

  private boolean _jspx_meth_spring_url_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_2 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_var_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_2.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_2.setParent(null);
    _jspx_th_spring_url_2.setVar("login2");
    _jspx_th_spring_url_2.setValue("/resources/images/noiybg.jpg");
    int[] _jspx_push_body_count_spring_url_2 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_2 = _jspx_th_spring_url_2.doStartTag();
      if (_jspx_th_spring_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_2.doFinally();
      _jspx_tagPool_spring_url_var_value_nobody.reuse(_jspx_th_spring_url_2);
    }
    return false;
  }

  private boolean _jspx_meth_spring_url_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_3 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_var_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_3.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_3.setParent(null);
    _jspx_th_spring_url_3.setVar("login3");
    _jspx_th_spring_url_3.setValue("/resources/images/fluwebg.jpg");
    int[] _jspx_push_body_count_spring_url_3 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_3 = _jspx_th_spring_url_3.doStartTag();
      if (_jspx_th_spring_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_3.doFinally();
      _jspx_tagPool_spring_url_var_value_nobody.reuse(_jspx_th_spring_url_3);
    }
    return false;
  }

  private boolean _jspx_meth_spring_url_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_4 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_var_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_4.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_4.setParent(null);
    _jspx_th_spring_url_4.setVar("login4");
    _jspx_th_spring_url_4.setValue("/resources/images/ammbg.jpg");
    int[] _jspx_push_body_count_spring_url_4 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_4 = _jspx_th_spring_url_4.doStartTag();
      if (_jspx_th_spring_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_4.doFinally();
      _jspx_tagPool_spring_url_var_value_nobody.reuse(_jspx_th_spring_url_4);
    }
    return false;
  }

  private boolean _jspx_meth_spring_url_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_5 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_var_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_5.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_5.setParent(null);
    _jspx_th_spring_url_5.setVar("login5");
    _jspx_th_spring_url_5.setValue("/resources/images/darwbg.jpg");
    int[] _jspx_push_body_count_spring_url_5 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_5 = _jspx_th_spring_url_5.doStartTag();
      if (_jspx_th_spring_url_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_5.doFinally();
      _jspx_tagPool_spring_url_var_value_nobody.reuse(_jspx_th_spring_url_5);
    }
    return false;
  }

  private boolean _jspx_meth_spring_url_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_6 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_var_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_6.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_6.setParent(null);
    _jspx_th_spring_url_6.setVar("login6");
    _jspx_th_spring_url_6.setValue("/resources/images/draftbg1.jpg");
    int[] _jspx_push_body_count_spring_url_6 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_6 = _jspx_th_spring_url_6.doStartTag();
      if (_jspx_th_spring_url_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_6.doFinally();
      _jspx_tagPool_spring_url_var_value_nobody.reuse(_jspx_th_spring_url_6);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty param.login_error}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<div class=\"errors\">");
        out.write("<p>");
        out.write("\n");
        out.write("\t\t\t\t         Username และ  Password ไม่ถูกต้อง !!!\n");
        out.write("\t\t\t\t        ");
        out.write("</p>");
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

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty param.login_error}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<div class=\"errors\">");
        out.write("<p>");
        out.write("\n");
        out.write("\t\t\t\t         \tกรุณาเข้าสู่ระบบก่อนเข้าใช้บริการ \n");
        out.write("\t\t\t\t        ");
        out.write("</p>");
        out.write("</div>");
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

  private boolean _jspx_meth_spring_url_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_7 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_var_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_7.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_7.setParent(null);
    _jspx_th_spring_url_7.setVar("form_url");
    _jspx_th_spring_url_7.setValue("/resources/j_spring_security_check");
    int[] _jspx_push_body_count_spring_url_7 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_7 = _jspx_th_spring_url_7.doStartTag();
      if (_jspx_th_spring_url_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_7.doFinally();
      _jspx_tagPool_spring_url_var_value_nobody.reuse(_jspx_th_spring_url_7);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_0 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_0.setParent(null);
    _jspx_th_spring_message_0.setCode("security_login_form_name");
    int[] _jspx_push_body_count_spring_message_0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_0 = _jspx_th_spring_message_0.doStartTag();
      if (_jspx_th_spring_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_0.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_1 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_var_htmlEscape_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_1.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_1.setParent(null);
    _jspx_th_spring_message_1.setHtmlEscape("false");
    _jspx_th_spring_message_1.setVar("name_msg");
    _jspx_th_spring_message_1.setCode("security_login_form_name_message");
    int[] _jspx_push_body_count_spring_message_1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_1 = _jspx_th_spring_message_1.doStartTag();
      if (_jspx_th_spring_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_1.doFinally();
      _jspx_tagPool_spring_message_var_htmlEscape_code_nobody.reuse(_jspx_th_spring_message_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("sec_name_msg");
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_set_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_set_0.doInitBody();
      }
      do {
        if (_jspx_meth_spring_escapeBody_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_set_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_set_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_spring_escapeBody_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_set_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:escapeBody
    org.springframework.web.servlet.tags.EscapeBodyTag _jspx_th_spring_escapeBody_0 = (org.springframework.web.servlet.tags.EscapeBodyTag) _jspx_tagPool_spring_escapeBody_javaScriptEscape.get(org.springframework.web.servlet.tags.EscapeBodyTag.class);
    _jspx_th_spring_escapeBody_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_escapeBody_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_set_0);
    _jspx_th_spring_escapeBody_0.setJavaScriptEscape("true");
    int[] _jspx_push_body_count_spring_escapeBody_0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_escapeBody_0 = _jspx_th_spring_escapeBody_0.doStartTag();
      if (_jspx_eval_spring_escapeBody_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_spring_escapeBody_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_spring_escapeBody_0[0]++;
          _jspx_th_spring_escapeBody_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_spring_escapeBody_0.doInitBody();
        }
        do {
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name_msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          int evalDoAfterBody = _jspx_th_spring_escapeBody_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_spring_escapeBody_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_spring_escapeBody_0[0]--;
      }
      if (_jspx_th_spring_escapeBody_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_escapeBody_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_escapeBody_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_escapeBody_0.doFinally();
      _jspx_tagPool_spring_escapeBody_javaScriptEscape.reuse(_jspx_th_spring_escapeBody_0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_2 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_2.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_2.setParent(null);
    _jspx_th_spring_message_2.setCode("security_login_form_password");
    int[] _jspx_push_body_count_spring_message_2 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_2 = _jspx_th_spring_message_2.doStartTag();
      if (_jspx_th_spring_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_2.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_2);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_3 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_var_htmlEscape_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_3.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_3.setParent(null);
    _jspx_th_spring_message_3.setHtmlEscape("false");
    _jspx_th_spring_message_3.setVar("pwd_msg");
    _jspx_th_spring_message_3.setCode("security_login_form_password_message");
    int[] _jspx_push_body_count_spring_message_3 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_3 = _jspx_th_spring_message_3.doStartTag();
      if (_jspx_th_spring_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_3.doFinally();
      _jspx_tagPool_spring_message_var_htmlEscape_code_nobody.reuse(_jspx_th_spring_message_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("sec_pwd_msg");
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_eval_c_set_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_set_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_set_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_set_1.doInitBody();
      }
      do {
        if (_jspx_meth_spring_escapeBody_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_set_1, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_set_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_set_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_spring_escapeBody_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_set_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:escapeBody
    org.springframework.web.servlet.tags.EscapeBodyTag _jspx_th_spring_escapeBody_1 = (org.springframework.web.servlet.tags.EscapeBodyTag) _jspx_tagPool_spring_escapeBody_javaScriptEscape.get(org.springframework.web.servlet.tags.EscapeBodyTag.class);
    _jspx_th_spring_escapeBody_1.setPageContext(_jspx_page_context);
    _jspx_th_spring_escapeBody_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_set_1);
    _jspx_th_spring_escapeBody_1.setJavaScriptEscape("true");
    int[] _jspx_push_body_count_spring_escapeBody_1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_escapeBody_1 = _jspx_th_spring_escapeBody_1.doStartTag();
      if (_jspx_eval_spring_escapeBody_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_spring_escapeBody_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_spring_escapeBody_1[0]++;
          _jspx_th_spring_escapeBody_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_spring_escapeBody_1.doInitBody();
        }
        do {
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pwd_msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          int evalDoAfterBody = _jspx_th_spring_escapeBody_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_spring_escapeBody_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_spring_escapeBody_1[0]--;
      }
      if (_jspx_th_spring_escapeBody_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_escapeBody_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_escapeBody_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_escapeBody_1.doFinally();
      _jspx_tagPool_spring_escapeBody_javaScriptEscape.reuse(_jspx_th_spring_escapeBody_1);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_4 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_var_htmlEscape_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_4.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_4.setParent(null);
    _jspx_th_spring_message_4.setHtmlEscape("false");
    _jspx_th_spring_message_4.setVar("submit_label");
    _jspx_th_spring_message_4.setCode("button_submit");
    int[] _jspx_push_body_count_spring_message_4 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_4 = _jspx_th_spring_message_4.doStartTag();
      if (_jspx_th_spring_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_4.doFinally();
      _jspx_tagPool_spring_message_var_htmlEscape_code_nobody.reuse(_jspx_th_spring_message_4);
    }
    return false;
  }
}
