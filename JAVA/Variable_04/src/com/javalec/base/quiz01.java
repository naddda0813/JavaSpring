package com.javalec.base;

import java.util.Scanner;

public class quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// �� ���񺰷� 100�̻��� ���� �Է½� �� ����� �ȵǴ´ٴ� Ŀ��Ʈ �̷������
		// �� ���� ���� 100�� ���Ϸ� ���
		
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("���� ������ �Է��ϼ���!");
		int kor = scanner.nextInt() ; // ��������
		
		System.out.println("���� ������ �Է��ϼ���!");
		int eng = scanner.nextInt() ;
	
		System.out.println("����  ������ �Է��ϼ���!");
		int mat = scanner.nextInt() ;
		
		int S =  (kor + eng + mat) ;
		
		double avr = (S / 3.0) ;
		
		
		// 100�� ���� �� 100�� �̻��� ���� ������� �� �����޽���
		// ��� ��� ���
		if (kor > 100 &&  kor <0 )
		System.out.println("���� ������ �Է°��� ");
		
		
		
		
		
		if (kor > 100 && kor < 0 ) {
			System.out.print("���� ���� �Է°��� �ʰ��Ͽ����ϴ�.");
		}
		if (eng > 100 && eng < 0) {
			System.out.print("���� ���� �Է°��� �ʰ��Ͽ����ϴ�.");
		} 
		if (mat > 100 && mat < 0) {
			System.out.print("���� ���� �Է°��� �ʰ��Ͽ����ϴ�.");
		} 
		
		
		
		
		
		
		
		
		
		if (kor > 100 || kor <= 0 ) {
			System.out.println("���� ���� �Է°��� �ʰ��Ͽ����ϴ�. ");
		} else if (kor > avr  ) {								// A,B ���� ������ 100���� �� �Ѱ� 
		 System.out.print("���� ������ ��� ���� �����ϴ�.");
		} else if (kor == avr) {
			System.out.print("���� ������ ��� ���� �Դϴ�.");
		} else  {
		System.out.print("���� ������ ��� ���� �����ϴ�.");
		} 
		 
		if (eng > 100 || eng <= 0 ) {
			System.out.println("���� �Է°��� �ʰ��Ͽ����ϴ�. ");
		} else if (eng > avr  ) {								// A,B ���� ������ 100���� �� �Ѱ� 
		 System.out.print("���� ������ ��� ���� �����ϴ�.");
		} else if (eng == avr) {
			System.out.print("���� ������ ��� ���� �Դϴ�.");
		} else {
		System.out.print("���� ������ ��� ���� �����ϴ�.");
		}

		if (mat > 100 || mat <= 0 ) {
			System.out.println("���� �Է°��� �ʰ��Ͽ����ϴ�. ");
		} else if (mat > avr ) {								// A,B ���� ������ 100���� �� �Ѱ� 
		 System.out.print("���� ������ ��� ���� �����ϴ�.");
		} else if (mat == avr) {
			System.out.print("���� ������ ��� ���� �Դϴ�.");
		} else  {
		System.out.print("���� ������ ��� ���� �����ϴ�.");
		}

		
		
		
		// ������ 100���� �Ѿ�� �ȵȴ�. ������ �ִ밪�� 100 
		
		
		
		
	}

}
