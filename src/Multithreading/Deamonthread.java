package Multithreading;

public class Deamonthread {

	public static void main(String[] args) {
		Mythread6 t=new Mythread6();
		t.setDaemon(true);
		t.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread");
			try{Thread.sleep(1000);}
			catch(InterruptedException ie) {ie.printStackTrace();}
			}
		}

	}


class Mythread6 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Daemon Thread");
			try{Thread.sleep(1000);}
			catch(InterruptedException ie) {ie.printStackTrace();}
			}
		}
	}
	
