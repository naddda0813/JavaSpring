package com.javalec.basse;

import java.util.Scanner;

public class quiz04 {

	public static void main(String[] args) {
		// 10개의 점수(0점부터 99점)를 인력받아 점수의 분포를 10점 간격의 드읍으로 된 히스토그램을 표시하라.
		// 변수 선언
		Scanner scanner = new Scanner(System.in);
		int[] histo = new int[10];			// 갯수를 세는 배열
		
		//데이터 받아오기
		System.out.println("Input score:");
		for(int i = 0; i<histo.length;i++) {
			System.out.println(	(i+1)+"의 score:");
			histo[scanner.nextInt() / 10 ] ++ ;
		}
		scanner.close();
		
		// 받아온 데이터 히스토그램 타입으로 출력하기
		System.out.println("------Histogram---- ") ;
		
		for(int i=(histo.length - 1) ; i>=0; i--) {
			System.out.print(String.format("%3d : ", i * 10)); 	// 90부터 차례대로 출력, %d: 10진수 정렬,3:세자리수 정렬
			for(int j =1; j<=histo[i];j++)	{
				System.out.print("#");
			}
			System.out.println();
		}
		
		
	
		
	}

}

