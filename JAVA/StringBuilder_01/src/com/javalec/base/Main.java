package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder("abcdefg");
		StringBuffer stringBuffer = new StringBuffer("abcdefg")	;
		
		stringBuilder.append("hijklmn")		;	//���� �ٿ� �̾ �迭
		
	//	stringBuilder.insert(3, "ZZZZ");		// 3��° ���� �տ� ����,2���� �����ϰ� 3��°���ڰ� ������� �ʴ´�.
		stringBuilder.delete(3, 5);				//3��°���ں��� 5��° ���� �ձ��� 
		System.out.println(stringBuilder);
		
		
	}

}
