package com.javalec.base;

import java.util.Scanner;

public class SumEvenOdd {

	
		// Field (Property)
	
		//Constructor
		public SumEvenOdd() {
			// TODO Auto-generated constructor stub
		}
	
	
		// Method(���)
		// �հ踦 ���ϴ� Method
		public int sumCalc(int startNum, int endNum) {
			int sum = 0 ; 
			for(int i=startNum; i<=endNum; i++) {
				sum+=i;
			}
			return sum;
		}
		
		//Ȧ¦�� �Ǵ��ϴ� Method
		public String evenOdd(int sum) {
			int checkNum = sum % 2;
			String str = "";
			
			if(checkNum == 0 ) {
				str = "¦��";
			} else {
				str = "Ȧ��";
			}
			
			 return str;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
