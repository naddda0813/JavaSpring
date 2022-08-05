package com.javalec.base2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		System.out.println("입력할 숫자의 갯수?");
		int inputNum = scanner.nextInt()	;
		
		//숫자 갯수만큼 입력받기 
		System.out.println(inputNum + "개의 숫자를 입력하세요!");
		for(int i=1;i<=inputNum;i++) {
			System.out.println(i +"의 숫자:");
			int arrayNum=scanner.nextInt()	;
			arrayList.add(arrayNum);//배열에 더해주기
		}
		
		//삭제할 숫자 배열에서 삭제
		System.out.println("몇번째의 숫자를 삭제하시겠습니까? :");
		int outNum = scanner.nextInt()	;
		arrayList.remove(outNum -1); 
		
		// 출력하기
		System.out.println("--------결과-------");
		//배열에서 그 크기만큼 배열 출력
		for(int j=0;j<arrayList.size();j++) {
			// 크기만큼 출력, for문 앞에서 출력해야 하고 get(j)를 하지 않으면 배열로 출력됨
			//get(j)라고 해야 한개씩 따로 출력
			System.out.println(arrayList.get(j));
		}
		
		
		
		
		
		
		
		
		
	}

}
