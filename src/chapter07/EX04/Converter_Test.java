package chapter07.EX04;

import java.util.Scanner;

class Converter {		//환율을 계산하는 클래스
	//1. 필드
	double rate ;		//환율을 저장하는 변수 : 1원 = $1377.50
	

	//2. 메소드 생성 (달러를 인풋 받아서 원화로 변환하는 메소드), 메소드 이름 : toKWR()
	
	double toKWR (double dollar) {
		
		return dollar * rate;
	}
	
	
	//3. 메소드 생성 (원화를 인풋 받아서 달러로 변환하는 메소드), 메소드 이름 : toDollar() $1377.50
	
	double toDollar(double won) {
		
		return won / rate;
	}


	//4. setRate() 메소드 생성 : setter를 사용해서 rate 필드의 값을 할당
	
	void setRate(double rate) {
		this.rate = rate;
	}
	
	
}

public class Converter_Test {

	public static void main(String[] args) {
		// 네이버 검색해서 오늘 환율 알아오기
		// 객체 생성 후 스캐너로 환율을 인풋 받아서 setrate() 메소드에 저장 후 
		// 원화 100만원 -->> 몇 $ 인출
		// 달러 $100 -> 몇 만원인지 출력
		
		
		
		System.out.println("1달러에 대한 오늘 환율을 입력 하세요.");
		
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		
		//객체 생성
		Converter exchage = new Converter();
		
		//스캐너로 받은 rate 변수의 값을 setter 주입
		exchage.setRate(a);
		
		
		//100만원 --> 몇 $
		
		System.out.println("원화 100만원" + exchage.toDollar(1000000) + "$ 입니다.");
		
		//$100 ->> 몇 만원
		
		System.out.println("$100는" + exchage.toKWR(100) + "원 입니다. ");
		
		//1. printf() 를 사용해서 출력
		System.out.println("== 소수점 2째 자리까지 잘라서 출력 (printf() ==");
		
		System.out.printf("원화 100만원은 %.2f $입니다.", exchage.toDollar(1000000));
		System.out.println();
		System.out.printf("$100는 %.2f 원 입니다.", exchage.toKWR(100));
		
		//2. 변수에 더블 값을 할당 후 소숫점 2자리 까지 변환해서 출력
		System.out.println();
		System.out.println("====== 예시 =======");
		double per2 = 3.141592;
				// String 으로 변환 후 per2 의 변수 값을 소숫점 2자리까지 출력 후 다시 더블형으로 변환
		double per1 = Double.parseDouble(String.format("%10.2f", per2));
		System.out.println(per1);
		
		System.out.println("===실수를 변수에 할당 후 소숫점 2자리까지 자른 후 다시 더블에 지정===");
		double d2 = exchage.toDollar(1000000);
		double d1 = Double.parseDouble(String.format("%.2f", d2));
		System.out.println("원화 100만원은 $" + d1 + " 입니다. ");
		
		double d4 = exchage.toDollar(1000000);
		double d3 = Double.parseDouble(String.format("%2f", d4));
		System.out.println("$100는 " + d3 + " 만원 입니다. ");
		
		
		
	}

}
