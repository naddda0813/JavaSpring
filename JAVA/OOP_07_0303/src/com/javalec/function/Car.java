package com.javalec.function;

public class Car {

	//Field
	public String company = "현대자동차";
	public String model;
	public String color;
	public int maxSpeed;
	
	//Constructor
	public Car()	{
		
	}
	
	// 오버로딩
	//car2선언, company는 현대자동차로 지정되어 있으므로 안해야함 
	public Car(String model) {
		super();
		this.model = model;
	}

	// car3 선언 
	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}


	// car4 선언 
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
