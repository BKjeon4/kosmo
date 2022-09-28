package p22_09_07;
class A {
	double r;
	String name;
	
	A (double r, String name ){
		this.r = r;	
		this.name = name;
			
	}
	void food () {
		double kk = 3.14 * r * r;
		System.out.println(name + "의 넓이는 " + kk + " 입니다.");
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

		A pizza = new A(10, "피자");
		pizza.food();
		
		A donut = new A(5, "도넛");
		donut.food();
		
	}

}
