package p22_09_24;

class MyMath{
//	long max(long a, long b) {
//		long result = 0;
//		if (a>b) {
//			result = a;
//		}else {
//			result = b;
//		}return result;
//	}
	void print (int a) {
		if (!(2<=a && a <= 9)) 
			return;					//입력받은 단 (a)이 2~9가 아니면 메서드 종료하고 돌아가기
		
		for (int i =1 ; i<=9; i++) {
			 System.out.printf("%d * %d = %d %n", a, i, a*i);
		}
	}
	
	
	long max(long a, long b) {
		long result = 0;
		result = a >b ? a: b;
		return result;
	}
	
	long add (long a, long b) {
		
		long result = a + b;
		return result;
	}
	
	long subtract (long a, long b) {
		long result = a + b;
		return result;
	}
	
	long multiply (long a, long b) { return a*b;}
	
	double divide(double a, double b) {
		double result = a /b;
		return result;
	}
	
}


public class Math {

	public static void main(String[] args) {

		MyMath aa = new MyMath();
		
		long result1= aa.add(5, 3);
		
		System.out.println(result1);
		
		long result = aa.max(5, 3);
		
		System.out.println(result);
		
		
		aa.print(2);
		
		
			
		
		
		
	}

}
