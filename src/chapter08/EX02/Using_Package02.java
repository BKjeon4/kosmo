package chapter08.EX02;

// import를 사용해서 외부 패키지 접근
	// 동일한 클래스는 import로 사용불가

import chapter08.EX01.A;
// import chapter08.EX01.com.A;	//오류 발생 : 동일한 클래스는 import 할 수 없다.
// import chapter08.EX01.B;		//오류 발생, 접근 제어자가 default 로 되어 있기 때문 (같은 패키지에서만 접근 가능, 다른 패키지에서는 접근 불가능)

public class Using_Package02 {

	public static void main(String[] args) {
		
		//A 클래스는 동일한 패키지 내에 존재하지 않는다. (import를 해서 사용)
		//		-- A class는 접근 제어자가 public, protected (상속) 지정되어 있어야 한다.
		
		System.out.println("==A 클래스 (public)==");
		A a = new A ();
		
		System.out.println(a.m);	//다른 패키지에서 접근
		System.out.println(a.n);
		
		a.print();
		
		
		
		System.out.println("==B 클래스 (default)==");
		// B 클래스는 다른 패키지에 존재하고, 접근 제어자가 default로 할당 되어 있다. 
	//	B b = new B ();
		
		System.out.println("===com.A 클래스 객체 생성===");		
		//동일한 클래스는 import가 불가능 하므로 전체 이름을 사용해서 객체를 생성 해야한다.
		chapter08.EX01.com.A aa = new chapter08.EX01.com.A();
		System.out.println(aa.aa);
		System.out.println(aa.bb);
		
		aa.print();

	}

}
