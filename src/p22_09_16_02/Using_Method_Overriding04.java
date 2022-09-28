package p22_09_16_02;

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
		System.out.println("호랑이 " + count + "마리");
	}
	
	@Override
	void run() {
		System.out.println("호랑이");
	}
	
	@Override
	void eat() {
		System.out.println("호랑이 먹이");
	}	
}

class Eagle extends Animal{
	int count;		//독수리 수
	
	Eagle (int count) {
		this.count = count;
		System.out.println("독수리 " + count + "마리");
	}
	
	@Override
	void run() {
		System.out.println("독수리");
	}
	
	@Override
	void eat() {
		System.out.println("독수리 먹이");
	}	
	
}

public class Using_Method_Overriding04 {

	public static void main(String[] args) {

		int sum = 0;
		Animal a = new Animal ();
		Animal t = new Tiger (10);	
		Animal e = new Eagle (5);
		
		Animal [] arr = new Animal[] { a, t, e};
		for (int i = 0; i < arr.length ; i++) {
			Animal aa = arr[i];
			aa.run();
			aa.eat();
			
		if ( aa instanceof Tiger) {
			Tiger t1 = (Tiger) t;
			sum += t1.count;
			
		}
		if ( aa instanceof Eagle) {
			Eagle e1 = (Eagle) e;
			sum += e1.count;
		}
	
		}	System.out.println("총 마릿 수 : " + sum);
		


 
		//For문을 사용해서 출력 eat(), run(), 동물의 총 마리 수: 00 -> total ()
		//1. For 문을 사용해서 객체를 Animal 객체로 뽑아서
		//2. 다운캐스팅 해서 자식 필드의 count 읽어서 총 더한 값을 출력
	}

}
