package chapter04.EX04;

import java.util.Scanner;

public class Using_For05 {

	public static void main(String[] args) {
		// 이중 for 문을 사용해서 1단 ~ 9단 까지 출력.
		/*	\n : enter, \t : tab
		 		1*1=1	1*2=2	1*3=3	...... 1*9=9
		 		2*1=2	2*2=4	2*3=6	...... 2*9=18
		 		......
		 		9*1=9	9*2=18	9*3=27 ....... 9*9=81
		 */

		for ( int a = 1 ; a < 10 ; a++) {
			for ( int b = 1 ; b < 10 ; b++) {
				int c = a*b;
				//System.out.print(a + " * " + b + " = " + c + "\t");
				//System.out.printf("%d %d\t",a,b );
				System.out.printf("%d * %d = %d \t",a,b,c );
				
			}
			System.out.println();
		}
		System.out.println("======================================");
		
		//1단 ~ 19단까지 3의 배수단만 출력
		/*
		for (int i = 3 ; i < 20 ; i=i+3) {
			for ( int j = 1 ; j < 20 ; j++) {
				int f = i*j;
				System.out.printf("%d * %d = %d\t",i,j,f);
			}
			System.out.println();
		}
		*/
		
		for (int i = 1 ; i <20; i++) {
			if (i%3 == 0) {
				for (int j = 1; j <10 ; j++) {
					int f = i*j;
					System.out.printf("%d * %d = %d\t",i,j,f);
				}
				System.out.println();
			}
			
		}
		
		// 스캐너에서 입력 받은 단만 출력 (1~9단)
		// 출력할 단을 입력 하세요 (1~9단)>>>
		// ==============
		// 1*1=1
		// 2*2=2
		// ....
		// 1*9=9
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("=========================================================");
		System.out.println("출력할 단을 입력 하세요 (1~9단)");
		int bb = sc.nextInt();
				
			for (int a2 = 1 ; a2 <10 ; a2++) {
				int b1 = bb*a2;
				System.out.printf("%d * %d = %d \n",bb,a2,b1 );
			}
				
				
	}

}
