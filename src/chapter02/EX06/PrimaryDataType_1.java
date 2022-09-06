package chapter02.EX06;

public class PrimaryDataType_1 {

	public static void main(String[] args) {
		
		// byte < short < int < long < float < double
		
		// 업캐스팅 : 자동으로 적용, 작은데이터 타입에서 큰 데이터 타입으로 변환
		// 다운캐스팅 : 수동으로 적용해야 함, 큰데이터 타입에서 작은 데이터 타입으로 변환
		
		//자바에서 = 왼쪽과 오른쪽은 반드시 데이터타입이 같아야 함
			//byte, short는 예외로 적용됨
		
		int a = 10;
		float b = 10.11F;
		
		float c = a + b;		// 정수 a는 자동으로 float으로 업캐스팅 됨
		System.out.println(c);
		
		//int d = a + b;			// 오류 발생
		int d = a + (int)b;			// float b 를 int b 로 다운캐스팅
		System.out.println(d);
		
		
		
		//boolean : true / false
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1);
		System.out.println(bool2);

		//정수 : byte, short, int, long
		//기본값은 int (integral 정수)값으로 정의
		
		
		
		byte value1 = 10;
		short value2 = -10;
		int value3 = 100;
		long value4 = -100L;	// int 값이 Long 데이터 타입으로 업캐스팅 되어서 들어감 <<< 만약 L 을 안붙이면 어떻게 되는거지?
		
		
	}

}
