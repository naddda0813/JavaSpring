<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import = "java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주소록</title>
</head>
<body>
	<h3>주소록 명단</h3>

<% 

	String url_mysql = "jdbc:mysql://192.168.150.230:3306/AddressBook?serverTimezone=Asia/Seoul&characterEncoding=utf8&useSSL=false"; // DB이름 주의
	String id_mysql = "root";
	String pw_mysql =  "qwer1234";
	
	String queryName = request.getParameter("query");
	String queryContent = request.getParameter("content");
	if(queryName == null) {			//맨처음 검색 전 검색내용이 없기 때문에 "" 처리 
		queryName = "address";
		queryContent = "";
	}

	String WhereDefault = "select seq, name,tel,address, email, relation from addressinfo ";
	String WhereDefault2 = "where " + queryName + " like '%" + queryContent + "%'";  //'%: 앞 %':뒤
	
	PreparedStatement ps = null; //	
	String query = "select seq, name, tel, address, email, relation from addressinfo" ; 

	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver"); // lib로 옮겨줬던 mysql jar파일 경로
		Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql); // java.sql로 선택해야함. sql과 연결
		Statement stmt_mysql = conn_mysql.createStatement();
	
		ResultSet rs = stmt_mysql.executeQuery(WhereDefault + WhereDefault2); // DB에서 테이블 준비만 해둔 상태. 자바로 가져와야 한다. rs를 통해 가져온다
		// Table안에 DB데이터 출력 하기 
		// <td> </td>포함해서 while문을 돌린다.
	
	
	
%>
		<form action="AddressBook_01.jsp">
			검색 선택:  
			<select name="query">
					<option value="name">이름 </option>
					<option value="tel">전화번호 </option>
					<option value="address" selected="selected">주소 </option>
					<option value="relation">관계 </option>
			</select>
				<input type="text" name="content">
				<input type="submit" value="검색">
		
		</form>
		<table border="1">
			<tr>
				<th>Seq</th> <th>이름</th> <th>전화번호</th> <th>주소</th> <th>전자우편</th> <th>관계</th>
			</tr>

<%		
	int count = 0;
	while(rs.next()){
%>
			<tr>
				<td align="right"> <a href="AddressBook_04.jsp?seq=<%=rs.getString(1)%>"> <%= rs.getString(1) %> </a>  </td>
				<td align="right"> <%= rs.getString(2) %> </td>
				<td align="center"> <%= rs.getString(3) %> </td>
				<td> <%= rs.getString(4) %> </td>
				<td> <%= rs.getString(5) %> </td>
				<td> <%= rs.getString(6) %> </td>
			</tr>
<% 	
		count = rs.getRow(); // while 돌아가는 만큼 총 인원수 count하기 
	}
%>	
		</table>		
	<form>
			<input type="submit" value="입력"><br>
	</form>
		<br>
		총 인원은 <%= count %>명 입니다.
<%
	conn_mysql.close(); // DB연결 끊어준다.
	
	}catch(Exception e){
		e.printStackTrace();
	}	
%>

<form action="AddressBook_02.jsp" method="post">
	<br> <input type="submit" value="추가 입력">
</form>

</body>
</html>