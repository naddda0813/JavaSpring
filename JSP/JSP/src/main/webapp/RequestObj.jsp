<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Request 정보 </title>
</head>
<body>

<%
	out.print("server : " +request.getServerName() + "<br>");
	out.print("Port : " +request.getServerPort() + "<br>");
	out.print("요청방식 : " +request.getMethod() + "<br>");
	out.print("Protocol : " +request.getProtocol() + "<br>");
	out.print("URL : " +request.getRequestURL() + "<br>");		//Unifrom Request Locator
	out.print("URI : " +request.getRequestURI() + "<br>");		//Unifrom Request 
	
%>
</body>
</html>