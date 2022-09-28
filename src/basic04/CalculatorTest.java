package basic04;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		
		CalculatorExpr aa = new CalculatorExpr ();
		
		Scanner sc = new Scanner (System.in);
		
		String type = null;
		int count = 0;

		
		do {
			System.out.println("2개의 값을 입력해주세요.");
			
			aa.setNum1(sc.nextInt());
			aa.setNum2(sc.nextInt());
			sc.nextLine();
			
			
			if (count>=1) {
				System.out.printf("추출된 숫자 : %d, %d\n",aa.getNum1(), aa.getNum2());
			}
			System.out.println("덧셈 : " + aa.getAddition());
			System.out.println("뺄셈 : " + aa.getSubtraction());
			System.out.println("곱셈 : " + aa.getMultiplication());
			System.out.println("나눗셈 : " + aa.getDivision());
			
			System.out.println("계속 진행 하시겠습니까? y/n");
			count ++;
			if( count ==100) {
				count = 1;
			}
			

			type = sc.nextLine();
			
			if (type.equalsIgnoreCase("n"));break;
			
		}while(type.equalsIgnoreCase("y"));
		
			
		
		sc.close();
		

		
		
		

	}

}
