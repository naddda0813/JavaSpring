<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 연락처 추가 </title>
</head>
<body>
<h2>AddressBook</h2>
<table>
		<form action="write.do" method="post">	<%--입력 제출시 보여주는 페이지 --%>
			<tr> 
				<td>이름 </td>
				<td><input type="text" name="aName" size="30"></td>
			</tr>
			
			<tr> 
				<td>연락처 </td>
				<td><input type="text" name="aTel" size="30"></td>
			</tr>
			<tr> 
				<td>주소  </td>
				<td><input type="text" name="aAddress" size="40"></td>
			</tr>
			<tr> 
				<td>이메일  </td>
				<td><input type="text" name="aEmail" size="30"></td>
			</tr>
			<tr> 
				<td>관계</td>
				<td><input type="text" name="aRela" size="30"></td>
			</tr>
			<tr>
				<td ><input type="submit" value="입력"></td>
				<td ><a href="list.do">목록보기 </a></td>
			</tr>
			
	</form>
	</table>	
</body>
</html>