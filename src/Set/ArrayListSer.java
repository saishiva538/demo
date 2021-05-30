package Set;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListSer {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(new Emp(1, "shiva"));
		al.add(new Emp(2, "sai"));
		al.add(new Emp(3, "d"));
		
		//serialization 
		
		FileOutputStream fos = new FileOutputStream("asd.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(al);
		oos.close();
		System.out.println("serialization completed");
		
		//desiarilization
		
		FileInputStream fis= new FileInputStream("asd.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<Emp> al2 = (ArrayList<Emp>)ois.readObject();
		for(Emp e2:al2)
		System.out.println(e2.eid+ " " + e2.ename);
		ois.close();
	}

}
