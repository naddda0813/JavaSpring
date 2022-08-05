package com.springlec.base0701.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

import com.springlec.base0701.dto.BDto;
import com.springlec.base0701.util.Constant;

public class BDao {

	
	JdbcTemplate template;
	
	public BDao() {
		// TODO Auto-generated constructor stub
		this.template = Constant.template;
	}
	
	public void write(final String bName, final String bTitle, final String bContent) {
		
		this.template.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				// TODO Auto-generated method stub
				String query = "insert into mvc_board (bName, bTitle, bContent, bDate) values (?, ?, ?, now())";
				PreparedStatement pstmt = con.prepareStatement(query);
				pstmt.setString(1, bName);
				pstmt.setString(2, bTitle);
				pstmt.setString(3, bContent);
				return pstmt;
			}
		});
		
	}
	
	public ArrayList<BDto> list() {
		String query = "select bId, bName, bTitle, bContent, bDate from mvc_board";
		return (ArrayList<BDto>)template.query(query, new BeanPropertyRowMapper<BDto>(BDto.class));
	}
	
//	public BDto contentView(String strID) {
//		// TODO Auto-generated method stub
//		
//		BDto dto = null;
//		Connection connection = null;
//		PreparedStatement preparedStatement = null;
//		ResultSet resultSet = null;
//		
//		try {
//			
//			connection = dataSource.getConnection();
//			
//			String query = "select * from mvc_board where bId = ?";
//			preparedStatement = connection.prepareStatement(query);
//			preparedStatement.setInt(1, Integer.parseInt(strID));
//			resultSet = preparedStatement.executeQuery();
//			
//			if(resultSet.next()) {
//				int bId = resultSet.getInt("bId");
//				String bName = resultSet.getString("bName");
//				String bTitle = resultSet.getString("bTitle");
//				String bContent = resultSet.getString("bContent");
//				Timestamp bDate = resultSet.getTimestamp("bDate");
//				
//				dto = new BDto(bId, bName, bTitle, bContent, bDate);
//			}
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		} finally {
//			try {
//				if(resultSet != null) resultSet.close();
//				if(preparedStatement != null) preparedStatement.close();
//				if(connection != null) connection.close();
//			} catch (Exception e2) {
//				// TODO: handle exception
//				e2.printStackTrace();
//			}
//		}
//		return dto;
//	}
	
//	public void modify(String bId, String bName, String bTitle, String bContent) {
//		// TODO Auto-generated method stub
//		
//		Connection connection = null;
//		PreparedStatement preparedStatement = null;
//		
//		try {
//			connection = dataSource.getConnection();
//			
//			String query = "update mvc_board set bName = ?, bTitle = ?, bContent = ? where bId = ?";
//			preparedStatement = connection.prepareStatement(query);
//			preparedStatement.setString(1, bName);
//			preparedStatement.setString(2, bTitle);
//			preparedStatement.setString(3, bContent);
//			preparedStatement.setInt(4, Integer.parseInt(bId));
//			int rn = preparedStatement.executeUpdate();
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		} finally {
//			try {
//				if(preparedStatement != null) preparedStatement.close();
//				if(connection != null) connection.close();
//			} catch (Exception e2) {
//				// TODO: handle exception
//				e2.printStackTrace();
//			}
//		}
//	}
	
//	public void delete(String bId) {
//		// TODO Auto-generated method stub
//		Connection connection = null;
//		PreparedStatement preparedStatement = null;
//		try {
//			
//			connection = dataSource.getConnection();
//			String query = "delete from mvc_board where bId = ?";
//			preparedStatement = connection.prepareStatement(query);
//			preparedStatement.setInt(1, Integer.parseInt(bId));
//			int rn = preparedStatement.executeUpdate();
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		} finally {
//			try {
//				if(preparedStatement != null) preparedStatement.close();
//				if(connection != null) connection.close();
//			} catch (Exception e2) {
//				// TODO: handle exception
//				e2.printStackTrace();
//			}
//		}
//	}
	
	
}
