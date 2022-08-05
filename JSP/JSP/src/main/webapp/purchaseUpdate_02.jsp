<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
<%
	request.setCharaterEncoding("utf-8");
	String id = request.getParameter("userid");
	String strUserid ="";
	String strName =""; //찾은 name 받을곳
	String strTel ="";
	String strAddress ="";
	
	//database 연결문 
	String url_mysql = "jdbc:mysql://localhost:3306/eclipse?serverTimezone=Asia/Seoul&characterEncoding=utf8&useSSL=false";
	String id_mysql = "root";
	String pw_mysql = "qwer1234";
	
	String query ="select userid,name,tel,address form purchaseinfo where userid '" +id +"'";
	// query: PreparedStatement ps = null; 대신
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
		Statement stmt_mysql = conn_mysql.createStatement();
		
		ResultSet rs = stmt_mysql.executeQuery(query);
		//db에서 테이블 준비완료.rs를 통해 자바로 가져온다
		
		while(rs.next()){ //rs.next(): db에서 돌면서 값이 없을때까지 가져온다.데이터 여러개 활용시 arr로 
			strUserid = rs.getString(1);
			strName = rs.getString(2);
			strTel = rs.getString(3);
			strAddress = rs.getString(4);
		}
		conn_mysql.close(); //db연결 끊기
		
		if(strUserid.equals("")){
		out.print("<script>alert('데이터가 없습니다.');location.href='purchaseUpdate_01.jsp';</script>");
		}//데이터가 없으면 경고창 띄우고 첫번째 화면 가기, 이어서 써야함. 다른줄로 넘어가면 실행 안됨
		
		session.setAttribute("ID", strUserid);//키값 받아두기, 아이디는 키값이라 old,new 구분없음
		
		
		
	}catch(Exception e){
		e.printStackTrace();
	}
	response.sendRedirect("purchaseUpdate_04.jsp");
	
	
%>
<h3>수정 후 확인 버튼을 누르세요!</h3>
	<%
	request.setCharaterEncoding("utf-8");
	String userid = request.getParameter("userid");
	%>

	<form action="purchaseUpdate_03.jsp">
	사용자 ID : <input type="text" name="userid" value="<%=strUserid%>" readonly="readonly" > <br>
	성명 : <input type="text" name="name" value="<%=strName%>" readonly="readonly"> <br>
 	전화번호 : <input type="text" name="tel" value="<%=strTel%>" readonly="readonly"> <br>
 	주소 : <input type="text" name="address" value="<%=strAddress%>" readonly="readonly"> <br>

	<input type="submit" value="확인">

	</form>
		
</body>
</html>