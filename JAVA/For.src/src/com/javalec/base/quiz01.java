package com.javalec.base;

import java.util.Scanner;

public class quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �����ϴ� ����, ������ ���� ���ϱ�
		// ȯ�溯�� ����
		Scanner scanner = new Scanner(System.in);
		int startNum = 0 ; 		// ���� ����			
		int endNum = 0 ;		// ������
		int leftNum = 0 ; 		// ������
		int sum = 0 ; 			//���ǿ� �´� ���� �հ�
		int count = 0 ; 		// ���ǿ� �´� ����
		double avg = 0 ; 		// �������� 5�� ������ sum �鿡 ���� ���
		int max = 0 ; 			// �ִ밪
		int min = 0 ;			// �ּҰ�
		int tempNum = 0 ;		// ���۰� ���� ����
	
		
	
		// ����ڷκ��� data �޾ƿ���
		
		System.out.print("1. �����ϴ� ���ڸ� ���ϼ��� : ");
		startNum = scanner.nextInt();
		System.out.print("2. ������ �� ���ڸ� ���ϼ��� : ");
		endNum = scanner.nextInt();
		System.out.print("3. ���ϴ� ������ ����? : ");
		leftNum = scanner.nextInt();
		
		// ���� ���ڰ� �� ���ں��� ū ��� 
		if (startNum > endNum ) {	
			tempNum = endNum	;					//tempNum�� ���� �ӽ� ���� ����, A=B
			endNum = startNum	;					//B=C
			startNum = tempNum 	;					// C=A�� ���� ���� ���ڸ� ���� �ӽ� ������ ���100
		}
		
		

		
		// 10���� ������ ���� �� %5�� ������ ���� ���ϱ� 
		for (int i = startNum ; i<= endNum ; i++) {
			//�������� ���ǿ� �´� ���
			
			if(i % 10 == leftNum  ) {		//  �������� 5�� �ش��ϸ� sum�� �����ְ� count�� ���ش�
				count++;						// ���ϱ� 1�Ͽ� ���� ����
				sum += i ;						//�հ�
				
				if	(i > max); {			// ����ڰ� �Է��� ���� �ִ밪���� ũ��, �ִ밪���� ��ȯ
				max = i ;
			}
				if(min == 0 ) {
					min = i ; 
			}
	}
}
		
			avg = sum / (double)count	;			// ����� �տ��� ������ ����
		
		//��� ���
		
		System.out.println("<�м����>");
		System.out.println(+ startNum + "���� " + endNum + "������ ���� �� �������� " + leftNum + "�� ������ ������ " + count + "���̰� ���� " + sum +"�Դϴ�.");
		System.out.println("�׸��� �������� " + leftNum + "�� ������ ����� "+avg+ "�̰�");
		System.out.println("�������� " + leftNum + "�� ���� �� �ִ���ڴ�" + max + "�̰� �ּ� ���ڴ� " + min + "�Դϴ�.");
		
		
	
}
}
	
	
		
		
		
	
		
		
		
		// �ִ� ���� ���ϱ� max min
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	
	
	
	
	

