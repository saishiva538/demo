package Set;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

public class ArrayListClone implements Cloneable {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("shiva");
		al.add("sai");
		al.add("vasu");
		
		ArrayList<String> al2= (ArrayList<String>)al.clone();
		System.out.println(al2);
		
		System.out.println(al instanceof List);
		System.out.println(al instanceof Cloneable);
		System.out.println(al instanceof RandomAccess);
		

	}

}
