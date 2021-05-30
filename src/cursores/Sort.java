package cursores;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
	public static void main(String args[])
	{
	ArrayList<Emp> al = new ArrayList<Emp>();
	al.add(new Emp(3, "c"));
	al.add(new Emp(1, "d"));
	al.add(new Emp(4, "a"));
	al.add(new Emp(2, "b"));
	Collections.sort(al);
	for(Emp e:al)
	{
		System.out.println(e.eid +" " + e.ename);
	}
	}
}
