package com;

public class Stringmanicompareto {

	public static void main(String[] args) {
		
//String class equals() executed
		String s1="lakshman";
		String s2="anu";
		int[] a=new int[100];
		System.out.println(a.length);
		String s3="lakshman";
		System.out.println(s3.length());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s2));
		System.out.println("LAKSHMAN".equals("lakshman"));
		System.out.println("LAKSHMAN".equalsIgnoreCase("lakshman"));
		
		//Compareto() method
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s2.compareTo(s3));
		System.out.println("LAKSHMAN".compareTo("lakshman"));
		System.out.println("LAKSHMAN".compareToIgnoreCase("lakshman"));
		
	}

}
