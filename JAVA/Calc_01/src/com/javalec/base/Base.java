package com.javalec.base;

public class Bse {

	public static void main(String[] args) {
		// ������ ������ ���
		int i = 10, j = 2, k = 5 ;
		
		// ��� ������ 
		// ���� : 10 + 2 = 12
		// ���� : 10 - 2 = 8 
		// ���� : 10 * 2 = 20
		// ������ : 10 / 2 = 5
		// ������ : 10% 2 = 0
		
		int intNum1 = 10 ; 
		int intNum2 = 2 ;
		
		
		System.out.println("���� : " + intNum1 + " + " + intNum2 + " = " +(intNum1+ intNum2) );
		System.out.println("���� : " + intNum1 + " - " + intNum2 + " = " +(intNum1- intNum2) );
		System.out.println("���� : " + intNum1 + " * " + intNum2 + " = " +(intNum1* intNum2) );
		System.out.println("������ : " + intNum1 + " / " + intNum2 + " = " +(intNum1/ intNum2) );
		System.out.println("������ : " + intNum1 + " % " + intNum2 + " = " +(intNum1% intNum2) );
		
		
		
		System.out.println("<----�ڵ� ���� ������----->");
		i++;
		System.out.println("���� :" + (i));
		i--;
		System.out.println("���� :" +(i));
		

		System.out.println("<----����� ���� ������---->");
		System.out.println("i == j :" + (i==j)); // == �� ���Ĵ� �������� ���� ������ false, ������ true ���
		System.out.println("i != j :" + (i!=j)); // == �� ���� �ʳ� not the same�� �������� ���� ������ false, ������ true ���
		System.out.println("i > j :" + (i>j)); // == �� ���� �ʳ� not the same�� �������� ���� ������ false, ������ true ���
		System.out.println("i < j :" + (i<j)); // == �� ���� �ʳ� not the same�� �������� ���� ������ false, ������ true ���
		System.out.println("i >= j :" + (i>=j)); // == �� ���� �ʳ� not the same�� �������� ���� ������ false, ������ true ���
		System.out.println("i <= j :" + (i<=j)); // == �� ���� �ʳ� not the same�� �������� ���� ������ false, ������ true ���
		
		System.out.println("<---- �� ������ --- >");
		System.out.println(i + ">" + j + "&&" + j + ">" + k + ":" +  ((i>j)&&(j>k)) ); // &&�� ������ �� �ΰ� �� true�϶��� ������ false
		System.out.println(i + ">" + j + "||" + j + ">" + k + ":" +  ((i>j)||(j>k)) ); // ||�� ������ �� �ΰ� �� �ϳ��� true�� true
		
		System.out.println("<-----���� ������ --->");
		System.out.println("���� ���� ��� (k == 5 ? 1 : 2) :" + (k == 5 ? " Good" : "Bad" ) ); // k=5�̿��� true��  ? �ڿ� ù��°�� ����, false �� �ι��� �� ����
		System.out.println("���� ���� ��� (k == 5 ? 1 : 2) :" + (k == 5 ? (k+=10) : "Bad" ) ); //  k=5�̸� ? �ڿ� �� ���� false �� �ι��� �� ����
			
		System.out.println("<----�ٿ� ���� ������---->");
		System.out.println("i�� 100�� �����ϱ� :" + (i+=100) );
		
		// ------ 
		intNum1 = 6 ;
		System.out.println("intNum1 : " + (intNum1%2 == 0 ? "¦��" : "Ȧ��") ); // 6%2 = 0�� ¦��, 6%2 = 1�� Ȧ���� �̿��ϱ�, ==�� ���İ� ����� ����
		
		// intNum1�� 3�� ������� �ƴ��� ǥ���ϱ�

		System.out.println("intNum1 : " + (intNum1%3 == 0 ? "3�� ���" : "false") ); // ~�� ����� �� ���� ������ ������ �̿��ϱ�, ==�� ���İ� ����� ����, ?�� true���� ��, false�� �ڿ� ����
		
		// intNum�� 4�� ����� �ǰ� 6�� ����� �Ǹ� True �ƴϸ� False
		intNum1 = 24;
		System.out.println("intNum1 : " + ((intNum1%4 == 0) && (intNum1%6 == 0) ? "True" : "False") ); // ~�� ����� �� ���� ������ ������ �̿��ϱ�, ==�� ���İ� ����� ����

	}

}
