package chapter07.EX05;

class Book {
	
	String bookName;	//책 이름
	String author;		//책 저자
	
	Book() {
		bookName = "책이름 없음";
		author = "작자미상";
	}
	
	Book(String bookName) {
		this();
		this.bookName = bookName;
	}
	Book(String bookName, String author) {
		this(bookName);
		this.author = author;
	}
	
	void print () {			//메모리의 필드의 값을 출력 해줌
		System.out.println("책의 이름은 : " + bookName);
		System.out.println("책의 저자는 : " + author);
	}
	
}

public class This_Method03 {

	public static void main(String[] args) {

		//1. 기본 생성자 호출
		System.out.println("== 기본생성자 호출 ==");
		Book book1 = new Book ();	//기본 생성자 호출
		book1.print();
		
		//2. 매개변수 1개인 생성자 호출 ("심청전")
		System.out.println("== 매개변수 1개인 생성자 호출==");
		Book book2 = new Book ("심청전");
		book2.print();
		
		//3. 매개변수 2개인 생성자 호출 ("홍길동전" , "허균")
		System.out.println("== 매개변수 2개인 생성자 호출 ==");
		Book book3 = new Book ("홍길동전", "허균");
		book3.print();
		
		//4. 매개변수 2개인 생성자 호출 ("어린왕자", 생텍쥐베리")
		System.out.println("== 매개변수 2개인 생성자 호출 ==");
		Book book4 = new Book ("어린왕자", "생텍쥐베리");
		book4.print();
		
		//5. 매개변수 1개인 생성자 호출 ("포청천")
		System.out.println("== 매개변수 1개인 생성자 호출==");
		Book book5 = new Book ("포청천");
		book5.print();
		
		
		
	}

}
