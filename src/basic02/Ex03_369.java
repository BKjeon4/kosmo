package basic02;

/*
 * [문제]
 * 
 * 1 부터 50까지 숫자 중에서 3, 6, 9 숫자가 포함되면
 * 그 갯수만큼 '짝' 글자를 출력하고
 * 그렇지 않으면 그 숫자를 출력
 * 
 * ex) 26			123
 * 		6 ->			3 ->
 * 		2 ->			2 ->
 * 						1 ->
 * 
 */

public class Ex03_369 {

	public static void main(String[] args) {

/*
		for (int i = 1; i <=50 ; i++) {
			
			int su = i;
			boolean su369 = false;
			
		while(su!=0) {
			int na = su % 10;
			
			if(na== 3 || na==6 || na==9) {
				System.out.print("짝");
				su369 = true;
			}
			su = su /10;
			
			
			
		}if(su369) System.out.println(i);
		else System.out.println(i);
			
		}
		

문제  : 8의 숫자 세기(구글입사문제)

1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?

8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다.

(※ 예를들어 8808은 3, 8888은 4로 카운팅 해야 합니다)

결과 : 4000

 
*/
		int count = 0;
		for (int i = 1; i <=10000 ; i++) {			
		int su = i;	
			
		while(su!=0) {
			int na = su % 10;
			
			if(na== 8) {
				
				count++;
				
			}
			su = su /10;
									
		} 
					
		}System.out.println(count);

		



		

	}

}
