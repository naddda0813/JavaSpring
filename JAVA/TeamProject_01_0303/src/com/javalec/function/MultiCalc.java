package com.javalec.function;

public class MultiCalc {
	//Method 4개 마지막 1개만 public
	//field 선언
	int choiceNumber;
	int first;
	int second; 
	
	
	//constructor
	public MultiCalc() {
	}
	
	
	
	//method 4개, 괄호 안에 비워두는 이유는 main에서 불러서 쓰지 않아도 되니까
	private void addition ()	{
		System.out.println(first + " + " + second + "=" + (first+second) );
	}
	private void substraction()	{
		System.out.println(first+ " - " + second + "=" + (first - second));
	}
	private void multiplication() {
		System.out.println(first + " X " + second + "=" + (first*second));
	}
	// 복합계산
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
