package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.ConstDan;
import com.javalec.function.FieldDan;

public class Main {

	public static void main(String[] args) {
		// �Է� ���� ���ڷ� �������� ����ϴ� ���α׷��� class�� �и��ؼ� ��ü���� �������� �ۼ�
		
		//�������� ����� ���� �Է��ϱ�
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������� ����� ���ڸ� �Է��ϼ��� : ");
		int dan = scanner.nextInt()	;
	
	
		// ---- Field �̿� ----
		//FieldDan ����
//		FieldDan fieldDan = new FieldDan();
		//fieldDan�� dan field(public)�� dan �Է�,constructor
//		fieldDan.dan = dan;
		//fieldDan�� ��� �޼ҵ带 ���� ������ ���
//		fieldDan.printDan();
		
		//fieldDan�� Array return �޼ҵ�� Array �޾ƿ�
	//	String[] stringArr = fieldDan.returnArrDan();
		//�޾ƿ� Array ���
	//	for(int i = 0;i < stringArr.length;i++) {
	//		System.out.println(stringArr[i]);
		}
		
	
		//ConstDan �̿�
		// dan�� �ѱ�� ConstDan ����
		ConstDan constdan = new ConstDan(dan) ;
		constDan.printDan();
		
}
		
		
		
	


