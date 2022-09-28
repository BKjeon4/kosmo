package polymorphism;

abstract public class Item {
	
	protected String num;
	protected String title;

	public Item () {}
	
	public Item (String num, String title) {
		this.num =num;
		this.title =title;
	}
	
	
	
	
	abstract public void output();
	
		

	

}
