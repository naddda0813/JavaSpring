<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성인 여부 판 </title>
</head>
<body>
<%
	int age;
	age = Integer.parseInt(request.getParameter("age")) ;
	String adult,possible;
	
	if(age >=20 && age<=100	) { 
		adult =URLEncoder.encode("성인","utf-8");
		possible =URLEncoder.encode("가능","utf-8") 		;
		response.sendRedirect("age_request03.jsp?age="+age+"&adult="+adult+"&possible="+possible);
	} else if ( age >=0){
		adult =URLEncoder.encode("미성년자","utf-8");
		possible =URLEncoder.encode( "불가능","utf-8");
		response.sendRedirect("age_request03.jsp?age"+age+"&adult="+adult+"&possible="+possible);

	} else {
		response.sendRedirect("age_request01.jsp");
	}
%>
	

		
	
	
	
	
	



</body>
</html>