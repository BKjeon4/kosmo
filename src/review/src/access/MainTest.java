package access;

import accother.Access;

public class MainTest extends Access{
	

	public static void main (String [] args) {
		
		MainTest acc = new MainTest();
		//acc.a = "프라이빗 변경";
		acc.b = "퍼블릭 변경";
		acc.c = "프로텍티드 변경";
		//acc.d = "디폴트 변경";
		acc.output();
		
		
		
	}

}
