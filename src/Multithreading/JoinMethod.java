package Multithreading;

public class JoinMethod {

	public static void main(String[] args) {
		Mythread7 t=new Mythread7();
		Mythread7 t1=new Mythread7();
		t.start();
		try{t.join();}
		catch(InterruptedException ie) {ie.printStackTrace();}
		t1.start();
		
		for(int i=0;i<3;i++)
		{
			System.out.println("Main Thread");
			try{Thread.sleep(1000);}
			catch(InterruptedException ie) {ie.printStackTrace();}
			}
		}

	}

class Mythread7 extends Thread
{
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println(Thread.currentThread().getName()+"----"+i);
			try{Thread.sleep(1000);}
			catch(InterruptedException ie) {ie.printStackTrace();}
			}
		}
	}
	
