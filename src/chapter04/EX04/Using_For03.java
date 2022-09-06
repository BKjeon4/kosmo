package chapter04.EX04;

import java.util.Scanner;

public class Using_For03 {

	public static void main(String[] args) {
		// for 문 내의 if
		// 정수 (음수, 양수) 을 스캐너로 5개 인풋 받아서
		// 양수만 더한 값을 출력 하세요.
		
		Scanner sc = new Scanner (System.in);
		
		int i = 0;
		int sum=0;
		double ave=0;
		
		for (i=0; i <5 ; i++) {
			System.out.printf("값을 입력하세요.(%d번)\n",i+1);
			int ii = sc.nextInt();
			if (ii > 0) {
				sum = sum+ii; // sum+=ii
			}
		ave = ave + ii;
		}
	System.out.println("총" + sum);
	System.out.println("평균" + ave/5 + "%");
	
	sc.close();
	}

}
