package basic02;

import java.util.Scanner;

/*
 * 
 * 
 * for	: 반복횟수가 정해진 경우
 * while : 횟수를 모르는 경우
 * do~ while : 횟수를 모르는 경우 (조건을 나중에 비교)
 * 
 *  
 * 
 */




public class Ex02_반복문구분 {

	public static void main(String[] args) {
		// 구구단의 단수를 입력 받아서 해당 단의 구구단을 출력
		
		Scanner sc = new Scanner(System.in);
		
		/*
		// 1. for 문
		System.out.println("몇번 반복을 할까요?");
		int input = sc.nextInt();
		System.out.println("원하는 구구단의 단을 입력 하세요. (숫자입력)");
		int n = sc.nextInt();
		
		for (int i=0; i<=input; i++) {			

			for ( int j = 1; j < 10 ; j++) {
				System.out.printf("%d * %d = %d, \t %n", n, j, n*j);
				
			}System.out.println();
		*/
		
		/*
		// 2. while 문
		while (true) {
		
			System.out.println("원하는 구구단의 단을 입력 하세요. (숫자입력)");
			int n = sc.nextInt();
			for ( int j = 1; j < 10 ; j++) {
				System.out.printf("%d * %d = %d, \t %n", n, j, n*j);
			}
		
			System.out.println("반복을 종료(Y)");
			sc.nextLine();
			String answer = sc.nextLine();
			if (answer.equalsIgnoreCase("Y")) break;
					
		
		}
		*/
		
		do {
			System.out.println("원하는 구구단의 단을 입력 하세요. (숫자입력)");
			int n = sc.nextInt();
			for ( int j = 1; j < 10 ; j++) {
				System.out.printf("%d * %d = %d, \t %n", n, j, n*j);
			}
			System.out.println("계속 하시겠습니까?(Y/N)");
			sc.nextLine();
			String answer = sc.nextLine();
			if (answer.equalsIgnoreCase("Y")) {
				continue;
			}else if (answer.equalsIgnoreCase("N")) {
				System.out.println("종료합니다.");
				break;
			}else
				System.out.println("잘못입력 했습니다.");
				
			
		}while(true);

	}

}
