<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>회원가입결과 </h2><br>
<h3>가입되었습니다. </h3><br>
<h1>가입내용  </h1>


<form >
아이디:<%=session.getAttribute("ID")%> <br>
패스워드 :<%=session.getAttribute("PW") %>  <br>
이름: <%=session.getAttribute("USERNAME")%>  <br>
<% session.invalidate(); %>
</form>

</body>
</html>