package Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Ex1 {
	public static void main(String args[])
	{
		LinkedHashMap<Integer, Prod> lhm = new LinkedHashMap<Integer, Prod>();
		lhm.put(1, new Prod(111, "pen", 20));
		lhm.put(2, new Prod(222, "mobile", 20000));
		lhm.put(1, new Prod(333, "shoe", 2000));
		
		Set<Entry<Integer, Prod>> s = lhm.entrySet();
		Iterator<Entry<Integer, Prod>> itr = s.iterator();
		while(itr.hasNext())
		{
			Entry<Integer, Prod> a = itr.next();
			Prod p = a.getValue();
			if(p.pid==111)
				itr.remove();
			System.out.println(p.pid+ " " +p.product + " " +p.pcost);
		}
	}

}
