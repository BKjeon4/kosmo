package basic04;

public class MainTest {

	public static void main(String[] args) {

		// 값지정 1 - setter
		Student s11 = new Student();
		
//		s.setName("홍길동");
//		s.setKor(100);
//		s.setEng(30);
//		s.setMath(55);
//		
//		// 값지정 2 = 생성자 (constructor)
		Student s = new Student("홍길자", 99, 88, 66);
		
		s.calTotal();
		s.calAvg();
		//s.total();
		s.output();
		
		
		Student02 s1 = new Student02();
		
		s1.setName("전병욱");
		s1.setKor(100);
		s1.setEng(40);
		s1.setMath(50);
		s1.calTotal();
		s1.calAvg();
		s1.output();
		
	}

}
