package basic02;

import java.util.Scanner;

public class Ex03_회사B {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("숫자를 입력 하세요");
		
		int input = sc.nextInt();
		
		int count = 0;
		
		
		for (int i = 1; i <=input ; i++) {			
		int su = i;
		boolean su369 = false;
		while(su!=0) {
			int na = su % 10;
			
			if(na== 3 || na==6 || na==9) {
				su369 = true;
				count++;

			}
			su = su /10;
			
			
			
		}if(su369) System.out.print(i);
		else System.out.println();
		
		}
		
		
		

	}

}
