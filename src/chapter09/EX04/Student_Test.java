package chapter09.EX04;

class Student {
	
	static int serialNum = 1000;	//모든 객체에서 공유하는 필드, 객체를 생성할 때마다 1씩 증가
	int studentID;		//학생 고유ID
	String studentName;			//학생 이름
	int grade;					//학년	: 기본값으로 "4"학년
	String address ;			//주소	: 기본값으로 "서울"
	
	Student () {
		grade = 4;
		address = "서울";
		serialNum++;
		studentID = serialNum;
		
	}
	Student (String studentName) {
		this();
		this.studentName=studentName;
		
		
	}

	
	void print () {
		System.out.printf("학생 이름 : %S, 학번 : %d, 학년 : %d학년, 주소 : %S %n", studentName, studentID, grade, address);
	}
}

public class Student_Test {

	public static void main(String[] args) {
		//객체를 생성할 때 자동으로 학번이 1000번 부터 1씩 자동으로 증가되도록
		//studentID : 1000번 부터 학생 객체를 생성할때마다 고유한 값으로 적용 되어 있어야 한다.

		Student lee = new Student ("이지원");		//1001
		System.out.println("==1번째 학생==");
		lee.print();				
		
				
		Student hong = new Student ("홍지원");	//1002
		System.out.println("==2번째 학생==");
		hong.print();		
		
		Student jung = new Student ("정지원");	//1003
		System.out.println("==3번째 학생==");
		jung.print();		
		
		Student park = new Student ("박지원");	//1004
		System.out.println("==4번째 학생==");
		park.print();
		

	}

}
