package final1;

class Parent {
	final String field = "부모님꺼";
	final public void home() {
		System.out.println("부모님이 만드신거");
	}
}

class Child extends Parent{
	Child() {
		//field = "내꺼";
	}
//	public void home() {
//		System.out.println("내가 탕진함");
//	}
}

public class Test {

	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.field);
		p.home();

	}

}
