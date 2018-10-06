package com;

public class Arrayconcept {

	public static void main(String[] args) {
	
		SerialEmp e1=new SerialEmp(111,"lakshman");
		SerialEmp e2=new SerialEmp(222,"lavanya");
		SerialEmp e3=new SerialEmp(333,"santhini");
		
		SerialEmp[] e=new SerialEmp[5];
		e[0]=e1;
		e[3]=e2;
		e[4]=e3;
		for(Object o:e)
		{
			if(o instanceof SerialEmp)
			{
				SerialEmp s2=(SerialEmp)o;
				System.out.println(s2.eid+"-----"+s2.ename);
				
			}
			if(o==null)
			{
				System.out.println(o);
			}
				
		}
		}
}


