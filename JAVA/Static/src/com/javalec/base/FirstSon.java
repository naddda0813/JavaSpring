package com.javalec.base;

public class FirstSon {
	
	public FirstSon() {
		
	}
	
	
	// Method
	public void takeChoco() {
/*		MamaBag bag = new MamaBag();
		bag.choco = bag.choco - 1; //���� �����Ŷ� -1
		
		if(bag.choco <0 ) {
			System.out.println("ù°�� �������� �԰� �;��!");
		} else {
			System.out.println("ù°�� ���ְ� �Ծ����!");
		}
*/		
		MamaBag.choco = MamaBag.choco - 1;
		if(MamaBag.choco < 0) {
			System.out.println("ù°�� �������� �԰� �;��!");
		} else {
			System.out.println("ù°�� ���ְ� �Ծ����!");
		}
		
	}

}
