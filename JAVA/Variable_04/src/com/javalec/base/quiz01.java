package com.javalec.base;

import java.util.Scanner;

public class quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 각 과목별로 100이상의 값을 입력시 평군 계산이 안되는다는 커멘트 이루어지기
		// 각 과목별 점수 100점 이하로 잡기
		
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("국어 점수를 입력하세요!");
		int kor = scanner.nextInt() ; // 국어점수
		
		System.out.println("영어 점수를 입력하세요!");
		int eng = scanner.nextInt() ;
	
		System.out.println("수학  점수를 입력하세요!");
		int mat = scanner.nextInt() ;
		
		int S =  (kor + eng + mat) ;
		
		double avr = (S / 3.0) ;
		
		
		// 100점 이하 및 100점 이상의 값을 출력했을 때 오류메시지
		// 평균 계산 출력
		if (kor > 100 &&  kor <0 )
		System.out.println("국어 점수가 입력값을 ");
		
		
		
		
		
		if (kor > 100 && kor < 0 ) {
			System.out.print("국어 점수 입력값을 초과하였습니다.");
		}
		if (eng > 100 && eng < 0) {
			System.out.print("영어 점수 입력값을 초과하였습니다.");
		} 
		if (mat > 100 && mat < 0) {
			System.out.print("수학 점수 입력값을 초과하였습니다.");
		} 
		
		
		
		
		
		
		
		
		
		if (kor > 100 || kor <= 0 ) {
			System.out.println("국어 점수 입력값을 초과하였습니다. ");
		} else if (kor > avr  ) {								// A,B 국어 점수가 100점이 안 넘게 
		 System.out.print("국어 점수는 평균 보다 높습니다.");
		} else if (kor == avr) {
			System.out.print("국어 점수는 평균 점수 입니다.");
		} else  {
		System.out.print("국어 점수는 평균 보다 낮습니다.");
		} 
		 
		if (eng > 100 || eng <= 0 ) {
			System.out.println("영어 입력값을 초과하였습니다. ");
		} else if (eng > avr  ) {								// A,B 국어 점수가 100점이 안 넘게 
		 System.out.print("영어 점수는 평균 보다 높습니다.");
		} else if (eng == avr) {
			System.out.print("영어 점수는 평균 점수 입니다.");
		} else {
		System.out.print("영어 점수는 평균 보다 낮습니다.");
		}

		if (mat > 100 || mat <= 0 ) {
			System.out.println("수학 입력값을 초과하였습니다. ");
		} else if (mat > avr ) {								// A,B 국어 점수가 100점이 안 넘게 
		 System.out.print("수학 점수는 평균 보다 높습니다.");
		} else if (mat == avr) {
			System.out.print("수학 점수는 평균 점수 입니다.");
		} else  {
		System.out.print("수학 점수는 평균 보다 낮습니다.");
		}

		
		
		
		// 점수는 100점을 넘어서는 안된다. 점수의 최대값은 100 
		
		
		
		
	}

}
