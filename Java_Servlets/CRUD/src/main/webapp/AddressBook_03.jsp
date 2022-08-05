<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>    
<!DOCTYPE html>
<%
	request.setCharacterEncoding("utf-8");

	
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");
	String address = request.getParameter("address");
	String email = request.getParameter("email");
	String relation = request.getParameter("relation");
	
	session.setAttribute("NAME", name);
	session.setAttribute("TEL", tel);
	session.setAttribute("ADDRESS", address);
	session.setAttribute("EMAIL", email);
	session.setAttribute("RELATION", relation);

	String url_mysql = "jdbc:mysql://192.168.150.230:3306/AddressBook?serverTimezone=Asia/Seoul&characterEncoding=utf8&useSSL=false";
	String id_mysql = "root";
	String pw_mysql = "qwer1234";
	
	PreparedStatement ps = null;
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
		Statement stmt_mysql = conn_mysql.createStatement();
		
		String A = "insert into addressinfo (name, tel, address, email, relation";
		String B = ") values (?, ?, ?, ?, ?)";
		
		ps = conn_mysql.prepareStatement(A+B);
		ps.setString(1, name);
		ps.setString(2, tel);
		ps.setString(3, address);
		ps.setString(4, email);
		ps.setString(5, relation);
		ps.executeUpdate();
		
		conn_mysql.close();
	}catch(Exception e){
		e.printStackTrace();
	}
	
	response.sendRedirect("AddressBook_01.jsp");
%>
