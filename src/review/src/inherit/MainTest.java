package inherit;

public class MainTest {

	public static void main(String[] args) {

		//Mother u = new Mother();
		//u.job();
		//u.gene();
		
		//Daughter d = new Daughter();
		//d.study();
		//d.job();
		//d.gene();
		
		//Daughter d = new Mother();
		
		// *부모변수에 자식객체 생성이 가능
		Mother u = new Daughter ();
		u.gene();
		u.job();
		
		// * 형변환 : (casting)
		// 1) 기본형끼리
		// 2) 참조형에서 상속관계있는 경우만 가능
		
		// String s = new String ("~~");
		// StringBuffer sb = (StringBuffer)s; --> 안됨
		
		//Mother u = new Mother();			//설명필요!!
		//Daughter d = (Daughter)u;
		
		//Daughter d = new Daughter();
		//Mother u = (Mother)d;				//up casting
		//Daughter d2 = (Daughter)u;			//down casting
		
		
	}

}
