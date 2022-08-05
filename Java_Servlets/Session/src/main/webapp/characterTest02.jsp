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
	request.setCharacterEncoding("utf-8");
	String food	= request.getParameter("food"); //푸드 가져오기
	session.setAttribute("FOOD",food);	//대문자로 적기 
%>


	<h2>좋아하는 동물은?</h2>
	<form action="characterTest03.jsp">
		<input type="text" name="animal">
		<br>
		<br>
		<input type="submit" value="ok">
	</form>
</body>
</html>