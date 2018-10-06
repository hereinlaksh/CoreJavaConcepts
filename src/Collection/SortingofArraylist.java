package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortingofArraylist {

/*	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("lakshman");
		al.add("Arthi");
		al.add("Anu");
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);

	}*/
	public static void main(String[] args) {
		ArrayList<Emp> al=new ArrayList<Emp>();
		al.add(new Emp(111,"lakshman"));
		al.add(new Emp(304,"Anu"));
		al.add(new Emp(203,"Bharathi"));
		System.out.println(al);
		Collections.sort(al);
		for(Emp e:al) {
			System.out.println(e.eid+"-----"+e.ename);
		
	}
	}
}
