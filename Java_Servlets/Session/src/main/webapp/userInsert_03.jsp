<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>개인정보 입력 </title>
</head>
<body>

<%
String agree = 	request.getParameter("agree");

if(	agree.equals("agree"))	
{
	response.sendRedirect("userInsert_04.jsp");
}
else if( agree.equals("noagree")){
	response.sendRedirect("userInsert_01.jsp");
}
%>


</body>
</html>