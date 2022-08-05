package com.javalec.function;

public class Korean {

	//Field 
		 String nation = "대한민국";
		 String name;
		String phone;
		
		//Construtor	
			//컨트롤 스페이스> source > generate construor
	
		public Korean(String name, String phone) {
			super();
			this.name = name;		
			this.phone = phone;
		}
			
	

		
		//Method 
		//void는 리턴값이 없다는 뜻. 내가 출력하겠다.
		public void printName() {
		 System.out.println("nation: " +nation);
			System.out.println("이름 : " + name +", phone : " + phone  );
		}

}
	
	
