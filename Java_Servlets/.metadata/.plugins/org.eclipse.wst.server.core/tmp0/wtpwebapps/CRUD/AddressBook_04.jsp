<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주소록 수정 및 삭제</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	String url_mysql = "jdbc:mysql://192.168.150.230:3306/AddressBook?serverTimezone=Asia/Seoul&characterEncoding=utf8&useSSL=false";
	String id_mysql = "root";
	String pw_mysql =  "qwer1234";
	
	int seq = Integer.parseInt(request.getParameter("seq")) ;
	int strSeq=0;
	String strName="";
	String strTel="";
	String strAddress="";
	String strEmail="";
	String strRelation="";
	
	String query = "select seq,name,tel,address,email,relation from addressinfo where seq =" + seq ;//
											// query : prepared를 안쓰는 방법
	try{
		Class.forName("com.mysql.cj.jdbc.Driver"); // 아까 lib로 옮겨줬던 mysql jar파일 경로
		Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql); // java.sql로 선택해야함. sql과 연결
		Statement stmt_mysql = conn_mysql.createStatement();

	ResultSet rs = stmt_mysql.executeQuery(query); // DB에서 테이블 준비만 해둔 상태. 자바로 가져와야 한다. rs를 통해 가져온다
%>	
<% 
		while(rs.next()){  	//하나씩 가져오기 많으면  arrayList 로 출력 
			strSeq = rs.getInt(1);
			strName = rs.getString(2);
			strTel =rs.getString(3);
			strAddress =rs.getString(4);
			strEmail =rs.getString(5);
			strRelation =rs.getString(6);
		}
%>
<% 
		session.setAttribute("SEQ",strSeq);
		conn_mysql.close(); // DB연결 끊어준다.
}catch(Exception e){
	e.printStackTrace();
}
%>	
	<h3>주소록 수정 및 삭제</h3>
		<form action="AddressBook_05.jsp" method="post">
		
		순서 : <input type="text" name="seq" value="<%=strSeq%>" readonly="readonly"> <br>
		이름 : <input type="text" name="name" value="<%=strName%>" > <br>
		전화번호 : <input type="text" name="tel" value="<%=strTel%>" > <br>
		주소 : <input type="text" name="address" value="<%=strAddress%>"><br>
		이메일: <input type="text" name="email"  value="<%=strEmail%>"><br>
		관계 : <input type="text" name="relation"  value="<%=strRelation%>"><br>
		<input type="submit" value="수정"  ><br>

	</form>
	
		<form action="AddressBook_06.jsp">
		<input type="submit" value="삭제"><br>
		</form>
</body>
</html>