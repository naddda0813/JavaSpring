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
		for(i=0; i<form.id.value.length;i++)	{
			var ch = form.id.value.charAt(i);	//i랑 같을때
			if((ch<'a'|| ch>'z') && (ch>'A'|| ch<'Z') && (ch>'0'|| ch<'9')) { 	// 소문자에 해당하며 대문자와 숫자 제외 ,소문자를 출력하는 게 아니
																					//대문자와 숫자값이 나오게 출력 
				alert("아이디는 영문 소문자만 입력가능합니다.")
				form.id.select()
				return 
			}
		}
		for(j=0; j<form.passwd.value.length;j++) {
			var Chr = form.passwd.value.charAt(j);	
			if(Chr < '0' || Chr > '9' ) ) {
				alert("비밀번호는 숫자만 입력가능합니다.")
				form.passwd.select()
				return
			}
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