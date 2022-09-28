package p22_09_18;

import java.util.Scanner;

public class If_Practice {

	public static void main(String[] args) {
		// 문제 : Scanner로 정수값을 인풋 받아서 평균(double)으로  
		// 국어(aa), 영어(bb), 수학(cc), 과학(dd), 음악(ee) 점수를 인풋 받습니다.
		// if문을 사용해서 평균이 90점 이상이면 "A 학점", 80점 이상 : "B 학점"
		// 70점 이상 : "C 학점", 60점 이상이면 "D 학점", 나머지 : "F 학점"
		
		int  aa, bb, cc, dd, ee;
		double avg;
		
		char a = ' ';
		char c = ' ';
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력 해주세요.");
		
		int score = sc.nextInt();
		
		if (score >=90) {
			a = 'A';
			if (score >= 98) {
				c = '+';
			}else if (score <= 93) {
				c = '-';
			}
		}else if (score >=80) {
			a = 'B';
			if (score >= 88) {
				c = '+';
			}else if (score <= 83) {
				c = '-';
			}
		}else if (score >= 70) {
			a = 'C';
			if (score >= 78) {
				c = '+';
			}else if (score <= 73) {
				c = '-';
			}
		}else if (score >= 60) {
			a = 'D';
			if (score >= 68) {
				c = '+';
			}else if (score <= 63) {
				c = '-';
			}
		}else {
			a = 'F';
		}
		
		System.out.printf("당신의 학점은는 %c%c 입니다.",a, c );

	}

}
