package basic02;

import java.util.Scanner;

public class Ex04_성적 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int sum = 0;
		int count = 0;
		
		int kor[] = new int [5];
		
		for (int i = 0; i < kor.length; i++) {
			System.out.println(i+1 + "번 학생의 국어점수를 입력 ->");
			kor[i] = input.nextInt();
			sum +=kor[i];
			count++;
			
		}

		for (int i= 0; i < kor.length; i++) {
		System.out.println(i+1 + "번 학생의 점수 : " + kor[i]);
			
			
		}
	System.out.println("평균 : " + sum/(double)count);
		System.out.println("총 합 : " + sum);
		
		// 위 학생들 점수의 총점과 평균을 출력
		

		
		
		
		
	}

}
