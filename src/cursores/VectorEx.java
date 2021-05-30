package cursores;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		for (int i=1;i<=30;i++)
		{
			v.add(i);
		}
		System.out.println(v);
		Iterator<Integer> itr =v.iterator();
		while(itr.hasNext())
		{
			Integer a = itr.next();
			if(a%2!=0)
			{
				itr.remove();
			}
		}
		System.out.println(v);
	}

}
