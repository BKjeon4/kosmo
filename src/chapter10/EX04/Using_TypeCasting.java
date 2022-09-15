package chapter10.EX04;

//업 캐스팅 : 자동으로 변환됨 (컴파일러가 자동으로 할당)
	// 기본 자료형 : 좁은(int) --> 넓은 범위(double)
	// 상속		: 자식 타입 --> 부모 타입

//다운 캐스팅 : 수동으로 직접 해야한다.
	// 기본 자료형 : 넓은 범위 (double) -> 좁은 (int),	(자료가 소실)
	// 상속 : 부모 타입 --> 자식 타입,	(실행 시 오류가 발생될 수 있다.)

class A {}
class B extends A{}
class C extends B{}
class D extends B{}


public class Using_TypeCasting {

	public static void main(String[] args) {
		// 1. 업캐스팅 (자동으로 변환) : 생략시 컴파일러가 자동으로 추가
		A ac = new C ();	// C --> A 업캐스팅
		B bc = new C ();	// C --> B 업캐스팅
		
		//bb는 A, B 포함하고 있고, B 타입으로 지정 (A, B 모두 사용됨)
		B bb = new B();
		A a = (A) bb;			// B --> A 업캐스팅 (A 필드, 메소드)
		
		// 2. 다운캐스팅 (수동으로 직접 할당) : 캐스팅이 불가능한 경우 실행시 오류
				//다운 캐스팅이 불가한 경우
		A aa = new A();			//aa는 A 타입만 내포하고 있다.
//		B b = (B) aa;			//aa는 B 타입을 내포하고 있지 않으므로 다운캐스팅을 할 수 없다.
								// 구문에는 문제가 없으나, 실행시 문제발생

//		C c = (C) aa;			//aa는 C 타입을 내포하고 있지 않아서 다운캐스팅이 불가함
								// 구문에는 문제가 없으나, 실행시 문제발생
		
		// 3. 다운캐스팅 가능한 경우
		A ab = new B();			//ab는 A, B 타입을 내포하고 있다.
		B b = (B) ab;			// A(부모) --> B(자식)
//		C C = (C) ab;			//ab는 C 타입을 내포하고 있지 않음. 캐스팅이 불가능
								// 구문에는 문제가 없으나, 실행시 문제발생
		
		B bd = new D();			//bd는 A, B, D를 내포하고 있고, B타입으로 지정
								//bd는 A, B 의 필드와 메소드를 접근
		D d = (D) bd;
		A aaa = d;
		
		B bbb = (B) aaa;
		
	}

}
