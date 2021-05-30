package cursores;

import java.util.Comparator;

public class EidComp implements Comparator<Emp1> {

	@Override
	public int compare(Emp1 e1, Emp1 e2) {
		
		if(e1.eid==e2.eid)		
		return 0;
		
		else if(e1.eid>e2.eid)
			return 1;
		else
			return -1;
		
	}
	

}
