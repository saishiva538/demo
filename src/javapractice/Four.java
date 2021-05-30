package javapractice;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.HashSet;
import java.util.Iterator;
public class Four {
	public static void checkage(int age)
	{
		if (age < 18) {
		      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		    }
		    else {
		      System.out.println("Access granted - You are old enough!");
		    }
		  }
	
	public static void main(String args[])
	{
/*ArrayList<String> name = new ArrayList<String>();
name.add("shiva");
name.add("sai");
name.add("pradeep");
name.add("anil");
name.add("surya");
System.out.println(name);
System.out.println(name.get(1));
name.set(2, "kumar");
System.out.println(name);
System.out.println(name.size());
//name.clear();
System.out.println(name);
Collections.sort(name);
System.out.println(name);
for(String i:name)
{
	System.out.println(name);
	HashMap<String, Integer> details = new HashMap<String, Integer>();
	details.put("shiva", 23);
	details.put("pradeep", 24);
	details.put("anil", 25);
	//System.out.println(details);
	//System.out.println(details);
	//for(String i : details.keySet())
	//{
		//System.out.println("key : "  + i + " value :"+details.get(i));
	//}

}
HashSet<String> details = new HashSet<String>();
	
	details.add("shiva");
	
	details.add("pradeep");
	details.add("anil");
	details.add("surya");
	System.out.println(details);
	ArrayList<Integer> cars = new ArrayList<Integer>();
		cars.add(8);
		cars.add(20);
		cars.add(30);
		cars.add(05);
		Iterator<Integer> it = cars.iterator();
		while(it.hasNext())
		{
			Integer i = it.next();
			if(i<10)
			{
				it.remove();
			}
		}
		System.out.println(cars);
*/
		  checkage(15);
		
		
	}
}