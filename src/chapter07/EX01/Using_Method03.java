package chapter07.EX01;

public class Using_Method03 {
	
	//instance field : 객체화 해야만 사용가능
	int c;			//인스턴스 필드 : static 키가 붙지 않는 필드 (객체화를 해야 사용가능)
	int d;
	
	//static field : 객체화 하지 않고 바로 호출 가능
	static int e;
	static int f;
	
	
	//instance field : 객체화 해야만 사용가능
	void abc() {		//main method 에서 선언하면 안됨
		System.out.println(" abc() 메소드 호출 ");
		
	}
	
	//static 메소드 : 객체화 없이 호출이 가능
	static void def() {
		System.out.println("def() 메소드 호출 ");
	}
	
	// static 메소드 내부에 인스턴스 필드나, 메소드를 바로 사용할 수 없다. (객체화 시켜야 사용가능)
			//
	
			//static : 고정된
	public static void main(String[] args) {
		// main method 도 method 이다.
		int a ;		//지역 변수이다. <-- stack 에 저장, stack 영역은 강제 초기화가 안됨
						//stack에 값이 저장, main ()method 내에서만 사용됨.
		a = 10;
				
		System.out.println(a);		//강제 초기화가 되지 않기 때문에, 초기값을 따로 설정 해주어야 함. otherwise, 오류발생
		
		//main method 내부에서는 method 선언 불가,
		//method는 클래스 블락에서 선언 되어야 함
		/*		오류 발생됨
		void abc () {
			System.out.println("안녕하세요");
		}
		*/
		
		//필드명, 메소드명 앞에 static 키가 적용되어 있으면 객체 생성없이 호출
		//		static method 내에서는 인스턴스 필드나, 인스턴스 메소드를 사용할 수 없다.
		//		static method 내에서는 static 필드나, static method를 사용할 수 있다.
		
		
		//c = 5;		//인스턴스 필드 	//오류 발생 (static method 내부에서 인스턴스 필드 직접 호출 (X))
		e = 10;		//같은 클래스 내에서 직접 호출, static 필드 호출
		
		//abc();	//instance method (오류 발생)
		def();	//static method	(직접 호출)
		
		
		
	}

}
