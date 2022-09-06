package chapter05.EX01;

import java.util.Arrays;

public class Using_Array12 {

	public static void main(String[] args) {
		
		// 1 ~ 1000 까지 배열(arr)에 저장 후
		
		// 1. 배열 선언
		
		// 2. [입력] for 문을 사용해서 arr 배열 변수에 값을 할당
		
		// 3. [출력] for 문을 사용해서 arr 배열 변수의 값을 출력
		
		// 4. [출력] Enhanced For 문을 사용해서 값을 출력
		
		// 5. [출력] Arrays.toString(arr) 출력

		int [] arr = new int [1000];
		
		System.out.println("=============For 문==================");
		for (int i=0, j=1 ; i <arr.length ; i++, j++) {
			arr[i] =j;
			System.out.print(arr[i]+ " ");
		}
			/*
			for (int i = 0 ; i <arr.length ; i++) {
			arr[i] = i + 1
			
			이 더 깔끔
			 */ 
		
		System.out.println();
		System.out.println("=========Enhanced For 문==================");
		for (int k : arr) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("==========Arrays.toString===================");
		
		System.out.println(Arrays.toString(arr));
	}

}
