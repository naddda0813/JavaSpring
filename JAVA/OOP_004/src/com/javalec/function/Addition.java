package com.javalec.function;

public class Addition {
	//Field
	public int num1;
	public int num2;
			
	
	//Constructor �����ڿ��� private�� ����.
	public Addition() {
		
	}
	
	
	// Method 
	//case: 1, parameter ���� ���� �޾Ƽ� ���, ()�ȿ� ��� �ִ� �� parameter
	public void addAction() {
		System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
	}
	// void�� ���� ��� return���� �� ��ȯ
	public int addReturn() {
		return (num1 +num2);
	}
	

}
