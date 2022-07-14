/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.81
 * Generated at: 2022-07-05 13:15:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP 只允许 GET、POST 或 HEAD。Jasper 还允许 OPTIONS");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <title>用户登录-STD信息服务平台</title>\r\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=EmulateIE11\" >\r\n");
      out.write("  <meta name=\"keywords\" content=\"STD成绩服务平台\" />\r\n");
      out.write("  <meta name=\"description\" content=\"STD成绩服务平台\" />\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"./css/usersys/dean.css\" />\r\n");
      out.write("  <style>\r\n");
      out.write("    .inp {\r\n");
      out.write("      border: 1px solid #cccccc;\r\n");
      out.write("      border-radius: 2px;\r\n");
      out.write("      padding: 0 10px;\r\n");
      out.write("      width: 278px;\r\n");
      out.write("      height: 40px;\r\n");
      out.write("      font-size: 18px;\r\n");
      out.write("    }\r\n");
      out.write("    .btn {\r\n");
      out.write("      border: 1px solid #cccccc;\r\n");
      out.write("      border-radius: 2px;\r\n");
      out.write("      width: 100px;\r\n");
      out.write("      height: 40px;\r\n");
      out.write("      font-size: 16px;\r\n");
      out.write("      color: #666;\r\n");
      out.write("      cursor: pointer;\r\n");
      out.write("      background: white linear-gradient(180deg, #ffffff 0%, #f3f3f3 100%);\r\n");
      out.write("    }\r\n");
      out.write("    .btn:hover {\r\n");
      out.write("      background: white linear-gradient(0deg, #ffffff 0%, #f3f3f3 100%)\r\n");
      out.write("    }\r\n");
      out.write("    #captcha1,\r\n");
      out.write("    #captcha2 {\r\n");
      out.write("      width: 300px;\r\n");
      out.write("      display: inline-block;\r\n");
      out.write("    }\r\n");
      out.write("    .show {\r\n");
      out.write("      display: block;\r\n");
      out.write("    }\r\n");
      out.write("    .hide {\r\n");
      out.write("      display: none;\r\n");
      out.write("    }\r\n");
      out.write("    #notice1,\r\n");
      out.write("    #notice2 {\r\n");
      out.write("      color: red;\r\n");
      out.write("      margin:0px;\r\n");
      out.write("    }\r\n");
      out.write("    label {\r\n");
      out.write("      vertical-align: top;\r\n");
      out.write("      display: inline-block;\r\n");
      out.write("      width: 80px;\r\n");
      out.write("      text-align: right;\r\n");
      out.write("    }\r\n");
      out.write("    #wait1, #wait2 {\r\n");
      out.write("      text-align: left;\r\n");
      out.write("      color: #666;\r\n");
      out.write("      margin: 0;\r\n");
      out.write("    }\r\n");
      out.write("    .phcolor{ color:#999;}\r\n");
      out.write("    .mb10px{margin-bottom: 10px;}\r\n");
      out.write("    .login-btn-sso{width: 100%; height: 38px; line-height: 38px; font-size: 15px; text-align: center; background: #4EB73C; border: 1px solid #4EB73C; border-radius: 5px; color: #fff; cursor: pointer;}\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"loadingDiv\" style=\"display:none\"></div>\r\n");
      out.write("<div class=\"bg-box\">\r\n");
      out.write("  <div class=\"header-box\">\r\n");
      out.write("    <div class=\"main-box clearfix\">\r\n");
      out.write("      <div class=\"left-box\">\r\n");
      out.write("        <a href=\"./index.jsp\">系统首页</a>\r\n");
      out.write("      </div>\r\n");
      out.write("      <ul class=\"right-box\">\r\n");
      out.write("        <li><a href=\"regist.jsp\">用户注册 </a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"login-box\">\r\n");
      out.write("    <div class=\"main-box clearfix\">\r\n");
      out.write("      <div class=\"img-box\">\r\n");
      out.write("        <img src=\"./images/usersys/img/login_title.png\"/>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"login-form\">\r\n");
      out.write("        <form action=\"userServlet\" method=\"post\" id=\"LoginForm\" style=\"width:300px;\">\r\n");
      out.write("          <input type=\"hidden\" name=\"action\" value=\"login\"/>\r\n");
      out.write("          <h4>STD成绩服务</h4>\r\n");
      out.write("          <div class=\"center-box\" >\r\n");
      out.write("             <span style=\"color: red;text-align: center;position:absolute;width: 300px;top: 182px;\">\r\n");
      out.write("               ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty requestScope.msg?\"请输入用户名和密码\":requestScope.msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("             </span>\r\n");
      out.write("            <div class=\"mb10px\">\r\n");
      out.write("              <input type=\"text\" name=\"username\" id=\"username\" class=\"input-box-1\" placeholder=\"学号/工号\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mb10px\">\r\n");
      out.write("              <input type=\"password\" name=\"password\" id=\"password\" class=\"input-box-2\" placeholder=\"输入登录密码\" />\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mb10px\" style=\"height:38px;\" >\r\n");
      out.write("              <input type=\"text\" name=\"ranstring\" id=\"ranstring\"  placeholder=\"输入验证码\" style=\"float:left;width: 150px; height: 38px;  line-height: 38px; [;line-height: 1px;] font-size: 14px; padding-left: 10px; border: 1px solid #bcbcbc; border-radius: 5px; box-sizing: border-box; \" />\r\n");
      out.write("              <span id=\"randomPhoto\" style=\"float:left; height:38px; margin-left:10px;\"><img src=\"kaptcha.jpg\" border=0 height=\"35\" width=\"100\"></span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mb10px\" >\r\n");
      out.write("              <button class=\"login-btn\" type=\"submit\" id=\"submit2\" >登录系统</button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mb20px clearfix\">\r\n");
      out.write("              <div class=\"bar-box\"><span class=\"left-bar\"></span>您还没有账号？<span class=\"left-bar\"></span></div>\r\n");
      out.write("              <input type=\"button\" class=\"regist-btn-login\" value=\"账号注册\" onclick=\"window.location='regist.jsp'\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"btm-box clearfix\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"./script/jquery-3.6.0.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("  $(function (){\r\n");
      out.write("    $(\"#submit2\").click(function () {\r\n");
      out.write("      var username = $(\"#username\").val();\r\n");
      out.write("      var password = $(\"#password\").val();\r\n");
      out.write("      var ranstring = $(\"#ranstring\").val();\r\n");
      out.write("      if (username==\"\"){\r\n");
      out.write("        alert(\"用户名不能为空\");\r\n");
      out.write("        return false;\r\n");
      out.write("      }else{\r\n");
      out.write("        if (password==\"\"){\r\n");
      out.write("          alert(\"密码不能为空\");\r\n");
      out.write("          return false;\r\n");
      out.write("        }else {\r\n");
      out.write("          if(ranstring==\"\"){\r\n");
      out.write("            alert(\"验证码不能为空\");\r\n");
      out.write("            return false;\r\n");
      out.write("          }\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("    })\r\n");
      out.write("  })\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
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
