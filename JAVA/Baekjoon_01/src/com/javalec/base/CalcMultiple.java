package com.javalec.base;

import java.util.Scanner;

public class CalcMultiple {

	public static void main(String[] args) {
		// 472 * 385
		// 472�� ����, 385�� ���ڿ��� �޴´�.
		
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt()	;
		String B = scanner.next()	;
		
		scanner.close();
		// 472 * ù°�ڸ� 5, ��°�ڸ��� 0��°�̹Ƿ� ù°�ڸ��� 2���� 
		System.out.println(A  * (B.charAt(2)-'0'));
		System.out.println(A  * (B.charAt(1)-'0'));
		System.out.println(A  * (B.charAt(0)-'0'));
		//�����, ���� B�� ���ڷ� ��ȯ
		System.out.println(A *	Integer.parseInt(B));
		
	}

}
