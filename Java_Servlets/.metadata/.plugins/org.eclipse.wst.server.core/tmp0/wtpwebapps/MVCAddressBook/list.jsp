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
<title>Address Book</title>
</head>
<body>

	<div id = "container">
	<h2>AddressBook </h2>
	<table border="1">
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>연락처</th>
			<th>주소</th>
			<th>이메일</th>
			<th>관계 </th>
		</tr>			
		<c:forEach items="${list }" var="dto">				<%-- 반복문 필수  --%>
		<tr>
			<td><a href="modify.do?aId=${dto.aId }">${dto.aId } </a></td>
			<td>${dto.aName }</td>
			<td>${dto.aTel }</td>
			<td>${dto.aAddress }</td>
			<td>${dto.aEmail }</td>
			<td>${dto.aRela }</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="6"><a href="write_view.do">추가하기</a></td>
		</tr>
	</table>

	</div>
</body>
</html>