package cursores;

public class Product1 implements Comparable<Product1> {
	
	int pid;
	String pname;
	int pcost;
	public Product1(int pid, String pname, int pcost) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcost = pcost;
	}
	@Override
	public int compareTo(Product1 p) {
		if(pid==p.pid)
		return 0;
		else if(pid>p.pid)
			return 1;
		else
			return -1;
	}
	

}
