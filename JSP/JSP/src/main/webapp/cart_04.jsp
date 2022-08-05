<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 선택  저장 내용 </title>
</head>
<body>

수량 :<%=request.getAttribute("num") %><br>
크기 :<%=request.getAttribute("size") %><br>
색상 : <%=request.getAttribute("color") %>

</body>
</html>