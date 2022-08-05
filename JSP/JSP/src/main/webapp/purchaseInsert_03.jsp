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
session.getAttribute("USERID");
session.getAttribute("NAME");
session.getAttribute("TEL");
session.getAttribute("ADDRESS");
%>
	사용자 ID :${USERID } <br>
	성명 : ${NAME } <br>
	전화번호 :${TEL } <br>
	주소 :${ADDRESS } <br>



상기의 정보로 입력되었습니다. 감사합니다.
</body>
</html>