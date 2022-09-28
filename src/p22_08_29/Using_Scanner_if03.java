package p22_08_29;

import java.util.Scanner;

public class Using_Scanner_if03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("음료를 주문해 주세요.");
		String order = sc.next();
		
		if (order.equals("콜라")) {
			System.out.printf("주문하신 음료는 %s 입니다. 조금만 기다려 주세요.", order);
		}else if (order.equals("사이다")) {
			System.out.printf("주문하신 음료는 %s 입니다. 조금만 기다려 주세요.", order);
		}else if (order.equals("환타")) {
			System.out.printf("주문하신 음료는 %s 입니다. 조금만 기다려 주세요.", order);
		}else if (order.equals("밀키스")) {
			System.out.printf("주문하신 음료는 %s 입니다. 조금만 기다려 주세요.", order);
		}else if (order.equals("커피")) {
			System.out.printf("주문하신 음료는 %s 입니다. 조금만 기다려 주세요.", order);
		}else {
			System.out.println("저희 매장에는 없는 메뉴 입니다. 죄송합니다.");
		}
		
		
		sc.close();
		

	}

}
