package cursores;

import java.util.Collections;
import java.util.LinkedList;

public class ProductComparableSort {

	public static void main(String[] args) {
		LinkedList<Product1> ll = new LinkedList<Product1>();
		ll.add(new Product1(10, "pen", 20));
		ll.add(new Product1(2, "book", 40));
		ll.add(new Product1(50, "bag", 2000));
		ll.add(new Product1(1, "scale", 10));
		
		Collections.sort(ll);
		
		for(Product1 p1:ll) {
			System.out.println(p1.pid+" " + p1.pname+" " + p1.pcost);
		}

	}

}
