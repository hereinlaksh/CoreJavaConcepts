package Collection;

import java.util.ArrayList;

import com.SerialEmp;

public class Genericmethod {

	public static void main(String[] args) {
	

		SerialEmp e1=new SerialEmp(111,"lakshman");
		SerialEmp e2=new SerialEmp(222,"vishnu");
		SerialEmp e3=new SerialEmp(333,"viswa");
		ArrayList<SerialEmp> al=new ArrayList<SerialEmp>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		for(SerialEmp aa:al) {
			System.out.println(aa.eid+"*****"+aa.ename);
			}}}
