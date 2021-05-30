package Map;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap {
	public static void main(String args[])
	{
		java.util.LinkedHashMap<Emp,Student> lhs = new java.util.LinkedHashMap<Emp, Student>();
		lhs.put(new Emp(100, "ravi"), new Student(1, "shiva"));
		lhs.put(new Emp(101, "raju"), new Student(2, "sai"));
		lhs.put(new Emp(102, "saidulu"), new Student(3, "anil"));
		lhs.put(new Emp(103, "arun"), new Student(1, "pradeep"));
		
		Set<Emp> e =lhs.keySet();
		for(Emp e1:e)
			System.out.println(e1.eid+ " "+e1.ename);
		
		Collection<Student> c =lhs.values();
		for(Student s:c)
		{
			System.out.println(s.sid+ " "+s.sname);
		} 
		
		Set<Entry<Emp, Student>> se = lhs.entrySet();
		Iterator<Entry<Emp,Student>> itr = se.iterator();
		while(itr.hasNext())
		{
			Entry<Emp,Student> ee= itr.next();
			Emp emp = ee.getKey();
			System.out.println(emp.eid+ " " + emp.ename);
			
			Student std = ee.getValue();
			System.out.println(std.sid+ " " + std.sname);
			
		
		}
		
	
		
	}

}
