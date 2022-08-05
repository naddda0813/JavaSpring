package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder("abcdefg");
		StringBuffer stringBuffer = new StringBuffer("abcdefg")	;
		
		stringBuilder.append("hijklmn")		;	//같은 줄에 이어서 배열
		
	//	stringBuilder.insert(3, "ZZZZ");		// 3번째 문자 앞에 실행,2글자 제외하고 3번째문자가 사라지지 않는다.
		stringBuilder.delete(3, 5);				//3번째문자부터 5번째 문자 앞까지 
		System.out.println(stringBuilder);
		
		
	}

}
