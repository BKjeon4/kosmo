package SingleTon;

public class WorkC {
	DBConnect con;

	public WorkC() {
		//con = new DBConnect();
		
		// A a = new A();
		
		con = DBConnect.getInstance();
		
	}
	
	public void use() {
		System.out.println("C 작업");
	}
}
