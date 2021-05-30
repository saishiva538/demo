package Map;

import java.util.TreeMap;

public class TreeMapEx {
	public static void main(String args[])
	{
		TreeMap<Integer, String> t= new TreeMap<Integer, String>();
		t.put(1, "shiva");
		t.put(3, "sai");
		t.put(4, "d");
		t.put(2, "bai");
		System.out.println(t);
		
		TreeMap<Integer, String> t1= new TreeMap<Integer, String>(t);
		System.out.println(t1);
		
		TreeMap<Integer, String> t2= new TreeMap<Integer, String>();
		t2.put(111, "a");
		t2.put(222, "b");
		t2.put(333, "c");
		
		TreeMap<Integer, String> t4= new TreeMap<Integer, String>();
		t4.putAll(t);
		t4.putAll(t2);
		System.out.println(t4);
	}

}
