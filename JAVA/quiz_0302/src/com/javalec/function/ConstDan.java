package com.javalec.function;

public class ConstDan {
		
	 int dan = 0 ; 
	 //������ ���콺>source> generate constructor 
	 
	 public ConstDan(int dan) {
		super();
		this.dan = dan;
		
	}
	
	public void  printDan ()	{
		for(int i=1;i<=9;i++) {
			System.out.println( dan+" X "+ i + " = " +(dan*i));
			
	}
	
	}
}

	
	
