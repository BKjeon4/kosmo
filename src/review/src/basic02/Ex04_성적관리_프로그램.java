package basic02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex04_성적관리_프로그램 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int stu[] = new int[4];
		
		int sum = 0;
		int count = 0;
		
		for (int i = 0; i < stu.length; i++) {
			System.out.println(i+1 + "번째 학생의 성적을 국어, 영어, 수학 순으로 입력해 주세요. ex) 88/77/66");
			String inputData = input.nextLine();
			StringTokenizer st = new StringTokenizer(inputData, "/");
			for(int j =0; st.hasMoreTokens(); j++) {
				String str = st.nextToken();
				stu[j]=Integer.parseInt(str);
				int aar = stu[j];
				sum+=aar;
				count++;
				
				
				}System.out.println(i+1 + "번째 학생의 총점은 " +sum + "이고 평균은 " + (double)sum/count +" 입니다.");
			
		
		}

		
		
		
		
		
		
	}

}
