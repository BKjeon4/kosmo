package chapter05.EX01;

import java.util.Arrays;
import java.util.Scanner;

public class Using_Array08 {

	public static void main(String[] args) {
		//스캐너로 인풋 받아 임의의 정수 10개 등록 후
		// 정수 배열 방 10개를 생성하고
		// 임의의 값을 10개의 방에 저장
		// 그 중 최대값을 뽑아서 출력 하는 프로그램을 생성해 보세요.
		// 출력 : 배열방 10개에서 최대값은 : 000
		Scanner sc = new Scanner(System.in);
		int[]a = new int [10];
		int max = 0;
	
		
		
		for (int i=0; i< 10; i++) {
			System.out.printf("값을 입력해주세요 (%d번 / 총 10번) \n", i+1);
			a[i] = sc.nextInt();

		}
		
		for (int i = 0; i <10 ; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("배열방의 10개에서 최대 값은 : " + max);
		int min = a[0];
		for (int i = 1; i <10 ; i++) {
			if (a[i] < min) {
			 min = a[i];
			}
		}
		System.out.println("배열방의 10개에서 최소 값은 : " + min);
		/*
		for (int i=0; i< 10; i++) {
			for (int j=0; j<10; j++) {
				a[i] =j;
				
				System.out.printf("값을 입력해주세요 (%d번 / 총 10번) \n", i+=1);
				int s = sc.nextInt();
					if(s>0) {
						
						
					}System.out.println(a[i]);
					
			}
		}
		*/
		
		System.out.println("====== 2번째 방법은 arrays.sort() 메소드를 사용해서 출력 =======");
		Arrays.sort(a);		//배열 방의 값을 정렬을 한다. 0 (최소값), 1, 2, 3.... a.length -1 (최대값)
		System.out.println("최대값 : " + a[a.length-1]);		//최대값
		System.out.println("최소값 : " + a[0]);
		
		System.out.println("====== Stream을 사용하는 경우 =======");
		System.out.println("최대값 : " + Arrays.stream(a).max().getAsInt());
		System.out.println("최소값 : " + Arrays.stream(a).min().getAsInt());
		
		
	}

}
