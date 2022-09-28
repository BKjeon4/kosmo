package SingleTon;

public class WorkB {
	DBConnect con;

	public WorkB() {
//		con = new DBConnect();
		
		con = DBConnect.getInstance();
		
	}
	
	public void use() {
		System.out.println("B 작업");
		
	}
}
