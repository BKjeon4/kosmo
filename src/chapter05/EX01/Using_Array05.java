package chapter05.EX01;

import java.util.Arrays;

public class Using_Array05 {

	public static void main(String[] args) {
		// 1 ~ 500 까지 3의 배수를 배열에 저장
		// 출력 : 1. 직접 출력, 2. for문 출력, 3. Enhanced For, toString()
		// 합계 :		평균:
		
		int []a = new int [166];
	
		System.out.println("==========for문 사용===========");
		System.out.println("length 를 이용한 index의 갯수 : " + a.length);
		for (int i =0, j = 3; i < a.length ; i++, j+=3) {
			a[i]=j;
			System.out.print(a[i]+ " ");
						
		}
		System.out.println("=======enhenced for 을 사용============");
		for (int k : a) {
			System.out.println(k);
		}
		System.out.println("=========array to string 을 이용==========");
		
		System.out.println(Arrays.toString(a));
		
		System.out.println("===========합계와 평균==============");
		
		int sum = 0;
		int count = 0;
		for (int i =0, j = 3; i < a.length ; i++, j+=3) {
			a[i]=j;
			sum +=j;
			count++;
			
		} System.out.println();
		System.out.printf("합계 : %d, 평균 : %.2f", sum, sum/(double)count);
			
		
		
		
		
		
		
	}

}
