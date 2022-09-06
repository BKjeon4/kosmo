package chapter04.EX06;

import java.util.Scanner;

public class Using_do_While03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		boolean run = true;
		int nu;			//스캐너에서 정수를 인풋
		
		do {
			System.out.println("======================================================");
			System.out.println("1. 19단 출력 | 2. 홀수단만 출력 | 3. 3의 배수단 출력 | 4. 종료");
			System.out.println("======================================================");
			System.out.println("원하는 숫자를 선택 하세요.>>>");
			nu = sc.nextInt();
			if (nu == 1) {
				//1. 19단 출력
				System.out.println("==1. 19단 출력");
				int a;
				int b;
				
				for (a = 19 ;a<20 ;a++) {
					for (b=1; b<10 ; b++) {
						System.out.printf("%d * %d = %d \n",a,b,a*b);
					}
				}
					
			}else if (nu ==2) {
				//2. 홀수단 출력
				System.out.println("==2. 홀수단 출력");
				int a;
				int b;
				
				for (a = 1; a<20 ; a++) {
					
					if (a%2==1) {
						System.out.printf("%d단\n",a);
						for (b = 1; b<20 ; b++) {
						int c = a*b;
						
						System.out.printf("%d * %d = %d \n",a,b,c);
						}
						
					}
					
				}
					
				
			}else if (nu ==3) {
				//3. 3의 배수단 출력
				System.out.println("==1. 3의 배수단 출력");
				int a;
				int b;
				
				for (a=1; a<10; a++) {
					if (a%3==0) {
						System.out.printf("%d단\n",a);
						for (b=1; b<10; b++) {
							int c = a*b;
							System.out.printf("%d * %d = %d \n",a,b,c);
							}
					}
						
						
				}
				
			}else if (nu ==4) {
				break;
			}
			
		}while (run);		//무한루프
		System.out.println("프로그램을 종료 합니다.");

	}

}
