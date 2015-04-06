package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dpcbj.service.sign.ServiceProcess;

public final class signservice_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>信息管理-性能测试服务系统</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<link href=\"css/inquiry.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script src=\"javascript/jquery-1.3.2.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"tit\">\r\n");
      out.write("\t\t<div class=\"titr\"></div>\r\n");
      out.write("\t\t<div class=\"titl\"></div>\r\n");
      out.write("\t\t&nbsp;&nbsp;欢迎页面\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"wvinfo\">\r\n");
      out.write("\t\t<div class=\"bgl\"></div>\r\n");
      out.write("\t\t<div class=\"bgr\"></div>\r\n");
      out.write("\t\t<div class=\"title\"></div>\r\n");
      out.write("\t\t<div class=\"con\">\r\n");
      out.write("\t\t\t<form>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<!--td width=\"25%\" colspan=\"2\">欢迎使用BOC COM(DLL)中间服务器，提供COM接口压力测试服务。主要应用于证书签名、动态验证码、加密密钥。</td-->\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"2\" cellspacing=\"8\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"right\">调用类型：</td>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"selbg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<select id=\"callkind\" name=\"callkind\" class=\"sel\" TABINDEX=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"A\">签名服务器</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"B\">COM服务器</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</div></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"25%\" align=\"right\">证书主题：</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"55%\" colspan=\"2\"><div class=\"txtbg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"txt\" id=\"certinfo\" TABINDEX=\"1\" style=\"width:98%\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"right\">原文：</td>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\"><div class=\"txtbg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"txt\" id=\"srcstr\" TABINDEX=\"3\" style=\"width:98%\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=right></td>\r\n");
      out.write("\t\t\t\t\t\t<td align=right colspan=\"2\"><input type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"sbtn\" value=\"提交\" TABINDEX=\"20\" onclick=\"doSubmit()\" /></td>\r\n");
      out.write("\t\t\t\t\t\t<td align=right></td>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t<form action=\"ServiceSign\" name=\"subForm\" method=\"POST\" />\r\n");
      out.write("\t\t\t <input type=\"hidden\" name=\"ServiceSign\" value=\"com.dpcbj.service.sign.ServiceProcess.DetachSign\">\r\n");
      out.write("\t\t\t <input type=\"hidden\" name=\"certinfo\" value=\"\" /> \r\n");
      out.write("\t\t\t <input type=\"hidden\" name=\"srcstr\" value=\"\" />\r\n");
      out.write("\t    \t<input type=\"hidden\" name=\"callkind\" value=\"\"/>\t\t\t \r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"prompt\">\r\n");
      out.write("\t\t<div class=\"title\">系统提示:</div>\r\n");
      out.write("\t\t<div class=\"con\">欢迎使用BOC COM(DLL)中间服务器，提供COM接口压力测试服务。主要应用于证书签名、动态验证码、加密密钥。</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("<script src=\"javascript/public.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction doSubmit() {\r\n");
      out.write("\t\tvar certinfo = jQuery.trim($(\"#certinfo\").val());\r\n");
      out.write("\t\tvar calltype = document.getElementById('callkind').value;\r\n");
      out.write("\t\tif (certinfo == \"\" && calltype == \"B\") {\r\n");
      out.write("\t\t\talert(\"请输入证书主题!\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar srcstr = jQuery.trim($(\"#srcstr\").val());\r\n");
      out.write("\t\tif (srcstr == \"\") {\r\n");
      out.write("\t\t\talert(\"请输入原文!\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tdocument.subForm.certinfo.value = certinfo;\r\n");
      out.write("\t\tdocument.subForm.srcstr.value = srcstr;\r\n");
      out.write("\t\tdocument.subForm.callkind.value = calltype;\r\n");
      out.write("\t\tdocument.subForm.submit();\r\n");
      out.write("\t}\r\n");
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
