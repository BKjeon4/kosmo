package p22_09_01;

public class Using_Array05 {

	public static void main(String[] args) {
		// 1 ~ 500 까지 3의 배수를 배열에 저장
		// 출력 : 1. 직접 출력, 2. for문 출력, 3. Enhanced For, toString()
		// 합계 :		평균:
		
		int[]a = new int [300];
		int count = 0;
		
		for (int i=1; i < 500; i++) {
			if (i%3==0) {
				System.out.print(i + " ");
				
				
			}
			
		}

	}

}
