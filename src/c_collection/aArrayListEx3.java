package c_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

import javax.naming.spi.DirStateFactory.Result;

public class aArrayListEx3 {

	public static void main(String[] args) {
		ArrayList<Student> result = method();
		// 학생 정보 여기서 출력
		/// 1. System.out.println(k);
		for(Student s : result) {
			System.out.println(s);
		}
		// 전체요소를 순서대로 검색
		// Enumeration -> Iterator 
		System.out.println("---------------------------------------");
		Iterator<Student> it = result.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	static ArrayList<Student> method() {
		ArrayList<Student> list = new ArrayList<Student>();
	//	Student s = new Student ("홍길자",25);  	일반적인 형태
		list.add(new Student ("홍길자1",25));		// 변수 한번만 선언 하는 경우 이렇게 직접적으로 대입.
		list.add(new Student ("홍길자2",26));
		list.add(new Student ("홍길자3",27));
		return list;
	}

}

//----------------------------------------------------------
class Student{
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name +"학생은 " +  age + "세 입니다.";
	}
}
