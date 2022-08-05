<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객 명단 리스트 </title>
</head>
<body>
	<h3>고객 명단 리스트</h3>
<% 
	String url_mysql = "jdbc:mysql://localhost:3306/eclipse?serverTimezone=Asia/Seoul&characterEncoding=utf8&useSSL=false";
	String id_mysql = "root";
	String pw_mysql =  "qwer1234";
		
	String query = "select userid,name,tel,address,insertdate from wtest" ;// 칼럼명이 전부 들어갈때는 * 로 적어주기 
	// query : prepared를 안쓰는 방법
	int count = 0 ;  //카운트변수 초기화 
	
	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver"); // 아까 lib로 옮겨줬던 mysql jar파일 경로
		Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql); // java.sql로 선택해야함. sql과 연결
		Statement stmt_mysql = conn_mysql.createStatement();

		//****
		ResultSet rs = stmt_mysql.executeQuery(query); // DB에서 테이블 준비만 해둔 상태. 자바로 가져와야 한다. rs를 통해 가져온다
%>	
		<table border="1">   <%-- 테두리 만들기  --%>
		<tr>
				<th>UserID</th><th>이름</th><th>전화번호</th><th>주소</th><th>입력일자</th>  <%--칼럼명 만들어주기, 첫번째 행 덮어씌움  --%>
		</tr>
<% 
		while(rs.next()){  	// rs.next() DB에서 돌면서 값이 없을때까지 가져온다 . 데이터가 여러개면 arr로 받아놓음
%>	
  		<tr>
  			<td><%=rs.getString(1) %></td>			<%-- mysql 대로 가져올때 ,칼럼인덱스값, 첫번째부터 아이디,이름,전번,주소,날짜  입력, mysql의 변수 타입과 일치해야 한다.varchar면 string --%>
  			<td><a href="purchaseSelect_02.jsp?userid=<%=rs.getString(1)%>"><%=rs.getString(2) %></a></td>  <%--a href: 하이퍼링크,화면에는 이름 하이퍼링크지만  이름이 키값 --%>
  			<td><%=rs.getString(3) %></td>
  			<td><%=rs.getString(4) %></td>
  			<td><%=rs.getString(5) %></td>
 		 </tr>
<%
		count= rs.getRow();  //mysal의 행을 세워준다]
		}
%>
	</table>
	
<%
		out.print("<h3>총 인원은 " + count + " 명입니다.<h3>");
		conn_mysql.close(); // DB연결 끊어준다.
		
	}catch(Exception e){
		e.printStackTrace();
	}

	%>	
	
	
</body>
</html>