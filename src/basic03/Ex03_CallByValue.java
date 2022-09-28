package basic03;

public class Ex03_CallByValue {

	public static void main(String[] args) {	// 밑에서 받은 add 에서 무슨 짓을 하든 return 으로 돌려보내지 않으면 기본값 그대로 출력
		
		int a = 10, b = 20;
		add (a,b);
		System.out.println("A = " + a + ", B = " + b);	// 2	a = 10, b = 20

	}
	
	static void add (int a, int b) {
		a += b;
		System.out.println("A = " + a + ", B = " + b);	// 1	a = 30 , b = 20
		
		
		
		
	}

}
