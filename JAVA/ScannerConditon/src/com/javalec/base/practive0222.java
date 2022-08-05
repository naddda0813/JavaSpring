package com.javalec.base;

import java.util.Scanner;

public class practive0222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		// 첫번째 숫자를 입력하세요 : 591
		// 두번째 숫자를 입력하세요 : 456
		// 첫번째 숫자가 두번째 숫자보다 크면 Hello World!를 출력하세요
		// 첫번째 숫자가 두번째 숫자와 같으면 Goodbye!를 출력하세요
		// 첫번째 숫자가 두번째 숫자보다 작은면 Good Morning!를 출력하세요
		
		
		Scanner scanner = new Scanner(System.in) ;
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int intNum1 = scanner.nextInt() ;  			// scanner 친 뒤 ctrl스페이스로 nextInt 입력
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		int intNum2 = scanner.nextInt() ; 
		
		if(intNum1 > intNum2)  {
			System.out.println("Hello World!");
		} else if(intNum1 == intNum2) {				// =이 아니라 ==으로 바꾸기
			System.out.println("Good Bye!");
		} else  {
			System.out.println("Good Morning");
		}
			
		
		
		
		
		
		
		
		
		
		
		
	}

}
