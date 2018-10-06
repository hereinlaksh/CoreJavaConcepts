package com;
/*
abstract class Test1
{
abstract void m1();
abstract void m2();
void m3() {System.out.println("M3 method calling");};
}

class Test2 extends Test1
{
void m1() {System.out.println("M1 method calling");};
void m2() {System.out.println("M2 method calling");};
}


public class Abstraction {

	public static void main(String[] args) {
		
		Test2 b=new Test2();
		b.m1();
		b.m2();
		b.m3();

	}
	
Abstraction Example 2:
************************************************
	abstract class Test1
	{
	abstract void m1();
	abstract void m2();
	}

	abstract class Test2 extends Test1
	{
	void m1() {System.out.println("M1 method calling");};
	}
	
	class Test3 extends Test2
	{
	void m2() {System.out.println("M2 method calling");};
	}
	


	public class Abstraction {

		public static void main(String[] args) {
			
			Test3 b=new Test3();
			b.m1();
			b.m2();
	}	

}

Abstract class will accept the constructor

****************************************************

abstract class Test3
{
	
Test3(){System.out.println("m1 METHOD");}

}
class Test4 extends Test3
{
	Test4(){System.out.println("m2 METHOD");}
}


public class Abstraction {

	public static void main(String[] args) {
		
		new Test4();
		
}	
}
*/

interface id1
{
	
void m1();

}
class Test4 implements id1
{
	public void m1() {System.out.println("This interface method example");}
}


public class Abstraction {

	public static void main(String[] args) {
		
		System.out.println('\u0020'+"Hai");
		
		Test4 b=new Test4();
		b.m1();
}
}