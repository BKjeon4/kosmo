package p22_09_25;

class Static1 {
	
	int a, b;
	
	static int c, d;
	
	void print () {
		int aa1 = a + b;
		System.out.println(aa1 +"im 는 인스턴스 메소드고 인스턴스 메소드는 iv 객체의 모음이다." );
	}
	
	static int output(int c, int d) {
		
		int h = c + d;
		
		return h;
	}	
	

}

public class Static {

	public static void main(String[] args) {
		Static1 aa = new Static1();
		
		aa.a = 10;
		aa.b = 20;
		
		aa.print();
		
		System.out.println(aa.a + aa.b);
		
		System.out.println("h는 static에서 c + d 의 값을 합한 값임 : " + Static1.output(4, 5));
		
		int gs = Static1.output(3, 4);
		System.out.println(gs);
		
		

		
		
		
	}
	
	
	
	
	

}
