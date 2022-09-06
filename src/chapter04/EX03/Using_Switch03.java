package chapter04.EX03;

import java.util.Scanner;

public class Using_Switch03 {

	public static void main (String[] args) {
		/*
		 1. 문제
		 	스캐너로 "Gold"를 넣으면 "금메달 입니다." 를 출력
		 	스캐너로 "Silver"를 넣으면 "은메달 입니다." 를 출력
		 	스캐너로 "Bronze"를 넣으면 "동메달 입니다." 를 출력
		 	그 외에는 "메달이 없습니다.
		 	
		 2. 문제
		 	스캐너로 월을 인풋 받아서 해당월의 총 날짜를 
		 	1월은 31일까지, 2월은 28일까지, 3월은 31일까지, 4월은 30일까지, 5월은 31일까지, 6월은 30일까지, 7월은 31일까지, 8월은 31일까지
		 	9월은 30일까지, 10월은 31일까지, 11월은 30일까지, 12월은 31일까지
		 	"<월>은 <며칠> 까지 있습니다."
		 	31일까지 : 1,3,5,7,8,10,12 / 30일까지 : 4,6,9,11 / 28일까지 : 2
		 */
		
		Scanner sc = new Scanner(System.in); {
			
			System.out.println("메달을 입력해 주세요.");
			String medal = sc.next();
			
			switch (medal) {
			case "Gold": case "gold": case "GOLD":
				System.out.println("금메달 입니다.");
				break;
			case "Silver": case "silver": case "SILVER":
				System.out.println("은메달 입니다.");
				break;
			case "Bronze": case "bronze": case "BRONZE":
				System.out.println("동메달 입니다.");
				break;
			default:
				System.out.println("메달이 없습니다.");
			}
			
			System.out.println("==================================");
			
			System.out.println("달을 입력해주세요.(1~12)");
			int month = sc.nextInt();
			int day = 0;
			
			
			switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.printf("%d월은 31일까지 있습니다.",month);
				break;
			case 4: case 6: case 9: case 11:
				System.out.printf("%d월은 30일까지 있습니다.",month);
				break;
			case 2:
				System.out.printf("%d월은 28일까지 있습니다.",month);
				break;
			default:
				System.out.printf("확인할 수 없습니다. 제대로 된 달을 입력해주세요.");
			}
			/*
			
			switch (month) {
			case 4: case 6: case 9: case 11:
				day = 30;
				break;
			case 2:
				day = 28;
				break;
			default:
				day = 31;
			}
			System.out.printf("%d월은 %d일까지 있습니다.",month, day);
			*/
			
			
			
			
			
			sc.close();
		}
	}
}
