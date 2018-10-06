package Collection;
import java.util.*;
//Sorting data by using empid and ename comparison

public abstract class Enamecomp implements Comparable {

		public int compare(Object o1,Object o2) {
			
			Compaemp e1=(Compaemp)o1;
			Compaemp e2=(Compaemp)o2;
			
		   return (e1.ename1).compareTo(e2.ename1);
		}

		

}

