package chapter03.EX05;

public class LogicalOperator {

	public static void main(String[] args) {
		// 논리 연산자 (&& <--AND, || <-- OR, ^ <-- XOR, ! <--NOT) (Logical Operator)
		// 	-- 연산자 좌측과 우측에는 true, false
		
		// AND 연산 : &&		<-- 좌우 모두 true 일 때 true
		System.out.println(true && true);		//true
		System.out.println(true && false);		//false
		System.out.println(true && (5<3));		//false
		System.out.println((5<=5) && (7>2));	//true
		System.out.println("============================");
		
		
		//OR 연산 : ||		<-- 좌우 중 하나만 true 면 true
		System.out.println(true || true);		//true
		System.out.println(true || false);		//true
		System.out.println(false || (5<3));		//false
		System.out.println((5<=5) || (7>2));	//true
		System.out.println("============================");
		
		
		//XOR 연산 : ^ 		<-- 좌,우가 동일할 때 false, 다를 때 true
		System.out.println(true ^ true);		//false
		System.out.println(true ^ false);		//true
		System.out.println(false ^ (5<3));		//false
		System.out.println((5<=5) ^ (7>2));		//false
		System.out.println("============================");
		
		
		//NOT 연산 : ! 		<-- 반대로 출력, false 면 true, true 면 false
		System.out.println(!true);		//false
		System.out.println(!false);		//true
		System.out.println(false || ! (5<3));	//true
		System.out.println((5<=5) || ! (7>2));	//true
		System.out.println("============================");
		
		
		//비트연산자로 논리연산을 수행
		System.out.println(true & true);	//true
		System.out.println(true & false);	//false
		System.out.println(true | (5<3));	//true
		System.out.println((5<=5) | (7>2));	//true
		System.out.println("============================");
		
		
		//숏 서킷	(short circuit) :		*circuit : 순환(로) ; (전기)회로
		// 	-- 왼쪽의 결과 값 만으로 유추 가능할 때 오른쪽의 값을 실행하지 않는 것.
		//	-- 논리연산자에서만 작동됨	(&&, ||, ^, !)
		//	-- 비트연산자에서는 작동이 안됨	(&, |, ^, ~)
		
		
		//AND 연산에서 SC가 발생 되는 예제
		//논리연산에서는 short circuit이 발생됨
		int value1 = 3;
		System.out.println(false && ++value1 > 6);		//false, short circuit <-- 앞의 값이 false 이기 때문에 굳이 뒤의 값을 확인 할 필요가 없음
		System.out.println(value1);						//Short Circuit(SC)로 인해, value1 의 ++가 작용되지 않음 -> 고로 value1 = 3******************
		
		//비트연산에서는 short circuit이 발생되지 않음 (모두 확인)
		int value2 = 3;
		System.out.println(false & ++value2 > 6);		//논리연산이 아닌, 비트연산이기 때문에 SC가 발생 하지 않음 -> 모두 확인
		System.out.println(value2);
		
		//OR 연산에서 SC가 발생 되는 예제
		
		int value3 = 3;
		System.out.println(true || ++value3 > 6);
		System.out.println(value3);
		
		int value4 = 3;
		System.out.println(true | ++value4 > 6);
		System.out.println(value4);
		
		

	}

}
