package com.javalec.basse;

import java.util.Scanner;

public class quiz06 {

	public static void main(String[] args) {
			//  ��� ���ڸ� �Է����� ������ �� ���� �Է��ϰ� �� �� �˻��� ���ϴ� ������ ��ġ �ľ�
		Scanner scanner = new Scanner(System.in)	;
		int total = 0 ;			// ������ ����
		int position = 0;  		// ���� ������ġ
		int insNum = 0 ; 		// �����ϴ� ����
		int[] num = new int[total];
		
		
		// �Է��� ���� ���� �Է� �ޱ�
		System.out.print("�Է��� ������ ����? :");
		total = scanner.nextInt()	;
		
		System.out.println(total + "���� ���ڸ� �Է��ϼ���!:");
		
		//�Է��� ���ڸ�ŭ �� �Է�
		for(int i=0;i<total;i++) {
			System.out.print((i+1)+"�� ����:");
			num[i]=	scanner.nextInt() ; 
		}
		
		
		// ������ ������ �ޱ�
		System.out.print("���ڸ� �����ϰ��� �ϴ� ��ġ��?");
		position = scanner.nextInt() 	;
		
		// ������ ���� �ޱ�
		System.out.println("�����ϰ��� �ϴ� ����?");
		insNum = scanner.nextInt()	;
		
		// ó���ϱ�
		for(int i=total-1; i>=position-1; i--)  {// ���� �������� ����, ���� �۾����� ����, 0���� �����ϹǷ� total-1, �����ϴ� ���� ������ �迭 �ٲٱ�
			num[i+1]= num[i] ;
		}
		num[position-1] = insNum;
		
		
		// ��� ����ϱ�
		System.out.println("-----���------- ");
		
		for(int i=0; i<total;i++) {
			System.out.println(String.format("%3d", num[i]));
		}

			
			
			
			
		}

}


