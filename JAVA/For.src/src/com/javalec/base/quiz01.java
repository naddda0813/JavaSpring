package com.javalec.base;

import java.util.Scanner;

public class quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 시작하는 숫자, 끝숫자 범위 정하기
		// 환경변수 정의
		Scanner scanner = new Scanner(System.in);
		int startNum = 0 ; 		// 시작 숫자			
		int endNum = 0 ;		// 끝숫자
		int leftNum = 0 ; 		// 나머지
		int sum = 0 ; 			//조건에 맞는 수의 합계
		int count = 0 ; 		// 조건에 맞는 갯수
		double avg = 0 ; 		// 나머지가 5인 수둘의 sum 들에 대한 평균
		int max = 0 ; 			// 최대값
		int min = 0 ;			// 최소값
		int tempNum = 0 ;		// 시작과 끝의 변수
	
		
	
		// 사용자로부터 data 받아오기
		
		System.out.print("1. 시작하는 숫자를 정하세요 : ");
		startNum = scanner.nextInt();
		System.out.print("2. 범위의 끝 숫자를 정하세요 : ");
		endNum = scanner.nextInt();
		System.out.print("3. 원하는 나머지 값은? : ");
		leftNum = scanner.nextInt();
		
		// 시작 숫자가 끝 숫자보다 큰 경우 
		if (startNum > endNum ) {	
			tempNum = endNum	;					//tempNum을 통해 임시 변수 설정, A=B
			endNum = startNum	;					//B=C
			startNum = tempNum 	;					// C=A를 통해 시작 숫자를 최종 임시 변수에 출력100
		}
		
		

		
		// 10으로 나누고 범위 중 %5인 숫자의 갯수 구하기 
		for (int i = startNum ; i<= endNum ; i++) {
			//나머지의 조건에 맞는 경우
			
			if(i % 10 == leftNum  ) {		//  나머지가 5에 해당하면 sum에 더해주고 count에 새준다
				count++;						// 더하기 1하여 갯수 세기
				sum += i ;						//합계
				
				if	(i > max); {			// 사용자가 입력한 값이 최대값보다 크면, 최대값으로 전환
				max = i ;
			}
				if(min == 0 ) {
					min = i ; 
			}
	}
}
		
			avg = sum / (double)count	;			// 평균은 합에서 나누기 갯수
		
		//결과 출력
		
		System.out.println("<분석결과>");
		System.out.println(+ startNum + "부터 " + endNum + "까지의 범위 중 나머지가 " + leftNum + "인 숫자의 갯수는 " + count + "개이고 합은 " + sum +"입니다.");
		System.out.println("그리고 나머지가 " + leftNum + "인 숫자의 평균은 "+avg+ "이고");
		System.out.println("나머지가 " + leftNum + "인 숫자 중 최대숫자는" + max + "이고 최소 숫자는 " + min + "입니다.");
		
		
	
}
}
	
	
		
		
		
	
		
		
		
		// 최대 숫자 구하기 max min
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	
	
	
	
	

