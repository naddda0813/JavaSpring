package com.javalec.base;

public class SecondSon {
	
	public SecondSon() {
		
	}


	public void takeChoco() {
//		MamaBag bag = new MamaBag();
//		bag.choco = bag.choco - 1; //���� �����Ŷ� -1
//		
//		if(bag.choco <0 ) {
//			System.out.println("��°�� �������� �԰� �;��!");
//		} else {
//			System.out.println("��°�� ���ְ� �Ծ����!");
//		}
//	
		MamaBag.choco = MamaBag.choco - 1;
		if(MamaBag.choco < 0) {
			System.out.println("��°�� �������� �԰� �;��!");
		} else {
			System.out.println("��°�� ���ְ� �Ծ����!");
		}
		
		
		
}
}
