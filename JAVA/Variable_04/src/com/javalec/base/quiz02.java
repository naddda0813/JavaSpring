package com.javalec.base;

import java.util.Scanner;

public class quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// BMI 계산기
		
		Scanner scanner = new Scanner(System.in) ; 
		// 신장 , 몸무게 입력받기
		System.out.println("신장(cm)을 입력하세요 : ");
		int heightNum1 = scanner.nextInt() ; 
		
		System.out.println("몸무게(kg)을 입력하세요 : ");
		int weightNum2 = scanner.nextInt() ; 
		
		double bmi = ( weightNum2 / ((heightNum1* 0.01)*(heightNum1* 0.01)) )  ;
		
		
		// 신장 입력 오류 거르기
		if (heightNum1 < 250 && heightNum1 >0  ) {
			System.out.println("몸무게(kg)를 입력하세요 : "); // 에러 메세지 출력
		int weight = new scanner.nextInt() ;
		if( weightNum2 <500 && weightNum2>0) 	// 몸무게 입력 오류 거르기
		
		 
			
			
			if( bmi >= 40)	{
				System.out.println("귀하는 고도비만입니다.체중감량이 필요합니다!");
			} else if ( bmi >= 30 && bmi< 40) 	{
				System.out.println("귀하는 비만입니다.체중감량이 필요합니다!");
			} else if ( bmi >= 25 && bmi < 30) 	{
				System.out.println("귀하는 경도비만입니다 주의를 요합니다!");
			} else if ( bmi >= 20 && bmi < 25) 	{
				System.out.println("귀하는 정상체중입니다.!");
			} else if ( bmi < 20) {
			System.out.println("귀하는 저체중입니다.체중증감이 필요합니다!");
			}	
			
			
		}
			
			
			
			
		}
		// test
//		if( bmi >= 40)	{
//			System.out.println("귀하는 고도비만입니다.체중감량이 필요합니다!");
//		} else if ( bmi >= 30 && bmi< 40) 	{
//			System.out.println("귀하는 비만입니다.체중감량이 필요합니다!");
//		} else if ( bmi >= 25 && bmi < 30) 	{
//			System.out.println("귀하는 경도비만입니다 주의를 요합니다!");
//		} else if ( bmi >= 20 && bmi < 25) 	{
//			System.out.println("귀하는 정상체중입니다.!");
//		} else if ( bmi < 20) {
//		System.out.println("귀하는 저체중입니다.체중증감이 필요합니다!");
//		}
//		
				
		
		
	
	
	}
	
