package com.javalec.base;

public class Main {

	public static void main(String[] ards) {
		//상속
		//Field
		Child child = new Child()	;
		
		//Constructor
		
		System.out.print("아버지 성함");
		child.getFather();
		
		System.out.print("어머니 성함");
		child.getMother();
		
		System.out.print("내 성함은");
		child.getMe();
		
	}
}
