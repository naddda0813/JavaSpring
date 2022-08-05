package com.javalec.basse;

import java.util.Scanner;

public class quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			// 더하기 할 숫자들의 개수를 정한후 숫자를 입력 받아 입력한 숫자의 합을 구하는 프로그램 작성
			// 누적합
				
			// 
		
		//숫자 입력 받기 
		   Scanner scanner = new Scanner(System.in);
		
			int i=0;
			int sum = 0;
			int intput = 0 ;
			int number = 0 ;
				
			
			System.out.print("몇개의 숫자를 더할까요? :");
		    number = scanner.nextInt()	;
			
		    System.out.print(number + "의 숫자를 입력하세요\n");
	
		    
			for(i=0;i<number;i++) 				//입력한 숫자만큼 입력되야 하므로
			{	sum += scanner.nextInt()	;
			}
			
			
	
			System.out.println("입력한 숫자의 합은" + sum + "입니다");	
				

				
				
				
				
				
		
		
		

	}
	

}
