package com.javalec.basse;

import java.util.Scanner;

public class quiz05 {

	public static void main(String[] args) {
		//�л����� 4���̰� ������ 3������ ����� ���� �հ�� ��� ���ϱ� ��� �߰�
		
		// �����Է��� for�� �����Է� �ȿ� ������ ����
		// �Ѹ�� ������ ������ �螌�� �Է�
		Scanner scanner = new Scanner(System.in);
		int[] score= new int[4]; 		// ���� 4����� �Է�
		int[] avg = new int[3];		// �ο��� 3������� �Է�
		int[][]	arr = new int[3][4];
		int total = 0 ;
		
		
		
		
		
		
		//�����Ͱ� �Է¹ޱ�
		System.out.println("Korean�� ������ �Է�:");
		
		for(int i=0;i<score.length;i++){
		System.out.print("No"+(i+1)+	"�� ������ : ");
		int kor = scanner.nextInt() ;
		}
		
		System.out.println("English	�� ������ �Է�:");
		
		for(int i=0;i<score.length;i++){
		System.out.print("No"+(i+1)+	"�� ������ : ");
		int eng = scanner.nextInt() ;
			}
		
		System.out.println("Mathmatics�� ������ �Է�:");
		
		for(int i=0;i<score.length;i++){
		System.out.print("No"+(i+1)+	"�� ������ : ");
		int mat = scanner.nextInt() ;
			}
		
		// �Ѹ�� ���� ������ ��ձ��ϱ�
		
		
		
		
		
		System.out.println("\tKorean\t\t"+"English\t\t"+"Mathmatics\t"+"Total\t"+"Average");
		for(int i=0;i<arr.length;i++ )	{  	//���� ����
			for(int j =0;j<arr[i].length;j++)	{
				System.out.println(arr[i][j]+ "\t");
			}
			System.out.println("No" +(i+1 )); 
	//		for(int j=0;j<histo.length;j++ )	{
			System.out.println();	// ������ ��µ� �� �ٹٲ�
			}
			
			
		
		
		
		
	

}
}
