package com.javalec.base;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� �����Կ� ��ǥ �����Ը� �Է� �ޱ�
		Scanner scanner = new Scanner(System.in) ;
		
		System.out.print("���� �����Ը� �Է��ϼ��� : ");
		int nowWeight = scanner.nextInt()	;
		System.out.print("��ǥ �����Ը� �Է��ϼ���: ");
		int goalWeight = scanner.nextInt()	;
		
		int week = 1 ; // i������ ������ �Է¹ޱ�
		
		while(nowWeight > goalWeight)	{		// ��������԰� ���� �����Ժ��� Ŀ�� ��
			System.out.println(week + "���� ���� ������:");
			int dietWeight = scanner.nextInt()	;
			nowWeight = (nowWeight - dietWeight) ; //��������Դ� ���ں� ���� �����Ը� ����
			
			if(nowWeight <= goalWeight) {
				System.out.print(nowWeight + "kg �޼�!! ���ϵ帳�ϴ�");
				break;
		}	
				week++ ;					// if�� �ϼ��ϰ� �������� ������ 1�� ���ϱ�
			
			}
		}
	}


