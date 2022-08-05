package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//정수를 변수로 선언
	//	for(int i= 1;i<=10;i++) {    				//처음값/ 최종값/ 증가값 // 홀수 선언 방법
	//		System.out.println(i);
	
		
		//1부터 10까지의 홀수만 구하기
	//	for(int i= 1;i<=10;i=i+2) {    				//처음값/ 최종값/ 증가값 // 홀수 선언 방법
	//	System.out.println(i);
			
		// 첫숫자부터 끝숫자까지의 정수의 합
		//환경변수 정의
//		Scanner scanner = new Scanner(System.in);
//		int startNum = 0 ; // 첫번째숫자
//		int endNum = 0 ; // 끝숫자
//		int sum = 0 ;
//		
//		// 사용자로부터 입력값 받기
//		System.out.println("Start Number : " );
//		startNum = scanner.nextInt();
//		
//		System.out.println("End Number : ");
//		endNum = scanner.nextInt() ;
//		
//		//처리하기
//		for(int i=startNum; i<=endNum; i++ ) {
//			sum += i;
//		}
//		
//		//출력하기
//		System.out.println( +startNum +" 부터 " + endNum + " 끼지의 합은 " + sum + " 입니다.");
//		
//	}
//}
		
//
//		//1부터 10까지의 수들의 합계구하기
//		int sum = 0; //누적변수
//		for(int i=1; i<=10; i++) 
//		{
//			sum += i;	    	//sum =sum+i, 누적변수
//	    }									
//		System.out.println("1부터 10까지의 합은 " + sum + " 입니다.");
//	}
//
	
	//for 문 하나 사용하여 1부터 100까지의 수중 홍수의 합과 짝수의 합을 각각 구해라
		int sumEven = 0;  				// 짝수의 값
		int sumOdd = 0 ; {				// 홀수의 값
		for(int i=1;i<=100;i++)
		{	if (i % 2 == 1 ) {
			sumOdd += i ;
		}	else	{
			sumEven	+= i ;
		}
		}
			
			
			System.out.println("1부터 100까지의 홀수의 합은 " + sumOdd	+	"입니다.");
			System.out.println("1부터 100까지의 짝수의 합은 " + sumEven + " 입니다.");
			
		}
	
	}
}
		
		


		
		
	
	
	
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


