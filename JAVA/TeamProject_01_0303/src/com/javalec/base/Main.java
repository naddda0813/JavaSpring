package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.AdditionJY;
import com.javalec.function.Gopsem;
import com.javalec.function.GugudanJE;
import com.javalec.function.Multiple;
import com.javalec.function.SumJ;

public class Main {
	
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int choice = 0;			//����� �����ϴ� ����
		int num1;		// ù��° �� �Է¹ޱ�
		int num2;		// �ι�° �� �Է¹ޱ�
		
		System.out.println("**���ϴ� ����� �����ϼ���");
		System.out.println("1. ����, ����");
		System.out.println("2. ����, ������");
		System.out.println("3. ������ �հ� ���ϱ�");
		System.out.println("4. ������ ���� ���ϱ�");
		System.out.println("5. ������ ������ ���ϱ�");
		System.out.println("6. ����");
		
		
		
		
		// ����� �Է°� �ޱ�
		System.out.print("==> ���� : ");
		choice = scanner.nextInt()	;
		// �ҷ�����
		AdditionJY additionJY = new AdditionJY();
		Multiple multiple = new Multiple();
		SumJ sumJ = new SumJ();
		GugudanJE gugudanJE = new GugudanJE();
		Gopsem gopsem = new Gopsem();
		
		
		while(1>0) {
			
			System.out.println("- ù��° ���� �Է��ϼ��� :");
			num1 = scanner.nextInt()	;
			
			System.out.println("- �ι�° ���� �Է��ϼ��� :");
			num2 = scanner.nextInt()	;
			
			
			
			if(choice == 1) {
				additionJY.addition(num1, num2);
				additionJY.substraction(num1, num2);
			} 
			
			if(choice == 2) {
				multiple.multiplition(num1, num2);
			}
			
			if(choice == 3) {
				sumJ.Sum(num1, num2);
			} 
			
			if (choice == 4) {
				gopsem.rangeMulti(num1, num2);
			}
			
			if (choice == 5) {
				gugudanJE.gugudan(num1, num2);
			}
			
			if(choice == 6) {
				System.out.println("����Ǿ����ϴ�.");
			}break;
	}
	
	}	
	
}
	
	
	
	
	
	
	
	
	
	


