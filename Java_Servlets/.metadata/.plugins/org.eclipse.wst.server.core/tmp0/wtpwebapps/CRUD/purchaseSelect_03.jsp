<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	request.setCharacterEncoding("utf-8");

	//불러오기
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");
	String address = request.getParameter("address");
	//불러온 값 세션에 저장 
	session.setAttribute("NEWNAME", name);
	session.setAttribute("NEWTEL", tel);
	session.setAttribute("NEWADDRESS", address);


	String url_mysql = "jdbc:mysql://localhost:3306/eclipse?serverTimezone=Asia/Seoul&characterEncoding=utf8&useSSL=false";
	String id_mysql = "root";
	String pw_mysql =  "qwer1234";
	
	//?로 setstring으로 update하는 ps세팅 
	PreparedStatement ps = null;
	String newUserid = (String) session.getAttribute("USERID");
	String newName = (String) session.getAttribute("NEWNAME");
	String newTel = (String) session.getAttribute("NEWTEL");
	String newAddress = (String) session.getAttribute("NEWADDRESS");
	

	try{
		Class.forName("com.mysql.cj.jdbc.Driver"); // 아까 lib로 옮겨줬던 mysql jar파일 경로
		Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql); // java.sql로 선택해야함. sql과 연결
		Statement stmt_mysql = conn_mysql.createStatement();

		String A = "update set wtest name =?, tel=?, address=? where userid =?";
		// id를 기준으로 내용 넣기, 물음표 순서대로 
			
			ps = conn_mysql.prepareStatement(A);
			ps.setString(1,newName);
			ps.setString(2,newTel);
			ps.setString(3,newAddress);
			ps.setString(4,newUserid);
			ps.executeUpdate();
			
			conn_mysql.close(); // DB연결 끊어준다.
			
			
	
	
	}catch(Exception e){
	e.printStackTrace();
	}
	response.sendRedirect("purchaseSelect_01.jsp");
%>	

</body>
</html>