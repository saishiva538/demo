package cursores;


import java.util.Comparator;

public class PidComp implements Comparator<Product2> {

	@Override
	public int compare(Product2 o1, Product2 o2) {
		if(o2.pid==o1.pid)
		return 0;
		else if(o2.pid>o1.pid)
			return 1;
		else
			return -1;
	}

}
