package com.javalec.base;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt()	;
		int b = scanner.nextInt()	;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(Math.floorDiv(a, b));
		System.out.println(a % b);
		
	}
}
