package com.javalec.base;

import java.util.Scanner;

class Left {

	public static void main(String[] args) {
	//	ù° �ٿ� (A+B)%C, ��° �ٿ� ((A%C) + (B%C))%C, ��° �ٿ� (A��B)%C, ��° �ٿ� ((A%C) �� (B%C))%C�� ����Ѵ�.
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
