package basic04;

public class Student02 {

	private String hakbun;
	private String name;
	private int kor;
	private int eng;
	private int math;
	int total;
	double avg;
	
	public void calTotal () {
		total = kor + eng + math;
	}
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void calAvg () {
		avg = total /3;
	}
	public void output () {
		System.out.println(name +"님의 평균 점수 : " + avg + " 총 합 : " + total);
	}
	
}
