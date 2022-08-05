<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정보 입력 </title>
</head>
<body>
	<form action="request_06.jsp" method="get">
	첫번째 수를 입력하세요
	<select name ="num1">
	<% 	
	for(int i=1;i<=100;i++) { %>
	<option value = <%=i%>><%=i %></option>
	<br>
	<% 
		} 
	%>
	</select>
	<br>
	
	두번째 수를 입력하세요 
	<select name ="num2">	
	<% 	
	for(int i=1;i<=100;i++) { %>
	<option value = <%=i%>><%=i %></option>
	<br>
	<% 
		} 
	%>
	</select>
	<br>
		
		<%--checkbox --%>
		선택 :<br>
		
		<input type="checkbox" name="calc" value="+">+<br>
		<input type="checkbox" name="calc" value="-">-<br>
		<input type="checkbox" name="calc" value="*">*<br>
		<input type="checkbox" name="calc" value="/">/<br>
		<input type="checkbox" name="calc" value="%">%<br>
		<br>
	
		<input type="submit" value ="계산" >
		<input type="reset" value ="초기화">
		
	</form>

</body>
</html>