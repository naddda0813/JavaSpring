package com.javalec.function;

public class MultiCalc {
	//Method 4�� ������ 1���� public
	//field ����
	int choiceNumber;
	int first;
	int second; 
	
	
	//constructor
	public MultiCalc() {
	}
	
	
	
	//method 4��, ��ȣ �ȿ� ����δ� ������ main���� �ҷ��� ���� �ʾƵ� �Ǵϱ�
	private void addition ()	{
		System.out.println(first + " + " + second + "=" + (first+second) );
	}
	private void substraction()	{
		System.out.println(first+ " - " + second + "=" + (first - second));
	}
	private void multiplication() {
		System.out.println(first + " X " + second + "=" + (first*second));
	}
	// ���հ��
	public void calc(int choiceNumber,int firstNum,int secondNum) {
		first = firstNum;
		second = secondNum;
		if(choiceNumber == 1) {
			addition();
		} else if(choiceNumber == 2) {
			substraction();
		} else if(choiceNumber == 3) {
			multiplication();
		} else {
			System.out.println("Error");
		}
			
		
		
	}
	
	
	
	
	
}
