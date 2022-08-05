

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
	request.setCharaterEncoding("utf-8");

	//수정 내용 받아오기 
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");
	String address = request.getParameter("address");
	//delete면 session까지 필요옶음
	session.setAttribute("NEWNAME",name);
	session.setAttribute("NEWTEL",tel);
	session.setAttribute("NEWADDRESS",address);
	
	String url_mysql = "jdbc:mysql://localhost:3306/eclipse?serverTimezone=Asia/Seoul&characterEncoding=utf8&useSSL=false";
	String id_mysql = "root";
	String pw_mysql = "qwer1234";
	

	PreparedStatement ps = null; 
	
	String userid =(String)session.getAttribute("ID");
	String newName =(String)session.getAttribute("NEWNAME");
	String newTel =(String)session.getAttribute("NEWTEL");
	String newAddress =(String)session.getAttribute("NEWADDRESS");
	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
		Statement stmt_mysql = conn_mysql.createStatement();
		
		String A = "delete from purchaseinfo where userid = ";
		//sql에서 쓰는 문장 그대로 , 정보 수정시 select 테이블명 set 컬럼 ,삭제 시 delete 테이블명 from 칼럼명
		
		
		ps = conn_mysql.prepareStatement(A);
		ps.setString(1, userid); // 삭제할때는 행 하나 통째로 삭제이므로 id만 삭제해도 된다. ,물음표에 값 넣어주기
		ps.executeUpdate();
		
		conn_mysql.close();
		
	}catch(Exception e){
		e.printStackTrace();
	}
	response.sendRedirect("purchaseUpdate_04.jsp");
	
	
%>
</body>
</html>