package chapter04.EX05;

import java.util.Scanner;

public class Using_While_Practice {

	public static void main(String[] args) {
		// "그만" 할때까지 정수값을 넣어서 합계와 평균을 출력
		// 힌트 : 문자열을 정수로 변환
		// 1. String s = sc.nextline(); 인풋 받는다.
		// 2. s.splite(" "), <-- 공백을 기준으로 잘라서 배열에 저장
		// 3. 문자형 String 을 정수형으로 변환, Integer.parseInt( )
		// 4. 합계와 평균을 구하면 됩니다.
		
		Scanner sc = new Scanner (System.in);
		
		String s;
		do {
			System.out.println("정수를 입력해주세요. 종료를 원할 시 '그만'을 입력해주세요.");
			s=sc.nextLine();
				if (s.equals("그만")) {
					break;}
				String [] arr;
				arr= s.split(" ");
				int b;
				int sum =0;
				int count = 0;
				for (int i = 0 ; i < arr.length ; i++) {
					if (i%1==0) {
						b=Integer.parseInt(arr[i]);
						sum+=b;
						count++;
						
					}
				}
				System.out.printf("입력하신 값의 합은 : %d \n", sum);
				System.out.printf("입력하신 값의 평균은 : %.2f", sum/(double)count);
				
		}while (true);
		System.out.println("종료되었습니다.");
		
		
		
		
	}	

}
