package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10 ; 
		int j = 20 ;
		
		System.out.println("Add : " + (i + j) );
		System.out.println("Sub : " + (i - j) );
		System.out.println("Mul : " + (i * j) );
		
		//결과값이 0으로 나옴을 방지하기 위해 try, 이상이 있을 때 catch 메세지 출력
		try {
		System.out.println("Div : " + (i / j) );
		} catch (Exception e) {
			
			System.out.println("0으로 나누기는 불가 합니다.");
		}
		
		
		
		

	}

}
