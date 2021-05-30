package collections;

import java.util.ArrayList;

public class arraylist {
	public static void main(String args[])
	{
	ArrayList<Emp> al = new ArrayList<Emp>();
	al.add(new Emp (111,"shiva"));
	for(Emp e:al)
		System.out.println("empid " +e.eid+ "\nename " +e.ename);
	
	ArrayList<Student> st = new ArrayList<Student>();
	st.add(new Student (1,"shiva"));
	for(Student s:st)
		System.out.println("stdid  " +s.sid+ "\nstdname " +s.sname);
	
	Emp e1 = al.get(0);
	System.out.println(e1.eid+ "" +e1.ename);
	

}
}