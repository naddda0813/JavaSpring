package com.javalec.base;
//class�� StoreShop1�� �������� ����� ���콺�� add unimplentment methods

public class StoreShop1 extends StoreHQ { // ������ ��� �ޱ�
	//constructor
	public StoreShop1()	{
		
	}
	//���� ������ �������̵�
	@Override
		public void orderKim() {
			// TODO Auto-generated method stub
			System.out.println("��ġ�(S1) : 4500��");
		}
	
	@Override
		public void orderBu() {
			// TODO Auto-generated method stub
			System.out.println("�δ��(S1) : 5000��");
		}
	
	@Override
	public void orderSoon() {
		// TODO Auto-generated method stub
		System.out.println("���뱹�� �Ǹ����� �ʽ��ϴ�.");
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
