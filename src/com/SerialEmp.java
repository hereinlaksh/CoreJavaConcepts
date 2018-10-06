package com;

import java.io.Serializable;

public class SerialEmp implements Serializable {


	public int eid;
	public transient String ename;
     public SerialEmp(int eid, String ename) 
     {
		this.eid=eid;
		this.ename=ename;
	
	}
}
