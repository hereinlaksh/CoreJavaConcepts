package Collection;

import java.util.ArrayList;

import com.SerialEmp;

public class Addcollectocollec {

	public static void main(String[] args) {

		SerialEmp e1=new SerialEmp(111,"lakshman");
		SerialEmp e2=new SerialEmp(222,"vishnu");
		SerialEmp e3=new SerialEmp(333,"viswa");
		SerialEmp e4=new SerialEmp(444,"Sirwal");
		ArrayList<SerialEmp> a1=new ArrayList<SerialEmp>();
		a1.add(e1);
		a1.add(e2);
		ArrayList<SerialEmp> a2=new ArrayList<SerialEmp>();
		a2.addAll(a1);
		System.out.println(a2.contains(e1));
		a2.add(e3);
		a2.add(e4);
		System.out.println(a2.containsAll(a1));
		
		for(SerialEmp aa:a2) {
			System.out.println(aa.eid+"*****"+aa.ename);
			}
		}
	}


