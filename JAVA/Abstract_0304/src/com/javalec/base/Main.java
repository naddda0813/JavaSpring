package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("---HQ---");
		
		StoreHQ hq = new StoreHQ();
		hq.orderKim();
		hq.orderBu();
		hq.orderBi();
		hq.orderSoon();
		hq.orderKong();
		
		System.out.println("---Shop1---");
		StoreShop1 shop1 = new StoreShop1()	;
		shop1.orderKim();
		shop1.orderBu();
		shop1.orderBi();
		shop1.orderSoon();
		shop1.orderKong();
		
		System.out.println("---Shop2---");
		StoreShop2 shop2 = new StoreShop2()	;
		shop2.orderKim();
		shop2.orderBu();
		shop2.orderBi();
		shop2.orderSoon();
		shop2.orderKong();
	
		
		
		
		
	}

}
