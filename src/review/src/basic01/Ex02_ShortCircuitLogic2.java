package basic01;

public class Ex02_ShortCircuitLogic2 {

	public static void main(String[] args) {

		int a = 3;
		
		if (a >3 & ++a > 3) {				//3 >3 & 4 >3 
			System.out.println("조건만족");	//false
		}
		System.out.println("a=" + a);		//a = 4
		
		if (a>1 | ++a >3) {				// 4>1 | 5 >3
			System.out.println("조건만족2");	//true
		}
		System.out.println("a=" + a);		// a = 5
	}

}
