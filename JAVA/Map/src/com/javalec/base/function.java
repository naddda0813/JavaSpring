package com.javalec.base;

public class function {

	public class SumEvenOdd{
		public int sumCalc(int ii,int jj) {
			int sum = 0;
			for(int i=ii;i<=jj;i++) {
				sum += i;
			}
			return sum;
	}
	
	//���� ¦������ Ȧ������ �Ǻ�
	public String evenodd(int kk) {
		int k = kk % 2;
		String chk = null;
		if(k==0) {chk = "¦��";}
		else {chk = "Ȧ��";}
		return chk;
	}
}
	
	
	
	
}
