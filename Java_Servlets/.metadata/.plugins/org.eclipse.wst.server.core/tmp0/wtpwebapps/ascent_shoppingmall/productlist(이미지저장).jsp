<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import = "java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 디테일 리스트</title>
</head>
<body>
   <h3>상품디테일 </h3>
<%
   String url_mysql = "jdbc:mysql://localhost:3306/ascent?serverTimezone=Asia/Seoul&characterEncoding=utf8&useSSL=false";
   String id_mysql = "root";
   String pw_mysql = "qwer1234";
   
   String query = "select productCode,productName,productImages from product where productCode like 'P-%'";
   
   
   try{
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
      Statement stmt_mysql = conn_mysql.createStatement();
      
      ResultSet rs = stmt_mysql.executeQuery(query);      //데이터베이스 준비 완료
%>
      
      <table border="1">
         <tr>
            <th>상품코드</th><td>상품이름</td><td>상품상세이미지</td>
         </tr>
      
         
<% 
      //데이터 있는 만큼 반복하면서 돔
      while(rs.next()){
%>
      <tr>
         <td><%=rs.getString(1)%></td>
         <td><%=rs.getString(2)%></td>
         <td><img src="<%=rs.getString(3)%>" width="300"></td>
      </tr>
      


<%
      }
%>
      </table>
<%
      conn_mysql.close();  //연결을 끊음
   }catch(Exception e){
      e.printStackTrace();
   }
   
   
%>

</body>
</html>