package basic05;

public class Book {
	
	private static int count;	//변수 앞에 붙이는 static 은 공유
	
	public Book() {
		count++;
		
	}
	
	public static int getCount() {	// 메소드에 붙는 static 은 클래스명 접근 가능
		return count;
	}
	
	public static int a() {
		return count;
	}

}
