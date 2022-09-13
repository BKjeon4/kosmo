package chapter07.EX05;

class Car {
	
	String companyName;		//현대자동차
	String color;			//검은색
	double maxSpeed;		//200.0 km/h
	
	Car () {
		companyName = "이름없음";
		color = "알수없음";
		maxSpeed = 0.0;
		
	}
	Car (String companyName){
		this();
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
