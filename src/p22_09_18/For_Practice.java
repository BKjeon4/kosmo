package p22_09_18;

import java.util.Scanner;

public class For_Practice {

	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		System.out.println("숫자를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		num = Integer.parseInt(input);
		
		while (num!=0) {	//0이 아니다
			sum += num%10;	//10으로 나눈 나머지 값 -> sum에
			System.out.printf("sum =%3d num=%d%n", sum, num);	// sum = 3으로 나눳을때 나머지
			
			num /=10;
		}
		
		System.out.println("각 자리수의 합"+sum);

	}

}
