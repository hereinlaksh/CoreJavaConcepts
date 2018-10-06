package com;
import java.io.*;

public class IOPakage {

	public static void main(String[] args) throws IOException {

BufferedInputStream fd=new BufferedInputStream(new FileInputStream("C:\\Users\\vishnu\\Desktop\\Java Coding\\abc.txt"));
BufferedOutputStream fc=new BufferedOutputStream(new FileOutputStream("C:\\Users\\vishnu\\Desktop\\Java Coding\\xyz.txt"));

int c;
while((c=fd.read())!=-1)
{
	System.out.println((char)c);
	fc.write(c);
	
	
	}

fd.close();
fc.close();


	}

}
