<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function checkLogin() {
		var form = document.loginForm
		if(form.id.value.length < 4 || form.id.value.length > 12) { // 교집합 
			alert("아이디는 4 ~ 12자 이내로 입력 가능합니다.")
			form.id.select()	//select 범위 잡아주기 
			return false
		}
			
		if(form.passwd.value.length < 4 || form.passwd.value.length >12 )	{
			alert("비밀번호는 4 ~ 12자 이내로 입력 가능합니다.")
			form.passwd.select()	//select 범위 잡아주기 
			return false
		
		} 
		form.submit()
	}
</script>
<body>
	<form name="loginForm" action="Validation02P.jsp" method="post">
		아이디: <input type="text" name="id"><br>
		비밀번호 : <input type="password" name="passwd"><br>
		 <input type="button" value="전송" onclick="checkLogin()"> 
	</form>
</body>
</html>