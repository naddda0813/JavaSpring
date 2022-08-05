<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>user information</title>
</head>
<body>

<form action="bmi_requestResult.jsp" method="get">
<table>
	<tr>
	<td>키(cm)</td>
	<td><input type="number" name="height"> </td>

	<tr>
	<td>몸무게(kg)</td>
	<td><input type="number" name="weight"> </td>
	</tr>
	<tr>
	<td><input type="submit" value = "ok">	</td>
	<td><input type="reset" value = "다시 입력">	</td>
	</tr>
</table>


</form>


</body>
</html>