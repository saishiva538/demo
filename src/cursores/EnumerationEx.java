package cursores;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationEx {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("shiva");
		v.add("sai");
		v.add("d");
		Enumeration<String> e = v.elements();
		while (e.hasMoreElements()) {
			String s = e.nextElement();
			System.out.println(s);
			
		}

	}

}
