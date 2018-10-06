package Collection;

import java.util.ArrayList;


public class CollectiontoArray {

	public static void main(String[] args) {
		//Generic array method to retrieve  the data
		ArrayList<String> al=new ArrayList<String>();
		al.add("lakshman");
		al.add("Arthi");
		String[] s1=new String[al.size()];
		al.toArray(s1);
		for(String ss:s1)
		{
			System.out.println(ss);
		}
		//Normal method to retrieve  the data
		
		ArrayList a2=new ArrayList();
		a2.add(10);
		a2.add("vishnnu");
		Object[] oo=a2.toArray();
		for(Object o:oo) {
			System.out.println(o);
		}
			
		}
}


