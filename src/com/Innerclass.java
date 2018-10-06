package com;//Inner Class method used for one time purpose only

/*class Test2{
	void m1() {}
	void m2() {}
}
/*class Test1 extends Test2{
	void m1() {System.out.println("m1 method");}
	void m2() {System.out.println("m2 method");}
}

public class Innerclass {
	Test2 t=new Test2() {
		void m1() {System.out.println("m1 method");}
		void m2() {System.out.println("m2 method");}
		};
	
	public static void main(String[] args) {
		Innerclass tt=new Innerclass();
		tt.t.m1();
		tt.t.m2();
		
	}
	}

public class Innerclass{
	
	Thread t=new Thread() {
		public void run() {System.out.println("The running is implemented");}
		};
		public static void main(String[] args) {
			Innerclass tt=new Innerclass();
			tt.t.run();//semicolan is mantatory.
		}
}*/
interface It1{void m1();}
public class Innerclass{
	
	It1 t=new It1() {
		public void m1() {System.out.println("The running is implemented");}
		};
		public static void main(String[] args) {
			Innerclass tt=new Innerclass();
			tt.t.m1();
		}
}
