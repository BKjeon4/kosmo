package p22_09_25;

class Date2 {int x;}

public class 참조형_매개변수 {

	public static void main(String[] args) {
		Date2 d = new Date2 ();
		d.x = 10;
		System.out.println("main() :x =  " + d.x);
		
		change(d);
		System.out.println("after change main () :x = " + d.x);
	}
	
	
	static void change(Date2 d) {
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}

}
