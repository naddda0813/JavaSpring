package com.javalec.base;

import java.util.Scanner;

public class quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// BMI ����
		
		Scanner scanner = new Scanner(System.in) ; 
		// ���� , ������ �Է¹ޱ�
		System.out.println("����(cm)�� �Է��ϼ��� : ");
		int heightNum1 = scanner.nextInt() ; 
		
		System.out.println("������(kg)�� �Է��ϼ��� : ");
		int weightNum2 = scanner.nextInt() ; 
		
		double bmi = ( weightNum2 / ((heightNum1* 0.01)*(heightNum1* 0.01)) )  ;
		
		
		// ���� �Է� ���� �Ÿ���
		if (heightNum1 < 250 && heightNum1 >0  ) {
			System.out.println("������(kg)�� �Է��ϼ��� : "); // ���� �޼��� ���
		int weight = new scanner.nextInt() ;
		if( weightNum2 <500 && weightNum2>0) 	// ������ �Է� ���� �Ÿ���
		
		 
			
			
			if( bmi >= 40)	{
				System.out.println("���ϴ� �����Դϴ�.ü�߰����� �ʿ��մϴ�!");
			} else if ( bmi >= 30 && bmi< 40) 	{
				System.out.println("���ϴ� ���Դϴ�.ü�߰����� �ʿ��մϴ�!");
			} else if ( bmi >= 25 && bmi < 30) 	{
				System.out.println("���ϴ� �浵���Դϴ� ���Ǹ� ���մϴ�!");
			} else if ( bmi >= 20 && bmi < 25) 	{
				System.out.println("���ϴ� ����ü���Դϴ�.!");
			} else if ( bmi < 20) {
			System.out.println("���ϴ� ��ü���Դϴ�.ü�������� �ʿ��մϴ�!");
			}	
			
			
		}
			
			
			
			
		}
		// test
//		if( bmi >= 40)	{
//			System.out.println("���ϴ� �����Դϴ�.ü�߰����� �ʿ��մϴ�!");
//		} else if ( bmi >= 30 && bmi< 40) 	{
//			System.out.println("���ϴ� ���Դϴ�.ü�߰����� �ʿ��մϴ�!");
//		} else if ( bmi >= 25 && bmi < 30) 	{
//			System.out.println("���ϴ� �浵���Դϴ� ���Ǹ� ���մϴ�!");
//		} else if ( bmi >= 20 && bmi < 25) 	{
//			System.out.println("���ϴ� ����ü���Դϴ�.!");
//		} else if ( bmi < 20) {
//		System.out.println("���ϴ� ��ü���Դϴ�.ü�������� �ʿ��մϴ�!");
//		}
//		
				
		
		
	
	
	}
	
