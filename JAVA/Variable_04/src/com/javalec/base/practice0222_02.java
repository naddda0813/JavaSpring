package com.javalec.base;

import java.util.Scanner;

public class practice0222_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("������ �Է��ϼ��� : ");
		int score = scanner.nextInt() ; 
		
		if (score > 100 || score <0) {
			System.out.print("�Է°��� �ʰ��Ͽ����ϴ�."); // 100���̻� �϶� , 0�� �����϶�
		} else if (score >= 90) {
			System.out.print("���ϴ� A�����Դϴ�."); // 100������ 90�� 
		} else if (score >= 80) {
			System.out.println("���ϴ� B�����Դϴ�.");//89������ 80��
		} else if (score >= 70) {
			System.out.print("���ϴ� C�����Դϴ�."); // 79������ 70��
		} else if (score >= 60) {
			System.out.print("���ϴ� D�����Դϴ�."); // 69������ 60��
		} else {
			System.out.print("���ϴ� F�����Դϴ�."); // 0������ 59��
		}

}
}