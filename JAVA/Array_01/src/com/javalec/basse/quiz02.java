package com.javalec.basse;

import java.util.Scanner;

public class quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			// ���ϱ� �� ���ڵ��� ������ ������ ���ڸ� �Է� �޾� �Է��� ������ ���� ���ϴ� ���α׷� �ۼ�
			// ������
				
			// 
		
		//���� �Է� �ޱ� 
		   Scanner scanner = new Scanner(System.in);
		
			int i=0;
			int sum = 0;
			int intput = 0 ;
			int number = 0 ;
				
			
			System.out.print("��� ���ڸ� ���ұ��? :");
		    number = scanner.nextInt()	;
			
		    System.out.print(number + "�� ���ڸ� �Է��ϼ���\n");
	
		    
			for(i=0;i<number;i++) 				//�Է��� ���ڸ�ŭ �ԷµǾ� �ϹǷ�
			{	sum += scanner.nextInt()	;
			}
			
			
	
			System.out.println("�Է��� ������ ����" + sum + "�Դϴ�");	
				

				
				
				
				
				
		
		
		

	}
	

}
