
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int il = 10;
		double d1 = il ; // 묵시적 형변환, allocate : 작은 data type이 큰 data type에 흡수
		System.out.println("d1의 데이터는 " + d1 + "입니다.");
		
		//-----------------------------------------
		
		double d2 = 10.894 ; 
		int i2 = (int) d2; // 명시작 형변환 : data 손실이 발생, 정확한 데이터가 들어가지 않음. 소수점자리 생략
		System.out.println("i2의 데이터는 " + i2 + "입니다.") ;
		
		
		
	}

}
