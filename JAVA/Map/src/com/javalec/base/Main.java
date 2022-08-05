package com.javalec.base;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> hashMap1 = new  HashMap<String, String> ();// 괄호 안은 데이터값
	hashMap1.put("apple", "사과");
	hashMap1.put("banana,", "바나나");
	hashMap1.put("melon"	, "멜론");
	hashMap1.put("strawberry", "딸기");
	
	System.out.println(hashMap1);
	//랜덤한 순서대로 나옴. 순서대로 나올려 하면 list 이용
	String str = hashMap1.get("melon");// melon번쩨의 값을 다음값출력
	System.out.println(str);
	
	
	}

}
