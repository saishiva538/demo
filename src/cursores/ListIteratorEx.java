package cursores;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("a");
		a1.add("b");
		a1.add("c");
		a1.add("d");
		
		ListIterator<String> litr =a1.listIterator();
		while(litr.hasNext())
		{
			String s = litr.next();
			System.out.println(s);
		}
		while(litr.hasPrevious())
		{
			String s = litr.previous();
			System.out.println(s);
		}
		
		
		}

}
