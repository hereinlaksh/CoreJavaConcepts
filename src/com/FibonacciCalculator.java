package com;

import java.util.Scanner;

public class FibonacciCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter number upto which Fibonacci series to print: ");

		  int number = new Scanner(System.in).nextInt();
		  System.out.println("Fibonacci series upto " + number +" numbers : ");

		  for(int i=1; i<=number; i++)
		  
		  { System.out.print(fibonacci2(i) +" "); 
		  }

		  

	}

	private static int fibonacci2(int number) {
		// TODO Auto-generated method stub
		
		if(number == 1 || number == 2)
		{
			return 1;
		}
		return fibonacci2(number-1) + (number -2);

	}

}


