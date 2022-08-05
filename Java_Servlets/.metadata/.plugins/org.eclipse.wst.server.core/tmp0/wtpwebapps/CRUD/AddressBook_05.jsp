<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
	request.setCharacterEncoding("utf-8");
	
	String name = request.getParameter("name"); // 수정한 내용 받아오기
	String tel = request.getParameter("tel");
	String address = request.getParameter("address");
	String email = request.getParameter("email");
	String relation = request.getParameter("relation");

	session.setAttribute("NewName", name);	// 수정한 내용 저장
	session.setAttribute("NewTel", tel);	
	session.setAttribute("NewAddress", address);	
	session.setAttribute("NewEmail", email);	
	session.setAttribute("NewRelation", relation);	

	String url_mysql = "jdbc:mysql://192.168.150.230:3306/AddressBook?serverTimezone=Asia/Seoul&characterEncoding=utf8&useSSL=false";
	String id_mysql = "root";
	String pw_mysql =  "qwer1234";

	PreparedStatement ps = null; // values 뒤에 ?를 해석해준다 
	
	int seq = (int)session.getAttribute("SEQ"); // session 값은 object여서 string으로 선언해줌
	String newName = (String)session.getAttribute("NewName"); // session 값은 object여서 string으로 선언해줌
	String newTel = (String)session.getAttribute("NewTel"); // session 값은 object여서 string으로 선언해줌
	String newAddress = (String)session.getAttribute("NewAddress"); // session 값은 object여서 string으로 선언해줌
	String newEmail = (String)session.getAttribute("NewEmail"); // session 값은 object여서 string으로 선언해줌
	String newRelation = (String)session.getAttribute("NewRelation"); // session 값은 object여서 string으로 선언해줌
			
	try{
		Class.forName("com.mysql.cj.jdbc.Driver"); // 아까 lib로 옮겨줬던 mysql jar파일 경로
		Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql); // java.sql로 선택해야함. sql과 연결
		Statement stmt_mysql = conn_mysql.createStatement();

		String A = "update addressinfo set name = ?, tel = ?, address = ?, email =?, relation =? where seq = ?"; // SQL에서 쓰는 문장 그대로!
		
		ps = conn_mysql.prepareStatement(A);
		ps.setString(1, newName); // ? 순서대로
		ps.setString(2, newTel); 
		ps.setString(3, newAddress); 
		ps.setString(4, newEmail); 
		ps.setString(5, newRelation); 
		ps.setInt(6, seq); 
		ps.executeUpdate();
		
		conn_mysql.close(); // DB연결 끊어준다. 서버 접속 인원제한이 있기 때문에 끊어주지 않으면 몇번 클릭하면 서버에 접속할 수 없게 된다 
		
	}catch(Exception e){
		e.printStackTrace();
	}
	
	session.invalidate();
	response.sendRedirect("AddressBook_01.jsp");
	%>