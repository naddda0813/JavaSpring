<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
	request.setCharacterEncoding("utf-8");
	
	String url_mysql = "jdbc:mysql://192.168.150.230:3306/AddressBook?serverTimezone=Asia/Seoul&characterEncoding=utf8&useSSL=false";
	String id_mysql = "root";
	String pw_mysql =  "qwer1234";

	PreparedStatement ps = null; 
	
	int seq = (int) session.getAttribute("SEQ"); 
	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql); 
		Statement stmt_mysql = conn_mysql.createStatement();

		String A = "delete from addressinfo where seq = ?"; 
		
		ps = conn_mysql.prepareStatement(A);
		ps.setInt(1, seq); 
		ps.executeUpdate();
		
		conn_mysql.close();  
		
	}catch(Exception e){
		e.printStackTrace();
	}
	session.invalidate();
	response.sendRedirect("AddressBook_01.jsp");
%>