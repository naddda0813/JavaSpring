package com.javalec.mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.javalec.mvc.dto.BDto;

public class BDao {

DataSource dataSource;
	
	public BDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//검색 
	public ArrayList<BDto> list(){		//return 값 , return=dtos를 해야 디비에서 검색 
		ArrayList<BDto> dtos = new ArrayList<BDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try { 
			connection = dataSource.getConnection();
			String query = "select aId, aName,aTel,aAddress,aEmail,aRela from addressbook"; //first row 
			preparedStatement = connection.prepareStatement(query);
			resultSet =preparedStatement.executeQuery();	//execute 
			
			while(resultSet.next()) {		//	매번 이 칼럼들이 만들어짐 
				int aId = resultSet.getInt("aId");
				String aName = resultSet.getString("aName");
				String aTel= resultSet.getString("aTel");
				String aEmail= resultSet.getString("aEmail");
				String aAddress= resultSet.getString("aAddress");
				String aRela= resultSet.getString("aRela");
				
				BDto dto = new BDto(aId, aName, aTel, aEmail, aAddress, aRela);//BDto에서 만듬 ,dto에서 필드 선언 필수 
				dtos.add(dto);		//dtos에 dto 한줄씩 더하기 
			}
				
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		finally {				//try catch 하고 나서 이상이 있든 없든 마지막에 오는 final
			try {
				if(resultSet != null) resultSet.close(); //데이터가 있으면 close
				if(preparedStatement !=null) preparedStatement.close();
				if(connection != null) connection.close();
 			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dtos;
		
		
	}
	
	public void write(String aName,String aTel,String aEmail, String aAddress,	String aRela) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try { 
			connection = dataSource.getConnection();
			String query = "insert into addressbook(aName,aTel,aEmail,aAddress,aRela)  values (?,?,?,?,?)"; //first row 
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, aName);
			preparedStatement.setString(2, aTel);
			preparedStatement.setString(3, aEmail);
			preparedStatement.setString(4, aAddress);
			preparedStatement.setString(5, aRela);
		
			preparedStatement.executeUpdate();
			
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		finally {				//try catch 하고 나서 이상이 있든 없든 마지막에 오는 final
			try {
				if(preparedStatement !=null) preparedStatement.close();
				if(connection != null) connection.close();
 			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
} //write
	
	public BDto modify(String abId) {		//데이터베이스에 저장 해야해서 dto
		BDto dto = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;		//검색 
		
		try { 
			connection = dataSource.getConnection();
			String query = "select * from mvc_board where bId = ?"; //first row 
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, Integer.parseInt(abId));
			resultSet =preparedStatement.executeQuery();	//execute 
			
			if(resultSet.next()) {		//	한번만 반복 
				int aId = resultSet.getInt("aId");
				String aName = resultSet.getString("aName");
				String aTel= resultSet.getString("aTel");
				String aEmail = resultSet.getString("aEmail");
				String  aRela = resultSet.getString("aRela");
				
				dto = new BDto(aId, aName, aTel, aEmail, aEmail, aRela) ;//BDto에서 만듬 
			}
				
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		finally {				//try catch 하고 나서 이상이 있든 없든 마지막에 오는 final
			try {
				if(resultSet != null) resultSet.close(); //데이터가 있으면 close
				if(preparedStatement !=null) preparedStatement.close();
				if(connection != null) connection.close();
 			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dto;
	}

	//modify 수정 

	public void last(int aId, String aName,String aTel,String aEmail, String aEmail, String aRela) {
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try { 
			connection = dataSource.getConnection();
			String query = "update mvc_board set bName = ? , bTitle= ?, bContent= ? ,bDate= now() where bId = ?"; //first row 
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, bName);
			preparedStatement.setString(2, bTitle);
			preparedStatement.setString(3, bContent);
			preparedStatement.setInt(4, bId);
		
			preparedStatement.executeUpdate();
			
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		finally {				//try catch 하고 나서 이상이 있든 없든 마지막에 오는 final
			try {
				if(preparedStatement !=null) preparedStatement.close();
				if(connection != null) connection.close();
 			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		




}	//modify 


	public void delete(int aId) {	// 데이터베이스(집)에서 가져와서 실행하는 게 아닌 새로 삭제이므로 리텁값도 없
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try { 
			connection = dataSource.getConnection();
			String query = "delete from addressbook where aId =?"; //삭제할where는 primary key 
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, aId);
		
			preparedStatement.executeUpdate();
			
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		finally {				//try catch 하고 나서 이상이 있든 없든 마지막에 오는 final
			try {
				if(preparedStatement !=null) preparedStatement.close();
				if(connection != null) connection.close();
 			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
} //delete 
	
	
	
	
}
