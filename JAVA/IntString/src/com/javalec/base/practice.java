package com.javalec.base;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1���� 10������ ���� ���Ͽ� ���
		//������ ¦������ Ȧ������ �Ǻ�
		
/*		int sum = 0 ; 
		
		for(int i=1;i<=10;i++) {
			sum += i;
		}
		System.out.println("1���� 10������ ����:" + sum);
	 
	    	if(sum%2 == 1) {
	    		System.out.println("���� Ȧ�� �Դϴ�." );
	    	
	    	} else {
	    		System.out.println("���� ¦�� �Դϴ�.");
	    		
	    	}
	*/    
		
		
		int i=1,j=10;
		SumEvenOdd sumEvenOdd = new SumEvenOdd(); 
		int sum = sumEvenOdd.sumCalc(i, j);		//���۰�, ������
		String result = sumEvenOdd.evenOdd(sum); //¦Ȧ�� ���ڷ� ����
		
		
		System.out.println(i + " ~ " + j + "�� ����" +sum +"�Դϴ�.");
		
		// Ȧ¦ �����ϱ�
		System.out.println(result + "�Դϴ�.");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
