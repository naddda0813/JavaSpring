<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>약관 </title>
</head>
<body>
<%
request.setCharacterEncoding("utf-8");
String id	= request.getParameter("id"); //푸드 가져오기
session.setAttribute("ID",id);	//대문자로 적기 
String pw	= request.getParameter("pw"); //푸드 가져오기
session.setAttribute("PW",pw);	//대문자로 적기 
String username	= request.getParameter("username"); //푸드 가져오기
session.setAttribute("USERNAME",username);	//대문자로 적기 
%>
<h1>약관 </h1>
<br>
----------------------------------------------
<br>
1.회원 정보는 웹사이트의 운영을 위해서만 사용됩니다.
<br>
2.웹사이트의 정상 운영을 방해하는 회원은 탈퇴 처리 합니다.
<br>
-----------------------------------------------
<br>
위의 약관에 동의하십니까?
<br>
	<form action="userInsert_03.jsp">
			<input type="radio" name="agree" value="agree">동의함 
			<input type="radio" name="agree" value="noagree" >비동의  <br>
			
	<input type="submit" value="확인">
	</form>	


</body>
</html>