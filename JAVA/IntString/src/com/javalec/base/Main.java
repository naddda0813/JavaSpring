package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 123;
		String str1 = "12345";
		String str2 = "abcde";
		
		String str3 = Integer.toString(num1);	//문자로 받음
		System.out.println(str3 + str2);    // 한줄에 입력가능
		
		int num2 = Integer.parseInt(str1);	//숫자로 받음
		System.out.println(num2 + num1); 	//12345+123
	}

}
