package p22_09_04;

public class Using_Continue {

	public static void main(String[] args) {
		//1. for 문을 사용해서 1에서 1000까지 1씩 증가하고 continue를 사용해서
		//		3의 배수만 출력 하세요.
		
		for (int i =1; i <=1000; i++) {
			if (i%3!=0) {
				continue;
				
			}System.out.println(i);
		}
		
		System.out.println("======================================");
		//2. for 문을 사용해서 1에서 1000까지 1씩 증가하고 continue를 사용해서
		//		5의 배수만 출력 하세요.
		for (int i =1; i <=1000; i++) {
			if (i%5!=0) {
				continue;
				
			}System.out.println(i);
		}
		
		System.out.println("======================================");
		//3. for 문을 사용해서 1에서 1000까지 1씩 증가하고 continue를 사용해서
		//		3, 5, 7의 배수만 출력 하세요.
		for (int i =1; i <=1000; i++) {
			if (i%3!=0 && i%5!=0 && i%7!=0) {
				continue;
				
			}System.out.println(i);
		}

		//2. 다중 Loop 에서 continue
		
		

	}

}
