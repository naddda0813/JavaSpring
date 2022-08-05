<%@page import="com.javalec.base.Bean_01"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Bean_01 product = new Bean_01();

	product.setName("바나나");	//bean01에서 가져온 set 
	product.setValue(20000);
	
	request.setAttribute("PRODUCT", product); // product 배열 통째로  가져오기 
	
	RequestDispatcher dispatcher =request.getRequestDispatcher("EL04.jsp");
	dispatcher.forward(request, response);

%>
</body>
</html>