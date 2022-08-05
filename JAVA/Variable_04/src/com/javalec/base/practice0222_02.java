package com.javalec.base;

import java.util.Scanner;

public class practice0222_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("점수를 입력하세요 : ");
		int score = scanner.nextInt() ; 
		
		if (score > 100 || score <0) {
			System.out.print("입력값을 초과하였습니다."); // 100점이상 일때 , 0점 이하일때
		} else if (score >= 90) {
			System.out.print("귀하는 A학점입니다."); // 100점부터 90점 
		} else if (score >= 80) {
			System.out.println("귀하는 B학점입니다.");//89점부터 80점
		} else if (score >= 70) {
			System.out.print("귀하는 C학점입니다."); // 79점부터 70점
		} else if (score >= 60) {
			System.out.print("귀하는 D학점입니다."); // 69점부터 60점
		} else {
			System.out.print("귀하는 F학점입니다."); // 0점부터 59점
		}

}
}