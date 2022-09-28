package p22_08_30;

import java.util.Scanner;

public class Using_Switch03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("메뉴를 입력해 주세요.");
		String food = sc.next();
		String type1 = "한식";
		String type2 = "양식";
		String type3 = "일식";
		
		/*
		switch (food) {
			case "김치찌개": case "된장찌개": case "제육볶음":
				System.out.printf("주문하신 메뉴는 %s 이며, %s 입니다.",food, type1);
				break;
			case "파스타": case "스테이크": case "피자":
				System.out.printf("주문하신 메뉴는 %s 이며, %s 입니다.",food, type2);
				break;
			case "초밥": case "우동": case "돈가스":
					System.out.printf("주문하신 메뉴는 %s 이며, %s 입니다.",food, type3);
				break;
			default:
				System.out.println("해당 메뉴는 존재하지 않습니다.");
			*/
		
		if (food.equals("김치찌개") || food.equals("된장찌개") || food.equals("제육볶음")) {
			System.out.printf("주문하신 메뉴는 %s 이며, %s 입니다.",food, type1);
		}else {
			System.out.println("해당 메뉴는 존재하지 않습니다.");
		}
		sc.close();
		
		

	}

}
