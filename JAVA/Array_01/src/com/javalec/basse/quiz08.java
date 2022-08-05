package com.javalec.basse;

import java.util.Scanner;

public class quiz08 {

	public static void main(String[] args) {
		// 아래의 그림과 같이 고객의 입금, 출금 및 현황을 관리하는 program 작성
		
		Scanner scanner = new Scanner(System.in);
		int workNum = 0;					//작업번호
		int[] guestNum = new int [10] ;			//고객번호
		
		int total = 0;				//입금금액
		
		System.out.println("1.입금");
		System.out.println("2.출금");
		System.out.println("3.현황");
		System.out.println("4.종료");
		
		// 사용자 입력받기
		System.out.print("번호를 산택하세요:");
		workNum =  scanner.nextInt()	;
			
		
		//고객번호, 금액 입력받기
		for(int i=0;i<4;i++ )  {
			System.out.print("고객번호:");
			guestNum[i] = scanner.nextInt();
		}
		
		
		System.out.print("금액:");
		total = scanner.nextInt();
		
		//입금 결과 출력하기
		for(int i=0;i<=guestNum;i++)	{
			if (int worknum == 3) {
				System.out.println("잔액이 부족합니다!");
			} else  {
				System.out.println("입금결과 < 고객번호 :" +guestNum + "\n잔액 :" +total + ">"	);
			}
		
	}

		
		
		
}}

