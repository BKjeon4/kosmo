package basic03;

import java.util.Scanner;

public class Ex09_test02 {

	public static void main(String[] args) {
		// (문제 2) 영문자를 입력하여 이 문자를 넘겨받아 이 문자가 소문자이면 대문자로 변환하여 반환하고 
		// 대문자라면 그대로 반환하는 메소드를 작성하시오. 
		// 함수명 : checkUpper
		// 인자 : char
		// 리턴(반환) : char
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("문자를 입력해주세요.");
		
		char input = sc.next().charAt(0);
		
		
		char a = checkUpper (input);
		
		System.out.println(a);

	}

	
	static char  checkUpper (char input) {
		if ( 'a' <= input && input <= 'z') {
			
			return (char)(input - 32);
		}else if ( 'A' <= input && input <= 'Z') {
			
			return input;
		}else 
			System.out.println("입력 이상");
			return input;
			
		}
		
	}

