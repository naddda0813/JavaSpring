package com.javalec.base;

public class StoreShop1 extends StoreHQ { // ��ӹޱ�,extends��

	public StoreShop1() {
		
	}
	public void order()	{
		super.orderKim();  // storehq���
		this.orderKim();	// �ڱ� Ŭ������ �޼ҵ� ���
	}
	
	
	//�� ���Ը� ��ġ� 4,500��
	@Override
	public void orderKim() {
		System.out.println("��ġ� : 4500��");
	}
	
	//�δ�� 5,000��
	@Override
	public void orderBu() {
			System.out.println("�δ�� :5000��");
	}
	
	//���뱹 : �Ǹ����� �ʽ��ϴ�
	@Override
		public void orderSoon() {
		System.out.println("�Ǹ����� �ʽ��ϴ�");
		}
	
	
	
}
