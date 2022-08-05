package com.javalec.base;

import java.util.Scanner;

public class quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// 결과 값이 홀수이면 _로 나오기
		  

		
		for(int gop = 1; gop<=9;gop++) {
																//2*부터 9*까지
				for(int dan = 2; dan<=9;dan++)	{				//*1부터 *9까지
					if (gop%2 == 1) {
						System.out.print(dan +"*" + "★" + "=" +(dan * gop) +"\t"); // 실행순서 2*1, 3*1
					} else {
						System.out.print(dan +"*" + gop + "=" +(dan * gop)+ "\t"); // 실행순서 2*1, 3*1
					}
			}
			System.out.println(); 		//1곱 계산 하고 2곱 계산으로 넘어감
			}
	}
	
}
