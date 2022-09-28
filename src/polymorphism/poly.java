package polymorphism;

import java.util.Scanner;

public class poly {

	public static void main(String[] args) {

		Item i = null;
		
		System.out.println("1. 책, 2. cd, 3.dvd");
		
		Scanner sc = new Scanner (System.in);
		
		int a = sc.nextInt();
		
		
		switch(a) {
		case 1: i = new Book ("6","5","5","4"); 
		break;
		
		case 2: i = new Cd ("5", "6","7");
		break;
		
		case 3: i = new Dvd ("11","12","13","14");
		break;
		}
		
		i.output();
		
		sc.close();

	}

}
