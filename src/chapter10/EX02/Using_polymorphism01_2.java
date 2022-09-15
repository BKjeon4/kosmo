package chapter10.EX02;

import chapter10.EX02.Animal;

class Animal {
	String name = "동물";
	
}

class Person extends Animal{
	String personName = "사람";
}
class Person_Person extends Person {
	String pName = "사람_사람";
	
}
public class Using_polymorphism01_2 {

	public static void main(String[] args) {
		//1. Animal 객체 생성
			// Animal 객체는 Animal 타입만 내포
		Animal a1 = new Animal();
		System.out.println(a1.name);
		
		//2. Person 객체 Animal 타입 생성
			// a2는 Animal, Person 타입을 내포하고 있고, Animal 타입으로 지정
			// Animal 타입의 필드, 메소드만 접근가능, Person타입으로 다운 캐스팅
		Animal a2 = new Person();
		System.out.println(a2.name);
		
			// a2는 Person 타입으로 다운캐스팅 (Animal, Person 필드, 메소드 모두 접근)
		Person p1 = (Person)a2;
		System.out.println(p1.name);
		System.out.println(p1.personName);

		//3. Person 객체를 Person 타입으로 생성
		Person p2 = new Person();
		System.out.println(p2.name);
		System.out.println(p2.personName);
			//업캐스팅
		Animal a3 = p2;		//a3는 Animal, Person 을 내포하고 있고, Animal 타입으로 지정
		System.out.println(a3.name);
			//다운캐스팅
		Person p3 = (Person) a3;	//p3는 Animal, Person 을 내포하고 있고, Person 타입으로 지정
		System.out.println(p3.name);
		System.out.println(p3.personName);
		
		
		//4. Person_Person 객체를 Animal 타입으로 생성
			// a4는 Animal, Person, Person_Person 타입을 내포하고 있고, Animal 타입으로 지정
			// Animal 타입의 필드와 메소드만 접근
		Animal a4 = new Person_Person();
		System.out.println(a4.name);
		
			//다운캐스팅
		Person_Person pp1 = (Person_Person) a4;
		System.out.println(pp1.name);
		System.out.println(pp1.personName);
		System.out.println(pp1.pName);
		
		//5. Person_Person 객체를 Person_Person 타입으로 생성
			//pp2는 Animal, Person
		Person_Person pp2 = new Person_Person();
		System.out.println(pp2.name);
		System.out.println(pp2.personName);
		System.out.println(pp2.pName);
		
			//업캐스팅
		Person p4 = pp2;
		System.out.println(p4.name);
		System.out.println(p4.personName);
			//업캐스팅
		Animal a5 = p4;
		System.out.println(a5.name);
		
			//다운캐스팅
		Person p5 = (Person)a5;
		System.out.println(p5.name);
		System.out.println(p5.personName);
			//다운캐스팅
		Person_Person pp3 = (Person_Person) p5;
		System.out.println(pp3.name);
		System.out.println(pp3.personName);
		System.out.println(pp3.pName);
		
		
		
		
		
		
	}

}
