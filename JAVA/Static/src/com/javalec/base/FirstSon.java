package com.javalec.base;

public class FirstSon {
	
	public FirstSon() {
		
	}
	
	
	// Method
	public void takeChoco() {
/*		MamaBag bag = new MamaBag();
		bag.choco = bag.choco - 1; //초코 먹을거라 -1
		
		if(bag.choco <0 ) {
			System.out.println("첫째는 초코파이 먹고 싶어요!");
		} else {
			System.out.println("첫째는 맛있게 먹었어요!");
		}
*/		
		MamaBag.choco = MamaBag.choco - 1;
		if(MamaBag.choco < 0) {
			System.out.println("첫째는 초코파이 먹고 싶어요!");
		} else {
			System.out.println("첫째는 맛있게 먹었어요!");
		}
		
	}

}
