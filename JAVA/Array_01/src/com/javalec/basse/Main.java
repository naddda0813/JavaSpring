package com.javalec.basse;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		//���ڿ� �迭 7���� ����
//		String[] str = new String[7];
//		
//		str[0] = "sun";
//		str[1] = "mon";
//		str[2] = "tue";
//		str[3] = "wed";
//		str[4] = "thu";
//		str[5] = "fri";
//		str[6] = "sat";
//		
	//	for(int i=1; i<str.length;i=i+2)	{
	//	System.out.println(str[i]);			}	//	��,��, �ݸ� ���	
		
//		for(int i=0; i<str.length;i=i+1) {
//		}
//		System.out.println(str[1] + str[4] + str[5]);	//  ��,�� ,�� �� Ư���� ���� ���, for�� �ȿ��� �ϸ� �迭 ����ŭ �ݺ�
//		}					
	//	System.out.println(str[str.length]);	//���������� �ι�°�͸� sat  ���
	//	System.out.println(str.length);			// �迭�� ���� �˷���,ste
		
		
//		for(int i=0; i<str.length;i++) {
//			System.out.println(str[i]);
//		}
//		
//		System.out.println(str[str.length-1]);
//		
		//-----------------	
/*		String[] str1= {"sun","mon","tue","wed","thr","fri","sat"} ;
		int[] intNum = {1,2,3}	;
		double[] doubleNum = {1.1, 1.2}	;
		boolean[] booleanNum = {true, false, true} ;
*/		
		//1,5,8,12,200, 1002�� ��� ���ϱ�, �迭�� for �� ���
//		
//		String[] str = new String[6];
//		
//		int[]	intNum = {1,5,8,12,200,1002}	;
//		double avg = 0 ;
//		int sum = 0 ;
//		for(int i = 0;i<str.length ;i++) {
//			sum = sum + intNum[i]	;
//			
//		}
//		avg = sum / str.length ; 
//		System.out.println(avg);
		
		//������ ���: 5,3,9��  
//		//�迭�� for���� �̿��Ͽ� ������ ��� , dan * gop = result
//		int[] dan = {5,3,9} ;
//		int gop = 0 ;
//		int i = 0 ; 
//		
//		for(gop=1;gop<=9;gop++) 	
//		{
//			for(i=0;i<dan.length;i++) {
//				System.out.println(dan[i] + "*" +  gop +"=" +(dan[i]*gop)+ "\t");
//			}
//		
//		System.out.println();
//		
		// ** ����ڰ� �Է��ϴ� 5���� �޾Ƽ� �հ踦 ���ϱ�
		
		// ����
		Scanner scanner = new Scanner(System.in);
		int [] number= new int[5] ;
		int total = 0 ;
		
		
		// �Է� �޾ƿ���
		for(int i=0; i<number.length;i++) {
			System.out.println((i+1)+ "���� ���ڸ� �Է��ϼ���");
			number[i] = scanner.nextInt();	// ù��°���� ����,1���� �þ�� +1
		}
		// �հ� ���ؼ� ����ϱ�
		for(int i=0;i<number.length;i++ ) {
			total+=number[i];
		
		}
		System.out.println("���ϰ� �Է��Ͻ� ���� �հ�� " + total + " �Դϴ�.");
		
		}
		
		
		
		
		
		
		
	
	
	}

