package com.javalec.base;

import java.util.Scanner;

public class pratice0223 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in) ;

		// startNumber, endNumber ����
		System.out.print("Start Number : ");
		int staNum = scanner.nextInt();
		System.out.print("End Number : ");
		int endNum = scanner.nextInt();
		
		
		int sumEven = 0; 		// ¦���� �� 
		int sumOdd = 0 ; 		// Ȧ���� ��
		for(int i= staNum; i<= endNum; i++ ) 
		{
		 if (i%2==0) {
			 sumEven += i;
		 }else {
			 sumOdd += i;
		       }
		}
		// �Ҽ������� �ݿ��ϱ� ���� double ���� ����
		double avg = ( (sumEven +sumOdd) /(endNum - staNum + 1) );// ��ü�� �� / ��ü�� ����	
		
		System.out.println(+staNum+ "���� " +endNum+ "������ ���� ¦���� ���� "+ sumEven + "�̰� Ȧ���� ����" + sumOdd + "�̰� ��ü �����"+ avg + "�Դϴ�"  );
	

	}
}
