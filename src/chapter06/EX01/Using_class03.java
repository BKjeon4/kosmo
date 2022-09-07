package chapter06.EX01;

//같은 패키지 내에서 클래스 이름은 중복 되면 오류가 발생
class C{
	
	//필드 : heap 영역에 값이 저장, 값을 넣지 않으면 강제초기화
	int a ;			//0
	int b ;
	String name;	///null
	
	C () {}		// 기본생성자 : 매개변수 값이 없고, 실행부도 없는 생성자, 생량가능
	
	void call () {
		int c;		//지역 변수 : Stack, 강제 초기화가 안되므로 반드시 기본값을 넣고 출력
		System.out.println("출력 내용 입니다.");
		
		
		//System.out.println(c);		// 초기 값을 할당해야 함
		System.out.println(a);
		System.out.println(b);
		System.out.println(name);
		
	}
	
}


public class Using_class03 {

	public static void main(String[] args) {
		//
		C c = new C();
		
		c.call();

	}

}
