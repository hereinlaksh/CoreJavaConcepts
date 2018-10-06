package Multithreading;

public class Multithreading {

	public static void main(String[] args) {
		
	Mythread t1=new Mythread();
	t1.setPriority(Thread.MAX_PRIORITY);
	Mythread t2=new Mythread();
	t2.setPriority(Thread.NORM_PRIORITY);
	t1.start();
	t2.start();

	}
}

class Mythread extends Thread
{
public void run() {
	System.out.println(Thread.currentThread().getName());
	System.out.println(Thread.currentThread().getPriority());
	}	
}
/*Multithreadin Concept:
++++++++++++++++++++
Using run() method Thread will be created in this case
+++++++++++++++++++++++++++++++++++++++++++++
Example 1:
++++++++++
package com;

public class Multithreading {

	public static void main(String[] args) {
		
	Mythread t=new Mythread();
	t.start();
	for(int i=0;i<5;i++)
	{
		System.out.println("Main defined thread");
	}

	}
}

class Mythread extends Thread
{
public void run() {
	for(int i=0;i<5;i++)
	{
		System.out.println("user defined thread");
	}
}	
}
Output:
+++++++
Main defined thread
Main defined thread
Main defined thread
Main defined thread
Main defined thread
user defined thread
user defined thread
user defined thread
user defined thread
user defined thread
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Example 2;
+++++++++
Used run() method to it's like normal calling method.  Thread will not created.
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
package com;

public class Multithreading {

	public static void main(String[] args) {
		
	Mythread t=new Mythread();
	t.run();
	for(int i=0;i<3;i++)
	{
		System.out.println("Main defined thread");
	}}
}

class Mythread extends Thread
{
public void run() {
	for(int i=0;i<3;i++)
	{
		System.out.println("user defined thread");
	}
}	
}
Output:
++++++++
user defined thread
user defined thread
user defined thread
Main defined thread
Main defined thread
Main defined thread
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Example 3:
+++++++++
To overrideing start() method. Thread will not created because thread class star() not executed.
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
package com;

public class Multithreading {

	public static void main(String[] args) {
		
	Mythread t=new Mythread();
	t.start();
	for(int i=0;i<3;i++)
	{
		System.out.println("Main defined thread");
	}}
}

class Mythread extends Thread
{
public void start() {
	for(int i=0;i<3;i++)
	{
		System.out.println("user defined thread");
	}
}	
Output:
+++++++
user defined thread
user defined thread
user defined thread
Main defined thread
Main defined thread
Main defined thread
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Example 4:
++++++++++++++
Creating multithreading t1,t2,t3 three threads will be created as well as three stacks.
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
package com;

public class Multithreading {

	public static void main(String[] args) {
		
	Mythread t1=new Mythread();
	t1.start();
	Mythread t2=new Mythread();
	t2.start();
	Mythread t3=new Mythread();
	t3.start();
	}
}

class Mythread extends Thread
{
public void start() {
	
		System.out.println("user defined thread");
	
}	
}
Output:
++++++
user defined thread
user defined thread
user defined thread
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Example 5:
++++++++++++
Creating Multithreading with multiple process.
++++++++++++++++++++++++++++++++++++++++
package com;

public class Multithreading {

	public static void main(String[] args) {
		
	Mythread1 t1=new Mythread1();
	t1.start();
	Mythread2 t2=new Mythread2();
	t2.start();
	Mythread3 t3=new Mythread3();
	t3.start();
	}
}

class Mythread1 extends Thread
{
public void start() {
	
		System.out.println("user defined thread1");
	
}	
}
class Mythread2 extends Thread
{
public void start() {
	
		System.out.println("user defined thread2");
	
}	
}
class Mythread3 extends Thread
{
public void start() {
	
		System.out.println("user defined thread3");
	
}	
}
Output:
+++++++
user defined thread1
user defined thread2
user defined thread3
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Example 6:
++++++++++
How to set and get name of threads.  It's contains list of methods which used below
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
package com;

public class Multithreading {

	public static void main(String[] args) {
		
	Mythread t1=new Mythread();
	t1.start();
	Mythread t2=new Mythread();
	t2.start();
	System.out.println(t1.getName());
	t1.setName("lakshman");
	System.out.println(t1.getName());
	System.out.println(t2.getName());
	System.out.println(Thread.currentThread().getName());
	System.out.println(t1.getId());
	System.out.println(t2.getId());
	System.out.println(t1.isAlive());
	System.out.println(Thread.activeCount());
	}
}

class Mythread extends Thread
{
public void run() {
	}	
}
Output:
+++++++
Thread-0
lakshman
Thread-1
main
8
9
true
3
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Example 7:
++++++++++
How to set priority of thread and getpriority of current thread.
+++++++++++++++++++++++++++++++++++++++++++++++++++
package com;

public class Multithreading {

	public static void main(String[] args) {
		
	Mythread t1=new Mythread();
	t1.setPriority(Thread.MAX_PRIORITY);
	Mythread t2=new Mythread();
	t2.setPriority(Thread.MIN_PRIORITY);
	t1.start();
	t2.start();

	}
}

class Mythread extends Thread
{
public void run() {
	System.out.println(Thread.currentThread().getName());
	System.out.println(Thread.currentThread().getPriority());
	}	
}
Output:
++++++
Thread-0
10
Thread-1
1
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */

