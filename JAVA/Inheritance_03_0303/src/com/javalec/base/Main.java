package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StoreHQ[] store = {new StoreHQ(),new StoreShop1(),new StoreShop2(),new StoreShop3()};
		// new 뒤의 녹색은 데이터
		
	//	StoreHQ HQ = new StoreHQ()	;
	//	int i = 0 ;  위와 같은 말
		// 본사의 부터 store의 수만큼 반복
		for(int i=0; i < store.length;i++) {
			store[i].orderKim();
			store[i].orderBu();
			store[i].orderBi();
			store[i].orderSoon();
			store[i].orderKong();
		}
		

		
		

		
		
		
		
	}

}
