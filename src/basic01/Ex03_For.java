package basic01;
/*
 *  반복문 : for / while /do ~ while
 *  
 *  (1) for ( 초기치 ; 조건문 ; 증가치) {
 *  		반복구문
 *  	}
 * 
 * 
 */

public class Ex03_For {

	public static void main(String[] args) {
		// 1) 1부터 10까지 숫자 출력
		
	//	for (int i = 0; i <10; i++) {
	//		System.out.print(i+1 + " " );
	//	}
	//	for (int i = 1; i <=5; i++) {
	//		System.out.print(i + " ");
	//	}
		
		
		
		// [1] 위에 for 원리 이해하기
		// [2] 1부터 10까지의 합을 출력
		// [3] 1부터 10까지의 홀수의 합을 출력
		
		//[2]
		int sum = 0;
		for (int i = 1; i <=10; i++) {
			sum += i;	//sum = i + sum;
			
		}System.out.print(sum+ " ");
		System.out.println();
		
		//[3]
		int sum1 = 0;
		for (int i = 1; i <=10; i++) {
			if (i%2==1) {
				sum1 +=i;
				
			}
		}System.out.println(sum1);
		
		
		
		// 2) 'A' 부터 'Z'까지 출력
		/*
		for (char j = 'A'; j <='Z'; j++) {
			System.out.print(j + " ");
		}System.out.println();
		
		for (char j = 'A'; j <='Z'; j+=2) {
			System.out.print(j + " ");
		}System.out.println();
		
		// 'Z'부터 'A까지 출력
		
		for (char j = 'Z'; j >= 'A'; j--) {
			System.out.print(j + " ");
		}
		*/
		
	

	}

}
