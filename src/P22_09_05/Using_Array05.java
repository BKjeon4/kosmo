package P22_09_05;

import java.util.Arrays;

public class Using_Array05 {

	public static void main(String[] args) {
		// 1 ~ 500 까지 3의 배수를 배열에 저장
		// 출력 : 1. 직접 출력, 2. for문 출력, 3. Enhanced For, toString()
		// 합계 :		평균:
		
		int []a = new int[166];
		int sum = 0;
		int count = 0;
		
		//1. 직접 출력
		for (int i=0, j=3; i < a.length ; i++, j+=3) {
			if (j%3==0) {
				a[i]=j;
				sum +=j;
				count++;
			//System.out.println(j);	
			}
		}	System.out.println("합계 : " + sum);
			System.out.println("평균 : " + sum/(double)count);
			
			for(int k : a){
				System.out.println(k);
			}
			System.out.println("==================================");
			
			
			System.out.println(Arrays.toString(a));
		
			
				
			
		
	}

}
