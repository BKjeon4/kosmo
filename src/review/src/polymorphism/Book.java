package polymorphism;

public class Book extends Item{
	

	private String author;
	private String publisher;
	
	public Book() {
		//super.num = "하하";
		//super.title = "오에";
		//author = "ㅇ";
		//publisher = "d";
		//this("007", "제목없음","무명","출판사");
		//System.out.println("Book 기본생성자");
	}
	
	public Book (String num, String title, String author, String publisher) {
		super(num, title);
		super.num = num;
		super.title = title;
		this.author = author;
		this.publisher = publisher;
		System.out.println("Book 인자생성자");
		
		
	}
	
	public Book (String num, String title, String author) {
		super(num, title);
		super.num = num;
		super.title = title;
		this.author = author;
		this.publisher = publisher;
		System.out.println("Book 인자생성자");
		
		
	}

		
	
	public void output() {
		
		System.out.println(num);
		System.out.println(title);
		System.out.println(author);
		System.out.println(publisher);
	}
	
	public void ilove() {
		System.out.println(num+title);
	}

	
}
