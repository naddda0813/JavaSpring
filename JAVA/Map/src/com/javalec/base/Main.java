package com.javalec.base;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> hashMap1 = new  HashMap<String, String> ();// ��ȣ ���� �����Ͱ�
	hashMap1.put("apple", "���");
	hashMap1.put("banana,", "�ٳ���");
	hashMap1.put("melon"	, "���");
	hashMap1.put("strawberry", "����");
	
	System.out.println(hashMap1);
	//������ ������� ����. ������� ���÷� �ϸ� list �̿�
	String str = hashMap1.get("melon");// melon������ ���� ���������
	System.out.println(str);
	
	
	}

}
