package p22_08_30;

public class Using_For01 {

	public static void main(String[] args) {
		/*
		int a;
		int sum =0;
		
		for (a=0; a<=1000; a+=7) {
			sum = sum + a;
		} System.out.println("7의 배수의 합계 : " + sum);
		*/
		
		//for 문과 if 문을 사용해서 1~20까지 홀수만 더한 값을 출력 하되 아래와 같이 출력하세요.
		// 결과 : 1+3+5+7+9+11+13+15+17+19 = 100

		int i;
		int sum =0;
		
		for (i=0; i<=20; i++) {
			if (i%2 == 1) {
				sum+=i;
				
				System.out.print(i);
				if(i <= 18) {
				System.out.print("+");
				
				}
			}
			
		}
		System.out.print( "=" + sum );
		
	}

}
