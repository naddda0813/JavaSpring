package com.javalec.base;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Random random = new Random();
		int temp = random.nextInt(3)+1;    ///1���� 3���� ������� 
		if(temp==1) {
			System.out.println("����");
		} else if (temp==2 ) {
		System.out.println("����");
		} else {
			System.out.println("��");
		}
		
		
		
	}

}
