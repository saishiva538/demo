package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList4 {
	public static void main(String args[])
	{
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("shiva");
		a1.add("sai");
		a1.add("aaa");
		a1.add("bbb");
		System.out.println("before swaing"+a1);
		Collections.swap(a1, 0, 2);
		System.out.println("after swaing"+a1);
		
		ArrayList<String> a2 = new ArrayList<String>(a1.subList(1, 4));
		System.out.println(a2);
		
	}
}
