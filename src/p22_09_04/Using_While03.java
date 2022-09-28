package p22_09_04;

import java.util.Scanner;

public class Using_While03 {

	public static void main(String[] args) {
		// "그만" 할때까지 정수값을 넣어서 합계와 평균을 출력
		// 힌트 : 문자열을 정수로 변환
		// 1. String s = sc.nextline(); 인풋 받는다.
		// 2. s.splite(" "), <-- 공백을 기준으로 잘라서 배열에 저장
		// 3. 문자형 String 을 정수형으로 변환, Integer.parseInt( )
		// 4. 합계와 평균을 구하면 됩니다.
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("정수 값을 입력 하시오 (그만 이라고 입력하면 빠져 나올 수 있습니다.)");
				
		int n = 0;
		int sum = 0;
		int count = 0;
		String a;
		
		while (true) {
			a = sc.next();
			if (a.equals("그만")) {
				break;
			}
			n=Integer.parseInt(a);
			sum +=n;
			count++;
			
		}if (count==0) {
			System.out.println("입력한 값이 없습니다.");
		}else {
			System.out.println("입력한 횟수는 총 " + count + " 입니다.");
			System.out.println("입력한 값의 합은 총 " + sum + " 입니다.");
			System.out.println("입력한 값의 평균은 " +sum/(double)count + " 입니다.");
		}
				
				
				
		/*
		System.out.println("정수 값을 입력하시오. (빠져나올시 그만 을 치면 됩니다.)");
		int sum = 0;
		int count = 0;
		int n = 0;
		
		String a;
				
		
		while (true) {
			
			a = sc.next();
			if (a.equals("그만")) {
			break;	
			}
			
			n = Integer.parseInt(a);
			
			//문자열 ->정수형
			sum = sum + n;
			count++;
			
		}
		if (count == 0) {
			System.out.println("올바른 정수 값을 입력해 주세요.");
		}else {
			System.out.println("정수의 합은 : " + sum + "입니다.");
			System.out.println("정수입력 횟수는 : " + count + "입니다.");
			System.out.println("입력한 정수의 평균은 : " +(double) sum / count + "입니다.");
		
		} 		
		 */

	}

}
