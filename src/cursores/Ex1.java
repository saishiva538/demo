package cursores;

import java.util.LinkedList;
import java.util.ListIterator;

public class Ex1 {
	public static void main(String args[])
	{
	LinkedList<Book> ll = new LinkedList<Book>();
	ll.add(new Book(1, "java", "shiva"));
	ll.add(new Book(2, "c", "sai"));
	ll.add(new Book(3, "python", "riche"));

	ListIterator<Book> li = ll.listIterator();
	while(li.hasNext())
	{
		Book b2 = li.next();
		if(b2.subject.contentEquals("c"))
			li.remove();
				
	}
	for(Book b:ll)
	{
		System.out.println(b.id+ " "+b.subject+ " " + b.name );
	}
	for(int i=0;i<ll.size();i++)
	{
	Book b1 = ll.get(i);
	System.out.println(b1.id+" "+b1.subject+" "+b1.name);
	}
	
	}

}
