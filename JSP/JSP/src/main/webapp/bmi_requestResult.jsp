<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>your BMI</title>
</head>
<body>
<%
int num1 = Integer.parseInt(request.getParameter("height")) ;
int num2 = Integer.parseInt(request.getParameter("weight")) ;
double num3 = (num1 *0.01 ) * (num1 *0.01 );
double calc = num2 / num3; // bmi 계산식 몸무게/신장 (m)의 제곱 )
String result = String.format("%.2f",calc);		//소수 둘째 자리까지 출
%>

<%--결과값 출력하기  --%>	
<%-- bmi 값에 따른 이미지 보여주 --%>
<form>
	<table>
		<tr>
		<td>당신의 bmi는 	</td>
		<td><input type="number" value= "<%=result%>"	size="5" readonly="readonly"></td>
		</tr>
	</table>
</form>

<%--result는 string이므로 calc --%>
<% 
	if(calc < 18.5 && calc >0)	{ 
		result ="저체중";
	%> <img alt="" src="low.png" width=200><br>
		저체중입니다. 체중관리가 필요합니다!
	<% }	
	else if(calc > 18.5)	{ 
		result="정상체중"	;		
	%>	<img alt="" src="middle.png" width=200>
		정상체중입니다.아주 좋아요! 
	<% }	
	else if(calc > 29.9)	{ 
		result="과체중"	;	
	%>	 <img alt="" src="upper.png" width=200>
		과체중입니다. 체중관리가 필요합니다!
	<% }	
	else if(calc > 30)	{ 
		result="비만";
	%>	 } <img alt="" src="high.png" width=200>
		비만입니다. 
<%
}
%>
	<a href=></a>	
			

			
			
		

			
			
			











</body>
</html>