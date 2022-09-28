package p22_09_04;

import java.util.Scanner;

public class Using_For05 {

	public static void main(String[] args) {
		// 이중 for 문을 사용해서 1단 ~ 9단 까지 출력
		
		
		for (int a=1 ; a<10 ; a++) {
			for (int b=1 ; b<10 ; b++) {
				int c = a*b;
				System.out.printf("%d * %d = %d \t",a,b,c);
			}System.out.println();
		}
		
				// 스캐너에서 입력 받은 단만 출력 (1~9단)
				// 출력할 단을 입력 하세요 (1~9단)>>>
				// ==============
				// 1*1=1
				// 2*2=2
				// ....
				// 1*9=9
		
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("==============================");
		System.out.println("출력할 단을 입력 하세요 (1~9)>>>");
		int b = sc.nextInt();
			for (int a = 1 ; a < 10 ; a ++) {
				int c = b*a;
				System.out.printf("%d * %d = %d \n", b, a, c);
				
			}
		*/
		System.out.println("==============================");
		System.out.println("출력할 단을 계속하여 입력해보세요 (1~9)>>>");
		int c;
			for (int a = 1 ;  ; a++) {
				c = sc.nextInt();
					if (a<10) {
						
					}
				for (int b = 1; b <10 ; b++) {
					a = c*b;
					System.out.printf("%d * %d = %d \t \n", c, b, a);
					
				}System.out.println("출력할 단을 계속하여 입력해보세요 (1~9)>>>");
			}
		
		
			
		/*
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("=========================================================");
		System.out.println("출력할 단을 입력 하세요 (1~9단)");
		int bb = sc.nextInt();
				
			for (int a2 = 1 ; a2 <10 ; a2++) {
				int b1 = bb*a2;
				System.out.printf("%d * %d = %d \n",bb,a2,b1 );
			}
		*/
	}

}
