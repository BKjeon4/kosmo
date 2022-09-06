package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if02 {

	public static void main(String[] args) {
		// 점수(score)와 학년(year)을 인풋 받아서 60점 이상이면 합격, 미만이면 불합격
		// 4학년인 경우 70점 이상이면 합격, 중펍 if문 사용 (if문 내에 if문)
		
		Scanner sc = new Scanner (System.in);
		/*
		System.out.println("학년을 입력해 주세요.");
		int year = sc.nextInt();
					
		System.out.println("점수를 입력해 주세요.");
		int score = sc.nextInt();
		
		System.out.printf("학년 : %d, 점수 : %d \n", year, score);
		
		
		if (year <=3 & score >= 60) {
			System.out.println("합격");
		}else if(year ==4 & score >= 70) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}

		sc.close(); // 메모리에서 객체 삭제
		*/
		
		System.out.println("=================================");
		
		System.out.println("점수를 입력하세요 (0~100)>>");
		int score = sc.nextInt();
		System.out.println("학년을 입력 하세요 (1~4)>>");
		int year = sc.nextInt();
		
		if (score >=60) {
			if (year !=4) {
				System.out.println("합격");	//4학년 아니면 60점 이상 합격
			} else if (score >= 70) {
				System.out.println("합격");	//4학년이고 70이상 합격
			} else {
				System.out.println("불합격");	//4학년이고 70이상이 아니면 불합격
			}
		}else {
			System.out.println("불합격");		//60점 미만이면 1,2,3,4 모두 불합격
		}
		
		sc.close();
	}

}
