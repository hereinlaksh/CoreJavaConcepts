package Collection;
//Sorting data by using empid and ename comparison

public class Empidcomp implements Comparable{
	
	public int compare(Object o1,Object o2) {
		
		Compaemp e1=(Compaemp)o1;
		Compaemp e2=(Compaemp)o2;
		
		if(e1.eid==e2.eid) {
			return 0;
		}
		else if(e1.eid>e2.eid) {
			return 1;
		}
		else  {
			return -1;
		}
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}



}
