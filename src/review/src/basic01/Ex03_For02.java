package basic01;

public class Ex03_For02 {

	public static void main(String[] args) {
		
		
		
		for (int j = 0; j <26; j++) {
			for (char i= 'A'; i <= 'Z'; i++) {
				System.out.print(i + " " );
				
			}System.out.printf("(%d번) %n", j+1);
		}
		
		System.out.println();
		
		System.out.println("==== 문제 1번 ====");
		
		for (int j = 0; j <26; j++) {
			for (char i= 'A'; i <= 'A'+j ; i++) {
				System.out.print(i + " " );
				
			}System.out.println();
		}
		
		System.out.println("==== 문제 2번 =====");
		
		for (int j = 0; j < 26; j++) {
			for (char i= 'A'; i <= 'A'+j ; i++) {
				System.out.print(i + " " );
				
			}System.out.println();
		}
		
		System.out.println("==== 문제 3번 ====");
	
		for (int j = 0; j < 26; j++) {
			for (char i=(char) ('A'+ j); i <= 'Z' ; i++) {
				
				System.out.print(i + " " );
				
			}System.out.println();
		}
		
		System.out.println("==== 문제 4번 ====");
		
		for (int j = 0; j < 26; j++) {
			for (char i= 'Z'; i >= 'Z'-j ; i--) {
				System.out.print(i + " " );
				
			}System.out.println();
		}
		
		System.out.println("==== 문제 5번 ====");
		
		for (int j = 0; j < 26; j++) {
			
			for (int i2 = 0; i2 <+j; i2++) { 
				System.out.print(" ");
				
			
			}	
			for (char i1=(char) ('A'+ j); i1 <= 'Z' ; i1++) {					
			
				System.out.print( i1  );
							
			
			}	System.out.println();
			
		}


	}

}
