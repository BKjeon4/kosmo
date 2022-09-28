package p22_09_06;

import java.util.Arrays;

public class Using_Array_2D_02 {

	public static void main(String[] args) {
		String [][] arr = new String [][] {{"김재동", "김제동", "김쟤동"},{"오경호", "요경호", "유경호"}, {"전병욱", "전뵹욱", "전븅욱"}, 
			{"임유빈", "임요빈", "임야빈"}};
		
		//출력  : 1조  : 김재동 김제동 김쟤동
			//2조 : 오경호 요경호 유경호
			//3조 : 전병욱 전뵹욱 전븅욱
			//4조 : 임유빈 임요빈 임야빈
			
			System.out.println("===== For 문 =====");
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				if (i==0) {
					System.out.printf("%d 조 : ", count+1);
					count++;
				}
				if (i==1) {
					System.out.printf("%d 조 : ", count+1);
					count++;
				}
				if (i==2) {
					System.out.printf("%d 조 : ", count+1);
					count++;
				}
				if (i==3) {
					System.out.printf("%d 조 : ", count+1);
					count++;
				}
				for(int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				}System.out.println();
			}
			System.out.println();
			System.out.println("=== Enhanced For 문 ===");
			
			for (String []a : arr) {
				
					for (String b : a) {	
						if (b.equals("김재동")) {System.out.print("1 조 : ");}
						if (b.equals("오경호")) {System.out.print("2 조 : ");}	
						if (b.equals("전병욱")) {System.out.print("3 조 : ");}
						if (b.equals("임유빈")) {System.out.print("4 조 : ");}
						System.out.print(b + " ");
					}System.out.println();
			}
			
			System.out.println();
			System.out.println("== Arrays.toString ==");
			
			for (int i =0; i < arr.length; i++) {
				if (i==0) {
					System.out.print(" 1 조 : ");
					
				}
				if (i==1) {
					System.out.printf(" 2 조 : ");
					
				}
				if (i==2) {
					System.out.printf(" 3 조 : ");
					
				}
				if (i==3) {
					System.out.printf(" 4 조 : ");
					
				}
				
				System.out.print(Arrays.toString(arr[i]));
			}

	}

}
