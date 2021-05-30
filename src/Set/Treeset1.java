package Set;

import java.util.Comparator;
import java.util.TreeSet;

public class Treeset1 {
	public static void main(String args[])
	{
		TreeSet<Prod> t = new TreeSet<Prod>(new Comp());
		t.add(new Prod(1, "pen", 20));
		t.add(new Prod(3, "box", 200));
		t.add(new Prod(2, "scale", 10));
		
		for(Prod p:t)
		{
			System.out.println(p.pid+ " " +p.pname + " " +p.pcost );
		}
	}

}

class Comp implements Comparator<Prod>
{

	@Override
	public int compare(Prod p1, Prod p2) {
	
		return p1.pname.compareTo(p2.pname);
	}
	
}
