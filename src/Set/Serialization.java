package Set;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {
	void serialization_method() throws IOException 
	{
		Emp e = new Emp(111,"shiva");
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		oos.close();
		System.out.println("serialization complete");
	}
	
	void desialization_demo() throws IOException, ClassNotFoundException
	{
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Emp e = (Emp)ois.readObject();
		System.out.println(e.eid+ " " + e.ename);
		ois.close();
		
		}
	public static void main(String args[]) throws IOException, ClassNotFoundException
	{
		Serialization s = new Serialization();
		s.serialization_method();
		s.desialization_demo();
		
		
	}

}
