package c_collection;

import java.util.ArrayList;
import java.util.Collections;

public class aArrayListEx2 {
	public static void main(String[] args) 
	{
		
		ArrayList<String>  list = new ArrayList<String>();		// 자료형 명확하게 지정 => generics 지정
		list.add("rabbit");  
		list.add("zebra");
		list.add("squirrel");
		list.add("fox");
		list.add("lion");
		list.add("elephant");
		
		for(int i = 0; i<list.size(); i++) {
			String data =(String)list.get(i);		// 형 변환 통해서 바꿔줌
			System.out.println(data);
		}
		System.out.println("===============================set==================");
		list.set(3, "rat");				// 3번에 있는 걸 rat 으로 바꿔준다.
		System.out.println(list);
		
		System.out.println("===============================remove==================");
		list.remove(1);					// 1번을 지운다.
		System.out.println(list);
		
		System.out.println("===============================collection==================");
		Collections.sort(list);			// 오름차순으로 나열
		System.out.println(list);
		
		
		System.out.println("===============================e.f==================");
		// 향상된 for 문
		for ( String data : list) {		// 향상된 for문 쓰려면 generics 반드시 있어야함.
			System.out.println(data);
		}

	}
}
