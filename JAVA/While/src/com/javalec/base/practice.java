package com.javalec.base;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 현재 몸무게와 목표 몸무게를 입력 받기
		Scanner scanner = new Scanner(System.in) ;
		
		System.out.print("현재 몸무게를 입력하세요 : ");
		int nowWeight = scanner.nextInt()	;
		System.out.print("목표 몸무게를 입력하세요: ");
		int goalWeight = scanner.nextInt()	;
		
		int week = 1 ; // i주차별 몸무게 입력받기
		
		while(nowWeight > goalWeight)	{		// 현재몸무게가 지금 몸무게보다 커야 함
			System.out.println(week + "주차 감량 몸무게:");
			int dietWeight = scanner.nextInt()	;
			nowWeight = (nowWeight - dietWeight) ; //현재몸무게는 주자별 감량 몸무게를 뺀거
			
			if(nowWeight <= goalWeight) {
				System.out.print(nowWeight + "kg 달성!! 축하드립니다");
				break;
		}	
				week++ ;					// if문 완성하고 실현되지 않으면 1주 더하기
			
			}
		}
	}


