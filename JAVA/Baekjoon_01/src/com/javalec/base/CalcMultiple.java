package com.javalec.base;

import java.util.Scanner;

public class CalcMultiple {

	public static void main(String[] args) {
		// 472 * 385
		// 472는 정수, 385는 문자열로 받는다.
		
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt()	;
		String B = scanner.next()	;
		
		scanner.close();
		// 472 * 첫째자리 5, 셋째자리가 0번째이므로 첫째자리는 2번쨰 
		System.out.println(A  * (B.charAt(2)-'0'));
		System.out.println(A  * (B.charAt(1)-'0'));
		System.out.println(A  * (B.charAt(0)-'0'));
		//결과값, 문자 B를 숫자로 변환
		System.out.println(A *	Integer.parseInt(B));
		
	}

}
