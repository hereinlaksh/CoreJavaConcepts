package Multithreading;

public class MultithreadInnerclass {

/*	public static void main(String[] args) {
		
		Thread t1=new Thread()
				{
			public void run() {
				System.out.println("First Thread");
			}
			
				};
				Thread t2=new Thread()
				{
			public void run() {
				System.out.println("Second Thread");
			}
			
				};
				t1.start();
				t2.start();

	}

}
	
	public static void main(String[] args) {
		
		Runnable r1=new Runnable()
				{
			     public void run() {
			    	 System.out.println("First thread");
			     }
				};
				Runnable r2=new Runnable()
				{
			     public void run() {
			    	 System.out.println("Second  thread");
			     }
				};
				Thread t1=new Thread(r1);
				Thread t2=new Thread(r2);
				t1.start();
				t2.start();
						
				
			
		}
	}*/
class Mythread extends Thread
{
public void run() {
	System.out.println("First approach");
	}	
}

class MyRunnable implements Runnable
{
public void run(){
	
System.out.println("Second approach ");
}
}
public static void main(String[] args)
{
	//new Mythread().start();
	//new Thread(new MyRunnable()).start();
	
	}

}




