package basic05;

class A2 {
	void f () {
		Book.a();
	}
}

public class MainTest {
	

	public static void main(String[] args) {
		
		Book b1 = new Book();
		System.out.println("총 갯수: " + b1.getcount);
		
		
		Book b2 = new Book();
		System.out.println("총 갯수: " + b2.getcount);
		

		//Book b3 = new Book();
		//System.out.println("총 갯수: " + b3.count);
		
		Book b5 = new Book();
		
		Book.a();
		
		
	}

}



/*
 * static
 * 
 * - 객체의 공유
 * - 객체생성보다 먼저 실행하기 때문에 클래스명 접근
 * 
 * -객체끼리 공유
 * -클래스명으로 접근 가능
 * 
 * 
*/
