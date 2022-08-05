<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객명단 수정 및 삭제</title>
</head>
<body>

<%
	request.setCharacterEncoding("utf-8");
	String url_mysql = "jdbc:mysql://localhost:3306/eclipse?serverTimezone=Asia/Seoul&characterEncoding=utf8&useSSL=false";
	String id_mysql = "root";
	String pw_mysql =  "qwer1234";
	
	String id = request.getParameter("userid");
	
	String strUserid="";
	String strName="";
	String strTel="";
	String strAddress="";
	
	String query = "select userid,name,tel,address from wtest where userid ='" +id+"'" ;// 칼럼명이 전부 들어갈때는 * 로 적어주기 
											// query : prepared를 안쓰는 방법


	try{
		Class.forName("com.mysql.cj.jdbc.Driver"); // 아까 lib로 옮겨줬던 mysql jar파일 경로
		Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql); // java.sql로 선택해야함. sql과 연결
		Statement stmt_mysql = conn_mysql.createStatement();

	ResultSet rs = stmt_mysql.executeQuery(query); // DB에서 테이블 준비만 해둔 상태. 자바로 가져와야 한다. rs를 통해 가져온다
%>	
<% 
		while(rs.next()){  	//하나씩 가져오기 많은 arrayList 
			strUserid =rs.getString(1);
			strName =rs.getString(2);
			strTel =rs.getString(3);
			strAddress =rs.getString(4);

		
		}
%>

<% 

		session.setAttribute("USERID",strUserid);
	conn_mysql.close(); // DB연결 끊어준다.
	
}catch(Exception e){
	e.printStackTrace();
}

%>	


<h3>고객명단 수정 및 삭제</h3>
	<form action="purchaseSelect_03.jsp" method="post">
		User Id : <input type="text" name="userid" value="<%=strUserid%>" readonly="readonly"> <br>
		성명 : <input type="text" name="name" value="<%=strName%>" > <br>
		전화번호 : <input type="text" name="tel" value="<%=strTel%>"><br>
		주소 : <input type="text" name="address"  value="<%=strAddress%>"><br>
		<input type="submit" value="수정"  ><br>

</form>
		<form action="purchaseSelect_04.jsp">
		<input type="submit" value="삭제"><br>
		</form>

</body>
</html>