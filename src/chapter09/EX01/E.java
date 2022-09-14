package chapter09.EX01;

//E 클래스는 A 클래스는 상속 받는다. <-- A 클래스의 모든 필드와 메소드를 물려 받는다.
// A 클래스 : 부모 클래스 (super class), 필드, 메소드
// E 클래스 : 자식 클래스 (child class)
//		(동일한 패키지에서 상속설정)

public class E extends A{
	
	public void print() {
		System.out.println("== 부모클래스의 필드 출력 ==");
		System.out.println(a);		// public		<-- 부모의 a 필드
		System.out.println(b);		// protected	<-- 부모의 b 필드
		System.out.println(c);		// default		<-- 부모의 c 필드
//		System.out.println(d);		// private		<-- 부모의 d 필드
		
		System.out.println("== 부모의 메소드 호출 ==");
		print1();			// public
		print2();			// protected
		print3();			// default
//		print4();			// private
		
		
	}

}
