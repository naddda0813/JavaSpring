package com.javalec.basse;

import java.util.Scanner;

public class quiz06 {

	public static void main(String[] args) {
			//  몇개의 숫자를 입력할지 결정한 후 숫자 입력하고 이 중 검색을 원하는 숫자의 위치 파악
		Scanner scanner = new Scanner(System.in)	;
		int total = 0 ;			// 숫자의 갯수
		int position = 0;  		// 삽입 숫자위치
		int insNum = 0 ; 		// 삽입하는 숫자
		int[] num = new int[total];
		
		
		// 입력할 숫자 갯수 입력 받기
		System.out.print("입력할 숫자의 갯수? :");
		total = scanner.nextInt()	;
		
		System.out.println(total + "개의 숫자를 입력하세요!:");
		
		//입력한 숫자만큼 수 입력
		for(int i=0;i<total;i++) {
			System.out.print((i+1)+"의 숫자:");
			num[i]=	scanner.nextInt() ; 
		}
		
		
		// 삽입할 번지수 받기
		System.out.print("숫자를 삽입하고자 하는 위치는?");
		position = scanner.nextInt() 	;
		
		// 삽입할 숫자 받기
		System.out.println("삽입하고자 하는 수는?");
		insNum = scanner.nextInt()	;
		
		// 처리하기
		for(int i=total-1; i>=position-1; i--)  {// 순서 역순으로 적기, 점점 작아지는 형태, 0부터 시작하므로 total-1, 삽입하느 뒤의 데이터 배열 바꾸기
			num[i+1]= num[i] ;
		}
		num[position-1] = insNum;
		
		
		// 결과 출력하기
		System.out.println("-----결과------- ");
		
		for(int i=0; i<total;i++) {
			System.out.println(String.format("%3d", num[i]));
		}

			
			
			
			
		}

}


