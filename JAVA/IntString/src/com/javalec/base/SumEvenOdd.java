package com.javalec.base;

import java.util.Scanner;

public class SumEvenOdd {

	
		// Field (Property)
	
		//Constructor
		public SumEvenOdd() {
			// TODO Auto-generated constructor stub
		}
	
	
		// Method(±â´É)
		// ÇÕ°è¸¦ ±¸ÇÏ´Â Method
		public int sumCalc(int startNum, int endNum) {
			int sum = 0 ; 
			for(int i=startNum; i<=endNum; i++) {
				sum+=i;
			}
			return sum;
		}
		
		//È¦Â¦¼ö ÆÇ´ÜÇÏ´Â Method
		public String evenOdd(int sum) {
			int checkNum = sum % 2;
			String str = "";
			
			if(checkNum == 0 ) {
				str = "Â¦¼ö";
			} else {
				str = "È¦¼ö";
			}
			
			 return str;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
