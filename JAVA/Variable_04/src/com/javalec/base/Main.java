package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 금액을 입력하세요 : 8000
		// 금액이 8000이 넘으면 너무 비쌉니다.
		// 금액이 5000이 넘으면 너무 비쌉니다.
		// 금액이 3000이 넘으면 너무 비쌉니다.
		// 금액이 그 이하면  싼편입니다
		
		
		
		Scanner scanner = new Scanner(System.in) ; // 환경설정
		System.out.print("금액을 입력하세요 : ");			// 금액 입력 받기
		int priceNum1 = scanner.nextInt() ;
	
		
		if(priceNum1 > 8000) {
			System.out.println("너무 비쌉니다.");
		} else if(priceNum1 > 5000) {
			System.out.println("조금 비쌉니다.");
		} else if(priceNum1 > 3000) {
			System.out.println("적당한 금액입니다.");
		} else {
			System.out.println("싼 편입니다.");
		}
		
		// 큰 금액이 기준일 때는 큰 금액부터 조건제시, 작은 금액이 조건 일때는 작은 금액부터 조건제시
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
