<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%--fmt :출력  --%>
<c:set var="date" value="<%=new Date() %>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	[오늘 날짜] <fmt:formatDate value="${date }" /> <br>
	[현재 시간] <fmt:formatDate value="${date }" type="time"/> <br>
	
</body>
</html>