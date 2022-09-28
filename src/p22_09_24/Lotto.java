package p22_09_24;




public class Lotto {

	public static void main (String[]arg) {
		
		int []arr = new int [45];
		 for(int i = 0; i <arr.length ; i++) {
			 arr[i] = i+1;
			 			
		 }//System.out.println(Arrays.toString(arr));
		 
		 //int k = 0;
		 //int tmp = 0;
		 
		 for (int i = 0; i <6 ; i++) {
			int k = (int)(Math.random()*45)+1;
			int tmp = arr[0];
			 arr[0] = arr[k];
			 arr[k] = tmp;
			 
			 System.out.print(arr[i] + " ");
		 }
		
		
	}
	
}
