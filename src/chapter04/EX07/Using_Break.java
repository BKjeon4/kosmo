package chapter04.EX07;

public class Using_Break {

	public static void main(String[] args) {
		//break ; <-- 해당 구문을 ({ }) 을 탈출 할 때 사용, if 조건과 같이 사용
		//	- 1단계만 탈출
		// for, while, do while (반복문을 탈출할 때 사용)
		
		// # 1. 단일 loop 에서 탈출
		for ( int i = 0; i<10 ; i++) {
			System.out.println(i);
			break;							//한단계 탈출
		}
		System.out.println("==========================================");
		
		for ( int i = 0; i<10 ; i++) {
			System.out.println(i);
			if ( i==5) { break;	}						//i가 5일 때 탈출
		}
		
		
		// # 2. 다중 loop 문에서 break 사용
		// case 1. 하나의 loop문만 탈출
		System.out.println("=========================================");
		for (int i = 0; i<5 ; i++) {		//0 1 2 3 4 : 총 5번 loop
				for (int j=0; j<5; j++) {		// 0 1 2 3 4 : 총 5번 loop
					if (j==2) {					//하나의 for 문만 빠져나감
					break;
					}
				System.out.println(i+ " , " +j);
				
			}
		}
		
		// case 2. 한꺼번에 탈출 ( 바깥쪽 for 문의 변수의 값을 조건이 false가 나도록 증가 시켜서 탈출)
		System.out.println("=========================================");
		for (int i = 0; i<5 ; i++) {		//0 1 2 3 4 : 총 5번 loop
			for (int j=0; j<5; j++) {		// 0 1 2 3 4 : 총 5번 loop
				if (j==2) {					//하나의 for 문만 빠져나감
					i = 100;				//바깥 쪽 for 문의 변수값을 증가시켜서 한꺼번에 탈출
				break;
				}
			System.out.println(i+ " , " +j);
			
		}
	}
		
		// case 2. 한꺼번에 탈출 ( lable을 사용해서 탈출 )
		System.out.println("============== 이중 for 문 탈출 (lable) ===================");
		jump: for (int i = 0; i<5 ; i++) {		//0 1 2 3 4 : 총 5번 loop
				for (int j=0; j<5; j++) {		// 0 1 2 3 4 : 총 5번 loop
				if (j==2) {					//하나의 for 문만 빠져나감
									
				break jump;
				}
			System.out.println(i+ " , " +j);
			
		}
	}
		
		
		
	}
}
