package com.javalec.basse;

import java.util.Scanner;

public class quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��� ���ڸ� �Է����� �������� ���ڸ� �Է��ϰ� ���� �ִ밪�� ��ġ�� �ִ밪�� ���϶�
//		Scanner scanner = new Scanner(System.in);
//		
//		// ���� ����
//		int inputNum = 0 ;		// ��� ���ڸ� ������
//		int max = 0 ;
//		int order = 0 ; 		// �ִ밪�� ��������� �˾Ƴ� ����
//		
//		//����� �Է°� �ޱ�
//		System.out.print("������ ������ �Է��ϼ���(100�� �̸�) :");
//		inputNum = scanner.nextInt()	;
//		int num[] = new int[inputNum] ;			//�Է��ϴ� ���� �迭
//		
//		// 100 ���� ū �� �Է� ��Ű�� ,�����߻��ϰ�
//		if(inputNum > 100) {
//			System.out.println("�ʹ� ū ���� �Է��Ͽ����ϴ�.");
//		} else {
//		System.out.println(inputNum + "���� ���� �Է��ϼ���!");
//			for(int i=0; i<inputNum;i++) {
//				num[i]= scanner.nextInt() ; 
//				if(num[i]> max )	{
//					max = num[i] 	;
//					order = i +1  ;		// �迭�̶�� ���� �ȿ��� 0���� �����ϴ� +1
//				}
//			}
//		}
//		
//		System.out.println("�Է��� ������ �ִ밪�� " + max + "�̰� " + order + "���� ���Դϴ�" );
//		
		// ���ڸ��� ����  ���� ���ϴ� ���α׷��� �ۼ�, 0�� 9�� �Է½� Ż��
		Scanner scanner = new Scanner(System.in) ;
	
		int num = 0 ;

		
		int sum= 0 ;		// ���ڸ��� ���Ѱ�
		
		// �Է��� ������ ���ڸ������� ���ڸ� �޴º��� , ���ϳ��ϳ��� �Է°����� ����
	
		
		
		System.out.println("Enter an integer(0 ~ 9) :" );
		num = scanner.nextInt() ;
		
		
		while(num>0)	{
			sum= sum + (num%10) ;
			num = num / 10 ;
					
		}
		System.out.println("Sum of digits = " + sum );
		
		
		
		
		
	}
}


