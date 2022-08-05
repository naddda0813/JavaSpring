package com.javalec.bbs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;  //context-type

import com.javalec.bbs.dto.BDto;


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

	
	public ArrayList<BDto> list(){		//return 값 
		ArrayList<BDto> dtos = new ArrayList<BDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try { 
			connection = dataSource.getConnection();
			String query = "select bId,bName,bTitle,bContent,bDate from mvc_board"; //first row 
			preparedStatement = connection.prepareStatement(query);
			resultSet =preparedStatement.executeQuery();	//execute 
			
			while(resultSet.next()) {		//	매번 이 칼럼들이 만들어짐 
				int bId = resultSet.getInt("bId");
				String bName = resultSet.getString("bName");
				String bTitle = resultSet.getString("bTitle");
				String bContent = resultSet.getString("bContent");
				Timestamp bDate = resultSet.getTimestamp("bDate");
				
				BDto dto = new BDto(bId, bName, bTitle, bContent, bDate); //BDto에서 만듬 
				dtos.add(dto);	//dtos에 dto 한줄씩 더하기 
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
		
		
	}//list
	
	public void write(String bName,String bTitle,String bContent) {
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			
			try { 
				connection = dataSource.getConnection();
				String query = "insert into mvc_board(bName,bTitle,bContent,bDate) values (?,?,?,now())"; //first row 
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, bName);
				preparedStatement.setString(2, bTitle);
				preparedStatement.setString(3, bContent);
			
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
	
	public BDto contentView(String sbId) {		//데이터베이스에 저장 해야해서 dto
		BDto dto = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;		//검색 
		
		try { 
			connection = dataSource.getConnection();
			String query = "select * from mvc_board where bId = ?"; //first row 
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, Integer.parseInt(sbId));
			resultSet =preparedStatement.executeQuery();	//execute 
			
			if(resultSet.next()) {		//	한번만 반복 
				int bId = resultSet.getInt("bId");
				String bName = resultSet.getString("bName");
				String bTitle = resultSet.getString("bTitle");
				String bContent = resultSet.getString("bContent");
				Timestamp bDate = resultSet.getTimestamp("bDate");
				
				dto = new BDto(bId, bName, bTitle, bContent, bDate); //BDto에서 만듬 
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
	}	//contentView
	
	

	
	
	
	public void modify(int bId, String bName,String bTitle,String bContent) {
			
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
	
	
	
	
	
	
	
	
	
	
	
}
