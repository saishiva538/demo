package Set;

public class Cloning implements Cloneable {
	int a=10;
	int b=20;
	public static void main(String args[]) throws CloneNotSupportedException
	{
		Cloning c = new Cloning();
		System.out.println(c.a);
		System.out.println(c.b);
		
		Cloning c1 = (Cloning) c.clone();
		System.out.println(c1.a);
		System.out.println(c1.b);
				}

}
