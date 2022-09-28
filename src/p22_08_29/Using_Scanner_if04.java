package p22_08_29;

import java.util.Scanner;

public class Using_Scanner_if04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("음료를 주문해 주세요.");
		
		String order = sc.next();
		int price = 0;
		
		if (order.equals("콜라")|| order.equals("사이다")|| order.equals("환타")) {
			price = 2000;
			System.out.printf("당신이 주문한 음료는 %s 이며, %d 입니다.", order, price );
		} else if (order.equals("밀키스")||order.equals("커피")) {
			price = 2500;
			System.out.printf("당신이 주문한 음료는 %s 이며, %d 입니다.", order, price );
		} else {
			System.out.println("우리 매장에는 없는 메뉴 입니다.");
		}
		
		
		
		
		
		sc.close();

	}

}
