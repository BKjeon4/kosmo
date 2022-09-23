package polymorphism;

public class Dvd extends Item{
	

	private String actor;
	private String director;
	
	public Dvd() {	}
	
	public Dvd(String num, String title, String author, String publisher) {
		super.num = num;
		super.title = title;
		this.actor = actor;
		this.director = director;
	}
	
	public void output() {
		
		System.out.println(num);
		System.out.println(title);
		System.out.println(actor);
		System.out.println(director);
		
	}

}
