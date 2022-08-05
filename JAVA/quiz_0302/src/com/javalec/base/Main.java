package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.ConstDan;
import com.javalec.function.FieldDan;

public class Main {

	public static void main(String[] args) {
		// 입력 받은 숫자로 구구단을 출력하느 프로그램을 class를 분리해서 객체지향 형식으로 작성
		
		//구구단을 출력할 숫자 입력하기
		Scanner scanner = new Scanner(System.in);
		System.out.println("구구단을 출력할 숫자를 입력하세요 : ");
		int dan = scanner.nextInt()	;
	
	
		// ---- Field 이용 ----
		//FieldDan 선언
//		FieldDan fieldDan = new FieldDan();
		//fieldDan의 dan field(public)에 dan 입력,constructor
//		fieldDan.dan = dan;
		//fieldDan의 출력 메소드를 통해 구구단 출력
//		fieldDan.printDan();
		
		//fieldDan의 Array return 메소드로 Array 받아옴
	//	String[] stringArr = fieldDan.returnArrDan();
		//받아온 Array 출력
	//	for(int i = 0;i < stringArr.length;i++) {
	//		System.out.println(stringArr[i]);
		}
		
	
		//ConstDan 이용
		// dan을 넘기며 ConstDan 선언
		ConstDan constdan = new ConstDan(dan) ;
		constDan.printDan();
		
}
		
		
		
	


