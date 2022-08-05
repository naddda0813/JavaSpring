package com.javalec.base;

public class Bse {

	public static void main(String[] args) {
		// 연산자 종류별 출력
		int i = 10, j = 2, k = 5 ;
		
		// 산술 연산자 
		// 덧셈 : 10 + 2 = 12
		// 뺄셈 : 10 - 2 = 8 
		// 곱셈 : 10 * 2 = 20
		// 나눗넴 : 10 / 2 = 5
		// 나머지 : 10% 2 = 0
		
		int intNum1 = 10 ; 
		int intNum2 = 2 ;
		
		
		System.out.println("덧셈 : " + intNum1 + " + " + intNum2 + " = " +(intNum1+ intNum2) );
		System.out.println("뺄셈 : " + intNum1 + " - " + intNum2 + " = " +(intNum1- intNum2) );
		System.out.println("곱셈 : " + intNum1 + " * " + intNum2 + " = " +(intNum1* intNum2) );
		System.out.println("나눗셈 : " + intNum1 + " / " + intNum2 + " = " +(intNum1/ intNum2) );
		System.out.println("나머지 : " + intNum1 + " % " + intNum2 + " = " +(intNum1% intNum2) );
		
		
		
		System.out.println("<----자동 증감 연산자----->");
		i++;
		System.out.println("증가 :" + (i));
		i--;
		System.out.println("감소 :" +(i));
		

		System.out.println("<----동등비교 관계 연산자---->");
		System.out.println("i == j :" + (i==j)); // == 는 같냐는 물음으로 같지 않으면 false, 같으면 true 출력
		System.out.println("i != j :" + (i!=j)); // == 는 같지 않냐 not the same는 물음으로 같지 않으면 false, 같으면 true 출력
		System.out.println("i > j :" + (i>j)); // == 는 같지 않냐 not the same는 물음으로 같지 않으면 false, 같으면 true 출력
		System.out.println("i < j :" + (i<j)); // == 는 같지 않냐 not the same는 물음으로 같지 않으면 false, 같으면 true 출력
		System.out.println("i >= j :" + (i>=j)); // == 는 같지 않냐 not the same는 물음으로 같지 않으면 false, 같으면 true 출력
		System.out.println("i <= j :" + (i<=j)); // == 는 같지 않냐 not the same는 물음으로 같지 않으면 false, 같으면 true 출력
		
		System.out.println("<---- 논리 연산자 --- >");
		System.out.println(i + ">" + j + "&&" + j + ">" + k + ":" +  ((i>j)&&(j>k)) ); // &&는 교집합 식 두개 다 true일때만 나머지 false
		System.out.println(i + ">" + j + "||" + j + ">" + k + ":" +  ((i>j)||(j>k)) ); // ||는 합집합 식 두개 중 하나라도 true면 true
		
		System.out.println("<-----삼항 연산자 --->");
		System.out.println("삼항 연산 결과 (k == 5 ? 1 : 2) :" + (k == 5 ? " Good" : "Bad" ) ); // k=5이여서 true면  ? 뒤에 첫번째것 실행, false 면 두번재 것 실향
		System.out.println("삼항 연산 결과 (k == 5 ? 1 : 2) :" + (k == 5 ? (k+=10) : "Bad" ) ); //  k=5이면 ? 뒤에 것 실행 false 면 두번재 것 실향
			
		System.out.println("<----줄여 쓰는 연산자---->");
		System.out.println("i에 100을 증가하기 :" + (i+=100) );
		
		// ------ 
		intNum1 = 6 ;
		System.out.println("intNum1 : " + (intNum1%2 == 0 ? "짝수" : "홀수") ); // 6%2 = 0은 짝수, 6%2 = 1은 홀수를 이용하기, ==는 같냐고 물어보는 거임
		
		// intNum1이 3의 배수인지 아닌지 표시하기

		System.out.println("intNum1 : " + (intNum1%3 == 0 ? "3의 배수" : "false") ); // ~의 배수는 그 수로 나누어 나머지 이용하기, ==는 같냐고 물어보는 거임, ?는 true인지 앞, false면 뒤에 실행
		
		// intNum이 4의 배수도 되고 6의 배수도 되면 True 아니면 False
		intNum1 = 24;
		System.out.println("intNum1 : " + ((intNum1%4 == 0) && (intNum1%6 == 0) ? "True" : "False") ); // ~의 배수는 그 수로 나누어 나머지 이용하기, ==는 같냐고 물어보는 거임

	}

}
