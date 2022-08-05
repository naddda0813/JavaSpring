package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// API : Application Program Interface
		// 개발자들이 편리하게 사용할 수 있도록 정의한 클래스들의 집합
			
		String str1 = "abcdefg";
		String str2 = "HIJKLMN";
		String str3 = "opqrstu";
		String str4 = "	abc		def		ghi		";
		String str5 = "  abcdefg ";
		

		
		System.out.println(str1.concat(str2));			//concat로 이어서 배열
		System.out.println(str3.substring(3));			//0번부터 실행할때,3번문자r부터 실행
		System.out.println(str1.substring(3,5));		//3번부터 5번전까지
		
		String abc = str1.substring(3,5);
		System.out.println(abc);
		
		System.out.println(str1.length());
		System.out.println(str1.toUpperCase());			// 대문자 변환
		System.out.println(str2.toLowerCase());  		// 소문자 변환
		System.out.println(str1.equals(str4));			// 같지 않으면 false, 같으면 true
		//사용자 아이디나 비밀번호 입력 등 공백을 허용 안할때
		System.out.println(str4.trim());  				//앞과 뒤의 공백을 없앰
		
		System.out.println(str1.equals(str5.trim()));   //str1이 공백을 제외한 str5와 같은지 확인
		System.out.println(str1.replace('a', 'Z'));	   // a를 Z로 변환
		System.out.println(str1.replaceAll("abc", "ZZZZZZ"));
		System.out.println(str1.replaceAll("a", "    "));		//a를 없앰
	
		// 데이터가 커서 string 데이터 과소비
	
	
	
	
	
	
	
	}
	

}
