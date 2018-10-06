 package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashMapp {

	public static void main(String[] args) {
		
		HashMap h=new HashMap();
		h.put(111, "lakshman");
		h.put(324, "vishnu");
		h.put(221, "viswa");
		System.out.println(h);
		Set s=h.keySet();
		System.out.println(s);
		Collection c=h.values();
		System.out.println(c);
		/*
		Set ss=h.entrySet();
		Iterator itr=ss.iterator();
		while(itr.next()) 
		{
			Map.Entry m=(Map.Entry)itr.next();
			System.out.println(m.getKey()+"......."+m.getValue());
		}
		HashMap<Emp,Student> h1=new HashMap<Emp,Student>();   //Two add two Emp and student data
		h1.put(new Emp(111,"ratan"),new Student(1,"a"));
		h1.put(new Emp(222,"lakshman"),new Student(3,"b"));
		h1.put(new Emp(333,"vishnu"),new Student(4,"c"));
		Set s=h1.entrySet();
		Iterator itr=s.iterator();
		while(itr.hashNext()) {
			Map.Entry m=(Map.Entry)itr.next();
			Emp e=(Emp)m.getKey();
			System.out.println(e);
			
			Student ss=(Student)m.getValue();
			System.out.println(ss.eid1+"------"+ss.ename1);
			*/
		}
	}


