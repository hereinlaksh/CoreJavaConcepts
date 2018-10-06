package com;

class Test{
	
	Test() {
		System.out.println("This parent class");
		
	}
	Test(int a) 
	{
		System.out.println("This child class");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
	
		new Test();
		new Test(10);
		//b.first();
		//b.first(10);

	}

}
