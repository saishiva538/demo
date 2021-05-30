package collections;

import java.util.ArrayList;

public class ArrayList2 {
	public static void main(String args[])
	{
		Emp e1 = new Emp(111, "shiva");
		Emp e2 = new Emp(222, "sai");
		Emp e3 = new Emp(333, "D");
		
		ArrayList<Emp> a1 = new ArrayList<Emp>();
		a1.add(e1);
		a1.add(e2);
		ArrayList<Emp> a2 = new ArrayList<Emp>();
		a2.add(e3);
		a2.addAll(a1);
		a2.retainAll(a1);
		for(Emp e:a2)
		System.out.println(e.eid+ "" + e.ename);
		
	}
}
