package com.javalec.function;

public class Car {

	//Field
	public String company = "�����ڵ���";
	public String model;
	public String color;
	public int maxSpeed;
	
	//Constructor
	public Car()	{
		
	}
	
	// �����ε�
	//car2����, company�� �����ڵ����� �����Ǿ� �����Ƿ� ���ؾ��� 
	public Car(String model) {
		super();
		this.model = model;
	}

	// car3 ���� 
	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}


	// car4 ���� 
	public Car(String model, String color, int maxSpeed) {
		super();
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}


	//Method
	public int add(int num1,int num2) {
		return num1 + num2;
	}
	
	public int add(int num1,int num2,int num3	) {
		return num1 + num2+ num3;
	}
	
	
}
