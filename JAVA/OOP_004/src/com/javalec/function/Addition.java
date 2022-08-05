package com.javalec.function;

public class Addition {
	//Field
	public int num1;
	public int num2;
			
	
	//Constructor 생성자에서 private는 없다.
	public Addition() {
		
	}
	
	
	// Method 
	//case: 1, parameter 없이 변수 받아서 출력, ()안에 비워 있는 게 parameter
	public void addAction() {
		System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
	}
	// void가 없을 경우 return으로 값 변환
	public int addReturn() {
		return (num1 +num2);
	}
	

}
