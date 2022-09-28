package P22_09_05;

import java.util.Scanner;

public class Using_Array08 {

	public static void main(String[] args) {
		//스캐너로 인풋 받아 임의의 정수 10개 등록 후
		// 정수 배열 방 10개를 생성하고
		// 임의의 값을 10개의 방에 저장
		// 그 중 최대값을 뽑아서 출력 하는 프로그램을 생성해 보세요.
		// 출력 : 배열방 10개에서 최대값은 : 000
		
		Scanner sc = new Scanner (System.in);
		
		int []a = new int [10];
		
		
		int count = 0;
		
		
		
		for (int i=0; i<5; i++) {
			System.out.printf("값을 입력하세요 (%d번)\n", count+1);		
			int n = sc.nextInt();
			a[i] = n;
			count++;
		}
		int max = a[0];	
		int min = a[0];	
		
		for (int i=0; i <5; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		for (int i =1; i <5; i++) {
			if(min > a[i]) {
				min = a[i];
			}
		}
		
		
		System.out.println("최대값은 : " + max);
		System.out.println("최소값은 : " + min);
		
	
				

	}

}
