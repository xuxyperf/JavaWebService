package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.dpcbj.service.sign.ServiceProcess;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	session.setMaxInactiveInterval(15 * 60);			

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("<title>BocDetachSign</title>\r\n");
      out.write("<script src=\"javascript/jquery-1.3.2.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("</head>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".tabCon.sbtn {\r\n");
      out.write("\tborder: 2 none;\r\n");
      out.write("\twidth: 108px;\r\n");
      out.write("\theight: 25px;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"tabCon\" style=\"display:block;\">\r\n");
      out.write("\t\t<form>\r\n");
      out.write("\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"2\" cellspacing=\"8\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"25%\" align=\"right\">证书主题：</td>\r\n");
      out.write("\t\t\t\t\t<td width=\"75%\" colspan=\"2\"><div class=\"txtbg\">\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"txt\" id=\"certinfo\" TABINDEX=\"1\" style=\"width:55%\"/>\r\n");
      out.write("\t\t\t\t\t\t</div></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td align=\"right\">原文：</td>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\"><div class=\"txtbg\">\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"txt\" id=\"srcstr\" TABINDEX=\"3\" style=\"width:55%\"/>\r\n");
      out.write("\t\t\t\t\t\t</div></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t    <td align=\"right\" colspan=\"2\"><input type=\"button\" class=\"sbtn\" value=\"提交\" TABINDEX=\"20\" onclick=\"doSubmit()\" /></td>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<form action=\"ServiceSign\" name=\"subForm\" method=\"POST\"/>\r\n");
      out.write("\t    \t<input type=\"hidden\" name=\"ServiceSign\" value=\"com.dpcbj.service.sign.ServiceProcess.DetachSign\">\r\n");
      out.write("\t    \t<input type=\"hidden\" name=\"certinfo\" value=\"\"/>\r\n");
      out.write("\t    \t<input type=\"hidden\" name=\"srcstr\" value=\"\"/>    \t\r\n");
      out.write("\t    </form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction doSubmit(){\r\n");
      out.write("\t\tvar certinfo = jQuery.trim($(\"#certinfo\").val());\r\n");
      out.write("\t\tif(certinfo == \"\"){\r\n");
      out.write("\t\t\talert(\"请输入证书主题!\");\r\n");
      out.write("\t\t\treturn;\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar srcstr = jQuery.trim($(\"#srcstr\").val());\r\n");
      out.write("\t\tif(srcstr == \"\"){\r\n");
      out.write("\t\t\talert(\"请输入原文!\");\r\n");
      out.write("\t\t\treturn;\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tdocument.subForm.certinfo.value = certinfo;\r\n");
      out.write("\t\tdocument.subForm.srcstr.value = srcstr;\r\n");
      out.write("\t\tdocument.subForm.submit();\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
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
