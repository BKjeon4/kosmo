package SingleTon;

public class MainTest {

	public static void main(String[] args) {

		WorkA a = new WorkA();
		a.use();
		
		WorkB b = new WorkB();
		b.use();
		
		WorkC c = new WorkC();
		c.use();
		
		
	}

}
