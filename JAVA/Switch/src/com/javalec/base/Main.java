package com.javalec.base;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//����
		Scanner scanner = new Scanner(System.in) ;
		int inputNumber = 0; // ����� �Է� ����
		String result = "" ; // ¦�� Ȧ�� ��� ��, ¦���Դϴ� Ȧ���Դϴ� �˷���
		
		
		//������Է�
		System.out.print("���ڸ� �Է��ϼ���!");
		inputNumber = scanner.nextInt() ;
		
		//��� ��� :  IF�� ���
		if(inputNumber % 2 == 0) {
			result = "¦��";
		}else {
			result = "Ȧ��";
		}
		
		
		// ¦Ȧ�� �Ǵ� : switch�� ���
		switch(inputNumber % 2) {
		case 0:						// ���� 0�̸�
			result = "¦��" ;
			break;
		case 1:						// ���� 1�̸�
			result = "Ȧ��" ;
			break;
		default :				// �׿��� ��
			break;				// break�� ���� ������ �� �����ٷ� ���� ��ȯ��
		}
		
		
		
		
		
		
		
		
		
		
		
		
		// ȭ�� ���
		System.out.println("�Է��Ͻ� ���� " + inputNumber + "�� " + result + "�Դϴ�.");
		
	}

}
