package com.javalec.function;

public class Calc {


		//Field 
		public int num1;
		public int num2;
		
		//Constructor �����ڿ��� private�� ����.
		public Calc()	{
			
			
		}
		
		//Method, return���� ������
		public void addition() {
			System.out.println(num1+ "+" +num2+"="+( num1+num2));
		}
		public void subtraction() {
			System.out.println(num1+ "-" +num2+"="+(num1-num2));
		}
		public void multiple() {
			System.out.println(num1+ "*" +num2+"="+(num1*num2));
		}
		
		public void division() {
			System.out.println(num1+ "/" +num2+"="+(num1/(double)num2));
		}
		// �ѹ��� ����
		public void calcAll()	{
			addition();
			subtraction();
			multiple();
			division();
		}
		
		
		
		//method // return���� ���� ��
		//
	///	public String addAction()	{
	//		return (num1+ "+" +num2+"="+( num1+num2)); // ���ڿ� ��°�� ����
	//	}
		public int addAction(int num1,int num2) {
			return (num1 + num2);
		}
		
		public int minusAction(int num1,int num2) {
			return (num1 - num2);
		}
		//���ϱ�
		public int multipleAction(int num1,int num2) {
			return (num1 * num2);
		}
		//������
		public double divisionAction(int num1,int num2) {
			return (num1/(double)num2);
		}
		
		
		
}
	


