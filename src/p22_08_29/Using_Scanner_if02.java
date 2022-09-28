package p22_08_29;

import java.util.Scanner;

public class Using_Scanner_if02 {

	public static void main(String[] args) {
		// 점수(score)와 학년(year)을 인풋 받아서 65점 이상이면 합격, 미만이면 불합격
		// 5학년인 경우 80점 이상이면 합격. 중첩 if문 사용 (if문 내에 if문)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학년을 입력 하세요.");
		int year = (sc.nextInt());
		System.out.println("점수를 입력 하세요.");
		int score = (sc.nextInt());
		
		/*
		System.out.printf("당신은 %d학년이며 %d점을 받았으므로 ", year, score);
		if (score >= 65) {
			System.out.println("합격 입니다.");
		} else if (score >= 80 && year == 5) {
			System.out.println("합격 입니다.");
		} else {
			System.out.println("불합격 입니다.");
		}
		*/
		
		System.out.printf("당신은 %d학년이며 %d점을 받았으므로 ", year, score);
		if (score >= 65) {
			if (year != 5) {
			System.out.println("합격 입니다.");
			}else if (score >= 80 && year == 5) {
			System.out.println("합격 입니다.");
		}else {
			System.out.println("불합격 입니다.");
		}
		
		
		sc.close();

	}

	}
}
