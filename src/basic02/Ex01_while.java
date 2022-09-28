package basic02;

public class Ex01_while {

	public static void main(String[] args) {
		
		// 0. for 문
		
		/*
		int sum = 0;
		for (int i = 1; i <=10 ; i++) {
			sum+=i;			
		}System.out.println(sum);
		*/
		
		/* 1. while 문
		int sum = 0;
		int i = 1;
		
		while ( i <=10) {			
			sum+=i;
			i++;
		}System.out.println(sum);
		*/
		
		// 2. do ~ while문
		int sum = 0;
		int i = 1;
		
		do {
			sum+=i;
			i++;
		}while ( i<=10);
		System.out.println(sum);
		
	}
}
