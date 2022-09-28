package p22_09_24;

public class Lotto2 {
	
	//for 을 쓰지않고, 배열을 쓰는 이유는, 중복값이 나올 수 있기 때문

	public static void main(String[] args) {
		
		for (int i=0; i <6; i++) {
			int num = (int)(Math.random()*45)+1;
			System.out.print(num + " ");
		}

	}

}
