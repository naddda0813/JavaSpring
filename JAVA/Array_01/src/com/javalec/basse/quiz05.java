package com.javalec.basse;

import java.util.Scanner;

public class quiz05 {

	public static void main(String[] args) {
		//학생수가 4명이고 과목이 3과목일 경우의 점수 합계와 평균 구하기 기능 추가
		
		// 성적입력은 for문 성적입력 안에 과목이 들어가게
		// 한명당 과목의 점수를 배엺로 입력
		Scanner scanner = new Scanner(System.in);
		int[] score= new int[4]; 		// 과목별 4명까지 입력
		int[] avg = new int[3];		// 인원별 3과목까지 입력
		int[][]	arr = new int[3][4];
		int total = 0 ;
		
		
		
		
		
		
		//데이터값 입력받기
		System.out.println("Korean의 성적을 입력:");
		
		for(int i=0;i<score.length;i++){
		System.out.print("No"+(i+1)+	"의 성적은 : ");
		int kor = scanner.nextInt() ;
		}
		
		System.out.println("English	의 성적을 입력:");
		
		for(int i=0;i<score.length;i++){
		System.out.print("No"+(i+1)+	"의 성적은 : ");
		int eng = scanner.nextInt() ;
			}
		
		System.out.println("Mathmatics의 성적을 입력:");
		
		for(int i=0;i<score.length;i++){
		System.out.print("No"+(i+1)+	"의 성적은 : ");
		int mat = scanner.nextInt() ;
			}
		
		// 한명당 과목별 점수와 평균구하기
		
		
		
		
		
		System.out.println("\tKorean\t\t"+"English\t\t"+"Mathmatics\t"+"Total\t"+"Average");
		for(int i=0;i<arr.length;i++ )	{  	//과목별 점수
			for(int j =0;j<arr[i].length;j++)	{
				System.out.println(arr[i][j]+ "\t");
			}
			System.out.println("No" +(i+1 )); 
	//		for(int j=0;j<histo.length;j++ )	{
			System.out.println();	// 한행이 출력된 후 줄바꿈
			}
			
			
		
		
		
		
	

}
}
