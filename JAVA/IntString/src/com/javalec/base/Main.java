package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 123;
		String str1 = "12345";
		String str2 = "abcde";
		
		String str3 = Integer.toString(num1);	//���ڷ� ����
		System.out.println(str3 + str2);    // ���ٿ� �Է°���
		
		int num2 = Integer.parseInt(str1);	//���ڷ� ����
		System.out.println(num2 + num1); 	//12345+123
	}

}
