package com.javalec.basse;

import java.util.Scanner;

public class quiz07 {

	public static void main(String[] args) {
		// 몇개의 숫자를 입력한지 결정한후 숫자를 입력하고 이중 필요없는 숫자의 위치를 정해 삭제
		Scanner scanner = new Scanner(System.in);
		int count= 0 ;			// 삽입할 숫자의 갯수
		int position = 0 ;        // 삭제할 숫자의 위치
		int insNum = 0 ; 		// 삽입하는 숫자
		int[] num = new int[100];
		
		//입력값 받아오기
		System.out.print("입력할 숫자의 갯수?:");
		count= scanner.nextInt();
		
		System.out.println(count+"개의 숫자를 입력하세요!:");
		
		//숫자 받아오기
		for(int i=0;i<count;i++) {
			System.out.print((i+1)+"의 숫자: ");
			num[i]= scanner.nextInt();
		}
		System.out.print("몇번째의 숫자를 삭제하시겠습니다?:");
		position = scanner.nextInt()	;
		
		
		
		// 처리하기
		for(int i=count-1; i>=position; i--)  {// 순서 역순으로 적기, 점점 작아지는 형태, 0부터 시작하므로 total-1, 삽입하느 뒤의 데이터 배열 바꾸기
			num[i+1]= num[i] ;
		}
		num[position] = insNum;
		
		
		
		
		
	
		
		// 결과 출력하기
		System.out.println("-----결과-------");
		for(int i=0; i<count;i++) {
			System.out.println(String.format("%3d", num[i]));
		}
		
		
		
	//	System.out.println(num[i]);
		
		
	}

}
