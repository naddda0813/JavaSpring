package com.javalec.base;

import java.util.Scanner;

public class quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// ��� ���� Ȧ���̸� _�� ������
		  

		
		for(int gop = 1; gop<=9;gop++) {
																//2*���� 9*����
				for(int dan = 2; dan<=9;dan++)	{				//*1���� *9����
					if (gop%2 == 1) {
						System.out.print(dan +"*" + "��" + "=" +(dan * gop) +"\t"); // ������� 2*1, 3*1
					} else {
						System.out.print(dan +"*" + gop + "=" +(dan * gop)+ "\t"); // ������� 2*1, 3*1
					}
			}
			System.out.println(); 		//1�� ��� �ϰ� 2�� ������� �Ѿ
			}
	}
	
}
