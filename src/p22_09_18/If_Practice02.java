package p22_09_18;

import java.util.Scanner;

public class If_Practice02 {

	public static void main(String[] args) {
		// 문제 : Scanner로 정수값을 인풋 받아서 평균(double)으로  
		// 국어(aa), 영어(bb), 수학(cc), 과학(dd), 음악(ee) 점수를 인풋 받습니다.
		// if문을 사용해서 평균이 90점 이상이면 "A 학점", 80점 이상 : "B 학점"
		// 70점 이상 : "C 학점", 60점 이상이면 "D 학점", 나머지 : "F 학점"
		
		char a = ' ';
		char b = ' ';
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력해주세요.");
		int aa = sc.nextInt();
		System.out.println("영어 점수를 입력해주세요.");
		int bb = sc.nextInt();
		System.out.println("수학 점수를 입력해주세요.");
		int cc = sc.nextInt();
		System.out.println("과학 점수를 입력해주세요.");
		int dd = sc.nextInt();
		System.out.println("음악 점수를 입력해주세요.");
		int ee = sc.nextInt();
		
		double avg = (aa + bb + cc + dd + ee)/5.0;
		
		if (avg >=90) {
			a = 'A';
			if (avg >=98) {
				b = '+';
			}else if (avg <= 93) {
				b = '-';
			}
		}else if (avg >= 80) {
			a = 'B';
			if (avg >=88) {
				b = '+';
			}else if (avg <= 83) {
				b = '-';
			}
		}else if (avg >= 70) {
			a = 'C';
			if (avg >=78) {
				b = '+';
			}else if (avg <= 73) {
				b = '-';
			}
		}else if (avg >= 60) {
			a = 'D';
			if (avg >=68) {
				b = '+';
			}else if (avg <= 63) {
				b = '-';
			}
		}else {
			a = 'F';
			
		}
			System.out.printf("귀하의 평균 학점은 %.2f 이고 점수는 %c%c 입니다.", avg, a,b);
	}

}
