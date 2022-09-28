package p22_09_08;

public class Using_method06 {

	static int add(int[] a) {
		// 들어온 배열의 모든 값을 더해서 더한 값을 리턴
		int sum = 0; // 각 배열의 방의 값을 가져와서 더해서 저장

		for (int i = 0; i < a.length; i++) {
			sum += a[i]; // sum = sum+a[i]
		}
		return sum;
	}

	static int div(int[] a) {
		// 들어온 배열의 모든 값을 뺀값을 리턴
		int div = 7;
		for (int i = 0; i < a.length; i++) {
			if (i == 0) {
				continue;
			} // i==0일때는 아래 내용 실행하지 않고 계속해라 i가 0이 아닐 경우 아래 내용 적용
			div -= a[i]; // div = div-a[i]
		}
		return div;
	}

	static long mul(int[] a) {
		// 들어온 배열의 모든 값을 곱한 값을 리턴
		long mul = 1; // 곱할때는 초기값을 1로 설정
		for (int i = 0; i < a.length; i++) {
			mul *= a[i]; // mul=mul*a[i]
		}
		return mul;
	}

	static double avg(int[] a) {
		// 들어온 배열의 모든 값의 평균 값을 리턴

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		double avg = sum / (double) a.length; // a.length를 double를 두지 않으면 52.0값 출력
		return avg;
	}

	public static void main(String[] args) {
		// 1~100까지 7의 배수만 저장후 각 메소드 호출
		int[] arr1 = new int[100 / 7]; // 배열의 방의 갯수 지정
		for (int i = 0, j = 7; i < arr1.length; i++, j += 7) {
			arr1[i] = j;
		}

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.println("=================================s");

		// 메소드 호출 : add(arr1)
		int sum = add(arr1);
		System.out.println("더한 값 : " + sum);

		// 메소드 호출 : div(arr1)
		int div = div(arr1); // 변수명과 메소드 명은 같아도 사용법이 다르기 때문에 괜찮음
		System.out.println("뺀 값 : " + div);

		// 메소드 호출 : mul(arr1) int 범위 넘는다 → long
		long mul = mul(arr1);
		System.out.println("곱한 값 : " + mul);
		// int : 1760012288
		// long : 4513787149822699520

		// 메소드 호출 : avg(arr1)
		double avg = avg(arr1);
		System.out.println("평균 값 : " + avg);

	}

}
