package com.javalec.base;

import java.util.Scanner;

public class base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ù���� ���ڸ� �Է��ϼ��� : 40
		// �ι��� ���ڸ� �Է��ϼ��� : 30
		// �Է��Ͻ� 40�� 30�� ���� 70�Դϴ�.
		
		Scanner scanner = new Scanner(System.in) ;
		System.out.print("ù���� ���ڸ� �Է��ϼ��� :");
		int intNum1 = scanner.nextInt() ;

		System.out.print("�ι��� ���ڸ� �Է��ϼ��� :");
		int intNum2 = scanner.nextInt() ;
		
		System.out.println("�Է��Ͻ� " +(intNum1)+"�� " +(intNum2)+"�� ���� "  + (intNum1 + intNum2) +  "�Դϴ�.");
		
		
	}
	
	
	

}
