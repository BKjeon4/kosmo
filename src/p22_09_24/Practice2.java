package p22_09_24;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Practice2 {

	public static void main(String[] args) {

		Student s = new Student ("홍길동", 1, 1, 100, 60, 76);
		
		String str = s.info();
		System.out.println(str);
		
	}

}

class Student {
	
	String name;//이름
	int ban;	//반
	int no;		//번호
	int kor;	//국어
	int eng;	//영어
	int math;	//수학
	
	int sum = 0;
	double avg = 0;
	
	Student () {}
	
	Student (String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
				
	}
	
	String info () {
		sum = kor + eng + math;
		avg = sum / (float)3.0;
		System.out.printf("%s, %d, %d %d %d %d %d %4.1f",name, ban, no, kor, eng, math, sum, avg);
		
		return "";
	
	}
	
	
}
