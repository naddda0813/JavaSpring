package com.javalec.base;

import java.util.Scanner;

public class pratice0223 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in) ;

		// startNumber, endNumber 설정
		System.out.print("Start Number : ");
		int staNum = scanner.nextInt();
		System.out.print("End Number : ");
		int endNum = scanner.nextInt();
		
		
		int sumEven = 0; 		// 짝수의 합 
		int sumOdd = 0 ; 		// 홀수의 합
		for(int i= staNum; i<= endNum; i++ ) 
		{
		 if (i%2==0) {
			 sumEven += i;
		 }else {
			 sumOdd += i;
		       }
		}
		// 소수점까지 반영하기 위해 double 변수 선언
		double avg = ( (sumEven +sumOdd) /(endNum - staNum + 1) );// 전체의 합 / 전체의 갯수	
		
		System.out.println(+staNum+ "부터 " +endNum+ "까지의 수중 짝수의 합은 "+ sumEven + "이고 홀수의 합은" + sumOdd + "이고 전체 평균은"+ avg + "입니다"  );
	

	}
}
