package cursores;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRem {
	public static void main(String args[])
	{
	
	ArrayList<Book> books = new ArrayList<Book>();
	books.add(new Book(1, "java", "shiva"));
	books.add(new Book(2, "c", "sai"));
	books.add(new Book(3, "cpp", "hi"));
	
	Iterator<Book> itr = books.iterator();
	while(itr.hasNext())
	{
		Book b1 = itr.next();
		if(b1.id==2)
			itr.remove();
		if(b1.name=="hi")
			itr.remove();
		
	}
	for(Book b2:books)
		System.out.println(b2.id+ " " + b2.name+ " "+b2.subject );
	}

}
