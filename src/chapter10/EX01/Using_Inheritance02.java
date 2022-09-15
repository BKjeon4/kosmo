package chapter10.EX01;

class Fruit{			//과일 <-- 부모 클래스
	String name ;		//과일 이름
	String color;		//과일 색깔
	int large;			//과일 크기
	
	void eat () {
		System.out.println("모든 과일은 맛이 있습니다.");
	}
	void print () {
		System.out.println(name + ", " + color + ", " + large);
	}
}

class Apple extends Fruit{			//사과 <-- 자식 클래스
	//자식 클래스만 가지는 필드 1, 메소드 1
	int howMuch;
	
	void a1 () {
		System.out.println("가격은" + howMuch + "원 입니다.");
		
	}
	
}

class Orange extends Fruit{			//오렌지 <-- 자식 클래스
	//자식 클래스만 가지는 필드 1, 메소드 1
	int howMuch;
	
	void a2 () {
		System.out.println("가격은" + howMuch + "원 입니다.");
		
	}
}

class Banana extends Fruit{			//바나ㅏㄴ <-- 자식 클래스
	//자식 클래스만 가지는 필드 1, 메소드 1
	int howMuch;
	
	void a3 () {
		System.out.println("가격은" + howMuch + "원 입니다.");
		
	}
}

public class Using_Inheritance02 {

	public static void main(String[] args) {
		//객체 생성
		
		Apple a = new Apple();
		System.out.println("===Apple==");
		a.name = "사과"; 
		a.color = "빨간색";
		a.large = 5;
		a.howMuch = 3000;
		
		a.eat();
		a.print();
		a.a1();
		
		Orange o = new Orange();
		System.out.println("===Orange==");
		o.name = "오렌지";
		o.color = "주황색";
		o.large = 7;
		o.howMuch = 5000;
		
		o.eat();
		o.print();
		o.a2();
		
		Banana b = new Banana();
		System.out.println("===Banana==");
		b.name = "바나나";
		b.color = "노란색";
		b.large = 8;
		b.howMuch = 2700;
		
		b.eat();
		b.print();
		b.a3();
		
		

	}

}
