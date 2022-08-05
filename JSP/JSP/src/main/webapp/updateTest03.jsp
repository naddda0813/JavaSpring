
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
 	String userid = request.getParameter("userid");
	session.setAttribute("NEW", userid);
	
	String url_mysql = "jdbc:mysql://localhost:3306/eclipse?serverTimezone=Asia/Seoul&characterEncoding=utf8&useSSL=false";
	String id_mysql = "root";
	String pw_mysql = "qwer1234";


	PreparedStatement ps = null; // values 뒤에 ?를 해석해준다
	String newId = (String)session.getAttribute("NEW"); //session값은 object 여서 string으로 선언
	String oldId =(String)session.getAttribute("NEW");
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);//java.sql로 선택,sql과 연결
		//연결 끝
		Statement stmt_mysql = conn_mysql.createStatement();
		//언어번역
		
		String A = "update wtest set userid = ? where userid =?"//어떤 걸 수정할지 모르기 때문에 모두 써둔다.	키값은 readonly
		
		ps = conn_mysql.prepareStatement(A+B);
		ps.setString(1, newId); //? 순서대로
		ps.setString(2, oldId);
		ps.executeUpdate();
		
		conn_mysql.close();
		
	}catch(Exception e){
		e.printStackTrace();
	}
	response.sendRedirect("purchase_03.jsp");


%>
</body>
</html>