package com.javalec.base;

import java.util.Scanner;

public class practive0222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		// ù��° ���ڸ� �Է��ϼ��� : 591
		// �ι�° ���ڸ� �Է��ϼ��� : 456
		// ù��° ���ڰ� �ι�° ���ں��� ũ�� Hello World!�� ����ϼ���
		// ù��° ���ڰ� �ι�° ���ڿ� ������ Goodbye!�� ����ϼ���
		// ù��° ���ڰ� �ι�° ���ں��� ������ Good Morning!�� ����ϼ���
		
		
		Scanner scanner = new Scanner(System.in) ;
		System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
		int intNum1 = scanner.nextInt() ;  			// scanner ģ �� ctrl�����̽��� nextInt �Է�
		
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
		int intNum2 = scanner.nextInt() ; 
		
		if(intNum1 > intNum2)  {
			System.out.println("Hello World!");
		} else if(intNum1 == intNum2) {				// =�� �ƴ϶� ==���� �ٲٱ�
			System.out.println("Good Bye!");
		} else  {
			System.out.println("Good Morning");
		}
			
		
		
		
		
		
		
		
		
		
		
		
	}

}
