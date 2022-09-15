package chapter10.EX02;

//다형성 (polymorphism) : 하나의 객체가 여러가지 타입을 가질 수 있다.
//		- 메소드 오버라이딩을 사용해서 부모 클래스의 메소드를 재정의 해서 자식 클래스에서 재 사용한다.
//

//상속을 사용한 다형적 표현
	// - 상속 관계에서 객체를 생성시 부모 타입으로 선언 할 수 있다.
	// - 부모 타입으로 선언 하면 부모 클래스의 필드와 메소드만 사용 가능함 (이너클래스는 안됨)
	// - 자식 객체를 생성하면서 부모 타입으로 지정하면 업캐스팅이 자동으로 됨
	// - 다시 자식 클래스의 필드와 메소드를 사용하려면 다운캐스팅을 해야 사용 가능
	// - 다운캐스팅은 수동으로 적용됨

class A{} 					//부모클래스
class B extends A { } 		//자식 클래스, 부모 A
class C extends B { }		//자식 클래스, 부모 B
class D extends B { }		//자식 클래스, 부모 B

public class Using_Polymorphism01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. A 타입의 다형적 표현
			//a1은 A 타입만 내포하고 있고, A 타입으로 지정
		A a1 = new A();			//A 클래스는 A 타입이다. , A는 A이다. (o)
			//a2는 A, B 타입을 내포하고 있고, A 타입으로 지정
		A a2 = new B();			//B 클래스는 A 타입니다. , B는 A이다. (o)
			//a3는 A, B, C 타입을 내포하고 있고, A 타입으로 지정
		A a3 = new C();			//C 클래스는 A 타입니다. , C는 A이다. (o)
			//a4는 A, B, D 타입을 내포하고 있고, A 타입으로 지정
		A a4 = new D();			//D 클래스는 A 타입니다. , D는 A이다. (o)
		
		
		//2. B 타입으로 다형적 표현
//		B b1 = new A();			//A는 B 이다. (x)
		B b2 = new B();			//B는 B 이다. (o)
		B b3 = new C();			//C는 B 이다. (o)
		B b4 = new D();			//D는 B 이다. (o)
		
		//3. C 타입으로 다형적 표현
//		C c1 = new A();			//A는 C 이다. (x)
//		C c2 = new B();			//B는 C 이다. (x)
		C c3 = new C();			//C는 C 이다. (o)
//		C c4 = new D();			//D는 C 이다. (x)
		
		//4. D 타입으로 다형적 표현
//		D d1 = new A();			//A는 D 이다. (x)
//		D d2 = new B();			//B는 D 이다. (x)
//		D d3 = new C();			//C는 D 이다. (x)
		D d4 = new D();			//D는 D 이다. (o)
		
	}

}
