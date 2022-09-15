package chapter10.EX01;

//클래스 내부 구성요소 : 1.필드(field), 2.생성자(constructor), 3.메소드(method), 4.이너클래스(inner class)

//클래스 외부 구성요소 : 1.패키지(package), 2.임포트(import), 3.외부클래스(external class?)

// 상속(inheritance) : 객채지향 언어의 꽃
//		-- 부모클래스 (super class)의 필드와 메소드, 이너클래스 자식클래스로 물려준다. (생성자는 물려받지 않음)
//		-- 자식클래스 (Child class)는 부모클래스의 코드(
//		-- 중복된 코드를 방지 할수 있다.
//		-- 코드를 간경하게 사용
//		-- 유지 보수를 아주 쉽게 한다
//		-- 다형성 사용 : 부모 클래스의 메소드를 자식 클래스에서 재 정의해서 사용
//				-- 다양한 타입으로 사용이 가능하다.

// 부모 클래스(super class) : 자식 클래스의 공통적인 특징을 가지는 클래스

class Human {		//사람 : 부모 클래스 : 자식 클래스의 공통적인 필드와 메소드를 선언
	//필드
	String name;
	int age;
	
	//메소드 정의
	void eat () {
		System.out.println("모든 사람은 먹는다.");
	}
	void sleep () {
		System.out.println("모든 사람은 잠을 잔다.");		
	}
	void print() {
		System.out.println(name + ", " + age);
	}
}

// 자식 클래스 : 부모 클래스의 필드와 메소드를 그대로 상속 받는다. 
	// -- 자식 클래스만의 특징이 적용된 필드와 메소드를 선언 한다.
class Student extends Human {		//Student 클래스는 Human 클래스를 상속 받는다.
	
	// 부모클래스의 필드와 메소드가 그대로 내려온다.
	// 자식 클래스의 특징을 가진 필드와 메소드를 선언
		int studentID;				//자식 클래스에서 선언된 필드
		void goToSchool() {			//자식 클래스에서만 사용가능한 메소드
			System.out.println("학생이 학교에 갑니다.");
		}
	
}

class Worker extends Human{		//직장인
	// 부모클래스의 필드와 메소드가 그대로 내려온다.
		int workerID;
		void goToWork() {
			System.out.println("직장인이 일하러 갑니다.");
		}
	
	
}

class Professor extends Human{	//교수
	// 부모클래스의 필드와 메소드가 그대로 내려온다.
		int professorID;
		void goToCollege() {
			System.out.println("교수님은 대학에 갑니다.");
		}
}

public class Using_Inheritance01 {

	public static void main(String[] args) {
		
		//1. Human 클래스 객체 생성 (부모)
		System.out.println("== Human 객체 출력 ==");
		Human h = new Human ();
		
		h.name = "홍길동";
		h.age = 30;
		
		h.eat();
		h.sleep();
		h.print();
		
		//2. Student 클래스 객체 생성 (자식)
		System.out.println("== Student 객체 출력 ==");
		Student s = new Student ();
		
		s.name = "세종대왕";			//부모에서 상속된 필드
		s.age = 50;					//부모에서 상속된 필드
		s.studentID = 1000;			//Student 클래스에 존재하는 필드
		
		s.eat();		//부모의 메소드
		s.sleep();		//부모의 메소드
		s.print();		//부모의 메소드
		s.goToSchool();	//Student 클래스의 메소드
		
		
		//3. Worker 클래스 객체 생성 (자식)
		System.out.println("== Worker 객체 출력 ==");
		Worker w = new Worker();
		
		w.name = "신사임당";			//상속 필드
		w.age = 40;					//상속 필드
		w.workerID = 1001;			//자신의 필드
		
		w.eat();					//상속 메소드
		w.sleep();					//상속 메소드
		w.print();					//상속 메소드
		w.goToWork();				//자신의 메소드
		
		
		//4. Professor 클래스의 객체 생성 (자식)
		System.out.println("== Professor 객체 출력");
		Professor p = new Professor();
		
		p.name = "이순신";			//상속 필드
		p.age = 40;					//상속 필드
		p.professorID = 1002;		//자신의 필드
		
		p.eat();					//상속 메소드
		p.sleep();					//상속 메소드
		p.print();					//상속 메소드
		p.goToCollege();			//자신의 메소드
		
		

	}

}
