package com.javalec.basse;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
	
		String[] name = {"James", "Cathy", "Kenny", "Martin", "Crystal"} ;
		int[] tall = new int[name.length] ;			//���� ���ڰ� �迭 �������, Ű�� �����ϴ� �迭��
		Scanner scanner = new Scanner(System.in) ;
		
		int total = 0 ;    	// ������� ��
		double avg = 0 ;	// ������ ���			
		int max = 0 ;		// ������ �ִ밪
		int min = 1000; 		// ������ �ּҰ�, ���ؾ��ϹǷ� �˳��� ũ�� ��´�.
		String maxName = "";
		String minName = "";
		
	
			
		
		
		// �Է¹޾ƿ���
		for(int i=0;i<name.length;i++)	{
			System.out.print(name[i]+"�� ������ �Է��ϼ���!"); //ó������ 1��° �迭 �̸� ��µ�
			tall[i]= scanner.nextInt()	;
			total +=tall[i] ;
		
		
		// ��ս���: �հ踦 �̿��ؼ� ������ŭ ������
			//�ִ밪
			 if(tall[i] > max ) {			// �迭�� ù��° ��(170�� max ������ ũ��
				max= tall[i];				// a[i]��° ���� �ִ밪���� �˴ϴ�.
				maxName = name[i];
			} //�ּҰ�
			 if(tall[i] < min) {			// �迭�� ù��° ��(165)�� min ������ ������ 
				min= tall[i] ;				// a[i]��° ���� �ּҰ����� �˴ϴ�.
				minName = name[i];
			}	
		}
	
		avg = total /(double) tall.length ;
			
		System.out.println("��ս���(cm)�� : " + avg );		
		
		//�ִ����,�ּҽ��� ���ϱ�, �̸��˷��ֱ�, ����ϱ�
		System.out.println("���� ū �л��� " +maxName+ "�̰�, �� �л��� Ű�� " + max + "cm�Դϴ�." );
		System.out.println("���� ���� �л��� " +minName+ "�̰�, �� �л��� Ű�� " + min + "cm�Դϴ�." );
//			
			
		
		
		
		
		
		
	}

}
