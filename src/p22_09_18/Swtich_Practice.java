package p22_09_18;

import java.util.Scanner;

public class Swtich_Practice {

	public static void main(String[] args) {
		// Switch 문으로 처리
				// 스캐너 사용
				// 에스프레소, 카페라떼 주문할 경우 가격이 3,500원
				// 아메리카노를 주문할 경우 : 2,500원
				// 그 외의 메뉴를 출력할 경우 : 우리 매장에 없는 메뉴 입니다.
				
				//출력 : 주문하신 <에스프레소>는 가격이 <3,500>원 입니다.
				
		int price = 0;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("주문할 메뉴를 입력해 주세요.>>");
		String order = sc.next();
		
		switch (order) {
			case "아메리카노":
			price = 2500;
			System.out.printf("주문하신 메뉴는 <%s> 이며, 가격은 <%d> 입니다.", order, price);
			break;
			
			case "에스프레소": case "카페라떼":
			price = 3500;
			System.out.printf("주문하신 메뉴는 <%s> 이며, 가격은 <%d> 입니다.", order, price);
			break;
			
			default:
			System.out.println("우리 매장에는 없는 메뉴 입니다.");
		}
		
		
		
		sc.close();
	}

}
