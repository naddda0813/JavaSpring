/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.76
 * Generated at: 2022-03-23 07:41:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class AddressBook_005f05_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
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

      out.write('\n');
      out.write('\n');

	request.setCharacterEncoding("utf-8");
	
	String name = request.getParameter("name"); // 수정한 내용 받아오기
	String tel = request.getParameter("tel");
	String address = request.getParameter("address");
	String email = request.getParameter("email");
	String relation = request.getParameter("relation");

	session.setAttribute("NewName", name);	// 수정한 내용 저장
	session.setAttribute("NewTel", tel);	
	session.setAttribute("NewAddress", address);	
	session.setAttribute("NewEmail", email);	
	session.setAttribute("NewRelation", relation);	

	String url_mysql = "jdbc:mysql://192.168.150.230:3306/AddressBook?serverTimezone=Asia/Seoul&characterEncoding=utf8&useSSL=false";
	String id_mysql = "root";
	String pw_mysql =  "qwer1234";

	PreparedStatement ps = null; // values 뒤에 ?를 해석해준다 
	
	int seq = (int)session.getAttribute("SEQ"); // session 값은 object여서 string으로 선언해줌
	String newName = (String)session.getAttribute("NewName"); // session 값은 object여서 string으로 선언해줌
	String newTel = (String)session.getAttribute("NewTel"); // session 값은 object여서 string으로 선언해줌
	String newAddress = (String)session.getAttribute("NewAddress"); // session 값은 object여서 string으로 선언해줌
	String newEmail = (String)session.getAttribute("NewEmail"); // session 값은 object여서 string으로 선언해줌
	String newRelation = (String)session.getAttribute("NewRelation"); // session 값은 object여서 string으로 선언해줌
			
	try{
		Class.forName("com.mysql.cj.jdbc.Driver"); // 아까 lib로 옮겨줬던 mysql jar파일 경로
		Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql); // java.sql로 선택해야함. sql과 연결
		Statement stmt_mysql = conn_mysql.createStatement();

		String A = "update addressinfo set name = ?, tel = ?, address = ?, email =?, relation =? where seq = ?"; // SQL에서 쓰는 문장 그대로!
		
		ps = conn_mysql.prepareStatement(A);
		ps.setString(1, newName); // ? 순서대로
		ps.setString(2, newTel); 
		ps.setString(3, newAddress); 
		ps.setString(4, newEmail); 
		ps.setString(5, newRelation); 
		ps.setInt(6, seq); 
		ps.executeUpdate();
		
		conn_mysql.close(); // DB연결 끊어준다. 서버 접속 인원제한이 있기 때문에 끊어주지 않으면 몇번 클릭하면 서버에 접속할 수 없게 된다 
		
	}catch(Exception e){
		e.printStackTrace();
	}
	
	session.invalidate();
	response.sendRedirect("AddressBook_01.jsp");
	
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
