package com.javalec.base;

import com.javalec.function.Car;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		//Field 값 읽기
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : "+ myCar.model);
		System.out.println("색상 : "+ myCar.color);
		System.out.println("최고속도 : "+ myCar.maxSpeed);
		System.out.println("현재속도 : "+ myCar.speed);
	
		
		
		
		
		//Field 변경
		 myCar.speed = 60;
		 System.out.println("수정된 속도: " + myCar.speed);
		 
		 
		 
		//------------
		Car myCar2 = new Car();
		System.out.println("My Car의속도 :" + myCar2.speed);
		
		System.out.println(myCar == myCar2);
		 
		 
	}

}
