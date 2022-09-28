package p22_08_29;

import java.util.Scanner;

public class Using_Scanner_if05 {

	public static void main(String[] args) {
		
		/*나이(age)가 8세 미만이면,  "출입금지"
			"입장료는 <1000>원 입니다."
		나이 14세 미만이면 부모동반 입니다.
		"입장료는 <2000>원 입니다."
		나이 20세 미만이면 학생증 제시 해주세요.
		"입장료는 <2500>원 입니다."
		나이 20세 이상이면 신분증 제시 해주세요.
		"입장료는 <3000>원 입니다."
		*/

		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 작성해 주세요.");
		int age = sc.nextInt();
		int price = 0;
		
		System.out.printf("나이가 %d세 이므로 ",age);
		if (age < 8) {
			price = 1000;
			System.out.printf("출입금지 이며, 가격은 <%d>입니다.",price);
		} else if (age < 14) {
			price = 2000;
			System.out.printf("부모동반 이며, 가격은 <%d>입니다.",price);
		} else if (age < 20) {
			price = 2500;
			System.out.printf("학생증을 제시해야 하며, 가격은 <%d>입니다.",price);
		} else {
			price = 3000;
			System.out.printf("신분증을 제시해야 하며, 가격은 <%d>입니다.",price);
		}
				
		
		
		
		sc.close();
	}

}
