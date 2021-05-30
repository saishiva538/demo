package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList3 {
	public static void main(String args[])
	{
		String[] s = {"a","b","c"};
		
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(s));
		al.add("hello");
		System.out.println(al);
		
	ArrayList<String> a2 = new ArrayList<String>();
	a2.add("asd");
	a2.add("qwe");
	
	String[] s1 = new String[a2.size()];
	a2.toArray(s1);
	for(String ss:s1)
	System.out.println(ss);
	
	
		
	}
}
