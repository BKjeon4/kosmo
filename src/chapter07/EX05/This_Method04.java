package chapter07.EX05;

class Car {
	
	// this 키워드 : 필드나 메소드 선언시 사용 불가
	//			- 생성자, 메소드 내부에서 필드나 메소드를 사용할 때 자신의 객체 필드나 메소드를 지칭
	//			- 자신의 객체의 필드, 메소드를 가르킨다. 기본적으로 생략해서 많이 사용
	//			- 반드시 사용해야 할 경우 : 메소드, 생성자에서 입력 매개변수 이름, 필드 이름이 동일할 경우
	// this ( )	- 생성자 내부에서만 사용, 반드시 첫 라인에 위치
	//			- 자신의 객체의 다른 생성자를 호출
	//			- 생성을 오버라이딩 할 때, 코드를 산략하게 사용
	
	String companyName;		//현대자동차
	String color;			//검은색
	double maxSpeed;		//200.0 km/h
	
	Car () {	// 리턴 타입이 없다, 클래스 이름과 동일
		companyName = "이름없음";		//this 키를 생략시 자동으로 컴파일러가 할당
		color = "알수없음";
		maxSpeed = 0.0;
		
	}
	Car (String companyName){		// 매개변수 이름, 필드이름이 같을 때
		this();						// this() 메소드, 기본 생성자 호출
		this.companyName = companyName;
		
	}
	Car (String companyName, String color) {
		this (companyName);
		this.companyName = companyName;
		this.color = color;
	}
	Car (String companyName, String color, double maxSpeed) {
		this (companyName, color);
		this.companyName = companyName;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	void show () {
		System.out.println(companyName + ", " + color + ", " + maxSpeed);
	}
	
}

public class This_Method04 {

	public static void main(String[] args) {
		//this Keyword, this Method 를 사용해서 처리
		
		// 1. 매개변수가 0개일 때, 기본 필드의 값 출력
		System.out.println("매개변수가 0개일 때");
		Car car1 = new Car ();
		car1.show();
		
		System.out.println();
		// 2. 매개변수가 1개 일 때, companyName 만 출력
		System.out.println("매개변수가 1개 일 때");
		Car car2 = new Car ("현대자동차");
		car2.show();
		
		System.out.println();
		// 3. 매개변수가 2개 일 때, companyName, color 만 출력
		System.out.println("3. 매개변수가 2개 일 때");
		Car car3 = new Car ("현대자동차", "검은색");
		car3.show();
		
		System.out.println();
		// 4. 매개변수가 3개 일 때, 모두 출력	
		System.out.println("4. 매개변수가 3개 일 때");
		Car car4 = new Car ("현대자동차", "검은색", 230.1);
		car4.show();
		
		
		
	}

}
