
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과 출력</title>
</head>
<body>
<%
int appno1 = Integer.parseInt(request.getParameter("num1"));
int appno2 = Integer.parseInt(request.getParameter("num2"));
int result1 = appno1 +appno2;
int result2 = appno1 - appno2;
int result3 = appno1 * appno2;
double result4 = appno1 / appno2;
double result5 = appno1 % appno2;
String[] calcs = request.getParameterValues("calc");
%>
<br>
<%--radio 타입으로 결과값 출력하기 --%>

<%
for(int j=0;j<calcs.length;j++) {
switch(calcs[j]) {
case "+":
	out.print("결과값은" + appno1+ calcs[j] + appno2 + "=" + result1 + "<br>"); //calcs[j]는 연산기호 
	break;
case "-":
	out.print(appno1+ calcs[j] + appno2 + "=" + result2 + "<br>"); //calcs[j]는 연산기호 
	break;
case "*":
	out.print(appno1+ calcs[j] + appno2 + "=" + result3+ "<br>"); //calcs[j]는 연산기호 
	break;
case "/":
	out.print(appno1+ calcs[j] + appno2 + "=" + result4 + "<br>"); //calcs[j]는 연산기호 
	break;
case "%":
	out.print(appno1+ calcs[j] + appno2 + "=" + result5 + "<br>"); //calcs[j]는 연산기호 
	break;

}
}

%>

</body>
</html>