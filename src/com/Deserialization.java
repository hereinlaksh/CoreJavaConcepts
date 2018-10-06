package com;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization  {
	
	public static void main(String[] args) throws java.lang.Exception
	
	{
	FileInputStream fos=new FileInputStream("C:\\Users\\vishnu\\Desktop\\Java Coding\\abc.txt");
	ObjectInputStream oos= new ObjectInputStream(fos);
	SerialEmp e=(SerialEmp)oos.readObject();
    System.out.println(e.eid+e.ename);
    System.out.println("DeSerialization is completed");
    oos.close();
    }
	
}
