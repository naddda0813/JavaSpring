<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성인 확인 </title>
</head>
<body>

<%
	request.setCharacterEncoding("utf-8");
	String adult = URLDecoder.decode(request.getParameter("adult"),"utf-8");
	String possible = URLDecoder.decode(request.getParameter("possible"),"utf-8");
%>
	<h1><%=request.getParameter("adult") %> </h1> 	
	당신의 나이는 <%=request.getParameter("age") %>이므로 주류구매가 <%=request.getParameter("possible") %>합니다.<br>
	
	
<a href="age_request01.jsp">처음으로 이동  </a>



</body>
</html>