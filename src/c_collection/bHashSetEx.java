package c_collection;
import java.util.HashSet;
import java.util.TreeSet;

public class bHashSetEx 
{
	public static void main(String[] args)
	{
		TreeSet set = new TreeSet();
		
		set.add("rabbit");
		set.add("zebra");
		set.add("fox");
		set.add("zebra");
		set.add("elephant");
		set.add("elephant");
		set.add("ant");
		
		
		
		System.out.println( set );
		System.out.println(set.subSet("d","s"));
		System.out.println(set.headSet("e"));
		System.out.println(set.tailSet("e"));
		
	}
}
