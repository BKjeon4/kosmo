package chapter07.EX05;

import java.util.Scanner;

class Bookk {
	
	String bookName;	//책 이름
	String author;		//책 저자
	
	Bookk() {
		bookName = "책이름 없음";
		author = "작자미상";
	}
	
	Bookk(String bookName) {
		this();
		this.bookName = bookName;
	}
	Bookk(String bookName, String author) {
		this(bookName);
		this.author = author;
	}
	
	void print () {			//메모리의 필드의 값을 출력 해줌
		System.out.println("책의 이름은 : " + bookName);
		System.out.println("책의 저자는 : " + author);
	}
	
}

public class This_Method03_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("책이름을 입력 하세요");
		String a = sc.next();
		System.out.println("책의 저자를 입력 하세요");
		String b = sc.next();
		
		/*Bookk aa = new Bookk ();
		aa.print();
		
		Bookk bb = new Bookk (a);
		bb.print();
		*/
		Bookk cc = new Bookk (a, b);
		cc.print();
		
		
	}

}
