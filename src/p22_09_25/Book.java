package p22_09_25;

class Book1 {
	private String title = "홍길동전";
	private String author = "허균";
	private String publisher = "미상";
	
	
	Book1() {}
	
	Book1(String title, String author, String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}

		

	
	
	
	
	public String getTitle() {	
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
}


public class Book {


}
