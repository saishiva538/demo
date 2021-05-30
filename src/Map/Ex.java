package Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Ex {
	public static void main(String args[])
	{
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(1, "shiva");
		h.put(2, "sai");
		h.put(3, "d");
		h.put(4, "vasu");
		System.out.println(h);
		
		Set<Integer> s = h.keySet();
		System.out.println(s);
		
		Collection<String> c =h.values();
		System.out.println(c);
		
		Set<Entry<Integer, String>> e =h.entrySet();
		for(Entry<Integer, String> e1:e)
			System.out.println(e1);
	}

}
