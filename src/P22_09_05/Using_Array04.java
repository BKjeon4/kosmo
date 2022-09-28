package P22_09_05;

public class Using_Array04 {

	public static void main(String[] args) {
		//배열 (Array) : 하나의 (배열) 변수에 여러개의 값을 넣는다.
				//	 - 참조 자료형 : 변수는 stack에 저장, 값은 heap에 저장
				//		변수의 heap 영역의 주소값이 들어있다.
				//	 - 기본 자료형 : 변수, 값 모두 stack에 저장되어 있다.
				//		boolean, byte, short, int, long, float, double, char
				//	기본 자료형 배열 변수 :
				//	참조 자료형 배열 변수 : String
				
				// 1. 동일한 자료형의 값을 담고 있다.
				// 2. 방의 갯수를 변경할 수 없다. (정적)
				
					//heap 공간에는 반드시 값이 들어가 있어야 한다.
					//		- 초기값을 넣지 않는 경우 JVM이 자동으로 넣는다.
					//		-- 정수 : 0, 실수 : 0.0, boolean : false, 
					//		-- 참조 자료형일 경우 : null <-- 비어 있는 상태 ( 0이 아님 )
				
				// 1. 배열 선언과 초기화
			
		int []a = new int [5];
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j < 5 ; j++) {
				a[i] =j;
				
				System.out.println(a[i]);
			}
			break;
			
		}
		
			


	}

}
