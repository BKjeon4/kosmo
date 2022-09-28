package accother;

public class Access {
	//private : 그 클래스 안에서 접근가능
	//pubilc : 모든 접근 허용
	//(default) : 해당 패키지에서만 접근 허용
	//protected : 해당 패키지와 다른 패키지인 경우는 자식 클래스에만 허용
	
	private String a = "프라이빗 데이타";
	public String b= "퍼블릭 데이타";
	protected String c = "프로텍티드 데이타";
			String d = "디폴트 데이타";
			
	
			
			
	public void output () {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
	}
	

}
