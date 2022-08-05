package com.javalec.base;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//선언문
		Scanner scanner = new Scanner(System.in) ;
		int inputNumber = 0; // 사용자 입력 숫자
		String result = "" ; // 짝수 홀수 결과 값, 짝수입니다 홀수입니다 알려줌
		
		
		//사용자입력
		System.out.print("숫자를 입력하세요!");
		inputNumber = scanner.nextInt() ;
		
		//결과 출력 :  IF문 사용
		if(inputNumber % 2 == 0) {
			result = "짝수";
		}else {
			result = "홀수";
		}
		
		
		// 짝홀수 판단 : switch문 사용
		switch(inputNumber % 2) {
		case 0:						// 답이 0이면
			result = "짝수" ;
			break;
		case 1:						// 답이 1이면
			result = "홀수" ;
			break;
		default :				// 그외의 값
			break;				// break를 걸지 않으면 그 다음줄로 값이 변환됨
		}
		
		
		
		
		
		
		
		
		
		
		
		
		// 화면 출력
		System.out.println("입력하신 숫자 " + inputNumber + "는 " + result + "입니다.");
		
	}

}
