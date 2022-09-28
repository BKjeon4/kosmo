package p22_09_24;

class Class1 {
	int hour1, hour2, hour3;

	int minute1, minute2, minute3;

	int second1, second2, second3;
	
	
	
}

class Class2 {
	int[] hour = new int[3];
		
	int[] minute = new int[3];
	int[] second = new int[3];
}
	//왜 class로 만드는건 되는데, public class 로 넣으면 안됨????
	


public class Time질문필요 {
	
	public static void main (String[]args) {
		
		Class1 a = new Class1();
		
		System.out.println(a.hour1);
		System.out.println(a.hour2);
		System.out.println(a.minute1);
		
		Class2 b = new Class2();
		
		System.out.println(b.hour[1]);
		System.out.println(b.minute[0]);
		
		
		
		
		Time1 aa = new Time1();
		
		aa.setHour(26);
		System.out.println(aa.getHour());
		
		aa.setHour(4);
		System.out.println(aa.getHour());
		
	}

}
