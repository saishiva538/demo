package javapractice;
class Person
{
	private String name;
public String getName()
{
	return name;
}
public void setName(String newName)
{
	this.name=newName;
}
}
/*
abstract class A{
	int age=24;
	String name="shiva";
	public abstract void m();
}

class B extends A{
	int pass_year=2018;
	public void m()
	{
		System.out.println("Abstract class");
	}
}


	/*int age;
	String name;
	
	public Second(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	*/

public class Second  {
	public static void main(String args[])
	{
		/*
		Second s=new Second(10, "shiva");
		Second s1=new Second(20, "sai");
		System.out.println(s.age + " " +s.name);
		System.out.println(s1.age + " " +s1.name);
		
		B b=new B();
		System.out.println("age : "+b.age);
		System.out.println("name : "+b.name);
		System.out.println("passyear : "+b.pass_year);
		*/
		 Person p = new Person ();
		p.setName("shiva sai");
		System.out.println(p.getName());
		
	}
}
