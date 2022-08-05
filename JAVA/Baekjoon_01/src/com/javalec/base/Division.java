package com.javalec.base;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		//나눗셈, 변수 선언 따로 할 필요 없다.

		Scanner scanner = new Scanner(System.in);
		System.out.println(	scanner.nextDouble()/scanner.nextDouble());
	}

}
