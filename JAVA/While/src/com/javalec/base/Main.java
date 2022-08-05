package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1부터 100까지의 합을 구하기
/*	int i=0, tot = 0;
		while(true)	{
			tot += i ; 
			i++;
			if(i>100) {
				break;			// 100을 넘을 때 실행중지
			}
		}
		System.out.println("1부터 100까지의 합은 "+ tot + " 입니다.");
		
*/
		
/*		for(int i=0;i<=100; i++)	{
			if(i==10) {
				System.out.println("Find");						// 답을 찾으면 실행 중지
			}
			System.out.println(i);
		}
*/	
		for(int i=0;i<=100; i++)	{
			if(i==10) {
				continue;					// continue에 해당하면 생략하고 다음값 출력
			}
			System.out.println(i);
		}
	
	
	}	
}
		
		
		
		
		
		
		
		
		