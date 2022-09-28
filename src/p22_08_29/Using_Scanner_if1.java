package p22_08_29;

import java.util.Scanner;

public class Using_Scanner_if1 {

	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("학년을 기입해 주세요.>>>");
		
		int year = (sc.nextInt());
		
		System.out.println("점수를 기입해 주세요. >>>");
		
		int score = (sc.nextInt());
		
		if (score >= 75 & year !=3) {
			System.out.println("합격입니다.");
		}else if (score >= 65 & year == 3) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
		
		sc.close();
		
		
		

		
		
		
		
	}
}
