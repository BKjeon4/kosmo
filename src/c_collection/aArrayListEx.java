
package c_collection;
import java.util.ArrayList;

class aArrayListEx
{
	public static void main(String[] args) 
	{
		ArrayList obj = dataSet(); // ArrayList obj = new ArrayList(); / dataSet() 와 같음
		
		for(int i = 0; i<obj.size(); i++) {
			System.out.println(obj.get(i));
		}
		
	}

	static ArrayList  dataSet()
	{
		String	name = "김태희";
		int		age = 31;
		double	height = 162.3;
		
		ArrayList list = new ArrayList();		// 어레이리스트 : 공간차지 많음. 개수 명확x 사용
		list.add(name);
		list.add(age);
		list.add(height);
		
		
		Object [] obj = new Object[3];
		obj[0] = name;
		obj[1] = age;
		obj[2] = height;
		return list;

	}
}
