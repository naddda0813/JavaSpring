package com.javalec.base;

public class Variable_01 {
	
	// Method
	public static void main(String[] args) {
		
		int intNum1 = 10 ; // 정수 테스트 값
		char char01 = 'A'; // 문자 테스트 값
		
		System.out.println(intNum1);
		System.out.println(char01) ;
		
		//intNum1의 값을 100으로 변경하여 출력하기
	
		intNum1 = 100; // 정수 선언은 위에서 했으므로 두번 안해도 됨
		System.out.println(intNum1);

		// 상수 변수 정의하기
		final int fixedNum = 100 ; // 변수 고정값으로 픽스
		System.out.println(fixedNum);
		
		// 실수 출력하기
		float floatNum1 = 3.14f; // f를 쓰지 않으면 unvaild
		double doubleNum1 = 3.14; // 소수는 double로
		final double pi = 3.14157;
		
		System.out.println(doubleNum1);
		System.out.println(pi);
		
		// 문자열 출력하기
		String str1 = "Good Morning!" ; // 문자열 출력만 대문자, 클래스로 만든 변수
		System.out.println(str1);
		
		//Boolean 출력하기
		boolean bool1 = true ; //true or false로만 출력, 문자열 아님
		System.out.println(bool1);
	
		
		
		
		
		
	}
	
	
	
	
	
}
