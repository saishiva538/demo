package cursores;

import java.util.ArrayList;
import java.util.ListIterator;

public class Ex {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("shiva");
		a1.add("sai");
		a1.add("d");
		
		ListIterator<String> litr = a1.listIterator();
		litr.add("vasu");
		while(litr.hasNext())
		{
		String s = litr.next();
		if(s.equals("sai"))
			litr.remove();
		if(s.equals("d"))
			litr.set("dommati");
		
		}
	
		System.out.println(a1);
	}

}
