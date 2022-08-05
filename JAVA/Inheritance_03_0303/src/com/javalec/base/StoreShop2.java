package com.javalec.base;

public class StoreShop2 extends StoreHQ{
	 
	public StoreShop2() {
		
	}
	//order하고 ctrl space, 퍼블릭 메소드 이름 호출
	// 부대찌개 : 5000원
	@Override
	public void orderBu() {
		System.out.println("부대찌개 :5000원");
	}
	
	@Override
	public void orderBi() {
		System.out.println("비빔밥 : 5000원");
	}
	@Override
	public void orderSoon() {
		System.out.println("순대국:4000원");
	}
	
	@Override
	public void orderKong() {
	System.out.println("공기밥 :무료입니다");
	}
	// 공기밥 :무료입니다
	
	

}
