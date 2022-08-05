<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>저장 결과 </title>
</head>
<body>
<h1>상품 선택 저장 결과 </h1>




	<form action="cart_03.jsp" method ="get">
	저장되었습니다 
	<input type="hidden" name="num" value="<%=request.getParameter("num") %>">
	<input type="hidden" name="size" value="<%=request.getParameter("size") %>">
	<input type="hidden" name="color" value="<%=request.getParameter("color") %> ">

	<input type="submit" value="저장 결과 불러오기 ">
	</form>



</body>
</html>