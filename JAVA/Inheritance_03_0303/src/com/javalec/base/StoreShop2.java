package com.javalec.base;

public class StoreShop2 extends StoreHQ{
	 
	public StoreShop2() {
		
	}
	//order�ϰ� ctrl space, �ۺ� �޼ҵ� �̸� ȣ��
	// �δ�� : 5000��
	@Override
	public void orderBu() {
		System.out.println("�δ�� :5000��");
	}
	
	@Override
	public void orderBi() {
		System.out.println("����� : 5000��");
	}
	@Override
	public void orderSoon() {
		System.out.println("���뱹:4000��");
	}
	
	@Override
	public void orderKong() {
	System.out.println("����� :�����Դϴ�");
	}
	// ����� :�����Դϴ�
	
	

}
