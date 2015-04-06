package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t<link href=\"css/inquiry.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t\t<script src=\"javascript/jquery-1.3.2.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div class=\"tit\">\r\n");
      out.write("\t\t\t<div class=\"titr\"></div>\r\n");
      out.write("\t\t\t<div class=\"titl\"></div>\r\n");
      out.write("\t\t\t&nbsp;&nbsp;欢迎页面\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"wvinfo\">\r\n");
      out.write("\t\t\t<div class=\"bgl\"></div>\r\n");
      out.write("\t\t\t<div class=\"bgr\"></div>\r\n");
      out.write("\t\t\t<div class=\"title\"></div>\r\n");
      out.write("\t\t\t<div class=\"con\">\r\n");
      out.write("\t\t\t\t尊敬的客户:欢迎使用BOC COM(DLL)中间服务器，提供COM接口压力测试服务。主要应用于证书签名、动态验证码、加密密钥。<br />\r\n");
      out.write("\t\t\t\t<span style=\"color:red\"></span><br />\r\n");
      out.write("\t\t\t</div>\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"prompt\">\r\n");
      out.write("\t\t\t<div class=\"title\">系统提示:</div>\r\n");
      out.write("\t\t\t<div class=\"con\">根据被测系统的需要，请选择相应的菜单。如有疑问，联系电话：18618439642。</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
      out.write("<script src=\"javascript/public.js\" type=\"text/javascript\" charset=\"utf-8\"></script>");
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
