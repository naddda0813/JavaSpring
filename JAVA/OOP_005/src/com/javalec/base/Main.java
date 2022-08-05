package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Calc;
import com.javalec.function.ConstCalc;

public class Main {

	public static void main(String[] args) {
		
		// 두개의 정수를 입력받아 사칙연산 수행
		Scanner scanner = new Scanner(System.in);
		int num1 = 0 ;  // 첫번째수
		int num2 = 0 ;  // 두번째 수
		
		// 두개의 수를 입력받기
		System.out.println("첫번째 정수를 입력하세요 : ");
		num1 = scanner.nextInt()	;
		System.out.println("두번째 정수를 입력하세요 : ");
		num2 = scanner.nextInt()	;
		
		ConstCalc calc = new ConstCalc(num1,num2);
		System.out.println(num1+"+"+ num2 + "=" + calc.addition());
		// 필드 이용하기, 뺄셈
		//Calc calc = new Calc();
		/*	calc.num1 = num1;
		calc.num2 = num2;
		calc.addition() ;
		calc.subtraction();
		calc.multiple();
		calc.division();
		calc.calcAll();			// 한번에 실행
*/		
		//void 없을때, 뺄셈 
		// 마이너스결과값 저장
		
/*		int addResult = calc.addAction(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + calc.addAction(num1,num2) );
		
		int minusResult = calc.minusAction(num1,num2);
		System.out.println(num1 + " - " + num2 + " = " + (calc.minusAction(num1,num2))); //calc.minusAction() 대신 minusResult 넣어도 됌
		
		int multipleResult = calc.multipleAction(num1,num2);
		System.out.println(num1 + " * " + num2 + " = " + multipleResult);
		
		double divisionResult = calc.divisionAction(num1,num2);
		System.out.println(num1 + " / " + num2 + " = " + divisionResult);
*/	
		
	
	}
}
