package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ݾ��� �Է��ϼ��� : 8000
		// �ݾ��� 8000�� ������ �ʹ� ��Դϴ�.
		// �ݾ��� 5000�� ������ �ʹ� ��Դϴ�.
		// �ݾ��� 3000�� ������ �ʹ� ��Դϴ�.
		// �ݾ��� �� ���ϸ�  �����Դϴ�
		
		
		
		Scanner scanner = new Scanner(System.in) ; // ȯ�漳��
		System.out.print("�ݾ��� �Է��ϼ��� : ");			// �ݾ� �Է� �ޱ�
		int priceNum1 = scanner.nextInt() ;
	
		
		if(priceNum1 > 8000) {
			System.out.println("�ʹ� ��Դϴ�.");
		} else if(priceNum1 > 5000) {
			System.out.println("���� ��Դϴ�.");
		} else if(priceNum1 > 3000) {
			System.out.println("������ �ݾ��Դϴ�.");
		} else {
			System.out.println("�� ���Դϴ�.");
		}
		
		// ū �ݾ��� ������ ���� ū �ݾ׺��� ��������, ���� �ݾ��� ���� �϶��� ���� �ݾ׺��� ��������
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
