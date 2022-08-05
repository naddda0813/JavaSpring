package com.javalec.base;

public class StoreShop1 extends StoreHQ { // 상속받기,extends로

	public StoreShop1() {
		
	}
	public void order()	{
		super.orderKim();  // storehq출력
		this.orderKim();	// 자기 클래스의 메소드 출력
	}
	
	
	//이 가게만 김치찌개 4,500원
	@Override
	public void orderKim() {
		System.out.println("김치찌개 : 4500원");
	}
	
	//부대찌개 5,000원
	@Override
	public void orderBu() {
			System.out.println("부대찌개 :5000원");
	}
	
	//순대국 : 판매하지 않습니다
	@Override
		public void orderSoon() {
		System.out.println("판매하지 않습니다");
		}
	
	
	
}
