package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Scanner�� �̿��� �Է� �ޱ�
		Scanner scanner = new Scanner(System.in) ; // = �ڿ� ������ �̸�, scanner�� ġ�� ctrl �����̽��ϰ� import ������
		// scanner�� ������Ʈ, �ν��ٽ�, ��ü�� �θ�
		
		
		// Console����  Data ��������
		System.out.print("���ڸ� �Է��ϼ���!");
		int intNum1 = scanner.nextInt();
		
		
		// ������ ������ ����ϱ�, consoleĭ�� ���� ġ��
		System.out.println("�Է��� ���ڴ� " + intNum1 + "�Դϴ�.");
		
		//�Է��Ͻ� ���ڴ� ¦���Դϴ�. or Ȧ���Դϴ�, console ĭ�� ���� ġ��
		if(intNum1%2 == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� ¦���Դϴ�");
		} else 
			System.out.println("�Է��Ͻ� ���ڴ� Ȧ���Դϴ�");
			
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
