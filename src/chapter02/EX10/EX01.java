package chapter02.EX10;

public class EX01 {

	public static void main(String[] args) {
		
		//각 변수의 평균 값을 계산 하시오.
		
		int aa = 80;
		int bb = 90;
		int cc = 100;
		double dd = 75.5;
		double ee = 60.3;
		
		int ave = (aa + bb + cc)/3;
		double aver = (dd + ee)/2;
		
		int average = (int)(aa + bb + cc + dd + ee)/5;
		double average2 = (double)(aa + bb + cc + dd + ee)/5.0;
		
		System.out.println("각 과목의 평균 값은 :" + ave );
		System.out.printf("각 과목의 평균 값은 :%4.2f \n", aver);
		System.out.println("각 과목의 평균 값은 :" + average + " 이다.");
		System.out.printf("각 과목의 평균 값은 :%4.2f 이다.", average2);
	}

}
