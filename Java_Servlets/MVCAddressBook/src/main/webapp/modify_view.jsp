<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정 및 삭제 </title>
</head>

<body>
<table>
<h2>수정 및 삭제</h2>
		<form action="final.do" method="post">	<%--수정 및 삭제 제출 시 보여주는 페이지 --%>
			<tr> 
				<td>이름 </td>
				<td><input type="text" name="aName" value = "${modify.aId }" size="30"></td>
			</tr>
			
			<tr> 
				<td>연락처 </td>
				<td><input type="text" name="aTel"  value = "${modify.aId }"size="30"></td>
			</tr>
			<tr> 
				<td>주소  </td>
				<td><input type="text" name="aAddress"  value = "${modify.aId }"size="40"></td>
			</tr>
			<tr> 
				<td>이메일  </td>
				<td><input type="text" name="aEmail" value = "${modify.aId }" size="30"></td>
			</tr>
			<tr> 
				<td>관계</td>
				<td><input type="text" name="aRela"  value = "${modify.aId }"size="30"></td>
			</tr>
			<tr>
				<td ><input type="submit" value="입력"></td>
				<td ><a href="list.do">목록보기 </a></td>
			</tr>
			
	</form>
			<form>
				<input type="submit" value="삭제">
			</form>
			
	</table>	

</body>
</html>