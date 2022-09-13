package chapter07.EX05;

class A {
	int m;
	int n;
	
	// A() {}	<-- 기본 생성자, 생략 됨
	
	void init (int a, int b ) {
		int c;
		c = 3;
		this.m = a;		// this = 자신의 객체를 뜻함, 기본적으로 생략해서 사용
		this.n = b;		// 자신 객체의 필드를 뜻함
	}
	
	void work () {
		this.init(2,3);		//this 생략시 컴파일러가 자동으로 할당
		System.out.println(m + ", " + n);
	}
	
}

public class This_Keyword01 {

	public static void main(String[] args) {
		// This keyword : 클래스의 필드와 메소드에 컴파일러가 자동으로 할당해줌
			// 객체 자신을 뜻함
			// 필드와 메소드를 선언시에는 this 키워드를 사용하면 안됨
			// 필드와 메소드가 클래스의 메소드 내에서 사용될 때 컴파일러가 자동으로 할당
			// 기본적으로는 생략되어 있음
			// 메소드나 생성자에서 인풋 매개변수 이름, 필드 이름이 동일할 경우 명시해야함
		
		// This method : 클래스 내에서 다른 생성자를 호출, 생성자에서 사용됨, 생성자에 첫 라인에 와야함
		
		A a = new A();

	}

}
