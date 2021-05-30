package cursores;

import java.util.Collections;
import java.util.LinkedList;

public class Product2Comp {
	public static void main(String args[])
	{
		LinkedList<Product2> ll = new LinkedList<Product2>();
		ll.add(new Product2(3, "pen", 30));
		ll.add(new Product2(4, "box", 330));
		ll.add(new Product2(1, "comb", 50));
		ll.add(new Product2(2, "choc", 10));
		
		Collections.sort(ll,new PidComp());
		
		for(Product2 p2:ll)
		{
			System.out.println(p2.pid+" "+p2.pname+" "+p2.pcost);
		}
	}

}
