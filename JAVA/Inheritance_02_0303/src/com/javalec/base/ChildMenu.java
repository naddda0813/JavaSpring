package com.javalec.base;

public class ChildMenu extends ParentsMenu {
	//���
	//Field
	
	//Constructor
	public ChildMenu () {
		
	}
	
	
	//Method
	public void makeBeefChung() {
		System.out.println("�Ұ�� û����");
	}
	public void makeHotDoen() {
		System.out.println("��ū ���屹");
	}
	public void makeKongNaMuel()	{
		System.out.println("�ᳪ����");
	}
	
	@Override //��ӹ��� ���� �ٲپ� ���ڴ�. �����ε��� ����
	public void makeChung() {
		System.out.println("�������� û����");
	}
}

