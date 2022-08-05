package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.AdditionJY;
import com.javalec.function.Gopsem;
import com.javalec.function.GugudanJE;
import com.javalec.function.Multiple;
import com.javalec.function.SumJ;

public class Main {
	
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int choice = 0;			//기능을 선택하는 변수
		int num1;		// 첫번째 수 입력받기
		int num2;		// 두번째 수 입력받기
		
		System.out.println("**원하는 기능을 선택하세요");
		System.out.println("1. 덧셈, 뺄셈");
		System.out.println("2. 곱셈, 나눗셈");
		System.out.println("3. 범위의 합계 구하기");
		System.out.println("4. 범위의 곱셈 구하기");
		System.out.println("5. 범위의 구구단 구하기");
		System.out.println("6. 종료");
		
		
		
		
		// 사용자 입력값 받기
		System.out.print("==> 선택 : ");
		choice = scanner.nextInt()	;
		// 불러오기
		AdditionJY additionJY = new AdditionJY();
		Multiple multiple = new Multiple();
		SumJ sumJ = new SumJ();
		GugudanJE gugudanJE = new GugudanJE();
		Gopsem gopsem = new Gopsem();
		
		
		while(1>0) {
			
			System.out.println("- 첫번째 수를 입력하세요 :");
			num1 = scanner.nextInt()	;
			
			System.out.println("- 두번째 수를 입력하세요 :");
			num2 = scanner.nextInt()	;
			
			
			
			if(choice == 1) {
				additionJY.addition(num1, num2);
				additionJY.substraction(num1, num2);
			} 
			
			if(choice == 2) {
				multiple.multiplition(num1, num2);
			}
			
			if(choice == 3) {
				sumJ.Sum(num1, num2);
			} 
			
			if (choice == 4) {
				gopsem.rangeMulti(num1, num2);
			}
			
			if (choice == 5) {
				gugudanJE.gugudan(num1, num2);
			}
			
			if(choice == 6) {
				System.out.println("종료되었습니다.");
			}break;
	}
	
	}	
	
}
	
	
	
	
	
	
	
	
	
	


