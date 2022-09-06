package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if {

	public static void main(String[] args) {
		// 문제 : Scanner로 정수값을 인풋 받아서 평균(double)으로  
		// 국어(aa), 영어(bb), 수학(cc), 과학(dd), 음악(ee) 점수를 인풋 받습니다.
		// if문을 사용해서 평균이 90점 이상이면 "A 학점", 80점 이상 : "B 학점"
		// 70점 이상 : "C 학점", 60점 이상이면 "D 학점", 나머지 : "F 학점"
		
		Scanner sc = new Scanner (System.in);
		System.out.println("국어 점수를 입력해 주세요.>>>");
		int aa = sc.nextInt();
		
		System.out.println("영어 점수를 입력해 주세요.>>>");
		int bb = sc.nextInt();
		
		System.out.println("수학 점수를 입력해 주세요.>>>");
		int cc = sc.nextInt();
		
		System.out.println("과학 점수를 입력해 주세요.>>>");
		int dd = sc.nextInt();
		
		System.out.println("음악 점수를 입력해 주세요.>>>");
		int ee = sc.nextInt();
				
		double ave;
		ave = (aa+bb+cc+dd+ee)/5.0;
				
		if (ave >= 90) {
					System.out.printf("당신의 평균 점수는 %.2f이며, A 학점 입니다.",ave);
		} else if (ave >= 80) {
					System.out.printf("당신의 평균 점수는 %.2f이며, B 학점 입니다.",ave);
		} else if (ave >= 70) {
					System.out.printf("당신의 평균 점수는 %.2f이며, C 학점 입니다.",ave);
		} else if (ave >= 60) {
					System.out.printf("당신의 평균 점수는 %.2f이며, D 학점 입니다.",ave);
		} else {
					System.out.printf("당신의 평균 점수는 %.2f이며, F 학점 입니다.",ave);
		}
				
				sc.close();		//객체 제거
				
		
	}

}
