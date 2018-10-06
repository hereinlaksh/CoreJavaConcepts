package Multithreading;

public class InterruptMethod {

	public static void main(String[] args) {
		Mythread8 t=new Mythread8();
		t.start();
		t.interrupt();
		

	}
}

class Mythread8 extends Thread
{
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("UserThread");
			try{Thread.sleep(1000);}
			catch(InterruptedException ie) {System.out.println("Thread Interrupted");}
			}
		}
	}

	
	