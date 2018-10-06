package com;


class A
{
	static int a=10;
	int b=20;
{
	System.out.println("This parent class");
}
}



public class Inheritance extends A {

	public static void main(String[] args) {
		
     Inheritance b=new Inheritance();
     System.out.println("Static variable"+A.a);
     System.out.println("Instance variable"+b.b);
	}

}
