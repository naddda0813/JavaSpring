package com.javalec.basse;

import java.util.Scanner;

public class quiz08 {

	public static void main(String[] args) {
		// �Ʒ��� �׸��� ���� ���� �Ա�, ��� �� ��Ȳ�� �����ϴ� program �ۼ�
		
		Scanner scanner = new Scanner(System.in);
		int workNum = 0;					//�۾���ȣ
		int[] guestNum = new int [10] ;			//����ȣ
		
		int total = 0;				//�Աݱݾ�
		
		System.out.println("1.�Ա�");
		System.out.println("2.���");
		System.out.println("3.��Ȳ");
		System.out.println("4.����");
		
		// ����� �Է¹ޱ�
		System.out.print("��ȣ�� �����ϼ���:");
		workNum =  scanner.nextInt()	;
			
		
		//����ȣ, �ݾ� �Է¹ޱ�
		for(int i=0;i<4;i++ )  {
			System.out.print("����ȣ:");
			guestNum[i] = scanner.nextInt();
		}
		
		
		System.out.print("�ݾ�:");
		total = scanner.nextInt();
		
		//�Ա� ��� ����ϱ�
		for(int i=0;i<=guestNum;i++)	{
			if (int worknum == 3) {
				System.out.println("�ܾ��� �����մϴ�!");
			} else  {
				System.out.println("�Աݰ�� < ����ȣ :" +guestNum + "\n�ܾ� :" +total + ">"	);
			}
		
	}

		
		
		
}}

