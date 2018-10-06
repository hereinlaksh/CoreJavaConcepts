package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Treesett {
	
		public static void main(String[] args) { //TreeSet to print the data in assending order
												 //because of internally perform by compareto 
			
		/*	TreeSet h=new TreeSet();
			h.add("AAA");
			h.add("BBB");
			h.add("VVV");
			System.out.println(h);
			TreeSet h1=new TreeSet();
			h1.add(10);
			h1.add(20);
			h1.add(3);
			System.out.println(h1);*/
			
			TreeSet h=new TreeSet();    //java.util.collection<? extends E>);constructor type
			h.add("AAA");
			h.add("BBB");
			h.add("VVV");
			TreeSet t1=new TreeSet(h);
			t1.add("vishnu");
			t1.add("viswa");
			System.out.println(t1);
		}

	}


