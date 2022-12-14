package com.springlec.base0701.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.springlec.base0701.dto.BDto;
import com.springlec.base0701.util.Constant;

public class BDao {
	
	JdbcTemplate template;
	
	
//	DataSource dataSource;
//	//class
	public BDao()	{
		this.template = Constant.template;
		
	}
	
	public ArrayList<BDto> list(){
		String query = "select bId,bName,bTitle,bContent,bDate from mvc_board";
		return(ArrayList<BDto>)template.query(query,new BeanPropertyRowMapper<BDto>(BDto.class));
	

	}
	public BDto contentView(String sbId) {
		String query = "select * from mvc_board where bId =" +sbId;
		return template.queryForObject(query, new BeanPropertyRowMapper<BDto>(BDto.class));
		
	}
	//write
	public void write(final String bName,final String bTitle,final String bContent) { //final 사용자를 위해 개발자가 바꿀 수 없음 
		this.template.update(new PreparedStatementCreator() { //creator 새로 쓰는 거
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				// TODO Auto-generated method stub
				String query = "insert into mvc_board (bName, bTitle, bContent) values (?,?,?,now())";
				PreparedStatement psmt = con.prepareStatement(query);
				psmt.setString(1, bName);
				psmt.setString(2, bTitle);
				psmt.setString(3, bContent);
				
				return psmt;
			}
		}); //write
		
	}
	//수정 
	public void modify(final String bId,final String bName,final String bTitle,final String bContent) {
		String query ="update mvc_board set bName = ?, bTitle =? ,bContent = ? where bId =?";
		this.template.update(query, new PreparedStatementSetter() {	//setter임, 가져오는 정보 
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, bName);
				ps.setString(2, bTitle);
				ps.setString(3, bContent);
				ps.setString(4, bId);
				
				
			}
		});
	}
	//delete 
	public void delete(final String sbId) {
		String query= "delete * from mvc_board where bId =" + sbId;
		this.template.update(query, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException{
				ps.setString(1,sbId);
			}
			});
	} //delete 
	
	
 	

	
	
}
