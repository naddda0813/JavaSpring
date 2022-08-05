<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%!
	public int sum(int a,int b)	{
		return a+b;
	}
%>

	2 + 1 = <%=sum(2,1) %><br>
	3 + 1 = <%=sum(3,1) %> <br>
	4 + 1 = <%=sum(4,1) %> <br>
	5 + 1 = <%=sum(5,1) %> <br>

	===========<br>

<%!

	public int mul(int a,int b){
	 	 int result = 1;
	 	 for(int c=0;c<b;c++)		/*b를 반복하기*/
	 		 result *= a;
	 	 return result;							
	 	
	}
%>

	2 ^ 1 = <%=mul(2, 1) %><br>
	2 ^ 2 = <%=mul(2, 2) %><br>
	2 ^ 3 = <%=mul(2, 3) %><br>
	2 ^ 4 = <%=mul(2, 4) %><br>
	2 ^ 5 = <%=mul(2, 5) %><br>











</body>
</html>