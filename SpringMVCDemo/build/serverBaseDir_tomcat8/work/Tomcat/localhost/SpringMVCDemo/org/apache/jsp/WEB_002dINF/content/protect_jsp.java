/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-06-16 03:17:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class protect_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.1.7.RELEASE.jar", Long.valueOf(1493178570644L));
    _jspx_dependants.put("jar:file:/C:/Users/Administrator/.gradle/caches/modules-2/files-2.1/org.springframework/spring-webmvc/4.1.7.RELEASE/b6b9f604cb2223251cae67fff7ca2b1d9ff1c2d8/spring-webmvc-4.1.7.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1435628828000L));
    _jspx_dependants.put("jar:file:/C:/Users/Administrator/.gradle/caches/modules-2/files-2.1/javax.servlet/jstl/1.2/74aca283cd4f4b4f3e425f5820cda58f44409547/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1476930139514L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>密保设置</title>\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("    div,span,input{\r\n");
      out.write("     margin:0px;\r\n");
      out.write("     padding:0px;\r\n");
      out.write("    }\r\n");
      out.write("    #zj{\r\n");
      out.write("    \twidth:100%;\r\n");
      out.write("    \theight:600px;\r\n");
      out.write("    \tbackground-image:url(images/001.jpg);   \r\n");
      out.write("    }\r\n");
      out.write("\ta{\r\n");
      out.write("\tcolor:blue;\r\n");
      out.write("\ttext-decoration:none;\r\n");
      out.write("\t}\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div  style=\"height:80px;\">\r\n");
      out.write(" \t <span style=\"font-family:楷体 ;font-size:40px;margin-left:200px;\"><a href=\"index\">噗噗网</a></span>\r\n");
      out.write(" \t <span style=\"font-family:楷体 ;font-size:24px;\">密保设置</span>\r\n");
      out.write("</div>\r\n");
      out.write(" <div id=\"zj\" >\r\n");
      out.write("<div class=\"col-ma-12\">\r\n");
      out.write("<div class=\"col-md-4\"></div>\r\n");
      out.write("<form action=\"protectform\" method=\"post\" class=\"col-md-4\">\r\n");
      out.write("<div >\r\n");
      out.write("  <div class=\"form-group\" >\r\n");
      out.write("    <label for=\"user\">用户名</label>\r\n");
      out.write("    <input name=\"username\"  class=\"form-control\" id=\"user\" placeholder=\"\">\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"form-group\">\r\n");
      out.write("    <label for=\"question\">密保问题</label>\r\n");
      out.write("    <input name=\"question\" type=\"text\" class=\"form-control\" id=\"question\" placeholder=\"请输入20个字符以内的问题\">\r\n");
      out.write("  </div>\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("    <label for=\"answer\">答案</label>\r\n");
      out.write("    <input name=\"answer\" class=\"form-control\" id=\"answer\" placeholder=\"请输入20个字符以内的答案\">\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"form-group\">\r\n");
      out.write("    <label for=\"cue\">提示</label>\r\n");
      out.write("    <input name=\"cue\" class=\"form-control\" id=\"cue\" placeholder=\"提示\">\r\n");
      out.write("  <input type=\"submit\" class=\"form-control\" value=\"确定\" style=\"margin-top:40px;background-color:red;\" />\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("<div class=\"col-md-4\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write(" <script src=\"https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
