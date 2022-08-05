package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.MultiCalc;

public class main_01 {

	public static void main (String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	int choiceNumber;
	int firstNum, secondNum;
	
	System.out.println("1.덧셈");
	System.out.println("2.뺄셈");
	System.out.println("3.곱셈");
	System.out.println("\n 번호를 선택하세요 : ");
	choiceNumber = scanner.nextInt();
	
	System.out.println("첫번째 숫자를 입력하세요:");
	firstNum = scanner.nextInt();
	
	System.out.println("두번째 숫자를 입력하세요:");
	secondNum = scanner.nextInt();
	
	
	MultiCalc multi = new MultiCalc();
	multi.calc(choiceNumber,firstNum,secondNum);

	
	
	}
	
	
	
	
	
	
}
