<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과 </title>
</head>
<body>	

<%
int addno1 = Integer.parseInt(request.getParameter("num1"));
int addno2 = Integer.parseInt(request.getParameter("num2"));

%>
	<table>
<tr>
	<td> 두 수의 합은 </td>
	<td>
		<form action ="#" method = "get">
			<input type="text" value ="<%= addno1 + addno2%>"size="5" readonly="readonly"> 
		</form>
	</td>
	<td>입니다.</td>
</tr>

</table>
	

</body>
</html>