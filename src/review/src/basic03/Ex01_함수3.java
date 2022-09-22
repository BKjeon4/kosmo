package basic03;

public class Ex01_함수3 {

	public static void main(String[] args) {

		int [] result = add();
		//a 와 b 의 값을 받아서 합산한 결과를 여기서 출력
		int sum = result[0] + result[1];
		System.out.println(sum);
		
	}

	static int[] add () {
		int a = 10, b = 20;
		int [] arr = {a,b};
		
		return arr;
	}
}
