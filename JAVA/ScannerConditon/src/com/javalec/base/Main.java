package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Scanner를 이용한 입력 받기
		Scanner scanner = new Scanner(System.in) ; // = 뒤에 생성자 이름, scanner를 치고 ctrl 스페이스하고 import 누르기
		// scanner를 오브젝트, 인스텐스, 객체라 부름
		
		
		// Console에서  Data 가져오기
		System.out.print("숫자를 입력하세요!");
		int intNum1 = scanner.nextInt();
		
		
		// 가져온 데이터 출력하기, console칸에 숫자 치기
		System.out.println("입력한 숫자는 " + intNum1 + "입니다.");
		
		//입력하신 숫자는 짝수입니다. or 홀수입니다, console 칸에 숫자 치기
		if(intNum1%2 == 0) {
			System.out.println("입력하신 숫자는 짝수입니다");
		} else 
			System.out.println("입력하신 숫자는 홀수입니다");
			
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
