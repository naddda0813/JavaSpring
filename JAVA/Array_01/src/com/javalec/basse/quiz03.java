package com.javalec.basse;

import java.util.Scanner;

public class quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 몇개의 숫자를 입력하지 결정한후 숫자를 입력하고 이중 최대값의 위치와 최대값을 구하라
//		Scanner scanner = new Scanner(System.in);
//		
//		// 변수 선언
//		int inputNum = 0 ;		// 몇개의 숫자를 넣을지
//		int max = 0 ;
//		int order = 0 ; 		// 최대값이 몇번재인지 알아낼 변수
//		
//		//사용자 입력값 받기
//		System.out.print("숫자의 개수를 입력하세요(100개 미만) :");
//		inputNum = scanner.nextInt()	;
//		int num[] = new int[inputNum] ;			//입력하는 수의 배열
//		
//		// 100 보다 큰 수 입력 시키기 ,에러발생하게
//		if(inputNum > 100) {
//			System.out.println("너무 큰 수를 입략하였습니다.");
//		} else {
//		System.out.println(inputNum + "개의 수를 입력하세요!");
//			for(int i=0; i<inputNum;i++) {
//				num[i]= scanner.nextInt() ; 
//				if(num[i]> max )	{
//					max = num[i] 	;
//					order = i +1  ;		// 배열이라는 순서 안에서 0부터 시작하니 +1
//				}
//			}
//		}
//		
//		System.out.println("입력한 숫자중 최대값은 " + max + "이고 " + order + "번쩨 값입니다" );
//		
		// 각자리의 수의  합을 구하는 프로그램을 작성, 0과 9를 입력시 탈락
		Scanner scanner = new Scanner(System.in) ;
	
		int num = 0 ;

		
		int sum= 0 ;		// 한자리씩 더한값
		
		// 입력한 숫자의 한자리마다의 숫자를 받는변수 , 수하나하나를 입력값으로 보기
	
		
		
		System.out.println("Enter an integer(0 ~ 9) :" );
		num = scanner.nextInt() ;
		
		
		while(num>0)	{
			sum= sum + (num%10) ;
			num = num / 10 ;
					
		}
		System.out.println("Sum of digits = " + sum );
		
		
		
		
		
	}
}


