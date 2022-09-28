package basic01;

import java.util.Scanner;

public class Ex02_control2 {

	public static void main(String[] args) {
		
			char five = ' ';			
			String year = null;
			String major = null;
			String seven = null;
			String major1 = null;
		
		
			Scanner sc = new Scanner (System.in);
			System.out.println("학번을 입력해주세요 (총 10자리)");
			String input = sc.nextLine();
			int a = Integer.parseInt(input);
			
			seven = input.substring(5, 7);
			
			year = input.substring(0, 4);
			
			int year1 = Integer.parseInt(year);
			
			
			five = input.charAt(4);
			
			
			switch (five) {
			case '1':
				major = "공대 ";	
				
				
				int seven1 = Integer.parseInt(seven);
				
				if (seven1 == 11) {
					major1 = "컴퓨터학과 ";
				}else if (seven1 ==12) {
					major1 = "소프트웨어학과 ";
					
				}else if (seven1 ==13) {
					major1 = "모바일학과 ";
				}else if (seven1 ==22) {
					major1 = "자바학과 ";
				}else if (seven1 == 33) {
					major1 = "서버학과 ";
				}else {
					System.out.println("세부학과를 알 수 없습니다.");
					return;
				}
				break;
			case '2':
				major = "사회대 ";
				
				
				int seven2 = Integer.parseInt(seven);
				
				if (seven2 == 11) {
					major1 = "사회학과 ";
				}else if (seven2 ==12) {
					major1 = "경영학과 ";
					
				}else if (seven2 ==13) {
					major1 = "경제학과 ";
			
				}else {
					System.out.println("세부학과를 알 수 없습니다.");
					return;
				}
				break;
			
			default :
				System.out.println("메인 학과를 알 수 없습니다.");
				return;
			}
			
			System.out.println(input + "는 " + year1+ "년도에 입학한 " + major + major1+"학생 입니다.");
			

			
			
			
	
	}

}
