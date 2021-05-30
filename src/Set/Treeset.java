package Set;

import java.util.Comparator;
import java.util.TreeSet;

public class Treeset {
	public static void main(String args[])
	{
		TreeSet<String> t = new TreeSet<String>(new MyComp());
		t.add("shiva");
		t.add("sai");
		t.add("vasu");
		t.add("bai");
		
		System.out.println(t);
		
		TreeSet<Integer> t1 = new TreeSet<Integer>(new MyComp2());
		t1.add(100);
		t1.add(330);
		t1.add(200);
		
		System.out.println(t1);
	}
}	
	class MyComp implements Comparator<String>
	{

		@Override
		public int compare(String s1, String s2) {
	
			return -s1.compareTo(s2);
		}
		
	}
	
	class MyComp2 implements Comparator<Integer>
	{

		@Override
		public int compare(Integer i1, Integer i2) {
		
			return -i1.compareTo(i2);
		}
		
	}


