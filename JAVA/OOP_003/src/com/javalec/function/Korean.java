package com.javalec.function;

public class Korean {

	//Field 
		 String nation = "���ѹα�";
		 String name;
		String phone;
		
		//Construtor	
			//��Ʈ�� �����̽�> source > generate construor
	
		public Korean(String name, String phone) {
			super();
			this.name = name;		
			this.phone = phone;
		}
			
	

		
		//Method 
		//void�� ���ϰ��� ���ٴ� ��. ���� ����ϰڴ�.
		public void printName() {
		 System.out.println("nation: " +nation);
			System.out.println("�̸� : " + name +", phone : " + phone  );
		}

}
	
	
