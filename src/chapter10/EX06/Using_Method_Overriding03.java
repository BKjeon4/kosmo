package chapter10.EX06;

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
		System.out.println("호랑이는 뜁니다.");
	}
	
	@Override
	void eat() {
		System.out.println("호랑이는 다른 동물을 잡아 먹습니다.");
	}
}

class Eagle extends Animal{
	@Override
	void run() {
		System.out.println("독수리는 하늘을 납니다.");
	}
	@Override
	void eat() {
		System.out.println("독수리는 사체를 먹습니다.");
	}
}
class Fish extends Animal{
	@Override
	void run() {
		System.out.println("물고기는 헤업칩니다.");
	}
	@Override
	void eat() {
		System.out.println("물고기는 플랑크톤을 먹습니다.");
	}
	
}
class Dog extends Animal{
	@Override
	void run() {
		System.out.println("개는 뜁니다.");
	}
	@Override
	void eat() {
		System.out.println("개는 사료를 먹습니다.");
	}
	
}
public class Using_Method_Overriding03 {

	public static void main(String[] args) {
		
		Animal a = new Animal ();
		Animal t = new Tiger ();
		Animal e = new Eagle ();
		Animal f = new Fish ();
		Animal d = new Dog ();
		
		a.eat();
		a.run();
		t.eat();
		t.run();
		e.eat();
		e.run();
		f.eat();
		f.run();
		d.eat();
		d.run();
		
		System.err.println();
		System.out.println("== For문 사용 ==");
		
		Animal [] arr1 = new Animal[5];
		Animal [] arr2 = new Animal[] {a, t,e,f,d};
		for (int i = 0; i < arr2.length; i++) {
			arr2[i].eat();
			arr2[i].run();
		}
		System.out.println();
		System.out.println("== Enhanced For 문 사용 ==");
		arr1[0] = a;
		arr1[1] = t;
		arr1[2] = e;
		arr1[3] = f;
		arr1[4] = d;
		
		for (Animal k : arr1) {
			k.eat();
			k.run();
		}

	}

}
