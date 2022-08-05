package com.javalec.base;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance()	;
		
		int year = calendar.get(Calendar.YEAR);		//현재년도
		int month = calendar.get(Calendar.MONTH)+1;		//1월은 0월로 시작하므로 +1
		int day = calendar.get(Calendar.DAY_OF_MONTH);	//날짜
		int hour = calendar.get(Calendar.HOUR_OF_DAY);	//시
		int minute = calendar.get(Calendar.MINUTE);		// 분
		int second = calendar.get(Calendar.SECOND);
		
		System.out.println(year+"." + month + "."+ day);
		System.out.println(hour +":"+minute+ ":"+ second);    		//24시 기준으로 몇시인지
		
	}

}
