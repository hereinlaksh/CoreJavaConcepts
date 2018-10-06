package com;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3192497086536964926L;

	public static void main(String[] args) throws IOException {
		
		SerialEmp e= new SerialEmp(123,"java");
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\vishnu\\Desktop\\Java Coding\\abc.txt");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		System.out.println("Serialization is completed");
		oos.writeObject(e);
	    oos.close();
	}
	

}

