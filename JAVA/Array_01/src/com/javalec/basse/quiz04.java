package com.javalec.basse;

import java.util.Scanner;

public class quiz04 {

	public static void main(String[] args) {
		// 10���� ����(0������ 99��)�� �η¹޾� ������ ������ 10�� ������ �������� �� ������׷��� ǥ���϶�.
		// ���� ����
		Scanner scanner = new Scanner(System.in);
		int[] histo = new int[10];			// ������ ���� �迭
		
		//������ �޾ƿ���
		System.out.println("Input score:");
		for(int i = 0; i<histo.length;i++) {
			System.out.println(	(i+1)+"�� score:");
			histo[scanner.nextInt() / 10 ] ++ ;
		}
		scanner.close();
		
		// �޾ƿ� ������ ������׷� Ÿ������ ����ϱ�
		System.out.println("------Histogram---- ") ;
		
		for(int i=(histo.length - 1) ; i>=0; i--) {
			System.out.print(String.format("%3d : ", i * 10)); 	// 90���� ���ʴ�� ���, %d: 10���� ����,3:���ڸ��� ����
			for(int j =1; j<=histo[i];j++)	{
				System.out.print("#");
			}
			System.out.println();
		}
		
		
	
		
	}

}

