/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.76
 * Generated at: 2022-03-23 03:03:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class purchaseSelect_005f01_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>고객 명단 리스트 </title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	<h3>고객 명단 리스트</h3>\n");
 
	String url_mysql = "jdbc:mysql://localhost:3306/eclipse?serverTimezone=Asia/Seoul&characterEncoding=utf8&useSSL=false";
	String id_mysql = "root";
	String pw_mysql =  "qwer1234";
		
	String query = "select userid,name,tel,address,insertdate from wtest" ;// 칼럼명이 전부 들어갈때는 * 로 적어주기 
	// query : prepared를 안쓰는 방법
	int count = 0 ;  //카운트변수 초기화 
	
	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver"); // 아까 lib로 옮겨줬던 mysql jar파일 경로
		Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql); // java.sql로 선택해야함. sql과 연결
		Statement stmt_mysql = conn_mysql.createStatement();

		//****
		ResultSet rs = stmt_mysql.executeQuery(query); // DB에서 테이블 준비만 해둔 상태. 자바로 가져와야 한다. rs를 통해 가져온다

      out.write("	\n");
      out.write("		<table border=\"1\">   ");
      out.write("\n");
      out.write("		<tr>\n");
      out.write("				<th>UserID</th><th>이름</th><th>전화번호</th><th>주소</th><th>입력일자</th>  ");
      out.write("\n");
      out.write("		</tr>\n");
 
		while(rs.next()){  	// rs.next() DB에서 돌면서 값이 없을때까지 가져온다 . 데이터가 여러개면 arr로 받아놓음

      out.write("	\n");
      out.write("  		<tr>\n");
      out.write("  			<td>");
      out.print(rs.getString(1) );
      out.write("</td>			");
      out.write("\n");
      out.write("  			<td><a href=\"purchaseSelect_02.jsp?userid=");
      out.print(rs.getString(1));
      out.write('"');
      out.write('>');
      out.print(rs.getString(2) );
      out.write("</a></td>  ");
      out.write("\n");
      out.write("  			<td>");
      out.print(rs.getString(3) );
      out.write("</td>\n");
      out.write("  			<td>");
      out.print(rs.getString(4) );
      out.write("</td>\n");
      out.write("  			<td>");
      out.print(rs.getString(5) );
      out.write("</td>\n");
      out.write(" 		 </tr>\n");

		count= rs.getRow();  //mysal의 행을 세워준다]
		}

      out.write("\n");
      out.write("	</table>\n");
      out.write("	\n");

		out.print("<h3>총 인원은 " + count + " 명입니다.<h3>");
		conn_mysql.close(); // DB연결 끊어준다.
		
	}catch(Exception e){
		e.printStackTrace();
	}

	
      out.write("	\n");
      out.write("	\n");
      out.write("	\n");
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
