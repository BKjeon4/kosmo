package p22_09_06;

public class Using_Array_2D_02_2 {

	public static void main(String[] args) {
		
		String [][] arr = new String [][] {{"김재동", "김제동", "김쟤동"},{"오경호", "요경호", "유경호"}, {"전병욱", "전뵹욱", "전븅욱"}, 
			{"임유빈", "임요빈", "임야빈"}};
		
		//출력  : 1조  : 김재동 김제동 김쟤동
			//2조 : 오경호 요경호 유경호
			//3조 : 전병욱 전뵹욱 전븅욱
			//4조 : 임유빈 임요빈 임야빈
			
			String [] s = new String [] {"1 조 : ", "2 조 : ", "3 조 : ", "4 조 : "};
			System.out.println("=== For 문 ====");
			for (int i=0; i < arr.length; i++) {
				System.out.print(s[i]);
				
			
				for (int j =0 ; j< arr[i].length ; j++) {
				System.out.print(arr[i][j] + " ");
				}System.out.println();
			}
			
			
			
			System.out.println();
			System.out.println("=======Enhanced For 문 =========");
			
			int c = 0;
			for (String []a : arr) {
				System.out.print(s[c]);
				c++;
				for (String b : a) {
					System.out.print(b + " ");
				}System.out.println();
			}
	}

}
