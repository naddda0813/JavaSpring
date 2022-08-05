package com.javalec.base;

import java.util.Scanner;

class Left {

	public static void main(String[] args) {
	//	첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt()	;
		int B = scanner.nextInt()	;
		int C = scanner.nextInt()	;
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B&C))%C);		
		System.out.println((A*B)%C );		
		System.out.println(((A%C)*(B%C))%C);		
		
		scanner.close();
		
	}
}
