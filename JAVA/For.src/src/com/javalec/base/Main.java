package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//������ ������ ����
	//	for(int i= 1;i<=10;i++) {    				//ó����/ ������/ ������ // Ȧ�� ���� ���
	//		System.out.println(i);
	
		
		//1���� 10������ Ȧ���� ���ϱ�
	//	for(int i= 1;i<=10;i=i+2) {    				//ó����/ ������/ ������ // Ȧ�� ���� ���
	//	System.out.println(i);
			
		// ù���ں��� �����ڱ����� ������ ��
		//ȯ�溯�� ����
//		Scanner scanner = new Scanner(System.in);
//		int startNum = 0 ; // ù��°����
//		int endNum = 0 ; // ������
//		int sum = 0 ;
//		
//		// ����ڷκ��� �Է°� �ޱ�
//		System.out.println("Start Number : " );
//		startNum = scanner.nextInt();
//		
//		System.out.println("End Number : ");
//		endNum = scanner.nextInt() ;
//		
//		//ó���ϱ�
//		for(int i=startNum; i<=endNum; i++ ) {
//			sum += i;
//		}
//		
//		//����ϱ�
//		System.out.println( +startNum +" ���� " + endNum + " ������ ���� " + sum + " �Դϴ�.");
//		
//	}
//}
		
//
//		//1���� 10������ ������ �հ豸�ϱ�
//		int sum = 0; //��������
//		for(int i=1; i<=10; i++) 
//		{
//			sum += i;	    	//sum =sum+i, ��������
//	    }									
//		System.out.println("1���� 10������ ���� " + sum + " �Դϴ�.");
//	}
//
	
	//for �� �ϳ� ����Ͽ� 1���� 100������ ���� ȫ���� �հ� ¦���� ���� ���� ���ض�
		int sumEven = 0;  				// ¦���� ��
		int sumOdd = 0 ; {				// Ȧ���� ��
		for(int i=1;i<=100;i++)
		{	if (i % 2 == 1 ) {
			sumOdd += i ;
		}	else	{
			sumEven	+= i ;
		}
		}
			
			
			System.out.println("1���� 100������ Ȧ���� ���� " + sumOdd	+	"�Դϴ�.");
			System.out.println("1���� 100������ ¦���� ���� " + sumEven + " �Դϴ�.");
			
		}
	
	}
}
		
		


		
		
	
	
	
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


