package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsett {

	public static void main(String[] args) {
		
		LinkedHashSet<String> h=new LinkedHashSet<String>();
		h.add("AAA");
		h.add("BBB");
		h.add("VVV");
		
		Iterator<String> itr=h.iterator();
		while(itr.hasNext()) {
			String i=itr.next();
			System.out.println(i);
		}

	}

}
