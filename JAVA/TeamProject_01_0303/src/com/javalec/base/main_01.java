package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.MultiCalc;

public class main_01 {

	public static void main (String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	int choiceNumber;
	int firstNum, secondNum;
	
	System.out.println("1.����");
	System.out.println("2.����");
	System.out.println("3.����");
	System.out.println("\n ��ȣ�� �����ϼ��� : ");
	choiceNumber = scanner.nextInt();
	
	System.out.println("ù��° ���ڸ� �Է��ϼ���:");
	firstNum = scanner.nextInt();
	
	System.out.println("�ι�° ���ڸ� �Է��ϼ���:");
	secondNum = scanner.nextInt();
	
	
	MultiCalc multi = new MultiCalc();
	multi.calc(choiceNumber,firstNum,secondNum);

	
	
	}
	
	
	
	
	
	
}
