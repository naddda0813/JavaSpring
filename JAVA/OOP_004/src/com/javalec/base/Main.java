package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Addition;

public class Main {

	public static void main(String[] args) {
		//----------------------------
		// �ΰ��� ������ �Է� �޾� ���� ��� �����ϱ�
		//----------------------------
		
		Scanner scanner = new Scanner(System.in);
		int num1 = 0; 	// ù��° �� 		
		int num2 = 0;	// �ι�° ��
		
		
		// �ΰ��� ���� �Է� �ޱ�
		System.out.println("ù��° ���� �Է��ϼ��� : ");
		num1 = scanner.nextInt();
		
		System.out.println("�ι�° ���� �Է��ϼ��� : ");
		num2 = scanner.nextInt();
		
		// ���� ��� �����ϱ�
		// Case 1 : Field�� �̿��Ͽ� ����ϱ�, Addition class���� addAction�� �޼ҵ��̿�
		// �ʵ�� Ŭ������ ���Ե� ����
		Addition addition = new Addition ()	;
		addition.num1 = num1;
		addition.num2 = num2;
		addition.addAction(); 	// 
		
		// Case 2 :  addtion.addAction();
		int addResult =addition.addReturn();
		System.out.println(num1 +" + "+num2+ "=" +addResult);
		
		
		
		
		
		
		
		
		
	}

}
