package c_collection;
import java.util.TreeSet;

public class bTreeSetEx 
{
	public static void main(String[] args) 
	{
		TreeSet  set = new TreeSet();	//자동으로 정렬한 것 처럼 해줌
		
		set.add("elephant");
		set.add("tiger");
		set.add("lion");
		set.add("cat");
		set.add("dog");
		set.add("ant");
		set.add("snake");
		set.add("zebra");
		set.add("bee");

		System.out.println( set );
		
		System.out.println(set.subSet("e", "s"));
		System.out.println(set.headSet("e"));
		System.out.println(set.tailSet("e"));

	}
}
