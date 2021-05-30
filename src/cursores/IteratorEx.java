package cursores;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("a");
		a1.add("b");
		a1.add("c");
		a1.add("d");
		
		Iterator<String> itr = a1.iterator();
		while(itr.hasNext())
		{
			String s = itr.next();
			System.out.println(s);
		}
		
	}
}
