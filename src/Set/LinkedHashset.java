package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset {
	public static void main(String agrs[])
	{
	LinkedHashSet<Emp> lhs = new LinkedHashSet<Emp>();
	lhs.add(new Emp(100, "shiva"));
	lhs.add(new Emp(200, "sai"));
	lhs.add(new Emp(300, "vasu"));
	
	Iterator<Emp> i = lhs.iterator();
	while(i.hasNext())
	{
		Emp e = i.next();
		System.out.println(e.eid+ " " + e.ename);
	}
	
	}
}
