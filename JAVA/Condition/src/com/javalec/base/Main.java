package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// �񱳹�, ���ǹ�
		int i = 10, j=20, k=10;
		
		// i�� j���� ũ�� ...
		if(i>j) {
			System.out.println("i�� j���� Ů�ϴ�."); // i�� ũ�� ������ ������� ����
			
		}
		
		
		
		
		// i�� k�� ������ ...
		if(i==k) {
		
		System.out.println("i�� k�� �����ϴ�.");
		}
		
		// -----------
		
		if(i > j ) {
			System.out.println("i�� j���� " + (i-j) + "��ŭ Ů�ϴ�.");
		}else {
			System.out.println("j�� i����" + (j-i) + "��ŭ Ů�ϴ�.");
		}
		
		//------------
		
		if(i > j ) {
			System.out.println("i�� j���� " + (i-j) + "��ŭ Ů�ϴ�.");
		} else if(i < j) {
			System.out.println("j�� i����" + (j-i) + "��ŭ Ů�ϴ�.");
		} else {
			System.out.println("i�� j�� ���� �մϴ�.");
			
		}
		
		
		
		
		// End
		System.out.println("----- End ---");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
