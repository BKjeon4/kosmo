package p22_09_22;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("숫자 두 개를 입력해주세요.");
		

		
		CalculatorExpr aa = new CalculatorExpr ();
		
		aa.setNum1(sc.nextInt());
		
		aa.setNum2(sc.nextInt());
		
		System.out.println(aa.getAddition());
		
		System.out.println(aa.getSubtraction());
		
		System.out.println(aa.getMultiplication());
		
		System.out.println(aa.getDivision());
		
		
		
		
		
	}

}
