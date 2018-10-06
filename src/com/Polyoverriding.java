package com;

/*OVerriding method with same method name at primitive level
 * ---------------------------------------------------------
class Parent{
	void marry()
	{
		System.out.println("parent choice");
	}
			
	}
class Child extends Parent{
	void marry() {
		System.out.println("child choice");
		
	}
}


public class Polyoverriding {

	public static void main(String[] args) {
         
		//Child b=new Child();
		//b.marry();
		new Child().marry();/// possible to declare like this also
	}

}
OVerriding method with differnt method names at class level
---------------------------------------------------------
class Animal{}
class Dog extends Animal{}
class Parent{
	Animal marry()
	{
		System.out.println("parent choice");
		Animal b=new Animal();
		return b;
				
		//return new Animal();//we can declare like this also 
	}
			
	}
class Child extends Parent{
	Dog marry() 
	{
		System.out.println("child choice");
		return new Dog();
	}
}


public class Polyoverriding {

	public static void main(String[] args) {
        
		//Child b=new Child();
		//b.marry();
		new Child().marry();/// possible to declare like this also
	}

}

Parent class variable and child class variable ;
----------------------------------------------------
interface Webdriver
{
	void A();
	void B();
}
class Firefox implements Webdriver
{
	public void A() {
	}
	public void B() {
	}
	void C() {
	}
	
}

public class Polyoverriding {

	public static void main(String[] args) {
		
		//Parent p= new Child();
        Webdriver driver=new Firefox();
        driver.A();
        driver.B();
        Firefox f=(Firefox)driver;
        f.C();
	
	}
}
*/







