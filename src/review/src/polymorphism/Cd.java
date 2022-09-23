package polymorphism;

public class Cd extends Item{
	

	private String singer;
	
	
	public Cd() {	}
	
	public Cd (String num, String title, String singer) {
		super.num = num;
		super.title = title;
		this.singer = singer;
	}
	
	public void output() {
		
		System.out.println(num);
		System.out.println(title);
		System.out.println(singer);
		
	}

}
