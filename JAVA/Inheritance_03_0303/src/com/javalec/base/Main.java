package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StoreHQ[] store = {new StoreHQ(),new StoreShop1(),new StoreShop2(),new StoreShop3()};
		// new ���� ����� ������
		
	//	StoreHQ HQ = new StoreHQ()	;
	//	int i = 0 ;  ���� ���� ��
		// ������ ���� store�� ����ŭ �ݺ�
		for(int i=0; i < store.length;i++) {
			store[i].orderKim();
			store[i].orderBu();
			store[i].orderBi();
			store[i].orderSoon();
			store[i].orderKong();
		}
		

		
		

		
		
		
		
	}

}
