package com.javalec.function;

public class FieldDan {

	public int dan = 0 ;	// ���̶�� ������ �ʿ�
	
	//construtor
	public FieldDan()	{
		
	}
	//Method 
	public void printDan() {
		for(int i=1;i<=9;i++) {			//9������	
			if( i%2 == 0) {
				System.out.println( dan + " X " + "*" + " = " +(dan*i) );
			} else{
				System.out.println( dan + " X " + i + " = " +(dan*i) );
			}
			
		}
	}
	// �迭�̿���, ���� method�� ���ÿ� �����ϸ� ���� ���� �ι� ��µ�
	public String[] returnArrDan() {
		String[] arr = new String[9];		//9��������
		
	//	for(int i=1;i<=9;i++) {
	//		arr[i-1] = ("(FieldArr)" +dan + " X " +i+ " = " +(dan*i));
	//	}	//0�ܺ��� �����ϱ� ���� 
		return arr;
	}
	
	
}
