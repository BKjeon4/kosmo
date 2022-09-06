package chapter05.EX01;

import java.util.Arrays;

public class Using_Array03 {

	public static void main(String[] args) {
		// 한국을 빛낸 5명의 위인들만 s String 배열에 저장 후, 4가지로 출력 
		
		String s[] = new String [5];
		
		//1. 배열 값을 지정
		s[0] = "손흥민";
		s[1] = "bts";
		s[2] = "류현진";
		s[3] = "김연아";
		s[4] = "김재동";
		
		System.out.println(s[1]);
		
		
		System.out.println(s.length);
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		} 
		System.out.println("===============");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(s[i]);
		}
		System.out.println("===============");
		
		for (String j : s ) {
			System.out.println(j);
		}
		
		System.out.println(Arrays.toString(s));
		
	}

}
