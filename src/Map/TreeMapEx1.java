package Map;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapEx1 {
	public static void main(String args[])
	{
		TreeMap<Integer, String> t = new TreeMap<Integer, String>();
		t.put(1, "a");
		t.put(2, "b");
		t.put(3, "c");
		t.put(4, "d");
		t.put(5, "e");
		t.put(6, "f");
		System.out.println(t);
		
		SortedMap<Integer, String> s = t.subMap(3, 6);
		TreeMap<Integer, String> t1 = new TreeMap<Integer, String>(s);
		System.out.println(t1);
		
		SortedMap<Integer, String> s1 = t.tailMap(5);
		TreeMap<Integer, String> t2 = new TreeMap<Integer, String>(s1);
		System.out.println(t2);
		
		SortedMap<Integer, String>s2 = t.headMap(5);
		TreeMap<Integer, String> t3 = new TreeMap<Integer, String>(s2);
		System.out.println(t3);
	}

}
