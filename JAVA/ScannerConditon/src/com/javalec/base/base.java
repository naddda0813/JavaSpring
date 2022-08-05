package com.javalec.base;

import java.util.Scanner;

public class base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 첫번재 숫자를 입력하세요 : 40
		// 두번재 숫자를 입력하세요 : 30
		// 입력하신 40과 30의 합은 70입니다.
		
		Scanner scanner = new Scanner(System.in) ;
		System.out.print("첫번재 숫자를 입력하세요 :");
		int intNum1 = scanner.nextInt() ;

		System.out.print("두번재 숫자를 입력하세요 :");
		int intNum2 = scanner.nextInt() ;
		
		System.out.println("입력하신 " +(intNum1)+"과 " +(intNum2)+"의 합은 "  + (intNum1 + intNum2) +  "입니다.");
		
		
	}
	
	
	

}
