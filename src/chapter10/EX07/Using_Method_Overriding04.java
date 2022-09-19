package chapter10.EX07;

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
	int count;		//호랑이 수
	
	Tiger (int count) {
		this.count = count;
	}
	
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
	int count;		//독수리 수
	
	Eagle (int count) {
		this.count = count;
	}
	
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
	int count;		//물고기 수
	
	Fish (int count) {
		this.count = count;
	}
	
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
	int count;		//개 수
	
	Dog (int count) {
		this.count = count;
	}
	
	@Override
	void run() {
		System.out.println("개는 뜁니다.");
	}
	@Override
	void eat() {
		System.out.println("개는 사료를 먹습니다.");
	}
	
}

public class Using_Method_Overriding04 {

	public static void main(String[] args) {
		//1. 객체생성
		// 1. 객체 생성 (Animal 타입으로 생성)
			//생성자를 통해서 각각의 필드에 값을 할당
		Animal a = new Animal ();
		Animal t = new Tiger (10);	
		Animal e = new Eagle (5);	
		Animal f = new Fish (50);		
		Animal d = new Dog (70);		
		
		System.out.println("=================================");
		//객체를 배열에 저장
		
		
		Animal [] arr = new Animal [] {a, t, e, f, d};
		
		//For문을 사용해서 출력 eat(), run(), 동물의 총 마리 수: 00 -> total ()
		//1. For 문을 사용해서 객체를 Animal 객체로 뽑아서
		//2. 다운캐스팅 해서 자식 필드의 count 읽어서 총 더한 값을 출력
		
		//동물의 총 합을 구하는 변수 선언		
		int sum = 0;
		
		for (int i = 0; i < arr.length ; i++) {
			Animal aa = arr[i];
			aa.eat();				//Animal의 eat() 메소드 : 오버라이딩 된 메소드 출력
			aa.run();				//Animal의 run() 메소드 : 오버라이딩 된 메소드 출력
			
		/*	arr[i].eat();
			arr[i].run(); */
			
			
			
			if(aa instanceof Tiger) {
				Tiger t1 = (Tiger)  aa;
				sum +=t1.count;
							
			}
			if(aa instanceof Eagle) {
				Eagle e1 = (Eagle)  aa;
				sum +=e1.count;
							
			}
			if(aa instanceof Fish) {
				Fish f1 = (Fish)  aa;
				sum +=f1.count;
							
			}
			if(aa instanceof Dog) {
				Dog d1 = (Dog)  aa;
				sum +=d1.count;
							
			}
			
		}System.out.println("================");
		System.out.println("총 마리수 = " + sum);
		 
			
		
		
		

			

	}

}
