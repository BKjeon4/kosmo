package p22_09_04;

import java.util.Scanner;

public class Using_While02 {

	public static void main(String[] args) {
		// 스캐너를 사용해서 -1이 될 때까지 정수값을 넣어서 평균을 구하시오
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println(" 정수 값을 입력해주세요. (빠져나오려면 -1을 입력해주세요)");
		int n = sc.nextInt();
		
		int sum = 0;
		int count = 0;
		int a;
		
		while (n !=-1) {
			sum +=n;
			count++;
			n = sc.nextInt();
		}if (count ==0) {
			System.out.println("입력한 값이 없습니다.");
		}else {
			System.out.println("입력한 횟수는 총 " + count + " 입니다.");
			System.out.println("입력한 값의 합은 총 " + sum + " 입니다.");
			System.out.println("입력한 값의 평균은 총 " + sum/(double)count + " 입니다.");
		}

	}

}
