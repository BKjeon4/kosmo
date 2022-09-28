package p22_09_24;


public class Method {
	
	

	
	
	void output(int [] arr) {
	for (int i = 0; i <10; i ++) {
		System.out.printf("%d", arr[i]);
		System.out.println();
	}
	}
	
	public static void main(String[] args) {
		
		int [] arr = new int[10];

		for (int i = 0; i< 10 ; i ++) {
			arr[i] = (int)(Math.random()*10)+1;
		}
		
	

//		void print(int [] arr) {
//		for (int i = 0; i <10; i ++) {
//			System.out.printf("%d", arr[i]);
//			System.out.println();
//		}
//		}
		

//		static void printarr(int[]arr) {
//			
//			for (int i = 0; i <10; i ++) {
//				System.out.printf("%d", arr[i]);
//				System.out.println();
//			}
//		}
		

		
	}

}
