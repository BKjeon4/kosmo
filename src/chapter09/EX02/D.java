package chapter09.EX02;

import chapter09.EX01.A;

// class D 는 class A 를 상속 받는다. (패키지 외부에서 상속 설정)
	// D 클래스는 A 클래스의 필드와 메소드를 상속받는다.

public class D extends A{
	
	public void print () {
		System.out.println("==부모 클래스의 필드 출력 (다른 패키지)==");
		System.out.println(a);		//public 	-> 같은 패키지 걍 떙겨옴 / 다른 패키지 import 필요
		System.out.println(b);		//protected -> 같은 패키지 extends 필요 / 다른 패키지 extends , import 필요
//		System.out.println(c);		//default	-> 같은 패키지 extends 필요 / 다른 패키지 불가
//		System.out.println(d);		//private	-> 같은 패키지, 다른 패키지 둘 다 불가
		
		System.out.println("==부모 클래스의 메소드 출력 (다른 패키지)==");
		print1();		//public
		print2();		//protected
//		print3();		//default
//		print4();		//private
		
		System.out.println("==상속 관계 객체 출력 (D)==");
		

		
		
	}

	
}
