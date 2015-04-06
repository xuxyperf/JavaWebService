package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>信息管理-性能测试服务系统</title>\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\t\t<link href=\"css/main.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t\t<script src=\"javascript/jquery-1.3.2.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div class=\"mainDiv\">\r\n");
      out.write("\t\t\t<div class=\"header\">\r\n");
      out.write("\t\t\t\t<div class=\"logo\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"sbar\">\r\n");
      out.write("\t\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" height=\"28\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><img src=\"images/sbl.jpg\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>欢迎您:性能测试团队&nbsp;|&nbsp;<a href=\"javascript:void(0)\" onclick=\"goHome()\">首页</a>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><img src=\"images/sbr.jpg\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"mainbox\">\r\n");
      out.write("\t\t\t\t<div class=\"left\">\r\n");
      out.write("\t\t\t\t\t<div id=\"menu\">\r\n");
      out.write("\t\t\t\t\t\t<ul>  \r\n");
      out.write("\t\t\t\t\t\t\t<h1><div class=\"ic_1\"></div>主菜单</h1>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"javascript:void(0)\" alt=\"SignService\" onclick=\"clickChildMenu(this);\">电子支付证书签名</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"main\">\r\n");
      out.write("\t\t\t    \t<iframe src=\"welcome.jsp\" frameborder=\"0\" id=\"mainFrame\" width=\"780px\" scrolling=\"no\"></iframe>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t<div class=\"footer\">\r\n");
      out.write("\t\t\t\tCopyright&copy;2013&nbsp;&nbsp;性能测试服务系统&nbsp;&nbsp;版权所有</br>\r\n");
      out.write("\t\t\t\t<span style=\"color:rgb(217,217,217);\">Powered by Xuxy</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<form name=\"logoff\" action=\"logoff\"></form>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(\"#menu li a\").mouseover(function(){$(this).addClass(\"on\");});   \r\n");
      out.write("\t$(\"#menu li a\").mouseout(function(){$(this).removeClass(\"on\");});   \r\n");
      out.write("\t$(\"h1\").click(function(){   \r\n");
      out.write("\t\t$(this).next(\"ul\").slideToggle(50).siblings(\"ul\").slideUp(50);\r\n");
      out.write("\t\t$(this).toggleClass(\"on\");\r\n");
      out.write("\t\t$(this).siblings(\"h1\").removeClass(\"on\");\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tfunction clickChildMenu(obj){\r\n");
      out.write("\t\t$(\"#menu a\").each(function(){\r\n");
      out.write("\t\t\t$(this).removeClass(\"visit\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$(obj).addClass(\"visit\");\r\n");
      out.write("\t\t$(\"#mainFrame\").attr(\"src\",\"signservice.jsp\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction goHome(){\r\n");
      out.write("\t\t$(\"#menu a\").each(function(){\r\n");
      out.write("\t\t\t$(this).removeClass(\"visit\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$(\"#mainFrame\").attr(\"src\",\"welcome.jsp\");\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction dologoff(){\r\n");
      out.write("\t\tif(window.confirm(\"确定退出吗?\")){\r\n");
      out.write("\t\t\tdocument.logoff.submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tdocument.oncontextmenu = function () {\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t};\r\n");
      out.write("</script>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
