package com.javalec.base2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		System.out.println("�Է��� ������ ����?");
		int inputNum = scanner.nextInt()	;
		
		//���� ������ŭ �Է¹ޱ� 
		System.out.println(inputNum + "���� ���ڸ� �Է��ϼ���!");
		for(int i=1;i<=inputNum;i++) {
			System.out.println(i +"�� ����:");
			int arrayNum=scanner.nextInt()	;
			arrayList.add(arrayNum);//�迭�� �����ֱ�
		}
		
		//������ ���� �迭���� ����
		System.out.println("���°�� ���ڸ� �����Ͻðڽ��ϱ�? :");
		int outNum = scanner.nextInt()	;
		arrayList.remove(outNum -1); 
		
		// ����ϱ�
		System.out.println("--------���-------");
		//�迭���� �� ũ�⸸ŭ �迭 ���
		for(int j=0;j<arrayList.size();j++) {
			// ũ�⸸ŭ ���, for�� �տ��� ����ؾ� �ϰ� get(j)�� ���� ������ �迭�� ��µ�
			//get(j)��� �ؾ� �Ѱ��� ���� ���
			System.out.println(arrayList.get(j));
		}
		
		
		
		
		
		
		
		
		
	}

}
