package com.javalec.base;

public class Main {

	
		
		
		public static void main(String[] args) {
		int i =1,j = 10;
		
		SumEvenOdd seo = new SumEvenOdd();
		
		int sum = seo.sumCalc(i, j);
		String 	chk = seo.evenodd(sum);
		 
		//��� �ϱ�
		System.out.println(i+ "~" +j+"��	����"+ sum + " �Դϴ�");
		System.out.println(	chk	+"�Դϴ�.");
				
		}
		
		
		
		
		
		
		
		
	}
		
		
		
		
		

	


