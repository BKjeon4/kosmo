package basic03;

/*(문제 1) 영문자를 입력하여 이 문자를 넘겨받아 이 문자가 소문자이면 true을 반환 그렇지 않으면 
		//false을 반환하는 메소드를 작성하시오. 
		//함수명 : checkLower
		//인자 : char
		//리턴(반환) : boolean
 * 
 */

import java.util.Scanner;

public class Ex09_test01 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("문자를 입력해주세요.");
		
		 char input = sc.next().charAt(0);
		
		boolean a = checkLower(input);
		
		System.out.println(a);
		sc.close();
	
	}
	
	static boolean checkLower(char input) {
		if ( 'a' <= input && input <= 'z') {
				
			return true;
		}else if ( 'A' <= input && input <= 'Z') {
			
			return false;
		}else 
			System.out.println("입력 이상");
			return false;
			
		}
		
	
	


}
