package com.javalec.base;
//class의 StoreShop1에 빨간줄이 생기면 마우스로 add unimplentment methods

public class StoreShop1 extends StoreHQ { // 본사의 상속 받기
	//constructor
	public StoreShop1()	{
		
	}
	//본사 가져와 오버라이드
	@Override
		public void orderKim() {
			// TODO Auto-generated method stub
			System.out.println("김치찌개(S1) : 4500원");
		}
	
	@Override
		public void orderBu() {
			// TODO Auto-generated method stub
			System.out.println("부대찌개(S1) : 5000원");
		}
	
	@Override
	public void orderSoon() {
		// TODO Auto-generated method stub
		System.out.println("순대국은 판매하지 않습니다.");
	}
	@Override
	public void orderBi() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void orderKong() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
