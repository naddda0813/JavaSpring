package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10 ; 
		int j = 20 ;
		
		System.out.println("Add : " + (i + j) );
		System.out.println("Sub : " + (i - j) );
		System.out.println("Mul : " + (i * j) );
		
		//������� 0���� ������ �����ϱ� ���� try, �̻��� ���� �� catch �޼��� ���
		try {
		System.out.println("Div : " + (i / j) );
		} catch (Exception e) {
			
			System.out.println("0���� ������� �Ұ� �մϴ�.");
		}
		
		
		
		

	}

}
