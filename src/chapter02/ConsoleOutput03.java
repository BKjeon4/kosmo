package chapter02;

public class ConsoleOutput03 {
	public static void main(String[] args) {
		//# System.out.println();
		System.out.println("안녕 하세요");
		System.out.println("안녕" + "하세요"); // + : 문자열을 <연결 연산자>
		System.out.println(2 + 4);  // + : 정수일때는 <더하기>
		System.out.println(2 + "4");  // 정수 + 문자열 : <연결>
		System.out.println("문자" + 1);  //<연결>
		System.out.println("문자" + 1 + 3); //<연결>
		System.out.println(1 + 3 + "문자");  //4문자
		System.out.println();
		
		int a = 5 ;			// int = 자료형, a = 변수, 프로그램에서 "="은 오른 쪽에 있는 것을 왼쪽에 할당하라 라는 뜻, == 가 같다 라는 뜻
		String b= "하세요";
		int c =7;
		System.out.println(a);
		System.out.println(b);
		System.out.println("안녕" + b);
		System.out.println(a + b);		// + : 연결
		System.out.println(a + c);		// + : 덧셈
		System.out.println(a + "안녕" + b);
		
			
		//# System.out.print();
		
		System.out.print("반갑");
		System.out.print("습니다");
		System.out.print(7);
		
		System.out.print("\n");
		System.out.print("\n");
		
		
		//# System.out.printf();
		
		int d = 45;
		String e = "화요일";
		String f = "남자";
		
		System.out.println("당신의 나이는 " + d + "살이고, 오늘은 " + e + "이고, 당신은 " + f + "입니다.");
		System.out.printf("당신의 나이는 %d살이고, 오늘은 %s이고, 당신은 %s입니다.", d, e, f);
		
		System.out.println();
		System.out.println();
		
		int g = 100;
		String h = "일요일";
		String i = "여자";
		
		//여자는 평균 나이가 100살이 될 것 입니다. 평균적으로 일요일에 많이 태어났습니다.
		
		System.out.println(i+"는 평균 나이가 " +g+"살이 될 것 입니다. 평균적으로 " +h+"에 많이 태어 났습니다.") ;
		System.out.printf("%s는 평균 나이가 %d살이 될 것 입니다. 평균적으로 %s에 많이 태어 났습니다.", i, g, h);
		
			
				
		
		
		
	}

}
