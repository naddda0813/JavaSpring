<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Addition</title>
</head>
<body>
<%
	int a = 30;
	int b = 20;
	int addition = a + b ;
	int subtraction = a- b;
	int multiple = a*b;
	int division = a/b;
	int remain = a%b;
%>
<%=a %> + <%=b %> = <%=addition %> <br>

<%	out.println(a + " + " + b +" = " + addition + "<br>"); 
	out.println(a + " - " + b +" = " + subtraction + "<br>"); 
	out.println(a + " * " + b +" = " + multiple + "<br>");  
	out.println(a + " / " + b +" = " + division +  "<br>");  
	out.println(a + " % " + b +" = " + remain + "<br>"); 
%> 

<%
	int i =2;
	for(int j=1; j<=9; j++) {
		out.println( 2	+ " * " + j + "=" + (i*j)+ "<br>");
		
%>			
		==========<br>
<% 		
		}
%>

<%
	int k = 0;
	while(true){
		k++;
		out.println("2 X " + k + " = " + (2*k));
%>
			<br>
			=================<br>
<%
			if(k>=9 ) {
				break;
			}
	}
%>	
	
	
	
	
<%			
		int c=0;
		int sum1=0;

		while(c<100)	{
			
			c++;
			sum1 +=c;
		}	
	%>	
		1부터 100까지의 합 = <%=sum1%><br>
	
<% 	
		while (c<200)	{
			c++;
			sum1+=c;		
		}
%>				
		1부터 200까지의 합 = <%=sum1%>
	
	
	
	



</body>
</html>