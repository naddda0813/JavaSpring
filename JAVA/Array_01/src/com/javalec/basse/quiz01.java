package com.javalec.basse;

import java.util.Scanner;

public class quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력한 숫자부터 4개를 증가하여 화면 가로로 구구단 표시, +3단까지
		// 단 * 곱 
		
		
		int i = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.println("Input your number : " );
		int num = scanner.nextInt()	;
		
		for(i=1;i<=9;i++)	{
		
			System.out.println(num + "*"+ i +"=" +(num*i) + "\t"
					+(num+1) + "*"+ i +"=" +((num+1)*i) + "\t"
					+(num+2) + "*"+ i +"=" +((num+2)*i) + "\t"
					+(num+3) + "*"+ i +"=" +((num+3)*i) + "\t"
					);
					
			
					
		}
		
//		//입력한 수의 factorial 구하기 예: 4! = 4*3*2*1
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Input your decimal no. : ");
//		int number =  scanner.nextInt()	;
//		
//		int i = 0 ;		// 입력값 
//		int factNum = 1; // 팩토리얼 결과값, 0을 초기값으로 잡으면 곱하기라 0이라는 결과값 나옴
//		
//		for(i=1;i<=number;i++)	{
//			
//		factNum *= i   ;// 누적곱  3은 2의 곱에다 3을 곱합것
//				
//		}
//		System.out.println(number +"'s factorial value = "  + factNum  );
//				
//		
//		
		
		
		
		
		
		

	
	
}
}


