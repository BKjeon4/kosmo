package p22_09_04;

public class Using_For01 {

	public static void main(String[] args) {
		//for 문과 if 문을 사용해서 1~10까지 더한 값을 출력 하되 아래와 같이 출력하세요.
		// 결과 : 1+2+3+4+5+6+7+8+9+10 = 55
		
		int i;
		int sum = 0;
		
		for (i = 1 ; i <= 10 ; i++) {
			System.out.print(i);
			if (i <10) {
				System.out.print("+");
			}sum+=i;
		} System.out.print("=" + sum);
		
		
		
	}

}
