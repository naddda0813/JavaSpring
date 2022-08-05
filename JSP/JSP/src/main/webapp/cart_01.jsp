<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품선택 </title>
</head>
<body>
<form action="cart_02.jsp" method="get">

	수량 : <input type="text" name ="num" >
	<br>
	<br>
	크기 : 
	<input type="radio" name="size" value = "대">대
	<input type="radio" name="size" value = "중">중
	<input type="radio" name="size" value = "소">소
	<br>
	<br>
	색상 : 
	<select name ="color">
			<option value="대">베이지</option> <br>
			<option value="중">브라운 </option> <br>
			<option value="소">카키 </option> <br>
	
	</select>
	<br>
	<input type="submit" value = "저장">
</form>

</body>
</html>