package com.javalec.base;

import java.util.Scanner;

public class pratice {

	public static void main(String[] args) {

		
		
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("������ �Է��ϼ��� : ");
		int score = scanner.nextInt() ; 
		int A = (score/10) ;
		String result = "" ;
		
		
		switch( A ) {			// ����/ ������ ������ ����. �Ҽ����ڸ� ����
		case 10: 
		case 9:	
			result = "A" ;
			break;
		case 8:	
			result = "B" ;
			break;
		case 7:	
			result = "C" ;
			break;
		case 6:	
			result = "D" ;
			break;
		default:	
			result = "F" ;
			break;
		
		}
		
		System.out.println("������ ������ " + result +" �����Դϴ�." );
		
		
	}
		
	
	
		
		
//	//	if (score > 100 || score <0) {
//			System.out.print("�Է°��� �ʰ��Ͽ����ϴ�."); // 100���̻� �϶� , 0�� �����϶�
//		} else if (score >= 90) {
//			System.out.print("���ϴ� A�����Դϴ�."); // 100������ 90�� 
//		} else if (score >= 80) {
//			System.out.println("���ϴ� B�����Դϴ�.");//89������ 80��
//		} else if (score >= 70) {
//			System.out.print("���ϴ� C�����Դϴ�."); // 79������ 70��
//		} else if (score >= 60) {
//			System.out.print("���ϴ� D�����Դϴ�."); // 69������ 60��
//		} else {
//			System.out.print("���ϴ� F�����Դϴ�."); // 0������ 59��
//		
		
		
		
		
		
		
		
		
		
		
		
		
	}


