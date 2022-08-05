<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>덧셈 </title>
</head>

<body>
   <%
      
      int num1 = Integer.parseInt(request.getParameter("num1"));
      int num2 = Integer.parseInt(request.getParameter("num2"));

   %>
   
   <form action=" http://192.168.150.190:8080/JSP/forward_03.jsp" method="get">
 <table>
      <tr>
         <td>첫번째 수:</td>
         <td><input type="number" name = "num1" value="<%=num1 %>" readonly="readonly"></td>
      </tr>
      <tr>   
         <td>두번째 수:</td>
         <td><input type="number" name = "num2" value="<%=num2 %>" readonly="readonly"></td>
      </tr>
      <tr>
         <td><%=num1 + " + " + num2 + " = " + (num1+num2) %></td>
  
         <td><input type="submit" value="뺄셈"></td>
      </tr>
   
</table>   
   </form>
   
   
   
   
   
   
   <%--
      request.getParameter("utf-8");
   
      int num1 = Integer.parseInt(request.getParameter("num1"));
      int num2 = Integer.parseInt(request.getParameter("num2"));
		double div = num1 /num2;	
      
     request.setAttribute("ADD",num1+num2);
     request.setAttribute("SUB",num1-num2);
     request.setAttribute("MUL",num1*num2);
     request.setAttribute("DIV",div);
  
     
     RequestDispatcher dispatcher = request.getRequestDispatcher("forward_03.jsp");
     dispatcher.forward(request,response);					//디스패쳐가 속도가더 빠름.포워드를 리스폰스에 놓
   --%>

   
   
   
   


</body>
</html>