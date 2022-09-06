package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if05 {

	public static void main(String[] args) {
		/*
		  -스캐너를 나이를 인풋 받아서 출력 :
		  나이(age)가 8세 미만이면, "취학 전 아동 입니다."
		  						"입장료는 <1000>원 입니다."
		  나이 14세 미만이면 : "초등학생 입니다."
		  					"입장료는 <2000>원 입니다."
		  나이 20세 미만이면 : "중, 고등학생 입니다."
		  					"입장료는 <2500>원 입니다."
		  나이 20세 이상이면 : "일반인 입니다."
		  					"입장료는 <3000>원 입니다."
		 */

		Scanner sc = new Scanner(System.in);
	/*	
		System.out.println("당신의 나이를 입력해주세요 >>>");
		
		int age = sc.nextInt();
		int price = 0;
		
		if (age < 8) {
			price = 1000;
			System.out.printf("입력해주신 나이는 %d살 이며, 취학 전 아동 이므로 입장료는 <%d>원 입니다.", age, price);
		} else if (age < 14) {
			price = 2000;
			System.out.printf("입력해주신 나이는 %d살 이며, 초등학생 입니다. 입장료는 <%d>원 입니다.", age, price);
		} else if (age < 20) {
			price = 2500;
			System.out.printf("입력해주신 나이는 %d살 이며, 중, 고등학생 입니다. 입장료는 <%d>원 입니다.", age, price);			
		} else {
			price = 3000;
			System.out.printf("일반인 입니다. 입장료는 <%d>원 입니다.", price);
		}
		*/
		System.out.println("당신의 나이를 입력해주세요 >>>");
		
		int age = sc.nextInt();
		int price = 1000;
		
		System.out.printf("%d세는 ", age);
		if (age < 8) {
			System.out.println("취학 전 아동입니다.");
		} else if (age < 14) {
			price = 2000;
			System.out.println("초등학생 입니다.");
		} else if (age < 20) {
			price = 2500;
			System.out.println("중, 고등학생 입니다.");			
		} else {
			price = 3000;
			System.out.println("일반인 입니다.");
		}
		System.out.printf("입장료는 %d 입니다.", price);
		
		
		sc.close();
		
	}

}
