package com.javalec.base;

public class ChildMenu extends ParentsMenu {
	//상속
	//Field
	
	//Constructor
	public ChildMenu () {
		
	}
	
	
	//Method
	public void makeBeefChung() {
		System.out.println("소고기 청국장");
	}
	public void makeHotDoen() {
		System.out.println("얼큰 된장국");
	}
	public void makeKongNaMuel()	{
		System.out.println("콩나물국");
	}
	
	@Override //상속받은 것을 바꾸어 쓰겠다. 오버로딩과 구분
	public void makeChung() {
		System.out.println("냄새없는 청국장");
	}
}

