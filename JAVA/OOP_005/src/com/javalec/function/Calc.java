package com.javalec.function;

public class Calc {


		//Field 
		public int num1;
		public int num2;
		
		//Constructor 생성자에서 private는 없다.
		public Calc()	{
			
			
		}
		
		//Method, return값이 없을때
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
		// 한번에 실행
		public void calcAll()	{
			addition();
			subtraction();
			multiple();
			division();
		}
		
		
		
		//method // return값이 있을 때
		//
	///	public String addAction()	{
	//		return (num1+ "+" +num2+"="+( num1+num2)); // 문자열 통째로 리턴
	//	}
		public int addAction(int num1,int num2) {
			return (num1 + num2);
		}
		
		public int minusAction(int num1,int num2) {
			return (num1 - num2);
		}
		//곱하기
		public int multipleAction(int num1,int num2) {
			return (num1 * num2);
		}
		//나누기
		public double divisionAction(int num1,int num2) {
			return (num1/(double)num2);
		}
		
		
		
}
	


