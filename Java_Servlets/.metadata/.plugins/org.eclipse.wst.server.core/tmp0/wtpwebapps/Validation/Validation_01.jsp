<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function checkForm(){
		alert("아이디 : " + document.loginForm.id.value 
			+"비밀번호 : " + document.loginForm.passwd.value)
	}
</script>
<body>
	<form name="loginForm" action="#">
		<p>아이디: <input type="text" name="id"><br></p>
		<p>비밀번호 : <input type="password" name="passwd"><br></p>
		<p> <input type="button" value="전송" onclick="checkForm()"> </p>
	</form>
</body>
</html>