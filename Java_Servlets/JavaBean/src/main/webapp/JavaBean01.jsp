<%@page import="com.javalec.base.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="student" class="com.javalec.base.Student" scope="request0"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:setProperty property="name" name="student" value="홍길동 "/>
	<jsp:setProperty property="age" name="student" value="13 "/>
	<jsp:setProperty property="grade" name="student" value="6 "/>
	<jsp:setProperty property="studentnum" name="student" value="10 "/>
	
	<jsp:forward page=""JavaBean02.jsp"/>
	
</body>
</html>