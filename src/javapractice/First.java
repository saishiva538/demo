package javapractice;


public class First {
	public static int add(int a)
	{
		if(a>0)
		{
		return a*add(a-1);
		}
		else
		{
			return 0;
		}
	}
	
	public static void main(String[] args)
	{
		int res=add(5);
		System.out.println(res);
		/*	
		 * static int sal(int a,int b)
	{
		return a+b;
	}
	static double sal(double a,double b)
	{
		return a+b;
	}
	int x=sal(1000,2000);
		double y=sal(10000.5,2500.6);
		System.out.println(x);
		System.out.println(y);
		 * static void validate(int age)
	{
		if(age>18)
		{
			System.out.println("u r authorised");
		}
	else
		{
			System.out.println("u r not authorised");
		}
	}int a=10;
		char c = 'S';
		c=75;
		c--;
		System.out.println(c);
		int d = (int)5.5;
		double f=5;
		System.out.println(d);
		System.out.println(f);
		
		int i=0B10001;
		System.out.println("i values"+i);
		
		int z =25;
		int y=z<<2;
		System.out.println(y);
		
		int a = 4;
		int b = 6;
		int c = 1;
		
		if(a>b && a>c)
		{
			System.out.println("a is big");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is big");
		}
		else
		{
			System.out.println("c is big");
		}
		
		
		int c;
		c=false ? new Integer(10):new Integer(20);
		System.out.println(c);
		
		
		int day=6;
		switch(day)
		{
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		default:
			System.out.println("none");
		}
			
		
		int i=0;
		while(i<5)
		{
			System.out.println(i);
			i++;
		}
		
		int i=0;
		do
		{
			System.out.println(i);
			i++;
		}
		while(i<5);
		
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	
		int[] i= {10,20,30,40,50};
		for(int z:i)
		{
			System.out.println(z);
		}
		
		int i=0;
		while(i<5)
		{
			System.out.println(i);
			i++;
			if(i==4)
			{
				break;
			}
		}
		
		int i=0;
		while(i<10)
		{
			if(i==4)
			{
				i++;
				continue;
			}
			System.out.println(i);
			i++;
				
		}
		
		String[] car= {"volvo","benz","tesla","benz"};
		for(String i:car)
		{
			System.out.println(i);
		}
		
		[][] val= {{1,2,3,4,5},{6,7,8,9}};
		for(int i=0;i<val.length;++i) {
			for(int j=0;j<val[i].length;++j) {
				System.out.println(val[i][j]);
			}
		}
		
		validate(15);
		*/
		
		
		}
	
	
	
}
