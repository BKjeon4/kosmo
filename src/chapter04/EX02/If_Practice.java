package chapter04.EX02;

import java.util.Scanner;

public class If_Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("음료를 주문해 주세요.");
		
		String aa = sc.next();
		int bb;
		
		if (aa.equals("아메리카노")) {
			bb = 2500;
			System.out.printf("주문하신 %s는 %d 입니다.",aa, bb);
		} else if (aa.equals("카페라떼") || aa.equals("아보카도") || aa.equals("에스프레소")) {
			bb = 3500;
			System.out.printf("주문하신 %s는 %d 입니다.", aa, bb);
		} else {
			System.out.println("우리 매장에 없는 메뉴 입니다.");
		}
		
		
		
		sc.close();

	}

}
