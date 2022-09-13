package chapter07.EX04;

class Car {
	
	//1. 필드
	String company; 	// 제조회사
	String model;		// 모델
	String color;		// 색깔
	double maxSpeed;	// 최대출력
	
	//2. 생성자
	Car () {}
	
	Car (String company, String model, String color, double maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
	}
	
	//3. 메소드 (show (): 필드의 값을 출력)
	void show () {
		System.out.println(company + ", " + model +", " + color + ", " + maxSpeed + " km/h" );
	}


	
	//4. 메소드 (getter / setter)
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
	
}

public class Car_Test {

	public static void main(String[] args) {
		// 객체 생성
		// car1		현재자동차 그랜져 <-- 필드값 직접 입력
		// car2		쌍용자동차 체어맨 <-- 생성자를 통해서 값 입력 / show() 값 출력
		// car3		기아자동차 k9	  <-- setter를 통해서 값 입력 / getter를 통해서 값 출력
		
		
		System.out.println("==car 1==");
		Car car1 = new Car ();
		
		car1.company = "Hyundai";
		car1.model = "Grandeur";
		car1.color = "White";
		car1.maxSpeed = 220.6;
		
		System.out.print(car1.company + ", ");
		System.out.print(car1.model+ ", ");
		System.out.print(car1.color+ ", ");
		System.out.println(car1.maxSpeed + " km/h");
		
		System.out.println("==car 2==");
		Car car2 = new Car ("Ssangyong", "Chairman", "Black", 200);
		
		car2.show();
		
		System.out.println("==car 3==");
		Car car3 = new Car ();
		
		car3.setCompany("Kia");
		car3.setModel("K9");
		car3.setColor("Grey");
		car3.setMaxSpeed(180.4);
		
		System.out.print(car3.getCompany() + ", ");
		System.out.print(car3.getModel()+ ", ");
		System.out.print(car3.getColor()+ ", ");
		System.out.println(car3.getMaxSpeed()+ " km/h");
		

	}

}
