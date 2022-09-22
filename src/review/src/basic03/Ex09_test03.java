package basic03;

import java.util.Scanner;

public class Ex09_test03 {

	public static void main(String[] args) {
		//(문제 3) 
		//multiple 메소드 만들기
		//- 2개의 int 인자인 경우는 곱셈계산 한 결과를 출력
		//- 1개의 int 인자와 1개의 char 인자인 경우는 int 인자 수 만큼 char 인자 문자를 출력
		//- 2개의 int 인자와 1개의 char 인자인 경우는 char 인자 문자를 n * m 형식의 행과 열로 출력 
		//[예시]
		//` multiple ( 2, 3 ) 호출          [출력결과]  6      
		//` multiple ( 4, 'ㅋ' ) 호출        [출력결과]  ㅋㅋㅋㅋ
		//` multiple ( 2, 3 , 'ㅋ' ) 호출    [출력결과] ㅋㅋㅋ
		//                                            ㅋㅋㅋ

		multiple (2, 4);
		multiple (4, 'ㅋ');
		multiple (2, 3, 'ㅋ');
		
		


	}
	
	static void multiple (int a, int b) {
		System.out.println(a*b);		
			
	}
	static void multiple (int a, char d) {
		for ( int i = 0 ; i <a ; i++ ) {
			System.out.print(d);
		}System.out.println();
		
		
	}
	static void multiple (int e, int f, char g) {
		for ( int i = 0 ; i < e ; i++) {
			for ( int j = 0 ; j < f ; j++) {
				
				System.out.print(g);
			}System.out.println();
		}
	}

}
