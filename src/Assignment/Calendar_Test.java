package Assignment;

import java.util.Calendar;
import java.util.Scanner;

public class Calendar_Test {
	
	public static void main (String [] args) {
		
		Calendar cal = Calendar.getInstance();
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("출생년도 를 입력해주세요. ex)2000");
		
		int year = cal.get(Calendar.YEAR);
		
		String age = sc.nextLine();
		
		int age1 = Integer.parseInt(age);
		
		int result = year - age1 +1;
		
		System.out.println("당신의 출생년도는 " + age + "년 이며, 현재 당신의 나이는 " + result + "입니다.");
		
		sc.close();
				
		
		
		
	}

}
