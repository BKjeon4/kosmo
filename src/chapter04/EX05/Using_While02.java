package chapter04.EX05;

import java.util.Scanner;

public class Using_While02 {

	public static void main(String[] args) {
		// 스캐너를 사용해서 -1이 될 때까지 정수값을 넣어서 평균
		Scanner sc = new Scanner (System.in);
		
		int count = 0 ; 	// 정수가 입력되는 갯수를 카운트함. <평균 낼 때 필요함>
		int sum = 0 ;		// 입력 받는 정수를 모두 더한 값
		
		System.out.println("원하는 정수를 입력 하세요. 마지막에 -1로 종료를 알리세요.");
		int n = sc.nextInt();		// 콘솔에서 정수값을 입력 받아 n 변수에 할당.
		
		
		//반복 횟수를 알 수 없을 때
		while (n != -1) {	//입력 받은 정수 값이 -1이 아니면 while 문을 실행	"n = !-1"
			sum +=n ; 	// sum = sum + n ;
			count++;	//정수 값을 count 함.
			n = sc.nextInt();	// -1 이 정수 값으로 input이 되면 루프를 빠져 나온다.
		}
		if (count == 0) {// 제일 처음에 정수값을 -1
			System.out.println("입력 된 정수가 없습니다.");
			
		}else { // 정수 값을 하나 이상 넣은 경우
			System.out.println("입력된 정수는 : " + count + " 개 입니다.");
			System.out.println("입력된 정수의 합은 : " + sum + " 입니다.");
			System.out.println("평균값은 : " + sum / (double)count);
		}

	}

}
