package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Calc;
import com.javalec.function.ConstCalc;

public class Main {

	public static void main(String[] args) {
		
		// �ΰ��� ������ �Է¹޾� ��Ģ���� ����
		Scanner scanner = new Scanner(System.in);
		int num1 = 0 ;  // ù��°��
		int num2 = 0 ;  // �ι�° ��
		
		// �ΰ��� ���� �Է¹ޱ�
		System.out.println("ù��° ������ �Է��ϼ��� : ");
		num1 = scanner.nextInt()	;
		System.out.println("�ι�° ������ �Է��ϼ��� : ");
		num2 = scanner.nextInt()	;
		
		ConstCalc calc = new ConstCalc(num1,num2);
		System.out.println(num1+"+"+ num2 + "=" + calc.addition());
		// �ʵ� �̿��ϱ�, ����
		//Calc calc = new Calc();
		/*	calc.num1 = num1;
		calc.num2 = num2;
		calc.addition() ;
		calc.subtraction();
		calc.multiple();
		calc.division();
		calc.calcAll();			// �ѹ��� ����
*/		
		//void ������, ���� 
		// ���̳ʽ������ ����
		
/*		int addResult = calc.addAction(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + calc.addAction(num1,num2) );
		
		int minusResult = calc.minusAction(num1,num2);
		System.out.println(num1 + " - " + num2 + " = " + (calc.minusAction(num1,num2))); //calc.minusAction() ��� minusResult �־ ��
		
		int multipleResult = calc.multipleAction(num1,num2);
		System.out.println(num1 + " * " + num2 + " = " + multipleResult);
		
		double divisionResult = calc.divisionAction(num1,num2);
		System.out.println(num1 + " / " + num2 + " = " + divisionResult);
*/	
		
	
	}
}
