package collections;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String args[])
	{
		ArrayList<Integer> a1= new ArrayList<Integer>();
		a1.add(100);
		a1.add(200);
		
		ArrayList<Integer> a2= new ArrayList<Integer>();
		a2.add(300);
		a2.add(400);
		
		ArrayList<Integer> a3= new ArrayList<Integer>();
		a3.add(500);
		a3.addAll(a1);
		a3.add(200);
		a3.addAll(a2);
		System.out.println(a3);
		
	}

}
