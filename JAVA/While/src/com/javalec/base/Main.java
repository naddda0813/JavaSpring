package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1���� 100������ ���� ���ϱ�
/*	int i=0, tot = 0;
		while(true)	{
			tot += i ; 
			i++;
			if(i>100) {
				break;			// 100�� ���� �� ��������
			}
		}
		System.out.println("1���� 100������ ���� "+ tot + " �Դϴ�.");
		
*/
		
/*		for(int i=0;i<=100; i++)	{
			if(i==10) {
				System.out.println("Find");						// ���� ã���� ���� ����
			}
			System.out.println(i);
		}
*/	
		for(int i=0;i<=100; i++)	{
			if(i==10) {
				continue;					// continue�� �ش��ϸ� �����ϰ� ������ ���
			}
			System.out.println(i);
		}
	
	
	}	
}
		
		
		
		
		
		
		
		
		