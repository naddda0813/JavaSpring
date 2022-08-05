package com.javalec.basse;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
	
		String[] name = {"James", "Cathy", "Kenny", "Martin", "Crystal"} ;
		int[] tall = new int[name.length] ;			//신장 숫자값 배열 만들어줌, 키를 저장하는 배열ㄹ
		Scanner scanner = new Scanner(System.in) ;
		
		int total = 0 ;    	// 신장들의 합
		double avg = 0 ;	// 신장의 평균			
		int max = 0 ;		// 신장의 최대값
		int min = 1000; 		// 신장의 최소값, 비교해야하므로 넉넉히 크게 잡는다.
		String maxName = "";
		String minName = "";
		
	
			
		
		
		// 입력받아오기
		for(int i=0;i<name.length;i++)	{
			System.out.print(name[i]+"의 신장을 입력하세요!"); //처음부터 1번째 배열 이름 출력됨
			tall[i]= scanner.nextInt()	;
			total +=tall[i] ;
		
		
		// 평균신장: 합계를 이용해서 갯수만큼 나누기
			//최대값
			 if(tall[i] > max ) {			// 배열의 첫번째 값(170이 max 값보다 크면
				max= tall[i];				// a[i]번째 값이 최대값으로 됩니다.
				maxName = name[i];
			} //최소값
			 if(tall[i] < min) {			// 배열의 첫번째 값(165)이 min 값보다 작으면 
				min= tall[i] ;				// a[i]번째 값이 최소값으로 됩니다.
				minName = name[i];
			}	
		}
	
		avg = total /(double) tall.length ;
			
		System.out.println("평균신장(cm)은 : " + avg );		
		
		//최대신장,최소신장 구하기, 이름알려주기, 출력하기
		System.out.println("가장 큰 학생은 " +maxName+ "이고, 그 학생의 키는 " + max + "cm입니다." );
		System.out.println("가장 작은 학생은 " +minName+ "이고, 그 학생의 키는 " + min + "cm입니다." );
//			
			
		
		
		
		
		
		
	}

}
