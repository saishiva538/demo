package cursores;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorProd {
	public static void main(String[] args) {
		Vector<Product> v = new Vector<Product>();
		v.add(new Product(1, "choclate", "cb"));
		v.add(new Product(1, "biscute", "df"));
		v.add(new Product(1, "ice-cream", "amul"));
		
		System.out.println("By Enumeration");		
		Enumeration<Product> e = v.elements();
		while(e.hasMoreElements())
		{
			Product v1 = e.nextElement();
			System.out.println(v1.pid+" " + v1.pname + " " +v1.pdetails );
		}
		
		System.out.println("By Iterator");
		Iterator<Product> itr = v.iterator();
		while(itr.hasNext())
		{
			Product v2 = itr.next();
			System.out.println(v2.pid+ " " +v2.pname+ " " +v2.pdetails);
		}
		
		System.out.println("By ListIterator");
		ListIterator<Product> litr = v.listIterator();
		while(litr.hasNext())
		{
			Product v3 = litr.next();
			System.out.println(v3.pid+ " " +v3.pname+ " " +v3.pdetails);
		}
	}

}
