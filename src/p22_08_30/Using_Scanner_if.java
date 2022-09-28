package p22_08_30;

import java.util.Scanner;

public class Using_Scanner_if {

	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		int aa, bb, cc, dd, ee;
		
		System.out.println("국어, 영어, 수학, 과학, 체육 점수를 각 각 기입해주세요.");
		
		aa = sc.nextInt();
		bb = sc.nextInt();
		cc = sc.nextInt();
		dd = sc.nextInt();
		ee = sc.nextInt();
		
		double ave = (aa+bb+cc+dd+ee)/5;
		
		if (ave > 75) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
	}
}
