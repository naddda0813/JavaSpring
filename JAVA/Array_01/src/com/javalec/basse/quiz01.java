package com.javalec.basse;

import java.util.Scanner;

public class quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �Է��� ���ں��� 4���� �����Ͽ� ȭ�� ���η� ������ ǥ��, +3�ܱ���
		// �� * �� 
		
		
		int i = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.println("Input your number : " );
		int num = scanner.nextInt()	;
		
		for(i=1;i<=9;i++)	{
		
			System.out.println(num + "*"+ i +"=" +(num*i) + "\t"
					+(num+1) + "*"+ i +"=" +((num+1)*i) + "\t"
					+(num+2) + "*"+ i +"=" +((num+2)*i) + "\t"
					+(num+3) + "*"+ i +"=" +((num+3)*i) + "\t"
					);
					
			
					
		}
		
//		//�Է��� ���� factorial ���ϱ� ��: 4! = 4*3*2*1
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Input your decimal no. : ");
//		int number =  scanner.nextInt()	;
//		
//		int i = 0 ;		// �Է°� 
//		int factNum = 1; // ���丮�� �����, 0�� �ʱⰪ���� ������ ���ϱ�� 0�̶�� ����� ����
//		
//		for(i=1;i<=number;i++)	{
//			
//		factNum *= i   ;// ������  3�� 2�� ������ 3�� ���հ�
//				
//		}
//		System.out.println(number +"'s factorial value = "  + factNum  );
//				
//		
//		
		
		
		
		
		
		

	
	
}
}


