<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>뺄셈 </title>
</head>
<body>
<%

int num1 = Integer.parseInt(request.getParameter("num1"));
int num2 = Integer.parseInt(request.getParameter("num2"));
%>
<form action="http://192.168.150.230:8080/JSP_0317/forward_04.jsp" method="get">
<table>
		<tr>
			<td>첫번째 수 :</td>
			<td> <input type="number" name = "num1" value="<%=num1 %>" readonly="readonly"> </td>
		</tr>
		<tr>
			<td>두번째 수 :</td>
			<td><input type="number" name = "num2" value="<%=num2 %>" readonly="readonly"></td>
		</tr>
		<tr>
			<td><%=num1 %> - <%=num2 %> = <%=(num1 - num2) %>  </td>
			<td><input type="submit" value="곱셈"></td>
		</tr>

</table>
</form>

<%-- <
<form action="http://192.168.150.230:8080/JSP_0317/forward_04.jsp" method="get">
<%
int num1=Integer.parseInt(request.getParameter("num1"));
int num2=Integer.parseInt(request.getParameter("num1"));

%>
	첫번째 수 :<input type=number name="num1" > <br>
	두번째 수 :<input type=number name="num2" > <br>

	<%=num1 %> - <%=num2 %> = <%= num1-num2 %>
	<input type="submit" value="곱셈">
</form> --%>

</body>
</html>