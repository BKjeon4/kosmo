package chapter07.EX01;
/*
class C {
	int radius;
	String name;
	
	C (int radius, String name) {
		this.radius = radius;
		this.name = name;
	}
	
	void call() {
		double area = 3.14 * radius * radius;
		System.out.println(name + "의 넓이는 " + area + " 입니다. ");
	}
}


public class Using_Method02 {

	public static void main(String[] args) {
		// 원의 반지름을 넣었을 때 전체 넓이를 구하는 객체를 생성 후 출력해 보세요.
		// 		피자 : 10 (반지름)
		//		도넛 : 5	(반지름)
		// 3.14 * 반지름^2
		//	<피자>의 넓이는 <00> 입니다.
		//	<도넛>의 넓이는 <00> 입니다.
		
		C pizza = new C(10, "피자");
		pizza.call();
		
		C donut = new C(5, "도넛");
		donut.call();
		
	}

}
*/

class M {
	String name;
	int w;

	void print(String name, int w) {
		double nb = w * w * 3.14;
		
		System.out.println(name + "의 넓이는 " + nb + "입니다.");
	}

}

public class Using_Method02 {

	public static void main(String[] args) {
		// 원의 지름을 넣었을 때, 전체 넓이를 구하는 객체를 생성 후 출력
		// 피자 : 10
		// 도넛 : 5
		M m = new M();
		m.print("피자", 10);
		m.print("도넛", 5);

	}

}