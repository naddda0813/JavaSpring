/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.76
 * Generated at: 2022-04-13 06:34:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class findPWV_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>비밀번호 찾기</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("	.contents{\n");
      out.write("		position: absolute;\n");
      out.write("		left : 50%;\n");
      out.write("		transform : translate(-50%,0%);\n");
      out.write("		padding: 50px ;\n");
      out.write("	}\n");
      out.write("</style>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("	function noblank(obj) { // 공백사용못하게\n");
      out.write("	    var str_space = /\\s/;  // 공백체크\n");
      out.write("	    if(str_space.exec(obj.value)) { //공백 체크\n");
      out.write("	        /* alert(\"해당 항목에는 공백을 사용할수 없습니다.\\n\\n공백은 자동적으로 제거 됩니다.\"); */\n");
      out.write("	        obj.focus();\n");
      out.write("	        obj.value = obj.value.replace(' ',''); // 공백제거\n");
      out.write("	        return false;\n");
      out.write("	    }\n");
      out.write("	 // onkeyup=\"noblank(this)\" onchange=\"noSpaceForm(this);\"\n");
      out.write("	}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<body bgcolor=\"#FFFAF6\">\n");
      out.write("\n");
      out.write("	<div class=\"contents\">\n");
      out.write("	\n");
      out.write("	<div>\n");
      out.write("		<h1>비밀번호 찾기</h1>\n");
      out.write("	</div>\n");
      out.write("	\n");
      out.write("		<form action=\"findPW.do\" method=\"post\" >\n");
      out.write("			<div>\n");
      out.write("				<div>\n");
      out.write("					<input type=\"text\" name=\"userID\" placeholder=\"아이디를 입력해 주세요\" required=\"required\" size=\"50\"  onkeyup=\"noblank(this)\">\n");
      out.write("				</div>\n");
      out.write("				<div>\n");
      out.write("					<input type=\"text\" name=\"userName\" placeholder=\"이름을 입력해 주세요\" required=\"required\" size=\"50\"  onkeyup=\"noblank(this)\">\n");
      out.write("				</div>\n");
      out.write("				<div>\n");
      out.write("					<input type=\"text\" name=\"userEmail\" placeholder=\"이메일을 입력해 주세요\" required=\"required\" size=\"50\"  onkeyup=\"noblank(this)\">\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<div style=\"float: left;\">\n");
      out.write("					<button onclick=\"window.close()\">닫기</button>\n");
      out.write("			</div>	\n");
      out.write("			<div style=\"float: right;\">\n");
      out.write("				<button type=\"submit\">비밀번호 찾기</button>\n");
      out.write("			</div>\n");
      out.write("		</form>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("</body>\n");
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
