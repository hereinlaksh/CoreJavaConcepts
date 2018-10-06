package Multithreading;

public class Synchronized {

	public static void main(String[] args) {
		new Mythred().start();
		new Mythred1().start();
		new Mythred2().start();

	}
	}
class A{
	synchronized static void msg(String str) {
		for(int i=0;i<2;i++)
		{
			System.out.println("Hi"+str);
			try{Thread.sleep(1000);}
			catch(InterruptedException ie) {ie.printStackTrace();}
			}
		}
	}

class Mythred extends Thread{
	public void run() {
		A.msg("lakshman");
	}
}
class Mythred1 extends Thread{
	public void run() {
		A.msg("vishnu");
	}
}
class Mythred2 extends Thread{
	public void run() {
		A.msg("viswa");
	}
}
