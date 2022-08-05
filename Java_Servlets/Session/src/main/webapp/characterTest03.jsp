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
	String animal = request.getParameter("animal");
	session.setAttribute("ANIMAL",animal);	//대문자로 적기 
%>

	당신은 <%=session.getAttribute("FOOD") %> 와 <br>
	<%=session.getAttribute("ANIMAL") %>을 좋아하는 성격입니다.<br>
	<% session.invalidate(); %>		<%--세션 무효화   --%>

</body>
</html>