package chapter04.EX07;

public class Using_Continue {

	public static void main(String[] args) {
		// continue : continue를 만나면 continue 아래의 코드를 실행하지 않고 반복
		// 	- if 문과 같이 사용됨
		
		// 1. 단일 Loop에서 continue
		for (int i = 0 ; i <10; i++) {			// 0 ~ 9 : 10번
			System.out.println("A");
			continue;				//구문을 빠져나가지 않고
			//System.out.println("B");			//도달할 수 없는 코드
		}
		System.out.println("==================================");
		
		for (int i = 0 ; i <10; i++) {			// 0 ~ 9 : 10번
			System.out.println("A");
			if (i %2 ==0) {
				continue;						// i: 0, 2, 4, 6, 8, ....
			}
			System.out.println("B");
		}
		System.out.println("==================================");
		
		for (int i =0 ; i <10; i++) {
			if (i ==5 || i ==7) {
				continue;
				}
			System.out.print(i + " ");
			
		}
		
		System.out.println();
		System.out.println("============= (3의 배수) ==============");
		
		//1. for 문을 사용해서 1에서 1000까지 1씩 증가하고 continue를 사용해서
		//	3의 배수만 출력 하세요.
		
		for (int a1= 1; a1 <= 1000 ; a1++) {
			if (a1 % 3 !=0) {
				continue;
			}
			System.out.print(a1+" ");
		}
		
		System.out.println();
		System.out.println("============= (5의 배수) ==============");
		
		//2. for 문을 사용해서 1에서 1000까지 1씩 증가하고 continue를 사용해서
		//	5의 배수만 출력 하세요.
		
		for (int a2 = 1; a2 <=1000 ; a2++) {
			if (a2 % 5 !=0) {
				continue;
			}
			System.out.print(a2+" ");
		}
		
		System.out.println();
		System.out.println("============= (3,5,7의 배수)==============");
		
		//3. for 문을 사용해서 1에서 1000까지 1씩 증가하고 continue를 사용해서
		//	3, 5, 7의 배수만 출력 하세요.
		
		for (int a3 = 1; a3 <=1000 ; a3++) {
			if (a3 % 3 !=0 && a3 % 5 !=0 && a3 % 7!=0) {
				continue;
			}
			System.out.println(a3+" ");
		}
		
		
		System.out.println("========================================");
		
		//2. 다중 Loop 에서 continue
		for (int i =0 ; i<5 ; i++) {			// 5번
			for (int k = 0 ; k<5 ; k++) {		// 5번  -> i,k 총 25번
				if (k == 3) {
					continue;
				}
				
				System.out.println(i + ", " + k);
			}
		}
		
		
		System.out.println("==========================================");
		
		out:for (int i =0 ; i<5 ; i++) {			// 5번
				for (int k = 0 ; k<5 ; k++) {		// 5번  -> i,k 총 25번
					if (k == 3) {
						continue out;
					}
				
					System.out.println(i + ", " + k);
				}
			}
		
		System.out.println("===========================================");
		
		out:for (int i =0 ; i<5 ; i++) {			// 5번
			for (int k = 0 ; k<5 ; k++) {		// 5번  -> i,k 총 25번
				if (k == 3) {
					i = 100;		// 바깥쪽 for 문의 변수값을 증대 시켜서 false 빠져나옴.
					continue out;
				}
			
				System.out.println(i + ", " + k);
			}
		}
		
		
		
		
	}

}
