package Multithreading;

public class HookThread1 {

	public static void main(String[] args) {
		
		Mythread5 t=new Mythread5();
		Runtime r=Runtime.getRuntime();
		r.addShutdownHook(t);
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread");
			try{Thread.sleep(1000);}
			catch(InterruptedException ie) {ie.printStackTrace();}
			}
		}
}

class Mythread5 extends Thread
{
	public void run()
	{
		System.out.println("Hook functionality");
	}
	}