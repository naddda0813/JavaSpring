<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글 작성하기</title>
</head>
<body>
<h2>One Line Board</h2>
<table border="0">
		<form action="write.do" method="post">	<%--입력 제출시 보여주는 페이지 --%>
			<tr> 
				<td>이름 </td>
				<td><input type="text" name="bName" size="30"></td>
			</tr>
			
			<tr> 
				<td>제목</td>
				<td><input type="text" name="bTitle" size="30"></td>
			</tr>
			<tr>
				<td ><input type="submit" value="입력"></td>
				<td ><a href="list.do">목록보기 </a></td>
			</tr>
			
		

</body>
</html>