package com.javalec.base;

import com.javalec.function.Car;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		//Field �� �б�
		System.out.println("����ȸ�� : " + myCar.company);
		System.out.println("�𵨸� : "+ myCar.model);
		System.out.println("���� : "+ myCar.color);
		System.out.println("�ְ�ӵ� : "+ myCar.maxSpeed);
		System.out.println("����ӵ� : "+ myCar.speed);
	
		
		
		
		
		//Field ����
		 myCar.speed = 60;
		 System.out.println("������ �ӵ�: " + myCar.speed);
		 
		 
		 
		//------------
		Car myCar2 = new Car();
		System.out.println("My Car�Ǽӵ� :" + myCar2.speed);
		
		System.out.println(myCar == myCar2);
		 
		 
	}

}
