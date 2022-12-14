package chapter09.EX01;

// A 클래스와 동일한 패키지 내에 존재하는 클래스, import 없이 객체 생성

public class Using_Modifier01 {

	public static void main(String[] args) {

		A a = new A ();		//객체 생성
		
		//필드 출력
		System.out.println(a.a);	//public
		System.out.println(a.b);	//protected
		System.out.println(a.c);	//default
		//System.out.println(a.d);	//private, 동일한 파일에서만 접근, 접근불가
		
		
		//메소드 출력
		a.print1();		//public
		a.print2();		//protected
		a.print3();		//default
		//a.print4();	//private 접근불가
		
		System.out.println("== 상속설정된 객체 생성 (E) ==");
		
		E e = new E();
		e.print();

		
		
	}

}
