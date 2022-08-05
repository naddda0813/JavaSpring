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
		var form = document.loginForm;	//var 변수선언 
		if(form.id.value == "") {
			alert("please write id") 
			form.id.focus()	//커서가 id로 
			return false	//필수 
		} else if(form.passwd.value == "") {
			alert("please write pw")
			form.passwd.focus()
			return false
		}
		form.submit()
	}
</script>

<body>
	<form name="loginForm" action="Validation02P.jsp" method="post">
		아이디: <input type="text" name="id"> <br>
		비밀번호  : <input type="password" name="passwd">
		<input type="button" value="OK" onclick="checkLogin()">
	</form>
</body>
</html>