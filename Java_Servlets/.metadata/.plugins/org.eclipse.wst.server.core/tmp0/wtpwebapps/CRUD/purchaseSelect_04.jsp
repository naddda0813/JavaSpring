<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	//불러오기
	String userid= request.getParameter("userid");
	session.setAttribute("OLDID", userid);

	
	String url_mysql = "jdbc:mysql://localhost:3306/eclipse?serverTimezone=Asia/Seoul&characterEncoding=utf8&useSSL=false";
	String id_mysql = "root";
	String pw_mysql =  "qwer1234";
	
	PreparedStatement ps = null;


	try{
		Class.forName("com.mysql.cj.jdbc.Driver"); // 아까 lib로 옮겨줬던 mysql jar파일 경로
		Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql); // java.sql로 선택해야함. sql과 연결
		Statement stmt_mysql = conn_mysql.createStatement();

		String A = "delete from wtest where userid =?";

		ps = conn_mysql.prepareStatement(A);
		ps.setString(1,userid);
		ps.executeUpdate();

		conn_mysql.close(); // DB연결 끊어준다.

	
	}catch(Exception e){
	e.printStackTrace();
	}

	response.sendRedirect("purchaseSelect_01.jsp");
%>	

</body>
</html>