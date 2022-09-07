package chapter07.EX01;

class B{
	//1. 리턴 타입이 없고(void), 입력 매개변수가 없는 method
	void print() {
		System.out.println("안녕");
	}
	
	//2. 리턴 타입이 int, 입력 매개변수 없는 method
	int data() {
	
	return 3;		//3은 반드시 정수여야 한다.
	}
	
	//3. 리턴 타입 double, 입력 매개변수 2개 인 method
	double sum (int a, double b) {
		
		return a+b;
	}
	//4. 리턴 타입 없음(void), 내부 함수를 종료함 (return;)
		//method 내부에서 return; 을 만나면 method 종료
	
	void printMethod (int m) {
		if (m <= 0 || m > 12) {
			System.out.println("잘못 입력되어 method 종료됨");
			return;		//method 종료
			//System.out.println("출력되지 않는 부분");		//도달할 수 없는 코드
		}else {
			System.out.println("입력한 달은 : " + m + "월 달입니다. ");
		}
	}
	
	boolean call () {	//call() 를 호출시 true 를 돌려줌
		
		return true;
	}
	
}

public class Using_method01 {

	public static void main(String[] args) {
		// method 사용
		
		//객체 생성 (b)
		B b = new B () ;
		b.print();
		System.out.println(b.data());
		System.out.println("=== return double, 입력매개변수 2개 ===");
		System.out.println(b.sum(3, 5.5));
		System.out.println("=== return이 없고 잘못된 입력이 되면 method 종료됨 ===");
		b.printMethod(13);
		
		System.out.println(b.call());
	
		
	}

}
