package P22_09_05;

import java.util.Scanner;

public class Using_Array11 {

	public static void main(String[] args) {
		//탁구, 야구, 축구, 농구, 씨름
		// 각 운동 종목의 구성원 수의 합과 평균
		
		Scanner sc = new Scanner (System.in);
		String s;
		String []c;
		
		
		int sum = 0;
		int count = 0;
		int i;
		int n;
		
		
		do {
			System.out.println("각 운동 종목과 구성원 수를 입력하세요.");
			s=sc.nextLine();
			c=s.split(" ");
			if (s.equals("그만")) {
				break;
			}
			for (i =0 ; i < c.length; i++) {
				if(i%2!=0) {
				 n =Integer.parseInt(c[i]);
				 sum+=n;
				 count++;
				 
				}	
			}
			
			
		}
		while(true);
		
		System.out.println("종목의 갯수는 " + count);
		System.out.println("구성원 수의 합은 " + sum);
		System.out.println("구성원 수의 평균은 " + sum/(double)count);

	}

}
