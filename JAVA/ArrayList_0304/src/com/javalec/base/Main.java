package com.javalec.base;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(">>>ArrayList<<<");

		//����
		ArrayList<String> arrayList = new ArrayList<String>();
		
		//������ �߰�
		arrayList.add("str1");
		arrayList.add("str2");
		arrayList.add("str3");
		arrayList.add("str4");
		
		//Ȯ���ϱ�
		System.out.println(arrayList.toString());	//string���� �ٲ�.���� string��
		
		//�ҷ�����
		String no1 = arrayList.get(0);	//0��°�� str1�� ���
		System.out.println(no1);
		
		//�����ϱ�
		arrayList.set(2, "str333");		//2��°�� str3�� �ٲ� ���
		
		//Ȯ��
		System.out.println(arrayList.toString());
		
		//�����ϱ�
		arrayList.remove(2);
		System.out.println(arrayList.toString());
		
		//ũ�� �˱�
		int size = arrayList.size();		//���� ���� �˷���
		System.out.println("Size : " + size);
		
		//����
		
		
		
		
		
		
		
		
		// Quiz Arraylist intList�� 1���� 100������ ���� ��������...
		
/*		System.out.println("Quiz Arraylist intList");
		
		//����
		ArrayList<Integer> intList =new ArrayList<Integer>();
		
		//�������߰�
		for(int i=1;i<=100;i++) {
		intList.add(i);
		}
		
		//Ȯ���ϱ�
		System.out.println(intList);
		*/
	}

}
