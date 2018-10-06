package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsett {

	public static void main(String[] args) {
	
		HashSet<Integer> h=new HashSet<Integer>();
		h.add(150);
		h.add(20);
		h.add(230);
		
		Iterator<Integer> itr=h.iterator();
		while(itr.hasNext()) {
			Integer i=itr.next();
			System.out.println(i);
		}

	}

}
