package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// API : Application Program Interface
		// �����ڵ��� ���ϰ� ����� �� �ֵ��� ������ Ŭ�������� ����
			
		String str1 = "abcdefg";
		String str2 = "HIJKLMN";
		String str3 = "opqrstu";
		String str4 = "	abc		def		ghi		";
		String str5 = "  abcdefg ";
		

		
		System.out.println(str1.concat(str2));			//concat�� �̾ �迭
		System.out.println(str3.substring(3));			//0������ �����Ҷ�,3������r���� ����
		System.out.println(str1.substring(3,5));		//3������ 5��������
		
		String abc = str1.substring(3,5);
		System.out.println(abc);
		
		System.out.println(str1.length());
		System.out.println(str1.toUpperCase());			// �빮�� ��ȯ
		System.out.println(str2.toLowerCase());  		// �ҹ��� ��ȯ
		System.out.println(str1.equals(str4));			// ���� ������ false, ������ true
		//����� ���̵� ��й�ȣ �Է� �� ������ ��� ���Ҷ�
		System.out.println(str4.trim());  				//�հ� ���� ������ ����
		
		System.out.println(str1.equals(str5.trim()));   //str1�� ������ ������ str5�� ������ Ȯ��
		System.out.println(str1.replace('a', 'Z'));	   // a�� Z�� ��ȯ
		System.out.println(str1.replaceAll("abc", "ZZZZZZ"));
		System.out.println(str1.replaceAll("a", "    "));		//a�� ����
	
		// �����Ͱ� Ŀ�� string ������ ���Һ�
	
	
	
	
	
	
	
	}
	

}
