package com.javalec.base;

import java.util.Scanner;

public class quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Log in Check
		//user id 
		//password
		//환영합니다
		//if not 등록된 사용자가 아닙니다
		
		
		// id 입략
		Scanner scanner = new Scanner(System.in) ;
		
		System.out.println("** Log In Check ** ");
		System.out.println("User id : ");
		String id = scanner.nextLine() ;		// id 입략
		
		System.out.println("Password : ");		// password 입력
		int pass = scanner.nextInt() ; 
		
		
		// id와 password 중 교집합으로 맞아야 로그인, 나머지 오류
		if(id.equals("root") && pass == 1234) {
			System.out.println("환영합니다.");
		} else
			System.out.println("등록된 사용자가 아닙니다.");
		
		
		
		
		
		
		
	}

}
