<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
		function checkMember() {
			var regExpId = /^[a-z|A-Z|ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/
			var regExpPasswd = /^[0-9]*$/
			var regExpName = /^[가-힣]*$/
			var regExpPhone = /^\d{3}-\d{3,4}-\d{4}$/		//10진수 3~4자리 
			var regExpEmail = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i
			
			var form = document.member	//body의 이 
			
			var id = form.id.value
			if(!regExpId.test(id)) {		// if not
				alert("아이디는 문자로 시작해주세요 ")	
				form.id.select()
				return
			}
			var passwd =form.passwd.value
			if(!regExpPasswd.test(passwd))	{
				alert("비밀번호는 숫자만 입력해주세요.")
				form.passwd.select()
				return
			}
			var name =form.name.value
			if(!regExpName.test(name))	{
				alert("이름은 한글만 입력해주세요.")
				form.name.select()
				return
			}
			var phone = form.phone1.value +"-" + form.phone2.value +"-" + form.phone3.value
			if(!regExpPhone.test(phone))	{
				alert("연락처 입력을 확인해주세요.")
				return
			}
			var email = form.email.value 
			if(!regExpEmail.test(email))	{
				alert("이메일 입력을 확인해주세요.")
				return
			}
			form.submit()
			}
</script>
<body>
<h3>회원가입 </h3>
	<form action="Validation05P.jsp" name="member" method="post">
		아이디 : <input type="text" name="id"> <br>
		비밀번호 : <input type="password" name="passwd"> <br>
		이름: <input type="text" name="name"> <br>
		연락처 : 
		<select name="phone1">
			<option value="010">010</option>
			<option value="011">011</option>
			<option value="016">016</option>
			<option value="017">017</option>
			<option value="018">018</option>
			<option value="019">019</option>
		</select>
		- <input type="text" maxlength="4" size="4" name="phone2">
		- <input type="text" maxlength="4" size="4" name="phone3"> <br>
		<input type="button" value="확인하기" onclick="checkMember()">
	</form>
</body>
</html>