package p22_08_30;

import java.util.Scanner;

public class Using_Switch02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("응답할 수 있는 색을 넣어주세요. (빨강,노랑,초록)");
		
		String color = sc.next();
		
		/*
		switch (color) {
		case "빨강":
			System.out.println("Stop");
			break;
		case "노랑":
			System.out.println("wait");
			break;
		case "초록":
			System.out.println("go");
			break;
		default :
			System.out.println("응답할 수 없습니다.");
		}
		*/
		
		if (color.equals("빨강")) {
			System.out.println("Stop");
		}else if (color.equals("노랑")) {
			System.out.println("Wait");
		}else if (color.equals("초록")) {
			System.out.println("go");
		}else {
			System.out.println("응답할 수 없습니다.");
		}
		
		
		
		sc.close();
		
		
		
		
		
		
		
	}

}
