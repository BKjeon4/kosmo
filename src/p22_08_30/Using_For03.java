package p22_08_30;

import java.util.Scanner;

public class Using_For03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int a;
		int sum = 0;
		double avg = 0;
		int count = 0;
		
		for (a=0 ; a<5 ; a++) {
			System.out.println("숫자를 입력하세요.");
			int b = sc.nextInt();
					if (b>0) {
						sum=b+sum;
						count++;					
						
							
					}
		
				
		} System.out.println("양수만 더한 값 : " + sum);
		System.out.println("양수만 더한 값의 평균 :"+ (double)sum/count);
			
		

	}

}
