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
%>
	아이디: <%=request.getParameter("id") %> <br>
	비밀번호: <%=request.getParameter("passwd") %> <br>
	이름 : <%=request.getParameter("name") %> <br>
	연락처: <%=request.getParameter("phone1") %>
		- <%=request.getParameter("phone2")%>		//따로분리하는 게 좋다 
		-<%=request.getParameter("phone3")%><br>
	이메일: <%=request.getParameter("email") %>
	
</body>
</html>