<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<%

String num = request.getParameter("num");
String size = request.getParameter("size");
String color = request.getParameter("color");


request.setAttribute("num",num);
request.setAttribute("size",size);
request.setAttribute("color",color);


RequestDispatcher dispatcher =request.getRequestDispatcher("cart_04.jsp");
dispatcher.forward(request, response);


%>




</body>
</html>