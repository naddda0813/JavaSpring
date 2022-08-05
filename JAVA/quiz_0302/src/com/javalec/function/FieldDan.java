package com.javalec.function;

public class FieldDan {

	public int dan = 0 ;	// 단이라는 변수만 필요
	
	//construtor
	public FieldDan()	{
		
	}
	//Method 
	public void printDan() {
		for(int i=1;i<=9;i++) {			//9곱까지	
			if( i%2 == 0) {
				System.out.println( dan + " X " + "*" + " = " +(dan*i) );
			} else{
				System.out.println( dan + " X " + i + " = " +(dan*i) );
			}
			
		}
	}
	// 배열이용방법, 위의 method와 동시에 실행하면 같은 값만 두번 출력됨
	public String[] returnArrDan() {
		String[] arr = new String[9];		//9곱까지만
		
	//	for(int i=1;i<=9;i++) {
	//		arr[i-1] = ("(FieldArr)" +dan + " X " +i+ " = " +(dan*i));
	//	}	//0단부터 시작하기 위해 
		return arr;
	}
	
	
}
