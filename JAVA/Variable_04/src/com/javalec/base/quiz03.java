package com.javalec.base;

import java.util.Scanner;

public class quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Log in Check
		//user id 
		//password
		//ȯ���մϴ�
		//if not ��ϵ� ����ڰ� �ƴմϴ�
		
		
		// id �Է�
		Scanner scanner = new Scanner(System.in) ;
		
		System.out.println("** Log In Check ** ");
		System.out.println("User id : ");
		String id = scanner.nextLine() ;		// id �Է�
		
		System.out.println("Password : ");		// password �Է�
		int pass = scanner.nextInt() ; 
		
		
		// id�� password �� ���������� �¾ƾ� �α���, ������ ����
		if(id.equals("root") && pass == 1234) {
			System.out.println("ȯ���մϴ�.");
		} else
			System.out.println("��ϵ� ����ڰ� �ƴմϴ�.");
		
		
		
		
		
		
		
	}

}
