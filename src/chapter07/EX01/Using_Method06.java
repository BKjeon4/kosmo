package chapter07.EX01;

import java.util.Arrays;

public class Using_Method06 {
	static int sum ;
	static int sub ;
	static long mult = 1;
	static int count;
	static double avg1 ;
	
	
	
	static int add (int[]a) {
		// 들어온 배열의 모든 값을 더해서 더한 값을 리턴
		
		for (int i = 0; i < a.length ; i++) {
			sum += a[i];
		}
		System.out.println("더한 값 : " + sum);
		return sum;
	}
	
	static int div (int[]a) {
		// 들어온 배열의 모든 값을 빼서 뺀값을 리턴
		
		for (int i = 0; i < a.length ; i++) {
			sub -= a[i];
		}
		System.out.println("뺀 값 : " + sub);
		return sub;
	}
	
	static long mul (int[]a) {
		// 들어온 배열의 모든 값을 곱해서 곱한 값을 리턴
		
		
		for (int i = 0; i < a.length ; i++) {
			mult *= a[i];
		}
		System.out.println("곱한 값 : " + mult);
		return mult;
	}
	
	static double avg (int[]a) {
		// 들어온 배열의 모든 값의 평균값을 리턴
		int sum1 =0;
		
				
		for (int i = 0; i < a.length ; i++) {
			sum1 += a[i];
			count++;
			avg1 = (double)sum1/count;
		}
		
		System.out.println("평균 값 : " + avg1);
		return avg1;
	}
			
		

	public static void main(String[] args) {
		//1 ~ 100까지 7의 배수만 저장 후 각 메소드 호출
		
		
		//배열 선언 후 for 문 사용해서 7의 배수만 저장 후, 호출할 때
		
		int [] a = new int [14];
		
		for (int i=0, j=7 ; i<a.length ; i++, j+=7) {
			a[i] = j;
		}
		
		System.out.println(Arrays.toString(a));
		
		add(a);		
		
		
		div(a);		
		
		
		mul(a);		
		
		
		avg(a);

	}

}
