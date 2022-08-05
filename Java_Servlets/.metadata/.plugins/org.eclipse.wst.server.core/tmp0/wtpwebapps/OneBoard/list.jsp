<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">


#container {
  position: absolute;
  top:50%;
  left:50%;
  transform:translate(-50%,-50%);
}
</style>
<meta charset="UTF-8">
<title>One Line Board </title>
</head>
<body>
	<div id="container">
	<h1>One Line Board</h1>
	<table border="1" >
	<tr>
		<th>번호</th>
		<th>이름</th>
		<th>제목</th>
		<th>날짜</th>
		<th>삭제</th>
	</tr>	
	<c:forEach items="${list }" var="dto">		<%--db setting --%>
	<tr>
		<td>${dto.bId }</td>
		<td>${dto.bName }</td>
		<td>${dto.bTitle }</td>
		<td>${dto.bDate }</td>
		<td><a href="delete.do?bId=${dto.bId }">X</a></td>
	</tr>
	</c:forEach>
	<tr>
	<td colspan="5"><a href="write_view.do">글작성</a></td>
	</tr>
	</table>	
	</div>
</body>
</html>