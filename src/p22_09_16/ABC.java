package p22_09_16;




class Animal {	
	//자식 클래스에서 2개의 메소드를 오버라이딩 
	// Animal 타입으로 정의, 배열에 저장 후, 오버라이딩 된 메소드 출력 (For, Enhanced For)
	
	void run() {
		System.out.println("모든 동물은 달립니다.");
	}
	void eat() {
		System.out.println("모든 동물은 먹습니다.");
	}
}	
class Tiger extends Animal{
	@Override
	void run() {
		System.out.println("뛰어다님");
	}
	@Override
	void eat() {
		System.out.println("고기");
	}
	
}
class Eagle extends Animal {
	@Override
	void run() {
		System.out.println("날라다님");
	}
	@Override
	void eat() {
		System.out.println("사체");
	}
}
class Fish extends Animal{
	@Override
	void run() {
		System.out.println("헤엄침");
	}
	@Override
	void eat() {
		System.out.println("플랑크톤");
	}
}
class Dog extends Animal{
	@Override
	void run() {
		System.out.println("뛰어다님");
	}
	@Override
	void eat() {
		System.out.println("사료");
	}
}
public class ABC {	
	public static void main(String[] args) {
		Animal a = new Animal ();
		Animal t = new Tiger ();
		Animal e = new Eagle ();
		Animal f = new Fish ();
		Animal d = new Dog ();
	
		
		Animal []arr = new Animal[] {a,t,e,f,d};
		//For문
		for (int i = 0; i < arr.length ; i++) {
			arr[i].run();
			arr[i].eat();
		}

		
		//Enhanced For 문
		
		for (Animal K : arr) {
			K.run();
			K.eat();
		}
		
	}	
}
	