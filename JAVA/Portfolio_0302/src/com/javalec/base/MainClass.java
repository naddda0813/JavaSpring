package com.javalec.base;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("구구단을 출력할 숫자를 입력하세요 :");
		int i = scanner.nextInt()	;
		scanner.close();
		
		MainClass mainClass = new MainClass()	;
		mainClass.calc9(i);

	}
	public void calc9(int i) {
		for(int j= 1; j <=9; j++)	{
			System.out.println(i + " X " + j + " = " + ((i *j)));
		}
		
		
		
		
		
	}

}
