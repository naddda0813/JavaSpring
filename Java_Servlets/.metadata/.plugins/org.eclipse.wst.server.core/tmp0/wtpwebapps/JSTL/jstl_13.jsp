<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:set var="date" value="<%=new Date() %>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>국가별 포맷 </title>
</head>
<body>
	<h3>우리나라의 포맷 </h3>
	<fmt:setLocale value="ko_kr" />
	금액 : <fmt:formatNumber value="1000000" type="currecy" /> <br>
	일시 : <fmt:formatDate value="${date }" type="both" dateStyle="full" timeStyle="full"/> <br>
	
	<h3>미국의 포맷 </h3>
	<fmt:setLocale value="en_us" />
	금액 : <fmt:formatNumber value="1000000" type="currecy" /> <br>
	일시 : <fmt:formatDate value="${date }" type="both" dateStyle="full" timeStyle="full"/><br>

	<h3>일본 의 포맷 </h3>
	<fmt:setLocale value="ja_jp" />
	금액 : <fmt:formatNumber value="1000000" type="currecy" /> <br>
	일시 : <fmt:formatDate value="${date }" type="both" dateStyle="full" timeStyle="full"/><br>
	
	<h3>중국의 포맷 </h3>
	<fmt:setLocale value="zh_cn" />
	금액 : <fmt:formatNumber value="1000000" type="currecy" /> <br>
	일시 : <fmt:formatDate value="${date }" type="both" dateStyle="full" timeStyle="full"/><br>
	
	
	
</body>
</html>