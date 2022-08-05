<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>수정 및 삭제 </h2>
	<table border="0">
		<form action="modify.do" method="post">		<%--수정시 modify.do 주소창 실행  --%>
			<tr>
				<td>번호 </td>
				<td> <input type="text" name="bId" size="5" value = "${content_view.bId }" readonly="readonly"> </td>
			</tr>
		
			<tr>
				<td>이름 </td>
				<td> <input type="text" name="bName" size="20" value = "${content_view.bName }" > </td>
			</tr>
			<tr>
				<td>제목 </td>
				<td> <input type="text" name="bTitle" size="50" value = "${content_view.bTitle }" > </td>
			</tr>
		
			<tr>
				<td>내용</td>
				<td> <textarea name="bContent" rows="10" cols="50">${content_view.bContent }</textarea> </td>
			</tr>
			<tr>
					<td colspan="2"> <input type="submit" value="수정">
					
					<a href="list.do">목록보기 </a>
					</td>
			</tr>		
	
		
		</form>
	
	</table>

</body>
</html>