package com.javalec.base;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1부터 10까지의 합을 구하여 출력
		//그합이 짝수인지 홀수인지 판별
		
/*		int sum = 0 ; 
		
		for(int i=1;i<=10;i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합은:" + sum);
	 
	    	if(sum%2 == 1) {
	    		System.out.println("합은 홀수 입니다." );
	    	
	    	} else {
	    		System.out.println("합은 짝수 입니다.");
	    		
	    	}
	*/    
		
		
		int i=1,j=10;
		SumEvenOdd sumEvenOdd = new SumEvenOdd(); 
		int sum = sumEvenOdd.sumCalc(i, j);		//시작값, 최종값
		String result = sumEvenOdd.evenOdd(sum); //짝홀을 문자로 구분
		
		
		System.out.println(i + " ~ " + j + "의 합은" +sum +"입니다.");
		
		// 홀짝 구분하기
		System.out.println(result + "입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
