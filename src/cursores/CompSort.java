package cursores;

import java.util.ArrayList;
import java.util.Collections;

public class CompSort {

	public static void main(String args[])
	{
		ArrayList<Emp1> al = new ArrayList<Emp1>();
		al.add(new Emp1(3, "shiva"));
		al.add(new Emp1(4, "sai"));
		al.add(new Emp1(1, "vasu"));
		al.add(new Emp1(2, "bai"));
		
		Collections.sort(al,new EidComp());
		
		for(Emp1 e:al)
		{
			System.out.println(e.eid+" "+e.ename);
		}
	}
}
