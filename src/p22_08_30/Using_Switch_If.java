package p22_08_30;

import java.util.Scanner;

public class Using_Switch_If {

	public static void main(String[] args) {
		
				// 스캐너 사용
				// 에스프레소, 카페라떼 주문할 경우 가격이 3,500원
				// 아메리카노를 주문할 경우 : 2,500원
				// 그 외의 메뉴를 출력할 경우 : 우리 매장에 없는 메뉴 입니다.
				
				//출력 : 주문하신 <에스프레소>는 가격이 <3,500>원 입니다.
		
		Scanner sc = new Scanner (System.in); {
		
		System.out.println("음료를 주문해 주세요.");	
		
		String order = sc.next();
		int price = 0;
		
		if (order.equals("에스프레소") || order.equals("카페라떼")) {
			price = 3500;
			System.out.printf("주문하신 %s는 %d원 입니다.",order, price);
		}else if (order.equals("아메리카노")) {
			price = 2500;
			System.out.printf("주문하신 %s는 %d원 입니다.",order, price);
		}else {
			System.out.println("우리 매장에는 없는 메뉴 입니다.");
		}
		
		sc.close();
		}
		

	}

}
