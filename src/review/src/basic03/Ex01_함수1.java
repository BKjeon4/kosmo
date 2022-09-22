package basic03;

public class Ex01_함수1 {

	public static void main(String[] args) {		//반복적인 작업이 띄엄띄엄 있을 때, 함수를 씀
		int a = 10, b = 20;
		
		add(a, b); //인수, 인자 argument etc
		
	}
	
	static void add(int a, int b) {			//parameter // a, b 이름을 다르게 설정 가능
		//여기에서 a, b 의 값을 합해서 출력
		int sum = a + b;
		System.out.println("합 : " + sum);
	}

}
