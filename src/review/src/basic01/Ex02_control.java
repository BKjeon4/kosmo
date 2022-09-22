package basic01;

import java.util.Calendar;

import java.util.Scanner;

/*
 * 	제어문 : 프로그램 흐름을 변경하기 위해
 * 	
 * 			1) if
 * 			2) switch
 * 			3) for
 * 			4) while / do ~ while
 * 
 * 			5) break / continue
 */

public class Ex02_control {

	public static void main(String[] args) {
		
		String id = null;
		
		Scanner input = new Scanner(System.in);
		System.out.println("주민입력 ->");
		id = input.nextLine();
		
		//String id = "201107-3347154";
		
		char sung = id.charAt(7);
		System.out.println(sung);
		//sung 이라는 변수에 문자가 1이거나 3이거나 9라면 남자 출력
		//그렇지 않고 2이거나 4이거나 0이라면 여자를 출력
		
		if(sung == '1' || sung =='3' || sung =='9') {
			System.out.println("남자");
		}else if (sung == '2' || sung == '4' || sung =='0'){
			System.out.println("여자");
		}else {
			System.out.println("잘못 입력 했습니다. 번호를 확인해 주세요.");
		}
	/*	
		switch (sung) {
		case '1': case '3': case '9':
			System.out.println("남자");
			break;
		case '2': case '4': case '0':
			System.out.println("여자");
			break;
		default :
			System.out.println("성별을 알 수 없습니다.");
		
		}
		*/
		char chul = id.charAt(8);
		System.out.println(chul);
		// chul 변수가 0이라면 '서울
		// chul 변수가 1이라면 '인천/부산'
		// chul 변수가 2이라면 '경기'
		// chul 변수가 9라면 '제주'
		
		String home = null; 
		
		switch (chul) {	//문자, 정수, 문자열 
		case '0': 
			home = "서울";
			break;
		case '1':
			home = "인천/부산";
			break;
		case '2':
			home = "경기";
			break;
		case '3':
			home = "대구";
			break;
		case '4':
			home = "대전";
			break;
		case '5':
			home = "구미";
			break;
		case '9':
			home = "제주";
			break;
		default :
			home = "입력한 값이 올바르지 않습니다.";
			
		}System.out.println(home);
		
		
		//String id = "001107-3347154";
		
		String age = id.substring(0, 2); //age = "00"
		//문자열 -> 정수 변환
		
		int age1 = Integer.parseInt(age);
		
		int old = 0;
		
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		
		if(sung == '1' || sung == '2' ) {
			old = year - (1900 + age1) +1;
			System.out.println(old);
		}else if (sung == '3' || sung == '4') {
			old = year - (2000 + age1) +1;
			System.out.println(old);
		}else {
			System.out.println("잘못입력되었습니다.");
			
		}
		
		
		
		
	
	}

}
