package p22_08_29;

import java.util.Scanner;

public class Using_Scanner_if_Practice {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("국어 점수를 입력하세요.");
	double aa =(sc.nextDouble());
	System.out.println("영어 점수를 입력하세요.");
	double bb =(sc.nextDouble());
	System.out.println("수학 점수를 입력하세요.");
	double cc =(sc.nextDouble());
	System.out.println("과학 점수를 입력하세요.");
	double dd =(sc.nextDouble());
	System.out.println("음악 점수를 입력하세요.");
	double ee =(sc.nextDouble());
	System.out.println("역사 점수를 입력하세요.");
	double ff =(sc.nextDouble());
	System.out.println("체육 점수를 입력하세요.");
	double gg =(sc.nextDouble());
		
	 double ave = (aa+bb+cc+dd+ee+ff+gg)/7;
	 
	 if (ave >= 90) {
		 System.out.printf("당신의 평균은 %.2f점 이며, A학점 입니다.", ave);
	 } else if (ave >= 80) {
		 System.out.printf("당신의 평균은 %.2f점 이며, B학점 입니다.", ave);
	 } else if (ave >= 70) {
		 System.out.printf("당신의 평균은 %.2f점 이며, C학점 입니다.", ave);
	 } else if (ave >= 60) {
		 System.out.printf("당신의 평균은 %.2f점 이며, D학점 입니다.", ave);
	 } else {
		 System.out.printf("당신의 평균은 %.2f점 이며, F학점 입니다.", ave);
	 }
	
	
	
	
	sc.close();
	
	

	}

}
