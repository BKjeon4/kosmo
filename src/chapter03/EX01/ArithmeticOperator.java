package chapter03.EX01;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// 연산자
		// 1. 산술 연산자 ( +, -, *, /, % (나머지값만 출력))
		System.out.println(2 + 3);
		System.out.println(8 - 5);
		System.out.println(7 * 2);
		System.out.println(7 / 2);		// 몫만 출력
		System.out.println(7.0 / 2.0);	// 나눈값을 제대로 출력함
		System.out.println(8 % 5);		// 나머지 값만 출력
		System.out.println(2+3);
		System.out.println("========================");
		// 2. 증감 연산자 : case1
			//++ : 1씩 증가
			//-- : 1씩 감소
		
		int value1 = 3;
		value1++;
		System.out.println(value1);
		
		int value2 = 3;
		++value2;
		System.out.println(value2);
		System.out.println("========================");
		
		// 2. 증감 연산자 : case2
		
		int value3 = 3;
		int value4 = value3++ ;				//++가 뒤에 있는 경우, 대입이 먼저 되고 난 다음 증가를 시킴 -> 그래서 value4 를 넣었을 땐 3
		
		System.out.println(value3);			//4
		System.out.println(value4);			//3
		System.out.println("=========================");
		
		int value5 = 3;
		int value6 = ++value5;				//++가 앞에 있는 경우, 대입 전 증가를 먼저 시킴 -> 그래서 value6 를 넣었을 때 4
		
		System.out.println(value5);			//4
		System.out.println(value6);			//4
		System.out.println("=========================");
		
		// 2. 증감 연산자 : case3
		
		int value7 = 3;
		int value8 = 4;
		int value9 = 2 + value7-- + ++value8;	//2 + 3 + 5 = 10
		
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		
		
	}

}
