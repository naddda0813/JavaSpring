package com.javalec.basse;

import java.util.Scanner;

public class quiz07 {

	public static void main(String[] args) {
		// ��� ���ڸ� �Է����� �������� ���ڸ� �Է��ϰ� ���� �ʿ���� ������ ��ġ�� ���� ����
		Scanner scanner = new Scanner(System.in);
		int count= 0 ;			// ������ ������ ����
		int position = 0 ;        // ������ ������ ��ġ
		int insNum = 0 ; 		// �����ϴ� ����
		int[] num = new int[100];
		
		//�Է°� �޾ƿ���
		System.out.print("�Է��� ������ ����?:");
		count= scanner.nextInt();
		
		System.out.println(count+"���� ���ڸ� �Է��ϼ���!:");
		
		//���� �޾ƿ���
		for(int i=0;i<count;i++) {
			System.out.print((i+1)+"�� ����: ");
			num[i]= scanner.nextInt();
		}
		System.out.print("���°�� ���ڸ� �����Ͻðڽ��ϴ�?:");
		position = scanner.nextInt()	;
		
		
		
		// ó���ϱ�
		for(int i=count-1; i>=position; i--)  {// ���� �������� ����, ���� �۾����� ����, 0���� �����ϹǷ� total-1, �����ϴ� ���� ������ �迭 �ٲٱ�
			num[i+1]= num[i] ;
		}
		num[position] = insNum;
		
		
		
		
		
	
		
		// ��� ����ϱ�
		System.out.println("-----���-------");
		for(int i=0; i<count;i++) {
			System.out.println(String.format("%3d", num[i]));
		}
		
		
		
	//	System.out.println(num[i]);
		
		
	}

}
