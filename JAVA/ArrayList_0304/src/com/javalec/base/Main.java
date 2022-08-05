package com.javalec.base;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(">>>ArrayList<<<");

		//구성
		ArrayList<String> arrayList = new ArrayList<String>();
		
		//데이터 추가
		arrayList.add("str1");
		arrayList.add("str2");
		arrayList.add("str3");
		arrayList.add("str4");
		
		//확인하기
		System.out.println(arrayList.toString());	//string으로 바꿈.같은 string임
		
		//불러오기
		String no1 = arrayList.get(0);	//0번째의 str1을 출력
		System.out.println(no1);
		
		//변경하기
		arrayList.set(2, "str333");		//2번째의 str3을 바꿔 출력
		
		//확인
		System.out.println(arrayList.toString());
		
		//삭제하기
		arrayList.remove(2);
		System.out.println(arrayList.toString());
		
		//크기 알기
		int size = arrayList.size();		//현재 갯수 알려줌
		System.out.println("Size : " + size);
		
		//삽입
		
		
		
		
		
		
		
		
		// Quiz Arraylist intList에 1부터 100까지의 수를 넣으세요...
		
/*		System.out.println("Quiz Arraylist intList");
		
		//구성
		ArrayList<Integer> intList =new ArrayList<Integer>();
		
		//데이터추가
		for(int i=1;i<=100;i++) {
		intList.add(i);
		}
		
		//확인하기
		System.out.println(intList);
		*/
	}

}
