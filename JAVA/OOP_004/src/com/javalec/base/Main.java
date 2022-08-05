package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Addition;

public class Main {

	public static void main(String[] args) {
		//----------------------------
		// 두개의 정수를 입력 받아 덧셈 기능 구현하기
		//----------------------------
		
		Scanner scanner = new Scanner(System.in);
		int num1 = 0; 	// 첫번째 수 		
		int num2 = 0;	// 두번째 수
		
		
		// 두개의 수를 입력 받기
		System.out.println("첫번째 수를 입력하세요 : ");
		num1 = scanner.nextInt();
		
		System.out.println("두번째 수를 입력하세요 : ");
		num2 = scanner.nextInt();
		
		// 덧셈 기능 구현하기
		// Case 1 : Field를 이용하여 계산하기, Addition class에서 addAction의 메소드이용
		// 필드란 클래스에 포함된 변수
		Addition addition = new Addition ()	;
		addition.num1 = num1;
		addition.num2 = num2;
		addition.addAction(); 	// 
		
		// Case 2 :  addtion.addAction();
		int addResult =addition.addReturn();
		System.out.println(num1 +" + "+num2+ "=" +addResult);
		
		
		
		
		
		
		
		
		
	}

}
