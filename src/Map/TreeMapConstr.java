package Map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapConstr {
	public static void main(String args[])
	{
		TreeMap<Integer, String> t = new TreeMap<Integer, String>(new MyComp());
		t.put(5, "a");
		t.put(1, "b");
		t.put(4, "c");
		t.put(2, "d");
		System.out.println(t);
		
	}
	}
	class MyComp implements Comparator<Integer>
	{

		@Override
		public int compare(Integer i1, Integer i2) {
			
			return -i1.compareTo(i2);
		}
		
	

}
