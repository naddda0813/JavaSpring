<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>move</title>
</head>
<body>
<%
 	String aaa = request.getParameter("sitename");
	aaa = aaa.toLowerCase();		//대문자 입력해도 소문자로 출력
	
	

	switch(aaa){
	case "네이버":
	case "naver":
		response.sendRedirect("https://www.naver.com");		
		break;
		
	case "다음":
	case "daum":
		response.sendRedirect("https://www.daum.net");
		break;
		
	case "구글":
	case "google":
		response.sendRedirect("https://www.google.com");
		break;
		
	default: 
		response.sendRedirect("https://www.yahoo.com");
		break;
	} 

%>
</body>
</html>